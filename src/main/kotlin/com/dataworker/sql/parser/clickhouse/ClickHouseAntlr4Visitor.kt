package com.dataworker.sql.parser.clickhouse

import com.dataworker.sql.parser.SQLParserException
import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.antlr4.clickhouse.ClickHouseParser
import com.dataworker.sql.parser.antlr4.clickhouse.ClickHouseParserBaseVisitor
import com.dataworker.sql.parser.model.*
import com.dataworker.sql.parser.util.StringUtil
import org.antlr.v4.runtime.tree.ParseTree
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/7/28 9:49 上午
 */
class ClickHouseAntlr4Visitor: ClickHouseParserBaseVisitor<StatementData>() {

    private var command: String? = null

    private var data: StatementData? = null

    private var currentOptType: StatementType = StatementType.UNKOWN

    private var selectQery: ClickHouseSelectQuery = ClickHouseSelectQuery()

    fun setCommand(command: String) {
        this.command = command
    }

    override fun visit(tree: ParseTree): StatementData? {
        super.visit(tree)

        if (data == null) {
            throw SQLParserException("不支持的SQL")
        }

        return data;
    }

    override fun visitCreateTableStmt(ctx: ClickHouseParser.CreateTableStmtContext): StatementData? {
        val schemaClause = ctx.tableSchemaClause()
        val subqueryClause = ctx.subqueryClause()

        if (schemaClause is ClickHouseParser.SchemaDescriptionClauseContext) {
            val (databaseName, tableName) = parseTableName(ctx.tableIdentifier())
            var engineClause = ctx.engineClause();
            val engineExpr = engineClause.engineExpr().identifierOrNull()
            var engine = engineExpr.identifier().text

            val cluster = null;
            val columnDeclarations = StringUtils.substring(command, schemaClause.start.startIndex,
                ctx.engineClause().start.startIndex)

            var orderExpr = if (engineClause?.orderByClause() != null && engineClause?.orderByClause().size > 0)
                engineClause?.orderByClause()?.get(0)?.orderExprList()?.text else null
            if (orderExpr == null) {
                throw SQLParserException("creat table 需要指定 order by 字段")
            }

            val partitionExpr = if (engineClause?.partitionByClause() != null && engineClause?.partitionByClause().size > 0)
                engineClause?.partitionByClause()?.get(0)?.columnExpr()?.text else null
            var primaryExpr = if (engineClause?.primaryKeyClause() != null && engineClause?.primaryKeyClause().size > 0)
                engineClause?.primaryKeyClause()?.get(0)?.columnExpr()?.text else null
            var settingsExpr = if (engineClause?.settingsClause() != null && engineClause?.settingsClause().size > 0)
                engineClause?.settingsClause()?.get(0)?.settingExprList()?.text else null

            var tableTtlExpr = if (engineClause?.ttlClause() != null && engineClause?.ttlClause().size > 0)
                engineClause?.ttlClause()?.get(0)?.text else null

            var comment = if (engineClause?.commentClause() != null && engineClause?.commentClause().size > 0)
                engineClause?.commentClause()?.get(0)?.STRING_LITERAL()?.text else null

            comment = if (comment != null) StringUtil.cleanQuote(comment) else null;

            val table = ClickHouseTable(databaseName, tableName, cluster, engine,
                columnDeclarations, orderExpr, primaryExpr, partitionExpr, tableTtlExpr, settingsExpr, comment)
            data = StatementData(StatementType.CREATE_TABLE, table)

            return super.visitCreateTableStmt(ctx)
        } else if (subqueryClause is ClickHouseParser.SubqueryClauseContext) {
            val (databaseName, tableName) = parseTableName(ctx.tableIdentifier())
            var engineClause = ctx.engineClause();
            val engineExpr = engineClause.engineExpr().identifierOrNull()
            var engine = engineExpr.identifier().text

            val cluster = null;
            var orderExpr = if (engineClause?.orderByClause() != null && engineClause?.orderByClause().size > 0)
                engineClause?.orderByClause()?.get(0)?.orderExprList()?.text else null

            val partitionExpr = if (engineClause?.partitionByClause() != null && engineClause?.partitionByClause().size > 0)
                engineClause?.partitionByClause()?.get(0)?.columnExpr()?.text else null
            var primaryExpr = if (engineClause?.primaryKeyClause() != null && engineClause?.primaryKeyClause().size > 0)
                engineClause?.primaryKeyClause()?.get(0)?.columnExpr()?.text else null
            var settingsExpr = if (engineClause?.settingsClause() != null && engineClause?.settingsClause().size > 0)
                engineClause?.settingsClause()?.get(0)?.settingExprList()?.text else null

            var tableTtlExpr = if (engineClause?.ttlClause() != null && engineClause?.ttlClause().size > 0)
                engineClause?.ttlClause()?.get(0)?.text else null

            var querySelect = StringUtils.substring(command, subqueryClause.selectUnionStmt().start.startIndex)
            val table = ClickHouseTableAsSelect(databaseName, tableName, cluster, engine,
                orderExpr, primaryExpr, partitionExpr, tableTtlExpr, settingsExpr, querySelect)
            data = StatementData(StatementType.CREATE_TABLE_AS_SELECT, table)

            currentOptType = StatementType.CREATE_TABLE_AS_SELECT
            return this.visitSelectUnionStmt(subqueryClause.selectUnionStmt())
        } else if (schemaClause is ClickHouseParser.SchemaAsTableClauseContext) {
            val (databaseName, tableName) = parseTableName(ctx.tableIdentifier())
            var engineClause = ctx.engineClause();
            val engineExpr = engineClause.engineExpr().identifierOrNull()
            var engine = engineExpr.identifier().text

            val cluster = null;
            var orderExpr = if (engineClause?.orderByClause() != null && engineClause?.orderByClause().size > 0)
                engineClause?.orderByClause()?.get(0)?.orderExprList()?.text else null

            val partitionExpr = if (engineClause?.partitionByClause() != null && engineClause?.partitionByClause().size > 0)
                engineClause?.partitionByClause()?.get(0)?.columnExpr()?.text else null
            var primaryExpr = if (engineClause?.primaryKeyClause() != null && engineClause?.primaryKeyClause().size > 0)
                engineClause?.primaryKeyClause()?.get(0)?.columnExpr()?.text else null
            var settingsExpr = if (engineClause?.settingsClause() != null && engineClause?.settingsClause().size > 0)
                engineClause?.settingsClause()?.get(0)?.settingExprList()?.text else null

            var tableTtlExpr = if (engineClause?.ttlClause() != null && engineClause?.ttlClause().size > 0)
                engineClause?.ttlClause()?.get(0)?.text else null

            val (srcDatabaseName, srcTableName) = parseTableName(schemaClause.tableIdentifier())
            val table = ClickHouseTableAsLike(databaseName, tableName, cluster, engine,
                orderExpr, primaryExpr, partitionExpr, tableTtlExpr, settingsExpr, srcDatabaseName, srcTableName)
            data = StatementData(StatementType.CREATE_TABLE_AS_LIKE, table)

            super.visitCreateTableStmt(ctx)

            return data;
        }

        return null
    }

    override fun visitCreateMaterializedViewStmt(ctx: ClickHouseParser.CreateMaterializedViewStmtContext): StatementData? {
        val schemaClause = ctx.tableSchemaClause()
        val subqueryClause = ctx.subqueryClause()

        if (schemaClause is ClickHouseParser.SchemaDescriptionClauseContext) {
            val (databaseName, tableName) = parseTableName(ctx.tableIdentifier())
            var engineClause = ctx.engineClause();
            val engineExpr = engineClause.engineExpr().identifierOrNull()
            var engine = engineExpr.identifier().text

            val cluster = null;
            val columnDeclarations = StringUtils.substring(command, schemaClause.start.startIndex,
                ctx.engineClause().start.startIndex)

            var orderExpr = if (engineClause?.orderByClause() != null && engineClause?.orderByClause().size > 0)
                engineClause?.orderByClause()?.get(0)?.orderExprList()?.text else null
            if (orderExpr == null) {
                throw SQLParserException("creat table 需要指定 order by 字段")
            }

            val partitionExpr = if (engineClause?.partitionByClause() != null && engineClause?.partitionByClause().size > 0)
                engineClause?.partitionByClause()?.get(0)?.columnExpr()?.text else null
            var primaryExpr = if (engineClause?.primaryKeyClause() != null && engineClause?.primaryKeyClause().size > 0)
                engineClause?.primaryKeyClause()?.get(0)?.columnExpr()?.text else null
            var settingsExpr = if (engineClause?.settingsClause() != null && engineClause?.settingsClause().size > 0)
                engineClause?.settingsClause()?.get(0)?.settingExprList()?.text else null

            var tableTtlExpr = if (engineClause?.ttlClause() != null && engineClause?.ttlClause().size > 0)
                engineClause?.ttlClause()?.get(0)?.text else null

            var comment = if (engineClause?.commentClause() != null && engineClause?.commentClause().size > 0)
                engineClause?.commentClause()?.get(0)?.STRING_LITERAL()?.text else null

            comment = if (comment != null) StringUtil.cleanQuote(comment) else null;
            var populate = if (ctx.POPULATE() != null) true else false;
            var querySelect = StringUtils.substring(command, subqueryClause.selectUnionStmt().start.startIndex)

            val table = ClickHouseMaterializedView(databaseName, tableName, cluster, engine,
                columnDeclarations, orderExpr, primaryExpr, partitionExpr, tableTtlExpr, settingsExpr, comment,
                populate, querySelect)
            data = StatementData(StatementType.CREATE_MATERIALIZED_VIEW, table)
        }

        currentOptType = StatementType.CREATE_MATERIALIZED_VIEW
        return this.visitSelectUnionStmt(subqueryClause.selectUnionStmt())
    }

    override fun visitSelectUnionStmt(ctx: ClickHouseParser.SelectUnionStmtContext): StatementData? {
        if (StatementType.UNKOWN == currentOptType) {
            currentOptType = StatementType.SELECT
            data = StatementData(currentOptType, selectQery)
        }
        super.visitSelectUnionStmt(ctx)
        return data
    }

    override fun visitAlterTableStmt(ctx: ClickHouseParser.AlterTableStmtContext): StatementData? {
        val (databaseName, tableName) = parseTableName(ctx.tableIdentifier())
        var action = ctx.alterTableClause().get(0).javaClass.simpleName;
        action = StringUtils.substringBefore(action, "Context");
        val tableSource = ClickHouseAlterTableStmt(databaseName, tableName, action)

        data = StatementData(StatementType.ALTER_TABLE, tableSource)
        return data
    }

    override fun visitDropTableStmt(ctx: ClickHouseParser.DropTableStmtContext): StatementData? {
        val (databaseName, tableName) = parseTableName(ctx.tableIdentifier())
        val tableSource = TableSource(databaseName, tableName)
        data = StatementData(StatementType.DROP_TABLE, tableSource)
        return null
    }

    override fun visitShowCreateTableStmt(ctx: ClickHouseParser.ShowCreateTableStmtContext): StatementData? {
        val (databaseName, tableName) = parseTableName(ctx.tableIdentifier())
        val tableSource = TableSource(databaseName, tableName)
        data = StatementData(StatementType.SHOW_CREATE_TABLE, tableSource)
        return null
    }

    override fun visitOptimizeStmt(ctx: ClickHouseParser.OptimizeStmtContext): StatementData? {
        val (databaseName, tableName) = parseTableName(ctx.tableIdentifier())
        val tableSource = TableSource(databaseName, tableName)
        data = StatementData(StatementType.OPTIMIZE, tableSource)
        return null
    }

    override fun visitInsertStmt(ctx: ClickHouseParser.InsertStmtContext): StatementData? {
        val (databaseName, tableName) = parseTableName(ctx.tableIdentifier())
        val tableSource = ClickHouseInsertStmt(databaseName, tableName)

        val dataClause = ctx.dataClause()
        if (dataClause is ClickHouseParser.DataClauseValuesContext) {
            data = StatementData(StatementType.INSERT_VALUES, tableSource)
        } else if (dataClause is ClickHouseParser.DataClauseSelectContext) {
            data = StatementData(StatementType.INSERT_SELECT, tableSource)

            currentOptType = StatementType.INSERT_SELECT
            return this.visitSelectUnionStmt(dataClause.selectUnionStmt())
        }
        return null;
    }

    override fun visitTableIdentifier(ctx: ClickHouseParser.TableIdentifierContext): StatementData? {
        val (databaseName, tableName) = parseTableName(ctx)
        val tableSource = TableSource(databaseName, tableName)
        if (StatementType.CREATE_TABLE_AS_SELECT == currentOptType) {
            (data?.statement as ClickHouseTableAsSelect).inputTables?.add(tableSource)
        } else if (StatementType.CREATE_MATERIALIZED_VIEW == currentOptType) {
            (data?.statement as ClickHouseMaterializedView).inputTables?.add(tableSource)
        } else if (StatementType.INSERT_SELECT == currentOptType) {
            (data?.statement as ClickHouseInsertStmt).inputTables?.add(tableSource)
        } else if (StatementType.SELECT == currentOptType) {
            selectQery.tables.add(tableSource)
        }
        return null
    }

    fun parseTableName(ctx: ClickHouseParser.TableIdentifierContext): Pair<String?, String> {
        if (ctx.databaseIdentifier()!= null) {
            return Pair(ctx.databaseIdentifier().text, ctx.identifier().text)
        } else {
            return Pair(null, ctx.identifier().text)
        }
    }
}

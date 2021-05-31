// Generated from com/dataworker/sql/parser/antlr4/clickhouse/ClickHouseParser.g4 by ANTLR 4.8
package com.dataworker.sql.parser.antlr4.clickhouse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClickHouseParser}.
 */
public interface ClickHouseParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#queryStmt}.
	 * @param ctx the parse tree
	 */
	void enterQueryStmt(ClickHouseParser.QueryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#queryStmt}.
	 * @param ctx the parse tree
	 */
	void exitQueryStmt(ClickHouseParser.QueryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ClickHouseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ClickHouseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableStmt}
	 * labeled alternative in {@link ClickHouseParser#alterStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableStmt(ClickHouseParser.AlterTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableStmt}
	 * labeled alternative in {@link ClickHouseParser#alterStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableStmt(ClickHouseParser.AlterTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseAddColumn}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseAddColumn(ClickHouseParser.AlterTableClauseAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseAddColumn}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseAddColumn(ClickHouseParser.AlterTableClauseAddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseAddIndex}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseAddIndex(ClickHouseParser.AlterTableClauseAddIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseAddIndex}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseAddIndex(ClickHouseParser.AlterTableClauseAddIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseAttach}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseAttach(ClickHouseParser.AlterTableClauseAttachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseAttach}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseAttach(ClickHouseParser.AlterTableClauseAttachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseClear}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseClear(ClickHouseParser.AlterTableClauseClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseClear}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseClear(ClickHouseParser.AlterTableClauseClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseComment}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseComment(ClickHouseParser.AlterTableClauseCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseComment}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseComment(ClickHouseParser.AlterTableClauseCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDelete}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDelete(ClickHouseParser.AlterTableClauseDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDelete}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDelete(ClickHouseParser.AlterTableClauseDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDetach}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDetach(ClickHouseParser.AlterTableClauseDetachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDetach}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDetach(ClickHouseParser.AlterTableClauseDetachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDropColumn}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDropColumn(ClickHouseParser.AlterTableClauseDropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDropColumn}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDropColumn(ClickHouseParser.AlterTableClauseDropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDropIndex}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDropIndex(ClickHouseParser.AlterTableClauseDropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDropIndex}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDropIndex(ClickHouseParser.AlterTableClauseDropIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseDropPartition}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseDropPartition(ClickHouseParser.AlterTableClauseDropPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseDropPartition}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseDropPartition(ClickHouseParser.AlterTableClauseDropPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseFreezePartition}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseFreezePartition(ClickHouseParser.AlterTableClauseFreezePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseFreezePartition}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseFreezePartition(ClickHouseParser.AlterTableClauseFreezePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyCodec}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyCodec(ClickHouseParser.AlterTableClauseModifyCodecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyCodec}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyCodec(ClickHouseParser.AlterTableClauseModifyCodecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyComment}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyComment(ClickHouseParser.AlterTableClauseModifyCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyComment}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyComment(ClickHouseParser.AlterTableClauseModifyCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyRemove}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyRemove(ClickHouseParser.AlterTableClauseModifyRemoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyRemove}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyRemove(ClickHouseParser.AlterTableClauseModifyRemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModify}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModify(ClickHouseParser.AlterTableClauseModifyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModify}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModify(ClickHouseParser.AlterTableClauseModifyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyOrderBy}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyOrderBy(ClickHouseParser.AlterTableClauseModifyOrderByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyOrderBy}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyOrderBy(ClickHouseParser.AlterTableClauseModifyOrderByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseModifyTTL}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseModifyTTL(ClickHouseParser.AlterTableClauseModifyTTLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseModifyTTL}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseModifyTTL(ClickHouseParser.AlterTableClauseModifyTTLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseMovePartition}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseMovePartition(ClickHouseParser.AlterTableClauseMovePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseMovePartition}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseMovePartition(ClickHouseParser.AlterTableClauseMovePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseRemoveTTL}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseRemoveTTL(ClickHouseParser.AlterTableClauseRemoveTTLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseRemoveTTL}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseRemoveTTL(ClickHouseParser.AlterTableClauseRemoveTTLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseRename}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseRename(ClickHouseParser.AlterTableClauseRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseRename}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseRename(ClickHouseParser.AlterTableClauseRenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseReplace}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseReplace(ClickHouseParser.AlterTableClauseReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseReplace}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseReplace(ClickHouseParser.AlterTableClauseReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableClauseUpdate}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableClauseUpdate(ClickHouseParser.AlterTableClauseUpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableClauseUpdate}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableClauseUpdate(ClickHouseParser.AlterTableClauseUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#assignmentExprList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExprList(ClickHouseParser.AssignmentExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#assignmentExprList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExprList(ClickHouseParser.AssignmentExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(ClickHouseParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(ClickHouseParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableColumnPropertyType}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnPropertyType(ClickHouseParser.TableColumnPropertyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableColumnPropertyType}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnPropertyType(ClickHouseParser.TableColumnPropertyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(ClickHouseParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(ClickHouseParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttachDictionaryStmt}
	 * labeled alternative in {@link ClickHouseParser#attachStmt}.
	 * @param ctx the parse tree
	 */
	void enterAttachDictionaryStmt(ClickHouseParser.AttachDictionaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttachDictionaryStmt}
	 * labeled alternative in {@link ClickHouseParser#attachStmt}.
	 * @param ctx the parse tree
	 */
	void exitAttachDictionaryStmt(ClickHouseParser.AttachDictionaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#checkStmt}.
	 * @param ctx the parse tree
	 */
	void enterCheckStmt(ClickHouseParser.CheckStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#checkStmt}.
	 * @param ctx the parse tree
	 */
	void exitCheckStmt(ClickHouseParser.CheckStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseStmt(ClickHouseParser.CreateDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseStmt(ClickHouseParser.CreateDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateDictionaryStmt(ClickHouseParser.CreateDictionaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateDictionaryStmt(ClickHouseParser.CreateDictionaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateLiveViewStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateLiveViewStmt(ClickHouseParser.CreateLiveViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateLiveViewStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateLiveViewStmt(ClickHouseParser.CreateLiveViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateMaterializedViewStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateMaterializedViewStmt(ClickHouseParser.CreateMaterializedViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateMaterializedViewStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateMaterializedViewStmt(ClickHouseParser.CreateMaterializedViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateTableStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStmt(ClickHouseParser.CreateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateTableStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStmt(ClickHouseParser.CreateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateViewStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateViewStmt(ClickHouseParser.CreateViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateViewStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateViewStmt(ClickHouseParser.CreateViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#dictionarySchemaClause}.
	 * @param ctx the parse tree
	 */
	void enterDictionarySchemaClause(ClickHouseParser.DictionarySchemaClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#dictionarySchemaClause}.
	 * @param ctx the parse tree
	 */
	void exitDictionarySchemaClause(ClickHouseParser.DictionarySchemaClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#dictionaryAttrDfnt}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryAttrDfnt(ClickHouseParser.DictionaryAttrDfntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#dictionaryAttrDfnt}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryAttrDfnt(ClickHouseParser.DictionaryAttrDfntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#dictionaryEngineClause}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryEngineClause(ClickHouseParser.DictionaryEngineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#dictionaryEngineClause}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryEngineClause(ClickHouseParser.DictionaryEngineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#dictionaryPrimaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryPrimaryKeyClause(ClickHouseParser.DictionaryPrimaryKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#dictionaryPrimaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryPrimaryKeyClause(ClickHouseParser.DictionaryPrimaryKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#dictionaryArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryArgExpr(ClickHouseParser.DictionaryArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#dictionaryArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryArgExpr(ClickHouseParser.DictionaryArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#sourceClause}.
	 * @param ctx the parse tree
	 */
	void enterSourceClause(ClickHouseParser.SourceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#sourceClause}.
	 * @param ctx the parse tree
	 */
	void exitSourceClause(ClickHouseParser.SourceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#lifetimeClause}.
	 * @param ctx the parse tree
	 */
	void enterLifetimeClause(ClickHouseParser.LifetimeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#lifetimeClause}.
	 * @param ctx the parse tree
	 */
	void exitLifetimeClause(ClickHouseParser.LifetimeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#layoutClause}.
	 * @param ctx the parse tree
	 */
	void enterLayoutClause(ClickHouseParser.LayoutClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#layoutClause}.
	 * @param ctx the parse tree
	 */
	void exitLayoutClause(ClickHouseParser.LayoutClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(ClickHouseParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(ClickHouseParser.RangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#dictionarySettingsClause}.
	 * @param ctx the parse tree
	 */
	void enterDictionarySettingsClause(ClickHouseParser.DictionarySettingsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#dictionarySettingsClause}.
	 * @param ctx the parse tree
	 */
	void exitDictionarySettingsClause(ClickHouseParser.DictionarySettingsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#clusterClause}.
	 * @param ctx the parse tree
	 */
	void enterClusterClause(ClickHouseParser.ClusterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#clusterClause}.
	 * @param ctx the parse tree
	 */
	void exitClusterClause(ClickHouseParser.ClusterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#uuidClause}.
	 * @param ctx the parse tree
	 */
	void enterUuidClause(ClickHouseParser.UuidClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#uuidClause}.
	 * @param ctx the parse tree
	 */
	void exitUuidClause(ClickHouseParser.UuidClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#destinationClause}.
	 * @param ctx the parse tree
	 */
	void enterDestinationClause(ClickHouseParser.DestinationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#destinationClause}.
	 * @param ctx the parse tree
	 */
	void exitDestinationClause(ClickHouseParser.DestinationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#subqueryClause}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryClause(ClickHouseParser.SubqueryClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#subqueryClause}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryClause(ClickHouseParser.SubqueryClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaDescriptionClause}
	 * labeled alternative in {@link ClickHouseParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDescriptionClause(ClickHouseParser.SchemaDescriptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaDescriptionClause}
	 * labeled alternative in {@link ClickHouseParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDescriptionClause(ClickHouseParser.SchemaDescriptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaAsTableClause}
	 * labeled alternative in {@link ClickHouseParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAsTableClause(ClickHouseParser.SchemaAsTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaAsTableClause}
	 * labeled alternative in {@link ClickHouseParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAsTableClause(ClickHouseParser.SchemaAsTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaAsFunctionClause}
	 * labeled alternative in {@link ClickHouseParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAsFunctionClause(ClickHouseParser.SchemaAsFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaAsFunctionClause}
	 * labeled alternative in {@link ClickHouseParser#tableSchemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAsFunctionClause(ClickHouseParser.SchemaAsFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#engineClause}.
	 * @param ctx the parse tree
	 */
	void enterEngineClause(ClickHouseParser.EngineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#engineClause}.
	 * @param ctx the parse tree
	 */
	void exitEngineClause(ClickHouseParser.EngineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByClause(ClickHouseParser.PartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByClause(ClickHouseParser.PartitionByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#primaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyClause(ClickHouseParser.PrimaryKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#primaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyClause(ClickHouseParser.PrimaryKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#sampleByClause}.
	 * @param ctx the parse tree
	 */
	void enterSampleByClause(ClickHouseParser.SampleByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#sampleByClause}.
	 * @param ctx the parse tree
	 */
	void exitSampleByClause(ClickHouseParser.SampleByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#ttlClause}.
	 * @param ctx the parse tree
	 */
	void enterTtlClause(ClickHouseParser.TtlClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#ttlClause}.
	 * @param ctx the parse tree
	 */
	void exitTtlClause(ClickHouseParser.TtlClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#engineExpr}.
	 * @param ctx the parse tree
	 */
	void enterEngineExpr(ClickHouseParser.EngineExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#engineExpr}.
	 * @param ctx the parse tree
	 */
	void exitEngineExpr(ClickHouseParser.EngineExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableElementExprColumn}
	 * labeled alternative in {@link ClickHouseParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableElementExprColumn(ClickHouseParser.TableElementExprColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableElementExprColumn}
	 * labeled alternative in {@link ClickHouseParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableElementExprColumn(ClickHouseParser.TableElementExprColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableElementExprConstraint}
	 * labeled alternative in {@link ClickHouseParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableElementExprConstraint(ClickHouseParser.TableElementExprConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableElementExprConstraint}
	 * labeled alternative in {@link ClickHouseParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableElementExprConstraint(ClickHouseParser.TableElementExprConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableElementExprIndex}
	 * labeled alternative in {@link ClickHouseParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableElementExprIndex(ClickHouseParser.TableElementExprIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableElementExprIndex}
	 * labeled alternative in {@link ClickHouseParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableElementExprIndex(ClickHouseParser.TableElementExprIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableColumnDfnt}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnDfnt(ClickHouseParser.TableColumnDfntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableColumnDfnt}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnDfnt(ClickHouseParser.TableColumnDfntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableColumnPropertyExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnPropertyExpr(ClickHouseParser.TableColumnPropertyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableColumnPropertyExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnPropertyExpr(ClickHouseParser.TableColumnPropertyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableIndexDfnt}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexDfnt(ClickHouseParser.TableIndexDfntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableIndexDfnt}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexDfnt(ClickHouseParser.TableIndexDfntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#codecExpr}.
	 * @param ctx the parse tree
	 */
	void enterCodecExpr(ClickHouseParser.CodecExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#codecExpr}.
	 * @param ctx the parse tree
	 */
	void exitCodecExpr(ClickHouseParser.CodecExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#codecArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterCodecArgExpr(ClickHouseParser.CodecArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#codecArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitCodecArgExpr(ClickHouseParser.CodecArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#ttlExpr}.
	 * @param ctx the parse tree
	 */
	void enterTtlExpr(ClickHouseParser.TtlExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#ttlExpr}.
	 * @param ctx the parse tree
	 */
	void exitTtlExpr(ClickHouseParser.TtlExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#describeStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStmt(ClickHouseParser.DescribeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#describeStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStmt(ClickHouseParser.DescribeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DropDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabaseStmt(ClickHouseParser.DropDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DropDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabaseStmt(ClickHouseParser.DropDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DropTableStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropTableStmt(ClickHouseParser.DropTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DropTableStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropTableStmt(ClickHouseParser.DropTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#existsStmt}.
	 * @param ctx the parse tree
	 */
	void enterExistsDatabaseStmt(ClickHouseParser.ExistsDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#existsStmt}.
	 * @param ctx the parse tree
	 */
	void exitExistsDatabaseStmt(ClickHouseParser.ExistsDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsTableStmt}
	 * labeled alternative in {@link ClickHouseParser#existsStmt}.
	 * @param ctx the parse tree
	 */
	void enterExistsTableStmt(ClickHouseParser.ExistsTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsTableStmt}
	 * labeled alternative in {@link ClickHouseParser#existsStmt}.
	 * @param ctx the parse tree
	 */
	void exitExistsTableStmt(ClickHouseParser.ExistsTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainStmt(ClickHouseParser.ExplainStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainStmt(ClickHouseParser.ExplainStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(ClickHouseParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(ClickHouseParser.InsertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnsClause}.
	 * @param ctx the parse tree
	 */
	void enterColumnsClause(ClickHouseParser.ColumnsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnsClause}.
	 * @param ctx the parse tree
	 */
	void exitColumnsClause(ClickHouseParser.ColumnsClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataClauseFormat}
	 * labeled alternative in {@link ClickHouseParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void enterDataClauseFormat(ClickHouseParser.DataClauseFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataClauseFormat}
	 * labeled alternative in {@link ClickHouseParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void exitDataClauseFormat(ClickHouseParser.DataClauseFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataClauseValues}
	 * labeled alternative in {@link ClickHouseParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void enterDataClauseValues(ClickHouseParser.DataClauseValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataClauseValues}
	 * labeled alternative in {@link ClickHouseParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void exitDataClauseValues(ClickHouseParser.DataClauseValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataClauseSelect}
	 * labeled alternative in {@link ClickHouseParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void enterDataClauseSelect(ClickHouseParser.DataClauseSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataClauseSelect}
	 * labeled alternative in {@link ClickHouseParser#dataClause}.
	 * @param ctx the parse tree
	 */
	void exitDataClauseSelect(ClickHouseParser.DataClauseSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KillMutationStmt}
	 * labeled alternative in {@link ClickHouseParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void enterKillMutationStmt(ClickHouseParser.KillMutationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KillMutationStmt}
	 * labeled alternative in {@link ClickHouseParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void exitKillMutationStmt(ClickHouseParser.KillMutationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#optimizeStmt}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeStmt(ClickHouseParser.OptimizeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#optimizeStmt}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeStmt(ClickHouseParser.OptimizeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#renameStmt}.
	 * @param ctx the parse tree
	 */
	void enterRenameStmt(ClickHouseParser.RenameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#renameStmt}.
	 * @param ctx the parse tree
	 */
	void exitRenameStmt(ClickHouseParser.RenameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#selectUnionStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectUnionStmt(ClickHouseParser.SelectUnionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#selectUnionStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectUnionStmt(ClickHouseParser.SelectUnionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#selectStmtWithParens}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmtWithParens(ClickHouseParser.SelectStmtWithParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#selectStmtWithParens}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmtWithParens(ClickHouseParser.SelectStmtWithParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(ClickHouseParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(ClickHouseParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(ClickHouseParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(ClickHouseParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#topClause}.
	 * @param ctx the parse tree
	 */
	void enterTopClause(ClickHouseParser.TopClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#topClause}.
	 * @param ctx the parse tree
	 */
	void exitTopClause(ClickHouseParser.TopClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(ClickHouseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(ClickHouseParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#arrayJoinClause}.
	 * @param ctx the parse tree
	 */
	void enterArrayJoinClause(ClickHouseParser.ArrayJoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#arrayJoinClause}.
	 * @param ctx the parse tree
	 */
	void exitArrayJoinClause(ClickHouseParser.ArrayJoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#prewhereClause}.
	 * @param ctx the parse tree
	 */
	void enterPrewhereClause(ClickHouseParser.PrewhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#prewhereClause}.
	 * @param ctx the parse tree
	 */
	void exitPrewhereClause(ClickHouseParser.PrewhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ClickHouseParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ClickHouseParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(ClickHouseParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(ClickHouseParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(ClickHouseParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(ClickHouseParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(ClickHouseParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(ClickHouseParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#limitByClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitByClause(ClickHouseParser.LimitByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#limitByClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitByClause(ClickHouseParser.LimitByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(ClickHouseParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(ClickHouseParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#settingsClause}.
	 * @param ctx the parse tree
	 */
	void enterSettingsClause(ClickHouseParser.SettingsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#settingsClause}.
	 * @param ctx the parse tree
	 */
	void exitSettingsClause(ClickHouseParser.SettingsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#commentClause}.
	 * @param ctx the parse tree
	 */
	void enterCommentClause(ClickHouseParser.CommentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#commentClause}.
	 * @param ctx the parse tree
	 */
	void exitCommentClause(ClickHouseParser.CommentClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprOp(ClickHouseParser.JoinExprOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprOp(ClickHouseParser.JoinExprOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprTable}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprTable(ClickHouseParser.JoinExprTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprTable}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprTable(ClickHouseParser.JoinExprTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprParens}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprParens(ClickHouseParser.JoinExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprParens}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprParens(ClickHouseParser.JoinExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprCrossOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprCrossOp(ClickHouseParser.JoinExprCrossOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprCrossOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprCrossOp(ClickHouseParser.JoinExprCrossOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinOpInner}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpInner(ClickHouseParser.JoinOpInnerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinOpInner}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpInner(ClickHouseParser.JoinOpInnerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinOpLeftRight}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpLeftRight(ClickHouseParser.JoinOpLeftRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinOpLeftRight}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpLeftRight(ClickHouseParser.JoinOpLeftRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinOpFull}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpFull(ClickHouseParser.JoinOpFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinOpFull}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpFull(ClickHouseParser.JoinOpFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#joinOpCross}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpCross(ClickHouseParser.JoinOpCrossContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#joinOpCross}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpCross(ClickHouseParser.JoinOpCrossContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#joinConstraintClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinConstraintClause(ClickHouseParser.JoinConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#joinConstraintClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinConstraintClause(ClickHouseParser.JoinConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#sampleClause}.
	 * @param ctx the parse tree
	 */
	void enterSampleClause(ClickHouseParser.SampleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#sampleClause}.
	 * @param ctx the parse tree
	 */
	void exitSampleClause(ClickHouseParser.SampleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#limitExpr}.
	 * @param ctx the parse tree
	 */
	void enterLimitExpr(ClickHouseParser.LimitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#limitExpr}.
	 * @param ctx the parse tree
	 */
	void exitLimitExpr(ClickHouseParser.LimitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#orderExprList}.
	 * @param ctx the parse tree
	 */
	void enterOrderExprList(ClickHouseParser.OrderExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#orderExprList}.
	 * @param ctx the parse tree
	 */
	void exitOrderExprList(ClickHouseParser.OrderExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrderExpr(ClickHouseParser.OrderExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrderExpr(ClickHouseParser.OrderExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#ratioExpr}.
	 * @param ctx the parse tree
	 */
	void enterRatioExpr(ClickHouseParser.RatioExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#ratioExpr}.
	 * @param ctx the parse tree
	 */
	void exitRatioExpr(ClickHouseParser.RatioExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#settingExprList}.
	 * @param ctx the parse tree
	 */
	void enterSettingExprList(ClickHouseParser.SettingExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#settingExprList}.
	 * @param ctx the parse tree
	 */
	void exitSettingExprList(ClickHouseParser.SettingExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#settingExpr}.
	 * @param ctx the parse tree
	 */
	void enterSettingExpr(ClickHouseParser.SettingExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#settingExpr}.
	 * @param ctx the parse tree
	 */
	void exitSettingExpr(ClickHouseParser.SettingExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(ClickHouseParser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(ClickHouseParser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDatabaseStmt(ClickHouseParser.ShowCreateDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDatabaseStmt(ClickHouseParser.ShowCreateDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDictionaryStmt(ClickHouseParser.ShowCreateDictionaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateDictionaryStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDictionaryStmt(ClickHouseParser.ShowCreateDictionaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTableStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTableStmt(ClickHouseParser.ShowCreateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTableStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTableStmt(ClickHouseParser.ShowCreateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabasesStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabasesStmt(ClickHouseParser.ShowDatabasesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabasesStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabasesStmt(ClickHouseParser.ShowDatabasesStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDictionariesStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowDictionariesStmt(ClickHouseParser.ShowDictionariesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDictionariesStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowDictionariesStmt(ClickHouseParser.ShowDictionariesStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTablesStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowTablesStmt(ClickHouseParser.ShowTablesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTablesStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowTablesStmt(ClickHouseParser.ShowTablesStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#systemStmt}.
	 * @param ctx the parse tree
	 */
	void enterSystemStmt(ClickHouseParser.SystemStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#systemStmt}.
	 * @param ctx the parse tree
	 */
	void exitSystemStmt(ClickHouseParser.SystemStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncateStmt(ClickHouseParser.TruncateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncateStmt(ClickHouseParser.TruncateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void enterUseStmt(ClickHouseParser.UseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void exitUseStmt(ClickHouseParser.UseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#watchStmt}.
	 * @param ctx the parse tree
	 */
	void enterWatchStmt(ClickHouseParser.WatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#watchStmt}.
	 * @param ctx the parse tree
	 */
	void exitWatchStmt(ClickHouseParser.WatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprSimple}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprSimple(ClickHouseParser.ColumnTypeExprSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprSimple}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprSimple(ClickHouseParser.ColumnTypeExprSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprNested}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprNested(ClickHouseParser.ColumnTypeExprNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprNested}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprNested(ClickHouseParser.ColumnTypeExprNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprEnum}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprEnum(ClickHouseParser.ColumnTypeExprEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprEnum}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprEnum(ClickHouseParser.ColumnTypeExprEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprComplex}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprComplex(ClickHouseParser.ColumnTypeExprComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprComplex}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprComplex(ClickHouseParser.ColumnTypeExprComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprParam}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprParam(ClickHouseParser.ColumnTypeExprParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprParam}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprParam(ClickHouseParser.ColumnTypeExprParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnExprList}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprList(ClickHouseParser.ColumnExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnExprList}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprList(ClickHouseParser.ColumnExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnsExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnsExprAsterisk(ClickHouseParser.ColumnsExprAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnsExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnsExprAsterisk(ClickHouseParser.ColumnsExprAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnsExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnsExprSubquery(ClickHouseParser.ColumnsExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnsExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnsExprSubquery(ClickHouseParser.ColumnsExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnsExprColumn}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnsExprColumn(ClickHouseParser.ColumnsExprColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnsExprColumn}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnsExprColumn(ClickHouseParser.ColumnsExprColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTernaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTernaryOp(ClickHouseParser.ColumnExprTernaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTernaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTernaryOp(ClickHouseParser.ColumnExprTernaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprAlias}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprAlias(ClickHouseParser.ColumnExprAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprAlias}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprAlias(ClickHouseParser.ColumnExprAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprExtract}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprExtract(ClickHouseParser.ColumnExprExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprExtract}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprExtract(ClickHouseParser.ColumnExprExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprNegate}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprNegate(ClickHouseParser.ColumnExprNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprNegate}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprNegate(ClickHouseParser.ColumnExprNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprSubquery(ClickHouseParser.ColumnExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprSubquery(ClickHouseParser.ColumnExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprLiteral(ClickHouseParser.ColumnExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprLiteral(ClickHouseParser.ColumnExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprArray}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprArray(ClickHouseParser.ColumnExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprArray}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprArray(ClickHouseParser.ColumnExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprSubstring}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprSubstring(ClickHouseParser.ColumnExprSubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprSubstring}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprSubstring(ClickHouseParser.ColumnExprSubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprCast}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprCast(ClickHouseParser.ColumnExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprCast}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprCast(ClickHouseParser.ColumnExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprOr}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprOr(ClickHouseParser.ColumnExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprOr}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprOr(ClickHouseParser.ColumnExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprPrecedence1}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprPrecedence1(ClickHouseParser.ColumnExprPrecedence1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprPrecedence1}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprPrecedence1(ClickHouseParser.ColumnExprPrecedence1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprPrecedence2}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprPrecedence2(ClickHouseParser.ColumnExprPrecedence2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprPrecedence2}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprPrecedence2(ClickHouseParser.ColumnExprPrecedence2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprPrecedence3}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprPrecedence3(ClickHouseParser.ColumnExprPrecedence3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprPrecedence3}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprPrecedence3(ClickHouseParser.ColumnExprPrecedence3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprInterval}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprInterval(ClickHouseParser.ColumnExprIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprInterval}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprInterval(ClickHouseParser.ColumnExprIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprIsNull(ClickHouseParser.ColumnExprIsNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprIsNull(ClickHouseParser.ColumnExprIsNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTrim}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTrim(ClickHouseParser.ColumnExprTrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTrim}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTrim(ClickHouseParser.ColumnExprTrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTuple}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTuple(ClickHouseParser.ColumnExprTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTuple}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTuple(ClickHouseParser.ColumnExprTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprArrayAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprArrayAccess(ClickHouseParser.ColumnExprArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprArrayAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprArrayAccess(ClickHouseParser.ColumnExprArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprBetween}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprBetween(ClickHouseParser.ColumnExprBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprBetween}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprBetween(ClickHouseParser.ColumnExprBetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprParens}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprParens(ClickHouseParser.ColumnExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprParens}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprParens(ClickHouseParser.ColumnExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTimestamp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTimestamp(ClickHouseParser.ColumnExprTimestampContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTimestamp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTimestamp(ClickHouseParser.ColumnExprTimestampContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprAnd}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprAnd(ClickHouseParser.ColumnExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprAnd}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprAnd(ClickHouseParser.ColumnExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTupleAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTupleAccess(ClickHouseParser.ColumnExprTupleAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTupleAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTupleAccess(ClickHouseParser.ColumnExprTupleAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprCase}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprCase(ClickHouseParser.ColumnExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprCase}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprCase(ClickHouseParser.ColumnExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprDate}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprDate(ClickHouseParser.ColumnExprDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprDate}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprDate(ClickHouseParser.ColumnExprDateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprNot}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprNot(ClickHouseParser.ColumnExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprNot}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprNot(ClickHouseParser.ColumnExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprIdentifier(ClickHouseParser.ColumnExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprIdentifier(ClickHouseParser.ColumnExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprFunction}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprFunction(ClickHouseParser.ColumnExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprFunction}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprFunction(ClickHouseParser.ColumnExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprAsterisk(ClickHouseParser.ColumnExprAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprAsterisk(ClickHouseParser.ColumnExprAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnArgList}.
	 * @param ctx the parse tree
	 */
	void enterColumnArgList(ClickHouseParser.ColumnArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnArgList}.
	 * @param ctx the parse tree
	 */
	void exitColumnArgList(ClickHouseParser.ColumnArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnArgExpr(ClickHouseParser.ColumnArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnArgExpr(ClickHouseParser.ColumnArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnLambdaExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnLambdaExpr(ClickHouseParser.ColumnLambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnLambdaExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnLambdaExpr(ClickHouseParser.ColumnLambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterColumnIdentifier(ClickHouseParser.ColumnIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitColumnIdentifier(ClickHouseParser.ColumnIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#nestedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedIdentifier(ClickHouseParser.NestedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#nestedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedIdentifier(ClickHouseParser.NestedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprIdentifier(ClickHouseParser.TableExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprIdentifier(ClickHouseParser.TableExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprSubquery(ClickHouseParser.TableExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprSubquery(ClickHouseParser.TableExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprAlias}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprAlias(ClickHouseParser.TableExprAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprAlias}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprAlias(ClickHouseParser.TableExprAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprFunction}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprFunction(ClickHouseParser.TableExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprFunction}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprFunction(ClickHouseParser.TableExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableFunctionExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableFunctionExpr(ClickHouseParser.TableFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableFunctionExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableFunctionExpr(ClickHouseParser.TableFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(ClickHouseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(ClickHouseParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableArgList}.
	 * @param ctx the parse tree
	 */
	void enterTableArgList(ClickHouseParser.TableArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableArgList}.
	 * @param ctx the parse tree
	 */
	void exitTableArgList(ClickHouseParser.TableArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableArgExpr(ClickHouseParser.TableArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableArgExpr(ClickHouseParser.TableArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#databaseIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseIdentifier(ClickHouseParser.DatabaseIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#databaseIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseIdentifier(ClickHouseParser.DatabaseIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#floatingLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingLiteral(ClickHouseParser.FloatingLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#floatingLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingLiteral(ClickHouseParser.FloatingLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(ClickHouseParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(ClickHouseParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ClickHouseParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ClickHouseParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(ClickHouseParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(ClickHouseParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ClickHouseParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ClickHouseParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#keywordForAlias}.
	 * @param ctx the parse tree
	 */
	void enterKeywordForAlias(ClickHouseParser.KeywordForAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#keywordForAlias}.
	 * @param ctx the parse tree
	 */
	void exitKeywordForAlias(ClickHouseParser.KeywordForAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(ClickHouseParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(ClickHouseParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ClickHouseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ClickHouseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnType}.
	 * @param ctx the parse tree
	 */
	void enterColumnType(ClickHouseParser.ColumnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnType}.
	 * @param ctx the parse tree
	 */
	void exitColumnType(ClickHouseParser.ColumnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnNameIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameIdentifier(ClickHouseParser.ColumnNameIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnNameIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameIdentifier(ClickHouseParser.ColumnNameIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(ClickHouseParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(ClickHouseParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#identifierOrNull}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrNull(ClickHouseParser.IdentifierOrNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#identifierOrNull}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrNull(ClickHouseParser.IdentifierOrNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(ClickHouseParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(ClickHouseParser.EnumValueContext ctx);
}
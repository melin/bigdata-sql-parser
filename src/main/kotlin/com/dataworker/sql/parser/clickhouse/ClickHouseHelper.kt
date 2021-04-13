package com.dataworker.sql.parser.clickhouse

import com.dataworker.sql.parser.model.StatementData
import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.StatementType.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils
import com.dataworker.sql.parser.antlr4.ParseException
import com.dataworker.sql.parser.antlr4.clickhouse.ClickHouseLexer
import com.dataworker.sql.parser.antlr4.clickhouse.ClickHouseParser

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object ClickHouseHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            CREATE_TABLE,
            CREATE_TABLE_AS_SELECT,
            DROP_TABLE,

            INSERT_VALUES,
            INSERT_SELECT,

            SELECT,
            SHOW_CREATE_TABLE,

            OPTIMIZE,
            ALTER_TABLE,

            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData? {
        val trimCmd = StringUtils.trim(command)

        val charStream = CharStreams.fromString(trimCmd);
        val lexer = ClickHouseLexer(charStream)

        val tokenStream = CommonTokenStream(lexer)
        val parser = ClickHouseParser(tokenStream)
        parser.interpreter.predictionMode = PredictionMode.LL

        val sqlVisitor = ClickHouseAntlr4Visitor()
        sqlVisitor.setCommand(trimCmd)

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return sqlVisitor.visit(parser.queryStmt())
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                return sqlVisitor.visit(parser.queryStmt())
            }
        } catch (e: ParseException) {
            if(StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(trimCmd)
            }
        }
    }
}

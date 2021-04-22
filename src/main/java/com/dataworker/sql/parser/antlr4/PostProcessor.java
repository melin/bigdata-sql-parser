package com.dataworker.sql.parser.antlr4;

import com.dataworker.sql.parser.antlr4.spark.SparkSqlBaseBaseListener;
import com.dataworker.sql.parser.antlr4.spark.SparkSqlBaseParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class PostProcessor extends SparkSqlBaseBaseListener {

    @Override
    public void exitErrorIdent(SparkSqlBaseParser.ErrorIdentContext ctx) {
        String ident = ctx.getParent().getText();

        throw new ParseException("Possibly unquoted identifier $ident detected. " +
                "Please consider quoting it with back-quotes as " + ident, ctx);
    }

    /** Remove the back ticks from an Identifier. */
    @Override
    public void exitQuotedIdentifier(SparkSqlBaseParser.QuotedIdentifierContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token)ctx.getChild(0).getPayload();

        CommonToken commonToken = new CommonToken(
                new org.antlr.v4.runtime.misc.Pair(token.getTokenSource(), token.getInputStream()),
                SparkSqlBaseParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 1,
                token.getStopIndex() - 1);

        commonToken.setText(commonToken.getText().replace("``", "`"));
        parent.addChild(commonToken);
    }

    /** Treat non-reserved keywords as Identifiers. */
    @Override
    public void exitNonReserved(SparkSqlBaseParser.NonReservedContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token)ctx.getChild(0).getPayload();

        parent.addChild(new CommonToken(
                new org.antlr.v4.runtime.misc.Pair(token.getTokenSource(), token.getInputStream()),
                SparkSqlBaseParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 0,
                token.getStopIndex() - 0));
    }
}
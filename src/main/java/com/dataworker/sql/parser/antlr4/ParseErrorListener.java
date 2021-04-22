package com.dataworker.sql.parser.antlr4;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ParseErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?,?> recognizer,
                            Object offendingSymbol, int line, int charPositionInLine,
                            java.lang.String msg, RecognitionException e) {
        Origin position = new Origin(line, charPositionInLine);

        Origin start, stop;
        if (offendingSymbol instanceof CommonToken) {
            CommonToken token = (CommonToken) offendingSymbol;
            start = new Origin(line, token.getCharPositionInLine());
            int length = token.getStopIndex() - token.getStartIndex() + 1;
            stop = new Origin(line, token.getCharPositionInLine() + length);
        } else {
            start = new Origin(line, charPositionInLine);
            stop = start;
        }

        throw new ParseException(null, msg, start, stop);
    }
}
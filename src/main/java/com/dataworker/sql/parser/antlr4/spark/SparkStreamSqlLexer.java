// Generated from com/dataworker/sql/parser/antlr4/spark/SparkStreamSqlLexer.g4 by ANTLR 4.8
package com.dataworker.sql.parser.antlr4.spark;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkStreamSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, CREATE=5, 
		TABLE=6, STREAM=7, WITH=8, COMMENT=9, TRUE=10, FALSE=11, AS=12, BY=13, 
		SET=14, DELAY=15, INSERT=16, INTO=17, USING=18, PATTERN=19, MINUSMINUS=20, 
		STRING=21, BOOLEAN=22, INT=23, BIGINT=24, FLOAT=25, DOUBLE=26, DATE=27, 
		TIMESTAMP=28, STAR=29, DIVIDE=30, MODULE=31, PLUS=32, MINUS=33, EQUAL_SYMBOL=34, 
		GREATER_SYMBOL=35, LESS_SYMBOL=36, EXCLAMATION_SYMBOL=37, BIT_NOT_OP=38, 
		BIT_OR_OP=39, BIT_AND_OP=40, BIT_XOR_OP=41, DOT=42, LR_BRACKET=43, RR_BRACKET=44, 
		COMMA=45, SEMI=46, ID=47, REVERSE_QUOTE_ID=48, STRING_LITERAL=49, DECIMAL_LITERAL=50, 
		REAL_LITERAL=51, ERROR_RECONGNIGION=52;
	public static final int
		DCSTREAMCOMMENT=2, ERRORCHANNEL=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "DCSTREAMCOMMENT", "ERRORCHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", "CREATE", 
			"TABLE", "STREAM", "WITH", "COMMENT", "TRUE", "FALSE", "AS", "BY", "SET", 
			"DELAY", "INSERT", "INTO", "USING", "PATTERN", "MINUSMINUS", "STRING", 
			"BOOLEAN", "INT", "BIGINT", "FLOAT", "DOUBLE", "DATE", "TIMESTAMP", "STAR", 
			"DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", "GREATER_SYMBOL", 
			"LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", 
			"BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "ID", 
			"REVERSE_QUOTE_ID", "STRING_LITERAL", "DECIMAL_LITERAL", "REAL_LITERAL", 
			"EXPONENT_NUM_PART", "ID_LITERAL", "DQUOTA_STRING", "SQUOTA_STRING", 
			"DEC_DIGIT", "ERROR_RECONGNIGION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'CREATE'", "'TABLE'", "'STREAM'", "'WITH'", 
			"'COMMENT'", "'TRUE'", "'FALSE'", "'AS'", "'BY'", "'SET'", "'DELAY'", 
			"'INSERT'", "'INTO'", "'USING'", "'PATTERN'", "'--'", "'STRING'", "'BOOLEAN'", 
			"'INT'", "'BIGINT'", "'FLOAT'", "'DOUBLE'", "'DATE'", "'TIMESTAMP'", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'='", "'>'", "'<'", "'!'", "'~'", 
			"'|'", "'&'", "'^'", "'.'", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"CREATE", "TABLE", "STREAM", "WITH", "COMMENT", "TRUE", "FALSE", "AS", 
			"BY", "SET", "DELAY", "INSERT", "INTO", "USING", "PATTERN", "MINUSMINUS", 
			"STRING", "BOOLEAN", "INT", "BIGINT", "FLOAT", "DOUBLE", "DATE", "TIMESTAMP", 
			"STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", "GREATER_SYMBOL", 
			"LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", 
			"BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "ID", 
			"REVERSE_QUOTE_ID", "STRING_LITERAL", "DECIMAL_LITERAL", "REAL_LITERAL", 
			"ERROR_RECONGNIGION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SparkStreamSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SparkStreamSqlLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u01e6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\6\2w\n\2\r\2"+
		"\16\2x\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3\u0082\n\3\r\3\16\3\u0083\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u008f\n\4\f\4\16\4\u0092\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u009d\n\5\3\5\7\5\u00a0\n\5\f\5\16"+
		"\5\u00a3\13\5\3\5\5\5\u00a6\n\5\3\5\3\5\5\5\u00aa\n\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00b0\n\5\3\5\3\5\5\5\u00b4\n\5\5\5\u00b6\n\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\6\61\u0171\n\61\r\61\16\61\u0172\3\61\3"+
		"\61\3\62\3\62\5\62\u0179\n\62\3\63\6\63\u017c\n\63\r\63\16\63\u017d\3"+
		"\64\6\64\u0181\n\64\r\64\16\64\u0182\5\64\u0185\n\64\3\64\3\64\6\64\u0189"+
		"\n\64\r\64\16\64\u018a\3\64\6\64\u018e\n\64\r\64\16\64\u018f\3\64\3\64"+
		"\3\64\3\64\6\64\u0196\n\64\r\64\16\64\u0197\5\64\u019a\n\64\3\64\3\64"+
		"\6\64\u019e\n\64\r\64\16\64\u019f\3\64\3\64\3\64\6\64\u01a5\n\64\r\64"+
		"\16\64\u01a6\3\64\3\64\5\64\u01ab\n\64\3\65\3\65\5\65\u01af\n\65\3\65"+
		"\6\65\u01b2\n\65\r\65\16\65\u01b3\3\66\7\66\u01b7\n\66\f\66\16\66\u01ba"+
		"\13\66\3\66\6\66\u01bd\n\66\r\66\16\66\u01be\3\66\7\66\u01c2\n\66\f\66"+
		"\16\66\u01c5\13\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u01cd\n\67\f\67"+
		"\16\67\u01d0\13\67\3\67\3\67\38\38\38\38\38\38\78\u01da\n8\f8\168\u01dd"+
		"\138\38\38\39\39\3:\3:\3:\3:\6\u0083\u0090\u01b8\u01be\2;\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m\2o\2q\2s\66\3\2"+
		"\n\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2bb\6\2&&\62;C\\aa\5\2&&C\\aa\4"+
		"\2$$^^\4\2))^^\3\2\62;\2\u0203\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"s\3\2\2\2\3v\3\2\2\2\5|\3\2\2\2\7\u008a\3\2\2\2\t\u00b5\3\2\2\2\13\u00b9"+
		"\3\2\2\2\r\u00c0\3\2\2\2\17\u00c6\3\2\2\2\21\u00cd\3\2\2\2\23\u00d2\3"+
		"\2\2\2\25\u00da\3\2\2\2\27\u00df\3\2\2\2\31\u00e5\3\2\2\2\33\u00e8\3\2"+
		"\2\2\35\u00eb\3\2\2\2\37\u00ef\3\2\2\2!\u00f5\3\2\2\2#\u00fc\3\2\2\2%"+
		"\u0101\3\2\2\2\'\u0107\3\2\2\2)\u010f\3\2\2\2+\u0112\3\2\2\2-\u0119\3"+
		"\2\2\2/\u0121\3\2\2\2\61\u0125\3\2\2\2\63\u012c\3\2\2\2\65\u0132\3\2\2"+
		"\2\67\u0139\3\2\2\29\u013e\3\2\2\2;\u0148\3\2\2\2=\u014a\3\2\2\2?\u014c"+
		"\3\2\2\2A\u014e\3\2\2\2C\u0150\3\2\2\2E\u0152\3\2\2\2G\u0154\3\2\2\2I"+
		"\u0156\3\2\2\2K\u0158\3\2\2\2M\u015a\3\2\2\2O\u015c\3\2\2\2Q\u015e\3\2"+
		"\2\2S\u0160\3\2\2\2U\u0162\3\2\2\2W\u0164\3\2\2\2Y\u0166\3\2\2\2[\u0168"+
		"\3\2\2\2]\u016a\3\2\2\2_\u016c\3\2\2\2a\u016e\3\2\2\2c\u0178\3\2\2\2e"+
		"\u017b\3\2\2\2g\u01aa\3\2\2\2i\u01ac\3\2\2\2k\u01b8\3\2\2\2m\u01c6\3\2"+
		"\2\2o\u01d3\3\2\2\2q\u01e0\3\2\2\2s\u01e2\3\2\2\2uw\t\2\2\2vu\3\2\2\2"+
		"wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\2\2\2{\4\3\2\2\2|}\7\61\2"+
		"\2}~\7,\2\2~\177\7#\2\2\177\u0081\3\2\2\2\u0080\u0082\13\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\7,\2\2\u0086\u0087\7\61\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\b\3\3\2\u0089\6\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c"+
		"\7,\2\2\u008c\u0090\3\2\2\2\u008d\u008f\13\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7,\2\2\u0094\u0095\7\61\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\b\4\2\2\u0097\b\3\2\2\2\u0098\u0099\7/\2\2"+
		"\u0099\u009a\7/\2\2\u009a\u009d\7\"\2\2\u009b\u009d\7%\2\2\u009c\u0098"+
		"\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\n\3\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7\17\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\7\f"+
		"\2\2\u00a8\u00aa\7\2\2\3\u00a9\u00a5\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00b6\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad\7/\2\2\u00ad\u00b3\3\2\2"+
		"\2\u00ae\u00b0\7\17\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b4\7\f\2\2\u00b2\u00b4\7\2\2\3\u00b3\u00af\3\2"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u009c\3\2\2\2\u00b5"+
		"\u00ab\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\5\2\2\u00b8\n\3\2\2\2"+
		"\u00b9\u00ba\7E\2\2\u00ba\u00bb\7T\2\2\u00bb\u00bc\7G\2\2\u00bc\u00bd"+
		"\7C\2\2\u00bd\u00be\7V\2\2\u00be\u00bf\7G\2\2\u00bf\f\3\2\2\2\u00c0\u00c1"+
		"\7V\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7D\2\2\u00c3\u00c4\7N\2\2\u00c4"+
		"\u00c5\7G\2\2\u00c5\16\3\2\2\2\u00c6\u00c7\7U\2\2\u00c7\u00c8\7V\2\2\u00c8"+
		"\u00c9\7T\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7C\2\2\u00cb\u00cc\7O\2\2"+
		"\u00cc\20\3\2\2\2\u00cd\u00ce\7Y\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0\7"+
		"V\2\2\u00d0\u00d1\7J\2\2\u00d1\22\3\2\2\2\u00d2\u00d3\7E\2\2\u00d3\u00d4"+
		"\7Q\2\2\u00d4\u00d5\7O\2\2\u00d5\u00d6\7O\2\2\u00d6\u00d7\7G\2\2\u00d7"+
		"\u00d8\7P\2\2\u00d8\u00d9\7V\2\2\u00d9\24\3\2\2\2\u00da\u00db\7V\2\2\u00db"+
		"\u00dc\7T\2\2\u00dc\u00dd\7W\2\2\u00dd\u00de\7G\2\2\u00de\26\3\2\2\2\u00df"+
		"\u00e0\7H\2\2\u00e0\u00e1\7C\2\2\u00e1\u00e2\7N\2\2\u00e2\u00e3\7U\2\2"+
		"\u00e3\u00e4\7G\2\2\u00e4\30\3\2\2\2\u00e5\u00e6\7C\2\2\u00e6\u00e7\7"+
		"U\2\2\u00e7\32\3\2\2\2\u00e8\u00e9\7D\2\2\u00e9\u00ea\7[\2\2\u00ea\34"+
		"\3\2\2\2\u00eb\u00ec\7U\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7V\2\2\u00ee"+
		"\36\3\2\2\2\u00ef\u00f0\7F\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2\7N\2\2\u00f2"+
		"\u00f3\7C\2\2\u00f3\u00f4\7[\2\2\u00f4 \3\2\2\2\u00f5\u00f6\7K\2\2\u00f6"+
		"\u00f7\7P\2\2\u00f7\u00f8\7U\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa\7T\2\2"+
		"\u00fa\u00fb\7V\2\2\u00fb\"\3\2\2\2\u00fc\u00fd\7K\2\2\u00fd\u00fe\7P"+
		"\2\2\u00fe\u00ff\7V\2\2\u00ff\u0100\7Q\2\2\u0100$\3\2\2\2\u0101\u0102"+
		"\7W\2\2\u0102\u0103\7U\2\2\u0103\u0104\7K\2\2\u0104\u0105\7P\2\2\u0105"+
		"\u0106\7I\2\2\u0106&\3\2\2\2\u0107\u0108\7R\2\2\u0108\u0109\7C\2\2\u0109"+
		"\u010a\7V\2\2\u010a\u010b\7V\2\2\u010b\u010c\7G\2\2\u010c\u010d\7T\2\2"+
		"\u010d\u010e\7P\2\2\u010e(\3\2\2\2\u010f\u0110\7/\2\2\u0110\u0111\7/\2"+
		"\2\u0111*\3\2\2\2\u0112\u0113\7U\2\2\u0113\u0114\7V\2\2\u0114\u0115\7"+
		"T\2\2\u0115\u0116\7K\2\2\u0116\u0117\7P\2\2\u0117\u0118\7I\2\2\u0118,"+
		"\3\2\2\2\u0119\u011a\7D\2\2\u011a\u011b\7Q\2\2\u011b\u011c\7Q\2\2\u011c"+
		"\u011d\7N\2\2\u011d\u011e\7G\2\2\u011e\u011f\7C\2\2\u011f\u0120\7P\2\2"+
		"\u0120.\3\2\2\2\u0121\u0122\7K\2\2\u0122\u0123\7P\2\2\u0123\u0124\7V\2"+
		"\2\u0124\60\3\2\2\2\u0125\u0126\7D\2\2\u0126\u0127\7K\2\2\u0127\u0128"+
		"\7I\2\2\u0128\u0129\7K\2\2\u0129\u012a\7P\2\2\u012a\u012b\7V\2\2\u012b"+
		"\62\3\2\2\2\u012c\u012d\7H\2\2\u012d\u012e\7N\2\2\u012e\u012f\7Q\2\2\u012f"+
		"\u0130\7C\2\2\u0130\u0131\7V\2\2\u0131\64\3\2\2\2\u0132\u0133\7F\2\2\u0133"+
		"\u0134\7Q\2\2\u0134\u0135\7W\2\2\u0135\u0136\7D\2\2\u0136\u0137\7N\2\2"+
		"\u0137\u0138\7G\2\2\u0138\66\3\2\2\2\u0139\u013a\7F\2\2\u013a\u013b\7"+
		"C\2\2\u013b\u013c\7V\2\2\u013c\u013d\7G\2\2\u013d8\3\2\2\2\u013e\u013f"+
		"\7V\2\2\u013f\u0140\7K\2\2\u0140\u0141\7O\2\2\u0141\u0142\7G\2\2\u0142"+
		"\u0143\7U\2\2\u0143\u0144\7V\2\2\u0144\u0145\7C\2\2\u0145\u0146\7O\2\2"+
		"\u0146\u0147\7R\2\2\u0147:\3\2\2\2\u0148\u0149\7,\2\2\u0149<\3\2\2\2\u014a"+
		"\u014b\7\61\2\2\u014b>\3\2\2\2\u014c\u014d\7\'\2\2\u014d@\3\2\2\2\u014e"+
		"\u014f\7-\2\2\u014fB\3\2\2\2\u0150\u0151\7/\2\2\u0151D\3\2\2\2\u0152\u0153"+
		"\7?\2\2\u0153F\3\2\2\2\u0154\u0155\7@\2\2\u0155H\3\2\2\2\u0156\u0157\7"+
		">\2\2\u0157J\3\2\2\2\u0158\u0159\7#\2\2\u0159L\3\2\2\2\u015a\u015b\7\u0080"+
		"\2\2\u015bN\3\2\2\2\u015c\u015d\7~\2\2\u015dP\3\2\2\2\u015e\u015f\7(\2"+
		"\2\u015fR\3\2\2\2\u0160\u0161\7`\2\2\u0161T\3\2\2\2\u0162\u0163\7\60\2"+
		"\2\u0163V\3\2\2\2\u0164\u0165\7*\2\2\u0165X\3\2\2\2\u0166\u0167\7+\2\2"+
		"\u0167Z\3\2\2\2\u0168\u0169\7.\2\2\u0169\\\3\2\2\2\u016a\u016b\7=\2\2"+
		"\u016b^\3\2\2\2\u016c\u016d\5k\66\2\u016d`\3\2\2\2\u016e\u0170\7b\2\2"+
		"\u016f\u0171\n\4\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7b\2\2\u0175"+
		"b\3\2\2\2\u0176\u0179\5m\67\2\u0177\u0179\5o8\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0177\3\2\2\2\u0179d\3\2\2\2\u017a\u017c\5q9\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017ef\3\2\2\2"+
		"\u017f\u0181\5q9\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0180\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\7\60\2\2\u0187\u0189\5"+
		"q9\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u01ab\3\2\2\2\u018c\u018e\5q9\2\u018d\u018c\3\2\2"+
		"\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0192\7\60\2\2\u0192\u0193\5i\65\2\u0193\u01ab\3\2\2\2"+
		"\u0194\u0196\5q9\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0195\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\7\60\2\2\u019c\u019e\5"+
		"q9\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\5i\65\2\u01a2\u01ab\3\2"+
		"\2\2\u01a3\u01a5\5q9\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\5i\65\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u0184\3\2\2\2\u01aa\u018d\3\2\2\2\u01aa\u0199\3\2"+
		"\2\2\u01aa\u01a4\3\2\2\2\u01abh\3\2\2\2\u01ac\u01ae\7G\2\2\u01ad\u01af"+
		"\7/\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0"+
		"\u01b2\5q9\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2"+
		"\2\u01b3\u01b4\3\2\2\2\u01b4j\3\2\2\2\u01b5\u01b7\t\5\2\2\u01b6\u01b5"+
		"\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\t\6\2\2\u01bc\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01c3\3\2\2\2\u01c0\u01c2\t\5\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4l\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c6\u01ce\7$\2\2\u01c7\u01c8\7^\2\2\u01c8\u01cd\13\2\2\2\u01c9"+
		"\u01ca\7$\2\2\u01ca\u01cd\7$\2\2\u01cb\u01cd\n\7\2\2\u01cc\u01c7\3\2\2"+
		"\2\u01cc\u01c9\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1"+
		"\u01d2\7$\2\2\u01d2n\3\2\2\2\u01d3\u01db\7)\2\2\u01d4\u01d5\7^\2\2\u01d5"+
		"\u01da\13\2\2\2\u01d6\u01d7\7)\2\2\u01d7\u01da\7)\2\2\u01d8\u01da\n\b"+
		"\2\2\u01d9\u01d4\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da"+
		"\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7)\2\2\u01dfp\3\2\2\2\u01e0\u01e1"+
		"\t\t\2\2\u01e1r\3\2\2\2\u01e2\u01e3\13\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\b:\4\2\u01e5t\3\2\2\2\"\2x\u0083\u0090\u009c\u00a1\u00a5\u00a9"+
		"\u00af\u00b3\u00b5\u0172\u0178\u017d\u0182\u0184\u018a\u018f\u0197\u0199"+
		"\u019f\u01a6\u01aa\u01ae\u01b3\u01b8\u01be\u01c3\u01cc\u01ce\u01d9\u01db"+
		"\5\2\3\2\2\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from com/dataworker/sql/parser/antlr4/arithmetic/Arithmetic.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.arithmetic;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmeticLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STRING=5, TRUE=6, FALSE=7, NULL=8, CASE=9, 
		WHEN=10, THEN=11, ELSE=12, END=13, DISTINCT=14, ALL=15, OVER=16, CLUSTER=17, 
		BY=18, DISTRIBUTE=19, PARTITION=20, ORDER=21, SORT=22, ASC=23, DESC=24, 
		NULLS=25, LAST=26, FIRST=27, EQ=28, NSEQ=29, NEQ=30, NEQJ=31, LT=32, LTE=33, 
		GT=34, GTE=35, LBRACKET=36, RBRACKET=37, PLUS=38, MINUS=39, ASTERISK=40, 
		SLASH=41, PERCENT=42, DIV=43, TILDE=44, AMPERSAND=45, PIPE=46, CONCAT_PIPE=47, 
		HAT=48, BIGINT_LITERAL=49, SMALLINT_LITERAL=50, TINYINT_LITERAL=51, INTEGER_VALUE=52, 
		IDENTIFIER=53, DOUBLE_LITERAL=54, BIGDECIMAL_LITERAL=55, SIMPLE_COMMENT=56, 
		BRACKETED_EMPTY_COMMENT=57, BRACKETED_COMMENT=58, WS=59, UNRECOGNIZED=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "STRING", "TRUE", "FALSE", "NULL", "CASE", 
		"WHEN", "THEN", "ELSE", "END", "DISTINCT", "ALL", "OVER", "CLUSTER", "BY", 
		"DISTRIBUTE", "PARTITION", "ORDER", "SORT", "ASC", "DESC", "NULLS", "LAST", 
		"FIRST", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "LBRACKET", 
		"RBRACKET", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", 
		"AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
		"TINYINT_LITERAL", "INTEGER_VALUE", "IDENTIFIER", "EXPONENT", "DECIMAL_DIGITS", 
		"DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "DIGIT", "LETTER", "SIMPLE_COMMENT", 
		"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'->'", null, "'TRUE'", "'FALSE'", "'NULL'", 
		"'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", "'DISTINCT'", "'ALL'", 
		"'OVER'", "'CLUSTER'", "'BY'", "'DISTRIBUTE'", "'PARTITION'", "'ORDER'", 
		"'SORT'", "'ASC'", "'DESC'", "'NULLS'", "'LAST'", "'FIRST'", null, "'<=>'", 
		"'<>'", "'!='", "'<'", "'<='", "'>'", "'>='", "'['", "']'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", null, 
		null, null, null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "STRING", "TRUE", "FALSE", "NULL", "CASE", 
		"WHEN", "THEN", "ELSE", "END", "DISTINCT", "ALL", "OVER", "CLUSTER", "BY", 
		"DISTRIBUTE", "PARTITION", "ORDER", "SORT", "ASC", "DESC", "NULLS", "LAST", 
		"FIRST", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "LBRACKET", 
		"RBRACKET", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", 
		"AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
		"TINYINT_LITERAL", "INTEGER_VALUE", "IDENTIFIER", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
		"SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", 
		"UNRECOGNIZED"
	};
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


	    public boolean bracket_enbled = true;


	public ArithmeticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arithmetic.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u009b"+
		"\n\6\f\6\16\6\u009e\13\6\3\6\5\6\u00a1\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u0125\n\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\6\62\u0159\n\62\r\62\16\62\u015a\3\62\3\62\3\63\6\63\u0160"+
		"\n\63\r\63\16\63\u0161\3\63\3\63\3\64\6\64\u0167\n\64\r\64\16\64\u0168"+
		"\3\64\3\64\3\65\6\65\u016e\n\65\r\65\16\65\u016f\3\66\3\66\3\66\6\66\u0175"+
		"\n\66\r\66\16\66\u0176\3\67\3\67\5\67\u017b\n\67\3\67\6\67\u017e\n\67"+
		"\r\67\16\67\u017f\38\68\u0183\n8\r8\168\u0184\38\38\78\u0189\n8\f8\16"+
		"8\u018c\138\38\38\68\u0190\n8\r8\168\u0191\58\u0194\n8\39\69\u0197\n9"+
		"\r9\169\u0198\39\59\u019c\n9\39\39\39\39\59\u01a2\n9\39\39\59\u01a6\n"+
		"9\3:\6:\u01a9\n:\r:\16:\u01aa\3:\5:\u01ae\n:\3:\3:\3:\3:\3:\5:\u01b5\n"+
		":\3:\3:\3:\5:\u01ba\n:\3;\3;\3<\3<\3<\3<\5<\u01c2\n<\3=\3=\3=\3=\3=\3"+
		"=\7=\u01ca\n=\f=\16=\u01cd\13=\3=\5=\u01d0\n=\3=\5=\u01d3\n=\3=\3=\3>"+
		"\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\7?\u01e3\n?\f?\16?\u01e6\13?\3?\3?\3"+
		"?\3?\3?\3@\6@\u01ee\n@\r@\16@\u01ef\3@\3@\3A\3A\3\u01e4\2B\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q8s9u\2w\2"+
		"y:{;}<\177=\u0081>\3\2\r\4\2))^^\4\2$$^^\4\2--//\3\2\62;\4\2C\\c|\4\2"+
		"\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\4\2\f\f\17\17\3\2"+
		"--\5\2\13\f\17\17\"\"\2\u0213\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0085\3\2\2\2\7"+
		"\u0087\3\2\2\2\t\u0089\3\2\2\2\13\u00a0\3\2\2\2\r\u00a2\3\2\2\2\17\u00a7"+
		"\3\2\2\2\21\u00ad\3\2\2\2\23\u00b2\3\2\2\2\25\u00b7\3\2\2\2\27\u00bc\3"+
		"\2\2\2\31\u00c1\3\2\2\2\33\u00c6\3\2\2\2\35\u00ca\3\2\2\2\37\u00d3\3\2"+
		"\2\2!\u00d7\3\2\2\2#\u00dc\3\2\2\2%\u00e4\3\2\2\2\'\u00e7\3\2\2\2)\u00f2"+
		"\3\2\2\2+\u00fc\3\2\2\2-\u0102\3\2\2\2/\u0107\3\2\2\2\61\u010b\3\2\2\2"+
		"\63\u0110\3\2\2\2\65\u0116\3\2\2\2\67\u011b\3\2\2\29\u0124\3\2\2\2;\u0126"+
		"\3\2\2\2=\u012a\3\2\2\2?\u012d\3\2\2\2A\u0130\3\2\2\2C\u0132\3\2\2\2E"+
		"\u0135\3\2\2\2G\u0137\3\2\2\2I\u013a\3\2\2\2K\u013c\3\2\2\2M\u013e\3\2"+
		"\2\2O\u0140\3\2\2\2Q\u0142\3\2\2\2S\u0144\3\2\2\2U\u0146\3\2\2\2W\u0148"+
		"\3\2\2\2Y\u014c\3\2\2\2[\u014e\3\2\2\2]\u0150\3\2\2\2_\u0152\3\2\2\2a"+
		"\u0155\3\2\2\2c\u0158\3\2\2\2e\u015f\3\2\2\2g\u0166\3\2\2\2i\u016d\3\2"+
		"\2\2k\u0174\3\2\2\2m\u0178\3\2\2\2o\u0193\3\2\2\2q\u01a5\3\2\2\2s\u01b9"+
		"\3\2\2\2u\u01bb\3\2\2\2w\u01c1\3\2\2\2y\u01c3\3\2\2\2{\u01d6\3\2\2\2}"+
		"\u01dd\3\2\2\2\177\u01ed\3\2\2\2\u0081\u01f3\3\2\2\2\u0083\u0084\7*\2"+
		"\2\u0084\4\3\2\2\2\u0085\u0086\7.\2\2\u0086\6\3\2\2\2\u0087\u0088\7+\2"+
		"\2\u0088\b\3\2\2\2\u0089\u008a\7/\2\2\u008a\u008b\7@\2\2\u008b\n\3\2\2"+
		"\2\u008c\u0092\7)\2\2\u008d\u0091\n\2\2\2\u008e\u008f\7^\2\2\u008f\u0091"+
		"\13\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u00a1\7)\2\2\u0096\u009c\7$\2\2\u0097\u009b\n\3\2\2\u0098"+
		"\u0099\7^\2\2\u0099\u009b\13\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\7$\2\2\u00a0\u008c\3\2"+
		"\2\2\u00a0\u0096\3\2\2\2\u00a1\f\3\2\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4"+
		"\7T\2\2\u00a4\u00a5\7W\2\2\u00a5\u00a6\7G\2\2\u00a6\16\3\2\2\2\u00a7\u00a8"+
		"\7H\2\2\u00a8\u00a9\7C\2\2\u00a9\u00aa\7N\2\2\u00aa\u00ab\7U\2\2\u00ab"+
		"\u00ac\7G\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7P\2\2\u00ae\u00af\7W\2\2\u00af"+
		"\u00b0\7N\2\2\u00b0\u00b1\7N\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\7E\2\2\u00b3"+
		"\u00b4\7C\2\2\u00b4\u00b5\7U\2\2\u00b5\u00b6\7G\2\2\u00b6\24\3\2\2\2\u00b7"+
		"\u00b8\7Y\2\2\u00b8\u00b9\7J\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb\7P\2\2"+
		"\u00bb\26\3\2\2\2\u00bc\u00bd\7V\2\2\u00bd\u00be\7J\2\2\u00be\u00bf\7"+
		"G\2\2\u00bf\u00c0\7P\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7G\2\2\u00c2\u00c3"+
		"\7N\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c5\7G\2\2\u00c5\32\3\2\2\2\u00c6\u00c7"+
		"\7G\2\2\u00c7\u00c8\7P\2\2\u00c8\u00c9\7F\2\2\u00c9\34\3\2\2\2\u00ca\u00cb"+
		"\7F\2\2\u00cb\u00cc\7K\2\2\u00cc\u00cd\7U\2\2\u00cd\u00ce\7V\2\2\u00ce"+
		"\u00cf\7K\2\2\u00cf\u00d0\7P\2\2\u00d0\u00d1\7E\2\2\u00d1\u00d2\7V\2\2"+
		"\u00d2\36\3\2\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7N\2\2\u00d5\u00d6\7"+
		"N\2\2\u00d6 \3\2\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00d9\7X\2\2\u00d9\u00da"+
		"\7G\2\2\u00da\u00db\7T\2\2\u00db\"\3\2\2\2\u00dc\u00dd\7E\2\2\u00dd\u00de"+
		"\7N\2\2\u00de\u00df\7W\2\2\u00df\u00e0\7U\2\2\u00e0\u00e1\7V\2\2\u00e1"+
		"\u00e2\7G\2\2\u00e2\u00e3\7T\2\2\u00e3$\3\2\2\2\u00e4\u00e5\7D\2\2\u00e5"+
		"\u00e6\7[\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7F\2\2\u00e8\u00e9\7K\2\2\u00e9"+
		"\u00ea\7U\2\2\u00ea\u00eb\7V\2\2\u00eb\u00ec\7T\2\2\u00ec\u00ed\7K\2\2"+
		"\u00ed\u00ee\7D\2\2\u00ee\u00ef\7W\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1"+
		"\7G\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7R\2\2\u00f3\u00f4\7C\2\2\u00f4\u00f5"+
		"\7T\2\2\u00f5\u00f6\7V\2\2\u00f6\u00f7\7K\2\2\u00f7\u00f8\7V\2\2\u00f8"+
		"\u00f9\7K\2\2\u00f9\u00fa\7Q\2\2\u00fa\u00fb\7P\2\2\u00fb*\3\2\2\2\u00fc"+
		"\u00fd\7Q\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff\7F\2\2\u00ff\u0100\7G\2\2"+
		"\u0100\u0101\7T\2\2\u0101,\3\2\2\2\u0102\u0103\7U\2\2\u0103\u0104\7Q\2"+
		"\2\u0104\u0105\7T\2\2\u0105\u0106\7V\2\2\u0106.\3\2\2\2\u0107\u0108\7"+
		"C\2\2\u0108\u0109\7U\2\2\u0109\u010a\7E\2\2\u010a\60\3\2\2\2\u010b\u010c"+
		"\7F\2\2\u010c\u010d\7G\2\2\u010d\u010e\7U\2\2\u010e\u010f\7E\2\2\u010f"+
		"\62\3\2\2\2\u0110\u0111\7P\2\2\u0111\u0112\7W\2\2\u0112\u0113\7N\2\2\u0113"+
		"\u0114\7N\2\2\u0114\u0115\7U\2\2\u0115\64\3\2\2\2\u0116\u0117\7N\2\2\u0117"+
		"\u0118\7C\2\2\u0118\u0119\7U\2\2\u0119\u011a\7V\2\2\u011a\66\3\2\2\2\u011b"+
		"\u011c\7H\2\2\u011c\u011d\7K\2\2\u011d\u011e\7T\2\2\u011e\u011f\7U\2\2"+
		"\u011f\u0120\7V\2\2\u01208\3\2\2\2\u0121\u0125\7?\2\2\u0122\u0123\7?\2"+
		"\2\u0123\u0125\7?\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0125:\3"+
		"\2\2\2\u0126\u0127\7>\2\2\u0127\u0128\7?\2\2\u0128\u0129\7@\2\2\u0129"+
		"<\3\2\2\2\u012a\u012b\7>\2\2\u012b\u012c\7@\2\2\u012c>\3\2\2\2\u012d\u012e"+
		"\7#\2\2\u012e\u012f\7?\2\2\u012f@\3\2\2\2\u0130\u0131\7>\2\2\u0131B\3"+
		"\2\2\2\u0132\u0133\7>\2\2\u0133\u0134\7?\2\2\u0134D\3\2\2\2\u0135\u0136"+
		"\7@\2\2\u0136F\3\2\2\2\u0137\u0138\7@\2\2\u0138\u0139\7?\2\2\u0139H\3"+
		"\2\2\2\u013a\u013b\7]\2\2\u013bJ\3\2\2\2\u013c\u013d\7_\2\2\u013dL\3\2"+
		"\2\2\u013e\u013f\7-\2\2\u013fN\3\2\2\2\u0140\u0141\7/\2\2\u0141P\3\2\2"+
		"\2\u0142\u0143\7,\2\2\u0143R\3\2\2\2\u0144\u0145\7\61\2\2\u0145T\3\2\2"+
		"\2\u0146\u0147\7\'\2\2\u0147V\3\2\2\2\u0148\u0149\7F\2\2\u0149\u014a\7"+
		"K\2\2\u014a\u014b\7X\2\2\u014bX\3\2\2\2\u014c\u014d\7\u0080\2\2\u014d"+
		"Z\3\2\2\2\u014e\u014f\7(\2\2\u014f\\\3\2\2\2\u0150\u0151\7~\2\2\u0151"+
		"^\3\2\2\2\u0152\u0153\7~\2\2\u0153\u0154\7~\2\2\u0154`\3\2\2\2\u0155\u0156"+
		"\7`\2\2\u0156b\3\2\2\2\u0157\u0159\5u;\2\u0158\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\7N\2\2\u015dd\3\2\2\2\u015e\u0160\5u;\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0164\7U\2\2\u0164f\3\2\2\2\u0165\u0167\5u;\2\u0166\u0165\3"+
		"\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\7[\2\2\u016bh\3\2\2\2\u016c\u016e\5u;\2\u016d"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170j\3\2\2\2\u0171\u0175\5w<\2\u0172\u0175\5u;\2\u0173\u0175\7"+
		"a\2\2\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177l\3\2\2\2"+
		"\u0178\u017a\7G\2\2\u0179\u017b\t\4\2\2\u017a\u0179\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017e\5u;\2\u017d\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180n\3\2\2\2"+
		"\u0181\u0183\5u;\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u018a\7\60\2\2"+
		"\u0187\u0189\5u;\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0194\3\2\2\2\u018c\u018a\3\2\2\2\u018d"+
		"\u018f\7\60\2\2\u018e\u0190\5u;\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0182\3\2\2\2\u0193\u018d\3\2\2\2\u0194p\3\2\2\2\u0195\u0197\5u;\2\u0196"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019b\3\2\2\2\u019a\u019c\5m\67\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7F\2\2\u019e\u01a6\3\2"+
		"\2\2\u019f\u01a1\5o8\2\u01a0\u01a2\5m\67\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7F\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u0196\3\2\2\2\u01a5\u019f\3\2\2\2\u01a6r\3\2\2\2\u01a7\u01a9\5u;\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01ae\5m\67\2\u01ad\u01ac\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7D\2\2\u01b0\u01b1\7F\2"+
		"\2\u01b1\u01ba\3\2\2\2\u01b2\u01b4\5o8\2\u01b3\u01b5\5m\67\2\u01b4\u01b3"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7D\2\2\u01b7"+
		"\u01b8\7F\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01a8\3\2\2\2\u01b9\u01b2\3\2"+
		"\2\2\u01bat\3\2\2\2\u01bb\u01bc\t\5\2\2\u01bcv\3\2\2\2\u01bd\u01c2\t\6"+
		"\2\2\u01be\u01c2\n\7\2\2\u01bf\u01c0\t\b\2\2\u01c0\u01c2\t\t\2\2\u01c1"+
		"\u01bd\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2x\3\2\2\2"+
		"\u01c3\u01c4\7/\2\2\u01c4\u01c5\7/\2\2\u01c5\u01cb\3\2\2\2\u01c6\u01c7"+
		"\7^\2\2\u01c7\u01ca\7\f\2\2\u01c8\u01ca\n\n\2\2\u01c9\u01c6\3\2\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d0\7\17\2\2\u01cf"+
		"\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01d3\7\f"+
		"\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\b=\2\2\u01d5z\3\2\2\2\u01d6\u01d7\7\61\2\2\u01d7\u01d8\7,\2\2\u01d8"+
		"\u01d9\7,\2\2\u01d9\u01da\7\61\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\b>"+
		"\2\2\u01dc|\3\2\2\2\u01dd\u01de\7\61\2\2\u01de\u01df\7,\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e4\n\13\2\2\u01e1\u01e3\13\2\2\2\u01e2\u01e1\3\2\2\2"+
		"\u01e3\u01e6\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e7"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7,\2\2\u01e8\u01e9\7\61\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\b?\2\2\u01eb~\3\2\2\2\u01ec\u01ee\t\f\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\b@\3\2\u01f2\u0080\3\2\2\2\u01f3"+
		"\u01f4\13\2\2\2\u01f4\u0082\3\2\2\2$\2\u0090\u0092\u009a\u009c\u00a0\u0124"+
		"\u015a\u0161\u0168\u016f\u0174\u0176\u017a\u017f\u0184\u018a\u0191\u0193"+
		"\u0198\u019b\u01a1\u01a5\u01aa\u01ad\u01b4\u01b9\u01c1\u01c9\u01cb\u01cf"+
		"\u01d2\u01e4\u01ef\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
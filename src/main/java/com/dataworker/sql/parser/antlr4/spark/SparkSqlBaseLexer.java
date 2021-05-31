// Generated from com/dataworker/sql/parser/antlr4/spark/SparkSqlBase.g4 by ANTLR 4.8
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
public class SparkSqlBaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, AFTER=13, ALL=14, ALTER=15, ANALYZE=16, AND=17, 
		ANTI=18, ANY=19, ARCHIVE=20, ARRAY=21, AS=22, ASC=23, AT=24, AUTHORIZATION=25, 
		BETWEEN=26, BOTH=27, BUCKET=28, BUCKETS=29, BY=30, CACHE=31, CASCADE=32, 
		CASE=33, CAST=34, CHANGE=35, CHECK=36, CLEAR=37, CLUSTER=38, CLUSTERED=39, 
		CODEGEN=40, COLLATE=41, COLLECTION=42, COLUMN=43, COLUMNS=44, COMMENT=45, 
		COMMIT=46, COMPACT=47, COMPACTIONS=48, COMPUTE=49, CONCATENATE=50, CONSTRAINT=51, 
		CONVERT=52, COST=53, CREATE=54, CROSS=55, CUBE=56, CURRENT=57, CURRENT_DATE=58, 
		CURRENT_TIME=59, CURRENT_TIMESTAMP=60, CURRENT_USER=61, DATA=62, DATABASE=63, 
		DATABASES=64, DAY=65, DBPROPERTIES=66, DEFINED=67, DELETE=68, DELIMITED=69, 
		DELTA=70, DESC=71, DESCRIBE=72, DETAIL=73, DFS=74, DIRECTORIES=75, DIRECTORY=76, 
		DISTINCT=77, DISTRIBUTE=78, DIV=79, DROP=80, DRY=81, ELSE=82, END=83, 
		ESCAPE=84, ESCAPED=85, EXCEPT=86, EXCHANGE=87, EXISTS=88, EXPLAIN=89, 
		EXPORT=90, EXTENDED=91, EXTERNAL=92, EXTRACT=93, FALSE=94, FETCH=95, FIELDS=96, 
		FILTER=97, FILEFORMAT=98, FIRST=99, FOLLOWING=100, FOR=101, FOREIGN=102, 
		FORMAT=103, FORMATTED=104, FROM=105, FULL=106, FUNCTION=107, FUNCTIONS=108, 
		GLOBAL=109, GRANT=110, GROUP=111, GROUPING=112, HAVING=113, HOUR=114, 
		HOURS=115, HISTORY=116, IF=117, IGNORE=118, IMPORT=119, IN=120, INDEX=121, 
		INDEXES=122, INNER=123, INPATH=124, INPUTFORMAT=125, INSERT=126, INTERSECT=127, 
		INTERVAL=128, INTO=129, IS=130, ITEMS=131, JOIN=132, KEYS=133, LAST=134, 
		LATERAL=135, LAZY=136, LEADING=137, LEFT=138, LIKE=139, LIMIT=140, LINES=141, 
		LIST=142, LIFECYCLE=143, LOAD=144, LOCAL=145, LOCATION=146, LOCK=147, 
		LOCKS=148, LOGICAL=149, MACRO=150, MAP=151, MATCHED=152, MERGE=153, MINUTE=154, 
		MONTH=155, MSCK=156, NAMESPACE=157, NAMESPACES=158, NATURAL=159, NO=160, 
		NOT=161, NULL=162, NULLS=163, OF=164, ON=165, ONLY=166, OPTION=167, OPTIONS=168, 
		OR=169, ORDER=170, OUT=171, OUTER=172, OUTPUTFORMAT=173, OVER=174, OVERLAPS=175, 
		OVERLAY=176, OVERWRITE=177, PARTITION=178, PARTITIONED=179, PARTITIONS=180, 
		PARQUET=181, PERCENTLIT=182, PIVOT=183, PLACING=184, POSITION=185, PRECEDING=186, 
		PRIMARY=187, PRINCIPALS=188, PROPERTIES=189, PURGE=190, QUERY=191, RANGE=192, 
		RECORDREADER=193, RECORDWRITER=194, RECOVER=195, REDUCE=196, REFERENCES=197, 
		REFRESH=198, RENAME=199, REPAIR=200, REPLACE=201, RESET=202, RESPECT=203, 
		RESTRICT=204, REVOKE=205, RETAIN=206, RIGHT=207, RLIKE=208, ROLE=209, 
		ROLES=210, ROLLBACK=211, ROLLUP=212, ROW=213, ROWS=214, RUN=215, SCHEMA=216, 
		SECOND=217, SELECT=218, SEMI=219, SEPARATED=220, SERDE=221, SERDEPROPERTIES=222, 
		SESSION_USER=223, SET=224, SETMINUS=225, SETS=226, SHOW=227, SKEWED=228, 
		SOME=229, SORT=230, SORTED=231, START=232, STATISTICS=233, STORED=234, 
		STRATIFY=235, STRUCT=236, SUBSTR=237, SUBSTRING=238, SYNC=239, TABLE=240, 
		TABLES=241, TABLESAMPLE=242, TBLPROPERTIES=243, TEMPORARY=244, TERMINATED=245, 
		THEN=246, TIME=247, TO=248, TOUCH=249, TRAILING=250, TRANSACTION=251, 
		TRANSACTIONS=252, TRANSFORM=253, TRIM=254, TRUE=255, TRUNCATE=256, TRY_CAST=257, 
		TYPE=258, UNARCHIVE=259, UNBOUNDED=260, UNCACHE=261, UNION=262, UNIQUE=263, 
		UNKNOWN=264, UNLOCK=265, UNSET=266, UPDATE=267, USE=268, USER=269, USING=270, 
		VALUES=271, VACUUM=272, VIEW=273, VIEWS=274, WHEN=275, WHERE=276, WINDOW=277, 
		WITH=278, ZONE=279, YEAR=280, KILL=281, READ=282, JOB=283, ADDJAR=284, 
		COMPRESS=285, FILE=286, EQ=287, NSEQ=288, NEQ=289, NEQJ=290, LT=291, LTE=292, 
		GT=293, GTE=294, PLUS=295, MINUS=296, ASTERISK=297, SLASH=298, PERCENT=299, 
		TILDE=300, AMPERSAND=301, PIPE=302, CONCAT_PIPE=303, HAT=304, STRING=305, 
		BIGINT_LITERAL=306, SMALLINT_LITERAL=307, TINYINT_LITERAL=308, INTEGER_VALUE=309, 
		EXPONENT_VALUE=310, DECIMAL_VALUE=311, FLOAT_LITERAL=312, DOUBLE_LITERAL=313, 
		BIGDECIMAL_LITERAL=314, IDENTIFIER=315, BACKQUOTED_IDENTIFIER=316, SIMPLE_COMMENT=317, 
		BRACKETED_COMMENT=318, WS=319, UNRECOGNIZED=320;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", 
			"ANY", "ARCHIVE", "ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", 
			"BOTH", "BUCKET", "BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", 
			"CHANGE", "CHECK", "CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", 
			"COLLECTION", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", 
			"COMPUTE", "CONCATENATE", "CONSTRAINT", "CONVERT", "COST", "CREATE", 
			"CROSS", "CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURRENT_USER", "DATA", "DATABASE", "DATABASES", "DAY", "DBPROPERTIES", 
			"DEFINED", "DELETE", "DELIMITED", "DELTA", "DESC", "DESCRIBE", "DETAIL", 
			"DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", "DISTRIBUTE", "DIV", "DROP", 
			"DRY", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", "EXCHANGE", "EXISTS", 
			"EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", 
			"FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", "FOR", "FOREIGN", 
			"FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", "GLOBAL", 
			"GRANT", "GROUP", "GROUPING", "HAVING", "HOUR", "HOURS", "HISTORY", "IF", 
			"IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
			"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
			"LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
			"LIST", "LIFECYCLE", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", 
			"MACRO", "MAP", "MATCHED", "MERGE", "MINUTE", "MONTH", "MSCK", "NAMESPACE", 
			"NAMESPACES", "NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", 
			"OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", 
			"OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", 
			"PARQUET", "PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", 
			"PRIMARY", "PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", 
			"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
			"REPAIR", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RETAIN", 
			"RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", 
			"RUN", "SCHEMA", "SECOND", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", 
			"SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", 
			"SORT", "SORTED", "START", "STATISTICS", "STORED", "STRATIFY", "STRUCT", 
			"SUBSTR", "SUBSTRING", "SYNC", "TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", 
			"TEMPORARY", "TERMINATED", "THEN", "TIME", "TO", "TOUCH", "TRAILING", 
			"TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", 
			"TRY_CAST", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", 
			"UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", 
			"VACUUM", "VIEW", "VIEWS", "WHEN", "WHERE", "WINDOW", "WITH", "ZONE", 
			"YEAR", "KILL", "READ", "JOB", "ADDJAR", "COMPRESS", "FILE", "EQ", "NSEQ", 
			"NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", 
			"SLASH", "PERCENT", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", 
			"STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
			"EXPONENT_VALUE", "DECIMAL_VALUE", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
			"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "DECIMAL_DIGITS", 
			"EXPONENT", "DIGIT", "LETTER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", 
			"WS", "UNRECOGNIZED"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", 
			"']'", "':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", 
			"'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
			"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
			"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'CONVERT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", 
			"'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
			"'CURRENT_USER'", "'DATA'", "'DATABASE'", null, "'DAY'", "'DBPROPERTIES'", 
			"'DEFINED'", "'DELETE'", "'DELIMITED'", "'DELTA'", "'DESC'", "'DESCRIBE'", 
			"'DETAIL'", "'DFS'", "'DIRECTORIES'", "'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", 
			"'DIV'", "'DROP'", "'DRY'", "'ELSE'", "'END'", "'ESCAPE'", "'ESCAPED'", 
			"'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTENDED'", 
			"'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", "'FILTER'", 
			"'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", "'FORMAT'", 
			"'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", 
			"'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", "'HOURS'", 
			"'HISTORY'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", 
			"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
			"'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", 
			"'LIFECYCLE'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", 
			"'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MINUTE'", 
			"'MONTH'", "'MSCK'", "'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", 
			null, "'NULL'", "'NULLS'", "'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", 
			"'OR'", "'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", 
			"'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", 
			"'PARQUET'", "'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", 
			"'PRIMARY'", "'PRINCIPALS'", "'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", 
			"'RECORDREADER'", "'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", 
			"'REFRESH'", "'RENAME'", "'REPAIR'", "'REPLACE'", "'RESET'", "'RESPECT'", 
			"'RESTRICT'", "'REVOKE'", "'RETAIN'", "'RIGHT'", null, "'ROLE'", "'ROLES'", 
			"'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", "'RUN'", "'SCHEMA'", "'SECOND'", 
			"'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", 
			"'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", 
			"'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", "'STORED'", 
			"'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'SYNC'", "'TABLE'", 
			"'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TIME'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
			"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TRY_CAST'", 
			"'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", 
			"'UNKNOWN'", "'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", 
			"'VALUES'", "'VACUUM'", "'VIEW'", "'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", 
			"'WITH'", "'ZONE'", "'YEAR'", "'KILL'", "'READ'", "'JOB'", "'ADDJAR'", 
			"'COMPRESS'", "'FILE'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'||'", 
			"'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
			"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "CONVERT", "COST", "CREATE", "CROSS", "CUBE", 
			"CURRENT", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATABASE", "DATABASES", "DAY", "DBPROPERTIES", "DEFINED", "DELETE", 
			"DELIMITED", "DELTA", "DESC", "DESCRIBE", "DETAIL", "DFS", "DIRECTORIES", 
			"DIRECTORY", "DISTINCT", "DISTRIBUTE", "DIV", "DROP", "DRY", "ELSE", 
			"END", "ESCAPE", "ESCAPED", "EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", 
			"EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", "FIELDS", 
			"FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", "FOR", "FOREIGN", "FORMAT", 
			"FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", 
			"GROUP", "GROUPING", "HAVING", "HOUR", "HOURS", "HISTORY", "IF", "IGNORE", 
			"IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
			"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
			"LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
			"LIST", "LIFECYCLE", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", 
			"MACRO", "MAP", "MATCHED", "MERGE", "MINUTE", "MONTH", "MSCK", "NAMESPACE", 
			"NAMESPACES", "NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", 
			"OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", 
			"OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", 
			"PARQUET", "PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", 
			"PRIMARY", "PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", 
			"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
			"REPAIR", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RETAIN", 
			"RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", 
			"RUN", "SCHEMA", "SECOND", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", 
			"SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", 
			"SORT", "SORTED", "START", "STATISTICS", "STORED", "STRATIFY", "STRUCT", 
			"SUBSTR", "SUBSTRING", "SYNC", "TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", 
			"TEMPORARY", "TERMINATED", "THEN", "TIME", "TO", "TOUCH", "TRAILING", 
			"TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", 
			"TRY_CAST", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", 
			"UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", 
			"VACUUM", "VIEW", "VIEWS", "WHEN", "WHERE", "WINDOW", "WITH", "ZONE", 
			"YEAR", "KILL", "READ", "JOB", "ADDJAR", "COMPRESS", "FILE", "EQ", "NSEQ", 
			"NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", 
			"SLASH", "PERCENT", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", 
			"STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
			"EXPONENT_VALUE", "DECIMAL_VALUE", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
			"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
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


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	  /**
	   * This method will be called when we see '/*' and try to match it as a bracketed comment.
	   * If the next character is '+', it should be parsed as hint later, and we cannot match
	   * it as a bracketed comment.
	   *
	   * Returns true if the next character is '+'.
	   */
	  public boolean isHint() {
	    int nextChar = _input.LA(1);
	    if (nextChar == '+') {
	      return true;
	    } else {
	      return false;
	    }
	  }


	public SparkSqlBaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SparkSqlBase.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 309:
			return EXPONENT_VALUE_sempred((RuleContext)_localctx, predIndex);
		case 310:
			return DECIMAL_VALUE_sempred((RuleContext)_localctx, predIndex);
		case 311:
			return FLOAT_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 312:
			return DOUBLE_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 313:
			return BIGDECIMAL_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 321:
			return BRACKETED_COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EXPONENT_VALUE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isValidDecimal();
		}
		return true;
	}
	private boolean DECIMAL_VALUE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return isValidDecimal();
		}
		return true;
	}
	private boolean FLOAT_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return isValidDecimal();
		}
		return true;
	}
	private boolean DOUBLE_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return isValidDecimal();
		}
		return true;
	}
	private boolean BIGDECIMAL_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return isValidDecimal();
		}
		return true;
	}
	private boolean BRACKETED_COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !isHint();
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u0142\u0b87\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1"+
		"\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6"+
		"\t\u00b6\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba"+
		"\4\u00bb\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf"+
		"\t\u00bf\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3"+
		"\4\u00c4\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8"+
		"\t\u00c8\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc"+
		"\4\u00cd\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1"+
		"\t\u00d1\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5"+
		"\4\u00d6\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da"+
		"\t\u00da\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de"+
		"\4\u00df\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3"+
		"\t\u00e3\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7"+
		"\4\u00e8\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec"+
		"\t\u00ec\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0"+
		"\4\u00f1\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5"+
		"\t\u00f5\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9"+
		"\4\u00fa\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe"+
		"\t\u00fe\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102"+
		"\4\u0103\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107"+
		"\t\u0107\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b"+
		"\4\u010c\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110"+
		"\t\u0110\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114"+
		"\4\u0115\t\u0115\4\u0116\t\u0116\4\u0117\t\u0117\4\u0118\t\u0118\4\u0119"+
		"\t\u0119\4\u011a\t\u011a\4\u011b\t\u011b\4\u011c\t\u011c\4\u011d\t\u011d"+
		"\4\u011e\t\u011e\4\u011f\t\u011f\4\u0120\t\u0120\4\u0121\t\u0121\4\u0122"+
		"\t\u0122\4\u0123\t\u0123\4\u0124\t\u0124\4\u0125\t\u0125\4\u0126\t\u0126"+
		"\4\u0127\t\u0127\4\u0128\t\u0128\4\u0129\t\u0129\4\u012a\t\u012a\4\u012b"+
		"\t\u012b\4\u012c\t\u012c\4\u012d\t\u012d\4\u012e\t\u012e\4\u012f\t\u012f"+
		"\4\u0130\t\u0130\4\u0131\t\u0131\4\u0132\t\u0132\4\u0133\t\u0133\4\u0134"+
		"\t\u0134\4\u0135\t\u0135\4\u0136\t\u0136\4\u0137\t\u0137\4\u0138\t\u0138"+
		"\4\u0139\t\u0139\4\u013a\t\u013a\4\u013b\t\u013b\4\u013c\t\u013c\4\u013d"+
		"\t\u013d\4\u013e\t\u013e\4\u013f\t\u013f\4\u0140\t\u0140\4\u0141\t\u0141"+
		"\4\u0142\t\u0142\4\u0143\t\u0143\4\u0144\t\u0144\4\u0145\t\u0145\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\3"+
		"9\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3"+
		"?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\5A\u043b\nA\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3"+
		"S\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3_\3_\3"+
		"_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3"+
		"b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3"+
		"h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3"+
		"n\3o\3o\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3r\3"+
		"r\3r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3t\3t\3t\3t\3t\3t\3u\3u\3u\3u\3u\3u\3"+
		"u\3u\3v\3v\3v\3w\3w\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3y\3y\3y\3z\3"+
		"z\3z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3{\3{\3|\3|\3|\3|\3|\3|\3}\3}\3}\3}\3"+
		"}\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\5\u00a2\u06db\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\5\u00d1\u084c\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f5"+
		"\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\3\u00f5\3\u00f5\3\u00f5\5\u00f5\u095b\n\u00f5\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd"+
		"\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fe\3\u00fe"+
		"\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00ff"+
		"\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100"+
		"\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101"+
		"\3\u0102\3\u0102\3\u0102\3\u0102\3\u0102\3\u0102\3\u0102\3\u0102\3\u0102"+
		"\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103\3\u0104\3\u0104\3\u0104\3\u0104"+
		"\3\u0104\3\u0104\3\u0104\3\u0104\3\u0104\3\u0104\3\u0105\3\u0105\3\u0105"+
		"\3\u0105\3\u0105\3\u0105\3\u0105\3\u0105\3\u0105\3\u0105\3\u0106\3\u0106"+
		"\3\u0106\3\u0106\3\u0106\3\u0106\3\u0106\3\u0106\3\u0107\3\u0107\3\u0107"+
		"\3\u0107\3\u0107\3\u0107\3\u0108\3\u0108\3\u0108\3\u0108\3\u0108\3\u0108"+
		"\3\u0108\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109"+
		"\3\u010a\3\u010a\3\u010a\3\u010a\3\u010a\3\u010a\3\u010a\3\u010b\3\u010b"+
		"\3\u010b\3\u010b\3\u010b\3\u010b\3\u010c\3\u010c\3\u010c\3\u010c\3\u010c"+
		"\3\u010c\3\u010c\3\u010d\3\u010d\3\u010d\3\u010d\3\u010e\3\u010e\3\u010e"+
		"\3\u010e\3\u010e\3\u010f\3\u010f\3\u010f\3\u010f\3\u010f\3\u010f\3\u0110"+
		"\3\u0110\3\u0110\3\u0110\3\u0110\3\u0110\3\u0110\3\u0111\3\u0111\3\u0111"+
		"\3\u0111\3\u0111\3\u0111\3\u0111\3\u0112\3\u0112\3\u0112\3\u0112\3\u0112"+
		"\3\u0113\3\u0113\3\u0113\3\u0113\3\u0113\3\u0113\3\u0114\3\u0114\3\u0114"+
		"\3\u0114\3\u0114\3\u0115\3\u0115\3\u0115\3\u0115\3\u0115\3\u0115\3\u0116"+
		"\3\u0116\3\u0116\3\u0116\3\u0116\3\u0116\3\u0116\3\u0117\3\u0117\3\u0117"+
		"\3\u0117\3\u0117\3\u0118\3\u0118\3\u0118\3\u0118\3\u0118\3\u0119\3\u0119"+
		"\3\u0119\3\u0119\3\u0119\3\u011a\3\u011a\3\u011a\3\u011a\3\u011a\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011c\3\u011c\3\u011c\3\u011c\3\u011d"+
		"\3\u011d\3\u011d\3\u011d\3\u011d\3\u011d\3\u011d\3\u011e\3\u011e\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011e\3\u011f\3\u011f\3\u011f"+
		"\3\u011f\3\u011f\3\u0120\3\u0120\3\u0120\5\u0120\u0a7c\n\u0120\3\u0121"+
		"\3\u0121\3\u0121\3\u0121\3\u0122\3\u0122\3\u0122\3\u0123\3\u0123\3\u0123"+
		"\3\u0124\3\u0124\3\u0125\3\u0125\3\u0125\3\u0125\5\u0125\u0a8e\n\u0125"+
		"\3\u0126\3\u0126\3\u0127\3\u0127\3\u0127\3\u0127\5\u0127\u0a96\n\u0127"+
		"\3\u0128\3\u0128\3\u0129\3\u0129\3\u012a\3\u012a\3\u012b\3\u012b\3\u012c"+
		"\3\u012c\3\u012d\3\u012d\3\u012e\3\u012e\3\u012f\3\u012f\3\u0130\3\u0130"+
		"\3\u0130\3\u0131\3\u0131\3\u0132\3\u0132\3\u0132\3\u0132\7\u0132\u0ab1"+
		"\n\u0132\f\u0132\16\u0132\u0ab4\13\u0132\3\u0132\3\u0132\3\u0132\3\u0132"+
		"\3\u0132\7\u0132\u0abb\n\u0132\f\u0132\16\u0132\u0abe\13\u0132\3\u0132"+
		"\5\u0132\u0ac1\n\u0132\3\u0133\6\u0133\u0ac4\n\u0133\r\u0133\16\u0133"+
		"\u0ac5\3\u0133\3\u0133\3\u0134\6\u0134\u0acb\n\u0134\r\u0134\16\u0134"+
		"\u0acc\3\u0134\3\u0134\3\u0135\6\u0135\u0ad2\n\u0135\r\u0135\16\u0135"+
		"\u0ad3\3\u0135\3\u0135\3\u0136\6\u0136\u0ad9\n\u0136\r\u0136\16\u0136"+
		"\u0ada\3\u0137\6\u0137\u0ade\n\u0137\r\u0137\16\u0137\u0adf\3\u0137\3"+
		"\u0137\3\u0137\3\u0137\3\u0137\3\u0137\5\u0137\u0ae8\n\u0137\3\u0138\3"+
		"\u0138\3\u0138\3\u0139\6\u0139\u0aee\n\u0139\r\u0139\16\u0139\u0aef\3"+
		"\u0139\5\u0139\u0af3\n\u0139\3\u0139\3\u0139\3\u0139\3\u0139\5\u0139\u0af9"+
		"\n\u0139\3\u0139\3\u0139\3\u0139\5\u0139\u0afe\n\u0139\3\u013a\6\u013a"+
		"\u0b01\n\u013a\r\u013a\16\u013a\u0b02\3\u013a\5\u013a\u0b06\n\u013a\3"+
		"\u013a\3\u013a\3\u013a\3\u013a\5\u013a\u0b0c\n\u013a\3\u013a\3\u013a\3"+
		"\u013a\5\u013a\u0b11\n\u013a\3\u013b\6\u013b\u0b14\n\u013b\r\u013b\16"+
		"\u013b\u0b15\3\u013b\5\u013b\u0b19\n\u013b\3\u013b\3\u013b\3\u013b\3\u013b"+
		"\3\u013b\5\u013b\u0b20\n\u013b\3\u013b\3\u013b\3\u013b\3\u013b\3\u013b"+
		"\5\u013b\u0b27\n\u013b\3\u013c\3\u013c\3\u013c\6\u013c\u0b2c\n\u013c\r"+
		"\u013c\16\u013c\u0b2d\3\u013d\3\u013d\3\u013d\3\u013d\7\u013d\u0b34\n"+
		"\u013d\f\u013d\16\u013d\u0b37\13\u013d\3\u013d\3\u013d\3\u013e\6\u013e"+
		"\u0b3c\n\u013e\r\u013e\16\u013e\u0b3d\3\u013e\3\u013e\7\u013e\u0b42\n"+
		"\u013e\f\u013e\16\u013e\u0b45\13\u013e\3\u013e\3\u013e\6\u013e\u0b49\n"+
		"\u013e\r\u013e\16\u013e\u0b4a\5\u013e\u0b4d\n\u013e\3\u013f\3\u013f\5"+
		"\u013f\u0b51\n\u013f\3\u013f\6\u013f\u0b54\n\u013f\r\u013f\16\u013f\u0b55"+
		"\3\u0140\3\u0140\3\u0141\3\u0141\3\u0142\3\u0142\3\u0142\3\u0142\3\u0142"+
		"\3\u0142\7\u0142\u0b62\n\u0142\f\u0142\16\u0142\u0b65\13\u0142\3\u0142"+
		"\5\u0142\u0b68\n\u0142\3\u0142\5\u0142\u0b6b\n\u0142\3\u0142\3\u0142\3"+
		"\u0143\3\u0143\3\u0143\3\u0143\3\u0143\3\u0143\7\u0143\u0b75\n\u0143\f"+
		"\u0143\16\u0143\u0b78\13\u0143\3\u0143\3\u0143\3\u0143\3\u0143\3\u0143"+
		"\3\u0144\6\u0144\u0b80\n\u0144\r\u0144\16\u0144\u0b81\3\u0144\3\u0144"+
		"\3\u0145\3\u0145\3\u0b76\2\u0146\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad"+
		"X\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1"+
		"b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5"+
		"l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5t\u00e7u\u00e9"+
		"v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5|\u00f7}\u00f9~\u00fb\177\u00fd"+
		"\u0080\u00ff\u0081\u0101\u0082\u0103\u0083\u0105\u0084\u0107\u0085\u0109"+
		"\u0086\u010b\u0087\u010d\u0088\u010f\u0089\u0111\u008a\u0113\u008b\u0115"+
		"\u008c\u0117\u008d\u0119\u008e\u011b\u008f\u011d\u0090\u011f\u0091\u0121"+
		"\u0092\u0123\u0093\u0125\u0094\u0127\u0095\u0129\u0096\u012b\u0097\u012d"+
		"\u0098\u012f\u0099\u0131\u009a\u0133\u009b\u0135\u009c\u0137\u009d\u0139"+
		"\u009e\u013b\u009f\u013d\u00a0\u013f\u00a1\u0141\u00a2\u0143\u00a3\u0145"+
		"\u00a4\u0147\u00a5\u0149\u00a6\u014b\u00a7\u014d\u00a8\u014f\u00a9\u0151"+
		"\u00aa\u0153\u00ab\u0155\u00ac\u0157\u00ad\u0159\u00ae\u015b\u00af\u015d"+
		"\u00b0\u015f\u00b1\u0161\u00b2\u0163\u00b3\u0165\u00b4\u0167\u00b5\u0169"+
		"\u00b6\u016b\u00b7\u016d\u00b8\u016f\u00b9\u0171\u00ba\u0173\u00bb\u0175"+
		"\u00bc\u0177\u00bd\u0179\u00be\u017b\u00bf\u017d\u00c0\u017f\u00c1\u0181"+
		"\u00c2\u0183\u00c3\u0185\u00c4\u0187\u00c5\u0189\u00c6\u018b\u00c7\u018d"+
		"\u00c8\u018f\u00c9\u0191\u00ca\u0193\u00cb\u0195\u00cc\u0197\u00cd\u0199"+
		"\u00ce\u019b\u00cf\u019d\u00d0\u019f\u00d1\u01a1\u00d2\u01a3\u00d3\u01a5"+
		"\u00d4\u01a7\u00d5\u01a9\u00d6\u01ab\u00d7\u01ad\u00d8\u01af\u00d9\u01b1"+
		"\u00da\u01b3\u00db\u01b5\u00dc\u01b7\u00dd\u01b9\u00de\u01bb\u00df\u01bd"+
		"\u00e0\u01bf\u00e1\u01c1\u00e2\u01c3\u00e3\u01c5\u00e4\u01c7\u00e5\u01c9"+
		"\u00e6\u01cb\u00e7\u01cd\u00e8\u01cf\u00e9\u01d1\u00ea\u01d3\u00eb\u01d5"+
		"\u00ec\u01d7\u00ed\u01d9\u00ee\u01db\u00ef\u01dd\u00f0\u01df\u00f1\u01e1"+
		"\u00f2\u01e3\u00f3\u01e5\u00f4\u01e7\u00f5\u01e9\u00f6\u01eb\u00f7\u01ed"+
		"\u00f8\u01ef\u00f9\u01f1\u00fa\u01f3\u00fb\u01f5\u00fc\u01f7\u00fd\u01f9"+
		"\u00fe\u01fb\u00ff\u01fd\u0100\u01ff\u0101\u0201\u0102\u0203\u0103\u0205"+
		"\u0104\u0207\u0105\u0209\u0106\u020b\u0107\u020d\u0108\u020f\u0109\u0211"+
		"\u010a\u0213\u010b\u0215\u010c\u0217\u010d\u0219\u010e\u021b\u010f\u021d"+
		"\u0110\u021f\u0111\u0221\u0112\u0223\u0113\u0225\u0114\u0227\u0115\u0229"+
		"\u0116\u022b\u0117\u022d\u0118\u022f\u0119\u0231\u011a\u0233\u011b\u0235"+
		"\u011c\u0237\u011d\u0239\u011e\u023b\u011f\u023d\u0120\u023f\u0121\u0241"+
		"\u0122\u0243\u0123\u0245\u0124\u0247\u0125\u0249\u0126\u024b\u0127\u024d"+
		"\u0128\u024f\u0129\u0251\u012a\u0253\u012b\u0255\u012c\u0257\u012d\u0259"+
		"\u012e\u025b\u012f\u025d\u0130\u025f\u0131\u0261\u0132\u0263\u0133\u0265"+
		"\u0134\u0267\u0135\u0269\u0136\u026b\u0137\u026d\u0138\u026f\u0139\u0271"+
		"\u013a\u0273\u013b\u0275\u013c\u0277\u013d\u0279\u013e\u027b\2\u027d\2"+
		"\u027f\2\u0281\2\u0283\u013f\u0285\u0140\u0287\u0141\u0289\u0142\3\2\n"+
		"\4\2))^^\4\2$$^^\3\2bb\4\2--//\3\2\62;\3\2C\\\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\2\u0bb2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2"+
		"\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd"+
		"\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2"+
		"\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef"+
		"\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2"+
		"\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101"+
		"\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2"+
		"\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113"+
		"\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2"+
		"\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125"+
		"\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2"+
		"\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\2\u0135\3\2\2\2\2\u0137"+
		"\3\2\2\2\2\u0139\3\2\2\2\2\u013b\3\2\2\2\2\u013d\3\2\2\2\2\u013f\3\2\2"+
		"\2\2\u0141\3\2\2\2\2\u0143\3\2\2\2\2\u0145\3\2\2\2\2\u0147\3\2\2\2\2\u0149"+
		"\3\2\2\2\2\u014b\3\2\2\2\2\u014d\3\2\2\2\2\u014f\3\2\2\2\2\u0151\3\2\2"+
		"\2\2\u0153\3\2\2\2\2\u0155\3\2\2\2\2\u0157\3\2\2\2\2\u0159\3\2\2\2\2\u015b"+
		"\3\2\2\2\2\u015d\3\2\2\2\2\u015f\3\2\2\2\2\u0161\3\2\2\2\2\u0163\3\2\2"+
		"\2\2\u0165\3\2\2\2\2\u0167\3\2\2\2\2\u0169\3\2\2\2\2\u016b\3\2\2\2\2\u016d"+
		"\3\2\2\2\2\u016f\3\2\2\2\2\u0171\3\2\2\2\2\u0173\3\2\2\2\2\u0175\3\2\2"+
		"\2\2\u0177\3\2\2\2\2\u0179\3\2\2\2\2\u017b\3\2\2\2\2\u017d\3\2\2\2\2\u017f"+
		"\3\2\2\2\2\u0181\3\2\2\2\2\u0183\3\2\2\2\2\u0185\3\2\2\2\2\u0187\3\2\2"+
		"\2\2\u0189\3\2\2\2\2\u018b\3\2\2\2\2\u018d\3\2\2\2\2\u018f\3\2\2\2\2\u0191"+
		"\3\2\2\2\2\u0193\3\2\2\2\2\u0195\3\2\2\2\2\u0197\3\2\2\2\2\u0199\3\2\2"+
		"\2\2\u019b\3\2\2\2\2\u019d\3\2\2\2\2\u019f\3\2\2\2\2\u01a1\3\2\2\2\2\u01a3"+
		"\3\2\2\2\2\u01a5\3\2\2\2\2\u01a7\3\2\2\2\2\u01a9\3\2\2\2\2\u01ab\3\2\2"+
		"\2\2\u01ad\3\2\2\2\2\u01af\3\2\2\2\2\u01b1\3\2\2\2\2\u01b3\3\2\2\2\2\u01b5"+
		"\3\2\2\2\2\u01b7\3\2\2\2\2\u01b9\3\2\2\2\2\u01bb\3\2\2\2\2\u01bd\3\2\2"+
		"\2\2\u01bf\3\2\2\2\2\u01c1\3\2\2\2\2\u01c3\3\2\2\2\2\u01c5\3\2\2\2\2\u01c7"+
		"\3\2\2\2\2\u01c9\3\2\2\2\2\u01cb\3\2\2\2\2\u01cd\3\2\2\2\2\u01cf\3\2\2"+
		"\2\2\u01d1\3\2\2\2\2\u01d3\3\2\2\2\2\u01d5\3\2\2\2\2\u01d7\3\2\2\2\2\u01d9"+
		"\3\2\2\2\2\u01db\3\2\2\2\2\u01dd\3\2\2\2\2\u01df\3\2\2\2\2\u01e1\3\2\2"+
		"\2\2\u01e3\3\2\2\2\2\u01e5\3\2\2\2\2\u01e7\3\2\2\2\2\u01e9\3\2\2\2\2\u01eb"+
		"\3\2\2\2\2\u01ed\3\2\2\2\2\u01ef\3\2\2\2\2\u01f1\3\2\2\2\2\u01f3\3\2\2"+
		"\2\2\u01f5\3\2\2\2\2\u01f7\3\2\2\2\2\u01f9\3\2\2\2\2\u01fb\3\2\2\2\2\u01fd"+
		"\3\2\2\2\2\u01ff\3\2\2\2\2\u0201\3\2\2\2\2\u0203\3\2\2\2\2\u0205\3\2\2"+
		"\2\2\u0207\3\2\2\2\2\u0209\3\2\2\2\2\u020b\3\2\2\2\2\u020d\3\2\2\2\2\u020f"+
		"\3\2\2\2\2\u0211\3\2\2\2\2\u0213\3\2\2\2\2\u0215\3\2\2\2\2\u0217\3\2\2"+
		"\2\2\u0219\3\2\2\2\2\u021b\3\2\2\2\2\u021d\3\2\2\2\2\u021f\3\2\2\2\2\u0221"+
		"\3\2\2\2\2\u0223\3\2\2\2\2\u0225\3\2\2\2\2\u0227\3\2\2\2\2\u0229\3\2\2"+
		"\2\2\u022b\3\2\2\2\2\u022d\3\2\2\2\2\u022f\3\2\2\2\2\u0231\3\2\2\2\2\u0233"+
		"\3\2\2\2\2\u0235\3\2\2\2\2\u0237\3\2\2\2\2\u0239\3\2\2\2\2\u023b\3\2\2"+
		"\2\2\u023d\3\2\2\2\2\u023f\3\2\2\2\2\u0241\3\2\2\2\2\u0243\3\2\2\2\2\u0245"+
		"\3\2\2\2\2\u0247\3\2\2\2\2\u0249\3\2\2\2\2\u024b\3\2\2\2\2\u024d\3\2\2"+
		"\2\2\u024f\3\2\2\2\2\u0251\3\2\2\2\2\u0253\3\2\2\2\2\u0255\3\2\2\2\2\u0257"+
		"\3\2\2\2\2\u0259\3\2\2\2\2\u025b\3\2\2\2\2\u025d\3\2\2\2\2\u025f\3\2\2"+
		"\2\2\u0261\3\2\2\2\2\u0263\3\2\2\2\2\u0265\3\2\2\2\2\u0267\3\2\2\2\2\u0269"+
		"\3\2\2\2\2\u026b\3\2\2\2\2\u026d\3\2\2\2\2\u026f\3\2\2\2\2\u0271\3\2\2"+
		"\2\2\u0273\3\2\2\2\2\u0275\3\2\2\2\2\u0277\3\2\2\2\2\u0279\3\2\2\2\2\u0283"+
		"\3\2\2\2\2\u0285\3\2\2\2\2\u0287\3\2\2\2\2\u0289\3\2\2\2\3\u028b\3\2\2"+
		"\2\5\u028d\3\2\2\2\7\u028f\3\2\2\2\t\u0291\3\2\2\2\13\u0293\3\2\2\2\r"+
		"\u0295\3\2\2\2\17\u0299\3\2\2\2\21\u029c\3\2\2\2\23\u029f\3\2\2\2\25\u02a1"+
		"\3\2\2\2\27\u02a3\3\2\2\2\31\u02a5\3\2\2\2\33\u02a9\3\2\2\2\35\u02af\3"+
		"\2\2\2\37\u02b3\3\2\2\2!\u02b9\3\2\2\2#\u02c1\3\2\2\2%\u02c5\3\2\2\2\'"+
		"\u02ca\3\2\2\2)\u02ce\3\2\2\2+\u02d6\3\2\2\2-\u02dc\3\2\2\2/\u02df\3\2"+
		"\2\2\61\u02e3\3\2\2\2\63\u02e6\3\2\2\2\65\u02f4\3\2\2\2\67\u02fc\3\2\2"+
		"\29\u0301\3\2\2\2;\u0308\3\2\2\2=\u0310\3\2\2\2?\u0313\3\2\2\2A\u0319"+
		"\3\2\2\2C\u0321\3\2\2\2E\u0326\3\2\2\2G\u032b\3\2\2\2I\u0332\3\2\2\2K"+
		"\u0338\3\2\2\2M\u033e\3\2\2\2O\u0346\3\2\2\2Q\u0350\3\2\2\2S\u0358\3\2"+
		"\2\2U\u0360\3\2\2\2W\u036b\3\2\2\2Y\u0372\3\2\2\2[\u037a\3\2\2\2]\u0382"+
		"\3\2\2\2_\u0389\3\2\2\2a\u0391\3\2\2\2c\u039d\3\2\2\2e\u03a5\3\2\2\2g"+
		"\u03b1\3\2\2\2i\u03bc\3\2\2\2k\u03c4\3\2\2\2m\u03c9\3\2\2\2o\u03d0\3\2"+
		"\2\2q\u03d6\3\2\2\2s\u03db\3\2\2\2u\u03e3\3\2\2\2w\u03f0\3\2\2\2y\u03fd"+
		"\3\2\2\2{\u040f\3\2\2\2}\u041c\3\2\2\2\177\u0421\3\2\2\2\u0081\u043a\3"+
		"\2\2\2\u0083\u043c\3\2\2\2\u0085\u0440\3\2\2\2\u0087\u044d\3\2\2\2\u0089"+
		"\u0455\3\2\2\2\u008b\u045c\3\2\2\2\u008d\u0466\3\2\2\2\u008f\u046c\3\2"+
		"\2\2\u0091\u0471\3\2\2\2\u0093\u047a\3\2\2\2\u0095\u0481\3\2\2\2\u0097"+
		"\u0485\3\2\2\2\u0099\u0491\3\2\2\2\u009b\u049b\3\2\2\2\u009d\u04a4\3\2"+
		"\2\2\u009f\u04af\3\2\2\2\u00a1\u04b3\3\2\2\2\u00a3\u04b8\3\2\2\2\u00a5"+
		"\u04bc\3\2\2\2\u00a7\u04c1\3\2\2\2\u00a9\u04c5\3\2\2\2\u00ab\u04cc\3\2"+
		"\2\2\u00ad\u04d4\3\2\2\2\u00af\u04db\3\2\2\2\u00b1\u04e4\3\2\2\2\u00b3"+
		"\u04eb\3\2\2\2\u00b5\u04f3\3\2\2\2\u00b7\u04fa\3\2\2\2\u00b9\u0503\3\2"+
		"\2\2\u00bb\u050c\3\2\2\2\u00bd\u0514\3\2\2\2\u00bf\u051a\3\2\2\2\u00c1"+
		"\u0520\3\2\2\2\u00c3\u0527\3\2\2\2\u00c5\u052e\3\2\2\2\u00c7\u0539\3\2"+
		"\2\2\u00c9\u053f\3\2\2\2\u00cb\u0549\3\2\2\2\u00cd\u054d\3\2\2\2\u00cf"+
		"\u0555\3\2\2\2\u00d1\u055c\3\2\2\2\u00d3\u0566\3\2\2\2\u00d5\u056b\3\2"+
		"\2\2\u00d7\u0570\3\2\2\2\u00d9\u0579\3\2\2\2\u00db\u0583\3\2\2\2\u00dd"+
		"\u058a\3\2\2\2\u00df\u0590\3\2\2\2\u00e1\u0596\3\2\2\2\u00e3\u059f\3\2"+
		"\2\2\u00e5\u05a6\3\2\2\2\u00e7\u05ab\3\2\2\2\u00e9\u05b1\3\2\2\2\u00eb"+
		"\u05b9\3\2\2\2\u00ed\u05bc\3\2\2\2\u00ef\u05c3\3\2\2\2\u00f1\u05ca\3\2"+
		"\2\2\u00f3\u05cd\3\2\2\2\u00f5\u05d3\3\2\2\2\u00f7\u05db\3\2\2\2\u00f9"+
		"\u05e1\3\2\2\2\u00fb\u05e8\3\2\2\2\u00fd\u05f4\3\2\2\2\u00ff\u05fb\3\2"+
		"\2\2\u0101\u0605\3\2\2\2\u0103\u060e\3\2\2\2\u0105\u0613\3\2\2\2\u0107"+
		"\u0616\3\2\2\2\u0109\u061c\3\2\2\2\u010b\u0621\3\2\2\2\u010d\u0626\3\2"+
		"\2\2\u010f\u062b\3\2\2\2\u0111\u0633\3\2\2\2\u0113\u0638\3\2\2\2\u0115"+
		"\u0640\3\2\2\2\u0117\u0645\3\2\2\2\u0119\u064a\3\2\2\2\u011b\u0650\3\2"+
		"\2\2\u011d\u0656\3\2\2\2\u011f\u065b\3\2\2\2\u0121\u0665\3\2\2\2\u0123"+
		"\u066a\3\2\2\2\u0125\u0670\3\2\2\2\u0127\u0679\3\2\2\2\u0129\u067e\3\2"+
		"\2\2\u012b\u0684\3\2\2\2\u012d\u068c\3\2\2\2\u012f\u0692\3\2\2\2\u0131"+
		"\u0696\3\2\2\2\u0133\u069e\3\2\2\2\u0135\u06a4\3\2\2\2\u0137\u06ab\3\2"+
		"\2\2\u0139\u06b1\3\2\2\2\u013b\u06b6\3\2\2\2\u013d\u06c0\3\2\2\2\u013f"+
		"\u06cb\3\2\2\2\u0141\u06d3\3\2\2\2\u0143\u06da\3\2\2\2\u0145\u06dc\3\2"+
		"\2\2\u0147\u06e1\3\2\2\2\u0149\u06e7\3\2\2\2\u014b\u06ea\3\2\2\2\u014d"+
		"\u06ed\3\2\2\2\u014f\u06f2\3\2\2\2\u0151\u06f9\3\2\2\2\u0153\u0701\3\2"+
		"\2\2\u0155\u0704\3\2\2\2\u0157\u070a\3\2\2\2\u0159\u070e\3\2\2\2\u015b"+
		"\u0714\3\2\2\2\u015d\u0721\3\2\2\2\u015f\u0726\3\2\2\2\u0161\u072f\3\2"+
		"\2\2\u0163\u0737\3\2\2\2\u0165\u0741\3\2\2\2\u0167\u074b\3\2\2\2\u0169"+
		"\u0757\3\2\2\2\u016b\u0762\3\2\2\2\u016d\u076a\3\2\2\2\u016f\u0772\3\2"+
		"\2\2\u0171\u0778\3\2\2\2\u0173\u0780\3\2\2\2\u0175\u0789\3\2\2\2\u0177"+
		"\u0793\3\2\2\2\u0179\u079b\3\2\2\2\u017b\u07a6\3\2\2\2\u017d\u07b1\3\2"+
		"\2\2\u017f\u07b7\3\2\2\2\u0181\u07bd\3\2\2\2\u0183\u07c3\3\2\2\2\u0185"+
		"\u07d0\3\2\2\2\u0187\u07dd\3\2\2\2\u0189\u07e5\3\2\2\2\u018b\u07ec\3\2"+
		"\2\2\u018d\u07f7\3\2\2\2\u018f\u07ff\3\2\2\2\u0191\u0806\3\2\2\2\u0193"+
		"\u080d\3\2\2\2\u0195\u0815\3\2\2\2\u0197\u081b\3\2\2\2\u0199\u0823\3\2"+
		"\2\2\u019b\u082c\3\2\2\2\u019d\u0833\3\2\2\2\u019f\u083a\3\2\2\2\u01a1"+
		"\u084b\3\2\2\2\u01a3\u084d\3\2\2\2\u01a5\u0852\3\2\2\2\u01a7\u0858\3\2"+
		"\2\2\u01a9\u0861\3\2\2\2\u01ab\u0868\3\2\2\2\u01ad\u086c\3\2\2\2\u01af"+
		"\u0871\3\2\2\2\u01b1\u0875\3\2\2\2\u01b3\u087c\3\2\2\2\u01b5\u0883\3\2"+
		"\2\2\u01b7\u088a\3\2\2\2\u01b9\u088f\3\2\2\2\u01bb\u0899\3\2\2\2\u01bd"+
		"\u089f\3\2\2\2\u01bf\u08af\3\2\2\2\u01c1\u08bc\3\2\2\2\u01c3\u08c0\3\2"+
		"\2\2\u01c5\u08c6\3\2\2\2\u01c7\u08cb\3\2\2\2\u01c9\u08d0\3\2\2\2\u01cb"+
		"\u08d7\3\2\2\2\u01cd\u08dc\3\2\2\2\u01cf\u08e1\3\2\2\2\u01d1\u08e8\3\2"+
		"\2\2\u01d3\u08ee\3\2\2\2\u01d5\u08f9\3\2\2\2\u01d7\u0900\3\2\2\2\u01d9"+
		"\u0909\3\2\2\2\u01db\u0910\3\2\2\2\u01dd\u0917\3\2\2\2\u01df\u0921\3\2"+
		"\2\2\u01e1\u0926\3\2\2\2\u01e3\u092c\3\2\2\2\u01e5\u0933\3\2\2\2\u01e7"+
		"\u093f\3\2\2\2\u01e9\u095a\3\2\2\2\u01eb\u095c\3\2\2\2\u01ed\u0967\3\2"+
		"\2\2\u01ef\u096c\3\2\2\2\u01f1\u0971\3\2\2\2\u01f3\u0974\3\2\2\2\u01f5"+
		"\u097a\3\2\2\2\u01f7\u0983\3\2\2\2\u01f9\u098f\3\2\2\2\u01fb\u099c\3\2"+
		"\2\2\u01fd\u09a6\3\2\2\2\u01ff\u09ab\3\2\2\2\u0201\u09b0\3\2\2\2\u0203"+
		"\u09b9\3\2\2\2\u0205\u09c2\3\2\2\2\u0207\u09c7\3\2\2\2\u0209\u09d1\3\2"+
		"\2\2\u020b\u09db\3\2\2\2\u020d\u09e3\3\2\2\2\u020f\u09e9\3\2\2\2\u0211"+
		"\u09f0\3\2\2\2\u0213\u09f8\3\2\2\2\u0215\u09ff\3\2\2\2\u0217\u0a05\3\2"+
		"\2\2\u0219\u0a0c\3\2\2\2\u021b\u0a10\3\2\2\2\u021d\u0a15\3\2\2\2\u021f"+
		"\u0a1b\3\2\2\2\u0221\u0a22\3\2\2\2\u0223\u0a29\3\2\2\2\u0225\u0a2e\3\2"+
		"\2\2\u0227\u0a34\3\2\2\2\u0229\u0a39\3\2\2\2\u022b\u0a3f\3\2\2\2\u022d"+
		"\u0a46\3\2\2\2\u022f\u0a4b\3\2\2\2\u0231\u0a50\3\2\2\2\u0233\u0a55\3\2"+
		"\2\2\u0235\u0a5a\3\2\2\2\u0237\u0a5f\3\2\2\2\u0239\u0a63\3\2\2\2\u023b"+
		"\u0a6a\3\2\2\2\u023d\u0a73\3\2\2\2\u023f\u0a7b\3\2\2\2\u0241\u0a7d\3\2"+
		"\2\2\u0243\u0a81\3\2\2\2\u0245\u0a84\3\2\2\2\u0247\u0a87\3\2\2\2\u0249"+
		"\u0a8d\3\2\2\2\u024b\u0a8f\3\2\2\2\u024d\u0a95\3\2\2\2\u024f\u0a97\3\2"+
		"\2\2\u0251\u0a99\3\2\2\2\u0253\u0a9b\3\2\2\2\u0255\u0a9d\3\2\2\2\u0257"+
		"\u0a9f\3\2\2\2\u0259\u0aa1\3\2\2\2\u025b\u0aa3\3\2\2\2\u025d\u0aa5\3\2"+
		"\2\2\u025f\u0aa7\3\2\2\2\u0261\u0aaa\3\2\2\2\u0263\u0ac0\3\2\2\2\u0265"+
		"\u0ac3\3\2\2\2\u0267\u0aca\3\2\2\2\u0269\u0ad1\3\2\2\2\u026b\u0ad8\3\2"+
		"\2\2\u026d\u0ae7\3\2\2\2\u026f\u0ae9\3\2\2\2\u0271\u0afd\3\2\2\2\u0273"+
		"\u0b10\3\2\2\2\u0275\u0b26\3\2\2\2\u0277\u0b2b\3\2\2\2\u0279\u0b2f\3\2"+
		"\2\2\u027b\u0b4c\3\2\2\2\u027d\u0b4e\3\2\2\2\u027f\u0b57\3\2\2\2\u0281"+
		"\u0b59\3\2\2\2\u0283\u0b5b\3\2\2\2\u0285\u0b6e\3\2\2\2\u0287\u0b7f\3\2"+
		"\2\2\u0289\u0b85\3\2\2\2\u028b\u028c\7=\2\2\u028c\4\3\2\2\2\u028d\u028e"+
		"\7*\2\2\u028e\6\3\2\2\2\u028f\u0290\7+\2\2\u0290\b\3\2\2\2\u0291\u0292"+
		"\7.\2\2\u0292\n\3\2\2\2\u0293\u0294\7\60\2\2\u0294\f\3\2\2\2\u0295\u0296"+
		"\7\61\2\2\u0296\u0297\7,\2\2\u0297\u0298\7-\2\2\u0298\16\3\2\2\2\u0299"+
		"\u029a\7,\2\2\u029a\u029b\7\61\2\2\u029b\20\3\2\2\2\u029c\u029d\7/\2\2"+
		"\u029d\u029e\7@\2\2\u029e\22\3\2\2\2\u029f\u02a0\7]\2\2\u02a0\24\3\2\2"+
		"\2\u02a1\u02a2\7_\2\2\u02a2\26\3\2\2\2\u02a3\u02a4\7<\2\2\u02a4\30\3\2"+
		"\2\2\u02a5\u02a6\7C\2\2\u02a6\u02a7\7F\2\2\u02a7\u02a8\7F\2\2\u02a8\32"+
		"\3\2\2\2\u02a9\u02aa\7C\2\2\u02aa\u02ab\7H\2\2\u02ab\u02ac\7V\2\2\u02ac"+
		"\u02ad\7G\2\2\u02ad\u02ae\7T\2\2\u02ae\34\3\2\2\2\u02af\u02b0\7C\2\2\u02b0"+
		"\u02b1\7N\2\2\u02b1\u02b2\7N\2\2\u02b2\36\3\2\2\2\u02b3\u02b4\7C\2\2\u02b4"+
		"\u02b5\7N\2\2\u02b5\u02b6\7V\2\2\u02b6\u02b7\7G\2\2\u02b7\u02b8\7T\2\2"+
		"\u02b8 \3\2\2\2\u02b9\u02ba\7C\2\2\u02ba\u02bb\7P\2\2\u02bb\u02bc\7C\2"+
		"\2\u02bc\u02bd\7N\2\2\u02bd\u02be\7[\2\2\u02be\u02bf\7\\\2\2\u02bf\u02c0"+
		"\7G\2\2\u02c0\"\3\2\2\2\u02c1\u02c2\7C\2\2\u02c2\u02c3\7P\2\2\u02c3\u02c4"+
		"\7F\2\2\u02c4$\3\2\2\2\u02c5\u02c6\7C\2\2\u02c6\u02c7\7P\2\2\u02c7\u02c8"+
		"\7V\2\2\u02c8\u02c9\7K\2\2\u02c9&\3\2\2\2\u02ca\u02cb\7C\2\2\u02cb\u02cc"+
		"\7P\2\2\u02cc\u02cd\7[\2\2\u02cd(\3\2\2\2\u02ce\u02cf\7C\2\2\u02cf\u02d0"+
		"\7T\2\2\u02d0\u02d1\7E\2\2\u02d1\u02d2\7J\2\2\u02d2\u02d3\7K\2\2\u02d3"+
		"\u02d4\7X\2\2\u02d4\u02d5\7G\2\2\u02d5*\3\2\2\2\u02d6\u02d7\7C\2\2\u02d7"+
		"\u02d8\7T\2\2\u02d8\u02d9\7T\2\2\u02d9\u02da\7C\2\2\u02da\u02db\7[\2\2"+
		"\u02db,\3\2\2\2\u02dc\u02dd\7C\2\2\u02dd\u02de\7U\2\2\u02de.\3\2\2\2\u02df"+
		"\u02e0\7C\2\2\u02e0\u02e1\7U\2\2\u02e1\u02e2\7E\2\2\u02e2\60\3\2\2\2\u02e3"+
		"\u02e4\7C\2\2\u02e4\u02e5\7V\2\2\u02e5\62\3\2\2\2\u02e6\u02e7\7C\2\2\u02e7"+
		"\u02e8\7W\2\2\u02e8\u02e9\7V\2\2\u02e9\u02ea\7J\2\2\u02ea\u02eb\7Q\2\2"+
		"\u02eb\u02ec\7T\2\2\u02ec\u02ed\7K\2\2\u02ed\u02ee\7\\\2\2\u02ee\u02ef"+
		"\7C\2\2\u02ef\u02f0\7V\2\2\u02f0\u02f1\7K\2\2\u02f1\u02f2\7Q\2\2\u02f2"+
		"\u02f3\7P\2\2\u02f3\64\3\2\2\2\u02f4\u02f5\7D\2\2\u02f5\u02f6\7G\2\2\u02f6"+
		"\u02f7\7V\2\2\u02f7\u02f8\7Y\2\2\u02f8\u02f9\7G\2\2\u02f9\u02fa\7G\2\2"+
		"\u02fa\u02fb\7P\2\2\u02fb\66\3\2\2\2\u02fc\u02fd\7D\2\2\u02fd\u02fe\7"+
		"Q\2\2\u02fe\u02ff\7V\2\2\u02ff\u0300\7J\2\2\u03008\3\2\2\2\u0301\u0302"+
		"\7D\2\2\u0302\u0303\7W\2\2\u0303\u0304\7E\2\2\u0304\u0305\7M\2\2\u0305"+
		"\u0306\7G\2\2\u0306\u0307\7V\2\2\u0307:\3\2\2\2\u0308\u0309\7D\2\2\u0309"+
		"\u030a\7W\2\2\u030a\u030b\7E\2\2\u030b\u030c\7M\2\2\u030c\u030d\7G\2\2"+
		"\u030d\u030e\7V\2\2\u030e\u030f\7U\2\2\u030f<\3\2\2\2\u0310\u0311\7D\2"+
		"\2\u0311\u0312\7[\2\2\u0312>\3\2\2\2\u0313\u0314\7E\2\2\u0314\u0315\7"+
		"C\2\2\u0315\u0316\7E\2\2\u0316\u0317\7J\2\2\u0317\u0318\7G\2\2\u0318@"+
		"\3\2\2\2\u0319\u031a\7E\2\2\u031a\u031b\7C\2\2\u031b\u031c\7U\2\2\u031c"+
		"\u031d\7E\2\2\u031d\u031e\7C\2\2\u031e\u031f\7F\2\2\u031f\u0320\7G\2\2"+
		"\u0320B\3\2\2\2\u0321\u0322\7E\2\2\u0322\u0323\7C\2\2\u0323\u0324\7U\2"+
		"\2\u0324\u0325\7G\2\2\u0325D\3\2\2\2\u0326\u0327\7E\2\2\u0327\u0328\7"+
		"C\2\2\u0328\u0329\7U\2\2\u0329\u032a\7V\2\2\u032aF\3\2\2\2\u032b\u032c"+
		"\7E\2\2\u032c\u032d\7J\2\2\u032d\u032e\7C\2\2\u032e\u032f\7P\2\2\u032f"+
		"\u0330\7I\2\2\u0330\u0331\7G\2\2\u0331H\3\2\2\2\u0332\u0333\7E\2\2\u0333"+
		"\u0334\7J\2\2\u0334\u0335\7G\2\2\u0335\u0336\7E\2\2\u0336\u0337\7M\2\2"+
		"\u0337J\3\2\2\2\u0338\u0339\7E\2\2\u0339\u033a\7N\2\2\u033a\u033b\7G\2"+
		"\2\u033b\u033c\7C\2\2\u033c\u033d\7T\2\2\u033dL\3\2\2\2\u033e\u033f\7"+
		"E\2\2\u033f\u0340\7N\2\2\u0340\u0341\7W\2\2\u0341\u0342\7U\2\2\u0342\u0343"+
		"\7V\2\2\u0343\u0344\7G\2\2\u0344\u0345\7T\2\2\u0345N\3\2\2\2\u0346\u0347"+
		"\7E\2\2\u0347\u0348\7N\2\2\u0348\u0349\7W\2\2\u0349\u034a\7U\2\2\u034a"+
		"\u034b\7V\2\2\u034b\u034c\7G\2\2\u034c\u034d\7T\2\2\u034d\u034e\7G\2\2"+
		"\u034e\u034f\7F\2\2\u034fP\3\2\2\2\u0350\u0351\7E\2\2\u0351\u0352\7Q\2"+
		"\2\u0352\u0353\7F\2\2\u0353\u0354\7G\2\2\u0354\u0355\7I\2\2\u0355\u0356"+
		"\7G\2\2\u0356\u0357\7P\2\2\u0357R\3\2\2\2\u0358\u0359\7E\2\2\u0359\u035a"+
		"\7Q\2\2\u035a\u035b\7N\2\2\u035b\u035c\7N\2\2\u035c\u035d\7C\2\2\u035d"+
		"\u035e\7V\2\2\u035e\u035f\7G\2\2\u035fT\3\2\2\2\u0360\u0361\7E\2\2\u0361"+
		"\u0362\7Q\2\2\u0362\u0363\7N\2\2\u0363\u0364\7N\2\2\u0364\u0365\7G\2\2"+
		"\u0365\u0366\7E\2\2\u0366\u0367\7V\2\2\u0367\u0368\7K\2\2\u0368\u0369"+
		"\7Q\2\2\u0369\u036a\7P\2\2\u036aV\3\2\2\2\u036b\u036c\7E\2\2\u036c\u036d"+
		"\7Q\2\2\u036d\u036e\7N\2\2\u036e\u036f\7W\2\2\u036f\u0370\7O\2\2\u0370"+
		"\u0371\7P\2\2\u0371X\3\2\2\2\u0372\u0373\7E\2\2\u0373\u0374\7Q\2\2\u0374"+
		"\u0375\7N\2\2\u0375\u0376\7W\2\2\u0376\u0377\7O\2\2\u0377\u0378\7P\2\2"+
		"\u0378\u0379\7U\2\2\u0379Z\3\2\2\2\u037a\u037b\7E\2\2\u037b\u037c\7Q\2"+
		"\2\u037c\u037d\7O\2\2\u037d\u037e\7O\2\2\u037e\u037f\7G\2\2\u037f\u0380"+
		"\7P\2\2\u0380\u0381\7V\2\2\u0381\\\3\2\2\2\u0382\u0383\7E\2\2\u0383\u0384"+
		"\7Q\2\2\u0384\u0385\7O\2\2\u0385\u0386\7O\2\2\u0386\u0387\7K\2\2\u0387"+
		"\u0388\7V\2\2\u0388^\3\2\2\2\u0389\u038a\7E\2\2\u038a\u038b\7Q\2\2\u038b"+
		"\u038c\7O\2\2\u038c\u038d\7R\2\2\u038d\u038e\7C\2\2\u038e\u038f\7E\2\2"+
		"\u038f\u0390\7V\2\2\u0390`\3\2\2\2\u0391\u0392\7E\2\2\u0392\u0393\7Q\2"+
		"\2\u0393\u0394\7O\2\2\u0394\u0395\7R\2\2\u0395\u0396\7C\2\2\u0396\u0397"+
		"\7E\2\2\u0397\u0398\7V\2\2\u0398\u0399\7K\2\2\u0399\u039a\7Q\2\2\u039a"+
		"\u039b\7P\2\2\u039b\u039c\7U\2\2\u039cb\3\2\2\2\u039d\u039e\7E\2\2\u039e"+
		"\u039f\7Q\2\2\u039f\u03a0\7O\2\2\u03a0\u03a1\7R\2\2\u03a1\u03a2\7W\2\2"+
		"\u03a2\u03a3\7V\2\2\u03a3\u03a4\7G\2\2\u03a4d\3\2\2\2\u03a5\u03a6\7E\2"+
		"\2\u03a6\u03a7\7Q\2\2\u03a7\u03a8\7P\2\2\u03a8\u03a9\7E\2\2\u03a9\u03aa"+
		"\7C\2\2\u03aa\u03ab\7V\2\2\u03ab\u03ac\7G\2\2\u03ac\u03ad\7P\2\2\u03ad"+
		"\u03ae\7C\2\2\u03ae\u03af\7V\2\2\u03af\u03b0\7G\2\2\u03b0f\3\2\2\2\u03b1"+
		"\u03b2\7E\2\2\u03b2\u03b3\7Q\2\2\u03b3\u03b4\7P\2\2\u03b4\u03b5\7U\2\2"+
		"\u03b5\u03b6\7V\2\2\u03b6\u03b7\7T\2\2\u03b7\u03b8\7C\2\2\u03b8\u03b9"+
		"\7K\2\2\u03b9\u03ba\7P\2\2\u03ba\u03bb\7V\2\2\u03bbh\3\2\2\2\u03bc\u03bd"+
		"\7E\2\2\u03bd\u03be\7Q\2\2\u03be\u03bf\7P\2\2\u03bf\u03c0\7X\2\2\u03c0"+
		"\u03c1\7G\2\2\u03c1\u03c2\7T\2\2\u03c2\u03c3\7V\2\2\u03c3j\3\2\2\2\u03c4"+
		"\u03c5\7E\2\2\u03c5\u03c6\7Q\2\2\u03c6\u03c7\7U\2\2\u03c7\u03c8\7V\2\2"+
		"\u03c8l\3\2\2\2\u03c9\u03ca\7E\2\2\u03ca\u03cb\7T\2\2\u03cb\u03cc\7G\2"+
		"\2\u03cc\u03cd\7C\2\2\u03cd\u03ce\7V\2\2\u03ce\u03cf\7G\2\2\u03cfn\3\2"+
		"\2\2\u03d0\u03d1\7E\2\2\u03d1\u03d2\7T\2\2\u03d2\u03d3\7Q\2\2\u03d3\u03d4"+
		"\7U\2\2\u03d4\u03d5\7U\2\2\u03d5p\3\2\2\2\u03d6\u03d7\7E\2\2\u03d7\u03d8"+
		"\7W\2\2\u03d8\u03d9\7D\2\2\u03d9\u03da\7G\2\2\u03dar\3\2\2\2\u03db\u03dc"+
		"\7E\2\2\u03dc\u03dd\7W\2\2\u03dd\u03de\7T\2\2\u03de\u03df\7T\2\2\u03df"+
		"\u03e0\7G\2\2\u03e0\u03e1\7P\2\2\u03e1\u03e2\7V\2\2\u03e2t\3\2\2\2\u03e3"+
		"\u03e4\7E\2\2\u03e4\u03e5\7W\2\2\u03e5\u03e6\7T\2\2\u03e6\u03e7\7T\2\2"+
		"\u03e7\u03e8\7G\2\2\u03e8\u03e9\7P\2\2\u03e9\u03ea\7V\2\2\u03ea\u03eb"+
		"\7a\2\2\u03eb\u03ec\7F\2\2\u03ec\u03ed\7C\2\2\u03ed\u03ee\7V\2\2\u03ee"+
		"\u03ef\7G\2\2\u03efv\3\2\2\2\u03f0\u03f1\7E\2\2\u03f1\u03f2\7W\2\2\u03f2"+
		"\u03f3\7T\2\2\u03f3\u03f4\7T\2\2\u03f4\u03f5\7G\2\2\u03f5\u03f6\7P\2\2"+
		"\u03f6\u03f7\7V\2\2\u03f7\u03f8\7a\2\2\u03f8\u03f9\7V\2\2\u03f9\u03fa"+
		"\7K\2\2\u03fa\u03fb\7O\2\2\u03fb\u03fc\7G\2\2\u03fcx\3\2\2\2\u03fd\u03fe"+
		"\7E\2\2\u03fe\u03ff\7W\2\2\u03ff\u0400\7T\2\2\u0400\u0401\7T\2\2\u0401"+
		"\u0402\7G\2\2\u0402\u0403\7P\2\2\u0403\u0404\7V\2\2\u0404\u0405\7a\2\2"+
		"\u0405\u0406\7V\2\2\u0406\u0407\7K\2\2\u0407\u0408\7O\2\2\u0408\u0409"+
		"\7G\2\2\u0409\u040a\7U\2\2\u040a\u040b\7V\2\2\u040b\u040c\7C\2\2\u040c"+
		"\u040d\7O\2\2\u040d\u040e\7R\2\2\u040ez\3\2\2\2\u040f\u0410\7E\2\2\u0410"+
		"\u0411\7W\2\2\u0411\u0412\7T\2\2\u0412\u0413\7T\2\2\u0413\u0414\7G\2\2"+
		"\u0414\u0415\7P\2\2\u0415\u0416\7V\2\2\u0416\u0417\7a\2\2\u0417\u0418"+
		"\7W\2\2\u0418\u0419\7U\2\2\u0419\u041a\7G\2\2\u041a\u041b\7T\2\2\u041b"+
		"|\3\2\2\2\u041c\u041d\7F\2\2\u041d\u041e\7C\2\2\u041e\u041f\7V\2\2\u041f"+
		"\u0420\7C\2\2\u0420~\3\2\2\2\u0421\u0422\7F\2\2\u0422\u0423\7C\2\2\u0423"+
		"\u0424\7V\2\2\u0424\u0425\7C\2\2\u0425\u0426\7D\2\2\u0426\u0427\7C\2\2"+
		"\u0427\u0428\7U\2\2\u0428\u0429\7G\2\2\u0429\u0080\3\2\2\2\u042a\u042b"+
		"\7F\2\2\u042b\u042c\7C\2\2\u042c\u042d\7V\2\2\u042d\u042e\7C\2\2\u042e"+
		"\u042f\7D\2\2\u042f\u0430\7C\2\2\u0430\u0431\7U\2\2\u0431\u0432\7G\2\2"+
		"\u0432\u043b\7U\2\2\u0433\u0434\7U\2\2\u0434\u0435\7E\2\2\u0435\u0436"+
		"\7J\2\2\u0436\u0437\7G\2\2\u0437\u0438\7O\2\2\u0438\u0439\7C\2\2\u0439"+
		"\u043b\7U\2\2\u043a\u042a\3\2\2\2\u043a\u0433\3\2\2\2\u043b\u0082\3\2"+
		"\2\2\u043c\u043d\7F\2\2\u043d\u043e\7C\2\2\u043e\u043f\7[\2\2\u043f\u0084"+
		"\3\2\2\2\u0440\u0441\7F\2\2\u0441\u0442\7D\2\2\u0442\u0443\7R\2\2\u0443"+
		"\u0444\7T\2\2\u0444\u0445\7Q\2\2\u0445\u0446\7R\2\2\u0446\u0447\7G\2\2"+
		"\u0447\u0448\7T\2\2\u0448\u0449\7V\2\2\u0449\u044a\7K\2\2\u044a\u044b"+
		"\7G\2\2\u044b\u044c\7U\2\2\u044c\u0086\3\2\2\2\u044d\u044e\7F\2\2\u044e"+
		"\u044f\7G\2\2\u044f\u0450\7H\2\2\u0450\u0451\7K\2\2\u0451\u0452\7P\2\2"+
		"\u0452\u0453\7G\2\2\u0453\u0454\7F\2\2\u0454\u0088\3\2\2\2\u0455\u0456"+
		"\7F\2\2\u0456\u0457\7G\2\2\u0457\u0458\7N\2\2\u0458\u0459\7G\2\2\u0459"+
		"\u045a\7V\2\2\u045a\u045b\7G\2\2\u045b\u008a\3\2\2\2\u045c\u045d\7F\2"+
		"\2\u045d\u045e\7G\2\2\u045e\u045f\7N\2\2\u045f\u0460\7K\2\2\u0460\u0461"+
		"\7O\2\2\u0461\u0462\7K\2\2\u0462\u0463\7V\2\2\u0463\u0464\7G\2\2\u0464"+
		"\u0465\7F\2\2\u0465\u008c\3\2\2\2\u0466\u0467\7F\2\2\u0467\u0468\7G\2"+
		"\2\u0468\u0469\7N\2\2\u0469\u046a\7V\2\2\u046a\u046b\7C\2\2\u046b\u008e"+
		"\3\2\2\2\u046c\u046d\7F\2\2\u046d\u046e\7G\2\2\u046e\u046f\7U\2\2\u046f"+
		"\u0470\7E\2\2\u0470\u0090\3\2\2\2\u0471\u0472\7F\2\2\u0472\u0473\7G\2"+
		"\2\u0473\u0474\7U\2\2\u0474\u0475\7E\2\2\u0475\u0476\7T\2\2\u0476\u0477"+
		"\7K\2\2\u0477\u0478\7D\2\2\u0478\u0479\7G\2\2\u0479\u0092\3\2\2\2\u047a"+
		"\u047b\7F\2\2\u047b\u047c\7G\2\2\u047c\u047d\7V\2\2\u047d\u047e\7C\2\2"+
		"\u047e\u047f\7K\2\2\u047f\u0480\7N\2\2\u0480\u0094\3\2\2\2\u0481\u0482"+
		"\7F\2\2\u0482\u0483\7H\2\2\u0483\u0484\7U\2\2\u0484\u0096\3\2\2\2\u0485"+
		"\u0486\7F\2\2\u0486\u0487\7K\2\2\u0487\u0488\7T\2\2\u0488\u0489\7G\2\2"+
		"\u0489\u048a\7E\2\2\u048a\u048b\7V\2\2\u048b\u048c\7Q\2\2\u048c\u048d"+
		"\7T\2\2\u048d\u048e\7K\2\2\u048e\u048f\7G\2\2\u048f\u0490\7U\2\2\u0490"+
		"\u0098\3\2\2\2\u0491\u0492\7F\2\2\u0492\u0493\7K\2\2\u0493\u0494\7T\2"+
		"\2\u0494\u0495\7G\2\2\u0495\u0496\7E\2\2\u0496\u0497\7V\2\2\u0497\u0498"+
		"\7Q\2\2\u0498\u0499\7T\2\2\u0499\u049a\7[\2\2\u049a\u009a\3\2\2\2\u049b"+
		"\u049c\7F\2\2\u049c\u049d\7K\2\2\u049d\u049e\7U\2\2\u049e\u049f\7V\2\2"+
		"\u049f\u04a0\7K\2\2\u04a0\u04a1\7P\2\2\u04a1\u04a2\7E\2\2\u04a2\u04a3"+
		"\7V\2\2\u04a3\u009c\3\2\2\2\u04a4\u04a5\7F\2\2\u04a5\u04a6\7K\2\2\u04a6"+
		"\u04a7\7U\2\2\u04a7\u04a8\7V\2\2\u04a8\u04a9\7T\2\2\u04a9\u04aa\7K\2\2"+
		"\u04aa\u04ab\7D\2\2\u04ab\u04ac\7W\2\2\u04ac\u04ad\7V\2\2\u04ad\u04ae"+
		"\7G\2\2\u04ae\u009e\3\2\2\2\u04af\u04b0\7F\2\2\u04b0\u04b1\7K\2\2\u04b1"+
		"\u04b2\7X\2\2\u04b2\u00a0\3\2\2\2\u04b3\u04b4\7F\2\2\u04b4\u04b5\7T\2"+
		"\2\u04b5\u04b6\7Q\2\2\u04b6\u04b7\7R\2\2\u04b7\u00a2\3\2\2\2\u04b8\u04b9"+
		"\7F\2\2\u04b9\u04ba\7T\2\2\u04ba\u04bb\7[\2\2\u04bb\u00a4\3\2\2\2\u04bc"+
		"\u04bd\7G\2\2\u04bd\u04be\7N\2\2\u04be\u04bf\7U\2\2\u04bf\u04c0\7G\2\2"+
		"\u04c0\u00a6\3\2\2\2\u04c1\u04c2\7G\2\2\u04c2\u04c3\7P\2\2\u04c3\u04c4"+
		"\7F\2\2\u04c4\u00a8\3\2\2\2\u04c5\u04c6\7G\2\2\u04c6\u04c7\7U\2\2\u04c7"+
		"\u04c8\7E\2\2\u04c8\u04c9\7C\2\2\u04c9\u04ca\7R\2\2\u04ca\u04cb\7G\2\2"+
		"\u04cb\u00aa\3\2\2\2\u04cc\u04cd\7G\2\2\u04cd\u04ce\7U\2\2\u04ce\u04cf"+
		"\7E\2\2\u04cf\u04d0\7C\2\2\u04d0\u04d1\7R\2\2\u04d1\u04d2\7G\2\2\u04d2"+
		"\u04d3\7F\2\2\u04d3\u00ac\3\2\2\2\u04d4\u04d5\7G\2\2\u04d5\u04d6\7Z\2"+
		"\2\u04d6\u04d7\7E\2\2\u04d7\u04d8\7G\2\2\u04d8\u04d9\7R\2\2\u04d9\u04da"+
		"\7V\2\2\u04da\u00ae\3\2\2\2\u04db\u04dc\7G\2\2\u04dc\u04dd\7Z\2\2\u04dd"+
		"\u04de\7E\2\2\u04de\u04df\7J\2\2\u04df\u04e0\7C\2\2\u04e0\u04e1\7P\2\2"+
		"\u04e1\u04e2\7I\2\2\u04e2\u04e3\7G\2\2\u04e3\u00b0\3\2\2\2\u04e4\u04e5"+
		"\7G\2\2\u04e5\u04e6\7Z\2\2\u04e6\u04e7\7K\2\2\u04e7\u04e8\7U\2\2\u04e8"+
		"\u04e9\7V\2\2\u04e9\u04ea\7U\2\2\u04ea\u00b2\3\2\2\2\u04eb\u04ec\7G\2"+
		"\2\u04ec\u04ed\7Z\2\2\u04ed\u04ee\7R\2\2\u04ee\u04ef\7N\2\2\u04ef\u04f0"+
		"\7C\2\2\u04f0\u04f1\7K\2\2\u04f1\u04f2\7P\2\2\u04f2\u00b4\3\2\2\2\u04f3"+
		"\u04f4\7G\2\2\u04f4\u04f5\7Z\2\2\u04f5\u04f6\7R\2\2\u04f6\u04f7\7Q\2\2"+
		"\u04f7\u04f8\7T\2\2\u04f8\u04f9\7V\2\2\u04f9\u00b6\3\2\2\2\u04fa\u04fb"+
		"\7G\2\2\u04fb\u04fc\7Z\2\2\u04fc\u04fd\7V\2\2\u04fd\u04fe\7G\2\2\u04fe"+
		"\u04ff\7P\2\2\u04ff\u0500\7F\2\2\u0500\u0501\7G\2\2\u0501\u0502\7F\2\2"+
		"\u0502\u00b8\3\2\2\2\u0503\u0504\7G\2\2\u0504\u0505\7Z\2\2\u0505\u0506"+
		"\7V\2\2\u0506\u0507\7G\2\2\u0507\u0508\7T\2\2\u0508\u0509\7P\2\2\u0509"+
		"\u050a\7C\2\2\u050a\u050b\7N\2\2\u050b\u00ba\3\2\2\2\u050c\u050d\7G\2"+
		"\2\u050d\u050e\7Z\2\2\u050e\u050f\7V\2\2\u050f\u0510\7T\2\2\u0510\u0511"+
		"\7C\2\2\u0511\u0512\7E\2\2\u0512\u0513\7V\2\2\u0513\u00bc\3\2\2\2\u0514"+
		"\u0515\7H\2\2\u0515\u0516\7C\2\2\u0516\u0517\7N\2\2\u0517\u0518\7U\2\2"+
		"\u0518\u0519\7G\2\2\u0519\u00be\3\2\2\2\u051a\u051b\7H\2\2\u051b\u051c"+
		"\7G\2\2\u051c\u051d\7V\2\2\u051d\u051e\7E\2\2\u051e\u051f\7J\2\2\u051f"+
		"\u00c0\3\2\2\2\u0520\u0521\7H\2\2\u0521\u0522\7K\2\2\u0522\u0523\7G\2"+
		"\2\u0523\u0524\7N\2\2\u0524\u0525\7F\2\2\u0525\u0526\7U\2\2\u0526\u00c2"+
		"\3\2\2\2\u0527\u0528\7H\2\2\u0528\u0529\7K\2\2\u0529\u052a\7N\2\2\u052a"+
		"\u052b\7V\2\2\u052b\u052c\7G\2\2\u052c\u052d\7T\2\2\u052d\u00c4\3\2\2"+
		"\2\u052e\u052f\7H\2\2\u052f\u0530\7K\2\2\u0530\u0531\7N\2\2\u0531\u0532"+
		"\7G\2\2\u0532\u0533\7H\2\2\u0533\u0534\7Q\2\2\u0534\u0535\7T\2\2\u0535"+
		"\u0536\7O\2\2\u0536\u0537\7C\2\2\u0537\u0538\7V\2\2\u0538\u00c6\3\2\2"+
		"\2\u0539\u053a\7H\2\2\u053a\u053b\7K\2\2\u053b\u053c\7T\2\2\u053c\u053d"+
		"\7U\2\2\u053d\u053e\7V\2\2\u053e\u00c8\3\2\2\2\u053f\u0540\7H\2\2\u0540"+
		"\u0541\7Q\2\2\u0541\u0542\7N\2\2\u0542\u0543\7N\2\2\u0543\u0544\7Q\2\2"+
		"\u0544\u0545\7Y\2\2\u0545\u0546\7K\2\2\u0546\u0547\7P\2\2\u0547\u0548"+
		"\7I\2\2\u0548\u00ca\3\2\2\2\u0549\u054a\7H\2\2\u054a\u054b\7Q\2\2\u054b"+
		"\u054c\7T\2\2\u054c\u00cc\3\2\2\2\u054d\u054e\7H\2\2\u054e\u054f\7Q\2"+
		"\2\u054f\u0550\7T\2\2\u0550\u0551\7G\2\2\u0551\u0552\7K\2\2\u0552\u0553"+
		"\7I\2\2\u0553\u0554\7P\2\2\u0554\u00ce\3\2\2\2\u0555\u0556\7H\2\2\u0556"+
		"\u0557\7Q\2\2\u0557\u0558\7T\2\2\u0558\u0559\7O\2\2\u0559\u055a\7C\2\2"+
		"\u055a\u055b\7V\2\2\u055b\u00d0\3\2\2\2\u055c\u055d\7H\2\2\u055d\u055e"+
		"\7Q\2\2\u055e\u055f\7T\2\2\u055f\u0560\7O\2\2\u0560\u0561\7C\2\2\u0561"+
		"\u0562\7V\2\2\u0562\u0563\7V\2\2\u0563\u0564\7G\2\2\u0564\u0565\7F\2\2"+
		"\u0565\u00d2\3\2\2\2\u0566\u0567\7H\2\2\u0567\u0568\7T\2\2\u0568\u0569"+
		"\7Q\2\2\u0569\u056a\7O\2\2\u056a\u00d4\3\2\2\2\u056b\u056c\7H\2\2\u056c"+
		"\u056d\7W\2\2\u056d\u056e\7N\2\2\u056e\u056f\7N\2\2\u056f\u00d6\3\2\2"+
		"\2\u0570\u0571\7H\2\2\u0571\u0572\7W\2\2\u0572\u0573\7P\2\2\u0573\u0574"+
		"\7E\2\2\u0574\u0575\7V\2\2\u0575\u0576\7K\2\2\u0576\u0577\7Q\2\2\u0577"+
		"\u0578\7P\2\2\u0578\u00d8\3\2\2\2\u0579\u057a\7H\2\2\u057a\u057b\7W\2"+
		"\2\u057b\u057c\7P\2\2\u057c\u057d\7E\2\2\u057d\u057e\7V\2\2\u057e\u057f"+
		"\7K\2\2\u057f\u0580\7Q\2\2\u0580\u0581\7P\2\2\u0581\u0582\7U\2\2\u0582"+
		"\u00da\3\2\2\2\u0583\u0584\7I\2\2\u0584\u0585\7N\2\2\u0585\u0586\7Q\2"+
		"\2\u0586\u0587\7D\2\2\u0587\u0588\7C\2\2\u0588\u0589\7N\2\2\u0589\u00dc"+
		"\3\2\2\2\u058a\u058b\7I\2\2\u058b\u058c\7T\2\2\u058c\u058d\7C\2\2\u058d"+
		"\u058e\7P\2\2\u058e\u058f\7V\2\2\u058f\u00de\3\2\2\2\u0590\u0591\7I\2"+
		"\2\u0591\u0592\7T\2\2\u0592\u0593\7Q\2\2\u0593\u0594\7W\2\2\u0594\u0595"+
		"\7R\2\2\u0595\u00e0\3\2\2\2\u0596\u0597\7I\2\2\u0597\u0598\7T\2\2\u0598"+
		"\u0599\7Q\2\2\u0599\u059a\7W\2\2\u059a\u059b\7R\2\2\u059b\u059c\7K\2\2"+
		"\u059c\u059d\7P\2\2\u059d\u059e\7I\2\2\u059e\u00e2\3\2\2\2\u059f\u05a0"+
		"\7J\2\2\u05a0\u05a1\7C\2\2\u05a1\u05a2\7X\2\2\u05a2\u05a3\7K\2\2\u05a3"+
		"\u05a4\7P\2\2\u05a4\u05a5\7I\2\2\u05a5\u00e4\3\2\2\2\u05a6\u05a7\7J\2"+
		"\2\u05a7\u05a8\7Q\2\2\u05a8\u05a9\7W\2\2\u05a9\u05aa\7T\2\2\u05aa\u00e6"+
		"\3\2\2\2\u05ab\u05ac\7J\2\2\u05ac\u05ad\7Q\2\2\u05ad\u05ae\7W\2\2\u05ae"+
		"\u05af\7T\2\2\u05af\u05b0\7U\2\2\u05b0\u00e8\3\2\2\2\u05b1\u05b2\7J\2"+
		"\2\u05b2\u05b3\7K\2\2\u05b3\u05b4\7U\2\2\u05b4\u05b5\7V\2\2\u05b5\u05b6"+
		"\7Q\2\2\u05b6\u05b7\7T\2\2\u05b7\u05b8\7[\2\2\u05b8\u00ea\3\2\2\2\u05b9"+
		"\u05ba\7K\2\2\u05ba\u05bb\7H\2\2\u05bb\u00ec\3\2\2\2\u05bc\u05bd\7K\2"+
		"\2\u05bd\u05be\7I\2\2\u05be\u05bf\7P\2\2\u05bf\u05c0\7Q\2\2\u05c0\u05c1"+
		"\7T\2\2\u05c1\u05c2\7G\2\2\u05c2\u00ee\3\2\2\2\u05c3\u05c4\7K\2\2\u05c4"+
		"\u05c5\7O\2\2\u05c5\u05c6\7R\2\2\u05c6\u05c7\7Q\2\2\u05c7\u05c8\7T\2\2"+
		"\u05c8\u05c9\7V\2\2\u05c9\u00f0\3\2\2\2\u05ca\u05cb\7K\2\2\u05cb\u05cc"+
		"\7P\2\2\u05cc\u00f2\3\2\2\2\u05cd\u05ce\7K\2\2\u05ce\u05cf\7P\2\2\u05cf"+
		"\u05d0\7F\2\2\u05d0\u05d1\7G\2\2\u05d1\u05d2\7Z\2\2\u05d2\u00f4\3\2\2"+
		"\2\u05d3\u05d4\7K\2\2\u05d4\u05d5\7P\2\2\u05d5\u05d6\7F\2\2\u05d6\u05d7"+
		"\7G\2\2\u05d7\u05d8\7Z\2\2\u05d8\u05d9\7G\2\2\u05d9\u05da\7U\2\2\u05da"+
		"\u00f6\3\2\2\2\u05db\u05dc\7K\2\2\u05dc\u05dd\7P\2\2\u05dd\u05de\7P\2"+
		"\2\u05de\u05df\7G\2\2\u05df\u05e0\7T\2\2\u05e0\u00f8\3\2\2\2\u05e1\u05e2"+
		"\7K\2\2\u05e2\u05e3\7P\2\2\u05e3\u05e4\7R\2\2\u05e4\u05e5\7C\2\2\u05e5"+
		"\u05e6\7V\2\2\u05e6\u05e7\7J\2\2\u05e7\u00fa\3\2\2\2\u05e8\u05e9\7K\2"+
		"\2\u05e9\u05ea\7P\2\2\u05ea\u05eb\7R\2\2\u05eb\u05ec\7W\2\2\u05ec\u05ed"+
		"\7V\2\2\u05ed\u05ee\7H\2\2\u05ee\u05ef\7Q\2\2\u05ef\u05f0\7T\2\2\u05f0"+
		"\u05f1\7O\2\2\u05f1\u05f2\7C\2\2\u05f2\u05f3\7V\2\2\u05f3\u00fc\3\2\2"+
		"\2\u05f4\u05f5\7K\2\2\u05f5\u05f6\7P\2\2\u05f6\u05f7\7U\2\2\u05f7\u05f8"+
		"\7G\2\2\u05f8\u05f9\7T\2\2\u05f9\u05fa\7V\2\2\u05fa\u00fe\3\2\2\2\u05fb"+
		"\u05fc\7K\2\2\u05fc\u05fd\7P\2\2\u05fd\u05fe\7V\2\2\u05fe\u05ff\7G\2\2"+
		"\u05ff\u0600\7T\2\2\u0600\u0601\7U\2\2\u0601\u0602\7G\2\2\u0602\u0603"+
		"\7E\2\2\u0603\u0604\7V\2\2\u0604\u0100\3\2\2\2\u0605\u0606\7K\2\2\u0606"+
		"\u0607\7P\2\2\u0607\u0608\7V\2\2\u0608\u0609\7G\2\2\u0609\u060a\7T\2\2"+
		"\u060a\u060b\7X\2\2\u060b\u060c\7C\2\2\u060c\u060d\7N\2\2\u060d\u0102"+
		"\3\2\2\2\u060e\u060f\7K\2\2\u060f\u0610\7P\2\2\u0610\u0611\7V\2\2\u0611"+
		"\u0612\7Q\2\2\u0612\u0104\3\2\2\2\u0613\u0614\7K\2\2\u0614\u0615\7U\2"+
		"\2\u0615\u0106\3\2\2\2\u0616\u0617\7K\2\2\u0617\u0618\7V\2\2\u0618\u0619"+
		"\7G\2\2\u0619\u061a\7O\2\2\u061a\u061b\7U\2\2\u061b\u0108\3\2\2\2\u061c"+
		"\u061d\7L\2\2\u061d\u061e\7Q\2\2\u061e\u061f\7K\2\2\u061f\u0620\7P\2\2"+
		"\u0620\u010a\3\2\2\2\u0621\u0622\7M\2\2\u0622\u0623\7G\2\2\u0623\u0624"+
		"\7[\2\2\u0624\u0625\7U\2\2\u0625\u010c\3\2\2\2\u0626\u0627\7N\2\2\u0627"+
		"\u0628\7C\2\2\u0628\u0629\7U\2\2\u0629\u062a\7V\2\2\u062a\u010e\3\2\2"+
		"\2\u062b\u062c\7N\2\2\u062c\u062d\7C\2\2\u062d\u062e\7V\2\2\u062e\u062f"+
		"\7G\2\2\u062f\u0630\7T\2\2\u0630\u0631\7C\2\2\u0631\u0632\7N\2\2\u0632"+
		"\u0110\3\2\2\2\u0633\u0634\7N\2\2\u0634\u0635\7C\2\2\u0635\u0636\7\\\2"+
		"\2\u0636\u0637\7[\2\2\u0637\u0112\3\2\2\2\u0638\u0639\7N\2\2\u0639\u063a"+
		"\7G\2\2\u063a\u063b\7C\2\2\u063b\u063c\7F\2\2\u063c\u063d\7K\2\2\u063d"+
		"\u063e\7P\2\2\u063e\u063f\7I\2\2\u063f\u0114\3\2\2\2\u0640\u0641\7N\2"+
		"\2\u0641\u0642\7G\2\2\u0642\u0643\7H\2\2\u0643\u0644\7V\2\2\u0644\u0116"+
		"\3\2\2\2\u0645\u0646\7N\2\2\u0646\u0647\7K\2\2\u0647\u0648\7M\2\2\u0648"+
		"\u0649\7G\2\2\u0649\u0118\3\2\2\2\u064a\u064b\7N\2\2\u064b\u064c\7K\2"+
		"\2\u064c\u064d\7O\2\2\u064d\u064e\7K\2\2\u064e\u064f\7V\2\2\u064f\u011a"+
		"\3\2\2\2\u0650\u0651\7N\2\2\u0651\u0652\7K\2\2\u0652\u0653\7P\2\2\u0653"+
		"\u0654\7G\2\2\u0654\u0655\7U\2\2\u0655\u011c\3\2\2\2\u0656\u0657\7N\2"+
		"\2\u0657\u0658\7K\2\2\u0658\u0659\7U\2\2\u0659\u065a\7V\2\2\u065a\u011e"+
		"\3\2\2\2\u065b\u065c\7N\2\2\u065c\u065d\7K\2\2\u065d\u065e\7H\2\2\u065e"+
		"\u065f\7G\2\2\u065f\u0660\7E\2\2\u0660\u0661\7[\2\2\u0661\u0662\7E\2\2"+
		"\u0662\u0663\7N\2\2\u0663\u0664\7G\2\2\u0664\u0120\3\2\2\2\u0665\u0666"+
		"\7N\2\2\u0666\u0667\7Q\2\2\u0667\u0668\7C\2\2\u0668\u0669\7F\2\2\u0669"+
		"\u0122\3\2\2\2\u066a\u066b\7N\2\2\u066b\u066c\7Q\2\2\u066c\u066d\7E\2"+
		"\2\u066d\u066e\7C\2\2\u066e\u066f\7N\2\2\u066f\u0124\3\2\2\2\u0670\u0671"+
		"\7N\2\2\u0671\u0672\7Q\2\2\u0672\u0673\7E\2\2\u0673\u0674\7C\2\2\u0674"+
		"\u0675\7V\2\2\u0675\u0676\7K\2\2\u0676\u0677\7Q\2\2\u0677\u0678\7P\2\2"+
		"\u0678\u0126\3\2\2\2\u0679\u067a\7N\2\2\u067a\u067b\7Q\2\2\u067b\u067c"+
		"\7E\2\2\u067c\u067d\7M\2\2\u067d\u0128\3\2\2\2\u067e\u067f\7N\2\2\u067f"+
		"\u0680\7Q\2\2\u0680\u0681\7E\2\2\u0681\u0682\7M\2\2\u0682\u0683\7U\2\2"+
		"\u0683\u012a\3\2\2\2\u0684\u0685\7N\2\2\u0685\u0686\7Q\2\2\u0686\u0687"+
		"\7I\2\2\u0687\u0688\7K\2\2\u0688\u0689\7E\2\2\u0689\u068a\7C\2\2\u068a"+
		"\u068b\7N\2\2\u068b\u012c\3\2\2\2\u068c\u068d\7O\2\2\u068d\u068e\7C\2"+
		"\2\u068e\u068f\7E\2\2\u068f\u0690\7T\2\2\u0690\u0691\7Q\2\2\u0691\u012e"+
		"\3\2\2\2\u0692\u0693\7O\2\2\u0693\u0694\7C\2\2\u0694\u0695\7R\2\2\u0695"+
		"\u0130\3\2\2\2\u0696\u0697\7O\2\2\u0697\u0698\7C\2\2\u0698\u0699\7V\2"+
		"\2\u0699\u069a\7E\2\2\u069a\u069b\7J\2\2\u069b\u069c\7G\2\2\u069c\u069d"+
		"\7F\2\2\u069d\u0132\3\2\2\2\u069e\u069f\7O\2\2\u069f\u06a0\7G\2\2\u06a0"+
		"\u06a1\7T\2\2\u06a1\u06a2\7I\2\2\u06a2\u06a3\7G\2\2\u06a3\u0134\3\2\2"+
		"\2\u06a4\u06a5\7O\2\2\u06a5\u06a6\7K\2\2\u06a6\u06a7\7P\2\2\u06a7\u06a8"+
		"\7W\2\2\u06a8\u06a9\7V\2\2\u06a9\u06aa\7G\2\2\u06aa\u0136\3\2\2\2\u06ab"+
		"\u06ac\7O\2\2\u06ac\u06ad\7Q\2\2\u06ad\u06ae\7P\2\2\u06ae\u06af\7V\2\2"+
		"\u06af\u06b0\7J\2\2\u06b0\u0138\3\2\2\2\u06b1\u06b2\7O\2\2\u06b2\u06b3"+
		"\7U\2\2\u06b3\u06b4\7E\2\2\u06b4\u06b5\7M\2\2\u06b5\u013a\3\2\2\2\u06b6"+
		"\u06b7\7P\2\2\u06b7\u06b8\7C\2\2\u06b8\u06b9\7O\2\2\u06b9\u06ba\7G\2\2"+
		"\u06ba\u06bb\7U\2\2\u06bb\u06bc\7R\2\2\u06bc\u06bd\7C\2\2\u06bd\u06be"+
		"\7E\2\2\u06be\u06bf\7G\2\2\u06bf\u013c\3\2\2\2\u06c0\u06c1\7P\2\2\u06c1"+
		"\u06c2\7C\2\2\u06c2\u06c3\7O\2\2\u06c3\u06c4\7G\2\2\u06c4\u06c5\7U\2\2"+
		"\u06c5\u06c6\7R\2\2\u06c6\u06c7\7C\2\2\u06c7\u06c8\7E\2\2\u06c8\u06c9"+
		"\7G\2\2\u06c9\u06ca\7U\2\2\u06ca\u013e\3\2\2\2\u06cb\u06cc\7P\2\2\u06cc"+
		"\u06cd\7C\2\2\u06cd\u06ce\7V\2\2\u06ce\u06cf\7W\2\2\u06cf\u06d0\7T\2\2"+
		"\u06d0\u06d1\7C\2\2\u06d1\u06d2\7N\2\2\u06d2\u0140\3\2\2\2\u06d3\u06d4"+
		"\7P\2\2\u06d4\u06d5\7Q\2\2\u06d5\u0142\3\2\2\2\u06d6\u06d7\7P\2\2\u06d7"+
		"\u06d8\7Q\2\2\u06d8\u06db\7V\2\2\u06d9\u06db\7#\2\2\u06da\u06d6\3\2\2"+
		"\2\u06da\u06d9\3\2\2\2\u06db\u0144\3\2\2\2\u06dc\u06dd\7P\2\2\u06dd\u06de"+
		"\7W\2\2\u06de\u06df\7N\2\2\u06df\u06e0\7N\2\2\u06e0\u0146\3\2\2\2\u06e1"+
		"\u06e2\7P\2\2\u06e2\u06e3\7W\2\2\u06e3\u06e4\7N\2\2\u06e4\u06e5\7N\2\2"+
		"\u06e5\u06e6\7U\2\2\u06e6\u0148\3\2\2\2\u06e7\u06e8\7Q\2\2\u06e8\u06e9"+
		"\7H\2\2\u06e9\u014a\3\2\2\2\u06ea\u06eb\7Q\2\2\u06eb\u06ec\7P\2\2\u06ec"+
		"\u014c\3\2\2\2\u06ed\u06ee\7Q\2\2\u06ee\u06ef\7P\2\2\u06ef\u06f0\7N\2"+
		"\2\u06f0\u06f1\7[\2\2\u06f1\u014e\3\2\2\2\u06f2\u06f3\7Q\2\2\u06f3\u06f4"+
		"\7R\2\2\u06f4\u06f5\7V\2\2\u06f5\u06f6\7K\2\2\u06f6\u06f7\7Q\2\2\u06f7"+
		"\u06f8\7P\2\2\u06f8\u0150\3\2\2\2\u06f9\u06fa\7Q\2\2\u06fa\u06fb\7R\2"+
		"\2\u06fb\u06fc\7V\2\2\u06fc\u06fd\7K\2\2\u06fd\u06fe\7Q\2\2\u06fe\u06ff"+
		"\7P\2\2\u06ff\u0700\7U\2\2\u0700\u0152\3\2\2\2\u0701\u0702\7Q\2\2\u0702"+
		"\u0703\7T\2\2\u0703\u0154\3\2\2\2\u0704\u0705\7Q\2\2\u0705\u0706\7T\2"+
		"\2\u0706\u0707\7F\2\2\u0707\u0708\7G\2\2\u0708\u0709\7T\2\2\u0709\u0156"+
		"\3\2\2\2\u070a\u070b\7Q\2\2\u070b\u070c\7W\2\2\u070c\u070d\7V\2\2\u070d"+
		"\u0158\3\2\2\2\u070e\u070f\7Q\2\2\u070f\u0710\7W\2\2\u0710\u0711\7V\2"+
		"\2\u0711\u0712\7G\2\2\u0712\u0713\7T\2\2\u0713\u015a\3\2\2\2\u0714\u0715"+
		"\7Q\2\2\u0715\u0716\7W\2\2\u0716\u0717\7V\2\2\u0717\u0718\7R\2\2\u0718"+
		"\u0719\7W\2\2\u0719\u071a\7V\2\2\u071a\u071b\7H\2\2\u071b\u071c\7Q\2\2"+
		"\u071c\u071d\7T\2\2\u071d\u071e\7O\2\2\u071e\u071f\7C\2\2\u071f\u0720"+
		"\7V\2\2\u0720\u015c\3\2\2\2\u0721\u0722\7Q\2\2\u0722\u0723\7X\2\2\u0723"+
		"\u0724\7G\2\2\u0724\u0725\7T\2\2\u0725\u015e\3\2\2\2\u0726\u0727\7Q\2"+
		"\2\u0727\u0728\7X\2\2\u0728\u0729\7G\2\2\u0729\u072a\7T\2\2\u072a\u072b"+
		"\7N\2\2\u072b\u072c\7C\2\2\u072c\u072d\7R\2\2\u072d\u072e\7U\2\2\u072e"+
		"\u0160\3\2\2\2\u072f\u0730\7Q\2\2\u0730\u0731\7X\2\2\u0731\u0732\7G\2"+
		"\2\u0732\u0733\7T\2\2\u0733\u0734\7N\2\2\u0734\u0735\7C\2\2\u0735\u0736"+
		"\7[\2\2\u0736\u0162\3\2\2\2\u0737\u0738\7Q\2\2\u0738\u0739\7X\2\2\u0739"+
		"\u073a\7G\2\2\u073a\u073b\7T\2\2\u073b\u073c\7Y\2\2\u073c\u073d\7T\2\2"+
		"\u073d\u073e\7K\2\2\u073e\u073f\7V\2\2\u073f\u0740\7G\2\2\u0740\u0164"+
		"\3\2\2\2\u0741\u0742\7R\2\2\u0742\u0743\7C\2\2\u0743\u0744\7T\2\2\u0744"+
		"\u0745\7V\2\2\u0745\u0746\7K\2\2\u0746\u0747\7V\2\2\u0747\u0748\7K\2\2"+
		"\u0748\u0749\7Q\2\2\u0749\u074a\7P\2\2\u074a\u0166\3\2\2\2\u074b\u074c"+
		"\7R\2\2\u074c\u074d\7C\2\2\u074d\u074e\7T\2\2\u074e\u074f\7V\2\2\u074f"+
		"\u0750\7K\2\2\u0750\u0751\7V\2\2\u0751\u0752\7K\2\2\u0752\u0753\7Q\2\2"+
		"\u0753\u0754\7P\2\2\u0754\u0755\7G\2\2\u0755\u0756\7F\2\2\u0756\u0168"+
		"\3\2\2\2\u0757\u0758\7R\2\2\u0758\u0759\7C\2\2\u0759\u075a\7T\2\2\u075a"+
		"\u075b\7V\2\2\u075b\u075c\7K\2\2\u075c\u075d\7V\2\2\u075d\u075e\7K\2\2"+
		"\u075e\u075f\7Q\2\2\u075f\u0760\7P\2\2\u0760\u0761\7U\2\2\u0761\u016a"+
		"\3\2\2\2\u0762\u0763\7R\2\2\u0763\u0764\7C\2\2\u0764\u0765\7T\2\2\u0765"+
		"\u0766\7S\2\2\u0766\u0767\7W\2\2\u0767\u0768\7G\2\2\u0768\u0769\7V\2\2"+
		"\u0769\u016c\3\2\2\2\u076a\u076b\7R\2\2\u076b\u076c\7G\2\2\u076c\u076d"+
		"\7T\2\2\u076d\u076e\7E\2\2\u076e\u076f\7G\2\2\u076f\u0770\7P\2\2\u0770"+
		"\u0771\7V\2\2\u0771\u016e\3\2\2\2\u0772\u0773\7R\2\2\u0773\u0774\7K\2"+
		"\2\u0774\u0775\7X\2\2\u0775\u0776\7Q\2\2\u0776\u0777\7V\2\2\u0777\u0170"+
		"\3\2\2\2\u0778\u0779\7R\2\2\u0779\u077a\7N\2\2\u077a\u077b\7C\2\2\u077b"+
		"\u077c\7E\2\2\u077c\u077d\7K\2\2\u077d\u077e\7P\2\2\u077e\u077f\7I\2\2"+
		"\u077f\u0172\3\2\2\2\u0780\u0781\7R\2\2\u0781\u0782\7Q\2\2\u0782\u0783"+
		"\7U\2\2\u0783\u0784\7K\2\2\u0784\u0785\7V\2\2\u0785\u0786\7K\2\2\u0786"+
		"\u0787\7Q\2\2\u0787\u0788\7P\2\2\u0788\u0174\3\2\2\2\u0789\u078a\7R\2"+
		"\2\u078a\u078b\7T\2\2\u078b\u078c\7G\2\2\u078c\u078d\7E\2\2\u078d\u078e"+
		"\7G\2\2\u078e\u078f\7F\2\2\u078f\u0790\7K\2\2\u0790\u0791\7P\2\2\u0791"+
		"\u0792\7I\2\2\u0792\u0176\3\2\2\2\u0793\u0794\7R\2\2\u0794\u0795\7T\2"+
		"\2\u0795\u0796\7K\2\2\u0796\u0797\7O\2\2\u0797\u0798\7C\2\2\u0798\u0799"+
		"\7T\2\2\u0799\u079a\7[\2\2\u079a\u0178\3\2\2\2\u079b\u079c\7R\2\2\u079c"+
		"\u079d\7T\2\2\u079d\u079e\7K\2\2\u079e\u079f\7P\2\2\u079f\u07a0\7E\2\2"+
		"\u07a0\u07a1\7K\2\2\u07a1\u07a2\7R\2\2\u07a2\u07a3\7C\2\2\u07a3\u07a4"+
		"\7N\2\2\u07a4\u07a5\7U\2\2\u07a5\u017a\3\2\2\2\u07a6\u07a7\7R\2\2\u07a7"+
		"\u07a8\7T\2\2\u07a8\u07a9\7Q\2\2\u07a9\u07aa\7R\2\2\u07aa\u07ab\7G\2\2"+
		"\u07ab\u07ac\7T\2\2\u07ac\u07ad\7V\2\2\u07ad\u07ae\7K\2\2\u07ae\u07af"+
		"\7G\2\2\u07af\u07b0\7U\2\2\u07b0\u017c\3\2\2\2\u07b1\u07b2\7R\2\2\u07b2"+
		"\u07b3\7W\2\2\u07b3\u07b4\7T\2\2\u07b4\u07b5\7I\2\2\u07b5\u07b6\7G\2\2"+
		"\u07b6\u017e\3\2\2\2\u07b7\u07b8\7S\2\2\u07b8\u07b9\7W\2\2\u07b9\u07ba"+
		"\7G\2\2\u07ba\u07bb\7T\2\2\u07bb\u07bc\7[\2\2\u07bc\u0180\3\2\2\2\u07bd"+
		"\u07be\7T\2\2\u07be\u07bf\7C\2\2\u07bf\u07c0\7P\2\2\u07c0\u07c1\7I\2\2"+
		"\u07c1\u07c2\7G\2\2\u07c2\u0182\3\2\2\2\u07c3\u07c4\7T\2\2\u07c4\u07c5"+
		"\7G\2\2\u07c5\u07c6\7E\2\2\u07c6\u07c7\7Q\2\2\u07c7\u07c8\7T\2\2\u07c8"+
		"\u07c9\7F\2\2\u07c9\u07ca\7T\2\2\u07ca\u07cb\7G\2\2\u07cb\u07cc\7C\2\2"+
		"\u07cc\u07cd\7F\2\2\u07cd\u07ce\7G\2\2\u07ce\u07cf\7T\2\2\u07cf\u0184"+
		"\3\2\2\2\u07d0\u07d1\7T\2\2\u07d1\u07d2\7G\2\2\u07d2\u07d3\7E\2\2\u07d3"+
		"\u07d4\7Q\2\2\u07d4\u07d5\7T\2\2\u07d5\u07d6\7F\2\2\u07d6\u07d7\7Y\2\2"+
		"\u07d7\u07d8\7T\2\2\u07d8\u07d9\7K\2\2\u07d9\u07da\7V\2\2\u07da\u07db"+
		"\7G\2\2\u07db\u07dc\7T\2\2\u07dc\u0186\3\2\2\2\u07dd\u07de\7T\2\2\u07de"+
		"\u07df\7G\2\2\u07df\u07e0\7E\2\2\u07e0\u07e1\7Q\2\2\u07e1\u07e2\7X\2\2"+
		"\u07e2\u07e3\7G\2\2\u07e3\u07e4\7T\2\2\u07e4\u0188\3\2\2\2\u07e5\u07e6"+
		"\7T\2\2\u07e6\u07e7\7G\2\2\u07e7\u07e8\7F\2\2\u07e8\u07e9\7W\2\2\u07e9"+
		"\u07ea\7E\2\2\u07ea\u07eb\7G\2\2\u07eb\u018a\3\2\2\2\u07ec\u07ed\7T\2"+
		"\2\u07ed\u07ee\7G\2\2\u07ee\u07ef\7H\2\2\u07ef\u07f0\7G\2\2\u07f0\u07f1"+
		"\7T\2\2\u07f1\u07f2\7G\2\2\u07f2\u07f3\7P\2\2\u07f3\u07f4\7E\2\2\u07f4"+
		"\u07f5\7G\2\2\u07f5\u07f6\7U\2\2\u07f6\u018c\3\2\2\2\u07f7\u07f8\7T\2"+
		"\2\u07f8\u07f9\7G\2\2\u07f9\u07fa\7H\2\2\u07fa\u07fb\7T\2\2\u07fb\u07fc"+
		"\7G\2\2\u07fc\u07fd\7U\2\2\u07fd\u07fe\7J\2\2\u07fe\u018e\3\2\2\2\u07ff"+
		"\u0800\7T\2\2\u0800\u0801\7G\2\2\u0801\u0802\7P\2\2\u0802\u0803\7C\2\2"+
		"\u0803\u0804\7O\2\2\u0804\u0805\7G\2\2\u0805\u0190\3\2\2\2\u0806\u0807"+
		"\7T\2\2\u0807\u0808\7G\2\2\u0808\u0809\7R\2\2\u0809\u080a\7C\2\2\u080a"+
		"\u080b\7K\2\2\u080b\u080c\7T\2\2\u080c\u0192\3\2\2\2\u080d\u080e\7T\2"+
		"\2\u080e\u080f\7G\2\2\u080f\u0810\7R\2\2\u0810\u0811\7N\2\2\u0811\u0812"+
		"\7C\2\2\u0812\u0813\7E\2\2\u0813\u0814\7G\2\2\u0814\u0194\3\2\2\2\u0815"+
		"\u0816\7T\2\2\u0816\u0817\7G\2\2\u0817\u0818\7U\2\2\u0818\u0819\7G\2\2"+
		"\u0819\u081a\7V\2\2\u081a\u0196\3\2\2\2\u081b\u081c\7T\2\2\u081c\u081d"+
		"\7G\2\2\u081d\u081e\7U\2\2\u081e\u081f\7R\2\2\u081f\u0820\7G\2\2\u0820"+
		"\u0821\7E\2\2\u0821\u0822\7V\2\2\u0822\u0198\3\2\2\2\u0823\u0824\7T\2"+
		"\2\u0824\u0825\7G\2\2\u0825\u0826\7U\2\2\u0826\u0827\7V\2\2\u0827\u0828"+
		"\7T\2\2\u0828\u0829\7K\2\2\u0829\u082a\7E\2\2\u082a\u082b\7V\2\2\u082b"+
		"\u019a\3\2\2\2\u082c\u082d\7T\2\2\u082d\u082e\7G\2\2\u082e\u082f\7X\2"+
		"\2\u082f\u0830\7Q\2\2\u0830\u0831\7M\2\2\u0831\u0832\7G\2\2\u0832\u019c"+
		"\3\2\2\2\u0833\u0834\7T\2\2\u0834\u0835\7G\2\2\u0835\u0836\7V\2\2\u0836"+
		"\u0837\7C\2\2\u0837\u0838\7K\2\2\u0838\u0839\7P\2\2\u0839\u019e\3\2\2"+
		"\2\u083a\u083b\7T\2\2\u083b\u083c\7K\2\2\u083c\u083d\7I\2\2\u083d\u083e"+
		"\7J\2\2\u083e\u083f\7V\2\2\u083f\u01a0\3\2\2\2\u0840\u0841\7T\2\2\u0841"+
		"\u0842\7N\2\2\u0842\u0843\7K\2\2\u0843\u0844\7M\2\2\u0844\u084c\7G\2\2"+
		"\u0845\u0846\7T\2\2\u0846\u0847\7G\2\2\u0847\u0848\7I\2\2\u0848\u0849"+
		"\7G\2\2\u0849\u084a\7Z\2\2\u084a\u084c\7R\2\2\u084b\u0840\3\2\2\2\u084b"+
		"\u0845\3\2\2\2\u084c\u01a2\3\2\2\2\u084d\u084e\7T\2\2\u084e\u084f\7Q\2"+
		"\2\u084f\u0850\7N\2\2\u0850\u0851\7G\2\2\u0851\u01a4\3\2\2\2\u0852\u0853"+
		"\7T\2\2\u0853\u0854\7Q\2\2\u0854\u0855\7N\2\2\u0855\u0856\7G\2\2\u0856"+
		"\u0857\7U\2\2\u0857\u01a6\3\2\2\2\u0858\u0859\7T\2\2\u0859\u085a\7Q\2"+
		"\2\u085a\u085b\7N\2\2\u085b\u085c\7N\2\2\u085c\u085d\7D\2\2\u085d\u085e"+
		"\7C\2\2\u085e\u085f\7E\2\2\u085f\u0860\7M\2\2\u0860\u01a8\3\2\2\2\u0861"+
		"\u0862\7T\2\2\u0862\u0863\7Q\2\2\u0863\u0864\7N\2\2\u0864\u0865\7N\2\2"+
		"\u0865\u0866\7W\2\2\u0866\u0867\7R\2\2\u0867\u01aa\3\2\2\2\u0868\u0869"+
		"\7T\2\2\u0869\u086a\7Q\2\2\u086a\u086b\7Y\2\2\u086b\u01ac\3\2\2\2\u086c"+
		"\u086d\7T\2\2\u086d\u086e\7Q\2\2\u086e\u086f\7Y\2\2\u086f\u0870\7U\2\2"+
		"\u0870\u01ae\3\2\2\2\u0871\u0872\7T\2\2\u0872\u0873\7W\2\2\u0873\u0874"+
		"\7P\2\2\u0874\u01b0\3\2\2\2\u0875\u0876\7U\2\2\u0876\u0877\7E\2\2\u0877"+
		"\u0878\7J\2\2\u0878\u0879\7G\2\2\u0879\u087a\7O\2\2\u087a\u087b\7C\2\2"+
		"\u087b\u01b2\3\2\2\2\u087c\u087d\7U\2\2\u087d\u087e\7G\2\2\u087e\u087f"+
		"\7E\2\2\u087f\u0880\7Q\2\2\u0880\u0881\7P\2\2\u0881\u0882\7F\2\2\u0882"+
		"\u01b4\3\2\2\2\u0883\u0884\7U\2\2\u0884\u0885\7G\2\2\u0885\u0886\7N\2"+
		"\2\u0886\u0887\7G\2\2\u0887\u0888\7E\2\2\u0888\u0889\7V\2\2\u0889\u01b6"+
		"\3\2\2\2\u088a\u088b\7U\2\2\u088b\u088c\7G\2\2\u088c\u088d\7O\2\2\u088d"+
		"\u088e\7K\2\2\u088e\u01b8\3\2\2\2\u088f\u0890\7U\2\2\u0890\u0891\7G\2"+
		"\2\u0891\u0892\7R\2\2\u0892\u0893\7C\2\2\u0893\u0894\7T\2\2\u0894\u0895"+
		"\7C\2\2\u0895\u0896\7V\2\2\u0896\u0897\7G\2\2\u0897\u0898\7F\2\2\u0898"+
		"\u01ba\3\2\2\2\u0899\u089a\7U\2\2\u089a\u089b\7G\2\2\u089b\u089c\7T\2"+
		"\2\u089c\u089d\7F\2\2\u089d\u089e\7G\2\2\u089e\u01bc\3\2\2\2\u089f\u08a0"+
		"\7U\2\2\u08a0\u08a1\7G\2\2\u08a1\u08a2\7T\2\2\u08a2\u08a3\7F\2\2\u08a3"+
		"\u08a4\7G\2\2\u08a4\u08a5\7R\2\2\u08a5\u08a6\7T\2\2\u08a6\u08a7\7Q\2\2"+
		"\u08a7\u08a8\7R\2\2\u08a8\u08a9\7G\2\2\u08a9\u08aa\7T\2\2\u08aa\u08ab"+
		"\7V\2\2\u08ab\u08ac\7K\2\2\u08ac\u08ad\7G\2\2\u08ad\u08ae\7U\2\2\u08ae"+
		"\u01be\3\2\2\2\u08af\u08b0\7U\2\2\u08b0\u08b1\7G\2\2\u08b1\u08b2\7U\2"+
		"\2\u08b2\u08b3\7U\2\2\u08b3\u08b4\7K\2\2\u08b4\u08b5\7Q\2\2\u08b5\u08b6"+
		"\7P\2\2\u08b6\u08b7\7a\2\2\u08b7\u08b8\7W\2\2\u08b8\u08b9\7U\2\2\u08b9"+
		"\u08ba\7G\2\2\u08ba\u08bb\7T\2\2\u08bb\u01c0\3\2\2\2\u08bc\u08bd\7U\2"+
		"\2\u08bd\u08be\7G\2\2\u08be\u08bf\7V\2\2\u08bf\u01c2\3\2\2\2\u08c0\u08c1"+
		"\7O\2\2\u08c1\u08c2\7K\2\2\u08c2\u08c3\7P\2\2\u08c3\u08c4\7W\2\2\u08c4"+
		"\u08c5\7U\2\2\u08c5\u01c4\3\2\2\2\u08c6\u08c7\7U\2\2\u08c7\u08c8\7G\2"+
		"\2\u08c8\u08c9\7V\2\2\u08c9\u08ca\7U\2\2\u08ca\u01c6\3\2\2\2\u08cb\u08cc"+
		"\7U\2\2\u08cc\u08cd\7J\2\2\u08cd\u08ce\7Q\2\2\u08ce\u08cf\7Y\2\2\u08cf"+
		"\u01c8\3\2\2\2\u08d0\u08d1\7U\2\2\u08d1\u08d2\7M\2\2\u08d2\u08d3\7G\2"+
		"\2\u08d3\u08d4\7Y\2\2\u08d4\u08d5\7G\2\2\u08d5\u08d6\7F\2\2\u08d6\u01ca"+
		"\3\2\2\2\u08d7\u08d8\7U\2\2\u08d8\u08d9\7Q\2\2\u08d9\u08da\7O\2\2\u08da"+
		"\u08db\7G\2\2\u08db\u01cc\3\2\2\2\u08dc\u08dd\7U\2\2\u08dd\u08de\7Q\2"+
		"\2\u08de\u08df\7T\2\2\u08df\u08e0\7V\2\2\u08e0\u01ce\3\2\2\2\u08e1\u08e2"+
		"\7U\2\2\u08e2\u08e3\7Q\2\2\u08e3\u08e4\7T\2\2\u08e4\u08e5\7V\2\2\u08e5"+
		"\u08e6\7G\2\2\u08e6\u08e7\7F\2\2\u08e7\u01d0\3\2\2\2\u08e8\u08e9\7U\2"+
		"\2\u08e9\u08ea\7V\2\2\u08ea\u08eb\7C\2\2\u08eb\u08ec\7T\2\2\u08ec\u08ed"+
		"\7V\2\2\u08ed\u01d2\3\2\2\2\u08ee\u08ef\7U\2\2\u08ef\u08f0\7V\2\2\u08f0"+
		"\u08f1\7C\2\2\u08f1\u08f2\7V\2\2\u08f2\u08f3\7K\2\2\u08f3\u08f4\7U\2\2"+
		"\u08f4\u08f5\7V\2\2\u08f5\u08f6\7K\2\2\u08f6\u08f7\7E\2\2\u08f7\u08f8"+
		"\7U\2\2\u08f8\u01d4\3\2\2\2\u08f9\u08fa\7U\2\2\u08fa\u08fb\7V\2\2\u08fb"+
		"\u08fc\7Q\2\2\u08fc\u08fd\7T\2\2\u08fd\u08fe\7G\2\2\u08fe\u08ff\7F\2\2"+
		"\u08ff\u01d6\3\2\2\2\u0900\u0901\7U\2\2\u0901\u0902\7V\2\2\u0902\u0903"+
		"\7T\2\2\u0903\u0904\7C\2\2\u0904\u0905\7V\2\2\u0905\u0906\7K\2\2\u0906"+
		"\u0907\7H\2\2\u0907\u0908\7[\2\2\u0908\u01d8\3\2\2\2\u0909\u090a\7U\2"+
		"\2\u090a\u090b\7V\2\2\u090b\u090c\7T\2\2\u090c\u090d\7W\2\2\u090d\u090e"+
		"\7E\2\2\u090e\u090f\7V\2\2\u090f\u01da\3\2\2\2\u0910\u0911\7U\2\2\u0911"+
		"\u0912\7W\2\2\u0912\u0913\7D\2\2\u0913\u0914\7U\2\2\u0914\u0915\7V\2\2"+
		"\u0915\u0916\7T\2\2\u0916\u01dc\3\2\2\2\u0917\u0918\7U\2\2\u0918\u0919"+
		"\7W\2\2\u0919\u091a\7D\2\2\u091a\u091b\7U\2\2\u091b\u091c\7V\2\2\u091c"+
		"\u091d\7T\2\2\u091d\u091e\7K\2\2\u091e\u091f\7P\2\2\u091f\u0920\7I\2\2"+
		"\u0920\u01de\3\2\2\2\u0921\u0922\7U\2\2\u0922\u0923\7[\2\2\u0923\u0924"+
		"\7P\2\2\u0924\u0925\7E\2\2\u0925\u01e0\3\2\2\2\u0926\u0927\7V\2\2\u0927"+
		"\u0928\7C\2\2\u0928\u0929\7D\2\2\u0929\u092a\7N\2\2\u092a\u092b\7G\2\2"+
		"\u092b\u01e2\3\2\2\2\u092c\u092d\7V\2\2\u092d\u092e\7C\2\2\u092e\u092f"+
		"\7D\2\2\u092f\u0930\7N\2\2\u0930\u0931\7G\2\2\u0931\u0932\7U\2\2\u0932"+
		"\u01e4\3\2\2\2\u0933\u0934\7V\2\2\u0934\u0935\7C\2\2\u0935\u0936\7D\2"+
		"\2\u0936\u0937\7N\2\2\u0937\u0938\7G\2\2\u0938\u0939\7U\2\2\u0939\u093a"+
		"\7C\2\2\u093a\u093b\7O\2\2\u093b\u093c\7R\2\2\u093c\u093d\7N\2\2\u093d"+
		"\u093e\7G\2\2\u093e\u01e6\3\2\2\2\u093f\u0940\7V\2\2\u0940\u0941\7D\2"+
		"\2\u0941\u0942\7N\2\2\u0942\u0943\7R\2\2\u0943\u0944\7T\2\2\u0944\u0945"+
		"\7Q\2\2\u0945\u0946\7R\2\2\u0946\u0947\7G\2\2\u0947\u0948\7T\2\2\u0948"+
		"\u0949\7V\2\2\u0949\u094a\7K\2\2\u094a\u094b\7G\2\2\u094b\u094c\7U\2\2"+
		"\u094c\u01e8\3\2\2\2\u094d\u094e\7V\2\2\u094e\u094f\7G\2\2\u094f\u0950"+
		"\7O\2\2\u0950\u0951\7R\2\2\u0951\u0952\7Q\2\2\u0952\u0953\7T\2\2\u0953"+
		"\u0954\7C\2\2\u0954\u0955\7T\2\2\u0955\u095b\7[\2\2\u0956\u0957\7V\2\2"+
		"\u0957\u0958\7G\2\2\u0958\u0959\7O\2\2\u0959\u095b\7R\2\2\u095a\u094d"+
		"\3\2\2\2\u095a\u0956\3\2\2\2\u095b\u01ea\3\2\2\2\u095c\u095d\7V\2\2\u095d"+
		"\u095e\7G\2\2\u095e\u095f\7T\2\2\u095f\u0960\7O\2\2\u0960\u0961\7K\2\2"+
		"\u0961\u0962\7P\2\2\u0962\u0963\7C\2\2\u0963\u0964\7V\2\2\u0964\u0965"+
		"\7G\2\2\u0965\u0966\7F\2\2\u0966\u01ec\3\2\2\2\u0967\u0968\7V\2\2\u0968"+
		"\u0969\7J\2\2\u0969\u096a\7G\2\2\u096a\u096b\7P\2\2\u096b\u01ee\3\2\2"+
		"\2\u096c\u096d\7V\2\2\u096d\u096e\7K\2\2\u096e\u096f\7O\2\2\u096f\u0970"+
		"\7G\2\2\u0970\u01f0\3\2\2\2\u0971\u0972\7V\2\2\u0972\u0973\7Q\2\2\u0973"+
		"\u01f2\3\2\2\2\u0974\u0975\7V\2\2\u0975\u0976\7Q\2\2\u0976\u0977\7W\2"+
		"\2\u0977\u0978\7E\2\2\u0978\u0979\7J\2\2\u0979\u01f4\3\2\2\2\u097a\u097b"+
		"\7V\2\2\u097b\u097c\7T\2\2\u097c\u097d\7C\2\2\u097d\u097e\7K\2\2\u097e"+
		"\u097f\7N\2\2\u097f\u0980\7K\2\2\u0980\u0981\7P\2\2\u0981\u0982\7I\2\2"+
		"\u0982\u01f6\3\2\2\2\u0983\u0984\7V\2\2\u0984\u0985\7T\2\2\u0985\u0986"+
		"\7C\2\2\u0986\u0987\7P\2\2\u0987\u0988\7U\2\2\u0988\u0989\7C\2\2\u0989"+
		"\u098a\7E\2\2\u098a\u098b\7V\2\2\u098b\u098c\7K\2\2\u098c\u098d\7Q\2\2"+
		"\u098d\u098e\7P\2\2\u098e\u01f8\3\2\2\2\u098f\u0990\7V\2\2\u0990\u0991"+
		"\7T\2\2\u0991\u0992\7C\2\2\u0992\u0993\7P\2\2\u0993\u0994\7U\2\2\u0994"+
		"\u0995\7C\2\2\u0995\u0996\7E\2\2\u0996\u0997\7V\2\2\u0997\u0998\7K\2\2"+
		"\u0998\u0999\7Q\2\2\u0999\u099a\7P\2\2\u099a\u099b\7U\2\2\u099b\u01fa"+
		"\3\2\2\2\u099c\u099d\7V\2\2\u099d\u099e\7T\2\2\u099e\u099f\7C\2\2\u099f"+
		"\u09a0\7P\2\2\u09a0\u09a1\7U\2\2\u09a1\u09a2\7H\2\2\u09a2\u09a3\7Q\2\2"+
		"\u09a3\u09a4\7T\2\2\u09a4\u09a5\7O\2\2\u09a5\u01fc\3\2\2\2\u09a6\u09a7"+
		"\7V\2\2\u09a7\u09a8\7T\2\2\u09a8\u09a9\7K\2\2\u09a9\u09aa\7O\2\2\u09aa"+
		"\u01fe\3\2\2\2\u09ab\u09ac\7V\2\2\u09ac\u09ad\7T\2\2\u09ad\u09ae\7W\2"+
		"\2\u09ae\u09af\7G\2\2\u09af\u0200\3\2\2\2\u09b0\u09b1\7V\2\2\u09b1\u09b2"+
		"\7T\2\2\u09b2\u09b3\7W\2\2\u09b3\u09b4\7P\2\2\u09b4\u09b5\7E\2\2\u09b5"+
		"\u09b6\7C\2\2\u09b6\u09b7\7V\2\2\u09b7\u09b8\7G\2\2\u09b8\u0202\3\2\2"+
		"\2\u09b9\u09ba\7V\2\2\u09ba\u09bb\7T\2\2\u09bb\u09bc\7[\2\2\u09bc\u09bd"+
		"\7a\2\2\u09bd\u09be\7E\2\2\u09be\u09bf\7C\2\2\u09bf\u09c0\7U\2\2\u09c0"+
		"\u09c1\7V\2\2\u09c1\u0204\3\2\2\2\u09c2\u09c3\7V\2\2\u09c3\u09c4\7[\2"+
		"\2\u09c4\u09c5\7R\2\2\u09c5\u09c6\7G\2\2\u09c6\u0206\3\2\2\2\u09c7\u09c8"+
		"\7W\2\2\u09c8\u09c9\7P\2\2\u09c9\u09ca\7C\2\2\u09ca\u09cb\7T\2\2\u09cb"+
		"\u09cc\7E\2\2\u09cc\u09cd\7J\2\2\u09cd\u09ce\7K\2\2\u09ce\u09cf\7X\2\2"+
		"\u09cf\u09d0\7G\2\2\u09d0\u0208\3\2\2\2\u09d1\u09d2\7W\2\2\u09d2\u09d3"+
		"\7P\2\2\u09d3\u09d4\7D\2\2\u09d4\u09d5\7Q\2\2\u09d5\u09d6\7W\2\2\u09d6"+
		"\u09d7\7P\2\2\u09d7\u09d8\7F\2\2\u09d8\u09d9\7G\2\2\u09d9\u09da\7F\2\2"+
		"\u09da\u020a\3\2\2\2\u09db\u09dc\7W\2\2\u09dc\u09dd\7P\2\2\u09dd\u09de"+
		"\7E\2\2\u09de\u09df\7C\2\2\u09df\u09e0\7E\2\2\u09e0\u09e1\7J\2\2\u09e1"+
		"\u09e2\7G\2\2\u09e2\u020c\3\2\2\2\u09e3\u09e4\7W\2\2";
	private static final String _serializedATNSegment1 =
		"\u09e4\u09e5\7P\2\2\u09e5\u09e6\7K\2\2\u09e6\u09e7\7Q\2\2\u09e7\u09e8"+
		"\7P\2\2\u09e8\u020e\3\2\2\2\u09e9\u09ea\7W\2\2\u09ea\u09eb\7P\2\2\u09eb"+
		"\u09ec\7K\2\2\u09ec\u09ed\7S\2\2\u09ed\u09ee\7W\2\2\u09ee\u09ef\7G\2\2"+
		"\u09ef\u0210\3\2\2\2\u09f0\u09f1\7W\2\2\u09f1\u09f2\7P\2\2\u09f2\u09f3"+
		"\7M\2\2\u09f3\u09f4\7P\2\2\u09f4\u09f5\7Q\2\2\u09f5\u09f6\7Y\2\2\u09f6"+
		"\u09f7\7P\2\2\u09f7\u0212\3\2\2\2\u09f8\u09f9\7W\2\2\u09f9\u09fa\7P\2"+
		"\2\u09fa\u09fb\7N\2\2\u09fb\u09fc\7Q\2\2\u09fc\u09fd\7E\2\2\u09fd\u09fe"+
		"\7M\2\2\u09fe\u0214\3\2\2\2\u09ff\u0a00\7W\2\2\u0a00\u0a01\7P\2\2\u0a01"+
		"\u0a02\7U\2\2\u0a02\u0a03\7G\2\2\u0a03\u0a04\7V\2\2\u0a04\u0216\3\2\2"+
		"\2\u0a05\u0a06\7W\2\2\u0a06\u0a07\7R\2\2\u0a07\u0a08\7F\2\2\u0a08\u0a09"+
		"\7C\2\2\u0a09\u0a0a\7V\2\2\u0a0a\u0a0b\7G\2\2\u0a0b\u0218\3\2\2\2\u0a0c"+
		"\u0a0d\7W\2\2\u0a0d\u0a0e\7U\2\2\u0a0e\u0a0f\7G\2\2\u0a0f\u021a\3\2\2"+
		"\2\u0a10\u0a11\7W\2\2\u0a11\u0a12\7U\2\2\u0a12\u0a13\7G\2\2\u0a13\u0a14"+
		"\7T\2\2\u0a14\u021c\3\2\2\2\u0a15\u0a16\7W\2\2\u0a16\u0a17\7U\2\2\u0a17"+
		"\u0a18\7K\2\2\u0a18\u0a19\7P\2\2\u0a19\u0a1a\7I\2\2\u0a1a\u021e\3\2\2"+
		"\2\u0a1b\u0a1c\7X\2\2\u0a1c\u0a1d\7C\2\2\u0a1d\u0a1e\7N\2\2\u0a1e\u0a1f"+
		"\7W\2\2\u0a1f\u0a20\7G\2\2\u0a20\u0a21\7U\2\2\u0a21\u0220\3\2\2\2\u0a22"+
		"\u0a23\7X\2\2\u0a23\u0a24\7C\2\2\u0a24\u0a25\7E\2\2\u0a25\u0a26\7W\2\2"+
		"\u0a26\u0a27\7W\2\2\u0a27\u0a28\7O\2\2\u0a28\u0222\3\2\2\2\u0a29\u0a2a"+
		"\7X\2\2\u0a2a\u0a2b\7K\2\2\u0a2b\u0a2c\7G\2\2\u0a2c\u0a2d\7Y\2\2\u0a2d"+
		"\u0224\3\2\2\2\u0a2e\u0a2f\7X\2\2\u0a2f\u0a30\7K\2\2\u0a30\u0a31\7G\2"+
		"\2\u0a31\u0a32\7Y\2\2\u0a32\u0a33\7U\2\2\u0a33\u0226\3\2\2\2\u0a34\u0a35"+
		"\7Y\2\2\u0a35\u0a36\7J\2\2\u0a36\u0a37\7G\2\2\u0a37\u0a38\7P\2\2\u0a38"+
		"\u0228\3\2\2\2\u0a39\u0a3a\7Y\2\2\u0a3a\u0a3b\7J\2\2\u0a3b\u0a3c\7G\2"+
		"\2\u0a3c\u0a3d\7T\2\2\u0a3d\u0a3e\7G\2\2\u0a3e\u022a\3\2\2\2\u0a3f\u0a40"+
		"\7Y\2\2\u0a40\u0a41\7K\2\2\u0a41\u0a42\7P\2\2\u0a42\u0a43\7F\2\2\u0a43"+
		"\u0a44\7Q\2\2\u0a44\u0a45\7Y\2\2\u0a45\u022c\3\2\2\2\u0a46\u0a47\7Y\2"+
		"\2\u0a47\u0a48\7K\2\2\u0a48\u0a49\7V\2\2\u0a49\u0a4a\7J\2\2\u0a4a\u022e"+
		"\3\2\2\2\u0a4b\u0a4c\7\\\2\2\u0a4c\u0a4d\7Q\2\2\u0a4d\u0a4e\7P\2\2\u0a4e"+
		"\u0a4f\7G\2\2\u0a4f\u0230\3\2\2\2\u0a50\u0a51\7[\2\2\u0a51\u0a52\7G\2"+
		"\2\u0a52\u0a53\7C\2\2\u0a53\u0a54\7T\2\2\u0a54\u0232\3\2\2\2\u0a55\u0a56"+
		"\7M\2\2\u0a56\u0a57\7K\2\2\u0a57\u0a58\7N\2\2\u0a58\u0a59\7N\2\2\u0a59"+
		"\u0234\3\2\2\2\u0a5a\u0a5b\7T\2\2\u0a5b\u0a5c\7G\2\2\u0a5c\u0a5d\7C\2"+
		"\2\u0a5d\u0a5e\7F\2\2\u0a5e\u0236\3\2\2\2\u0a5f\u0a60\7L\2\2\u0a60\u0a61"+
		"\7Q\2\2\u0a61\u0a62\7D\2\2\u0a62\u0238\3\2\2\2\u0a63\u0a64\7C\2\2\u0a64"+
		"\u0a65\7F\2\2\u0a65\u0a66\7F\2\2\u0a66\u0a67\7L\2\2\u0a67\u0a68\7C\2\2"+
		"\u0a68\u0a69\7T\2\2\u0a69\u023a\3\2\2\2\u0a6a\u0a6b\7E\2\2\u0a6b\u0a6c"+
		"\7Q\2\2\u0a6c\u0a6d\7O\2\2\u0a6d\u0a6e\7R\2\2\u0a6e\u0a6f\7T\2\2\u0a6f"+
		"\u0a70\7G\2\2\u0a70\u0a71\7U\2\2\u0a71\u0a72\7U\2\2\u0a72\u023c\3\2\2"+
		"\2\u0a73\u0a74\7H\2\2\u0a74\u0a75\7K\2\2\u0a75\u0a76\7N\2\2\u0a76\u0a77"+
		"\7G\2\2\u0a77\u023e\3\2\2\2\u0a78\u0a7c\7?\2\2\u0a79\u0a7a\7?\2\2\u0a7a"+
		"\u0a7c\7?\2\2\u0a7b\u0a78\3\2\2\2\u0a7b\u0a79\3\2\2\2\u0a7c\u0240\3\2"+
		"\2\2\u0a7d\u0a7e\7>\2\2\u0a7e\u0a7f\7?\2\2\u0a7f\u0a80\7@\2\2\u0a80\u0242"+
		"\3\2\2\2\u0a81\u0a82\7>\2\2\u0a82\u0a83\7@\2\2\u0a83\u0244\3\2\2\2\u0a84"+
		"\u0a85\7#\2\2\u0a85\u0a86\7?\2\2\u0a86\u0246\3\2\2\2\u0a87\u0a88\7>\2"+
		"\2\u0a88\u0248\3\2\2\2\u0a89\u0a8a\7>\2\2\u0a8a\u0a8e\7?\2\2\u0a8b\u0a8c"+
		"\7#\2\2\u0a8c\u0a8e\7@\2\2\u0a8d\u0a89\3\2\2\2\u0a8d\u0a8b\3\2\2\2\u0a8e"+
		"\u024a\3\2\2\2\u0a8f\u0a90\7@\2\2\u0a90\u024c\3\2\2\2\u0a91\u0a92\7@\2"+
		"\2\u0a92\u0a96\7?\2\2\u0a93\u0a94\7#\2\2\u0a94\u0a96\7>\2\2\u0a95\u0a91"+
		"\3\2\2\2\u0a95\u0a93\3\2\2\2\u0a96\u024e\3\2\2\2\u0a97\u0a98\7-\2\2\u0a98"+
		"\u0250\3\2\2\2\u0a99\u0a9a\7/\2\2\u0a9a\u0252\3\2\2\2\u0a9b\u0a9c\7,\2"+
		"\2\u0a9c\u0254\3\2\2\2\u0a9d\u0a9e\7\61\2\2\u0a9e\u0256\3\2\2\2\u0a9f"+
		"\u0aa0\7\'\2\2\u0aa0\u0258\3\2\2\2\u0aa1\u0aa2\7\u0080\2\2\u0aa2\u025a"+
		"\3\2\2\2\u0aa3\u0aa4\7(\2\2\u0aa4\u025c\3\2\2\2\u0aa5\u0aa6\7~\2\2\u0aa6"+
		"\u025e\3\2\2\2\u0aa7\u0aa8\7~\2\2\u0aa8\u0aa9\7~\2\2\u0aa9\u0260\3\2\2"+
		"\2\u0aaa\u0aab\7`\2\2\u0aab\u0262\3\2\2\2\u0aac\u0ab2\7)\2\2\u0aad\u0ab1"+
		"\n\2\2\2\u0aae\u0aaf\7^\2\2\u0aaf\u0ab1\13\2\2\2\u0ab0\u0aad\3\2\2\2\u0ab0"+
		"\u0aae\3\2\2\2\u0ab1\u0ab4\3\2\2\2\u0ab2\u0ab0\3\2\2\2\u0ab2\u0ab3\3\2"+
		"\2\2\u0ab3\u0ab5\3\2\2\2\u0ab4\u0ab2\3\2\2\2\u0ab5\u0ac1\7)\2\2\u0ab6"+
		"\u0abc\7$\2\2\u0ab7\u0abb\n\3\2\2\u0ab8\u0ab9\7^\2\2\u0ab9\u0abb\13\2"+
		"\2\2\u0aba\u0ab7\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0abb\u0abe\3\2\2\2\u0abc"+
		"\u0aba\3\2\2\2\u0abc\u0abd\3\2\2\2\u0abd\u0abf\3\2\2\2\u0abe\u0abc\3\2"+
		"\2\2\u0abf\u0ac1\7$\2\2\u0ac0\u0aac\3\2\2\2\u0ac0\u0ab6\3\2\2\2\u0ac1"+
		"\u0264\3\2\2\2\u0ac2\u0ac4\5\u027f\u0140\2\u0ac3\u0ac2\3\2\2\2\u0ac4\u0ac5"+
		"\3\2\2\2\u0ac5\u0ac3\3\2\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0ac7\3\2\2\2\u0ac7"+
		"\u0ac8\7N\2\2\u0ac8\u0266\3\2\2\2\u0ac9\u0acb\5\u027f\u0140\2\u0aca\u0ac9"+
		"\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u0aca\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd"+
		"\u0ace\3\2\2\2\u0ace\u0acf\7U\2\2\u0acf\u0268\3\2\2\2\u0ad0\u0ad2\5\u027f"+
		"\u0140\2\u0ad1\u0ad0\3\2\2\2\u0ad2\u0ad3\3\2\2\2\u0ad3\u0ad1\3\2\2\2\u0ad3"+
		"\u0ad4\3\2\2\2\u0ad4\u0ad5\3\2\2\2\u0ad5\u0ad6\7[\2\2\u0ad6\u026a\3\2"+
		"\2\2\u0ad7\u0ad9\5\u027f\u0140\2\u0ad8\u0ad7\3\2\2\2\u0ad9\u0ada\3\2\2"+
		"\2\u0ada\u0ad8\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u026c\3\2\2\2\u0adc\u0ade"+
		"\5\u027f\u0140\2\u0add\u0adc\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf\u0add\3"+
		"\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u0ae2\5\u027d\u013f"+
		"\2\u0ae2\u0ae8\3\2\2\2\u0ae3\u0ae4\5\u027b\u013e\2\u0ae4\u0ae5\5\u027d"+
		"\u013f\2\u0ae5\u0ae6\6\u0137\2\2\u0ae6\u0ae8\3\2\2\2\u0ae7\u0add\3\2\2"+
		"\2\u0ae7\u0ae3\3\2\2\2\u0ae8\u026e\3\2\2\2\u0ae9\u0aea\5\u027b\u013e\2"+
		"\u0aea\u0aeb\6\u0138\3\2\u0aeb\u0270\3\2\2\2\u0aec\u0aee\5\u027f\u0140"+
		"\2\u0aed\u0aec\3\2\2\2\u0aee\u0aef\3\2\2\2\u0aef\u0aed\3\2\2\2\u0aef\u0af0"+
		"\3\2\2\2\u0af0\u0af2\3\2\2\2\u0af1\u0af3\5\u027d\u013f\2\u0af2\u0af1\3"+
		"\2\2\2\u0af2\u0af3\3\2\2\2\u0af3\u0af4\3\2\2\2\u0af4\u0af5\7H\2\2\u0af5"+
		"\u0afe\3\2\2\2\u0af6\u0af8\5\u027b\u013e\2\u0af7\u0af9\5\u027d\u013f\2"+
		"\u0af8\u0af7\3\2\2\2\u0af8\u0af9\3\2\2\2\u0af9\u0afa\3\2\2\2\u0afa\u0afb"+
		"\7H\2\2\u0afb\u0afc\6\u0139\4\2\u0afc\u0afe\3\2\2\2\u0afd\u0aed\3\2\2"+
		"\2\u0afd\u0af6\3\2\2\2\u0afe\u0272\3\2\2\2\u0aff\u0b01\5\u027f\u0140\2"+
		"\u0b00\u0aff\3\2\2\2\u0b01\u0b02\3\2\2\2\u0b02\u0b00\3\2\2\2\u0b02\u0b03"+
		"\3\2\2\2\u0b03\u0b05\3\2\2\2\u0b04\u0b06\5\u027d\u013f\2\u0b05\u0b04\3"+
		"\2\2\2\u0b05\u0b06\3\2\2\2\u0b06\u0b07\3\2\2\2\u0b07\u0b08\7F\2\2\u0b08"+
		"\u0b11\3\2\2\2\u0b09\u0b0b\5\u027b\u013e\2\u0b0a\u0b0c\5\u027d\u013f\2"+
		"\u0b0b\u0b0a\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u0b0e"+
		"\7F\2\2\u0b0e\u0b0f\6\u013a\5\2\u0b0f\u0b11\3\2\2\2\u0b10\u0b00\3\2\2"+
		"\2\u0b10\u0b09\3\2\2\2\u0b11\u0274\3\2\2\2\u0b12\u0b14\5\u027f\u0140\2"+
		"\u0b13\u0b12\3\2\2\2\u0b14\u0b15\3\2\2\2\u0b15\u0b13\3\2\2\2\u0b15\u0b16"+
		"\3\2\2\2\u0b16\u0b18\3\2\2\2\u0b17\u0b19\5\u027d\u013f\2\u0b18\u0b17\3"+
		"\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u0b1b\7D\2\2\u0b1b"+
		"\u0b1c\7F\2\2\u0b1c\u0b27\3\2\2\2\u0b1d\u0b1f\5\u027b\u013e\2\u0b1e\u0b20"+
		"\5\u027d\u013f\2\u0b1f\u0b1e\3\2\2\2\u0b1f\u0b20\3\2\2\2\u0b20\u0b21\3"+
		"\2\2\2\u0b21\u0b22\7D\2\2\u0b22\u0b23\7F\2\2\u0b23\u0b24\3\2\2\2\u0b24"+
		"\u0b25\6\u013b\6\2\u0b25\u0b27\3\2\2\2\u0b26\u0b13\3\2\2\2\u0b26\u0b1d"+
		"\3\2\2\2\u0b27\u0276\3\2\2\2\u0b28\u0b2c\5\u0281\u0141\2\u0b29\u0b2c\5"+
		"\u027f\u0140\2\u0b2a\u0b2c\7a\2\2\u0b2b\u0b28\3\2\2\2\u0b2b\u0b29\3\2"+
		"\2\2\u0b2b\u0b2a\3\2\2\2\u0b2c\u0b2d\3\2\2\2\u0b2d\u0b2b\3\2\2\2\u0b2d"+
		"\u0b2e\3\2\2\2\u0b2e\u0278\3\2\2\2\u0b2f\u0b35\7b\2\2\u0b30\u0b34\n\4"+
		"\2\2\u0b31\u0b32\7b\2\2\u0b32\u0b34\7b\2\2\u0b33\u0b30\3\2\2\2\u0b33\u0b31"+
		"\3\2\2\2\u0b34\u0b37\3\2\2\2\u0b35\u0b33\3\2\2\2\u0b35\u0b36\3\2\2\2\u0b36"+
		"\u0b38\3\2\2\2\u0b37\u0b35\3\2\2\2\u0b38\u0b39\7b\2\2\u0b39\u027a\3\2"+
		"\2\2\u0b3a\u0b3c\5\u027f\u0140\2\u0b3b\u0b3a\3\2\2\2\u0b3c\u0b3d\3\2\2"+
		"\2\u0b3d\u0b3b\3\2\2\2\u0b3d\u0b3e\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f\u0b43"+
		"\7\60\2\2\u0b40\u0b42\5\u027f\u0140\2\u0b41\u0b40\3\2\2\2\u0b42\u0b45"+
		"\3\2\2\2\u0b43\u0b41\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b4d\3\2\2\2\u0b45"+
		"\u0b43\3\2\2\2\u0b46\u0b48\7\60\2\2\u0b47\u0b49\5\u027f\u0140\2\u0b48"+
		"\u0b47\3\2\2\2\u0b49\u0b4a\3\2\2\2\u0b4a\u0b48\3\2\2\2\u0b4a\u0b4b\3\2"+
		"\2\2\u0b4b\u0b4d\3\2\2\2\u0b4c\u0b3b\3\2\2\2\u0b4c\u0b46\3\2\2\2\u0b4d"+
		"\u027c\3\2\2\2\u0b4e\u0b50\7G\2\2\u0b4f\u0b51\t\5\2\2\u0b50\u0b4f\3\2"+
		"\2\2\u0b50\u0b51\3\2\2\2\u0b51\u0b53\3\2\2\2\u0b52\u0b54\5\u027f\u0140"+
		"\2\u0b53\u0b52\3\2\2\2\u0b54\u0b55\3\2\2\2\u0b55\u0b53\3\2\2\2\u0b55\u0b56"+
		"\3\2\2\2\u0b56\u027e\3\2\2\2\u0b57\u0b58\t\6\2\2\u0b58\u0280\3\2\2\2\u0b59"+
		"\u0b5a\t\7\2\2\u0b5a\u0282\3\2\2\2\u0b5b\u0b5c\7/\2\2\u0b5c\u0b5d\7/\2"+
		"\2\u0b5d\u0b63\3\2\2\2\u0b5e\u0b5f\7^\2\2\u0b5f\u0b62\7\f\2\2\u0b60\u0b62"+
		"\n\b\2\2\u0b61\u0b5e\3\2\2\2\u0b61\u0b60\3\2\2\2\u0b62\u0b65\3\2\2\2\u0b63"+
		"\u0b61\3\2\2\2\u0b63\u0b64\3\2\2\2\u0b64\u0b67\3\2\2\2\u0b65\u0b63\3\2"+
		"\2\2\u0b66\u0b68\7\17\2\2\u0b67\u0b66\3\2\2\2\u0b67\u0b68\3\2\2\2\u0b68"+
		"\u0b6a\3\2\2\2\u0b69\u0b6b\7\f\2\2\u0b6a\u0b69\3\2\2\2\u0b6a\u0b6b\3\2"+
		"\2\2\u0b6b\u0b6c\3\2\2\2\u0b6c\u0b6d\b\u0142\2\2\u0b6d\u0284\3\2\2\2\u0b6e"+
		"\u0b6f\7\61\2\2\u0b6f\u0b70\7,\2\2\u0b70\u0b71\3\2\2\2\u0b71\u0b76\6\u0143"+
		"\7\2\u0b72\u0b75\5\u0285\u0143\2\u0b73\u0b75\13\2\2\2\u0b74\u0b72\3\2"+
		"\2\2\u0b74\u0b73\3\2\2\2\u0b75\u0b78\3\2\2\2\u0b76\u0b77\3\2\2\2\u0b76"+
		"\u0b74\3\2\2\2\u0b77\u0b79\3\2\2\2\u0b78\u0b76\3\2\2\2\u0b79\u0b7a\7,"+
		"\2\2\u0b7a\u0b7b\7\61\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c\u0b7d\b\u0143\2\2"+
		"\u0b7d\u0286\3\2\2\2\u0b7e\u0b80\t\t\2\2\u0b7f\u0b7e\3\2\2\2\u0b80\u0b81"+
		"\3\2\2\2\u0b81\u0b7f\3\2\2\2\u0b81\u0b82\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83"+
		"\u0b84\b\u0144\2\2\u0b84\u0288\3\2\2\2\u0b85\u0b86\13\2\2\2\u0b86\u028a"+
		"\3\2\2\2\62\2\u043a\u06da\u084b\u095a\u0a7b\u0a8d\u0a95\u0ab0\u0ab2\u0aba"+
		"\u0abc\u0ac0\u0ac5\u0acc\u0ad3\u0ada\u0adf\u0ae7\u0aef\u0af2\u0af8\u0afd"+
		"\u0b02\u0b05\u0b0b\u0b10\u0b15\u0b18\u0b1f\u0b26\u0b2b\u0b2d\u0b33\u0b35"+
		"\u0b3d\u0b43\u0b4a\u0b4c\u0b50\u0b55\u0b61\u0b63\u0b67\u0b6a\u0b74\u0b76"+
		"\u0b81\3\2\3\2";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
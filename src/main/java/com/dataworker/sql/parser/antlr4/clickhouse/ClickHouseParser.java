// Generated from com/dataworker/sql/parser/antlr4/clickhouse/ClickHouseParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.clickhouse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClickHouseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, AFTER=2, ALIAS=3, ALL=4, ALTER=5, AND=6, ANTI=7, ANY=8, ARRAY=9, 
		AS=10, ASCENDING=11, ASOF=12, ASYNC=13, ATTACH=14, BETWEEN=15, BOTH=16, 
		BY=17, CASE=18, CAST=19, CHECK=20, CLEAR=21, CLUSTER=22, CODEC=23, COLLATE=24, 
		COLUMN=25, COMMENT=26, CONSTRAINT=27, CREATE=28, CROSS=29, CUBE=30, DATABASE=31, 
		DATABASES=32, DATE=33, DAY=34, DEDUPLICATE=35, DEFAULT=36, DELAY=37, DELETE=38, 
		DESC=39, DESCENDING=40, DESCRIBE=41, DETACH=42, DICTIONARIES=43, DICTIONARY=44, 
		DISK=45, DISTINCT=46, DISTRIBUTED=47, DROP=48, ELSE=49, END=50, ENGINE=51, 
		EVENTS=52, EXISTS=53, EXPLAIN=54, EXPRESSION=55, EXTRACT=56, FETCHES=57, 
		FINAL=58, FIRST=59, FLUSH=60, FOR=61, FORMAT=62, FREEZE=63, FROM=64, FULL=65, 
		FUNCTION=66, GLOBAL=67, GRANULARITY=68, GROUP=69, HAVING=70, HIERARCHICAL=71, 
		HOUR=72, ID=73, IF=74, ILIKE=75, IN=76, INDEX=77, INF=78, INJECTIVE=79, 
		INNER=80, INSERT=81, INTERVAL=82, INTO=83, IS=84, IS_OBJECT_ID=85, JOIN=86, 
		KEY=87, KILL=88, LAST=89, LAYOUT=90, LEADING=91, LEFT=92, LIFETIME=93, 
		LIKE=94, LIMIT=95, LIVE=96, LOCAL=97, LOGS=98, MATERIALIZED=99, MAX=100, 
		MERGES=101, MIN=102, MINUTE=103, MODIFY=104, MONTH=105, MOVE=106, MUTATION=107, 
		NAN_SQL=108, NO=109, NOT=110, NULL_SQL=111, NULLS=112, OFFSET=113, ON=114, 
		OPTIMIZE=115, OR=116, ORDER=117, OUTER=118, OUTFILE=119, PARTITION=120, 
		POPULATE=121, PREWHERE=122, PRIMARY=123, QUARTER=124, RANGE=125, RELOAD=126, 
		REMOVE=127, RENAME=128, REPLACE=129, REPLICA=130, REPLICATED=131, RIGHT=132, 
		ROLLUP=133, SAMPLE=134, SECOND=135, SELECT=136, SEMI=137, SENDS=138, SET=139, 
		SETTINGS=140, SHOW=141, SOURCE=142, START=143, STOP=144, SUBSTRING=145, 
		SYNC=146, SYNTAX=147, SYSTEM=148, TABLE=149, TABLES=150, TEMPORARY=151, 
		TEST=152, THEN=153, TIES=154, TIMEOUT=155, TIMESTAMP=156, TO=157, TOP=158, 
		TOTALS=159, TRAILING=160, TRIM=161, TRUNCATE=162, TTL=163, TYPE=164, UNION=165, 
		UPDATE=166, USE=167, USING=168, UUID=169, VALUES=170, VIEW=171, VOLUME=172, 
		WATCH=173, WEEK=174, WHEN=175, WHERE=176, WITH=177, YEAR=178, JSON_FALSE=179, 
		JSON_TRUE=180, IDENTIFIER=181, FLOATING_LITERAL=182, OCTAL_LITERAL=183, 
		DECIMAL_LITERAL=184, HEXADECIMAL_LITERAL=185, STRING_LITERAL=186, ARROW=187, 
		ASTERISK=188, BACKQUOTE=189, BACKSLASH=190, COLON=191, COMMA=192, CONCAT=193, 
		DASH=194, DOT=195, EQ_DOUBLE=196, EQ_SINGLE=197, GE=198, GT=199, LBRACE=200, 
		LBRACKET=201, LE=202, LPAREN=203, LT=204, NOT_EQ=205, PERCENT=206, PLUS=207, 
		QUERY=208, QUOTE_DOUBLE=209, QUOTE_SINGLE=210, RBRACE=211, RBRACKET=212, 
		RPAREN=213, SEMICOLON=214, SLASH=215, UNDERSCORE=216, MULTI_LINE_COMMENT=217, 
		SINGLE_LINE_COMMENT=218, WHITESPACE=219, INTERVAL_TYPE=220;
	public static final int
		RULE_queryStmt = 0, RULE_query = 1, RULE_alterStmt = 2, RULE_alterTableClause = 3, 
		RULE_assignmentExprList = 4, RULE_assignmentExpr = 5, RULE_tableColumnPropertyType = 6, 
		RULE_partitionClause = 7, RULE_attachStmt = 8, RULE_checkStmt = 9, RULE_createStmt = 10, 
		RULE_dictionarySchemaClause = 11, RULE_dictionaryAttrDfnt = 12, RULE_dictionaryEngineClause = 13, 
		RULE_dictionaryPrimaryKeyClause = 14, RULE_dictionaryArgExpr = 15, RULE_sourceClause = 16, 
		RULE_lifetimeClause = 17, RULE_layoutClause = 18, RULE_rangeClause = 19, 
		RULE_dictionarySettingsClause = 20, RULE_clusterClause = 21, RULE_uuidClause = 22, 
		RULE_destinationClause = 23, RULE_subqueryClause = 24, RULE_tableSchemaClause = 25, 
		RULE_engineClause = 26, RULE_partitionByClause = 27, RULE_primaryKeyClause = 28, 
		RULE_sampleByClause = 29, RULE_ttlClause = 30, RULE_engineExpr = 31, RULE_tableElementExpr = 32, 
		RULE_tableColumnDfnt = 33, RULE_tableColumnPropertyExpr = 34, RULE_tableIndexDfnt = 35, 
		RULE_codecExpr = 36, RULE_codecArgExpr = 37, RULE_ttlExpr = 38, RULE_describeStmt = 39, 
		RULE_dropStmt = 40, RULE_existsStmt = 41, RULE_explainStmt = 42, RULE_insertStmt = 43, 
		RULE_columnsClause = 44, RULE_dataClause = 45, RULE_killStmt = 46, RULE_optimizeStmt = 47, 
		RULE_renameStmt = 48, RULE_selectUnionStmt = 49, RULE_selectStmtWithParens = 50, 
		RULE_selectStmt = 51, RULE_withClause = 52, RULE_topClause = 53, RULE_fromClause = 54, 
		RULE_arrayJoinClause = 55, RULE_prewhereClause = 56, RULE_whereClause = 57, 
		RULE_groupByClause = 58, RULE_havingClause = 59, RULE_orderByClause = 60, 
		RULE_limitByClause = 61, RULE_limitClause = 62, RULE_settingsClause = 63, 
		RULE_commentClause = 64, RULE_joinExpr = 65, RULE_joinOp = 66, RULE_joinOpCross = 67, 
		RULE_joinConstraintClause = 68, RULE_sampleClause = 69, RULE_limitExpr = 70, 
		RULE_orderExprList = 71, RULE_orderExpr = 72, RULE_ratioExpr = 73, RULE_settingExprList = 74, 
		RULE_settingExpr = 75, RULE_setStmt = 76, RULE_showStmt = 77, RULE_systemStmt = 78, 
		RULE_truncateStmt = 79, RULE_useStmt = 80, RULE_watchStmt = 81, RULE_columnTypeExpr = 82, 
		RULE_columnExprList = 83, RULE_columnsExpr = 84, RULE_columnExpr = 85, 
		RULE_columnArgList = 86, RULE_columnArgExpr = 87, RULE_columnLambdaExpr = 88, 
		RULE_columnIdentifier = 89, RULE_nestedIdentifier = 90, RULE_tableExpr = 91, 
		RULE_tableFunctionExpr = 92, RULE_tableIdentifier = 93, RULE_tableArgList = 94, 
		RULE_tableArgExpr = 95, RULE_databaseIdentifier = 96, RULE_floatingLiteral = 97, 
		RULE_numberLiteral = 98, RULE_literal = 99, RULE_interval = 100, RULE_keyword = 101, 
		RULE_keywordForAlias = 102, RULE_alias = 103, RULE_identifier = 104, RULE_columnType = 105, 
		RULE_columnNameIdentifier = 106, RULE_functionIdentifier = 107, RULE_identifierOrNull = 108, 
		RULE_enumValue = 109;
	public static final String[] ruleNames = {
		"queryStmt", "query", "alterStmt", "alterTableClause", "assignmentExprList", 
		"assignmentExpr", "tableColumnPropertyType", "partitionClause", "attachStmt", 
		"checkStmt", "createStmt", "dictionarySchemaClause", "dictionaryAttrDfnt", 
		"dictionaryEngineClause", "dictionaryPrimaryKeyClause", "dictionaryArgExpr", 
		"sourceClause", "lifetimeClause", "layoutClause", "rangeClause", "dictionarySettingsClause", 
		"clusterClause", "uuidClause", "destinationClause", "subqueryClause", 
		"tableSchemaClause", "engineClause", "partitionByClause", "primaryKeyClause", 
		"sampleByClause", "ttlClause", "engineExpr", "tableElementExpr", "tableColumnDfnt", 
		"tableColumnPropertyExpr", "tableIndexDfnt", "codecExpr", "codecArgExpr", 
		"ttlExpr", "describeStmt", "dropStmt", "existsStmt", "explainStmt", "insertStmt", 
		"columnsClause", "dataClause", "killStmt", "optimizeStmt", "renameStmt", 
		"selectUnionStmt", "selectStmtWithParens", "selectStmt", "withClause", 
		"topClause", "fromClause", "arrayJoinClause", "prewhereClause", "whereClause", 
		"groupByClause", "havingClause", "orderByClause", "limitByClause", "limitClause", 
		"settingsClause", "commentClause", "joinExpr", "joinOp", "joinOpCross", 
		"joinConstraintClause", "sampleClause", "limitExpr", "orderExprList", 
		"orderExpr", "ratioExpr", "settingExprList", "settingExpr", "setStmt", 
		"showStmt", "systemStmt", "truncateStmt", "useStmt", "watchStmt", "columnTypeExpr", 
		"columnExprList", "columnsExpr", "columnExpr", "columnArgList", "columnArgExpr", 
		"columnLambdaExpr", "columnIdentifier", "nestedIdentifier", "tableExpr", 
		"tableFunctionExpr", "tableIdentifier", "tableArgList", "tableArgExpr", 
		"databaseIdentifier", "floatingLiteral", "numberLiteral", "literal", "interval", 
		"keyword", "keywordForAlias", "alias", "identifier", "columnType", "columnNameIdentifier", 
		"functionIdentifier", "identifierOrNull", "enumValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'false'", 
		"'true'", null, null, null, null, null, null, "'->'", "'*'", "'`'", "'\\'", 
		"':'", "','", "'||'", "'-'", "'.'", "'=='", "'='", "'>='", "'>'", "'{'", 
		"'['", "'<='", "'('", "'<'", null, "'%'", "'+'", "'?'", "'\"'", "'''", 
		"'}'", "']'", "')'", "';'", "'/'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ADD", "AFTER", "ALIAS", "ALL", "ALTER", "AND", "ANTI", "ANY", "ARRAY", 
		"AS", "ASCENDING", "ASOF", "ASYNC", "ATTACH", "BETWEEN", "BOTH", "BY", 
		"CASE", "CAST", "CHECK", "CLEAR", "CLUSTER", "CODEC", "COLLATE", "COLUMN", 
		"COMMENT", "CONSTRAINT", "CREATE", "CROSS", "CUBE", "DATABASE", "DATABASES", 
		"DATE", "DAY", "DEDUPLICATE", "DEFAULT", "DELAY", "DELETE", "DESC", "DESCENDING", 
		"DESCRIBE", "DETACH", "DICTIONARIES", "DICTIONARY", "DISK", "DISTINCT", 
		"DISTRIBUTED", "DROP", "ELSE", "END", "ENGINE", "EVENTS", "EXISTS", "EXPLAIN", 
		"EXPRESSION", "EXTRACT", "FETCHES", "FINAL", "FIRST", "FLUSH", "FOR", 
		"FORMAT", "FREEZE", "FROM", "FULL", "FUNCTION", "GLOBAL", "GRANULARITY", 
		"GROUP", "HAVING", "HIERARCHICAL", "HOUR", "ID", "IF", "ILIKE", "IN", 
		"INDEX", "INF", "INJECTIVE", "INNER", "INSERT", "INTERVAL", "INTO", "IS", 
		"IS_OBJECT_ID", "JOIN", "KEY", "KILL", "LAST", "LAYOUT", "LEADING", "LEFT", 
		"LIFETIME", "LIKE", "LIMIT", "LIVE", "LOCAL", "LOGS", "MATERIALIZED", 
		"MAX", "MERGES", "MIN", "MINUTE", "MODIFY", "MONTH", "MOVE", "MUTATION", 
		"NAN_SQL", "NO", "NOT", "NULL_SQL", "NULLS", "OFFSET", "ON", "OPTIMIZE", 
		"OR", "ORDER", "OUTER", "OUTFILE", "PARTITION", "POPULATE", "PREWHERE", 
		"PRIMARY", "QUARTER", "RANGE", "RELOAD", "REMOVE", "RENAME", "REPLACE", 
		"REPLICA", "REPLICATED", "RIGHT", "ROLLUP", "SAMPLE", "SECOND", "SELECT", 
		"SEMI", "SENDS", "SET", "SETTINGS", "SHOW", "SOURCE", "START", "STOP", 
		"SUBSTRING", "SYNC", "SYNTAX", "SYSTEM", "TABLE", "TABLES", "TEMPORARY", 
		"TEST", "THEN", "TIES", "TIMEOUT", "TIMESTAMP", "TO", "TOP", "TOTALS", 
		"TRAILING", "TRIM", "TRUNCATE", "TTL", "TYPE", "UNION", "UPDATE", "USE", 
		"USING", "UUID", "VALUES", "VIEW", "VOLUME", "WATCH", "WEEK", "WHEN", 
		"WHERE", "WITH", "YEAR", "JSON_FALSE", "JSON_TRUE", "IDENTIFIER", "FLOATING_LITERAL", 
		"OCTAL_LITERAL", "DECIMAL_LITERAL", "HEXADECIMAL_LITERAL", "STRING_LITERAL", 
		"ARROW", "ASTERISK", "BACKQUOTE", "BACKSLASH", "COLON", "COMMA", "CONCAT", 
		"DASH", "DOT", "EQ_DOUBLE", "EQ_SINGLE", "GE", "GT", "LBRACE", "LBRACKET", 
		"LE", "LPAREN", "LT", "NOT_EQ", "PERCENT", "PLUS", "QUERY", "QUOTE_DOUBLE", 
		"QUOTE_SINGLE", "RBRACE", "RBRACKET", "RPAREN", "SEMICOLON", "SLASH", 
		"UNDERSCORE", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "WHITESPACE", 
		"INTERVAL_TYPE"
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

	@Override
	public String getGrammarFileName() { return "ClickHouseParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClickHouseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryStmtContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public QueryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterQueryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitQueryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitQueryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryStmtContext queryStmt() throws RecognitionException {
		QueryStmtContext _localctx = new QueryStmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryStmt);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
			case ATTACH:
			case CHECK:
			case CREATE:
			case DESC:
			case DESCRIBE:
			case DETACH:
			case DROP:
			case EXISTS:
			case EXPLAIN:
			case KILL:
			case OPTIMIZE:
			case RENAME:
			case SELECT:
			case SET:
			case SHOW:
			case SYSTEM:
			case TRUNCATE:
			case USE:
			case WATCH:
			case WITH:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				query();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(221);
					match(INTO);
					setState(222);
					match(OUTFILE);
					setState(223);
					match(STRING_LITERAL);
					}
				}

				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORMAT) {
					{
					setState(226);
					match(FORMAT);
					setState(227);
					identifierOrNull();
					}
				}

				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(230);
					match(SEMICOLON);
					}
				}

				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				insertStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public AlterStmtContext alterStmt() {
			return getRuleContext(AlterStmtContext.class,0);
		}
		public AttachStmtContext attachStmt() {
			return getRuleContext(AttachStmtContext.class,0);
		}
		public CheckStmtContext checkStmt() {
			return getRuleContext(CheckStmtContext.class,0);
		}
		public CreateStmtContext createStmt() {
			return getRuleContext(CreateStmtContext.class,0);
		}
		public DescribeStmtContext describeStmt() {
			return getRuleContext(DescribeStmtContext.class,0);
		}
		public DropStmtContext dropStmt() {
			return getRuleContext(DropStmtContext.class,0);
		}
		public ExistsStmtContext existsStmt() {
			return getRuleContext(ExistsStmtContext.class,0);
		}
		public ExplainStmtContext explainStmt() {
			return getRuleContext(ExplainStmtContext.class,0);
		}
		public KillStmtContext killStmt() {
			return getRuleContext(KillStmtContext.class,0);
		}
		public OptimizeStmtContext optimizeStmt() {
			return getRuleContext(OptimizeStmtContext.class,0);
		}
		public RenameStmtContext renameStmt() {
			return getRuleContext(RenameStmtContext.class,0);
		}
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public ShowStmtContext showStmt() {
			return getRuleContext(ShowStmtContext.class,0);
		}
		public SystemStmtContext systemStmt() {
			return getRuleContext(SystemStmtContext.class,0);
		}
		public TruncateStmtContext truncateStmt() {
			return getRuleContext(TruncateStmtContext.class,0);
		}
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public WatchStmtContext watchStmt() {
			return getRuleContext(WatchStmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				alterStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				attachStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				checkStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				createStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				describeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				dropStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				existsStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				explainStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				killStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(245);
				optimizeStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(246);
				renameStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(247);
				selectUnionStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(248);
				setStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(249);
				showStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(250);
				systemStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(251);
				truncateStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(252);
				useStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(253);
				watchStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStmtContext extends ParserRuleContext {
		public AlterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStmt; }
	 
		public AlterStmtContext() { }
		public void copyFrom(AlterStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableStmtContext extends AlterStmtContext {
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<AlterTableClauseContext> alterTableClause() {
			return getRuleContexts(AlterTableClauseContext.class);
		}
		public AlterTableClauseContext alterTableClause(int i) {
			return getRuleContext(AlterTableClauseContext.class,i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AlterTableStmtContext(AlterStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterStmtContext alterStmt() throws RecognitionException {
		AlterStmtContext _localctx = new AlterStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterStmt);
		int _la;
		try {
			_localctx = new AlterTableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ALTER);
			setState(257);
			match(TABLE);
			setState(258);
			tableIdentifier();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(259);
				clusterClause();
				}
			}

			setState(262);
			alterTableClause();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(264);
				alterTableClause();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableClauseContext extends ParserRuleContext {
		public AlterTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableClause; }
	 
		public AlterTableClauseContext() { }
		public void copyFrom(AlterTableClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableClauseReplaceContext extends AlterTableClauseContext {
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseReplaceContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseReplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseReplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseReplace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRenameContext extends AlterTableClauseContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseRenameContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseFreezePartitionContext extends AlterTableClauseContext {
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseFreezePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseFreezePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseFreezePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseFreezePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyOrderByContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseModifyOrderByContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseRemoveTTLContext extends AlterTableClauseContext {
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public AlterTableClauseRemoveTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseRemoveTTL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseRemoveTTL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseRemoveTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseUpdateContext extends AlterTableClauseContext {
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public AssignmentExprListContext assignmentExprList() {
			return getRuleContext(AssignmentExprListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AlterTableClauseUpdateContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyRemoveContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TableColumnPropertyTypeContext tableColumnPropertyType() {
			return getRuleContext(TableColumnPropertyTypeContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyRemoveContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDeleteContext extends AlterTableClauseContext {
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AlterTableClauseDeleteContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCodecContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCodecContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyCodec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyCodec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyCodec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseCommentContext extends AlterTableClauseContext {
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAttachContext extends AlterTableClauseContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseAttachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAttach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAttach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAttach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropColumnContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseClearContext extends AlterTableClauseContext {
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseClearContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseClear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseClear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseClear(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDetachContext extends AlterTableClauseContext {
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDetachContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDetach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDetach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDetach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropIndexContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseDropIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddIndexContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddIndexContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAddIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAddIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseDropPartitionContext extends AlterTableClauseContext {
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public AlterTableClauseDropPartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseDropPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseDropPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseDropPartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyCommentContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public AlterTableClauseModifyCommentContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseModifyTTLContext extends AlterTableClauseContext {
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TtlClauseContext ttlClause() {
			return getRuleContext(TtlClauseContext.class,0);
		}
		public AlterTableClauseModifyTTLContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseModifyTTL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseModifyTTL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseModifyTTL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseMovePartitionContext extends AlterTableClauseContext {
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public AlterTableClauseMovePartitionContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseMovePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseMovePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseMovePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableClauseAddColumnContext extends AlterTableClauseContext {
		public TerminalNode ADD() { return getToken(ClickHouseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public AlterTableClauseAddColumnContext(AlterTableClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlterTableClauseAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlterTableClauseAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlterTableClauseAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableClauseContext alterTableClause() throws RecognitionException {
		AlterTableClauseContext _localctx = new AlterTableClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alterTableClause);
		int _la;
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new AlterTableClauseAddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(ADD);
				setState(271);
				match(COLUMN);
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(272);
					match(IF);
					setState(273);
					match(NOT);
					setState(274);
					match(EXISTS);
					}
					break;
				}
				setState(277);
				tableColumnDfnt();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(278);
					match(AFTER);
					setState(279);
					nestedIdentifier();
					}
				}

				}
				break;
			case 2:
				_localctx = new AlterTableClauseAddIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(ADD);
				setState(283);
				match(INDEX);
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(284);
					match(IF);
					setState(285);
					match(NOT);
					setState(286);
					match(EXISTS);
					}
					break;
				}
				setState(289);
				tableIndexDfnt();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(290);
					match(AFTER);
					setState(291);
					nestedIdentifier();
					}
				}

				}
				break;
			case 3:
				_localctx = new AlterTableClauseAttachContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(ATTACH);
				setState(295);
				partitionClause();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(296);
					match(FROM);
					setState(297);
					tableIdentifier();
					}
				}

				}
				break;
			case 4:
				_localctx = new AlterTableClauseClearContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(CLEAR);
				setState(301);
				match(COLUMN);
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(302);
					match(IF);
					setState(303);
					match(EXISTS);
					}
					break;
				}
				setState(306);
				nestedIdentifier();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(307);
					match(IN);
					setState(308);
					partitionClause();
					}
				}

				}
				break;
			case 5:
				_localctx = new AlterTableClauseCommentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(COMMENT);
				setState(312);
				match(COLUMN);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(313);
					match(IF);
					setState(314);
					match(EXISTS);
					}
					break;
				}
				setState(317);
				nestedIdentifier();
				setState(318);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				_localctx = new AlterTableClauseDeleteContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				match(DELETE);
				setState(321);
				match(WHERE);
				setState(322);
				columnExpr(0);
				}
				break;
			case 7:
				_localctx = new AlterTableClauseDetachContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(323);
				match(DETACH);
				setState(324);
				partitionClause();
				}
				break;
			case 8:
				_localctx = new AlterTableClauseDropColumnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(325);
				match(DROP);
				setState(326);
				match(COLUMN);
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(327);
					match(IF);
					setState(328);
					match(EXISTS);
					}
					break;
				}
				setState(331);
				nestedIdentifier();
				}
				break;
			case 9:
				_localctx = new AlterTableClauseDropIndexContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(332);
				match(DROP);
				setState(333);
				match(INDEX);
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(334);
					match(IF);
					setState(335);
					match(EXISTS);
					}
					break;
				}
				setState(338);
				nestedIdentifier();
				}
				break;
			case 10:
				_localctx = new AlterTableClauseDropPartitionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(339);
				match(DROP);
				setState(340);
				partitionClause();
				}
				break;
			case 11:
				_localctx = new AlterTableClauseFreezePartitionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(341);
				match(FREEZE);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(342);
					partitionClause();
					}
				}

				}
				break;
			case 12:
				_localctx = new AlterTableClauseModifyCodecContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(345);
				match(MODIFY);
				setState(346);
				match(COLUMN);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(347);
					match(IF);
					setState(348);
					match(EXISTS);
					}
					break;
				}
				setState(351);
				nestedIdentifier();
				setState(352);
				codecExpr();
				}
				break;
			case 13:
				_localctx = new AlterTableClauseModifyCommentContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(354);
				match(MODIFY);
				setState(355);
				match(COLUMN);
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(356);
					match(IF);
					setState(357);
					match(EXISTS);
					}
					break;
				}
				setState(360);
				nestedIdentifier();
				setState(361);
				match(COMMENT);
				setState(362);
				match(STRING_LITERAL);
				}
				break;
			case 14:
				_localctx = new AlterTableClauseModifyRemoveContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(364);
				match(MODIFY);
				setState(365);
				match(COLUMN);
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(366);
					match(IF);
					setState(367);
					match(EXISTS);
					}
					break;
				}
				setState(370);
				nestedIdentifier();
				setState(371);
				match(REMOVE);
				setState(372);
				tableColumnPropertyType();
				}
				break;
			case 15:
				_localctx = new AlterTableClauseModifyContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(374);
				match(MODIFY);
				setState(375);
				match(COLUMN);
				setState(378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(376);
					match(IF);
					setState(377);
					match(EXISTS);
					}
					break;
				}
				setState(380);
				tableColumnDfnt();
				}
				break;
			case 16:
				_localctx = new AlterTableClauseModifyOrderByContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(381);
				match(MODIFY);
				setState(382);
				match(ORDER);
				setState(383);
				match(BY);
				setState(384);
				columnExpr(0);
				}
				break;
			case 17:
				_localctx = new AlterTableClauseModifyTTLContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(385);
				match(MODIFY);
				setState(386);
				ttlClause();
				}
				break;
			case 18:
				_localctx = new AlterTableClauseMovePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(387);
				match(MOVE);
				setState(388);
				partitionClause();
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(389);
					match(TO);
					setState(390);
					match(DISK);
					setState(391);
					match(STRING_LITERAL);
					}
					break;
				case 2:
					{
					setState(392);
					match(TO);
					setState(393);
					match(VOLUME);
					setState(394);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(395);
					match(TO);
					setState(396);
					match(TABLE);
					setState(397);
					tableIdentifier();
					}
					break;
				}
				}
				break;
			case 19:
				_localctx = new AlterTableClauseRemoveTTLContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(400);
				match(REMOVE);
				setState(401);
				match(TTL);
				}
				break;
			case 20:
				_localctx = new AlterTableClauseRenameContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(402);
				match(RENAME);
				setState(403);
				match(COLUMN);
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(404);
					match(IF);
					setState(405);
					match(EXISTS);
					}
					break;
				}
				setState(408);
				nestedIdentifier();
				setState(409);
				match(TO);
				setState(410);
				nestedIdentifier();
				}
				break;
			case 21:
				_localctx = new AlterTableClauseReplaceContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(412);
				match(REPLACE);
				setState(413);
				partitionClause();
				setState(414);
				match(FROM);
				setState(415);
				tableIdentifier();
				}
				break;
			case 22:
				_localctx = new AlterTableClauseUpdateContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(417);
				match(UPDATE);
				setState(418);
				assignmentExprList();
				setState(419);
				whereClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExprListContext extends ParserRuleContext {
		public List<AssignmentExprContext> assignmentExpr() {
			return getRuleContexts(AssignmentExprContext.class);
		}
		public AssignmentExprContext assignmentExpr(int i) {
			return getRuleContext(AssignmentExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public AssignmentExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAssignmentExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAssignmentExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAssignmentExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprListContext assignmentExprList() throws RecognitionException {
		AssignmentExprListContext _localctx = new AssignmentExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			assignmentExpr();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(424);
				match(COMMA);
				setState(425);
				assignmentExpr();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExprContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			nestedIdentifier();
			setState(432);
			match(EQ_SINGLE);
			setState(433);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnPropertyTypeContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TableColumnPropertyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableColumnPropertyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableColumnPropertyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnPropertyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyTypeContext tableColumnPropertyType() throws RecognitionException {
		TableColumnPropertyTypeContext _localctx = new TableColumnPropertyTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableColumnPropertyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << CODEC) | (1L << COMMENT) | (1L << DEFAULT))) != 0) || _la==MATERIALIZED || _la==TTL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPartitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPartitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partitionClause);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(PARTITION);
				setState(438);
				columnExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(PARTITION);
				setState(440);
				match(ID);
				setState(441);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttachStmtContext extends ParserRuleContext {
		public AttachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachStmt; }
	 
		public AttachStmtContext() { }
		public void copyFrom(AttachStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttachDictionaryStmtContext extends AttachStmtContext {
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public AttachDictionaryStmtContext(AttachStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAttachDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAttachDictionaryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAttachDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttachStmtContext attachStmt() throws RecognitionException {
		AttachStmtContext _localctx = new AttachStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attachStmt);
		int _la;
		try {
			_localctx = new AttachDictionaryStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(ATTACH);
			setState(445);
			match(DICTIONARY);
			setState(446);
			tableIdentifier();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(447);
				clusterClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckStmtContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public CheckStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCheckStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCheckStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCheckStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckStmtContext checkStmt() throws RecognitionException {
		CheckStmtContext _localctx = new CheckStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_checkStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(CHECK);
			setState(451);
			match(TABLE);
			setState(452);
			tableIdentifier();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(453);
				partitionClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateStmtContext extends ParserRuleContext {
		public CreateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStmt; }
	 
		public CreateStmtContext() { }
		public void copyFrom(CreateStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateViewStmtContext extends CreateStmtContext {
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public CreateViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateViewStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDictionaryStmtContext extends CreateStmtContext {
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DictionarySchemaClauseContext dictionarySchemaClause() {
			return getRuleContext(DictionarySchemaClauseContext.class,0);
		}
		public DictionaryEngineClauseContext dictionaryEngineClause() {
			return getRuleContext(DictionaryEngineClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public CreateDictionaryStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateDictionaryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseStmtContext extends CreateStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public CreateDatabaseStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateLiveViewStmtContext extends CreateStmtContext {
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public CreateLiveViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateLiveViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateLiveViewStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateLiveViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMaterializedViewStmtContext extends CreateStmtContext {
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public DestinationClauseContext destinationClause() {
			return getRuleContext(DestinationClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public CreateMaterializedViewStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateMaterializedViewStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateMaterializedViewStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateMaterializedViewStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableStmtContext extends CreateStmtContext {
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public UuidClauseContext uuidClause() {
			return getRuleContext(UuidClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TableSchemaClauseContext tableSchemaClause() {
			return getRuleContext(TableSchemaClauseContext.class,0);
		}
		public EngineClauseContext engineClause() {
			return getRuleContext(EngineClauseContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public CreateTableStmtContext(CreateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStmtContext createStmt() throws RecognitionException {
		CreateStmtContext _localctx = new CreateStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createStmt);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new CreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
				match(DATABASE);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(458);
					match(IF);
					setState(459);
					match(NOT);
					setState(460);
					match(EXISTS);
					}
				}

				setState(463);
				databaseIdentifier();
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(464);
					clusterClause();
					}
				}

				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(467);
					engineExpr();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(471);
				match(DICTIONARY);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(472);
					match(IF);
					setState(473);
					match(NOT);
					setState(474);
					match(EXISTS);
					}
				}

				setState(477);
				tableIdentifier();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(478);
					uuidClause();
					}
				}

				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(481);
					clusterClause();
					}
				}

				setState(484);
				dictionarySchemaClause();
				setState(485);
				dictionaryEngineClause();
				}
				break;
			case 3:
				_localctx = new CreateLiveViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(488);
				match(LIVE);
				setState(489);
				match(VIEW);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(490);
					match(IF);
					setState(491);
					match(NOT);
					setState(492);
					match(EXISTS);
					}
				}

				setState(495);
				tableIdentifier();
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(496);
					uuidClause();
					}
				}

				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(499);
					clusterClause();
					}
				}

				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(502);
					match(WITH);
					setState(503);
					match(TIMEOUT);
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DECIMAL_LITERAL) {
						{
						setState(504);
						match(DECIMAL_LITERAL);
						}
					}

					}
				}

				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(509);
					destinationClause();
					}
				}

				setState(513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(512);
					tableSchemaClause();
					}
					break;
				}
				setState(515);
				subqueryClause();
				}
				break;
			case 4:
				_localctx = new CreateMaterializedViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(518);
				match(MATERIALIZED);
				setState(519);
				match(VIEW);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(520);
					match(IF);
					setState(521);
					match(NOT);
					setState(522);
					match(EXISTS);
					}
				}

				setState(525);
				tableIdentifier();
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(526);
					uuidClause();
					}
				}

				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(529);
					clusterClause();
					}
				}

				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==LPAREN) {
					{
					setState(532);
					tableSchemaClause();
					}
				}

				setState(540);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TO:
					{
					setState(535);
					destinationClause();
					}
					break;
				case ENGINE:
					{
					setState(536);
					engineClause();
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POPULATE) {
						{
						setState(537);
						match(POPULATE);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(542);
				subqueryClause();
				}
				break;
			case 5:
				_localctx = new CreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(545);
					match(TEMPORARY);
					}
				}

				setState(548);
				match(TABLE);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(549);
					match(IF);
					setState(550);
					match(NOT);
					setState(551);
					match(EXISTS);
					}
				}

				setState(554);
				tableIdentifier();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(555);
					uuidClause();
					}
				}

				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(558);
					clusterClause();
					}
				}

				setState(562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(561);
					tableSchemaClause();
					}
					break;
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENGINE) {
					{
					setState(564);
					engineClause();
					}
				}

				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(567);
					subqueryClause();
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateViewStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(570);
				_la = _input.LA(1);
				if ( !(_la==ATTACH || _la==CREATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(571);
					match(OR);
					setState(572);
					match(REPLACE);
					}
				}

				setState(575);
				match(VIEW);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(576);
					match(IF);
					setState(577);
					match(NOT);
					setState(578);
					match(EXISTS);
					}
				}

				setState(581);
				tableIdentifier();
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UUID) {
					{
					setState(582);
					uuidClause();
					}
				}

				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(585);
					clusterClause();
					}
				}

				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(588);
					tableSchemaClause();
					}
					break;
				}
				setState(591);
				subqueryClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionarySchemaClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<DictionaryAttrDfntContext> dictionaryAttrDfnt() {
			return getRuleContexts(DictionaryAttrDfntContext.class);
		}
		public DictionaryAttrDfntContext dictionaryAttrDfnt(int i) {
			return getRuleContext(DictionaryAttrDfntContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public DictionarySchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySchemaClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionarySchemaClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionarySchemaClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionarySchemaClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySchemaClauseContext dictionarySchemaClause() throws RecognitionException {
		DictionarySchemaClauseContext _localctx = new DictionarySchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dictionarySchemaClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(LPAREN);
			setState(596);
			dictionaryAttrDfnt();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(597);
				match(COMMA);
				setState(598);
				dictionaryAttrDfnt();
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryAttrDfntContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(ClickHouseParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(ClickHouseParser.DEFAULT, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> EXPRESSION() { return getTokens(ClickHouseParser.EXPRESSION); }
		public TerminalNode EXPRESSION(int i) {
			return getToken(ClickHouseParser.EXPRESSION, i);
		}
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> HIERARCHICAL() { return getTokens(ClickHouseParser.HIERARCHICAL); }
		public TerminalNode HIERARCHICAL(int i) {
			return getToken(ClickHouseParser.HIERARCHICAL, i);
		}
		public List<TerminalNode> INJECTIVE() { return getTokens(ClickHouseParser.INJECTIVE); }
		public TerminalNode INJECTIVE(int i) {
			return getToken(ClickHouseParser.INJECTIVE, i);
		}
		public List<TerminalNode> IS_OBJECT_ID() { return getTokens(ClickHouseParser.IS_OBJECT_ID); }
		public TerminalNode IS_OBJECT_ID(int i) {
			return getToken(ClickHouseParser.IS_OBJECT_ID, i);
		}
		public DictionaryAttrDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryAttrDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryAttrDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryAttrDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryAttrDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryAttrDfntContext dictionaryAttrDfnt() throws RecognitionException {
		DictionaryAttrDfntContext _localctx = new DictionaryAttrDfntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dictionaryAttrDfnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			identifier();
			setState(607);
			columnTypeExpr();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (DEFAULT - 36)) | (1L << (EXPRESSION - 36)) | (1L << (HIERARCHICAL - 36)) | (1L << (INJECTIVE - 36)) | (1L << (IS_OBJECT_ID - 36)))) != 0)) {
				{
				setState(615);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(608);
					match(DEFAULT);
					setState(609);
					literal();
					}
					break;
				case EXPRESSION:
					{
					setState(610);
					match(EXPRESSION);
					setState(611);
					columnExpr(0);
					}
					break;
				case HIERARCHICAL:
					{
					setState(612);
					match(HIERARCHICAL);
					}
					break;
				case INJECTIVE:
					{
					setState(613);
					match(INJECTIVE);
					}
					break;
				case IS_OBJECT_ID:
					{
					setState(614);
					match(IS_OBJECT_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryEngineClauseContext extends ParserRuleContext {
		public DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() {
			return getRuleContext(DictionaryPrimaryKeyClauseContext.class,0);
		}
		public List<SourceClauseContext> sourceClause() {
			return getRuleContexts(SourceClauseContext.class);
		}
		public SourceClauseContext sourceClause(int i) {
			return getRuleContext(SourceClauseContext.class,i);
		}
		public List<LifetimeClauseContext> lifetimeClause() {
			return getRuleContexts(LifetimeClauseContext.class);
		}
		public LifetimeClauseContext lifetimeClause(int i) {
			return getRuleContext(LifetimeClauseContext.class,i);
		}
		public List<LayoutClauseContext> layoutClause() {
			return getRuleContexts(LayoutClauseContext.class);
		}
		public LayoutClauseContext layoutClause(int i) {
			return getRuleContext(LayoutClauseContext.class,i);
		}
		public List<RangeClauseContext> rangeClause() {
			return getRuleContexts(RangeClauseContext.class);
		}
		public RangeClauseContext rangeClause(int i) {
			return getRuleContext(RangeClauseContext.class,i);
		}
		public List<DictionarySettingsClauseContext> dictionarySettingsClause() {
			return getRuleContexts(DictionarySettingsClauseContext.class);
		}
		public DictionarySettingsClauseContext dictionarySettingsClause(int i) {
			return getRuleContext(DictionarySettingsClauseContext.class,i);
		}
		public DictionaryEngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryEngineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryEngineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryEngineClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryEngineClauseContext dictionaryEngineClause() throws RecognitionException {
		DictionaryEngineClauseContext _localctx = new DictionaryEngineClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dictionaryEngineClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(620);
				dictionaryPrimaryKeyClause();
				}
			}

			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LAYOUT - 90)) | (1L << (LIFETIME - 90)) | (1L << (RANGE - 90)) | (1L << (SETTINGS - 90)) | (1L << (SOURCE - 90)))) != 0)) {
				{
				setState(628);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SOURCE:
					{
					setState(623);
					sourceClause();
					}
					break;
				case LIFETIME:
					{
					setState(624);
					lifetimeClause();
					}
					break;
				case LAYOUT:
					{
					setState(625);
					layoutClause();
					}
					break;
				case RANGE:
					{
					setState(626);
					rangeClause();
					}
					break;
				case SETTINGS:
					{
					setState(627);
					dictionarySettingsClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryPrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public DictionaryPrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPrimaryKeyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryPrimaryKeyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryPrimaryKeyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() throws RecognitionException {
		DictionaryPrimaryKeyClauseContext _localctx = new DictionaryPrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dictionaryPrimaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(PRIMARY);
			setState(634);
			match(KEY);
			setState(635);
			columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryArgExprContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionaryArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionaryArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionaryArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionaryArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryArgExprContext dictionaryArgExpr() throws RecognitionException {
		DictionaryArgExprContext _localctx = new DictionaryArgExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dictionaryArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			identifier();
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(638);
				identifier();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(639);
					match(LPAREN);
					setState(640);
					match(RPAREN);
					}
				}

				}
				break;
			case INF:
			case NAN_SQL:
			case NULL_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case STRING_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				{
				setState(643);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceClauseContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public SourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSourceClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSourceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceClauseContext sourceClause() throws RecognitionException {
		SourceClauseContext _localctx = new SourceClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sourceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(SOURCE);
			setState(647);
			match(LPAREN);
			setState(648);
			identifier();
			setState(649);
			match(LPAREN);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(650);
				dictionaryArgExpr();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(656);
			match(RPAREN);
			setState(657);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LifetimeClauseContext extends ParserRuleContext {
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public LifetimeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLifetimeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLifetimeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLifetimeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeClauseContext lifetimeClause() throws RecognitionException {
		LifetimeClauseContext _localctx = new LifetimeClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lifetimeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(LIFETIME);
			setState(660);
			match(LPAREN);
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				{
				setState(661);
				match(DECIMAL_LITERAL);
				}
				break;
			case MIN:
				{
				setState(662);
				match(MIN);
				setState(663);
				match(DECIMAL_LITERAL);
				setState(664);
				match(MAX);
				setState(665);
				match(DECIMAL_LITERAL);
				}
				break;
			case MAX:
				{
				setState(666);
				match(MAX);
				setState(667);
				match(DECIMAL_LITERAL);
				setState(668);
				match(MIN);
				setState(669);
				match(DECIMAL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(672);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayoutClauseContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public List<DictionaryArgExprContext> dictionaryArgExpr() {
			return getRuleContexts(DictionaryArgExprContext.class);
		}
		public DictionaryArgExprContext dictionaryArgExpr(int i) {
			return getRuleContext(DictionaryArgExprContext.class,i);
		}
		public LayoutClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLayoutClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLayoutClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLayoutClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutClauseContext layoutClause() throws RecognitionException {
		LayoutClauseContext _localctx = new LayoutClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_layoutClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(LAYOUT);
			setState(675);
			match(LPAREN);
			setState(676);
			identifier();
			setState(677);
			match(LPAREN);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(678);
				dictionaryArgExpr();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			match(RPAREN);
			setState(685);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitRangeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(RANGE);
			setState(688);
			match(LPAREN);
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				{
				setState(689);
				match(MIN);
				setState(690);
				identifier();
				setState(691);
				match(MAX);
				setState(692);
				identifier();
				}
				break;
			case MAX:
				{
				setState(694);
				match(MAX);
				setState(695);
				identifier();
				setState(696);
				match(MIN);
				setState(697);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(701);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionarySettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public DictionarySettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionarySettingsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDictionarySettingsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDictionarySettingsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDictionarySettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionarySettingsClauseContext dictionarySettingsClause() throws RecognitionException {
		DictionarySettingsClauseContext _localctx = new DictionarySettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dictionarySettingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(SETTINGS);
			setState(704);
			match(LPAREN);
			setState(705);
			settingExprList();
			setState(706);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusterClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterClusterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitClusterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitClusterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusterClauseContext clusterClause() throws RecognitionException {
		ClusterClauseContext _localctx = new ClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_clusterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(ON);
			setState(709);
			match(CLUSTER);
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(710);
				identifier();
				}
				break;
			case STRING_LITERAL:
				{
				setState(711);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UuidClauseContext extends ParserRuleContext {
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public UuidClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uuidClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterUuidClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitUuidClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitUuidClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UuidClauseContext uuidClause() throws RecognitionException {
		UuidClauseContext _localctx = new UuidClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uuidClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(UUID);
			setState(715);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestinationClauseContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DestinationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDestinationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDestinationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDestinationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationClauseContext destinationClause() throws RecognitionException {
		DestinationClauseContext _localctx = new DestinationClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_destinationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(TO);
			setState(718);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public SubqueryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSubqueryClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSubqueryClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSubqueryClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryClauseContext subqueryClause() throws RecognitionException {
		SubqueryClauseContext _localctx = new SubqueryClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subqueryClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(AS);
			setState(721);
			selectUnionStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSchemaClauseContext extends ParserRuleContext {
		public TableSchemaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSchemaClause; }
	 
		public TableSchemaClauseContext() { }
		public void copyFrom(TableSchemaClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SchemaAsTableClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SchemaAsTableClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSchemaAsTableClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSchemaAsTableClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaAsTableClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaAsFunctionClauseContext extends TableSchemaClauseContext {
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public SchemaAsFunctionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSchemaAsFunctionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSchemaAsFunctionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaAsFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SchemaDescriptionClauseContext extends TableSchemaClauseContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<TableElementExprContext> tableElementExpr() {
			return getRuleContexts(TableElementExprContext.class);
		}
		public TableElementExprContext tableElementExpr(int i) {
			return getRuleContext(TableElementExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SchemaDescriptionClauseContext(TableSchemaClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSchemaDescriptionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSchemaDescriptionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSchemaDescriptionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSchemaClauseContext tableSchemaClause() throws RecognitionException {
		TableSchemaClauseContext _localctx = new TableSchemaClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableSchemaClause);
		int _la;
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new SchemaDescriptionClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(LPAREN);
				setState(724);
				tableElementExpr();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(725);
					match(COMMA);
					setState(726);
					tableElementExpr();
					}
					}
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(732);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SchemaAsTableClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(AS);
				setState(735);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new SchemaAsFunctionClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				match(AS);
				setState(737);
				tableFunctionExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EngineClauseContext extends ParserRuleContext {
		public EngineExprContext engineExpr() {
			return getRuleContext(EngineExprContext.class,0);
		}
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public List<PartitionByClauseContext> partitionByClause() {
			return getRuleContexts(PartitionByClauseContext.class);
		}
		public PartitionByClauseContext partitionByClause(int i) {
			return getRuleContext(PartitionByClauseContext.class,i);
		}
		public List<PrimaryKeyClauseContext> primaryKeyClause() {
			return getRuleContexts(PrimaryKeyClauseContext.class);
		}
		public PrimaryKeyClauseContext primaryKeyClause(int i) {
			return getRuleContext(PrimaryKeyClauseContext.class,i);
		}
		public List<SampleByClauseContext> sampleByClause() {
			return getRuleContexts(SampleByClauseContext.class);
		}
		public SampleByClauseContext sampleByClause(int i) {
			return getRuleContext(SampleByClauseContext.class,i);
		}
		public List<TtlClauseContext> ttlClause() {
			return getRuleContexts(TtlClauseContext.class);
		}
		public TtlClauseContext ttlClause(int i) {
			return getRuleContext(TtlClauseContext.class,i);
		}
		public List<SettingsClauseContext> settingsClause() {
			return getRuleContexts(SettingsClauseContext.class);
		}
		public SettingsClauseContext settingsClause(int i) {
			return getRuleContext(SettingsClauseContext.class,i);
		}
		public List<CommentClauseContext> commentClause() {
			return getRuleContexts(CommentClauseContext.class);
		}
		public CommentClauseContext commentClause(int i) {
			return getRuleContext(CommentClauseContext.class,i);
		}
		public EngineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterEngineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitEngineClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEngineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineClauseContext engineClause() throws RecognitionException {
		EngineClauseContext _localctx = new EngineClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_engineClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			engineExpr();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ORDER - 117)) | (1L << (PARTITION - 117)) | (1L << (PRIMARY - 117)) | (1L << (SAMPLE - 117)) | (1L << (SETTINGS - 117)) | (1L << (TTL - 117)))) != 0)) {
				{
				setState(748);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ORDER:
					{
					setState(741);
					orderByClause();
					}
					break;
				case PARTITION:
					{
					setState(742);
					partitionByClause();
					}
					break;
				case PRIMARY:
					{
					setState(743);
					primaryKeyClause();
					}
					break;
				case SAMPLE:
					{
					setState(744);
					sampleByClause();
					}
					break;
				case TTL:
					{
					setState(745);
					ttlClause();
					}
					break;
				case SETTINGS:
					{
					setState(746);
					settingsClause();
					}
					break;
				case COMMENT:
					{
					setState(747);
					commentClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPartitionByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPartitionByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(PARTITION);
			setState(754);
			match(BY);
			setState(755);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPrimaryKeyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPrimaryKeyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPrimaryKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyClauseContext primaryKeyClause() throws RecognitionException {
		PrimaryKeyClauseContext _localctx = new PrimaryKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primaryKeyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(PRIMARY);
			setState(758);
			match(KEY);
			setState(759);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleByClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public SampleByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSampleByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSampleByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSampleByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleByClauseContext sampleByClause() throws RecognitionException {
		SampleByClauseContext _localctx = new SampleByClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sampleByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(SAMPLE);
			setState(762);
			match(BY);
			setState(763);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TtlClauseContext extends ParserRuleContext {
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public List<TtlExprContext> ttlExpr() {
			return getRuleContexts(TtlExprContext.class);
		}
		public TtlExprContext ttlExpr(int i) {
			return getRuleContext(TtlExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TtlClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTtlClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTtlClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTtlClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlClauseContext ttlClause() throws RecognitionException {
		TtlClauseContext _localctx = new TtlClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ttlClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(TTL);
			setState(766);
			ttlExpr();
			setState(771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(767);
					match(COMMA);
					setState(768);
					ttlExpr();
					}
					} 
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EngineExprContext extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public IdentifierOrNullContext identifierOrNull() {
			return getRuleContext(IdentifierOrNullContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public EngineExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterEngineExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitEngineExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEngineExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineExprContext engineExpr() throws RecognitionException {
		EngineExprContext _localctx = new EngineExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_engineExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(ENGINE);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_SINGLE) {
				{
				setState(775);
				match(EQ_SINGLE);
				}
			}

			setState(778);
			identifierOrNull();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(779);
				match(LPAREN);
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)) | (1L << (INTERVAL_TYPE - 194)))) != 0)) {
					{
					setState(780);
					columnExprList();
					}
				}

				setState(783);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementExprContext extends ParserRuleContext {
		public TableElementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElementExpr; }
	 
		public TableElementExprContext() { }
		public void copyFrom(TableElementExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableElementExprConstraintContext extends TableElementExprContext {
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableElementExprConstraintContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprColumnContext extends TableElementExprContext {
		public TableColumnDfntContext tableColumnDfnt() {
			return getRuleContext(TableColumnDfntContext.class,0);
		}
		public TableElementExprColumnContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableElementExprIndexContext extends TableElementExprContext {
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TableIndexDfntContext tableIndexDfnt() {
			return getRuleContext(TableIndexDfntContext.class,0);
		}
		public TableElementExprIndexContext(TableElementExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableElementExprIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableElementExprIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableElementExprIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementExprContext tableElementExpr() throws RecognitionException {
		TableElementExprContext _localctx = new TableElementExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableElementExpr);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new TableElementExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				tableColumnDfnt();
				}
				break;
			case 2:
				_localctx = new TableElementExprConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(CONSTRAINT);
				setState(788);
				identifier();
				setState(789);
				match(CHECK);
				setState(790);
				columnExpr(0);
				}
				break;
			case 3:
				_localctx = new TableElementExprIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				match(INDEX);
				setState(793);
				tableIndexDfnt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TableColumnPropertyExprContext tableColumnPropertyExpr() {
			return getRuleContext(TableColumnPropertyExprContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public CodecExprContext codecExpr() {
			return getRuleContext(CodecExprContext.class,0);
		}
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TableColumnDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableColumnDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableColumnDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnDfntContext tableColumnDfnt() throws RecognitionException {
		TableColumnDfntContext _localctx = new TableColumnDfntContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableColumnDfnt);
		int _la;
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				nestedIdentifier();
				setState(797);
				columnTypeExpr();
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) {
					{
					setState(798);
					tableColumnPropertyExpr();
					}
				}

				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(801);
					match(COMMENT);
					setState(802);
					match(STRING_LITERAL);
					}
				}

				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(805);
					codecExpr();
					}
				}

				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(808);
					match(TTL);
					setState(809);
					columnExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				nestedIdentifier();
				setState(814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(813);
					columnTypeExpr();
					}
					break;
				}
				setState(816);
				tableColumnPropertyExpr();
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(817);
					match(COMMENT);
					setState(818);
					match(STRING_LITERAL);
					}
				}

				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEC) {
					{
					setState(821);
					codecExpr();
					}
				}

				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TTL) {
					{
					setState(824);
					match(TTL);
					setState(825);
					columnExpr(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnPropertyExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TableColumnPropertyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnPropertyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableColumnPropertyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableColumnPropertyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableColumnPropertyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnPropertyExprContext tableColumnPropertyExpr() throws RecognitionException {
		TableColumnPropertyExprContext _localctx = new TableColumnPropertyExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tableColumnPropertyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if ( !(_la==ALIAS || _la==DEFAULT || _la==MATERIALIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(831);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIndexDfntContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TableIndexDfntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexDfnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableIndexDfnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableIndexDfnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableIndexDfnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIndexDfntContext tableIndexDfnt() throws RecognitionException {
		TableIndexDfntContext _localctx = new TableIndexDfntContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableIndexDfnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			nestedIdentifier();
			setState(834);
			columnExpr(0);
			setState(835);
			match(TYPE);
			setState(836);
			columnTypeExpr();
			setState(837);
			match(GRANULARITY);
			setState(838);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodecExprContext extends ParserRuleContext {
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<CodecArgExprContext> codecArgExpr() {
			return getRuleContexts(CodecArgExprContext.class);
		}
		public CodecArgExprContext codecArgExpr(int i) {
			return getRuleContext(CodecArgExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public CodecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCodecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCodecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCodecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecExprContext codecExpr() throws RecognitionException {
		CodecExprContext _localctx = new CodecExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_codecExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(CODEC);
			setState(841);
			match(LPAREN);
			setState(842);
			codecArgExpr();
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(843);
				match(COMMA);
				setState(844);
				codecArgExpr();
				}
				}
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(850);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodecArgExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public CodecArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codecArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCodecArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCodecArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCodecArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodecArgExprContext codecArgExpr() throws RecognitionException {
		CodecArgExprContext _localctx = new CodecArgExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_codecArgExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			identifier();
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(853);
				match(LPAREN);
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)) | (1L << (INTERVAL_TYPE - 194)))) != 0)) {
					{
					setState(854);
					columnExprList();
					}
				}

				setState(857);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TtlExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TtlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTtlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTtlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTtlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TtlExprContext ttlExpr() throws RecognitionException {
		TtlExprContext _localctx = new TtlExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ttlExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			columnExpr(0);
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(861);
				match(DELETE);
				}
				break;
			case 2:
				{
				setState(862);
				match(TO);
				setState(863);
				match(DISK);
				setState(864);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(865);
				match(TO);
				setState(866);
				match(VOLUME);
				setState(867);
				match(STRING_LITERAL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeStmtContext extends ParserRuleContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public DescribeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDescribeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDescribeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDescribeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeStmtContext describeStmt() throws RecognitionException {
		DescribeStmtContext _localctx = new DescribeStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_describeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_la = _input.LA(1);
			if ( !(_la==DESC || _la==DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(871);
				match(TABLE);
				}
				break;
			}
			setState(874);
			tableExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropStmtContext extends ParserRuleContext {
		public DropStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStmt; }
	 
		public DropStmtContext() { }
		public void copyFrom(DropStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropDatabaseStmtContext extends DropStmtContext {
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public DropDatabaseStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDropDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDropDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDropDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableStmtContext extends DropStmtContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DropTableStmtContext(DropStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDropTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDropTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDropTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStmtContext dropStmt() throws RecognitionException {
		DropStmtContext _localctx = new DropStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dropStmt);
		int _la;
		try {
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new DropDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(877);
				match(DATABASE);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(878);
					match(IF);
					setState(879);
					match(EXISTS);
					}
				}

				setState(882);
				databaseIdentifier();
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(883);
					clusterClause();
					}
				}

				}
				break;
			case 2:
				_localctx = new DropTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				_la = _input.LA(1);
				if ( !(_la==DETACH || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(893);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DICTIONARY:
					{
					setState(887);
					match(DICTIONARY);
					}
					break;
				case TABLE:
				case TEMPORARY:
					{
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(888);
						match(TEMPORARY);
						}
					}

					setState(891);
					match(TABLE);
					}
					break;
				case VIEW:
					{
					setState(892);
					match(VIEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(895);
					match(IF);
					setState(896);
					match(EXISTS);
					}
				}

				setState(899);
				tableIdentifier();
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(900);
					clusterClause();
					}
				}

				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(903);
					match(NO);
					setState(904);
					match(DELAY);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsStmtContext extends ParserRuleContext {
		public ExistsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsStmt; }
	 
		public ExistsStmtContext() { }
		public void copyFrom(ExistsStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistsTableStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public ExistsTableStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExistsTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExistsTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExistsTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsDatabaseStmtContext extends ExistsStmtContext {
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ExistsDatabaseStmtContext(ExistsStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExistsDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExistsDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExistsDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsStmtContext existsStmt() throws RecognitionException {
		ExistsStmtContext _localctx = new ExistsStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_existsStmt);
		int _la;
		try {
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new ExistsDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				match(EXISTS);
				setState(910);
				match(DATABASE);
				setState(911);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ExistsTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(EXISTS);
				setState(919);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DICTIONARY:
					{
					setState(913);
					match(DICTIONARY);
					}
					break;
				case TABLE:
				case TEMPORARY:
					{
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPORARY) {
						{
						setState(914);
						match(TEMPORARY);
						}
					}

					setState(917);
					match(TABLE);
					}
					break;
				case VIEW:
					{
					setState(918);
					match(VIEW);
					}
					break;
				case IDENTIFIER:
					break;
				default:
					break;
				}
				setState(921);
				tableIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainStmtContext extends ParserRuleContext {
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExplainStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterExplainStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitExplainStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitExplainStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainStmtContext explainStmt() throws RecognitionException {
		ExplainStmtContext _localctx = new ExplainStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_explainStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(EXPLAIN);
			setState(925);
			match(SYNTAX);
			setState(926);
			query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public DataClauseContext dataClause() {
			return getRuleContext(DataClauseContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ColumnsClauseContext columnsClause() {
			return getRuleContext(ColumnsClauseContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterInsertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitInsertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_insertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(INSERT);
			setState(929);
			match(INTO);
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(930);
				match(TABLE);
				}
			}

			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(933);
				tableIdentifier();
				}
				break;
			case FUNCTION:
				{
				setState(934);
				match(FUNCTION);
				setState(935);
				tableFunctionExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(938);
				columnsClause();
				}
				break;
			}
			setState(941);
			dataClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<NestedIdentifierContext> nestedIdentifier() {
			return getRuleContexts(NestedIdentifierContext.class);
		}
		public NestedIdentifierContext nestedIdentifier(int i) {
			return getRuleContext(NestedIdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsClauseContext columnsClause() throws RecognitionException {
		ColumnsClauseContext _localctx = new ColumnsClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_columnsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(LPAREN);
			setState(944);
			nestedIdentifier();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(945);
				match(COMMA);
				setState(946);
				nestedIdentifier();
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(952);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataClauseContext extends ParserRuleContext {
		public DataClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataClause; }
	 
		public DataClauseContext() { }
		public void copyFrom(DataClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataClauseValuesContext extends DataClauseContext {
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public DataClauseValuesContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDataClauseValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDataClauseValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseValues(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseFormatContext extends DataClauseContext {
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataClauseFormatContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDataClauseFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDataClauseFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataClauseSelectContext extends DataClauseContext {
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ClickHouseParser.EOF, 0); }
		public TerminalNode SEMICOLON() { return getToken(ClickHouseParser.SEMICOLON, 0); }
		public DataClauseSelectContext(DataClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDataClauseSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDataClauseSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDataClauseSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataClauseContext dataClause() throws RecognitionException {
		DataClauseContext _localctx = new DataClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dataClause);
		int _la;
		try {
			setState(963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new DataClauseFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				match(FORMAT);
				setState(955);
				identifier();
				}
				break;
			case VALUES:
				_localctx = new DataClauseValuesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(VALUES);
				}
				break;
			case SELECT:
			case WITH:
			case LPAREN:
				_localctx = new DataClauseSelectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				selectUnionStmt();
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(958);
					match(SEMICOLON);
					}
				}

				setState(961);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillStmtContext extends ParserRuleContext {
		public KillStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killStmt; }
	 
		public KillStmtContext() { }
		public void copyFrom(KillStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KillMutationStmtContext extends KillStmtContext {
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public KillMutationStmtContext(KillStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterKillMutationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitKillMutationStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKillMutationStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KillStmtContext killStmt() throws RecognitionException {
		KillStmtContext _localctx = new KillStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_killStmt);
		int _la;
		try {
			_localctx = new KillMutationStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(KILL);
			setState(966);
			match(MUTATION);
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(967);
				clusterClause();
				}
			}

			setState(970);
			whereClause();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC || _la==SYNC || _la==TEST) {
				{
				setState(971);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==SYNC || _la==TEST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptimizeStmtContext extends ParserRuleContext {
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public OptimizeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimizeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOptimizeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOptimizeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOptimizeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptimizeStmtContext optimizeStmt() throws RecognitionException {
		OptimizeStmtContext _localctx = new OptimizeStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_optimizeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(OPTIMIZE);
			setState(975);
			match(TABLE);
			setState(976);
			tableIdentifier();
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(977);
				clusterClause();
				}
			}

			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(980);
				partitionClause();
				}
			}

			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(983);
				match(FINAL);
				}
			}

			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEDUPLICATE) {
				{
				setState(986);
				match(DEDUPLICATE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameStmtContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(ClickHouseParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(ClickHouseParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public RenameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterRenameStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitRenameStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRenameStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameStmtContext renameStmt() throws RecognitionException {
		RenameStmtContext _localctx = new RenameStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_renameStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(RENAME);
			setState(990);
			match(TABLE);
			setState(991);
			tableIdentifier();
			setState(992);
			match(TO);
			setState(993);
			tableIdentifier();
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(994);
				match(COMMA);
				setState(995);
				tableIdentifier();
				setState(996);
				match(TO);
				setState(997);
				tableIdentifier();
				}
				}
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1004);
				clusterClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectUnionStmtContext extends ParserRuleContext {
		public List<SelectStmtWithParensContext> selectStmtWithParens() {
			return getRuleContexts(SelectStmtWithParensContext.class);
		}
		public SelectStmtWithParensContext selectStmtWithParens(int i) {
			return getRuleContext(SelectStmtWithParensContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(ClickHouseParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(ClickHouseParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(ClickHouseParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(ClickHouseParser.ALL, i);
		}
		public SelectUnionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectUnionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSelectUnionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSelectUnionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectUnionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectUnionStmtContext selectUnionStmt() throws RecognitionException {
		SelectUnionStmtContext _localctx = new SelectUnionStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selectUnionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			selectStmtWithParens();
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(1008);
				match(UNION);
				setState(1009);
				match(ALL);
				setState(1010);
				selectStmtWithParens();
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtWithParensContext extends ParserRuleContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public SelectStmtWithParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmtWithParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSelectStmtWithParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSelectStmtWithParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectStmtWithParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtWithParensContext selectStmtWithParens() throws RecognitionException {
		SelectStmtWithParensContext _localctx = new SelectStmtWithParensContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectStmtWithParens);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				selectStmt();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				match(LPAREN);
				setState(1018);
				selectUnionStmt();
				setState(1019);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TopClauseContext topClause() {
			return getRuleContext(TopClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public ArrayJoinClauseContext arrayJoinClause() {
			return getRuleContext(ArrayJoinClauseContext.class,0);
		}
		public PrewhereClauseContext prewhereClause() {
			return getRuleContext(PrewhereClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(ClickHouseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(ClickHouseParser.WITH, i);
		}
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitByClauseContext limitByClause() {
			return getRuleContext(LimitByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SettingsClauseContext settingsClause() {
			return getRuleContext(SettingsClauseContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1023);
				withClause();
				}
			}

			setState(1026);
			match(SELECT);
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1027);
				match(DISTINCT);
				}
				break;
			}
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1030);
				topClause();
				}
				break;
			}
			setState(1033);
			columnExprList();
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1034);
				fromClause();
				}
			}

			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY || _la==INNER || _la==LEFT) {
				{
				setState(1037);
				arrayJoinClause();
				}
			}

			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREWHERE) {
				{
				setState(1040);
				prewhereClause();
				}
			}

			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1043);
				whereClause();
				}
			}

			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1046);
				groupByClause();
				}
			}

			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1049);
				match(WITH);
				setState(1050);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1053);
				match(WITH);
				setState(1054);
				match(TOTALS);
				}
			}

			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1057);
				havingClause();
				}
			}

			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1060);
				orderByClause();
				}
			}

			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1063);
				limitByClause();
				}
				break;
			}
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1066);
				limitClause();
				}
			}

			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETTINGS) {
				{
				setState(1069);
				settingsClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(WITH);
			setState(1073);
			columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopClauseContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TopClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTopClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTopClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTopClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopClauseContext topClause() throws RecognitionException {
		TopClauseContext _localctx = new TopClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_topClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(TOP);
			setState(1076);
			match(DECIMAL_LITERAL);
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1077);
				match(WITH);
				setState(1078);
				match(TIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(FROM);
			setState(1082);
			joinExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayJoinClauseContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public ArrayJoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayJoinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterArrayJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitArrayJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitArrayJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayJoinClauseContext arrayJoinClause() throws RecognitionException {
		ArrayJoinClauseContext _localctx = new ArrayJoinClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_arrayJoinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INNER || _la==LEFT) {
				{
				setState(1084);
				_la = _input.LA(1);
				if ( !(_la==INNER || _la==LEFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1087);
			match(ARRAY);
			setState(1088);
			match(JOIN);
			setState(1089);
			columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrewhereClauseContext extends ParserRuleContext {
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public PrewhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prewhereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterPrewhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitPrewhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitPrewhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrewhereClauseContext prewhereClause() throws RecognitionException {
		PrewhereClauseContext _localctx = new PrewhereClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_prewhereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(PREWHERE);
			setState(1092);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(WHERE);
			setState(1095);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(GROUP);
			setState(1098);
			match(BY);
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1099);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1100);
				match(LPAREN);
				setState(1101);
				columnExprList();
				setState(1102);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(1104);
				columnExprList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(HAVING);
			setState(1108);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public OrderExprListContext orderExprList() {
			return getRuleContext(OrderExprListContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			match(ORDER);
			setState(1111);
			match(BY);
			setState(1112);
			orderExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitByClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public LimitByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLimitByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLimitByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitByClauseContext limitByClause() throws RecognitionException {
		LimitByClauseContext _localctx = new LimitByClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_limitByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(LIMIT);
			setState(1115);
			limitExpr();
			setState(1116);
			match(BY);
			setState(1117);
			columnExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(LIMIT);
			setState(1120);
			limitExpr();
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1121);
				match(WITH);
				setState(1122);
				match(TIES);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingsClauseContext extends ParserRuleContext {
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SettingsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSettingsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSettingsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingsClauseContext settingsClause() throws RecognitionException {
		SettingsClauseContext _localctx = new SettingsClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_settingsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			match(SETTINGS);
			setState(1126);
			settingExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentClauseContext extends ParserRuleContext {
		public Token value;
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public CommentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterCommentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitCommentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitCommentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentClauseContext commentClause() throws RecognitionException {
		CommentClauseContext _localctx = new CommentClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_commentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(COMMENT);
			setState(1129);
			((CommentClauseContext)_localctx).value = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinExprContext extends ParserRuleContext {
		public JoinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinExpr; }
	 
		public JoinExprContext() { }
		public void copyFrom(JoinExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinExprOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public JoinConstraintClauseContext joinConstraintClause() {
			return getRuleContext(JoinConstraintClauseContext.class,0);
		}
		public JoinOpContext joinOp() {
			return getRuleContext(JoinOpContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public JoinExprOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprTableContext extends JoinExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public SampleClauseContext sampleClause() {
			return getRuleContext(SampleClauseContext.class,0);
		}
		public JoinExprTableContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprParensContext extends JoinExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public JoinExprContext joinExpr() {
			return getRuleContext(JoinExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinExprParensContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinExprCrossOpContext extends JoinExprContext {
		public List<JoinExprContext> joinExpr() {
			return getRuleContexts(JoinExprContext.class);
		}
		public JoinExprContext joinExpr(int i) {
			return getRuleContext(JoinExprContext.class,i);
		}
		public JoinOpCrossContext joinOpCross() {
			return getRuleContext(JoinOpCrossContext.class,0);
		}
		public JoinExprCrossOpContext(JoinExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinExprCrossOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinExprCrossOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinExprCrossOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinExprContext joinExpr() throws RecognitionException {
		return joinExpr(0);
	}

	private JoinExprContext joinExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinExprContext _localctx = new JoinExprContext(_ctx, _parentState);
		JoinExprContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_joinExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				_localctx = new JoinExprTableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1132);
				tableExpr(0);
				setState(1134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1133);
					match(FINAL);
					}
					break;
				}
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1136);
					sampleClause();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new JoinExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1139);
				match(LPAREN);
				setState(1140);
				joinExpr(0);
				setState(1141);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						_localctx = new JoinExprCrossOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1145);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1146);
						joinOpCross();
						setState(1147);
						joinExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new JoinExprOpContext(new JoinExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
						setState(1149);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1151);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==GLOBAL || _la==LOCAL) {
							{
							setState(1150);
							_la = _input.LA(1);
							if ( !(_la==GLOBAL || _la==LOCAL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(1154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (ALL - 4)) | (1L << (ANTI - 4)) | (1L << (ANY - 4)) | (1L << (ASOF - 4)) | (1L << (FULL - 4)))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (INNER - 80)) | (1L << (LEFT - 80)) | (1L << (RIGHT - 80)) | (1L << (SEMI - 80)))) != 0)) {
							{
							setState(1153);
							joinOp();
							}
						}

						setState(1156);
						match(JOIN);
						setState(1157);
						joinExpr(0);
						setState(1158);
						joinConstraintClause();
						}
						break;
					}
					} 
				}
				setState(1164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinOpContext extends ParserRuleContext {
		public JoinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOp; }
	 
		public JoinOpContext() { }
		public void copyFrom(JoinOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinOpFullContext extends JoinOpContext {
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public JoinOpFullContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpFull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpInnerContext extends JoinOpContext {
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpInnerContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpInner(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOpLeftRightContext extends JoinOpContext {
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public JoinOpLeftRightContext(JoinOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpLeftRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpLeftRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpLeftRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpContext joinOp() throws RecognitionException {
		JoinOpContext _localctx = new JoinOpContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_joinOp);
		int _la;
		try {
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				_localctx = new JoinOpInnerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1165);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1168);
					match(INNER);
					}
					break;
				case 2:
					{
					setState(1169);
					match(INNER);
					setState(1171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
						{
						setState(1170);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				case 3:
					{
					setState(1173);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new JoinOpLeftRightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1176);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1179);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1180);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1183);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1184);
						match(OUTER);
						}
					}

					setState(1188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) {
						{
						setState(1187);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new JoinOpFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1192);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1195);
					match(FULL);
					setState(1197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1196);
						match(OUTER);
						}
					}

					}
					break;
				case 2:
					{
					setState(1199);
					match(FULL);
					setState(1201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1200);
						match(OUTER);
						}
					}

					setState(1204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==ANY) {
						{
						setState(1203);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinOpCrossContext extends ParserRuleContext {
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public JoinOpCrossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOpCross; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinOpCross(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinOpCross(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinOpCross(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpCrossContext joinOpCross() throws RecognitionException {
		JoinOpCrossContext _localctx = new JoinOpCrossContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_joinOpCross);
		int _la;
		try {
			setState(1216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSS:
			case GLOBAL:
			case LOCAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==LOCAL) {
					{
					setState(1210);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1213);
				match(CROSS);
				setState(1214);
				match(JOIN);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				match(COMMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinConstraintClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public JoinConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinConstraintClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterJoinConstraintClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitJoinConstraintClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitJoinConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConstraintClauseContext joinConstraintClause() throws RecognitionException {
		JoinConstraintClauseContext _localctx = new JoinConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_joinConstraintClause);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				match(ON);
				setState(1219);
				columnExprList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				match(USING);
				setState(1221);
				match(LPAREN);
				setState(1222);
				columnExprList();
				setState(1223);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1225);
				match(USING);
				setState(1226);
				columnExprList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleClauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public List<RatioExprContext> ratioExpr() {
			return getRuleContexts(RatioExprContext.class);
		}
		public RatioExprContext ratioExpr(int i) {
			return getRuleContext(RatioExprContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public SampleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSampleClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSampleClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSampleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleClauseContext sampleClause() throws RecognitionException {
		SampleClauseContext _localctx = new SampleClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_sampleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(SAMPLE);
			setState(1230);
			ratioExpr();
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1231);
				match(OFFSET);
				setState(1232);
				ratioExpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitExprContext extends ParserRuleContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ClickHouseParser.COMMA, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public LimitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLimitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLimitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLimitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitExprContext limitExpr() throws RecognitionException {
		LimitExprContext _localctx = new LimitExprContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_limitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			columnExpr(0);
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET || _la==COMMA) {
				{
				setState(1236);
				_la = _input.LA(1);
				if ( !(_la==OFFSET || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1237);
				columnExpr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderExprListContext extends ParserRuleContext {
		public List<OrderExprContext> orderExpr() {
			return getRuleContexts(OrderExprContext.class);
		}
		public OrderExprContext orderExpr(int i) {
			return getRuleContext(OrderExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public OrderExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOrderExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOrderExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprListContext orderExprList() throws RecognitionException {
		OrderExprListContext _localctx = new OrderExprListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_orderExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			orderExpr();
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1241);
				match(COMMA);
				setState(1242);
				orderExpr();
				}
				}
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderExprContext extends ParserRuleContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public OrderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterOrderExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitOrderExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitOrderExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprContext orderExpr() throws RecognitionException {
		OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_orderExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			columnExpr(0);
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) {
				{
				setState(1249);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1252);
				match(NULLS);
				setState(1253);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1256);
				match(COLLATE);
				setState(1257);
				match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RatioExprContext extends ParserRuleContext {
		public List<NumberLiteralContext> numberLiteral() {
			return getRuleContexts(NumberLiteralContext.class);
		}
		public NumberLiteralContext numberLiteral(int i) {
			return getRuleContext(NumberLiteralContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public RatioExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratioExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterRatioExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitRatioExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitRatioExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatioExprContext ratioExpr() throws RecognitionException {
		RatioExprContext _localctx = new RatioExprContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ratioExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			numberLiteral();
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1261);
				match(SLASH);
				setState(1262);
				numberLiteral();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingExprListContext extends ParserRuleContext {
		public List<SettingExprContext> settingExpr() {
			return getRuleContexts(SettingExprContext.class);
		}
		public SettingExprContext settingExpr(int i) {
			return getRuleContext(SettingExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public SettingExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSettingExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSettingExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprListContext settingExprList() throws RecognitionException {
		SettingExprListContext _localctx = new SettingExprListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_settingExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			settingExpr();
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1266);
				match(COMMA);
				setState(1267);
				settingExpr();
				}
				}
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SettingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSettingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSettingExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSettingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingExprContext settingExpr() throws RecognitionException {
		SettingExprContext _localctx = new SettingExprContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_settingExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			identifier();
			setState(1274);
			match(EQ_SINGLE);
			setState(1275);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public SettingExprListContext settingExprList() {
			return getRuleContext(SettingExprListContext.class,0);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_setStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(SET);
			setState(1278);
			settingExprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowStmtContext extends ParserRuleContext {
		public ShowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmt; }
	 
		public ShowStmtContext() { }
		public void copyFrom(ShowStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowCreateDatabaseStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowCreateDatabaseStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowCreateDatabaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowCreateDatabaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public ShowDatabasesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowDatabasesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowDatabasesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowDatabasesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public ShowCreateTableStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public ShowTablesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowTablesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowTablesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowTablesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDictionariesStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public ShowDictionariesStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowDictionariesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowDictionariesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowDictionariesStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateDictionaryStmtContext extends ShowStmtContext {
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateDictionaryStmtContext(ShowStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterShowCreateDictionaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitShowCreateDictionaryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitShowCreateDictionaryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStmtContext showStmt() throws RecognitionException {
		ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_showStmt);
		int _la;
		try {
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				_localctx = new ShowCreateDatabaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				match(SHOW);
				setState(1281);
				match(CREATE);
				setState(1282);
				match(DATABASE);
				setState(1283);
				databaseIdentifier();
				}
				break;
			case 2:
				_localctx = new ShowCreateDictionaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				match(SHOW);
				setState(1285);
				match(CREATE);
				setState(1286);
				match(DICTIONARY);
				setState(1287);
				tableIdentifier();
				}
				break;
			case 3:
				_localctx = new ShowCreateTableStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1288);
				match(SHOW);
				setState(1289);
				match(CREATE);
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(1290);
					match(TEMPORARY);
					}
				}

				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(1293);
					match(TABLE);
					}
				}

				setState(1296);
				tableIdentifier();
				}
				break;
			case 4:
				_localctx = new ShowDatabasesStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1297);
				match(SHOW);
				setState(1298);
				match(DATABASES);
				}
				break;
			case 5:
				_localctx = new ShowDictionariesStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1299);
				match(SHOW);
				setState(1300);
				match(DICTIONARIES);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1301);
					match(FROM);
					setState(1302);
					databaseIdentifier();
					}
				}

				}
				break;
			case 6:
				_localctx = new ShowTablesStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1305);
				match(SHOW);
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(1306);
					match(TEMPORARY);
					}
				}

				setState(1309);
				match(TABLES);
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(1310);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1311);
					databaseIdentifier();
					}
				}

				setState(1317);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIKE:
					{
					setState(1314);
					match(LIKE);
					setState(1315);
					match(STRING_LITERAL);
					}
					break;
				case WHERE:
					{
					setState(1316);
					whereClause();
					}
					break;
				case EOF:
				case FORMAT:
				case INTO:
				case LIMIT:
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(1319);
					limitClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemStmtContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public SystemStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterSystemStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitSystemStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitSystemStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemStmtContext systemStmt() throws RecognitionException {
		SystemStmtContext _localctx = new SystemStmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_systemStmt);
		int _la;
		try {
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1324);
				match(SYSTEM);
				setState(1325);
				match(FLUSH);
				setState(1326);
				match(DISTRIBUTED);
				setState(1327);
				tableIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				match(SYSTEM);
				setState(1329);
				match(FLUSH);
				setState(1330);
				match(LOGS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1331);
				match(SYSTEM);
				setState(1332);
				match(RELOAD);
				setState(1333);
				match(DICTIONARIES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1334);
				match(SYSTEM);
				setState(1335);
				match(RELOAD);
				setState(1336);
				match(DICTIONARY);
				setState(1337);
				tableIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1338);
				match(SYSTEM);
				setState(1339);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISTRIBUTED:
					{
					setState(1340);
					match(DISTRIBUTED);
					setState(1341);
					match(SENDS);
					}
					break;
				case FETCHES:
					{
					setState(1342);
					match(FETCHES);
					}
					break;
				case MERGES:
				case TTL:
					{
					setState(1344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TTL) {
						{
						setState(1343);
						match(TTL);
						}
					}

					setState(1346);
					match(MERGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1349);
				tableIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1350);
				match(SYSTEM);
				setState(1351);
				_la = _input.LA(1);
				if ( !(_la==START || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1352);
				match(REPLICATED);
				setState(1353);
				match(SENDS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1354);
				match(SYSTEM);
				setState(1355);
				match(SYNC);
				setState(1356);
				match(REPLICA);
				setState(1357);
				tableIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateStmtContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public ClusterClauseContext clusterClause() {
			return getRuleContext(ClusterClauseContext.class,0);
		}
		public TruncateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTruncateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTruncateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTruncateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStmtContext truncateStmt() throws RecognitionException {
		TruncateStmtContext _localctx = new TruncateStmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_truncateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(TRUNCATE);
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1361);
				match(TEMPORARY);
				}
			}

			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1364);
				match(TABLE);
				}
			}

			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1367);
				match(IF);
				setState(1368);
				match(EXISTS);
				}
			}

			setState(1371);
			tableIdentifier();
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1372);
				clusterClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseStmtContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterUseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitUseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitUseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(USE);
			setState(1376);
			databaseIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WatchStmtContext extends ParserRuleContext {
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public WatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_watchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterWatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitWatchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitWatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WatchStmtContext watchStmt() throws RecognitionException {
		WatchStmtContext _localctx = new WatchStmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_watchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(WATCH);
			setState(1379);
			tableIdentifier();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVENTS) {
				{
				setState(1380);
				match(EVENTS);
				}
			}

			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1383);
				match(LIMIT);
				setState(1384);
				match(DECIMAL_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnTypeExprContext extends ParserRuleContext {
		public ColumnTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnTypeExpr; }
	 
		public ColumnTypeExprContext() { }
		public void copyFrom(ColumnTypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnTypeExprNestedContext extends ColumnTypeExprContext {
		public List<ColumnTypeContext> columnType() {
			return getRuleContexts(ColumnTypeContext.class);
		}
		public ColumnTypeContext columnType(int i) {
			return getRuleContext(ColumnTypeContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprNestedContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprParamContext extends ColumnTypeExprContext {
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnTypeExprParamContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprSimpleContext extends ColumnTypeExprContext {
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public ColumnTypeExprSimpleContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprComplexContext extends ColumnTypeExprContext {
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnTypeExprContext> columnTypeExpr() {
			return getRuleContexts(ColumnTypeExprContext.class);
		}
		public ColumnTypeExprContext columnTypeExpr(int i) {
			return getRuleContext(ColumnTypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprComplexContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnTypeExprEnumContext extends ColumnTypeExprContext {
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnTypeExprEnumContext(ColumnTypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnTypeExprEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnTypeExprEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnTypeExprEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeExprContext columnTypeExpr() throws RecognitionException {
		ColumnTypeExprContext _localctx = new ColumnTypeExprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_columnTypeExpr);
		int _la;
		try {
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				_localctx = new ColumnTypeExprSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				columnType();
				}
				break;
			case 2:
				_localctx = new ColumnTypeExprNestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				columnType();
				setState(1389);
				match(LPAREN);
				setState(1390);
				columnType();
				setState(1391);
				columnTypeExpr();
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1392);
					match(COMMA);
					setState(1393);
					columnType();
					setState(1394);
					columnTypeExpr();
					}
					}
					setState(1400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1401);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnTypeExprEnumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1403);
				columnType();
				setState(1404);
				match(LPAREN);
				setState(1405);
				enumValue();
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1406);
					match(COMMA);
					setState(1407);
					enumValue();
					}
					}
					setState(1412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1413);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ColumnTypeExprComplexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1415);
				columnType();
				setState(1416);
				match(LPAREN);
				setState(1417);
				columnTypeExpr();
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1418);
					match(COMMA);
					setState(1419);
					columnTypeExpr();
					}
					}
					setState(1424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1425);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new ColumnTypeExprParamContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1427);
				columnType();
				setState(1428);
				match(LPAREN);
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)) | (1L << (INTERVAL_TYPE - 194)))) != 0)) {
					{
					setState(1429);
					columnExprList();
					}
				}

				setState(1432);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnExprListContext extends ParserRuleContext {
		public List<ColumnsExprContext> columnsExpr() {
			return getRuleContexts(ColumnsExprContext.class);
		}
		public ColumnsExprContext columnsExpr(int i) {
			return getRuleContext(ColumnsExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprListContext columnExprList() throws RecognitionException {
		ColumnExprListContext _localctx = new ColumnExprListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_columnExprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			columnsExpr();
			setState(1441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1437);
					match(COMMA);
					setState(1438);
					columnsExpr();
					}
					} 
				}
				setState(1443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsExprContext extends ParserRuleContext {
		public ColumnsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsExpr; }
	 
		public ColumnsExprContext() { }
		public void copyFrom(ColumnsExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnsExprColumnContext extends ColumnsExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnsExprColumnContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsExprColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsExprColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprAsteriskContext extends ColumnsExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnsExprAsteriskContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsExprAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsExprAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnsExprSubqueryContext extends ColumnsExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnsExprSubqueryContext(ColumnsExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnsExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnsExprSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnsExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsExprContext columnsExpr() throws RecognitionException {
		ColumnsExprContext _localctx = new ColumnsExprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_columnsExpr);
		int _la;
		try {
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				_localctx = new ColumnsExprAsteriskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1444);
					identifier();
					setState(1445);
					match(DOT);
					}
				}

				setState(1449);
				match(ASTERISK);
				}
				break;
			case 2:
				_localctx = new ColumnsExprSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1450);
				match(LPAREN);
				setState(1451);
				selectUnionStmt();
				setState(1452);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ColumnsExprColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1454);
				columnExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnExprContext extends ParserRuleContext {
		public ColumnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExpr; }
	 
		public ColumnExprContext() { }
		public void copyFrom(ColumnExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnExprTernaryOpContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode QUERY() { return getToken(ClickHouseParser.QUERY, 0); }
		public TerminalNode COLON() { return getToken(ClickHouseParser.COLON, 0); }
		public ColumnExprTernaryOpContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTernaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTernaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTernaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAliasContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnExprAliasContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprExtractContext extends ColumnExprContext {
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprExtractContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNegateContext extends ColumnExprContext {
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNegateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubqueryContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprSubqueryContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprLiteralContext extends ColumnExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnExprLiteralContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayContext extends ColumnExprContext {
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprArrayContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprSubstringContext extends ColumnExprContext {
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public ColumnExprSubstringContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCastContext extends ColumnExprContext {
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public ColumnTypeExprContext columnTypeExpr() {
			return getRuleContext(ColumnTypeExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprCastContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprOrContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public ColumnExprOrContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence1Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(ClickHouseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(ClickHouseParser.PERCENT, 0); }
		public ColumnExprPrecedence1Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprPrecedence1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprPrecedence1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence2Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public TerminalNode CONCAT() { return getToken(ClickHouseParser.CONCAT, 0); }
		public ColumnExprPrecedence2Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprPrecedence2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprPrecedence2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprPrecedence3Context extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode EQ_DOUBLE() { return getToken(ClickHouseParser.EQ_DOUBLE, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public TerminalNode NOT_EQ() { return getToken(ClickHouseParser.NOT_EQ, 0); }
		public TerminalNode LE() { return getToken(ClickHouseParser.LE, 0); }
		public TerminalNode GE() { return getToken(ClickHouseParser.GE, 0); }
		public TerminalNode LT() { return getToken(ClickHouseParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClickHouseParser.GT, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprPrecedence3Context(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprPrecedence3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprPrecedence3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprPrecedence3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIntervalContext extends ColumnExprContext {
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ColumnExprIntervalContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIsNullContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprIsNullContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprIsNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprIsNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprIsNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTrimContext extends ColumnExprContext {
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public ColumnExprTrimContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprTupleContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprArrayAccessContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(ClickHouseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ClickHouseParser.RBRACKET, 0); }
		public ColumnExprArrayAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprBetweenContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprBetweenContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprParensContext extends ColumnExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public ColumnExprParensContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTimestampContext extends ColumnExprContext {
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprTimestampContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAndContext extends ColumnExprContext {
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public ColumnExprAndContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprTupleAccessContext extends ColumnExprContext {
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public ColumnExprTupleAccessContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprTupleAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprTupleAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprTupleAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprCaseContext extends ColumnExprContext {
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public List<ColumnExprContext> columnExpr() {
			return getRuleContexts(ColumnExprContext.class);
		}
		public ColumnExprContext columnExpr(int i) {
			return getRuleContext(ColumnExprContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(ClickHouseParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(ClickHouseParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(ClickHouseParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(ClickHouseParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public ColumnExprCaseContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprDateContext extends ColumnExprContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public ColumnExprDateContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprNotContext extends ColumnExprContext {
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnExprNotContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprIdentifierContext extends ColumnExprContext {
		public ColumnIdentifierContext columnIdentifier() {
			return getRuleContext(ColumnIdentifierContext.class,0);
		}
		public ColumnExprIdentifierContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprFunctionContext extends ColumnExprContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ClickHouseParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ClickHouseParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ClickHouseParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ClickHouseParser.RPAREN, i);
		}
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public ColumnArgListContext columnArgList() {
			return getRuleContext(ColumnArgListContext.class,0);
		}
		public ColumnExprListContext columnExprList() {
			return getRuleContext(ColumnExprListContext.class,0);
		}
		public ColumnExprFunctionContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprAsteriskContext extends ColumnExprContext {
		public TerminalNode ASTERISK() { return getToken(ClickHouseParser.ASTERISK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnExprAsteriskContext(ColumnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnExprAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnExprAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnExprAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExprContext columnExpr() throws RecognitionException {
		return columnExpr(0);
	}

	private ColumnExprContext columnExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ColumnExprContext _localctx = new ColumnExprContext(_ctx, _parentState);
		ColumnExprContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_columnExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				_localctx = new ColumnExprCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1458);
				match(CASE);
				setState(1460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1459);
					columnExpr(0);
					}
					break;
				}
				setState(1467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1462);
					match(WHEN);
					setState(1463);
					columnExpr(0);
					setState(1464);
					match(THEN);
					setState(1465);
					columnExpr(0);
					}
					}
					setState(1469); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1471);
					match(ELSE);
					setState(1472);
					columnExpr(0);
					}
				}

				setState(1475);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new ColumnExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1477);
				match(CAST);
				setState(1478);
				match(LPAREN);
				setState(1479);
				columnExpr(0);
				setState(1480);
				match(AS);
				setState(1481);
				columnTypeExpr();
				setState(1482);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ColumnExprDateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1484);
				match(DATE);
				setState(1485);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				{
				_localctx = new ColumnExprExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1486);
				match(EXTRACT);
				setState(1487);
				match(LPAREN);
				setState(1488);
				interval();
				setState(1489);
				match(FROM);
				setState(1490);
				columnExpr(0);
				setState(1491);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ColumnExprIntervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1493);
				match(INTERVAL);
				setState(1494);
				columnExpr(0);
				setState(1495);
				interval();
				}
				break;
			case 6:
				{
				_localctx = new ColumnExprSubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1497);
				match(SUBSTRING);
				setState(1498);
				match(LPAREN);
				setState(1499);
				columnExpr(0);
				setState(1500);
				match(FROM);
				setState(1501);
				columnExpr(0);
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1502);
					match(FOR);
					setState(1503);
					columnExpr(0);
					}
				}

				setState(1506);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ColumnExprTimestampContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1508);
				match(TIMESTAMP);
				setState(1509);
				match(STRING_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new ColumnExprTrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1510);
				match(TRIM);
				setState(1511);
				match(LPAREN);
				setState(1512);
				_la = _input.LA(1);
				if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1513);
				match(STRING_LITERAL);
				setState(1514);
				match(FROM);
				setState(1515);
				columnExpr(0);
				setState(1516);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new ColumnExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1518);
				functionIdentifier();
				setState(1524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1519);
					match(LPAREN);
					setState(1521);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)) | (1L << (INTERVAL_TYPE - 194)))) != 0)) {
						{
						setState(1520);
						columnExprList();
						}
					}

					setState(1523);
					match(RPAREN);
					}
					break;
				}
				setState(1526);
				match(LPAREN);
				setState(1528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1527);
					match(DISTINCT);
					}
					break;
				}
				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)) | (1L << (INTERVAL_TYPE - 194)))) != 0)) {
					{
					setState(1530);
					columnArgList();
					}
				}

				setState(1533);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ColumnExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1535);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new ColumnExprNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1536);
				match(DASH);
				setState(1537);
				columnExpr(17);
				}
				break;
			case 12:
				{
				_localctx = new ColumnExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1538);
				match(NOT);
				setState(1539);
				columnExpr(12);
				}
				break;
			case 13:
				{
				_localctx = new ColumnExprAsteriskContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1540);
					identifier();
					setState(1541);
					match(DOT);
					}
				}

				setState(1545);
				match(ASTERISK);
				}
				break;
			case 14:
				{
				_localctx = new ColumnExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1546);
				match(LPAREN);
				setState(1547);
				selectUnionStmt();
				setState(1548);
				match(RPAREN);
				}
				break;
			case 15:
				{
				_localctx = new ColumnExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1550);
				match(LPAREN);
				setState(1551);
				columnExpr(0);
				setState(1552);
				match(RPAREN);
				}
				break;
			case 16:
				{
				_localctx = new ColumnExprTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1554);
				match(LPAREN);
				setState(1555);
				columnExprList();
				setState(1556);
				match(RPAREN);
				}
				break;
			case 17:
				{
				_localctx = new ColumnExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1558);
				match(LBRACKET);
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (ASTERISK - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (LBRACKET - 194)) | (1L << (LPAREN - 194)) | (1L << (PLUS - 194)) | (1L << (INTERVAL_TYPE - 194)))) != 0)) {
					{
					setState(1559);
					columnExprList();
					}
				}

				setState(1562);
				match(RBRACKET);
				}
				break;
			case 18:
				{
				_localctx = new ColumnExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1563);
				columnIdentifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1635);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
					case 1:
						{
						_localctx = new ColumnExprPrecedence1Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1566);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1567);
						_la = _input.LA(1);
						if ( !(((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ASTERISK - 188)) | (1L << (PERCENT - 188)) | (1L << (SLASH - 188)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1568);
						columnExpr(17);
						}
						break;
					case 2:
						{
						_localctx = new ColumnExprPrecedence2Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1569);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1570);
						_la = _input.LA(1);
						if ( !(((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (CONCAT - 193)) | (1L << (DASH - 193)) | (1L << (PLUS - 193)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1571);
						columnExpr(16);
						}
						break;
					case 3:
						{
						_localctx = new ColumnExprPrecedence3Context(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1572);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1591);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
						case 1:
							{
							setState(1573);
							match(EQ_DOUBLE);
							}
							break;
						case 2:
							{
							setState(1574);
							match(EQ_SINGLE);
							}
							break;
						case 3:
							{
							setState(1575);
							match(NOT_EQ);
							}
							break;
						case 4:
							{
							setState(1576);
							match(LE);
							}
							break;
						case 5:
							{
							setState(1577);
							match(GE);
							}
							break;
						case 6:
							{
							setState(1578);
							match(LT);
							}
							break;
						case 7:
							{
							setState(1579);
							match(GT);
							}
							break;
						case 8:
							{
							setState(1581);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==GLOBAL) {
								{
								setState(1580);
								match(GLOBAL);
								}
							}

							setState(1584);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1583);
								match(NOT);
								}
							}

							setState(1586);
							match(IN);
							}
							break;
						case 9:
							{
							setState(1588);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(1587);
								match(NOT);
								}
							}

							setState(1590);
							_la = _input.LA(1);
							if ( !(_la==ILIKE || _la==LIKE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						setState(1593);
						columnExpr(15);
						}
						break;
					case 4:
						{
						_localctx = new ColumnExprAndContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1594);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1595);
						match(AND);
						setState(1596);
						columnExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new ColumnExprOrContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1597);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1598);
						match(OR);
						setState(1599);
						columnExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new ColumnExprBetweenContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1600);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1602);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1601);
							match(NOT);
							}
						}

						setState(1604);
						match(BETWEEN);
						setState(1605);
						columnExpr(0);
						setState(1606);
						match(AND);
						setState(1607);
						columnExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new ColumnExprTernaryOpContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1609);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1610);
						match(QUERY);
						setState(1611);
						columnExpr(0);
						setState(1612);
						match(COLON);
						setState(1613);
						columnExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new ColumnExprArrayAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1615);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1616);
						match(LBRACKET);
						setState(1617);
						columnExpr(0);
						setState(1618);
						match(RBRACKET);
						}
						break;
					case 9:
						{
						_localctx = new ColumnExprTupleAccessContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1620);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1621);
						match(DOT);
						setState(1622);
						match(DECIMAL_LITERAL);
						}
						break;
					case 10:
						{
						_localctx = new ColumnExprIsNullContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1623);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1624);
						match(IS);
						setState(1626);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1625);
							match(NOT);
							}
						}

						setState(1628);
						match(NULL_SQL);
						}
						break;
					case 11:
						{
						_localctx = new ColumnExprAliasContext(new ColumnExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
						setState(1629);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1633);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DATE:
						case FIRST:
						case ID:
						case KEY:
						case IDENTIFIER:
							{
							setState(1630);
							alias();
							}
							break;
						case AS:
							{
							setState(1631);
							match(AS);
							setState(1632);
							identifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ColumnArgListContext extends ParserRuleContext {
		public List<ColumnArgExprContext> columnArgExpr() {
			return getRuleContexts(ColumnArgExprContext.class);
		}
		public ColumnArgExprContext columnArgExpr(int i) {
			return getRuleContext(ColumnArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgListContext columnArgList() throws RecognitionException {
		ColumnArgListContext _localctx = new ColumnArgListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_columnArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			columnArgExpr();
			setState(1645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1641);
				match(COMMA);
				setState(1642);
				columnArgExpr();
				}
				}
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnArgExprContext extends ParserRuleContext {
		public ColumnLambdaExprContext columnLambdaExpr() {
			return getRuleContext(ColumnLambdaExprContext.class,0);
		}
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public ColumnArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgExprContext columnArgExpr() throws RecognitionException {
		ColumnArgExprContext _localctx = new ColumnArgExprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_columnArgExpr);
		try {
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1648);
				columnLambdaExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1649);
				columnExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnLambdaExprContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(ClickHouseParser.ARROW, 0); }
		public ColumnExprContext columnExpr() {
			return getRuleContext(ColumnExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public ColumnLambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnLambdaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnLambdaExprContext columnLambdaExpr() throws RecognitionException {
		ColumnLambdaExprContext _localctx = new ColumnLambdaExprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_columnLambdaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1652);
				match(LPAREN);
				setState(1653);
				identifier();
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1654);
					match(COMMA);
					setState(1655);
					identifier();
					}
					}
					setState(1660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1661);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				{
				setState(1663);
				identifier();
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1664);
					match(COMMA);
					setState(1665);
					identifier();
					}
					}
					setState(1670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1673);
			match(ARROW);
			setState(1674);
			columnExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnIdentifierContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public ColumnIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIdentifierContext columnIdentifier() throws RecognitionException {
		ColumnIdentifierContext _localctx = new ColumnIdentifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_columnIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1676);
				identifier();
				setState(1677);
				match(DOT);
				}
				break;
			}
			setState(1681);
			nestedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedIdentifierContext extends ParserRuleContext {
		public List<ColumnNameIdentifierContext> columnNameIdentifier() {
			return getRuleContexts(ColumnNameIdentifierContext.class);
		}
		public ColumnNameIdentifierContext columnNameIdentifier(int i) {
			return getRuleContext(ColumnNameIdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public NestedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterNestedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitNestedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitNestedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedIdentifierContext nestedIdentifier() throws RecognitionException {
		NestedIdentifierContext _localctx = new NestedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_nestedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			columnNameIdentifier();
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1684);
				match(DOT);
				setState(1685);
				columnNameIdentifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExprContext extends ParserRuleContext {
		public TableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpr; }
	 
		public TableExprContext() { }
		public void copyFrom(TableExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableExprIdentifierContext extends TableExprContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableExprIdentifierContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprSubqueryContext extends TableExprContext {
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public SelectUnionStmtContext selectUnionStmt() {
			return getRuleContext(SelectUnionStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableExprSubqueryContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprAliasContext extends TableExprContext {
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableExprAliasContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableExprFunctionContext extends TableExprContext {
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public TableExprFunctionContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableExprFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExprContext tableExpr() throws RecognitionException {
		return tableExpr(0);
	}

	private TableExprContext tableExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableExprContext _localctx = new TableExprContext(_ctx, _parentState);
		TableExprContext _prevctx = _localctx;
		int _startState = 182;
		enterRecursionRule(_localctx, 182, RULE_tableExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				_localctx = new TableExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1689);
				tableIdentifier();
				}
				break;
			case 2:
				{
				_localctx = new TableExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1690);
				tableFunctionExpr();
				}
				break;
			case 3:
				{
				_localctx = new TableExprSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1691);
				match(LPAREN);
				setState(1692);
				selectUnionStmt();
				setState(1693);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TableExprAliasContext(new TableExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tableExpr);
					setState(1697);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1701);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DATE:
					case FIRST:
					case ID:
					case KEY:
					case IDENTIFIER:
						{
						setState(1698);
						alias();
						}
						break;
					case AS:
						{
						setState(1699);
						match(AS);
						setState(1700);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TableFunctionExprContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ClickHouseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClickHouseParser.RPAREN, 0); }
		public TableArgListContext tableArgList() {
			return getRuleContext(TableArgListContext.class,0);
		}
		public TableFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFunctionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFunctionExprContext tableFunctionExpr() throws RecognitionException {
		TableFunctionExprContext _localctx = new TableFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_tableFunctionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			functionIdentifier();
			setState(1709);
			match(LPAREN);
			setState(1711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (FLOATING_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (HEXADECIMAL_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DASH - 194)) | (1L << (DOT - 194)) | (1L << (PLUS - 194)) | (1L << (INTERVAL_TYPE - 194)))) != 0)) {
				{
				setState(1710);
				tableArgList();
				}
			}

			setState(1713);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext databaseIdentifier() {
			return getRuleContext(DatabaseIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1715);
				databaseIdentifier();
				setState(1716);
				match(DOT);
				}
				break;
			}
			setState(1720);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableArgListContext extends ParserRuleContext {
		public List<TableArgExprContext> tableArgExpr() {
			return getRuleContexts(TableArgExprContext.class);
		}
		public TableArgExprContext tableArgExpr(int i) {
			return getRuleContext(TableArgExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClickHouseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClickHouseParser.COMMA, i);
		}
		public TableArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgListContext tableArgList() throws RecognitionException {
		TableArgListContext _localctx = new TableArgListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_tableArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			tableArgExpr();
			setState(1727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1723);
				match(COMMA);
				setState(1724);
				tableArgExpr();
				}
				}
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableArgExprContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableFunctionExprContext tableFunctionExpr() {
			return getRuleContext(TableFunctionExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TableArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterTableArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitTableArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitTableArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableArgExprContext tableArgExpr() throws RecognitionException {
		TableArgExprContext _localctx = new TableArgExprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tableArgExpr);
		try {
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1730);
				tableIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1731);
				tableFunctionExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1732);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterDatabaseIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitDatabaseIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitDatabaseIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseIdentifierContext databaseIdentifier() throws RecognitionException {
		DatabaseIdentifierContext _localctx = new DatabaseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_databaseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingLiteralContext extends ParserRuleContext {
		public TerminalNode FLOATING_LITERAL() { return getToken(ClickHouseParser.FLOATING_LITERAL, 0); }
		public TerminalNode DOT() { return getToken(ClickHouseParser.DOT, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(ClickHouseParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public FloatingLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterFloatingLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitFloatingLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFloatingLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingLiteralContext floatingLiteral() throws RecognitionException {
		FloatingLiteralContext _localctx = new FloatingLiteralContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_floatingLiteral);
		int _la;
		try {
			setState(1745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1737);
				match(FLOATING_LITERAL);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1738);
				match(DOT);
				setState(1739);
				_la = _input.LA(1);
				if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1740);
				match(DECIMAL_LITERAL);
				setState(1741);
				match(DOT);
				setState(1743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1742);
					_la = _input.LA(1);
					if ( !(_la==OCTAL_LITERAL || _la==DECIMAL_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public FloatingLiteralContext floatingLiteral() {
			return getRuleContext(FloatingLiteralContext.class,0);
		}
		public TerminalNode OCTAL_LITERAL() { return getToken(ClickHouseParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ClickHouseParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEXADECIMAL_LITERAL() { return getToken(ClickHouseParser.HEXADECIMAL_LITERAL, 0); }
		public TerminalNode INF() { return getToken(ClickHouseParser.INF, 0); }
		public TerminalNode NAN_SQL() { return getToken(ClickHouseParser.NAN_SQL, 0); }
		public TerminalNode PLUS() { return getToken(ClickHouseParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(ClickHouseParser.DASH, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH || _la==PLUS) {
				{
				setState(1747);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1750);
				floatingLiteral();
				}
				break;
			case 2:
				{
				setState(1751);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				{
				setState(1752);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				{
				setState(1753);
				match(HEXADECIMAL_LITERAL);
				}
				break;
			case 5:
				{
				setState(1754);
				match(INF);
				}
				break;
			case 6:
				{
				setState(1755);
				match(NAN_SQL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_literal);
		try {
			setState(1761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INF:
			case NAN_SQL:
			case FLOATING_LITERAL:
			case OCTAL_LITERAL:
			case DECIMAL_LITERAL:
			case HEXADECIMAL_LITERAL:
			case DASH:
			case DOT:
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1758);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1759);
				match(STRING_LITERAL);
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1760);
				match(NULL_SQL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(ClickHouseParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(ClickHouseParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(ClickHouseParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(ClickHouseParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(ClickHouseParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(ClickHouseParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(ClickHouseParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(ClickHouseParser.YEAR, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (HOUR - 72)) | (1L << (MINUTE - 72)) | (1L << (MONTH - 72)) | (1L << (QUARTER - 72)) | (1L << (SECOND - 72)))) != 0) || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(ClickHouseParser.AFTER, 0); }
		public TerminalNode ALIAS() { return getToken(ClickHouseParser.ALIAS, 0); }
		public TerminalNode ALL() { return getToken(ClickHouseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(ClickHouseParser.ALTER, 0); }
		public TerminalNode AND() { return getToken(ClickHouseParser.AND, 0); }
		public TerminalNode ANTI() { return getToken(ClickHouseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(ClickHouseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(ClickHouseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(ClickHouseParser.AS, 0); }
		public TerminalNode ASCENDING() { return getToken(ClickHouseParser.ASCENDING, 0); }
		public TerminalNode ASOF() { return getToken(ClickHouseParser.ASOF, 0); }
		public TerminalNode ASYNC() { return getToken(ClickHouseParser.ASYNC, 0); }
		public TerminalNode ATTACH() { return getToken(ClickHouseParser.ATTACH, 0); }
		public TerminalNode BETWEEN() { return getToken(ClickHouseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(ClickHouseParser.BOTH, 0); }
		public TerminalNode BY() { return getToken(ClickHouseParser.BY, 0); }
		public TerminalNode CASE() { return getToken(ClickHouseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(ClickHouseParser.CAST, 0); }
		public TerminalNode CHECK() { return getToken(ClickHouseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(ClickHouseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(ClickHouseParser.CLUSTER, 0); }
		public TerminalNode CODEC() { return getToken(ClickHouseParser.CODEC, 0); }
		public TerminalNode COLLATE() { return getToken(ClickHouseParser.COLLATE, 0); }
		public TerminalNode COLUMN() { return getToken(ClickHouseParser.COLUMN, 0); }
		public TerminalNode COMMENT() { return getToken(ClickHouseParser.COMMENT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(ClickHouseParser.CONSTRAINT, 0); }
		public TerminalNode CREATE() { return getToken(ClickHouseParser.CREATE, 0); }
		public TerminalNode CROSS() { return getToken(ClickHouseParser.CROSS, 0); }
		public TerminalNode CUBE() { return getToken(ClickHouseParser.CUBE, 0); }
		public TerminalNode DATABASE() { return getToken(ClickHouseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(ClickHouseParser.DATABASES, 0); }
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode DEDUPLICATE() { return getToken(ClickHouseParser.DEDUPLICATE, 0); }
		public TerminalNode DEFAULT() { return getToken(ClickHouseParser.DEFAULT, 0); }
		public TerminalNode DELAY() { return getToken(ClickHouseParser.DELAY, 0); }
		public TerminalNode DELETE() { return getToken(ClickHouseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(ClickHouseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ClickHouseParser.DESC, 0); }
		public TerminalNode DESCENDING() { return getToken(ClickHouseParser.DESCENDING, 0); }
		public TerminalNode DETACH() { return getToken(ClickHouseParser.DETACH, 0); }
		public TerminalNode DICTIONARIES() { return getToken(ClickHouseParser.DICTIONARIES, 0); }
		public TerminalNode DICTIONARY() { return getToken(ClickHouseParser.DICTIONARY, 0); }
		public TerminalNode DISK() { return getToken(ClickHouseParser.DISK, 0); }
		public TerminalNode DISTINCT() { return getToken(ClickHouseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(ClickHouseParser.DISTRIBUTED, 0); }
		public TerminalNode DROP() { return getToken(ClickHouseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(ClickHouseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(ClickHouseParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(ClickHouseParser.ENGINE, 0); }
		public TerminalNode EVENTS() { return getToken(ClickHouseParser.EVENTS, 0); }
		public TerminalNode EXISTS() { return getToken(ClickHouseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(ClickHouseParser.EXPLAIN, 0); }
		public TerminalNode EXPRESSION() { return getToken(ClickHouseParser.EXPRESSION, 0); }
		public TerminalNode EXTRACT() { return getToken(ClickHouseParser.EXTRACT, 0); }
		public TerminalNode FETCHES() { return getToken(ClickHouseParser.FETCHES, 0); }
		public TerminalNode FINAL() { return getToken(ClickHouseParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode FLUSH() { return getToken(ClickHouseParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(ClickHouseParser.FOR, 0); }
		public TerminalNode FORMAT() { return getToken(ClickHouseParser.FORMAT, 0); }
		public TerminalNode FREEZE() { return getToken(ClickHouseParser.FREEZE, 0); }
		public TerminalNode FROM() { return getToken(ClickHouseParser.FROM, 0); }
		public TerminalNode FULL() { return getToken(ClickHouseParser.FULL, 0); }
		public TerminalNode FUNCTION() { return getToken(ClickHouseParser.FUNCTION, 0); }
		public TerminalNode GLOBAL() { return getToken(ClickHouseParser.GLOBAL, 0); }
		public TerminalNode GRANULARITY() { return getToken(ClickHouseParser.GRANULARITY, 0); }
		public TerminalNode GROUP() { return getToken(ClickHouseParser.GROUP, 0); }
		public TerminalNode HAVING() { return getToken(ClickHouseParser.HAVING, 0); }
		public TerminalNode HIERARCHICAL() { return getToken(ClickHouseParser.HIERARCHICAL, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode IF() { return getToken(ClickHouseParser.IF, 0); }
		public TerminalNode ILIKE() { return getToken(ClickHouseParser.ILIKE, 0); }
		public TerminalNode IN() { return getToken(ClickHouseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(ClickHouseParser.INDEX, 0); }
		public TerminalNode INJECTIVE() { return getToken(ClickHouseParser.INJECTIVE, 0); }
		public TerminalNode INNER() { return getToken(ClickHouseParser.INNER, 0); }
		public TerminalNode INSERT() { return getToken(ClickHouseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(ClickHouseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(ClickHouseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(ClickHouseParser.IS, 0); }
		public TerminalNode IS_OBJECT_ID() { return getToken(ClickHouseParser.IS_OBJECT_ID, 0); }
		public TerminalNode JOIN() { return getToken(ClickHouseParser.JOIN, 0); }
		public TerminalNode JSON_FALSE() { return getToken(ClickHouseParser.JSON_FALSE, 0); }
		public TerminalNode JSON_TRUE() { return getToken(ClickHouseParser.JSON_TRUE, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public TerminalNode KILL() { return getToken(ClickHouseParser.KILL, 0); }
		public TerminalNode LAST() { return getToken(ClickHouseParser.LAST, 0); }
		public TerminalNode LAYOUT() { return getToken(ClickHouseParser.LAYOUT, 0); }
		public TerminalNode LEADING() { return getToken(ClickHouseParser.LEADING, 0); }
		public TerminalNode LEFT() { return getToken(ClickHouseParser.LEFT, 0); }
		public TerminalNode LIFETIME() { return getToken(ClickHouseParser.LIFETIME, 0); }
		public TerminalNode LIKE() { return getToken(ClickHouseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(ClickHouseParser.LIMIT, 0); }
		public TerminalNode LIVE() { return getToken(ClickHouseParser.LIVE, 0); }
		public TerminalNode LOCAL() { return getToken(ClickHouseParser.LOCAL, 0); }
		public TerminalNode LOGS() { return getToken(ClickHouseParser.LOGS, 0); }
		public TerminalNode MATERIALIZED() { return getToken(ClickHouseParser.MATERIALIZED, 0); }
		public TerminalNode MAX() { return getToken(ClickHouseParser.MAX, 0); }
		public TerminalNode MERGES() { return getToken(ClickHouseParser.MERGES, 0); }
		public TerminalNode MIN() { return getToken(ClickHouseParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(ClickHouseParser.MODIFY, 0); }
		public TerminalNode MOVE() { return getToken(ClickHouseParser.MOVE, 0); }
		public TerminalNode MUTATION() { return getToken(ClickHouseParser.MUTATION, 0); }
		public TerminalNode NO() { return getToken(ClickHouseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(ClickHouseParser.NOT, 0); }
		public TerminalNode NULLS() { return getToken(ClickHouseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(ClickHouseParser.OFFSET, 0); }
		public TerminalNode ON() { return getToken(ClickHouseParser.ON, 0); }
		public TerminalNode OPTIMIZE() { return getToken(ClickHouseParser.OPTIMIZE, 0); }
		public TerminalNode OR() { return getToken(ClickHouseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(ClickHouseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(ClickHouseParser.OUTER, 0); }
		public TerminalNode OUTFILE() { return getToken(ClickHouseParser.OUTFILE, 0); }
		public TerminalNode PARTITION() { return getToken(ClickHouseParser.PARTITION, 0); }
		public TerminalNode POPULATE() { return getToken(ClickHouseParser.POPULATE, 0); }
		public TerminalNode PREWHERE() { return getToken(ClickHouseParser.PREWHERE, 0); }
		public TerminalNode PRIMARY() { return getToken(ClickHouseParser.PRIMARY, 0); }
		public TerminalNode RANGE() { return getToken(ClickHouseParser.RANGE, 0); }
		public TerminalNode RELOAD() { return getToken(ClickHouseParser.RELOAD, 0); }
		public TerminalNode REMOVE() { return getToken(ClickHouseParser.REMOVE, 0); }
		public TerminalNode RENAME() { return getToken(ClickHouseParser.RENAME, 0); }
		public TerminalNode REPLACE() { return getToken(ClickHouseParser.REPLACE, 0); }
		public TerminalNode REPLICA() { return getToken(ClickHouseParser.REPLICA, 0); }
		public TerminalNode REPLICATED() { return getToken(ClickHouseParser.REPLICATED, 0); }
		public TerminalNode RIGHT() { return getToken(ClickHouseParser.RIGHT, 0); }
		public TerminalNode ROLLUP() { return getToken(ClickHouseParser.ROLLUP, 0); }
		public TerminalNode SAMPLE() { return getToken(ClickHouseParser.SAMPLE, 0); }
		public TerminalNode SELECT() { return getToken(ClickHouseParser.SELECT, 0); }
		public TerminalNode SEMI() { return getToken(ClickHouseParser.SEMI, 0); }
		public TerminalNode SENDS() { return getToken(ClickHouseParser.SENDS, 0); }
		public TerminalNode SET() { return getToken(ClickHouseParser.SET, 0); }
		public TerminalNode SETTINGS() { return getToken(ClickHouseParser.SETTINGS, 0); }
		public TerminalNode SHOW() { return getToken(ClickHouseParser.SHOW, 0); }
		public TerminalNode SOURCE() { return getToken(ClickHouseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(ClickHouseParser.START, 0); }
		public TerminalNode STOP() { return getToken(ClickHouseParser.STOP, 0); }
		public TerminalNode SUBSTRING() { return getToken(ClickHouseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(ClickHouseParser.SYNC, 0); }
		public TerminalNode SYNTAX() { return getToken(ClickHouseParser.SYNTAX, 0); }
		public TerminalNode SYSTEM() { return getToken(ClickHouseParser.SYSTEM, 0); }
		public TerminalNode TABLE() { return getToken(ClickHouseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(ClickHouseParser.TABLES, 0); }
		public TerminalNode TEMPORARY() { return getToken(ClickHouseParser.TEMPORARY, 0); }
		public TerminalNode TEST() { return getToken(ClickHouseParser.TEST, 0); }
		public TerminalNode THEN() { return getToken(ClickHouseParser.THEN, 0); }
		public TerminalNode TIES() { return getToken(ClickHouseParser.TIES, 0); }
		public TerminalNode TIMEOUT() { return getToken(ClickHouseParser.TIMEOUT, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ClickHouseParser.TIMESTAMP, 0); }
		public TerminalNode TOTALS() { return getToken(ClickHouseParser.TOTALS, 0); }
		public TerminalNode TRAILING() { return getToken(ClickHouseParser.TRAILING, 0); }
		public TerminalNode TRIM() { return getToken(ClickHouseParser.TRIM, 0); }
		public TerminalNode TRUNCATE() { return getToken(ClickHouseParser.TRUNCATE, 0); }
		public TerminalNode TO() { return getToken(ClickHouseParser.TO, 0); }
		public TerminalNode TOP() { return getToken(ClickHouseParser.TOP, 0); }
		public TerminalNode TTL() { return getToken(ClickHouseParser.TTL, 0); }
		public TerminalNode TYPE() { return getToken(ClickHouseParser.TYPE, 0); }
		public TerminalNode UNION() { return getToken(ClickHouseParser.UNION, 0); }
		public TerminalNode UPDATE() { return getToken(ClickHouseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(ClickHouseParser.USE, 0); }
		public TerminalNode USING() { return getToken(ClickHouseParser.USING, 0); }
		public TerminalNode UUID() { return getToken(ClickHouseParser.UUID, 0); }
		public TerminalNode VALUES() { return getToken(ClickHouseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(ClickHouseParser.VIEW, 0); }
		public TerminalNode VOLUME() { return getToken(ClickHouseParser.VOLUME, 0); }
		public TerminalNode WATCH() { return getToken(ClickHouseParser.WATCH, 0); }
		public TerminalNode WHEN() { return getToken(ClickHouseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(ClickHouseParser.WHERE, 0); }
		public TerminalNode WITH() { return getToken(ClickHouseParser.WITH, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOR) | (1L << FORMAT) | (1L << FREEZE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PREWHERE - 64)) | (1L << (PRIMARY - 64)) | (1L << (RANGE - 64)) | (1L << (RELOAD - 64)) | (1L << (REMOVE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordForAliasContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(ClickHouseParser.DATE, 0); }
		public TerminalNode FIRST() { return getToken(ClickHouseParser.FIRST, 0); }
		public TerminalNode ID() { return getToken(ClickHouseParser.ID, 0); }
		public TerminalNode KEY() { return getToken(ClickHouseParser.KEY, 0); }
		public KeywordForAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordForAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterKeywordForAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitKeywordForAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitKeywordForAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordForAliasContext keywordForAlias() throws RecognitionException {
		KeywordForAliasContext _localctx = new KeywordForAliasContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_keywordForAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (DATE - 33)) | (1L << (FIRST - 33)) | (1L << (ID - 33)) | (1L << (KEY - 33)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public KeywordForAliasContext keywordForAlias() {
			return getRuleContext(KeywordForAliasContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_alias);
		try {
			setState(1771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1769);
				match(IDENTIFIER);
				}
				break;
			case DATE:
			case FIRST:
			case ID:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1770);
				keywordForAlias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public TerminalNode INTERVAL_TYPE() { return getToken(ClickHouseParser.INTERVAL_TYPE, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ColumnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeContext columnType() throws RecognitionException {
		ColumnTypeContext _localctx = new ColumnTypeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_columnType);
		try {
			setState(1778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1775);
				match(IDENTIFIER);
				}
				break;
			case INTERVAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1776);
				match(INTERVAL_TYPE);
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MODIFY:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WHEN:
			case WHERE:
			case WITH:
			case JSON_FALSE:
			case JSON_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1777);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ColumnNameIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterColumnNameIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitColumnNameIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitColumnNameIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameIdentifierContext columnNameIdentifier() throws RecognitionException {
		ColumnNameIdentifierContext _localctx = new ColumnNameIdentifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_columnNameIdentifier);
		try {
			setState(1782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1780);
				match(IDENTIFIER);
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MODIFY:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WHEN:
			case WHERE:
			case WITH:
			case JSON_FALSE:
			case JSON_TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1781);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ClickHouseParser.IDENTIFIER, 0); }
		public TerminalNode INTERVAL_TYPE() { return getToken(ClickHouseParser.INTERVAL_TYPE, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_functionIdentifier);
		try {
			setState(1787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1784);
				match(IDENTIFIER);
				}
				break;
			case INTERVAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1785);
				match(INTERVAL_TYPE);
				}
				break;
			case AFTER:
			case ALIAS:
			case ALL:
			case ALTER:
			case AND:
			case ANTI:
			case ANY:
			case ARRAY:
			case AS:
			case ASCENDING:
			case ASOF:
			case ASYNC:
			case ATTACH:
			case BETWEEN:
			case BOTH:
			case BY:
			case CASE:
			case CAST:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CODEC:
			case COLLATE:
			case COLUMN:
			case COMMENT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CUBE:
			case DATABASE:
			case DATABASES:
			case DATE:
			case DEDUPLICATE:
			case DEFAULT:
			case DELAY:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DESCRIBE:
			case DETACH:
			case DICTIONARIES:
			case DICTIONARY:
			case DISK:
			case DISTINCT:
			case DISTRIBUTED:
			case DROP:
			case ELSE:
			case END:
			case ENGINE:
			case EVENTS:
			case EXISTS:
			case EXPLAIN:
			case EXPRESSION:
			case EXTRACT:
			case FETCHES:
			case FINAL:
			case FIRST:
			case FLUSH:
			case FOR:
			case FORMAT:
			case FREEZE:
			case FROM:
			case FULL:
			case FUNCTION:
			case GLOBAL:
			case GRANULARITY:
			case GROUP:
			case HAVING:
			case HIERARCHICAL:
			case ID:
			case IF:
			case ILIKE:
			case IN:
			case INDEX:
			case INJECTIVE:
			case INNER:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case IS_OBJECT_ID:
			case JOIN:
			case KEY:
			case KILL:
			case LAST:
			case LAYOUT:
			case LEADING:
			case LEFT:
			case LIFETIME:
			case LIKE:
			case LIMIT:
			case LIVE:
			case LOCAL:
			case LOGS:
			case MATERIALIZED:
			case MAX:
			case MERGES:
			case MIN:
			case MODIFY:
			case MOVE:
			case MUTATION:
			case NO:
			case NOT:
			case NULLS:
			case OFFSET:
			case ON:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case OUTER:
			case OUTFILE:
			case PARTITION:
			case POPULATE:
			case PREWHERE:
			case PRIMARY:
			case RANGE:
			case RELOAD:
			case REMOVE:
			case RENAME:
			case REPLACE:
			case REPLICA:
			case REPLICATED:
			case RIGHT:
			case ROLLUP:
			case SAMPLE:
			case SELECT:
			case SEMI:
			case SENDS:
			case SET:
			case SETTINGS:
			case SHOW:
			case SOURCE:
			case START:
			case STOP:
			case SUBSTRING:
			case SYNC:
			case SYNTAX:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TEMPORARY:
			case TEST:
			case THEN:
			case TIES:
			case TIMEOUT:
			case TIMESTAMP:
			case TO:
			case TOP:
			case TOTALS:
			case TRAILING:
			case TRIM:
			case TRUNCATE:
			case TTL:
			case TYPE:
			case UNION:
			case UPDATE:
			case USE:
			case USING:
			case UUID:
			case VALUES:
			case VIEW:
			case VOLUME:
			case WATCH:
			case WHEN:
			case WHERE:
			case WITH:
			case JSON_FALSE:
			case JSON_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1786);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrNullContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NULL_SQL() { return getToken(ClickHouseParser.NULL_SQL, 0); }
		public IdentifierOrNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterIdentifierOrNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitIdentifierOrNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitIdentifierOrNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrNullContext identifierOrNull() throws RecognitionException {
		IdentifierOrNullContext _localctx = new IdentifierOrNullContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_identifierOrNull);
		try {
			setState(1791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1789);
				identifier();
				}
				break;
			case NULL_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1790);
				match(NULL_SQL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ClickHouseParser.STRING_LITERAL, 0); }
		public TerminalNode EQ_SINGLE() { return getToken(ClickHouseParser.EQ_SINGLE, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClickHouseParserListener ) ((ClickHouseParserListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClickHouseParserVisitor ) return ((ClickHouseParserVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			match(STRING_LITERAL);
			setState(1794);
			match(EQ_SINGLE);
			setState(1795);
			numberLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 65:
			return joinExpr_sempred((JoinExprContext)_localctx, predIndex);
		case 85:
			return columnExpr_sempred((ColumnExprContext)_localctx, predIndex);
		case 91:
			return tableExpr_sempred((TableExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean joinExpr_sempred(JoinExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean columnExpr_sempred(ColumnExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 19);
		case 10:
			return precpred(_ctx, 18);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean tableExpr_sempred(TableExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00de\u0708\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\3\2\3\2\3\2\3\2\5\2\u00e3\n\2\3\2\3\2\5\2\u00e7"+
		"\n\2\3\2\5\2\u00ea\n\2\3\2\5\2\u00ed\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0101\n\3\3\4\3\4\3\4\3"+
		"\4\5\4\u0107\n\4\3\4\3\4\3\4\7\4\u010c\n\4\f\4\16\4\u010f\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u0116\n\5\3\5\3\5\3\5\5\5\u011b\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0122\n\5\3\5\3\5\3\5\5\5\u0127\n\5\3\5\3\5\3\5\3\5\5\5\u012d\n"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0133\n\5\3\5\3\5\3\5\5\5\u0138\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u013e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u014c\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0153\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u015a"+
		"\n\5\3\5\3\5\3\5\3\5\5\5\u0160\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0169"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0173\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u017d\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0191\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u0199\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01a8"+
		"\n\5\3\6\3\6\3\6\7\6\u01ad\n\6\f\6\16\6\u01b0\13\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u01bd\n\t\3\n\3\n\3\n\3\n\5\n\u01c3\n\n\3"+
		"\13\3\13\3\13\3\13\5\13\u01c9\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u01d0\n\f\3"+
		"\f\3\f\5\f\u01d4\n\f\3\f\5\f\u01d7\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u01de\n"+
		"\f\3\f\3\f\5\f\u01e2\n\f\3\f\5\f\u01e5\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u01f0\n\f\3\f\3\f\5\f\u01f4\n\f\3\f\5\f\u01f7\n\f\3\f\3\f"+
		"\3\f\5\f\u01fc\n\f\5\f\u01fe\n\f\3\f\5\f\u0201\n\f\3\f\5\f\u0204\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u020e\n\f\3\f\3\f\5\f\u0212\n\f\3\f"+
		"\5\f\u0215\n\f\3\f\5\f\u0218\n\f\3\f\3\f\3\f\5\f\u021d\n\f\5\f\u021f\n"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0225\n\f\3\f\3\f\3\f\3\f\5\f\u022b\n\f\3\f\3\f"+
		"\5\f\u022f\n\f\3\f\5\f\u0232\n\f\3\f\5\f\u0235\n\f\3\f\5\f\u0238\n\f\3"+
		"\f\5\f\u023b\n\f\3\f\3\f\3\f\5\f\u0240\n\f\3\f\3\f\3\f\3\f\5\f\u0246\n"+
		"\f\3\f\3\f\5\f\u024a\n\f\3\f\5\f\u024d\n\f\3\f\5\f\u0250\n\f\3\f\3\f\5"+
		"\f\u0254\n\f\3\r\3\r\3\r\3\r\7\r\u025a\n\r\f\r\16\r\u025d\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u026a\n\16\f\16\16"+
		"\16\u026d\13\16\3\17\5\17\u0270\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u0277"+
		"\n\17\f\17\16\17\u027a\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5"+
		"\21\u0284\n\21\3\21\5\21\u0287\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u028e"+
		"\n\22\f\22\16\22\u0291\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u02a1\n\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u02aa\n\24\f\24\16\24\u02ad\13\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02be\n\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u02cb\n\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33"+
		"\u02da\n\33\f\33\16\33\u02dd\13\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u02e5\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u02ef\n\34\f"+
		"\34\16\34\u02f2\13\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \7 \u0304\n \f \16 \u0307\13 \3!\3!\5!\u030b\n!"+
		"\3!\3!\3!\5!\u0310\n!\3!\5!\u0313\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u031d\n\"\3#\3#\3#\5#\u0322\n#\3#\3#\5#\u0326\n#\3#\5#\u0329\n#\3#"+
		"\3#\5#\u032d\n#\3#\3#\5#\u0331\n#\3#\3#\3#\5#\u0336\n#\3#\5#\u0339\n#"+
		"\3#\3#\5#\u033d\n#\5#\u033f\n#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&"+
		"\3&\3&\7&\u0350\n&\f&\16&\u0353\13&\3&\3&\3\'\3\'\3\'\5\'\u035a\n\'\3"+
		"\'\5\'\u035d\n\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0367\n(\3)\3)\5)\u036b\n"+
		")\3)\3)\3*\3*\3*\3*\5*\u0373\n*\3*\3*\5*\u0377\n*\3*\3*\3*\5*\u037c\n"+
		"*\3*\3*\5*\u0380\n*\3*\3*\5*\u0384\n*\3*\3*\5*\u0388\n*\3*\3*\5*\u038c"+
		"\n*\5*\u038e\n*\3+\3+\3+\3+\3+\3+\5+\u0396\n+\3+\3+\5+\u039a\n+\3+\5+"+
		"\u039d\n+\3,\3,\3,\3,\3-\3-\3-\5-\u03a6\n-\3-\3-\3-\5-\u03ab\n-\3-\5-"+
		"\u03ae\n-\3-\3-\3.\3.\3.\3.\7.\u03b6\n.\f.\16.\u03b9\13.\3.\3.\3/\3/\3"+
		"/\3/\3/\5/\u03c2\n/\3/\3/\5/\u03c6\n/\3\60\3\60\3\60\5\60\u03cb\n\60\3"+
		"\60\3\60\5\60\u03cf\n\60\3\61\3\61\3\61\3\61\5\61\u03d5\n\61\3\61\5\61"+
		"\u03d8\n\61\3\61\5\61\u03db\n\61\3\61\5\61\u03de\n\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u03ea\n\62\f\62\16\62\u03ed\13"+
		"\62\3\62\5\62\u03f0\n\62\3\63\3\63\3\63\3\63\7\63\u03f6\n\63\f\63\16\63"+
		"\u03f9\13\63\3\64\3\64\3\64\3\64\3\64\5\64\u0400\n\64\3\65\5\65\u0403"+
		"\n\65\3\65\3\65\5\65\u0407\n\65\3\65\5\65\u040a\n\65\3\65\3\65\5\65\u040e"+
		"\n\65\3\65\5\65\u0411\n\65\3\65\5\65\u0414\n\65\3\65\5\65\u0417\n\65\3"+
		"\65\5\65\u041a\n\65\3\65\3\65\5\65\u041e\n\65\3\65\3\65\5\65\u0422\n\65"+
		"\3\65\5\65\u0425\n\65\3\65\5\65\u0428\n\65\3\65\5\65\u042b\n\65\3\65\5"+
		"\65\u042e\n\65\3\65\5\65\u0431\n\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\5\67\u043a\n\67\38\38\38\39\59\u0440\n9\39\39\39\39\3:\3:\3:\3;\3;\3"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0454\n<\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3?\3@\3@\3@\3@\5@\u0466\n@\3A\3A\3A\3B\3B\3B\3C\3C\3C\5C\u0471\nC\3"+
		"C\5C\u0474\nC\3C\3C\3C\3C\5C\u047a\nC\3C\3C\3C\3C\3C\3C\5C\u0482\nC\3"+
		"C\5C\u0485\nC\3C\3C\3C\3C\7C\u048b\nC\fC\16C\u048e\13C\3D\5D\u0491\nD"+
		"\3D\3D\3D\5D\u0496\nD\3D\5D\u0499\nD\3D\5D\u049c\nD\3D\3D\5D\u04a0\nD"+
		"\3D\3D\5D\u04a4\nD\3D\5D\u04a7\nD\5D\u04a9\nD\3D\5D\u04ac\nD\3D\3D\5D"+
		"\u04b0\nD\3D\3D\5D\u04b4\nD\3D\5D\u04b7\nD\5D\u04b9\nD\5D\u04bb\nD\3E"+
		"\5E\u04be\nE\3E\3E\3E\5E\u04c3\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u04ce"+
		"\nF\3G\3G\3G\3G\5G\u04d4\nG\3H\3H\3H\5H\u04d9\nH\3I\3I\3I\7I\u04de\nI"+
		"\fI\16I\u04e1\13I\3J\3J\5J\u04e5\nJ\3J\3J\5J\u04e9\nJ\3J\3J\5J\u04ed\n"+
		"J\3K\3K\3K\5K\u04f2\nK\3L\3L\3L\7L\u04f7\nL\fL\16L\u04fa\13L\3M\3M\3M"+
		"\3M\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u050e\nO\3O\5O\u0511"+
		"\nO\3O\3O\3O\3O\3O\3O\3O\5O\u051a\nO\3O\3O\5O\u051e\nO\3O\3O\3O\5O\u0523"+
		"\nO\3O\3O\3O\5O\u0528\nO\3O\5O\u052b\nO\5O\u052d\nO\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0543\nP\3P\5P\u0546\nP"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0551\nP\3Q\3Q\5Q\u0555\nQ\3Q\5Q\u0558"+
		"\nQ\3Q\3Q\5Q\u055c\nQ\3Q\3Q\5Q\u0560\nQ\3R\3R\3R\3S\3S\3S\5S\u0568\nS"+
		"\3S\3S\5S\u056c\nS\3T\3T\3T\3T\3T\3T\3T\3T\3T\7T\u0577\nT\fT\16T\u057a"+
		"\13T\3T\3T\3T\3T\3T\3T\3T\7T\u0583\nT\fT\16T\u0586\13T\3T\3T\3T\3T\3T"+
		"\3T\3T\7T\u058f\nT\fT\16T\u0592\13T\3T\3T\3T\3T\3T\5T\u0599\nT\3T\3T\5"+
		"T\u059d\nT\3U\3U\3U\7U\u05a2\nU\fU\16U\u05a5\13U\3V\3V\3V\5V\u05aa\nV"+
		"\3V\3V\3V\3V\3V\3V\5V\u05b2\nV\3W\3W\3W\5W\u05b7\nW\3W\3W\3W\3W\3W\6W"+
		"\u05be\nW\rW\16W\u05bf\3W\3W\5W\u05c4\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u05e3\n"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u05f4\nW\3W\5W\u05f7"+
		"\nW\3W\3W\5W\u05fb\nW\3W\5W\u05fe\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W"+
		"\u060a\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u061b\nW\3W"+
		"\3W\5W\u061f\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0630"+
		"\nW\3W\5W\u0633\nW\3W\3W\5W\u0637\nW\3W\5W\u063a\nW\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\5W\u0645\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\5W\u065d\nW\3W\3W\3W\3W\3W\5W\u0664\nW\7W\u0666\nW"+
		"\fW\16W\u0669\13W\3X\3X\3X\7X\u066e\nX\fX\16X\u0671\13X\3Y\3Y\5Y\u0675"+
		"\nY\3Z\3Z\3Z\3Z\7Z\u067b\nZ\fZ\16Z\u067e\13Z\3Z\3Z\3Z\3Z\3Z\7Z\u0685\n"+
		"Z\fZ\16Z\u0688\13Z\5Z\u068a\nZ\3Z\3Z\3Z\3[\3[\3[\5[\u0692\n[\3[\3[\3\\"+
		"\3\\\3\\\5\\\u0699\n\\\3]\3]\3]\3]\3]\3]\3]\5]\u06a2\n]\3]\3]\3]\3]\5"+
		"]\u06a8\n]\7]\u06aa\n]\f]\16]\u06ad\13]\3^\3^\3^\5^\u06b2\n^\3^\3^\3_"+
		"\3_\3_\5_\u06b9\n_\3_\3_\3`\3`\3`\7`\u06c0\n`\f`\16`\u06c3\13`\3a\3a\3"+
		"a\5a\u06c8\na\3b\3b\3c\3c\3c\3c\3c\3c\5c\u06d2\nc\5c\u06d4\nc\3d\5d\u06d7"+
		"\nd\3d\3d\3d\3d\3d\3d\5d\u06df\nd\3e\3e\3e\5e\u06e4\ne\3f\3f\3g\3g\3h"+
		"\3h\3i\3i\5i\u06ee\ni\3j\3j\3k\3k\3k\5k\u06f5\nk\3l\3l\5l\u06f9\nl\3m"+
		"\3m\3m\5m\u06fe\nm\3n\3n\5n\u0702\nn\3o\3o\3o\3o\3o\2\5\u0084\u00ac\u00b8"+
		"p\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\2\35\b\2\5\5\31\31\34\34&&ee\u00a5\u00a5\4\2"+
		"\20\20\36\36\5\2\5\5&&ee\4\2))++\4\2,,\62\62\5\2\17\17\u0094\u0094\u009a"+
		"\u009a\4\2  \u0087\u0087\4\2RR^^\4\2EEcc\5\2\6\6\n\n\16\16\6\2\6\6\t\n"+
		"\16\16\u008b\u008b\4\2^^\u0086\u0086\4\2\6\6\n\n\4\2ss\u00c2\u00c2\4\2"+
		"\r\r)*\4\2==[[\4\2BBNN\3\2\u0091\u0092\5\2\22\22]]\u00a2\u00a2\5\2\u00be"+
		"\u00be\u00d0\u00d0\u00d9\u00d9\4\2\u00c3\u00c4\u00d1\u00d1\4\2MM``\3\2"+
		"\u00b9\u00ba\4\2\u00c4\u00c4\u00d1\u00d1\n\2$$JJiikk~~\u0089\u0089\u00b0"+
		"\u00b0\u00b4\u00b4\16\2\4#%IKOQhjjlmopr}\177\u0088\u008a\u00af\u00b1\u00b3"+
		"\u00b5\u00b6\6\2##==KKYY\2\u0806\2\u00ec\3\2\2\2\4\u0100\3\2\2\2\6\u0102"+
		"\3\2\2\2\b\u01a7\3\2\2\2\n\u01a9\3\2\2\2\f\u01b1\3\2\2\2\16\u01b5\3\2"+
		"\2\2\20\u01bc\3\2\2\2\22\u01be\3\2\2\2\24\u01c4\3\2\2\2\26\u0253\3\2\2"+
		"\2\30\u0255\3\2\2\2\32\u0260\3\2\2\2\34\u026f\3\2\2\2\36\u027b\3\2\2\2"+
		" \u027f\3\2\2\2\"\u0288\3\2\2\2$\u0295\3\2\2\2&\u02a4\3\2\2\2(\u02b1\3"+
		"\2\2\2*\u02c1\3\2\2\2,\u02c6\3\2\2\2.\u02cc\3\2\2\2\60\u02cf\3\2\2\2\62"+
		"\u02d2\3\2\2\2\64\u02e4\3\2\2\2\66\u02e6\3\2\2\28\u02f3\3\2\2\2:\u02f7"+
		"\3\2\2\2<\u02fb\3\2\2\2>\u02ff\3\2\2\2@\u0308\3\2\2\2B\u031c\3\2\2\2D"+
		"\u033e\3\2\2\2F\u0340\3\2\2\2H\u0343\3\2\2\2J\u034a\3\2\2\2L\u0356\3\2"+
		"\2\2N\u035e\3\2\2\2P\u0368\3\2\2\2R\u038d\3\2\2\2T\u039c\3\2\2\2V\u039e"+
		"\3\2\2\2X\u03a2\3\2\2\2Z\u03b1\3\2\2\2\\\u03c5\3\2\2\2^\u03c7\3\2\2\2"+
		"`\u03d0\3\2\2\2b\u03df\3\2\2\2d\u03f1\3\2\2\2f\u03ff\3\2\2\2h\u0402\3"+
		"\2\2\2j\u0432\3\2\2\2l\u0435\3\2\2\2n\u043b\3\2\2\2p\u043f\3\2\2\2r\u0445"+
		"\3\2\2\2t\u0448\3\2\2\2v\u044b\3\2\2\2x\u0455\3\2\2\2z\u0458\3\2\2\2|"+
		"\u045c\3\2\2\2~\u0461\3\2\2\2\u0080\u0467\3\2\2\2\u0082\u046a\3\2\2\2"+
		"\u0084\u0479\3\2\2\2\u0086\u04ba\3\2\2\2\u0088\u04c2\3\2\2\2\u008a\u04cd"+
		"\3\2\2\2\u008c\u04cf\3\2\2\2\u008e\u04d5\3\2\2\2\u0090\u04da\3\2\2\2\u0092"+
		"\u04e2\3\2\2\2\u0094\u04ee\3\2\2\2\u0096\u04f3\3\2\2\2\u0098\u04fb\3\2"+
		"\2\2\u009a\u04ff\3\2\2\2\u009c\u052c\3\2\2\2\u009e\u0550\3\2\2\2\u00a0"+
		"\u0552\3\2\2\2\u00a2\u0561\3\2\2\2\u00a4\u0564\3\2\2\2\u00a6\u059c\3\2"+
		"\2\2\u00a8\u059e\3\2\2\2\u00aa\u05b1\3\2\2\2\u00ac\u061e\3\2\2\2\u00ae"+
		"\u066a\3\2\2\2\u00b0\u0674\3\2\2\2\u00b2\u0689\3\2\2\2\u00b4\u0691\3\2"+
		"\2\2\u00b6\u0695\3\2\2\2\u00b8\u06a1\3\2\2\2\u00ba\u06ae\3\2\2\2\u00bc"+
		"\u06b8\3\2\2\2\u00be\u06bc\3\2\2\2\u00c0\u06c7\3\2\2\2\u00c2\u06c9\3\2"+
		"\2\2\u00c4\u06d3\3\2\2\2\u00c6\u06d6\3\2\2\2\u00c8\u06e3\3\2\2\2\u00ca"+
		"\u06e5\3\2\2\2\u00cc\u06e7\3\2\2\2\u00ce\u06e9\3\2\2\2\u00d0\u06ed\3\2"+
		"\2\2\u00d2\u06ef\3\2\2\2\u00d4\u06f4\3\2\2\2\u00d6\u06f8\3\2\2\2\u00d8"+
		"\u06fd\3\2\2\2\u00da\u0701\3\2\2\2\u00dc\u0703\3\2\2\2\u00de\u00e2\5\4"+
		"\3\2\u00df\u00e0\7U\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e3\7\u00bc\2\2\u00e2"+
		"\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\7@"+
		"\2\2\u00e5\u00e7\5\u00dan\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00ea\7\u00d8\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ed\5X-\2\u00ec\u00de\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\3\3\2\2\2\u00ee\u0101\5\6\4\2\u00ef\u0101\5\22\n"+
		"\2\u00f0\u0101\5\24\13\2\u00f1\u0101\5\26\f\2\u00f2\u0101\5P)\2\u00f3"+
		"\u0101\5R*\2\u00f4\u0101\5T+\2\u00f5\u0101\5V,\2\u00f6\u0101\5^\60\2\u00f7"+
		"\u0101\5`\61\2\u00f8\u0101\5b\62\2\u00f9\u0101\5d\63\2\u00fa\u0101\5\u009a"+
		"N\2\u00fb\u0101\5\u009cO\2\u00fc\u0101\5\u009eP\2\u00fd\u0101\5\u00a0"+
		"Q\2\u00fe\u0101\5\u00a2R\2\u00ff\u0101\5\u00a4S\2\u0100\u00ee\3\2\2\2"+
		"\u0100\u00ef\3\2\2\2\u0100\u00f0\3\2\2\2\u0100\u00f1\3\2\2\2\u0100\u00f2"+
		"\3\2\2\2\u0100\u00f3\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00f5\3\2\2\2\u0100"+
		"\u00f6\3\2\2\2\u0100\u00f7\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00f9\3\2"+
		"\2\2\u0100\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100"+
		"\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\5\3\2\2\2"+
		"\u0102\u0103\7\7\2\2\u0103\u0104\7\u0097\2\2\u0104\u0106\5\u00bc_\2\u0105"+
		"\u0107\5,\27\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010d\5\b\5\2\u0109\u010a\7\u00c2\2\2\u010a\u010c\5\b\5\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\7\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\3\2\2\u0111\u0115"+
		"\7\33\2\2\u0112\u0113\7L\2\2\u0113\u0114\7p\2\2\u0114\u0116\7\67\2\2\u0115"+
		"\u0112\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011a\5D"+
		"#\2\u0118\u0119\7\4\2\2\u0119\u011b\5\u00b6\\\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u01a8\3\2\2\2\u011c\u011d\7\3\2\2\u011d\u0121\7O"+
		"\2\2\u011e\u011f\7L\2\2\u011f\u0120\7p\2\2\u0120\u0122\7\67\2\2\u0121"+
		"\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126\5H"+
		"%\2\u0124\u0125\7\4\2\2\u0125\u0127\5\u00b6\\\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u01a8\3\2\2\2\u0128\u0129\7\20\2\2\u0129\u012c\5"+
		"\20\t\2\u012a\u012b\7B\2\2\u012b\u012d\5\u00bc_\2\u012c\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u01a8\3\2\2\2\u012e\u012f\7\27\2\2\u012f\u0132"+
		"\7\33\2\2\u0130\u0131\7L\2\2\u0131\u0133\7\67\2\2\u0132\u0130\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\5\u00b6\\\2\u0135"+
		"\u0136\7N\2\2\u0136\u0138\5\20\t\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u01a8\3\2\2\2\u0139\u013a\7\34\2\2\u013a\u013d\7\33\2\2\u013b"+
		"\u013c\7L\2\2\u013c\u013e\7\67\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0140\5\u00b6\\\2\u0140\u0141\7\u00bc\2"+
		"\2\u0141\u01a8\3\2\2\2\u0142\u0143\7(\2\2\u0143\u0144\7\u00b2\2\2\u0144"+
		"\u01a8\5\u00acW\2\u0145\u0146\7,\2\2\u0146\u01a8\5\20\t\2\u0147\u0148"+
		"\7\62\2\2\u0148\u014b\7\33\2\2\u0149\u014a\7L\2\2\u014a\u014c\7\67\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u01a8"+
		"\5\u00b6\\\2\u014e\u014f\7\62\2\2\u014f\u0152\7O\2\2\u0150\u0151\7L\2"+
		"\2\u0151\u0153\7\67\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u01a8\5\u00b6\\\2\u0155\u0156\7\62\2\2\u0156\u01a8"+
		"\5\20\t\2\u0157\u0159\7A\2\2\u0158\u015a\5\20\t\2\u0159\u0158\3\2\2\2"+
		"\u0159\u015a\3\2\2\2\u015a\u01a8\3\2\2\2\u015b\u015c\7j\2\2\u015c\u015f"+
		"\7\33\2\2\u015d\u015e\7L\2\2\u015e\u0160\7\67\2\2\u015f\u015d\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\5\u00b6\\\2\u0162"+
		"\u0163\5J&\2\u0163\u01a8\3\2\2\2\u0164\u0165\7j\2\2\u0165\u0168\7\33\2"+
		"\2\u0166\u0167\7L\2\2\u0167\u0169\7\67\2\2\u0168\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5\u00b6\\\2\u016b\u016c\7\34"+
		"\2\2\u016c\u016d\7\u00bc\2\2\u016d\u01a8\3\2\2\2\u016e\u016f\7j\2\2\u016f"+
		"\u0172\7\33\2\2\u0170\u0171\7L\2\2\u0171\u0173\7\67\2\2\u0172\u0170\3"+
		"\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\5\u00b6\\\2"+
		"\u0175\u0176\7\u0081\2\2\u0176\u0177\5\16\b\2\u0177\u01a8\3\2\2\2\u0178"+
		"\u0179\7j\2\2\u0179\u017c\7\33\2\2\u017a\u017b\7L\2\2\u017b\u017d\7\67"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u01a8\5D#\2\u017f\u0180\7j\2\2\u0180\u0181\7w\2\2\u0181\u0182\7\23\2"+
		"\2\u0182\u01a8\5\u00acW\2\u0183\u0184\7j\2\2\u0184\u01a8\5> \2\u0185\u0186"+
		"\7l\2\2\u0186\u0190\5\20\t\2\u0187\u0188\7\u009f\2\2\u0188\u0189\7/\2"+
		"\2\u0189\u0191\7\u00bc\2\2\u018a\u018b\7\u009f\2\2\u018b\u018c\7\u00ae"+
		"\2\2\u018c\u0191\7\u00bc\2\2\u018d\u018e\7\u009f\2\2\u018e\u018f\7\u0097"+
		"\2\2\u018f\u0191\5\u00bc_\2\u0190\u0187\3\2\2\2\u0190\u018a\3\2\2\2\u0190"+
		"\u018d\3\2\2\2\u0191\u01a8\3\2\2\2\u0192\u0193\7\u0081\2\2\u0193\u01a8"+
		"\7\u00a5\2\2\u0194\u0195\7\u0082\2\2\u0195\u0198\7\33\2\2\u0196\u0197"+
		"\7L\2\2\u0197\u0199\7\67\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\5\u00b6\\\2\u019b\u019c\7\u009f\2\2\u019c\u019d"+
		"\5\u00b6\\\2\u019d\u01a8\3\2\2\2\u019e\u019f\7\u0083\2\2\u019f\u01a0\5"+
		"\20\t\2\u01a0\u01a1\7B\2\2\u01a1\u01a2\5\u00bc_\2\u01a2\u01a8\3\2\2\2"+
		"\u01a3\u01a4\7\u00a8\2\2\u01a4\u01a5\5\n\6\2\u01a5\u01a6\5t;\2\u01a6\u01a8"+
		"\3\2\2\2\u01a7\u0110\3\2\2\2\u01a7\u011c\3\2\2\2\u01a7\u0128\3\2\2\2\u01a7"+
		"\u012e\3\2\2\2\u01a7\u0139\3\2\2\2\u01a7\u0142\3\2\2\2\u01a7\u0145\3\2"+
		"\2\2\u01a7\u0147\3\2\2\2\u01a7\u014e\3\2\2\2\u01a7\u0155\3\2\2\2\u01a7"+
		"\u0157\3\2\2\2\u01a7\u015b\3\2\2\2\u01a7\u0164\3\2\2\2\u01a7\u016e\3\2"+
		"\2\2\u01a7\u0178\3\2\2\2\u01a7\u017f\3\2\2\2\u01a7\u0183\3\2\2\2\u01a7"+
		"\u0185\3\2\2\2\u01a7\u0192\3\2\2\2\u01a7\u0194\3\2\2\2\u01a7\u019e\3\2"+
		"\2\2\u01a7\u01a3\3\2\2\2\u01a8\t\3\2\2\2\u01a9\u01ae\5\f\7\2\u01aa\u01ab"+
		"\7\u00c2\2\2\u01ab\u01ad\5\f\7\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2"+
		"\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\13\3\2\2\2\u01b0\u01ae"+
		"\3\2\2\2\u01b1\u01b2\5\u00b6\\\2\u01b2\u01b3\7\u00c7\2\2\u01b3\u01b4\5"+
		"\u00acW\2\u01b4\r\3\2\2\2\u01b5\u01b6\t\2\2\2\u01b6\17\3\2\2\2\u01b7\u01b8"+
		"\7z\2\2\u01b8\u01bd\5\u00acW\2\u01b9\u01ba\7z\2\2\u01ba\u01bb\7K\2\2\u01bb"+
		"\u01bd\7\u00bc\2\2\u01bc\u01b7\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bd\21\3"+
		"\2\2\2\u01be\u01bf\7\20\2\2\u01bf\u01c0\7.\2\2\u01c0\u01c2\5\u00bc_\2"+
		"\u01c1\u01c3\5,\27\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\23"+
		"\3\2\2\2\u01c4\u01c5\7\26\2\2\u01c5\u01c6\7\u0097\2\2\u01c6\u01c8\5\u00bc"+
		"_\2\u01c7\u01c9\5\20\t\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\25\3\2\2\2\u01ca\u01cb\t\3\2\2\u01cb\u01cf\7!\2\2\u01cc\u01cd\7L\2\2"+
		"\u01cd\u01ce\7p\2\2\u01ce\u01d0\7\67\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\5\u00c2b\2\u01d2\u01d4\5,\27"+
		"\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d7"+
		"\5@!\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u0254\3\2\2\2\u01d8"+
		"\u01d9\t\3\2\2\u01d9\u01dd\7.\2\2\u01da\u01db\7L\2\2\u01db\u01dc\7p\2"+
		"\2\u01dc\u01de\7\67\2\2\u01dd\u01da\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e1\5\u00bc_\2\u01e0\u01e2\5.\30\2\u01e1\u01e0"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\5,\27\2\u01e4"+
		"\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\5\30"+
		"\r\2\u01e7\u01e8\5\34\17\2\u01e8\u0254\3\2\2\2\u01e9\u01ea\t\3\2\2\u01ea"+
		"\u01eb\7b\2\2\u01eb\u01ef\7\u00ad\2\2\u01ec\u01ed\7L\2\2\u01ed\u01ee\7"+
		"p\2\2\u01ee\u01f0\7\67\2\2\u01ef\u01ec\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f3\5\u00bc_\2\u01f2\u01f4\5.\30\2\u01f3\u01f2"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f7\5,\27\2\u01f6"+
		"\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fd\3\2\2\2\u01f8\u01f9\7\u00b3"+
		"\2\2\u01f9\u01fb\7\u009d\2\2\u01fa\u01fc\7\u00ba\2\2\u01fb\u01fa\3\2\2"+
		"\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f8\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u0201\5\60\31\2\u0200\u01ff\3\2\2\2"+
		"\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0204\5\64\33\2\u0203\u0202"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\5\62\32\2"+
		"\u0206\u0254\3\2\2\2\u0207\u0208\t\3\2\2\u0208\u0209\7e\2\2\u0209\u020d"+
		"\7\u00ad\2\2\u020a\u020b\7L\2\2\u020b\u020c\7p\2\2\u020c\u020e\7\67\2"+
		"\2\u020d\u020a\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211"+
		"\5\u00bc_\2\u0210\u0212\5.\30\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2"+
		"\2\u0212\u0214\3\2\2\2\u0213\u0215\5,\27\2\u0214\u0213\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0218\5\64\33\2\u0217\u0216\3\2\2\2"+
		"\u0217\u0218\3\2\2\2\u0218\u021e\3\2\2\2\u0219\u021f\5\60\31\2\u021a\u021c"+
		"\5\66\34\2\u021b\u021d\7{\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2"+
		"\u021d\u021f\3\2\2\2\u021e\u0219\3\2\2\2\u021e\u021a\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0221\5\62\32\2\u0221\u0254\3\2\2\2\u0222\u0224\t\3\2\2"+
		"\u0223\u0225\7\u0099\2\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u022a\7\u0097\2\2\u0227\u0228\7L\2\2\u0228\u0229"+
		"\7p\2\2\u0229\u022b\7\67\2\2\u022a\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022e\5\u00bc_\2\u022d\u022f\5.\30\2\u022e\u022d"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u0232\5,\27\2\u0231"+
		"\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u0235\5\64"+
		"\33\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236"+
		"\u0238\5\66\34\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3"+
		"\2\2\2\u0239\u023b\5\62\32\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u0254\3\2\2\2\u023c\u023f\t\3\2\2\u023d\u023e\7v\2\2\u023e\u0240\7\u0083"+
		"\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0245\7\u00ad\2\2\u0242\u0243\7L\2\2\u0243\u0244\7p\2\2\u0244\u0246\7"+
		"\67\2\2\u0245\u0242\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0249\5\u00bc_\2\u0248\u024a\5.\30\2\u0249\u0248\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u024d\5,\27\2\u024c\u024b\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u0250\5\64\33\2\u024f\u024e\3"+
		"\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\5\62\32\2\u0252"+
		"\u0254\3\2\2\2\u0253\u01ca\3\2\2\2\u0253\u01d8\3\2\2\2\u0253\u01e9\3\2"+
		"\2\2\u0253\u0207\3\2\2\2\u0253\u0222\3\2\2\2\u0253\u023c\3\2\2\2\u0254"+
		"\27\3\2\2\2\u0255\u0256\7\u00cd\2\2\u0256\u025b\5\32\16\2\u0257\u0258"+
		"\7\u00c2\2\2\u0258\u025a\5\32\16\2\u0259\u0257\3\2\2\2\u025a\u025d\3\2"+
		"\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025e\u025f\7\u00d7\2\2\u025f\31\3\2\2\2\u0260\u0261\5"+
		"\u00d2j\2\u0261\u026b\5\u00a6T\2\u0262\u0263\7&\2\2\u0263\u026a\5\u00c8"+
		"e\2\u0264\u0265\79\2\2\u0265\u026a\5\u00acW\2\u0266\u026a\7I\2\2\u0267"+
		"\u026a\7Q\2\2\u0268\u026a\7W\2\2\u0269\u0262\3\2\2\2\u0269\u0264\3\2\2"+
		"\2\u0269\u0266\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u026d"+
		"\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\33\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026e\u0270\5\36\20\2\u026f\u026e\3\2\2\2\u026f\u0270\3"+
		"\2\2\2\u0270\u0278\3\2\2\2\u0271\u0277\5\"\22\2\u0272\u0277\5$\23\2\u0273"+
		"\u0277\5&\24\2\u0274\u0277\5(\25\2\u0275\u0277\5*\26\2\u0276\u0271\3\2"+
		"\2\2\u0276\u0272\3\2\2\2\u0276\u0273\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\35\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\7}\2\2\u027c\u027d"+
		"\7Y\2\2\u027d\u027e\5\u00a8U\2\u027e\37\3\2\2\2\u027f\u0286\5\u00d2j\2"+
		"\u0280\u0283\5\u00d2j\2\u0281\u0282\7\u00cd\2\2\u0282\u0284\7\u00d7\2"+
		"\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0287"+
		"\5\u00c8e\2\u0286\u0280\3\2\2\2\u0286\u0285\3\2\2\2\u0287!\3\2\2\2\u0288"+
		"\u0289\7\u0090\2\2\u0289\u028a\7\u00cd\2\2\u028a\u028b\5\u00d2j\2\u028b"+
		"\u028f\7\u00cd\2\2\u028c\u028e\5 \21\2\u028d\u028c\3\2\2\2\u028e\u0291"+
		"\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0292\u0293\7\u00d7\2\2\u0293\u0294\7\u00d7\2\2\u0294#"+
		"\3\2\2\2\u0295\u0296\7_\2\2\u0296\u02a0\7\u00cd\2\2\u0297\u02a1\7\u00ba"+
		"\2\2\u0298\u0299\7h\2\2\u0299\u029a\7\u00ba\2\2\u029a\u029b\7f\2\2\u029b"+
		"\u02a1\7\u00ba\2\2\u029c\u029d\7f\2\2\u029d\u029e\7\u00ba\2\2\u029e\u029f"+
		"\7h\2\2\u029f\u02a1\7\u00ba\2\2\u02a0\u0297\3\2\2\2\u02a0\u0298\3\2\2"+
		"\2\u02a0\u029c\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\u00d7\2\2\u02a3"+
		"%\3\2\2\2\u02a4\u02a5\7\\\2\2\u02a5\u02a6\7\u00cd\2\2\u02a6\u02a7\5\u00d2"+
		"j\2\u02a7\u02ab\7\u00cd\2\2\u02a8\u02aa\5 \21\2\u02a9\u02a8\3\2\2\2\u02aa"+
		"\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2"+
		"\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\7\u00d7\2\2\u02af\u02b0\7\u00d7\2"+
		"\2\u02b0\'\3\2\2\2\u02b1\u02b2\7\177\2\2\u02b2\u02bd\7\u00cd\2\2\u02b3"+
		"\u02b4\7h\2\2\u02b4\u02b5\5\u00d2j\2\u02b5\u02b6\7f\2\2\u02b6\u02b7\5"+
		"\u00d2j\2\u02b7\u02be\3\2\2\2\u02b8\u02b9\7f\2\2\u02b9\u02ba\5\u00d2j"+
		"\2\u02ba\u02bb\7h\2\2\u02bb\u02bc\5\u00d2j\2\u02bc\u02be\3\2\2\2\u02bd"+
		"\u02b3\3\2\2\2\u02bd\u02b8\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\7\u00d7"+
		"\2\2\u02c0)\3\2\2\2\u02c1\u02c2\7\u008e\2\2\u02c2\u02c3\7\u00cd\2\2\u02c3"+
		"\u02c4\5\u0096L\2\u02c4\u02c5\7\u00d7\2\2\u02c5+\3\2\2\2\u02c6\u02c7\7"+
		"t\2\2\u02c7\u02ca\7\30\2\2\u02c8\u02cb\5\u00d2j\2\u02c9\u02cb\7\u00bc"+
		"\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb-\3\2\2\2\u02cc\u02cd"+
		"\7\u00ab\2\2\u02cd\u02ce\7\u00bc\2\2\u02ce/\3\2\2\2\u02cf\u02d0\7\u009f"+
		"\2\2\u02d0\u02d1\5\u00bc_\2\u02d1\61\3\2\2\2\u02d2\u02d3\7\f\2\2\u02d3"+
		"\u02d4\5d\63\2\u02d4\63\3\2\2\2\u02d5\u02d6\7\u00cd\2\2\u02d6\u02db\5"+
		"B\"\2\u02d7\u02d8\7\u00c2\2\2\u02d8\u02da\5B\"\2\u02d9\u02d7\3\2\2\2\u02da"+
		"\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\3\2"+
		"\2\2\u02dd\u02db\3\2\2\2\u02de\u02df\7\u00d7\2\2\u02df\u02e5\3\2\2\2\u02e0"+
		"\u02e1\7\f\2\2\u02e1\u02e5\5\u00bc_\2\u02e2\u02e3\7\f\2\2\u02e3\u02e5"+
		"\5\u00ba^\2\u02e4\u02d5\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e4\u02e2\3\2\2"+
		"\2\u02e5\65\3\2\2\2\u02e6\u02f0\5@!\2\u02e7\u02ef\5z>\2\u02e8\u02ef\5"+
		"8\35\2\u02e9\u02ef\5:\36\2\u02ea\u02ef\5<\37\2\u02eb\u02ef\5> \2\u02ec"+
		"\u02ef\5\u0080A\2\u02ed\u02ef\5\u0082B\2\u02ee\u02e7\3\2\2\2\u02ee\u02e8"+
		"\3\2\2\2\u02ee\u02e9\3\2\2\2\u02ee\u02ea\3\2\2\2\u02ee\u02eb\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2"+
		"\2\2\u02f0\u02f1\3\2\2\2\u02f1\67\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f4"+
		"\7z\2\2\u02f4\u02f5\7\23\2\2\u02f5\u02f6\5\u00acW\2\u02f69\3\2\2\2\u02f7"+
		"\u02f8\7}\2\2\u02f8\u02f9\7Y\2\2\u02f9\u02fa\5\u00acW\2\u02fa;\3\2\2\2"+
		"\u02fb\u02fc\7\u0088\2\2\u02fc\u02fd\7\23\2\2\u02fd\u02fe\5\u00acW\2\u02fe"+
		"=\3\2\2\2\u02ff\u0300\7\u00a5\2\2\u0300\u0305\5N(\2\u0301\u0302\7\u00c2"+
		"\2\2\u0302\u0304\5N(\2\u0303\u0301\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306?\3\2\2\2\u0307\u0305\3\2\2\2\u0308"+
		"\u030a\7\65\2\2\u0309\u030b\7\u00c7\2\2\u030a\u0309\3\2\2\2\u030a\u030b"+
		"\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u0312\5\u00dan\2\u030d\u030f\7\u00cd"+
		"\2\2\u030e\u0310\5\u00a8U\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0313\7\u00d7\2\2\u0312\u030d\3\2\2\2\u0312\u0313"+
		"\3\2\2\2\u0313A\3\2\2\2\u0314\u031d\5D#\2\u0315\u0316\7\35\2\2\u0316\u0317"+
		"\5\u00d2j\2\u0317\u0318\7\26\2\2\u0318\u0319\5\u00acW\2\u0319\u031d\3"+
		"\2\2\2\u031a\u031b\7O\2\2\u031b\u031d\5H%\2\u031c\u0314\3\2\2\2\u031c"+
		"\u0315\3\2\2\2\u031c\u031a\3\2\2\2\u031dC\3\2\2\2\u031e\u031f\5\u00b6"+
		"\\\2\u031f\u0321\5\u00a6T\2\u0320\u0322\5F$\2\u0321\u0320\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0324\7\34\2\2\u0324\u0326\7"+
		"\u00bc\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2"+
		"\u0327\u0329\5J&\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032c"+
		"\3\2\2\2\u032a\u032b\7\u00a5\2\2\u032b\u032d\5\u00acW\2\u032c\u032a\3"+
		"\2\2\2\u032c\u032d\3\2\2\2\u032d\u033f\3\2\2\2\u032e\u0330\5\u00b6\\\2"+
		"\u032f\u0331\5\u00a6T\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0335\5F$\2\u0333\u0334\7\34\2\2\u0334\u0336\7\u00bc"+
		"\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337"+
		"\u0339\5J&\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033c\3\2\2"+
		"\2\u033a\u033b\7\u00a5\2\2\u033b\u033d\5\u00acW\2\u033c\u033a\3\2\2\2"+
		"\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u031e\3\2\2\2\u033e\u032e"+
		"\3\2\2\2\u033fE\3\2\2\2\u0340\u0341\t\4\2\2\u0341\u0342\5\u00acW\2\u0342"+
		"G\3\2\2\2\u0343\u0344\5\u00b6\\\2\u0344\u0345\5\u00acW\2\u0345\u0346\7"+
		"\u00a6\2\2\u0346\u0347\5\u00a6T\2\u0347\u0348\7F\2\2\u0348\u0349\7\u00ba"+
		"\2\2\u0349I\3\2\2\2\u034a\u034b\7\31\2\2\u034b\u034c\7\u00cd\2\2\u034c"+
		"\u0351\5L\'\2\u034d\u034e\7\u00c2\2\2\u034e\u0350\5L\'\2\u034f\u034d\3"+
		"\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0354\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u0355\7\u00d7\2\2\u0355K\3\2"+
		"\2\2\u0356\u035c\5\u00d2j\2\u0357\u0359\7\u00cd\2\2\u0358\u035a\5\u00a8"+
		"U\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u035d\7\u00d7\2\2\u035c\u0357\3\2\2\2\u035c\u035d\3\2\2\2\u035dM\3\2"+
		"\2\2\u035e\u0366\5\u00acW\2\u035f\u0367\7(\2\2\u0360\u0361\7\u009f\2\2"+
		"\u0361\u0362\7/\2\2\u0362\u0367\7\u00bc\2\2\u0363\u0364\7\u009f\2\2\u0364"+
		"\u0365\7\u00ae\2\2\u0365\u0367\7\u00bc\2\2\u0366\u035f\3\2\2\2\u0366\u0360"+
		"\3\2\2\2\u0366\u0363\3\2\2\2\u0366\u0367\3\2\2\2\u0367O\3\2\2\2\u0368"+
		"\u036a\t\5\2\2\u0369\u036b\7\u0097\2\2\u036a\u0369\3\2\2\2\u036a\u036b"+
		"\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\5\u00b8]\2\u036dQ\3\2\2\2\u036e"+
		"\u036f\t\6\2\2\u036f\u0372\7!\2\2\u0370\u0371\7L\2\2\u0371\u0373\7\67"+
		"\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0376\5\u00c2b\2\u0375\u0377\5,\27\2\u0376\u0375\3\2\2\2\u0376\u0377"+
		"\3\2\2\2\u0377\u038e\3\2\2\2\u0378\u037f\t\6\2\2\u0379\u0380\7.\2\2\u037a"+
		"\u037c\7\u0099\2\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d"+
		"\3\2\2\2\u037d\u0380\7\u0097\2\2\u037e\u0380\7\u00ad\2\2\u037f\u0379\3"+
		"\2\2\2\u037f\u037b\3\2\2\2\u037f\u037e\3\2\2\2\u0380\u0383\3\2\2\2\u0381"+
		"\u0382\7L\2\2\u0382\u0384\7\67\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u0387\5\u00bc_\2\u0386\u0388\5,\27\2\u0387"+
		"\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u038a\7o"+
		"\2\2\u038a\u038c\7\'\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038e\3\2\2\2\u038d\u036e\3\2\2\2\u038d\u0378\3\2\2\2\u038eS\3\2\2\2"+
		"\u038f\u0390\7\67\2\2\u0390\u0391\7!\2\2\u0391\u039d\5\u00c2b\2\u0392"+
		"\u0399\7\67\2\2\u0393\u039a\7.\2\2\u0394\u0396\7\u0099\2\2\u0395\u0394"+
		"\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u039a\7\u0097\2"+
		"\2\u0398\u039a\7\u00ad\2\2\u0399\u0393\3\2\2\2\u0399\u0395\3\2\2\2\u0399"+
		"\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039d\5\u00bc"+
		"_\2\u039c\u038f\3\2\2\2\u039c\u0392\3\2\2\2\u039dU\3\2\2\2\u039e\u039f"+
		"\78\2\2\u039f\u03a0\7\u0095\2\2\u03a0\u03a1\5\4\3\2\u03a1W\3\2\2\2\u03a2"+
		"\u03a3\7S\2\2\u03a3\u03a5\7U\2\2\u03a4\u03a6\7\u0097\2\2\u03a5\u03a4\3"+
		"\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03aa\3\2\2\2\u03a7\u03ab\5\u00bc_\2"+
		"\u03a8\u03a9\7D\2\2\u03a9\u03ab\5\u00ba^\2\u03aa\u03a7\3\2\2\2\u03aa\u03a8"+
		"\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03ae\5Z.\2\u03ad\u03ac\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\5\\/\2\u03b0Y\3\2\2\2\u03b1"+
		"\u03b2\7\u00cd\2\2\u03b2\u03b7\5\u00b6\\\2\u03b3\u03b4\7\u00c2\2\2\u03b4"+
		"\u03b6\5\u00b6\\\2\u03b5\u03b3\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba"+
		"\u03bb\7\u00d7\2\2\u03bb[\3\2\2\2\u03bc\u03bd\7@\2\2\u03bd\u03c6\5\u00d2"+
		"j\2\u03be\u03c6\7\u00ac\2\2\u03bf\u03c1\5d\63\2\u03c0\u03c2\7\u00d8\2"+
		"\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4"+
		"\7\2\2\3\u03c4\u03c6\3\2\2\2\u03c5\u03bc\3\2\2\2\u03c5\u03be\3\2\2\2\u03c5"+
		"\u03bf\3\2\2\2\u03c6]\3\2\2\2\u03c7\u03c8\7Z\2\2\u03c8\u03ca\7m\2\2\u03c9"+
		"\u03cb\5,\27\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2"+
		"\2\2\u03cc\u03ce\5t;\2\u03cd\u03cf\t\7\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf"+
		"\3\2\2\2\u03cf_\3\2\2\2\u03d0\u03d1\7u\2\2\u03d1\u03d2\7\u0097\2\2\u03d2"+
		"\u03d4\5\u00bc_\2\u03d3\u03d5\5,\27\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5"+
		"\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d8\5\20\t\2\u03d7\u03d6\3\2\2\2"+
		"\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9\u03db\7<\2\2\u03da\u03d9"+
		"\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03de\7%\2\2\u03dd"+
		"\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03dea\3\2\2\2\u03df\u03e0\7\u0082"+
		"\2\2\u03e0\u03e1\7\u0097\2\2\u03e1\u03e2\5\u00bc_\2\u03e2\u03e3\7\u009f"+
		"\2\2\u03e3\u03eb\5\u00bc_\2\u03e4\u03e5\7\u00c2\2\2\u03e5\u03e6\5\u00bc"+
		"_\2\u03e6\u03e7\7\u009f\2\2\u03e7\u03e8\5\u00bc_\2\u03e8\u03ea\3\2\2\2"+
		"\u03e9\u03e4\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec"+
		"\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03f0\5,\27\2\u03ef"+
		"\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0c\3\2\2\2\u03f1\u03f7\5f\64\2"+
		"\u03f2\u03f3\7\u00a7\2\2\u03f3\u03f4\7\6\2\2\u03f4\u03f6\5f\64\2\u03f5"+
		"\u03f2\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2"+
		"\2\2\u03f8e\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u0400\5h\65\2\u03fb\u03fc"+
		"\7\u00cd\2\2\u03fc\u03fd\5d\63\2\u03fd\u03fe\7\u00d7\2\2\u03fe\u0400\3"+
		"\2\2\2\u03ff\u03fa\3\2\2\2\u03ff\u03fb\3\2\2\2\u0400g\3\2\2\2\u0401\u0403"+
		"\5j\66\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0406\7\u008a\2\2\u0405\u0407\7\60\2\2\u0406\u0405\3\2\2\2\u0406\u0407"+
		"\3\2\2\2\u0407\u0409\3\2\2\2\u0408\u040a\5l\67\2\u0409\u0408\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040d\5\u00a8U\2\u040c\u040e"+
		"\5n8\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f"+
		"\u0411\5p9\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\3\2\2"+
		"\2\u0412\u0414\5r:\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416"+
		"\3\2\2\2\u0415\u0417\5t;\2\u0416\u0415\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"\u0419\3\2\2\2\u0418\u041a\5v<\2\u0419\u0418\3\2\2\2\u0419\u041a\3\2\2"+
		"\2\u041a\u041d\3\2\2\2\u041b\u041c\7\u00b3\2\2\u041c\u041e\t\b\2\2\u041d"+
		"\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u0420\7\u00b3"+
		"\2\2\u0420\u0422\7\u00a1\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0424\3\2\2\2\u0423\u0425\5x=\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2"+
		"\2\u0425\u0427\3\2\2\2\u0426\u0428\5z>\2\u0427\u0426\3\2\2\2\u0427\u0428"+
		"\3\2\2\2\u0428\u042a\3\2\2\2\u0429\u042b\5|?\2\u042a\u0429\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u042d\3\2\2\2\u042c\u042e\5~@\2\u042d\u042c\3\2\2"+
		"\2\u042d\u042e\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u0431\5\u0080A\2\u0430"+
		"\u042f\3\2\2\2\u0430\u0431\3\2\2\2\u0431i\3\2\2\2\u0432\u0433\7\u00b3"+
		"\2\2\u0433\u0434\5\u00a8U\2\u0434k\3\2\2\2\u0435\u0436\7\u00a0\2\2\u0436"+
		"\u0439\7\u00ba\2\2\u0437\u0438\7\u00b3\2\2\u0438\u043a\7\u009c\2\2\u0439"+
		"\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043am\3\2\2\2\u043b\u043c\7B\2\2\u043c"+
		"\u043d\5\u0084C\2\u043do\3\2\2\2\u043e\u0440\t\t\2\2\u043f\u043e\3\2\2"+
		"\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\7\13\2\2\u0442"+
		"\u0443\7X\2\2\u0443\u0444\5\u00a8U\2\u0444q\3\2\2\2\u0445\u0446\7|\2\2"+
		"\u0446\u0447\5\u00acW\2\u0447s\3\2\2\2\u0448\u0449\7\u00b2\2\2\u0449\u044a"+
		"\5\u00acW\2\u044au\3\2\2\2\u044b\u044c\7G\2\2\u044c\u0453\7\23\2\2\u044d"+
		"\u044e\t\b\2\2\u044e\u044f\7\u00cd\2\2\u044f\u0450\5\u00a8U\2\u0450\u0451"+
		"\7\u00d7\2\2\u0451\u0454\3\2\2\2\u0452\u0454\5\u00a8U\2\u0453\u044d\3"+
		"\2\2\2\u0453\u0452\3\2\2\2\u0454w\3\2\2\2\u0455\u0456\7H\2\2\u0456\u0457"+
		"\5\u00acW\2\u0457y\3\2\2\2\u0458\u0459\7w\2\2\u0459\u045a\7\23\2\2\u045a"+
		"\u045b\5\u0090I\2\u045b{\3\2\2\2\u045c\u045d\7a\2\2\u045d\u045e\5\u008e"+
		"H\2\u045e\u045f\7\23\2\2\u045f\u0460\5\u00a8U\2\u0460}\3\2\2\2\u0461\u0462"+
		"\7a\2\2\u0462\u0465\5\u008eH\2\u0463\u0464\7\u00b3\2\2\u0464\u0466\7\u009c"+
		"\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\177\3\2\2\2\u0467\u0468"+
		"\7\u008e\2\2\u0468\u0469\5\u0096L\2\u0469\u0081\3\2\2\2\u046a\u046b\7"+
		"\34\2\2\u046b\u046c\7\u00bc\2\2\u046c\u0083\3\2\2\2\u046d\u046e\bC\1\2"+
		"\u046e\u0470\5\u00b8]\2\u046f\u0471\7<\2\2\u0470\u046f\3\2\2\2\u0470\u0471"+
		"\3\2\2\2\u0471\u0473\3\2\2\2\u0472\u0474\5\u008cG\2\u0473\u0472\3\2\2"+
		"\2\u0473\u0474\3\2\2\2\u0474\u047a\3\2\2\2\u0475\u0476\7\u00cd\2\2\u0476"+
		"\u0477\5\u0084C\2\u0477\u0478\7\u00d7\2\2\u0478\u047a\3\2\2\2\u0479\u046d"+
		"\3\2\2\2\u0479\u0475\3\2\2\2\u047a\u048c\3\2\2\2\u047b\u047c\f\5\2\2\u047c"+
		"\u047d\5\u0088E\2\u047d\u047e\5\u0084C\6\u047e\u048b\3\2\2\2\u047f\u0481"+
		"\f\6\2\2\u0480\u0482\t\n\2\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482"+
		"\u0484\3\2\2\2\u0483\u0485\5\u0086D\2\u0484\u0483\3\2\2\2\u0484\u0485"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\7X\2\2\u0487\u0488\5\u0084C\2"+
		"\u0488\u0489\5\u008aF\2\u0489\u048b\3\2\2\2\u048a\u047b\3\2\2\2\u048a"+
		"\u047f\3\2\2\2\u048b\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2"+
		"\2\2\u048d\u0085\3\2\2\2\u048e\u048c\3\2\2\2\u048f\u0491\t\13\2\2\u0490"+
		"\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0499\7R"+
		"\2\2\u0493\u0495\7R\2\2\u0494\u0496\t\13\2\2\u0495\u0494\3\2\2\2\u0495"+
		"\u0496\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0499\t\13\2\2\u0498\u0490\3"+
		"\2\2\2\u0498\u0493\3\2\2\2\u0498\u0497\3\2\2\2\u0499\u04bb\3\2\2\2\u049a"+
		"\u049c\t\f\2\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2"+
		"\2\2\u049d\u049f\t\r\2\2\u049e\u04a0\7x\2\2\u049f\u049e\3\2\2\2\u049f"+
		"\u04a0\3\2\2\2\u04a0\u04a9\3\2\2\2\u04a1\u04a3\t\r\2\2\u04a2\u04a4\7x"+
		"\2\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a6\3\2\2\2\u04a5"+
		"\u04a7\t\f\2\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2"+
		"\2\2\u04a8\u049b\3\2\2\2\u04a8\u04a1\3\2\2\2\u04a9\u04bb\3\2\2\2\u04aa"+
		"\u04ac\t\16\2\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\3"+
		"\2\2\2\u04ad\u04af\7C\2\2\u04ae\u04b0\7x\2\2\u04af\u04ae\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04b9\3\2\2\2\u04b1\u04b3\7C\2\2\u04b2\u04b4\7x\2"+
		"\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b7"+
		"\t\16\2\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b9\3\2\2\2"+
		"\u04b8\u04ab\3\2\2\2\u04b8\u04b1\3\2\2\2\u04b9\u04bb\3\2\2\2\u04ba\u0498"+
		"\3\2\2\2\u04ba\u04a8\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u0087\3\2\2\2\u04bc"+
		"\u04be\t\n\2\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2"+
		"\2\2\u04bf\u04c0\7\37\2\2\u04c0\u04c3\7X\2\2\u04c1\u04c3\7\u00c2\2\2\u04c2"+
		"\u04bd\3\2\2\2\u04c2\u04c1\3\2\2\2\u04c3\u0089\3\2\2\2\u04c4\u04c5\7t"+
		"\2\2\u04c5\u04ce\5\u00a8U\2\u04c6\u04c7\7\u00aa\2\2\u04c7\u04c8\7\u00cd"+
		"\2\2\u04c8\u04c9\5\u00a8U\2\u04c9\u04ca\7\u00d7\2\2\u04ca\u04ce\3\2\2"+
		"\2\u04cb\u04cc\7\u00aa\2\2\u04cc\u04ce\5\u00a8U\2\u04cd\u04c4\3\2\2\2"+
		"\u04cd\u04c6\3\2\2\2\u04cd\u04cb\3\2\2\2\u04ce\u008b\3\2\2\2\u04cf\u04d0"+
		"\7\u0088\2\2\u04d0\u04d3\5\u0094K\2\u04d1\u04d2\7s\2\2\u04d2\u04d4\5\u0094"+
		"K\2\u04d3\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u008d\3\2\2\2\u04d5"+
		"\u04d8\5\u00acW\2\u04d6\u04d7\t\17\2\2\u04d7\u04d9\5\u00acW\2\u04d8\u04d6"+
		"\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u008f\3\2\2\2\u04da\u04df\5\u0092J"+
		"\2\u04db\u04dc\7\u00c2\2\2\u04dc\u04de\5\u0092J\2\u04dd\u04db\3\2\2\2"+
		"\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u0091"+
		"\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u04e4\5\u00acW\2\u04e3\u04e5\t\20\2"+
		"\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e7"+
		"\7r\2\2\u04e7\u04e9\t\21\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ec\3\2\2\2\u04ea\u04eb\7\32\2\2\u04eb\u04ed\7\u00bc\2\2\u04ec\u04ea"+
		"\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u0093\3\2\2\2\u04ee\u04f1\5\u00c6d"+
		"\2\u04ef\u04f0\7\u00d9\2\2\u04f0\u04f2\5\u00c6d\2\u04f1\u04ef\3\2\2\2"+
		"\u04f1\u04f2\3\2\2\2\u04f2\u0095\3\2\2\2\u04f3\u04f8\5\u0098M\2\u04f4"+
		"\u04f5\7\u00c2\2\2\u04f5\u04f7\5\u0098M\2\u04f6\u04f4\3\2\2\2\u04f7\u04fa"+
		"\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u0097\3\2\2\2\u04fa"+
		"\u04f8\3\2\2\2\u04fb\u04fc\5\u00d2j\2\u04fc\u04fd\7\u00c7\2\2\u04fd\u04fe"+
		"\5\u00c8e\2\u04fe\u0099\3\2\2\2\u04ff\u0500\7\u008d\2\2\u0500\u0501\5"+
		"\u0096L\2\u0501\u009b\3\2\2\2\u0502\u0503\7\u008f\2\2\u0503\u0504\7\36"+
		"\2\2\u0504\u0505\7!\2\2\u0505\u052d\5\u00c2b\2\u0506\u0507\7\u008f\2\2"+
		"\u0507\u0508\7\36\2\2\u0508\u0509\7.\2\2\u0509\u052d\5\u00bc_\2\u050a"+
		"\u050b\7\u008f\2\2\u050b\u050d\7\36\2\2\u050c\u050e\7\u0099\2\2\u050d"+
		"\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u0511\7\u0097"+
		"\2\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u052d\5\u00bc_\2\u0513\u0514\7\u008f\2\2\u0514\u052d\7\"\2\2\u0515\u0516"+
		"\7\u008f\2\2\u0516\u0519\7-\2\2\u0517\u0518\7B\2\2\u0518\u051a\5\u00c2"+
		"b\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u052d\3\2\2\2\u051b"+
		"\u051d\7\u008f\2\2\u051c\u051e\7\u0099\2\2\u051d\u051c\3\2\2\2\u051d\u051e"+
		"\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0522\7\u0098\2\2\u0520\u0521\t\22"+
		"\2\2\u0521\u0523\5\u00c2b\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0527\3\2\2\2\u0524\u0525\7`\2\2\u0525\u0528\7\u00bc\2\2\u0526\u0528"+
		"\5t;\2\u0527\u0524\3\2\2\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
		"\u052a\3\2\2\2\u0529\u052b\5~@\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2"+
		"\2\u052b\u052d\3\2\2\2\u052c\u0502\3\2\2\2\u052c\u0506\3\2\2\2\u052c\u050a"+
		"\3\2\2\2\u052c\u0513\3\2\2\2\u052c\u0515\3\2\2\2\u052c\u051b\3\2\2\2\u052d"+
		"\u009d\3\2\2\2\u052e\u052f\7\u0096\2\2\u052f\u0530\7>\2\2\u0530\u0531"+
		"\7\61\2\2\u0531\u0551\5\u00bc_\2\u0532\u0533\7\u0096\2\2\u0533\u0534\7"+
		">\2\2\u0534\u0551\7d\2\2\u0535\u0536\7\u0096\2\2\u0536\u0537\7\u0080\2"+
		"\2\u0537\u0551\7-\2\2\u0538\u0539\7\u0096\2\2\u0539\u053a\7\u0080\2\2"+
		"\u053a\u053b\7.\2\2\u053b\u0551\5\u00bc_\2\u053c\u053d\7\u0096\2\2\u053d"+
		"\u0545\t\23\2\2\u053e\u053f\7\61\2\2\u053f\u0546\7\u008c\2\2\u0540\u0546"+
		"\7;\2\2\u0541\u0543\7\u00a5\2\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2"+
		"\2\u0543\u0544\3\2\2\2\u0544\u0546\7g\2\2\u0545\u053e\3\2\2\2\u0545\u0540"+
		"\3\2\2\2\u0545\u0542\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0551\5\u00bc_"+
		"\2\u0548\u0549\7\u0096\2\2\u0549\u054a\t\23\2\2\u054a\u054b\7\u0085\2"+
		"\2\u054b\u0551\7\u008c\2\2\u054c\u054d\7\u0096\2\2\u054d\u054e\7\u0094"+
		"\2\2\u054e\u054f\7\u0084\2\2\u054f\u0551\5\u00bc_\2\u0550\u052e\3\2\2"+
		"\2\u0550\u0532\3\2\2\2\u0550\u0535\3\2\2\2\u0550\u0538\3\2\2\2\u0550\u053c"+
		"\3\2\2\2\u0550\u0548\3\2\2\2\u0550\u054c\3\2\2\2\u0551\u009f\3\2\2\2\u0552"+
		"\u0554\7\u00a4\2\2\u0553\u0555\7\u0099\2\2\u0554\u0553\3\2\2\2\u0554\u0555"+
		"\3\2\2\2\u0555\u0557\3\2\2\2\u0556\u0558\7\u0097\2\2\u0557\u0556\3\2\2"+
		"\2\u0557\u0558\3\2\2\2\u0558\u055b\3\2\2\2\u0559\u055a\7L\2\2\u055a\u055c"+
		"\7\67\2\2\u055b\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2"+
		"\u055d\u055f\5\u00bc_\2\u055e\u0560\5,\27\2\u055f\u055e\3\2\2\2\u055f"+
		"\u0560\3\2\2\2\u0560\u00a1\3\2\2\2\u0561\u0562\7\u00a9\2\2\u0562\u0563"+
		"\5\u00c2b\2\u0563\u00a3\3\2\2\2\u0564\u0565\7\u00af\2\2\u0565\u0567\5"+
		"\u00bc_\2\u0566\u0568\7\66\2\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2"+
		"\u0568\u056b\3\2\2\2\u0569\u056a\7a\2\2\u056a\u056c\7\u00ba\2\2\u056b"+
		"\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u00a5\3\2\2\2\u056d\u059d\5\u00d4"+
		"k\2\u056e\u056f\5\u00d4k\2\u056f\u0570\7\u00cd\2\2\u0570\u0571\5\u00d4"+
		"k\2\u0571\u0578\5\u00a6T\2\u0572\u0573\7\u00c2\2\2\u0573\u0574\5\u00d4"+
		"k\2\u0574\u0575\5\u00a6T\2\u0575\u0577\3\2\2\2\u0576\u0572\3\2\2\2\u0577"+
		"\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057b\3\2"+
		"\2\2\u057a\u0578\3\2\2\2\u057b\u057c\7\u00d7\2\2\u057c\u059d\3\2\2\2\u057d"+
		"\u057e\5\u00d4k\2\u057e\u057f\7\u00cd\2\2\u057f\u0584\5\u00dco\2\u0580"+
		"\u0581\7\u00c2\2\2\u0581\u0583\5\u00dco\2\u0582\u0580\3\2\2\2\u0583\u0586"+
		"\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\3\2\2\2\u0586"+
		"\u0584\3\2\2\2\u0587\u0588\7\u00d7\2\2\u0588\u059d\3\2\2\2\u0589\u058a"+
		"\5\u00d4k\2\u058a\u058b\7\u00cd\2\2\u058b\u0590\5\u00a6T\2\u058c\u058d"+
		"\7\u00c2\2\2\u058d\u058f\5\u00a6T\2\u058e\u058c\3\2\2\2\u058f\u0592\3"+
		"\2\2\2\u0590\u058e\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0593\3\2\2\2\u0592"+
		"\u0590\3\2\2\2\u0593\u0594\7\u00d7\2\2\u0594\u059d\3\2\2\2\u0595\u0596"+
		"\5\u00d4k\2\u0596\u0598\7\u00cd\2\2\u0597\u0599\5\u00a8U\2\u0598\u0597"+
		"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\7\u00d7\2"+
		"\2\u059b\u059d\3\2\2\2\u059c\u056d\3\2\2\2\u059c\u056e\3\2\2\2\u059c\u057d"+
		"\3\2\2\2\u059c\u0589\3\2\2\2\u059c\u0595\3\2\2\2\u059d\u00a7\3\2\2\2\u059e"+
		"\u05a3\5\u00aaV\2\u059f\u05a0\7\u00c2\2\2\u05a0\u05a2\5\u00aaV\2\u05a1"+
		"\u059f\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2"+
		"\2\2\u05a4\u00a9\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05a7\5\u00d2j\2\u05a7"+
		"\u05a8\7\u00c5\2\2\u05a8\u05aa\3\2\2\2\u05a9\u05a6\3\2\2\2\u05a9\u05aa"+
		"\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05b2\7\u00be\2\2\u05ac\u05ad\7\u00cd"+
		"\2\2\u05ad\u05ae\5d\63\2\u05ae\u05af\7\u00d7\2\2\u05af\u05b2\3\2\2\2\u05b0"+
		"\u05b2\5\u00acW\2\u05b1\u05a9\3\2\2\2\u05b1\u05ac\3\2\2\2\u05b1\u05b0"+
		"\3\2\2\2\u05b2\u00ab\3\2\2\2\u05b3\u05b4\bW\1\2\u05b4\u05b6\7\24\2\2\u05b5"+
		"\u05b7\5\u00acW\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05bd"+
		"\3\2\2\2\u05b8\u05b9\7\u00b1\2\2\u05b9\u05ba\5\u00acW\2\u05ba\u05bb\7"+
		"\u009b\2\2\u05bb\u05bc\5\u00acW\2\u05bc\u05be\3\2\2\2\u05bd\u05b8\3\2"+
		"\2\2\u05be\u05bf\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u05c3\3\2\2\2\u05c1\u05c2\7\63\2\2\u05c2\u05c4\5\u00acW\2\u05c3\u05c1"+
		"\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\7\64\2\2"+
		"\u05c6\u061f\3\2\2\2\u05c7\u05c8\7\25\2\2\u05c8\u05c9\7\u00cd\2\2\u05c9"+
		"\u05ca\5\u00acW\2\u05ca\u05cb\7\f\2\2\u05cb\u05cc\5\u00a6T\2\u05cc\u05cd"+
		"\7\u00d7\2\2\u05cd\u061f\3\2\2\2\u05ce\u05cf\7#\2\2\u05cf\u061f\7\u00bc"+
		"\2\2\u05d0\u05d1\7:\2\2\u05d1\u05d2\7\u00cd\2\2\u05d2\u05d3\5\u00caf\2"+
		"\u05d3\u05d4\7B\2\2\u05d4\u05d5\5\u00acW\2\u05d5\u05d6\7\u00d7\2\2\u05d6"+
		"\u061f\3\2\2\2\u05d7\u05d8\7T\2\2\u05d8\u05d9\5\u00acW\2\u05d9\u05da\5"+
		"\u00caf\2\u05da\u061f\3\2\2\2\u05db\u05dc\7\u0093\2\2\u05dc\u05dd\7\u00cd"+
		"\2\2\u05dd\u05de\5\u00acW\2\u05de\u05df\7B\2\2\u05df\u05e2\5\u00acW\2"+
		"\u05e0\u05e1\7?\2\2\u05e1\u05e3\5\u00acW\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3"+
		"\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\7\u00d7\2\2\u05e5\u061f\3\2\2"+
		"\2\u05e6\u05e7\7\u009e\2\2\u05e7\u061f\7\u00bc\2\2\u05e8\u05e9\7\u00a3"+
		"\2\2\u05e9\u05ea\7\u00cd\2\2\u05ea\u05eb\t\24\2\2\u05eb\u05ec\7\u00bc"+
		"\2\2\u05ec\u05ed\7B\2\2\u05ed\u05ee\5\u00acW\2\u05ee\u05ef\7\u00d7\2\2"+
		"\u05ef\u061f\3\2\2\2\u05f0\u05f6\5\u00d8m\2\u05f1\u05f3\7\u00cd\2\2\u05f2"+
		"\u05f4\5\u00a8U\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5"+
		"\3\2\2\2\u05f5\u05f7\7\u00d7\2\2\u05f6\u05f1\3\2\2\2\u05f6\u05f7\3\2\2"+
		"\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\7\u00cd\2\2\u05f9\u05fb\7\60\2\2\u05fa"+
		"\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fd\3\2\2\2\u05fc\u05fe\5\u00ae"+
		"X\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff"+
		"\u0600\7\u00d7\2\2\u0600\u061f\3\2\2\2\u0601\u061f\5\u00c8e\2\u0602\u0603"+
		"\7\u00c4\2\2\u0603\u061f\5\u00acW\23\u0604\u0605\7p\2\2\u0605\u061f\5"+
		"\u00acW\16\u0606\u0607\5\u00d2j\2\u0607\u0608\7\u00c5\2\2\u0608\u060a"+
		"\3\2\2\2\u0609\u0606\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\3\2\2\2\u060b"+
		"\u061f\7\u00be\2\2\u060c\u060d\7\u00cd\2\2\u060d\u060e\5d\63\2\u060e\u060f"+
		"\7\u00d7\2\2\u060f\u061f\3\2\2\2\u0610\u0611\7\u00cd\2\2\u0611\u0612\5"+
		"\u00acW\2\u0612\u0613\7\u00d7\2\2\u0613\u061f\3\2\2\2\u0614\u0615\7\u00cd"+
		"\2\2\u0615\u0616\5\u00a8U\2\u0616\u0617\7\u00d7\2\2\u0617\u061f\3\2\2"+
		"\2\u0618\u061a\7\u00cb\2\2\u0619\u061b\5\u00a8U\2\u061a\u0619\3\2\2\2"+
		"\u061a\u061b\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061f\7\u00d6\2\2\u061d"+
		"\u061f\5\u00b4[\2\u061e\u05b3\3\2\2\2\u061e\u05c7\3\2\2\2\u061e\u05ce"+
		"\3\2\2\2\u061e\u05d0\3\2\2\2\u061e\u05d7\3\2\2\2\u061e\u05db\3\2\2\2\u061e"+
		"\u05e6\3\2\2\2\u061e\u05e8\3\2\2\2\u061e\u05f0\3\2\2\2\u061e\u0601\3\2"+
		"\2\2\u061e\u0602\3\2\2\2\u061e\u0604\3\2\2\2\u061e\u0609\3\2\2\2\u061e"+
		"\u060c\3\2\2\2\u061e\u0610\3\2\2\2\u061e\u0614\3\2\2\2\u061e\u0618\3\2"+
		"\2\2\u061e\u061d\3\2\2\2\u061f\u0667\3\2\2\2\u0620\u0621\f\22\2\2\u0621"+
		"\u0622\t\25\2\2\u0622\u0666\5\u00acW\23\u0623\u0624\f\21\2\2\u0624\u0625"+
		"\t\26\2\2\u0625\u0666\5\u00acW\22\u0626\u0639\f\20\2\2\u0627\u063a\7\u00c6"+
		"\2\2\u0628\u063a\7\u00c7\2\2\u0629\u063a\7\u00cf\2\2\u062a\u063a\7\u00cc"+
		"\2\2\u062b\u063a\7\u00c8\2\2\u062c\u063a\7\u00ce\2\2\u062d\u063a\7\u00c9"+
		"\2\2\u062e\u0630\7E\2\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630"+
		"\u0632\3\2\2\2\u0631\u0633\7p\2\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2"+
		"\2\2\u0633\u0634\3\2\2\2\u0634\u063a\7N\2\2\u0635\u0637\7p\2\2\u0636\u0635"+
		"\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063a\t\27\2\2"+
		"\u0639\u0627\3\2\2\2\u0639\u0628\3\2\2\2\u0639\u0629\3\2\2\2\u0639\u062a"+
		"\3\2\2\2\u0639\u062b\3\2\2\2\u0639\u062c\3\2\2\2\u0639\u062d\3\2\2\2\u0639"+
		"\u062f\3\2\2\2\u0639\u0636\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u0666\5\u00ac"+
		"W\21\u063c\u063d\f\r\2\2\u063d\u063e\7\b\2\2\u063e\u0666\5\u00acW\16\u063f"+
		"\u0640\f\f\2\2\u0640\u0641\7v\2\2\u0641\u0666\5\u00acW\r\u0642\u0644\f"+
		"\13\2\2\u0643\u0645\7p\2\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645"+
		"\u0646\3\2\2\2\u0646\u0647\7\21\2\2\u0647\u0648\5\u00acW\2\u0648\u0649"+
		"\7\b\2\2\u0649\u064a\5\u00acW\f\u064a\u0666\3\2\2\2\u064b\u064c\f\n\2"+
		"\2\u064c\u064d\7\u00d2\2\2\u064d\u064e\5\u00acW\2\u064e\u064f\7\u00c1"+
		"\2\2\u064f\u0650\5\u00acW\n\u0650\u0666\3\2\2\2\u0651\u0652\f\25\2\2\u0652"+
		"\u0653\7\u00cb\2\2\u0653\u0654\5\u00acW\2\u0654\u0655\7\u00d6\2\2\u0655"+
		"\u0666\3\2\2\2\u0656\u0657\f\24\2\2\u0657\u0658\7\u00c5\2\2\u0658\u0666"+
		"\7\u00ba\2\2\u0659\u065a\f\17\2\2\u065a\u065c\7V\2\2\u065b\u065d\7p\2"+
		"\2\u065c\u065b\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0666"+
		"\7q\2\2\u065f\u0663\f\t\2\2\u0660\u0664\5\u00d0i\2\u0661\u0662\7\f\2\2"+
		"\u0662\u0664\5\u00d2j\2\u0663\u0660\3\2\2\2\u0663\u0661\3\2\2\2\u0664"+
		"\u0666\3\2\2\2\u0665\u0620\3\2\2\2\u0665\u0623\3\2\2\2\u0665\u0626\3\2"+
		"\2\2\u0665\u063c\3\2\2\2\u0665\u063f\3\2\2\2\u0665\u0642\3\2\2\2\u0665"+
		"\u064b\3\2\2\2\u0665\u0651\3\2\2\2\u0665\u0656\3\2\2\2\u0665\u0659\3\2"+
		"\2\2\u0665\u065f\3\2\2\2\u0666\u0669\3\2\2\2\u0667\u0665\3\2\2\2\u0667"+
		"\u0668\3\2\2\2\u0668\u00ad\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066f\5\u00b0"+
		"Y\2\u066b\u066c\7\u00c2\2\2\u066c\u066e\5\u00b0Y\2\u066d\u066b\3\2\2\2"+
		"\u066e\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u00af"+
		"\3\2\2\2\u0671\u066f\3\2\2\2\u0672\u0675\5\u00b2Z\2\u0673\u0675\5\u00ac"+
		"W\2\u0674\u0672\3\2\2\2\u0674\u0673\3\2\2\2\u0675\u00b1\3\2\2\2\u0676"+
		"\u0677\7\u00cd\2\2\u0677\u067c\5\u00d2j\2\u0678\u0679\7\u00c2\2\2\u0679"+
		"\u067b\5\u00d2j\2\u067a\u0678\3\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a"+
		"\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067f\3\2\2\2\u067e\u067c\3\2\2\2\u067f"+
		"\u0680\7\u00d7\2\2\u0680\u068a\3\2\2\2\u0681\u0686\5\u00d2j\2\u0682\u0683"+
		"\7\u00c2\2\2\u0683\u0685\5\u00d2j\2\u0684\u0682\3\2\2\2\u0685\u0688\3"+
		"\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u068a\3\2\2\2\u0688"+
		"\u0686\3\2\2\2\u0689\u0676\3\2\2\2\u0689\u0681\3\2\2\2\u068a\u068b\3\2"+
		"\2\2\u068b\u068c\7\u00bd\2\2\u068c\u068d\5\u00acW\2\u068d\u00b3\3\2\2"+
		"\2\u068e\u068f\5\u00d2j\2\u068f\u0690\7\u00c5\2\2\u0690\u0692\3\2\2\2"+
		"\u0691\u068e\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694"+
		"\5\u00b6\\\2\u0694\u00b5\3\2\2\2\u0695\u0698\5\u00d6l\2\u0696\u0697\7"+
		"\u00c5\2\2\u0697\u0699\5\u00d6l\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2"+
		"\2\2\u0699\u00b7\3\2\2\2\u069a\u069b\b]\1\2\u069b\u06a2\5\u00bc_\2\u069c"+
		"\u06a2\5\u00ba^\2\u069d\u069e\7\u00cd\2\2\u069e\u069f\5d\63\2\u069f\u06a0"+
		"\7\u00d7\2\2\u06a0\u06a2\3\2\2\2\u06a1\u069a\3\2\2\2\u06a1\u069c\3\2\2"+
		"\2\u06a1\u069d\3\2\2\2\u06a2\u06ab\3\2\2\2\u06a3\u06a7\f\3\2\2\u06a4\u06a8"+
		"\5\u00d0i\2\u06a5\u06a6\7\f\2\2\u06a6\u06a8\5\u00d2j\2\u06a7\u06a4\3\2"+
		"\2\2\u06a7\u06a5\3\2\2\2\u06a8\u06aa\3\2\2\2\u06a9\u06a3\3\2\2\2\u06aa"+
		"\u06ad\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u00b9\3\2"+
		"\2\2\u06ad\u06ab\3\2\2\2\u06ae\u06af\5\u00d8m\2\u06af\u06b1\7\u00cd\2"+
		"\2\u06b0\u06b2\5\u00be`\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2"+
		"\u06b3\3\2\2\2\u06b3\u06b4\7\u00d7\2\2\u06b4\u00bb\3\2\2\2\u06b5\u06b6"+
		"\5\u00c2b\2\u06b6\u06b7\7\u00c5\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b5\3"+
		"\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\5\u00d2j\2"+
		"\u06bb\u00bd\3\2\2\2\u06bc\u06c1\5\u00c0a\2\u06bd\u06be\7\u00c2\2\2\u06be"+
		"\u06c0\5\u00c0a\2\u06bf\u06bd\3\2\2\2\u06c0\u06c3\3\2\2\2\u06c1\u06bf"+
		"\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u00bf\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c4"+
		"\u06c8\5\u00bc_\2\u06c5\u06c8\5\u00ba^\2\u06c6\u06c8\5\u00c8e\2\u06c7"+
		"\u06c4\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7\u06c6\3\2\2\2\u06c8\u00c1\3\2"+
		"\2\2\u06c9\u06ca\5\u00d2j\2\u06ca\u00c3\3\2\2\2\u06cb\u06d4\7\u00b8\2"+
		"\2\u06cc\u06cd\7\u00c5\2\2\u06cd\u06d4\t\30\2\2\u06ce\u06cf\7\u00ba\2"+
		"\2\u06cf\u06d1\7\u00c5\2\2\u06d0\u06d2\t\30\2\2\u06d1\u06d0\3\2\2\2\u06d1"+
		"\u06d2\3\2\2\2\u06d2\u06d4\3\2\2\2\u06d3\u06cb\3\2\2\2\u06d3\u06cc\3\2"+
		"\2\2\u06d3\u06ce\3\2\2\2\u06d4\u00c5\3\2\2\2\u06d5\u06d7\t\31\2\2\u06d6"+
		"\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06de\3\2\2\2\u06d8\u06df\5\u00c4"+
		"c\2\u06d9\u06df\7\u00b9\2\2\u06da\u06df\7\u00ba\2\2\u06db\u06df\7\u00bb"+
		"\2\2\u06dc\u06df\7P\2\2\u06dd\u06df\7n\2\2\u06de\u06d8\3\2\2\2\u06de\u06d9"+
		"\3\2\2\2\u06de\u06da\3\2\2\2\u06de\u06db\3\2\2\2\u06de\u06dc\3\2\2\2\u06de"+
		"\u06dd\3\2\2\2\u06df\u00c7\3\2\2\2\u06e0\u06e4\5\u00c6d\2\u06e1\u06e4"+
		"\7\u00bc\2\2\u06e2\u06e4\7q\2\2\u06e3\u06e0\3\2\2\2\u06e3\u06e1\3\2\2"+
		"\2\u06e3\u06e2\3\2\2\2\u06e4\u00c9\3\2\2\2\u06e5\u06e6\t\32\2\2\u06e6"+
		"\u00cb\3\2\2\2\u06e7\u06e8\t\33\2\2\u06e8\u00cd\3\2\2\2\u06e9\u06ea\t"+
		"\34\2\2\u06ea\u00cf\3\2\2\2\u06eb\u06ee\7\u00b7\2\2\u06ec\u06ee\5\u00ce"+
		"h\2\u06ed\u06eb\3\2\2\2\u06ed\u06ec\3\2\2\2\u06ee\u00d1\3\2\2\2\u06ef"+
		"\u06f0\7\u00b7\2\2\u06f0\u00d3\3\2\2\2\u06f1\u06f5\7\u00b7\2\2\u06f2\u06f5"+
		"\7\u00de\2\2\u06f3\u06f5\5\u00ccg\2\u06f4\u06f1\3\2\2\2\u06f4\u06f2\3"+
		"\2\2\2\u06f4\u06f3\3\2\2\2\u06f5\u00d5\3\2\2\2\u06f6\u06f9\7\u00b7\2\2"+
		"\u06f7\u06f9\5\u00ccg\2\u06f8\u06f6\3\2\2\2\u06f8\u06f7\3\2\2\2\u06f9"+
		"\u00d7\3\2\2\2\u06fa\u06fe\7\u00b7\2\2\u06fb\u06fe\7\u00de\2\2\u06fc\u06fe"+
		"\5\u00ccg\2\u06fd\u06fa\3\2\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fc\3\2\2"+
		"\2\u06fe\u00d9\3\2\2\2\u06ff\u0702\5\u00d2j\2\u0700\u0702\7q\2\2\u0701"+
		"\u06ff\3\2\2\2\u0701\u0700\3\2\2\2\u0702\u00db\3\2\2\2\u0703\u0704\7\u00bc"+
		"\2\2\u0704\u0705\7\u00c7\2\2\u0705\u0706\5\u00c6d\2\u0706\u00dd\3\2\2"+
		"\2\u00f6\u00e2\u00e6\u00e9\u00ec\u0100\u0106\u010d\u0115\u011a\u0121\u0126"+
		"\u012c\u0132\u0137\u013d\u014b\u0152\u0159\u015f\u0168\u0172\u017c\u0190"+
		"\u0198\u01a7\u01ae\u01bc\u01c2\u01c8\u01cf\u01d3\u01d6\u01dd\u01e1\u01e4"+
		"\u01ef\u01f3\u01f6\u01fb\u01fd\u0200\u0203\u020d\u0211\u0214\u0217\u021c"+
		"\u021e\u0224\u022a\u022e\u0231\u0234\u0237\u023a\u023f\u0245\u0249\u024c"+
		"\u024f\u0253\u025b\u0269\u026b\u026f\u0276\u0278\u0283\u0286\u028f\u02a0"+
		"\u02ab\u02bd\u02ca\u02db\u02e4\u02ee\u02f0\u0305\u030a\u030f\u0312\u031c"+
		"\u0321\u0325\u0328\u032c\u0330\u0335\u0338\u033c\u033e\u0351\u0359\u035c"+
		"\u0366\u036a\u0372\u0376\u037b\u037f\u0383\u0387\u038b\u038d\u0395\u0399"+
		"\u039c\u03a5\u03aa\u03ad\u03b7\u03c1\u03c5\u03ca\u03ce\u03d4\u03d7\u03da"+
		"\u03dd\u03eb\u03ef\u03f7\u03ff\u0402\u0406\u0409\u040d\u0410\u0413\u0416"+
		"\u0419\u041d\u0421\u0424\u0427\u042a\u042d\u0430\u0439\u043f\u0453\u0465"+
		"\u0470\u0473\u0479\u0481\u0484\u048a\u048c\u0490\u0495\u0498\u049b\u049f"+
		"\u04a3\u04a6\u04a8\u04ab\u04af\u04b3\u04b6\u04b8\u04ba\u04bd\u04c2\u04cd"+
		"\u04d3\u04d8\u04df\u04e4\u04e8\u04ec\u04f1\u04f8\u050d\u0510\u0519\u051d"+
		"\u0522\u0527\u052a\u052c\u0542\u0545\u0550\u0554\u0557\u055b\u055f\u0567"+
		"\u056b\u0578\u0584\u0590\u0598\u059c\u05a3\u05a9\u05b1\u05b6\u05bf\u05c3"+
		"\u05e2\u05f3\u05f6\u05fa\u05fd\u0609\u061a\u061e\u062f\u0632\u0636\u0639"+
		"\u0644\u065c\u0663\u0665\u0667\u066f\u0674\u067c\u0686\u0689\u0691\u0698"+
		"\u06a1\u06a7\u06ab\u06b1\u06b8\u06c1\u06c7\u06d1\u06d3\u06d6\u06de\u06e3"+
		"\u06ed\u06f4\u06f8\u06fd\u0701";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
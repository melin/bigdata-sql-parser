// Generated from com/dataworker/sql/parser/antlr4/spark/SparkSqlBase.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.spark;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		TRANSACTIONS=252, TRANSFORM=253, TRIM=254, TRUE=255, TRUNCATE=256, TYPE=257, 
		UNARCHIVE=258, UNBOUNDED=259, UNCACHE=260, UNION=261, UNIQUE=262, UNKNOWN=263, 
		UNLOCK=264, UNSET=265, UPDATE=266, USE=267, USER=268, USING=269, VALUES=270, 
		VACUUM=271, VIEW=272, VIEWS=273, WHEN=274, WHERE=275, WINDOW=276, WITH=277, 
		ZONE=278, YEAR=279, KILL=280, READ=281, JOB=282, ADDJAR=283, COMPRESS=284, 
		FILE=285, EQ=286, NSEQ=287, NEQ=288, NEQJ=289, LT=290, LTE=291, GT=292, 
		GTE=293, PLUS=294, MINUS=295, ASTERISK=296, SLASH=297, PERCENT=298, TILDE=299, 
		AMPERSAND=300, PIPE=301, CONCAT_PIPE=302, HAT=303, STRING=304, BIGINT_LITERAL=305, 
		SMALLINT_LITERAL=306, TINYINT_LITERAL=307, INTEGER_VALUE=308, EXPONENT_VALUE=309, 
		DECIMAL_VALUE=310, FLOAT_LITERAL=311, DOUBLE_LITERAL=312, BIGDECIMAL_LITERAL=313, 
		IDENTIFIER=314, BACKQUOTED_IDENTIFIER=315, SIMPLE_COMMENT=316, BRACKETED_COMMENT=317, 
		WS=318, UNRECOGNIZED=319;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_configKey = 8, RULE_configValue = 9, RULE_unsupportedHiveNativeCommands = 10, 
		RULE_createTableHeader = 11, RULE_replaceTableHeader = 12, RULE_bucketSpec = 13, 
		RULE_skewSpec = 14, RULE_locationSpec = 15, RULE_commentSpec = 16, RULE_query = 17, 
		RULE_insertInto = 18, RULE_partitionSpecLocation = 19, RULE_partitionSpec = 20, 
		RULE_partitionVal = 21, RULE_namespace = 22, RULE_describeFuncName = 23, 
		RULE_describeColName = 24, RULE_ctes = 25, RULE_namedQuery = 26, RULE_tableProvider = 27, 
		RULE_createTableClauses = 28, RULE_tablePropertyList = 29, RULE_tableProperty = 30, 
		RULE_tablePropertyKey = 31, RULE_tablePropertyValue = 32, RULE_constantList = 33, 
		RULE_nestedConstantList = 34, RULE_createFileFormat = 35, RULE_fileFormat = 36, 
		RULE_storageHandler = 37, RULE_resource = 38, RULE_dmlStatementNoWith = 39, 
		RULE_queryOrganization = 40, RULE_multiInsertQueryBody = 41, RULE_queryTerm = 42, 
		RULE_queryPrimary = 43, RULE_sortItem = 44, RULE_fromStatement = 45, RULE_fromStatementBody = 46, 
		RULE_querySpecification = 47, RULE_transformClause = 48, RULE_selectClause = 49, 
		RULE_setClause = 50, RULE_matchedClause = 51, RULE_notMatchedClause = 52, 
		RULE_matchedAction = 53, RULE_notMatchedAction = 54, RULE_assignmentList = 55, 
		RULE_assignment = 56, RULE_whereClause = 57, RULE_havingClause = 58, RULE_hint = 59, 
		RULE_hintStatement = 60, RULE_fromClause = 61, RULE_aggregationClause = 62, 
		RULE_groupingSet = 63, RULE_pivotClause = 64, RULE_pivotColumn = 65, RULE_pivotValue = 66, 
		RULE_lateralView = 67, RULE_setQuantifier = 68, RULE_relation = 69, RULE_joinRelation = 70, 
		RULE_joinType = 71, RULE_joinCriteria = 72, RULE_sample = 73, RULE_sampleMethod = 74, 
		RULE_identifierList = 75, RULE_identifierSeq = 76, RULE_orderedIdentifierList = 77, 
		RULE_orderedIdentifier = 78, RULE_identifierCommentList = 79, RULE_identifierComment = 80, 
		RULE_relationPrimary = 81, RULE_inlineTable = 82, RULE_functionTable = 83, 
		RULE_tableAlias = 84, RULE_rowFormat = 85, RULE_multipartIdentifierList = 86, 
		RULE_multipartIdentifier = 87, RULE_tableIdentifier = 88, RULE_functionIdentifier = 89, 
		RULE_namedExpression = 90, RULE_namedExpressionSeq = 91, RULE_partitionFieldList = 92, 
		RULE_partitionField = 93, RULE_transform = 94, RULE_transformArgument = 95, 
		RULE_expression = 96, RULE_booleanExpression = 97, RULE_predicate = 98, 
		RULE_valueExpression = 99, RULE_primaryExpression = 100, RULE_constant = 101, 
		RULE_comparisonOperator = 102, RULE_arithmeticOperator = 103, RULE_predicateOperator = 104, 
		RULE_booleanValue = 105, RULE_interval = 106, RULE_errorCapturingMultiUnitsInterval = 107, 
		RULE_multiUnitsInterval = 108, RULE_errorCapturingUnitToUnitInterval = 109, 
		RULE_unitToUnitInterval = 110, RULE_intervalValue = 111, RULE_colPosition = 112, 
		RULE_dataType = 113, RULE_qualifiedColTypeWithPositionList = 114, RULE_qualifiedColTypeWithPosition = 115, 
		RULE_colTypeList = 116, RULE_colType = 117, RULE_complexColTypeList = 118, 
		RULE_complexColType = 119, RULE_whenClause = 120, RULE_windowClause = 121, 
		RULE_namedWindow = 122, RULE_windowSpec = 123, RULE_windowFrame = 124, 
		RULE_frameBound = 125, RULE_qualifiedNameList = 126, RULE_functionName = 127, 
		RULE_qualifiedName = 128, RULE_errorCapturingIdentifier = 129, RULE_errorCapturingIdentifierExtra = 130, 
		RULE_identifier = 131, RULE_strictIdentifier = 132, RULE_quotedIdentifier = 133, 
		RULE_number = 134, RULE_alterColumnAction = 135, RULE_ansiNonReserved = 136, 
		RULE_strictNonReserved = 137, RULE_nonReserved = 138;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
		"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
		"configKey", "configValue", "unsupportedHiveNativeCommands", "createTableHeader", 
		"replaceTableHeader", "bucketSpec", "skewSpec", "locationSpec", "commentSpec", 
		"query", "insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
		"namespace", "describeFuncName", "describeColName", "ctes", "namedQuery", 
		"tableProvider", "createTableClauses", "tablePropertyList", "tableProperty", 
		"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
		"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
		"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
		"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
		"transformClause", "selectClause", "setClause", "matchedClause", "notMatchedClause", 
		"matchedAction", "notMatchedAction", "assignmentList", "assignment", "whereClause", 
		"havingClause", "hint", "hintStatement", "fromClause", "aggregationClause", 
		"groupingSet", "pivotClause", "pivotColumn", "pivotValue", "lateralView", 
		"setQuantifier", "relation", "joinRelation", "joinType", "joinCriteria", 
		"sample", "sampleMethod", "identifierList", "identifierSeq", "orderedIdentifierList", 
		"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
		"inlineTable", "functionTable", "tableAlias", "rowFormat", "multipartIdentifierList", 
		"multipartIdentifier", "tableIdentifier", "functionIdentifier", "namedExpression", 
		"namedExpressionSeq", "partitionFieldList", "partitionField", "transform", 
		"transformArgument", "expression", "booleanExpression", "predicate", "valueExpression", 
		"primaryExpression", "constant", "comparisonOperator", "arithmeticOperator", 
		"predicateOperator", "booleanValue", "interval", "errorCapturingMultiUnitsInterval", 
		"multiUnitsInterval", "errorCapturingUnitToUnitInterval", "unitToUnitInterval", 
		"intervalValue", "colPosition", "dataType", "qualifiedColTypeWithPositionList", 
		"qualifiedColTypeWithPosition", "colTypeList", "colType", "complexColTypeList", 
		"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
		"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
		"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
		"strictIdentifier", "quotedIdentifier", "number", "alterColumnAction", 
		"ansiNonReserved", "strictNonReserved", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
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
		"'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", "'HOURS'", "'HISTORY'", 
		"'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", "'INNER'", 
		"'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
		"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
		"'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", 
		"'LIFECYCLE'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", 
		"'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MINUTE'", "'MONTH'", 
		"'MSCK'", "'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", 
		"'NULLS'", "'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", 
		"'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", 
		"'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", 
		"'PARQUET'", "'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", 
		"'PRIMARY'", "'PRINCIPALS'", "'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", 
		"'RECORDREADER'", "'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", 
		"'REFRESH'", "'RENAME'", "'REPAIR'", "'REPLACE'", "'RESET'", "'RESPECT'", 
		"'RESTRICT'", "'REVOKE'", "'RETAIN'", "'RIGHT'", null, "'ROLE'", "'ROLES'", 
		"'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", "'RUN'", "'SCHEMA'", "'SECOND'", 
		"'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", 
		"'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", 
		"'SORTED'", "'START'", "'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", 
		"'SUBSTR'", "'SUBSTRING'", "'SYNC'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", 
		"'TBLPROPERTIES'", null, "'TERMINATED'", "'THEN'", "'TIME'", "'TO'", "'TOUCH'", 
		"'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", 
		"'TRUE'", "'TRUNCATE'", "'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", 
		"'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", "'UNSET'", "'UPDATE'", 
		"'USE'", "'USER'", "'USING'", "'VALUES'", "'VACUUM'", "'VIEW'", "'VIEWS'", 
		"'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'ZONE'", "'YEAR'", "'KILL'", 
		"'READ'", "'JOB'", "'ADDJAR'", "'COMPRESS'", "'FILE'", null, "'<=>'", 
		"'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'~'", "'&'", "'|'", "'||'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
		"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
		"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
		"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", "COLUMN", 
		"COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", "CONCATENATE", 
		"CONSTRAINT", "CONVERT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
		"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", 
		"DATABASE", "DATABASES", "DAY", "DBPROPERTIES", "DEFINED", "DELETE", "DELIMITED", 
		"DELTA", "DESC", "DESCRIBE", "DETAIL", "DFS", "DIRECTORIES", "DIRECTORY", 
		"DISTINCT", "DISTRIBUTE", "DIV", "DROP", "DRY", "ELSE", "END", "ESCAPE", 
		"ESCAPED", "EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", 
		"EXTERNAL", "EXTRACT", "FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", 
		"FIRST", "FOLLOWING", "FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", 
		"FULL", "FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", 
		"HAVING", "HOUR", "HOURS", "HISTORY", "IF", "IGNORE", "IMPORT", "IN", 
		"INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", "INSERT", "INTERSECT", 
		"INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", "LAST", "LATERAL", 
		"LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", "LIST", "LIFECYCLE", 
		"LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", "MAP", 
		"MATCHED", "MERGE", "MINUTE", "MONTH", "MSCK", "NAMESPACE", "NAMESPACES", 
		"NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", 
		"OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", 
		"OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PARQUET", 
		"PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", 
		"PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", 
		"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
		"REPAIR", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RETAIN", 
		"RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", 
		"RUN", "SCHEMA", "SECOND", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", 
		"SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", "SORT", 
		"SORTED", "START", "STATISTICS", "STORED", "STRATIFY", "STRUCT", "SUBSTR", 
		"SUBSTRING", "SYNC", "TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", 
		"TEMPORARY", "TERMINATED", "THEN", "TIME", "TO", "TOUCH", "TRAILING", 
		"TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", 
		"TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", 
		"UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", "VACUUM", 
		"VIEW", "VIEWS", "WHEN", "WHERE", "WINDOW", "WITH", "ZONE", "YEAR", "KILL", 
		"READ", "JOB", "ADDJAR", "COMPRESS", "FILE", "EQ", "NSEQ", "NEQ", "NEQJ", 
		"LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
		"TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", 
		"SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", 
		"DECIMAL_VALUE", "FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
		"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", 
		"WS", "UNRECOGNIZED"
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
	public String getGrammarFileName() { return "SparkSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enabled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public SparkSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			statement();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(279);
				match(T__0);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(EOF);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			namedExpression();
			setState(288);
			match(EOF);
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

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			tableIdentifier();
			setState(291);
			match(EOF);
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

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			multipartIdentifier();
			setState(294);
			match(EOF);
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

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			functionIdentifier();
			setState(297);
			match(EOF);
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

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			dataType();
			setState(300);
			match(EOF);
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

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			colTypeList();
			setState(303);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SparkSqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SparkSqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SparkSqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SparkSqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeltaConvertContext extends StatementContext {
		public Token format;
		public MultipartIdentifierContext table;
		public TablePropertyListContext options;
		public TerminalNode CONVERT() { return getToken(SparkSqlBaseParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DELTA() { return getToken(SparkSqlBaseParser.DELTA, 0); }
		public TerminalNode PARQUET() { return getToken(SparkSqlBaseParser.PARQUET, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public DeltaConvertContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDeltaConvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDeltaConvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDeltaConvert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SparkSqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkSqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SparkSqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SparkSqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddJarContext extends StatementContext {
		public IdentifierContext jar;
		public TerminalNode ADDJAR() { return getToken(SparkSqlBaseParser.ADDJAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AddJarContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAddJar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAddJar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAddJar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public Token option;
		public TerminalNode MSCK() { return getToken(SparkSqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkSqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode SYNC() { return getToken(SparkSqlBaseParser.SYNC, 0); }
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlBaseParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(SparkSqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SparkSqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SparkSqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SparkSqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SparkSqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompressFileContext extends StatementContext {
		public ConstantContext path;
		public TablePropertyListContext options;
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode FILE() { return getToken(SparkSqlBaseParser.FILE, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CompressFileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCompressFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCompressFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCompressFile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public MergeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMergeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMergeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMergeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeTablesContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SparkSqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlBaseParser.TABLES, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkSqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlBaseParser.STATISTICS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public AnalyzeTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAnalyzeTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAnalyzeTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAnalyzeTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadTableContext extends StatementContext {
		public TerminalNode READ() { return getToken(SparkSqlBaseParser.READ, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ReadTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterReadTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitReadTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitReadTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SparkSqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SparkSqlBaseParser.LIST, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDeltaDetailContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TerminalNode DETAIL() { return getToken(SparkSqlBaseParser.DETAIL, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public DescribeDeltaDetailContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeDeltaDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeDeltaDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeDeltaDetail(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SparkSqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SparkSqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveReplaceColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterHiveReplaceColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitHiveReplaceColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitHiveReplaceColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VacuumTableContext extends StatementContext {
		public MultipartIdentifierContext table;
		public NumberContext num;
		public TerminalNode VACUUM() { return getToken(SparkSqlBaseParser.VACUUM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RETAIN() { return getToken(SparkSqlBaseParser.RETAIN, 0); }
		public TerminalNode HOURS() { return getToken(SparkSqlBaseParser.HOURS, 0); }
		public TerminalNode DRY() { return getToken(SparkSqlBaseParser.DRY, 0); }
		public TerminalNode RUN() { return getToken(SparkSqlBaseParser.RUN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VacuumTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterVacuumTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitVacuumTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitVacuumTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SparkSqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SparkSqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterResetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitResetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitResetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SparkSqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SparkSqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDeltaHistoryContext extends StatementContext {
		public MultipartIdentifierContext table;
		public Token limit;
		public TerminalNode HISTORY() { return getToken(SparkSqlBaseParser.HISTORY, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public DescribeDeltaHistoryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeDeltaHistory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeDeltaHistory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeDeltaHistory(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTimeZoneContext extends StatementContext {
		public Token timezone;
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(SparkSqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SparkSqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SparkSqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SparkSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkSqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkSqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SparkSqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SparkSqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SparkSqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableExtendedContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableExtendedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowTableExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowTableExtended(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowTableExtended(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SparkSqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SparkSqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRefreshFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRefreshFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRefreshFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SparkSqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SparkSqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SparkSqlBaseParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SparkSqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SparkSqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KillJobContext extends StatementContext {
		public TerminalNode KILL() { return getToken(SparkSqlBaseParser.KILL, 0); }
		public TerminalNode JOB() { return getToken(SparkSqlBaseParser.JOB, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KillJobContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterKillJob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitKillJob(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitKillJob(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SparkSqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadTempTableContext extends StatementContext {
		public ConstantContext path;
		public TablePropertyListContext options;
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public LoadTempTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLoadTempTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLoadTempTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLoadTempTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompressTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CompressTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCompressTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCompressTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCompressTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowViewsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SparkSqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExportTableContext extends StatementContext {
		public ConstantContext name;
		public TablePropertyListContext options;
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public ExportTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExportTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExportTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExportTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkSqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SparkSqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(306);
					ctes();
					}
				}

				setState(309);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(USE);
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(311);
					match(NAMESPACE);
					}
					break;
				}
				setState(314);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(CREATE);
				setState(316);
				namespace();
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(317);
					match(IF);
					setState(318);
					match(NOT);
					setState(319);
					match(EXISTS);
					}
					break;
				}
				setState(322);
				multipartIdentifier();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(328);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(323);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(324);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(325);
						match(WITH);
						setState(326);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(327);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				match(ALTER);
				setState(334);
				namespace();
				setState(335);
				multipartIdentifier();
				setState(336);
				match(SET);
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(ALTER);
				setState(341);
				namespace();
				setState(342);
				multipartIdentifier();
				setState(343);
				match(SET);
				setState(344);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(DROP);
				setState(347);
				namespace();
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(348);
					match(IF);
					setState(349);
					match(EXISTS);
					}
					break;
				}
				setState(352);
				multipartIdentifier();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(353);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
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
			case 8:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(356);
				match(SHOW);
				setState(357);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(358);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(359);
					multipartIdentifier();
					}
				}

				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(362);
						match(LIKE);
						}
					}

					setState(365);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(368);
				createTableHeader();
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(369);
					match(T__1);
					setState(370);
					colTypeList();
					setState(371);
					match(T__2);
					}
					break;
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(375);
					tableProvider();
					}
				}

				setState(378);
				createTableClauses();
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (REDUCE - 196)) | (1L << (SELECT - 196)) | (1L << (TABLE - 196)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(379);
						match(AS);
						}
					}

					setState(382);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(385);
				match(CREATE);
				setState(386);
				match(TABLE);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(387);
					match(IF);
					setState(388);
					match(NOT);
					setState(389);
					match(EXISTS);
					}
					break;
				}
				setState(392);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(393);
				match(LIKE);
				setState(394);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (ROW - 213)) | (1L << (STORED - 213)) | (1L << (TBLPROPERTIES - 213)) | (1L << (USING - 213)))) != 0)) {
					{
					setState(401);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(395);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(396);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(397);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(398);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(399);
						match(TBLPROPERTIES);
						setState(400);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(406);
				replaceTableHeader();
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(407);
					match(T__1);
					setState(408);
					colTypeList();
					setState(409);
					match(T__2);
					}
					break;
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(413);
					tableProvider();
					}
				}

				setState(416);
				createTableClauses();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (REDUCE - 196)) | (1L << (SELECT - 196)) | (1L << (TABLE - 196)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(417);
						match(AS);
						}
					}

					setState(420);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(423);
				match(ANALYZE);
				setState(424);
				match(TABLE);
				setState(425);
				multipartIdentifier();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(426);
					partitionSpec();
					}
				}

				setState(429);
				match(COMPUTE);
				setState(430);
				match(STATISTICS);
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(431);
					identifier();
					}
					break;
				case 2:
					{
					setState(432);
					match(FOR);
					setState(433);
					match(COLUMNS);
					setState(434);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(435);
					match(FOR);
					setState(436);
					match(ALL);
					setState(437);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new AnalyzeTablesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(440);
				match(ANALYZE);
				setState(441);
				match(TABLES);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(442);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(443);
					multipartIdentifier();
					}
				}

				setState(446);
				match(COMPUTE);
				setState(447);
				match(STATISTICS);
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(448);
					identifier();
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(451);
				match(ALTER);
				setState(452);
				match(TABLE);
				setState(453);
				multipartIdentifier();
				setState(454);
				match(ADD);
				setState(455);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(456);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 15:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(458);
				match(ALTER);
				setState(459);
				match(TABLE);
				setState(460);
				multipartIdentifier();
				setState(461);
				match(ADD);
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				match(T__1);
				setState(464);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(465);
				match(T__2);
				}
				break;
			case 16:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(467);
				match(ALTER);
				setState(468);
				match(TABLE);
				setState(469);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(470);
				match(RENAME);
				setState(471);
				match(COLUMN);
				setState(472);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(473);
				match(TO);
				setState(474);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 17:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(476);
				match(ALTER);
				setState(477);
				match(TABLE);
				setState(478);
				((DropTableColumnsContext)_localctx).table = multipartIdentifier();
				setState(479);
				match(DROP);
				setState(480);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(481);
				match(T__1);
				setState(482);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(483);
				match(T__2);
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(485);
				match(ALTER);
				setState(486);
				match(TABLE);
				setState(487);
				((DropTableColumnsContext)_localctx).table = multipartIdentifier();
				setState(488);
				match(DROP);
				setState(489);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(490);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 19:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(492);
				match(ALTER);
				setState(493);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(494);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(495);
				match(RENAME);
				setState(496);
				match(TO);
				setState(497);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 20:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(499);
				match(ALTER);
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(501);
				multipartIdentifier();
				setState(502);
				match(SET);
				setState(503);
				match(TBLPROPERTIES);
				setState(504);
				tablePropertyList();
				}
				break;
			case 21:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(506);
				match(ALTER);
				setState(507);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				multipartIdentifier();
				setState(509);
				match(UNSET);
				setState(510);
				match(TBLPROPERTIES);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(511);
					match(IF);
					setState(512);
					match(EXISTS);
					}
				}

				setState(515);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(517);
				match(ALTER);
				setState(518);
				match(TABLE);
				setState(519);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(520);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(521);
					match(COLUMN);
					}
					break;
				}
				setState(524);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(525);
					alterColumnAction();
					}
				}

				}
				break;
			case 23:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(528);
				match(ALTER);
				setState(529);
				match(TABLE);
				setState(530);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(531);
					partitionSpec();
					}
				}

				setState(534);
				match(CHANGE);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(535);
					match(COLUMN);
					}
					break;
				}
				setState(538);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(539);
				colType();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(540);
					colPosition();
					}
				}

				}
				break;
			case 24:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(543);
				match(ALTER);
				setState(544);
				match(TABLE);
				setState(545);
				((HiveReplaceColumnsContext)_localctx).table = multipartIdentifier();
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(546);
					partitionSpec();
					}
				}

				setState(549);
				match(REPLACE);
				setState(550);
				match(COLUMNS);
				setState(551);
				match(T__1);
				setState(552);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(553);
				match(T__2);
				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(555);
				match(ALTER);
				setState(556);
				match(TABLE);
				setState(557);
				multipartIdentifier();
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(558);
					partitionSpec();
					}
				}

				setState(561);
				match(SET);
				setState(562);
				match(SERDE);
				setState(563);
				match(STRING);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(564);
					match(WITH);
					setState(565);
					match(SERDEPROPERTIES);
					setState(566);
					tablePropertyList();
					}
				}

				}
				break;
			case 26:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(569);
				match(ALTER);
				setState(570);
				match(TABLE);
				setState(571);
				multipartIdentifier();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(572);
					partitionSpec();
					}
				}

				setState(575);
				match(SET);
				setState(576);
				match(SERDEPROPERTIES);
				setState(577);
				tablePropertyList();
				}
				break;
			case 27:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(579);
				match(ALTER);
				setState(580);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(581);
				multipartIdentifier();
				setState(582);
				match(ADD);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(583);
					match(IF);
					setState(584);
					match(NOT);
					setState(585);
					match(EXISTS);
					}
				}

				setState(589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(588);
					partitionSpecLocation();
					}
					}
					setState(591); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 28:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(593);
				match(ALTER);
				setState(594);
				match(TABLE);
				setState(595);
				multipartIdentifier();
				setState(596);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(597);
				match(RENAME);
				setState(598);
				match(TO);
				setState(599);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 29:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(601);
				match(ALTER);
				setState(602);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(603);
				multipartIdentifier();
				setState(604);
				match(DROP);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(605);
					match(IF);
					setState(606);
					match(EXISTS);
					}
				}

				setState(609);
				partitionSpec();
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(610);
					match(T__3);
					setState(611);
					partitionSpec();
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(617);
					match(PURGE);
					}
				}

				}
				break;
			case 30:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(620);
				match(ALTER);
				setState(621);
				match(TABLE);
				setState(622);
				multipartIdentifier();
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(623);
					partitionSpec();
					}
				}

				setState(626);
				match(SET);
				setState(627);
				locationSpec();
				}
				break;
			case 31:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(629);
				match(ALTER);
				setState(630);
				match(TABLE);
				setState(631);
				multipartIdentifier();
				setState(632);
				match(RECOVER);
				setState(633);
				match(PARTITIONS);
				}
				break;
			case 32:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(635);
				match(DROP);
				setState(636);
				match(TABLE);
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(637);
					match(IF);
					setState(638);
					match(EXISTS);
					}
					break;
				}
				setState(641);
				multipartIdentifier();
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(642);
					match(PURGE);
					}
				}

				}
				break;
			case 33:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(645);
				match(DROP);
				setState(646);
				match(VIEW);
				setState(649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(647);
					match(IF);
					setState(648);
					match(EXISTS);
					}
					break;
				}
				setState(651);
				multipartIdentifier();
				}
				break;
			case 34:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(652);
				match(CREATE);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(653);
					match(OR);
					setState(654);
					match(REPLACE);
					}
				}

				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(657);
						match(GLOBAL);
						}
					}

					setState(660);
					match(TEMPORARY);
					}
				}

				setState(663);
				match(VIEW);
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(664);
					match(IF);
					setState(665);
					match(NOT);
					setState(666);
					match(EXISTS);
					}
					break;
				}
				setState(669);
				multipartIdentifier();
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(670);
					identifierCommentList();
					}
				}

				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(679);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(673);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(674);
						match(PARTITIONED);
						setState(675);
						match(ON);
						setState(676);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(677);
						match(TBLPROPERTIES);
						setState(678);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(684);
				match(AS);
				setState(685);
				query();
				}
				break;
			case 35:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(687);
				match(CREATE);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(688);
					match(OR);
					setState(689);
					match(REPLACE);
					}
				}

				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(692);
					match(GLOBAL);
					}
				}

				setState(695);
				match(TEMPORARY);
				setState(696);
				match(VIEW);
				setState(697);
				tableIdentifier();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(698);
					match(T__1);
					setState(699);
					colTypeList();
					setState(700);
					match(T__2);
					}
				}

				setState(704);
				tableProvider();
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(705);
					match(OPTIONS);
					setState(706);
					tablePropertyList();
					}
				}

				}
				break;
			case 36:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(709);
				match(ALTER);
				setState(710);
				match(VIEW);
				setState(711);
				multipartIdentifier();
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(712);
					match(AS);
					}
				}

				setState(715);
				query();
				}
				break;
			case 37:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(717);
				match(CREATE);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(718);
					match(OR);
					setState(719);
					match(REPLACE);
					}
				}

				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(722);
					match(TEMPORARY);
					}
				}

				setState(725);
				match(FUNCTION);
				setState(729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(726);
					match(IF);
					setState(727);
					match(NOT);
					setState(728);
					match(EXISTS);
					}
					break;
				}
				setState(731);
				multipartIdentifier();
				setState(732);
				match(AS);
				setState(733);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(734);
					match(USING);
					setState(735);
					resource();
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(736);
						match(T__3);
						setState(737);
						resource();
						}
						}
						setState(742);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 38:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(745);
				match(DROP);
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(746);
					match(TEMPORARY);
					}
				}

				setState(749);
				match(FUNCTION);
				setState(752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(750);
					match(IF);
					setState(751);
					match(EXISTS);
					}
					break;
				}
				setState(754);
				multipartIdentifier();
				}
				break;
			case 39:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(755);
				match(EXPLAIN);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (EXTENDED - 91)) | (1L << (FORMATTED - 91)) | (1L << (LOGICAL - 91)))) != 0)) {
					{
					setState(756);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (EXTENDED - 91)) | (1L << (FORMATTED - 91)) | (1L << (LOGICAL - 91)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(759);
				statement();
				}
				break;
			case 40:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(760);
				match(SHOW);
				setState(761);
				match(TABLES);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(762);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(763);
					multipartIdentifier();
					}
				}

				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(766);
						match(LIKE);
						}
					}

					setState(769);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTableExtendedContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(772);
				match(SHOW);
				setState(773);
				match(TABLE);
				setState(774);
				match(EXTENDED);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(775);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(776);
					((ShowTableExtendedContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(779);
				match(LIKE);
				setState(780);
				((ShowTableExtendedContext)_localctx).pattern = match(STRING);
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(781);
					partitionSpec();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(784);
				match(SHOW);
				setState(785);
				match(TBLPROPERTIES);
				setState(786);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(787);
					match(T__1);
					setState(788);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(789);
					match(T__2);
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(793);
				match(SHOW);
				setState(794);
				match(COLUMNS);
				setState(795);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(796);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(797);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(798);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(801);
				match(SHOW);
				setState(802);
				match(VIEWS);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(803);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(804);
					multipartIdentifier();
					}
				}

				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(808);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(807);
						match(LIKE);
						}
					}

					setState(810);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(813);
				match(SHOW);
				setState(814);
				match(PARTITIONS);
				setState(815);
				multipartIdentifier();
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(816);
					partitionSpec();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(819);
				match(SHOW);
				setState(821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(820);
					identifier();
					}
					break;
				}
				setState(823);
				match(FUNCTIONS);
				setState(831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(825);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(824);
						match(LIKE);
						}
						break;
					}
					setState(829);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(827);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(828);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 47:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(833);
				match(SHOW);
				setState(834);
				match(CREATE);
				setState(835);
				match(TABLE);
				setState(836);
				multipartIdentifier();
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(837);
					match(AS);
					setState(838);
					match(SERDE);
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(841);
				match(SHOW);
				setState(842);
				match(CURRENT);
				setState(843);
				match(NAMESPACE);
				}
				break;
			case 49:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(844);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(845);
				match(FUNCTION);
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(846);
					match(EXTENDED);
					}
					break;
				}
				setState(849);
				describeFuncName();
				}
				break;
			case 50:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(850);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(851);
				namespace();
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(852);
					match(EXTENDED);
					}
					break;
				}
				setState(855);
				multipartIdentifier();
				}
				break;
			case 51:
				_localctx = new DescribeDeltaDetailContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(857);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(858);
				match(DETAIL);
				setState(859);
				((DescribeDeltaDetailContext)_localctx).table = multipartIdentifier();
				}
				break;
			case 52:
				_localctx = new DescribeDeltaHistoryContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(860);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(861);
				match(HISTORY);
				setState(862);
				((DescribeDeltaHistoryContext)_localctx).table = multipartIdentifier();
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(863);
					match(LIMIT);
					setState(864);
					((DescribeDeltaHistoryContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 53:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(867);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(868);
					match(TABLE);
					}
					break;
				}
				setState(872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(871);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(874);
				multipartIdentifier();
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(875);
					partitionSpec();
					}
					break;
				}
				setState(879);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(878);
					describeColName();
					}
					break;
				}
				}
				break;
			case 54:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(881);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(882);
					match(QUERY);
					}
				}

				setState(885);
				query();
				}
				break;
			case 55:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(886);
				match(COMMENT);
				setState(887);
				match(ON);
				setState(888);
				namespace();
				setState(889);
				multipartIdentifier();
				setState(890);
				match(IS);
				setState(891);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 56:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(893);
				match(COMMENT);
				setState(894);
				match(ON);
				setState(895);
				match(TABLE);
				setState(896);
				multipartIdentifier();
				setState(897);
				match(IS);
				setState(898);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 57:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(900);
				match(REFRESH);
				setState(901);
				match(TABLE);
				setState(902);
				multipartIdentifier();
				}
				break;
			case 58:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(903);
				match(REFRESH);
				setState(904);
				match(FUNCTION);
				setState(905);
				multipartIdentifier();
				}
				break;
			case 59:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(906);
				match(REFRESH);
				setState(914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(907);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(911);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(908);
							matchWildcard();
							}
							} 
						}
						setState(913);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 60:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(916);
				match(CACHE);
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(917);
					match(LAZY);
					}
				}

				setState(920);
				match(TABLE);
				setState(921);
				multipartIdentifier();
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(922);
					match(OPTIONS);
					setState(923);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (REDUCE - 196)) | (1L << (SELECT - 196)) | (1L << (TABLE - 196)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(926);
						match(AS);
						}
					}

					setState(929);
					query();
					}
				}

				}
				break;
			case 61:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(932);
				match(UNCACHE);
				setState(933);
				match(TABLE);
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(934);
					match(IF);
					setState(935);
					match(EXISTS);
					}
					break;
				}
				setState(938);
				multipartIdentifier();
				}
				break;
			case 62:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(939);
				match(CLEAR);
				setState(940);
				match(CACHE);
				}
				break;
			case 63:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(941);
				match(LOAD);
				setState(942);
				match(DATA);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(943);
					match(LOCAL);
					}
				}

				setState(946);
				match(INPATH);
				setState(947);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(948);
					match(OVERWRITE);
					}
				}

				setState(951);
				match(INTO);
				setState(952);
				match(TABLE);
				setState(953);
				multipartIdentifier();
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(954);
					partitionSpec();
					}
				}

				}
				break;
			case 64:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(957);
				match(TRUNCATE);
				setState(958);
				match(TABLE);
				setState(959);
				multipartIdentifier();
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(960);
					partitionSpec();
					}
				}

				}
				break;
			case 65:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(963);
				match(MSCK);
				setState(964);
				match(REPAIR);
				setState(965);
				match(TABLE);
				setState(966);
				multipartIdentifier();
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==DROP || _la==SYNC) {
					{
					setState(967);
					((RepairTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==DROP || _la==SYNC) ) {
						((RepairTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(968);
					match(PARTITIONS);
					}
				}

				}
				break;
			case 66:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(971);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(972);
				identifier();
				setState(980);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(973);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(977);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(974);
							matchWildcard();
							}
							} 
						}
						setState(979);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 67:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(982);
				match(SET);
				setState(983);
				match(ROLE);
				setState(987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(984);
						matchWildcard();
						}
						} 
					}
					setState(989);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			case 68:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(990);
				match(SET);
				setState(991);
				match(TIME);
				setState(992);
				match(ZONE);
				setState(993);
				interval();
				}
				break;
			case 69:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(994);
				match(SET);
				setState(995);
				match(TIME);
				setState(996);
				match(ZONE);
				setState(997);
				((SetTimeZoneContext)_localctx).timezone = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==STRING) ) {
					((SetTimeZoneContext)_localctx).timezone = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 70:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(998);
				match(SET);
				setState(999);
				match(TIME);
				setState(1000);
				match(ZONE);
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1001);
						matchWildcard();
						}
						} 
					}
					setState(1006);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			case 71:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1007);
				match(SET);
				setState(1008);
				configKey();
				setState(1009);
				match(EQ);
				setState(1010);
				configValue();
				}
				break;
			case 72:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1012);
				match(SET);
				setState(1013);
				configKey();
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1014);
					match(EQ);
					setState(1018);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1015);
							matchWildcard();
							}
							} 
						}
						setState(1020);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					}
					}
				}

				}
				break;
			case 73:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1023);
				match(SET);
				setState(1027);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1024);
						matchWildcard();
						}
						} 
					}
					setState(1029);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(1030);
				match(EQ);
				setState(1031);
				configValue();
				}
				break;
			case 74:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1032);
				match(SET);
				setState(1036);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1033);
						matchWildcard();
						}
						} 
					}
					setState(1038);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 75:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1039);
				match(RESET);
				setState(1040);
				configKey();
				}
				break;
			case 76:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1041);
				match(RESET);
				setState(1045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1042);
						matchWildcard();
						}
						} 
					}
					setState(1047);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			case 77:
				_localctx = new MergeTableContext(_localctx);
				enterOuterAlt(_localctx, 77);
				{
				setState(1048);
				match(MERGE);
				setState(1049);
				match(TABLE);
				setState(1050);
				multipartIdentifier();
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1051);
					partitionSpec();
					}
				}

				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1054);
					match(OPTIONS);
					setState(1055);
					((MergeTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 78:
				_localctx = new KillJobContext(_localctx);
				enterOuterAlt(_localctx, 78);
				{
				setState(1058);
				match(KILL);
				setState(1059);
				match(JOB);
				setState(1060);
				identifier();
				}
				break;
			case 79:
				_localctx = new AddJarContext(_localctx);
				enterOuterAlt(_localctx, 79);
				{
				setState(1061);
				match(ADDJAR);
				setState(1062);
				((AddJarContext)_localctx).jar = identifier();
				}
				break;
			case 80:
				_localctx = new ReadTableContext(_localctx);
				enterOuterAlt(_localctx, 80);
				{
				setState(1063);
				match(READ);
				setState(1064);
				match(TABLE);
				setState(1065);
				multipartIdentifier();
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1066);
					partitionSpec();
					}
				}

				setState(1069);
				match(LIMIT);
				setState(1070);
				number();
				}
				break;
			case 81:
				_localctx = new LoadTempTableContext(_localctx);
				enterOuterAlt(_localctx, 81);
				{
				setState(1072);
				match(LOAD);
				setState(1073);
				match(DATA);
				setState(1074);
				((LoadTempTableContext)_localctx).path = constant();
				setState(1075);
				match(TABLE);
				setState(1076);
				multipartIdentifier();
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1077);
					match(OPTIONS);
					setState(1078);
					((LoadTempTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 82:
				_localctx = new ExportTableContext(_localctx);
				enterOuterAlt(_localctx, 82);
				{
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1081);
					ctes();
					}
				}

				setState(1084);
				match(EXPORT);
				setState(1085);
				match(TABLE);
				setState(1086);
				multipartIdentifier();
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1087);
					partitionSpec();
					}
				}

				setState(1090);
				match(TO);
				setState(1091);
				((ExportTableContext)_localctx).name = constant();
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1092);
					match(OPTIONS);
					setState(1093);
					((ExportTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 83:
				_localctx = new CompressTableContext(_localctx);
				enterOuterAlt(_localctx, 83);
				{
				setState(1096);
				match(COMPRESS);
				setState(1097);
				match(TABLE);
				setState(1098);
				multipartIdentifier();
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1099);
					partitionSpec();
					}
				}

				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1102);
					match(OPTIONS);
					setState(1103);
					((CompressTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 84:
				_localctx = new CompressFileContext(_localctx);
				enterOuterAlt(_localctx, 84);
				{
				setState(1106);
				match(COMPRESS);
				setState(1107);
				match(FILE);
				setState(1108);
				((CompressFileContext)_localctx).path = constant();
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1109);
					match(OPTIONS);
					setState(1110);
					((CompressFileContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 85:
				_localctx = new VacuumTableContext(_localctx);
				enterOuterAlt(_localctx, 85);
				{
				setState(1113);
				match(VACUUM);
				setState(1114);
				((VacuumTableContext)_localctx).table = multipartIdentifier();
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETAIN) {
					{
					setState(1115);
					match(RETAIN);
					setState(1116);
					((VacuumTableContext)_localctx).num = number();
					setState(1117);
					match(HOURS);
					}
				}

				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DRY) {
					{
					setState(1121);
					match(DRY);
					setState(1122);
					match(RUN);
					}
				}

				}
				break;
			case 86:
				_localctx = new DeltaConvertContext(_localctx);
				enterOuterAlt(_localctx, 86);
				{
				setState(1125);
				match(CONVERT);
				setState(1126);
				match(TO);
				setState(1127);
				((DeltaConvertContext)_localctx).format = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DELTA || _la==PARQUET) ) {
					((DeltaConvertContext)_localctx).format = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1128);
				((DeltaConvertContext)_localctx).table = multipartIdentifier();
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(1129);
					match(PARTITIONED);
					setState(1130);
					match(BY);
					setState(1131);
					match(T__1);
					setState(1132);
					colTypeList();
					setState(1133);
					match(T__2);
					}
				}

				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1137);
					match(OPTIONS);
					setState(1138);
					((DeltaConvertContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 87:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 87);
				{
				setState(1141);
				unsupportedHiveNativeCommands();
				setState(1145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1142);
						matchWildcard();
						}
						} 
					}
					setState(1147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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

	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitConfigKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitConfigKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			quotedIdentifier();
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

	public static class ConfigValueContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitConfigValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitConfigValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			quotedIdentifier();
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

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SparkSqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkSqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SparkSqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkSqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SparkSqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkSqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SparkSqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SparkSqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkSqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SparkSqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SparkSqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SparkSqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SparkSqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkSqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SparkSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SparkSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkSqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SparkSqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1159);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1163);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1167);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1170);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1175);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1178);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1181);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1185);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1186);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1187);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1191);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1193);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1194);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1195);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1197);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1198);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1199);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1202);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1203);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1204);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1205);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1206);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1208);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1209);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1211);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1212);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1214);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1215);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1217);
				tableIdentifier();
				setState(1218);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1223);
				tableIdentifier();
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1225);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1227);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1228);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1229);
				tableIdentifier();
				setState(1230);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1231);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1233);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1234);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1235);
				tableIdentifier();
				setState(1236);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1237);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1239);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1240);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1241);
				tableIdentifier();
				setState(1242);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1243);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1245);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1246);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1247);
				tableIdentifier();
				setState(1248);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1249);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1250);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1251);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1253);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1254);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1255);
				tableIdentifier();
				setState(1256);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1257);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1258);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1260);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1261);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1262);
				tableIdentifier();
				setState(1263);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1264);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1266);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1267);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1268);
				tableIdentifier();
				setState(1269);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1270);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1272);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1273);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1274);
				tableIdentifier();
				setState(1275);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1276);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1278);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1279);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1280);
				tableIdentifier();
				setState(1281);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1283);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1284);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1285);
				tableIdentifier();
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1286);
					partitionSpec();
					}
				}

				setState(1289);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1291);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1292);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1293);
				tableIdentifier();
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1294);
					partitionSpec();
					}
				}

				setState(1297);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1299);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1300);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1301);
				tableIdentifier();
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1302);
					partitionSpec();
					}
				}

				setState(1305);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1306);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1308);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1309);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1310);
				tableIdentifier();
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1311);
					partitionSpec();
					}
				}

				setState(1314);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1315);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1317);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1318);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1319);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1320);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1321);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(CREATE);
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1325);
				match(TEMPORARY);
				}
			}

			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1328);
				match(EXTERNAL);
				}
			}

			setState(1331);
			match(TABLE);
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1332);
				match(IF);
				setState(1333);
				match(NOT);
				setState(1334);
				match(EXISTS);
				}
				break;
			}
			setState(1337);
			multipartIdentifier();
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

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1339);
				match(CREATE);
				setState(1340);
				match(OR);
				}
			}

			setState(1343);
			match(REPLACE);
			setState(1344);
			match(TABLE);
			setState(1345);
			multipartIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SparkSqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkSqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(CLUSTERED);
			setState(1348);
			match(BY);
			setState(1349);
			identifierList();
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1350);
				match(SORTED);
				setState(1351);
				match(BY);
				setState(1352);
				orderedIdentifierList();
				}
			}

			setState(1355);
			match(INTO);
			setState(1356);
			match(INTEGER_VALUE);
			setState(1357);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SparkSqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(SKEWED);
			setState(1360);
			match(BY);
			setState(1361);
			identifierList();
			setState(1362);
			match(ON);
			setState(1365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1363);
				constantList();
				}
				break;
			case 2:
				{
				setState(1364);
				nestedConstantList();
				}
				break;
			}
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1367);
				match(STORED);
				setState(1368);
				match(AS);
				setState(1369);
				match(DIRECTORIES);
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SparkSqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(LOCATION);
			setState(1373);
			match(STRING);
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

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(COMMENT);
			setState(1376);
			match(STRING);
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
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1378);
				ctes();
				}
			}

			setState(1381);
			queryTerm(0);
			setState(1382);
			queryOrganization();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_insertInto);
		int _la;
		try {
			setState(1445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				match(INSERT);
				setState(1385);
				match(OVERWRITE);
				setState(1387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1386);
					match(TABLE);
					}
					break;
				}
				setState(1389);
				multipartIdentifier();
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1390);
					partitionSpec();
					setState(1394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1391);
						match(IF);
						setState(1392);
						match(NOT);
						setState(1393);
						match(EXISTS);
						}
					}

					}
				}

				setState(1399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1398);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				match(INSERT);
				setState(1402);
				match(INTO);
				setState(1404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1403);
					match(TABLE);
					}
					break;
				}
				setState(1406);
				multipartIdentifier();
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1407);
					partitionSpec();
					}
				}

				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1410);
					match(IF);
					setState(1411);
					match(NOT);
					setState(1412);
					match(EXISTS);
					}
				}

				setState(1416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1415);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1418);
				match(INSERT);
				setState(1419);
				match(OVERWRITE);
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1420);
					match(LOCAL);
					}
				}

				setState(1423);
				match(DIRECTORY);
				setState(1424);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1425);
					rowFormat();
					}
				}

				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1428);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1431);
				match(INSERT);
				setState(1432);
				match(OVERWRITE);
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1433);
					match(LOCAL);
					}
				}

				setState(1436);
				match(DIRECTORY);
				setState(1438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1437);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1440);
				tableProvider();
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1441);
					match(OPTIONS);
					setState(1442);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			partitionSpec();
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1448);
				locationSpec();
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(PARTITION);
			setState(1452);
			match(T__1);
			setState(1453);
			partitionVal();
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1454);
				match(T__3);
				setState(1455);
				partitionVal();
				}
				}
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1461);
			match(T__2);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			identifier();
			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1464);
				match(EQ);
				setState(1465);
				constant();
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SparkSqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_describeFuncName);
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1470);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1472);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1473);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1474);
				predicateOperator();
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1478);
				match(T__4);
				setState(1479);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1484);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			match(WITH);
			setState(1486);
			namedQuery();
			setState(1491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1487);
				match(T__3);
				setState(1488);
				namedQuery();
				}
				}
				setState(1493);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1495);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1498);
				match(AS);
				}
			}

			setState(1501);
			match(T__1);
			setState(1502);
			query();
			setState(1503);
			match(T__2);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			match(USING);
			setState(1506);
			multipartIdentifier();
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

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public PartitionFieldListContext partitioning;
		public Token lifecycle;
		public TablePropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SparkSqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SparkSqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkSqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkSqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public List<TerminalNode> LIFECYCLE() { return getTokens(SparkSqlBaseParser.LIFECYCLE); }
		public TerminalNode LIFECYCLE(int i) {
			return getToken(SparkSqlBaseParser.LIFECYCLE, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkSqlBaseParser.INTEGER_VALUE, i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (LIFECYCLE - 143)) | (1L << (LOCATION - 143)) | (1L << (OPTIONS - 143)) | (1L << (PARTITIONED - 143)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (ROW - 213)) | (1L << (SKEWED - 213)) | (1L << (STORED - 213)) | (1L << (TBLPROPERTIES - 213)))) != 0)) {
				{
				setState(1523);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1508);
					match(OPTIONS);
					setState(1509);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1510);
					match(PARTITIONED);
					setState(1511);
					match(BY);
					setState(1512);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(1513);
					skewSpec();
					}
					break;
				case CLUSTERED:
					{
					setState(1514);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(1515);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(1516);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(1517);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1518);
					commentSpec();
					}
					break;
				case LIFECYCLE:
					{
					{
					setState(1519);
					match(LIFECYCLE);
					setState(1520);
					((CreateTableClausesContext)_localctx).lifecycle = match(INTEGER_VALUE);
					}
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1521);
					match(TBLPROPERTIES);
					setState(1522);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1527);
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			match(T__1);
			setState(1529);
			tableProperty();
			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1530);
				match(T__3);
				setState(1531);
				tableProperty();
				}
				}
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1537);
			match(T__2);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 255)) & ~0x3f) == 0 && ((1L << (_la - 255)) & ((1L << (TRUE - 255)) | (1L << (EQ - 255)) | (1L << (STRING - 255)) | (1L << (INTEGER_VALUE - 255)) | (1L << (DECIMAL_VALUE - 255)))) != 0)) {
				{
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1540);
					match(EQ);
					}
				}

				setState(1543);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1546);
				identifier();
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1547);
					match(T__4);
					setState(1548);
					identifier();
					}
					}
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1554);
				match(STRING);
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

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tablePropertyValue);
		try {
			setState(1561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1558);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1559);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1560);
				match(STRING);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(T__1);
			setState(1564);
			constant();
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1565);
				match(T__3);
				setState(1566);
				constant();
				}
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1572);
			match(T__2);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(T__1);
			setState(1575);
			constantList();
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1576);
				match(T__3);
				setState(1577);
				constantList();
				}
				}
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1583);
			match(T__2);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_createFileFormat);
		try {
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				match(STORED);
				setState(1586);
				match(AS);
				setState(1587);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				match(STORED);
				setState(1589);
				match(BY);
				setState(1590);
				storageHandler();
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SparkSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkSqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fileFormat);
		try {
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(INPUTFORMAT);
				setState(1594);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1595);
				match(OUTPUTFORMAT);
				setState(1596);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1597);
				identifier();
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(STRING);
			setState(1604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1601);
				match(WITH);
				setState(1602);
				match(SERDEPROPERTIES);
				setState(1603);
				tablePropertyList();
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			identifier();
			setState(1607);
			match(STRING);
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

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				insertInto();
				setState(1610);
				queryTerm(0);
				setState(1611);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				fromClause();
				setState(1615); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1614);
					multiInsertQueryBody();
					}
					}
					setState(1617); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1619);
				match(DELETE);
				setState(1620);
				match(FROM);
				setState(1621);
				multipartIdentifier();
				setState(1622);
				tableAlias();
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1623);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1626);
				match(UPDATE);
				setState(1627);
				multipartIdentifier();
				setState(1628);
				tableAlias();
				setState(1629);
				setClause();
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1630);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1633);
				match(MERGE);
				setState(1634);
				match(INTO);
				setState(1635);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1636);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1637);
				match(USING);
				setState(1643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1638);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1639);
					match(T__1);
					setState(1640);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1641);
					match(T__2);
					}
					break;
				}
				setState(1645);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1646);
				match(ON);
				setState(1647);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1648);
						matchedClause();
						}
						} 
					}
					setState(1653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1654);
					notMatchedClause();
					}
					}
					setState(1659);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SparkSqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SparkSqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1662);
				match(ORDER);
				setState(1663);
				match(BY);
				setState(1664);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1665);
						match(T__3);
						setState(1666);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1671);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				}
				break;
			}
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1674);
				match(CLUSTER);
				setState(1675);
				match(BY);
				setState(1676);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1677);
						match(T__3);
						setState(1678);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				}
				break;
			}
			setState(1696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1686);
				match(DISTRIBUTE);
				setState(1687);
				match(BY);
				setState(1688);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1689);
						match(T__3);
						setState(1690);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1695);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				}
				break;
			}
			setState(1708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1698);
				match(SORT);
				setState(1699);
				match(BY);
				setState(1700);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1701);
						match(T__3);
						setState(1702);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1707);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				}
				break;
			}
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1710);
				windowClause();
				}
				break;
			}
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1713);
				match(LIMIT);
				setState(1716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1714);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1715);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			insertInto();
			setState(1721);
			fromStatementBody();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SparkSqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SparkSqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkSqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkSqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1724);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1747);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1726);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1727);
						if (!(legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enabled");
						setState(1728);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1730);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1729);
							setQuantifier();
							}
						}

						setState(1732);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1733);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1734);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1735);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1737);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1736);
							setQuantifier();
							}
						}

						setState(1739);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1740);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1741);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1742);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1744);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1743);
							setQuantifier();
							}
						}

						setState(1746);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
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

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_queryPrimary);
		try {
			setState(1761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1752);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1753);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1754);
				match(TABLE);
				setState(1755);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1756);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1757);
				match(T__1);
				setState(1758);
				query();
				setState(1759);
				match(T__2);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SparkSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SparkSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			expression();
			setState(1765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1764);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1767);
				match(NULLS);
				setState(1768);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
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

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			fromClause();
			setState(1773); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1772);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1775); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1777);
				transformClause();
				setState(1779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1778);
					whereClause();
					}
					break;
				}
				setState(1781);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1783);
				selectClause();
				setState(1787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1784);
						lateralView();
						}
						} 
					}
					setState(1789);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				}
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1790);
					whereClause();
					}
					break;
				}
				setState(1794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1793);
					aggregationClause();
					}
					break;
				}
				setState(1797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1796);
					havingClause();
					}
					break;
				}
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1799);
					windowClause();
					}
					break;
				}
				setState(1802);
				queryOrganization();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_querySpecification);
		try {
			int _alt;
			setState(1835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1806);
				transformClause();
				setState(1808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1807);
					fromClause();
					}
					break;
				}
				setState(1811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1810);
					whereClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1813);
				selectClause();
				setState(1815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1814);
					fromClause();
					}
					break;
				}
				setState(1820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1817);
						lateralView();
						}
						} 
					}
					setState(1822);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				}
				setState(1824);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1823);
					whereClause();
					}
					break;
				}
				setState(1827);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1826);
					aggregationClause();
					}
					break;
				}
				setState(1830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1829);
					havingClause();
					}
					break;
				}
				setState(1833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1832);
					windowClause();
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

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SparkSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SparkSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1837);
				match(SELECT);
				setState(1838);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1839);
				match(T__1);
				setState(1840);
				namedExpressionSeq();
				setState(1841);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1843);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1844);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1845);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1846);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1849);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1852);
				match(RECORDWRITER);
				setState(1853);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1856);
			match(USING);
			setState(1857);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1858);
				match(AS);
				setState(1868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1859);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1860);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1861);
					match(T__1);
					setState(1864);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(1862);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1863);
						colTypeList();
						}
						break;
					}
					setState(1866);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1872);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1875);
				match(RECORDREADER);
				setState(1876);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SparkSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			match(SELECT);
			setState(1883);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1880);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			setState(1887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1886);
				setQuantifier();
				}
				break;
			}
			setState(1889);
			namedExpressionSeq();
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(SET);
			setState(1892);
			assignmentList();
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

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SparkSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SparkSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			match(WHEN);
			setState(1895);
			match(MATCHED);
			setState(1898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1896);
				match(AND);
				setState(1897);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1900);
			match(THEN);
			setState(1901);
			matchedAction();
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

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SparkSqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SparkSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(WHEN);
			setState(1904);
			match(NOT);
			setState(1905);
			match(MATCHED);
			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1906);
				match(AND);
				setState(1907);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1910);
			match(THEN);
			setState(1911);
			notMatchedAction();
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

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_matchedAction);
		try {
			setState(1920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1913);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1914);
				match(UPDATE);
				setState(1915);
				match(SET);
				setState(1916);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1917);
				match(UPDATE);
				setState(1918);
				match(SET);
				setState(1919);
				assignmentList();
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

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_notMatchedAction);
		int _la;
		try {
			setState(1940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1922);
				match(INSERT);
				setState(1923);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1924);
				match(INSERT);
				setState(1925);
				match(T__1);
				setState(1926);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1927);
				match(T__2);
				setState(1928);
				match(VALUES);
				setState(1929);
				match(T__1);
				setState(1930);
				expression();
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1931);
					match(T__3);
					setState(1932);
					expression();
					}
					}
					setState(1937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1938);
				match(T__2);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			assignment();
			setState(1947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1943);
				match(T__3);
				setState(1944);
				assignment();
				}
				}
				setState(1949);
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

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1951);
			match(EQ);
			setState(1952);
			((AssignmentContext)_localctx).value = expression();
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
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			match(WHERE);
			setState(1955);
			booleanExpression(0);
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
		public TerminalNode HAVING() { return getToken(SparkSqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			match(HAVING);
			setState(1958);
			booleanExpression(0);
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

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			match(T__5);
			setState(1961);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1963);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
					case 1:
						{
						setState(1962);
						match(T__3);
						}
						break;
					}
					setState(1965);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			setState(1971);
			match(T__6);
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

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_hintStatement);
		int _la;
		try {
			setState(1986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1973);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1975);
				match(T__1);
				setState(1976);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1977);
					match(T__3);
					setState(1978);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1984);
				match(T__2);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			match(FROM);
			setState(1989);
			relation();
			setState(1994);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1990);
					match(T__3);
					setState(1991);
					relation();
					}
					} 
				}
				setState(1996);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			}
			setState(2000);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1997);
					lateralView();
					}
					} 
				}
				setState(2002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			setState(2004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(2003);
				pivotClause();
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

	public static class AggregationClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SparkSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SparkSqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SparkSqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SparkSqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SparkSqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(2050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2006);
				match(GROUP);
				setState(2007);
				match(BY);
				setState(2008);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(2013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2009);
						match(T__3);
						setState(2010);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(2015);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
				}
				setState(2033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2016);
					match(WITH);
					setState(2017);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(2018);
					match(WITH);
					setState(2019);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(2020);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(2021);
					match(SETS);
					setState(2022);
					match(T__1);
					setState(2023);
					groupingSet();
					setState(2028);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2024);
						match(T__3);
						setState(2025);
						groupingSet();
						}
						}
						setState(2030);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2031);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2035);
				match(GROUP);
				setState(2036);
				match(BY);
				setState(2037);
				((AggregationClauseContext)_localctx).kind = match(GROUPING);
				setState(2038);
				match(SETS);
				setState(2039);
				match(T__1);
				setState(2040);
				groupingSet();
				setState(2045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2041);
					match(T__3);
					setState(2042);
					groupingSet();
					}
					}
					setState(2047);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2048);
				match(T__2);
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_groupingSet);
		int _la;
		try {
			setState(2065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				match(T__1);
				setState(2061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(2053);
					expression();
					setState(2058);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2054);
						match(T__3);
						setState(2055);
						expression();
						}
						}
						setState(2060);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2063);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2064);
				expression();
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

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SparkSqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(PIVOT);
			setState(2068);
			match(T__1);
			setState(2069);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2070);
			match(FOR);
			setState(2071);
			pivotColumn();
			setState(2072);
			match(IN);
			setState(2073);
			match(T__1);
			setState(2074);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2075);
				match(T__3);
				setState(2076);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2082);
			match(T__2);
			setState(2083);
			match(T__2);
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

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_pivotColumn);
		int _la;
		try {
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2085);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2086);
				match(T__1);
				setState(2087);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2088);
					match(T__3);
					setState(2089);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2094);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2095);
				match(T__2);
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

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			expression();
			setState(2104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2100);
					match(AS);
					}
					break;
				}
				setState(2103);
				identifier();
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SparkSqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SparkSqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2106);
			match(LATERAL);
			setState(2107);
			match(VIEW);
			setState(2109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2108);
				match(OUTER);
				}
				break;
			}
			setState(2111);
			qualifiedName();
			setState(2112);
			match(T__1);
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2113);
				expression();
				setState(2118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2114);
					match(T__3);
					setState(2115);
					expression();
					}
					}
					setState(2120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2123);
			match(T__2);
			setState(2124);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2125);
					match(AS);
					}
					break;
				}
				setState(2128);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2129);
						match(T__3);
						setState(2130);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				}
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SparkSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			relationPrimary();
			setState(2144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2141);
					joinRelation();
					}
					} 
				}
				setState(2146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SparkSqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SparkSqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_joinRelation);
		try {
			setState(2158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2147);
				joinType();
				}
				setState(2148);
				match(JOIN);
				setState(2149);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2150);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2153);
				match(NATURAL);
				setState(2154);
				joinType();
				setState(2155);
				match(JOIN);
				setState(2156);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SparkSqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SparkSqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SparkSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SparkSqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SparkSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SparkSqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SparkSqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_joinType);
		int _la;
		try {
			setState(2184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2160);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2163);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2164);
				match(LEFT);
				setState(2166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2165);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2168);
					match(LEFT);
					}
				}

				setState(2171);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2172);
				match(RIGHT);
				setState(2174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2173);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2176);
				match(FULL);
				setState(2178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2177);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2180);
					match(LEFT);
					}
				}

				setState(2183);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_joinCriteria);
		try {
			setState(2190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2186);
				match(ON);
				setState(2187);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2188);
				match(USING);
				setState(2189);
				identifierList();
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

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SparkSqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			match(TABLESAMPLE);
			setState(2193);
			match(T__1);
			setState(2195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2194);
				sampleMethod();
				}
				break;
			}
			setState(2197);
			match(T__2);
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

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SparkSqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SparkSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SparkSqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkSqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SparkSqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_sampleMethod);
		int _la;
		try {
			setState(2223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2199);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2202);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2203);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2204);
				expression();
				setState(2205);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2207);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2208);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2209);
				match(OUT);
				setState(2210);
				match(OF);
				setState(2211);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2212);
					match(ON);
					setState(2218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
					case 1:
						{
						setState(2213);
						identifier();
						}
						break;
					case 2:
						{
						setState(2214);
						qualifiedName();
						setState(2215);
						match(T__1);
						setState(2216);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2222);
				((SampleByBytesContext)_localctx).bytes = expression();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			match(T__1);
			setState(2226);
			identifierSeq();
			setState(2227);
			match(T__2);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2230);
					match(T__3);
					setState(2231);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
			match(T__1);
			setState(2238);
			orderedIdentifier();
			setState(2243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2239);
				match(T__3);
				setState(2240);
				orderedIdentifier();
				}
				}
				setState(2245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2246);
			match(T__2);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SparkSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2249);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2252);
			match(T__1);
			setState(2253);
			identifierComment();
			setState(2258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2254);
				match(T__3);
				setState(2255);
				identifierComment();
				}
				}
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2261);
			match(T__2);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2263);
			identifier();
			setState(2265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2264);
				commentSpec();
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_relationPrimary);
		try {
			setState(2291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2267);
				multipartIdentifier();
				setState(2269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2268);
					sample();
					}
					break;
				}
				setState(2271);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2273);
				match(T__1);
				setState(2274);
				query();
				setState(2275);
				match(T__2);
				setState(2277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2276);
					sample();
					}
					break;
				}
				setState(2279);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2281);
				match(T__1);
				setState(2282);
				relation();
				setState(2283);
				match(T__2);
				setState(2285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2284);
					sample();
					}
					break;
				}
				setState(2287);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2289);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2290);
				functionTable();
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			match(VALUES);
			setState(2294);
			expression();
			setState(2299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2295);
					match(T__3);
					setState(2296);
					expression();
					}
					} 
				}
				setState(2301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
			setState(2302);
			tableAlias();
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

	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(2305);
			match(T__1);
			setState(2314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2306);
				expression();
				setState(2311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2307);
					match(T__3);
					setState(2308);
					expression();
					}
					}
					setState(2313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2316);
			match(T__2);
			setState(2317);
			tableAlias();
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

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2319);
					match(AS);
					}
					break;
				}
				setState(2322);
				strictIdentifier();
				setState(2324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2323);
					identifierList();
					}
					break;
				}
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkSqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkSqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SparkSqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SparkSqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SparkSqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkSqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SparkSqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SparkSqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkSqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SparkSqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_rowFormat);
		try {
			setState(2377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2328);
				match(ROW);
				setState(2329);
				match(FORMAT);
				setState(2330);
				match(SERDE);
				setState(2331);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2332);
					match(WITH);
					setState(2333);
					match(SERDEPROPERTIES);
					setState(2334);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2337);
				match(ROW);
				setState(2338);
				match(FORMAT);
				setState(2339);
				match(DELIMITED);
				setState(2349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2340);
					match(FIELDS);
					setState(2341);
					match(TERMINATED);
					setState(2342);
					match(BY);
					setState(2343);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
					case 1:
						{
						setState(2344);
						match(ESCAPED);
						setState(2345);
						match(BY);
						setState(2346);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2351);
					match(COLLECTION);
					setState(2352);
					match(ITEMS);
					setState(2353);
					match(TERMINATED);
					setState(2354);
					match(BY);
					setState(2355);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2358);
					match(MAP);
					setState(2359);
					match(KEYS);
					setState(2360);
					match(TERMINATED);
					setState(2361);
					match(BY);
					setState(2362);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2365);
					match(LINES);
					setState(2366);
					match(TERMINATED);
					setState(2367);
					match(BY);
					setState(2368);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2371);
					match(NULL);
					setState(2372);
					match(DEFINED);
					setState(2373);
					match(AS);
					setState(2374);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
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

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
			multipartIdentifier();
			setState(2384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2380);
				match(T__3);
				setState(2381);
				multipartIdentifier();
				}
				}
				setState(2386);
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

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2387);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2388);
					match(T__4);
					setState(2389);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2395);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2396);
				match(T__4);
				}
				break;
			}
			setState(2400);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
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
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				setState(2402);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2403);
				match(T__4);
				}
				break;
			}
			setState(2407);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			expression();
			setState(2417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				setState(2411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2410);
					match(AS);
					}
					break;
				}
				setState(2415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2413);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2414);
					identifierList();
					}
					break;
				}
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			namedExpression();
			setState(2424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2420);
					match(T__3);
					setState(2421);
					namedExpression();
					}
					} 
				}
				setState(2426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
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

	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPartitionFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPartitionFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
			match(T__1);
			setState(2428);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2429);
				match(T__3);
				setState(2430);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2436);
			match(T__2);
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

	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPartitionColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPartitionColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPartitionTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPartitionTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_partitionField);
		try {
			setState(2440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2438);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2439);
				colType();
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

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_transform);
		int _la;
		try {
			setState(2455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2442);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2443);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2444);
				match(T__1);
				setState(2445);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2446);
					match(T__3);
					setState(2447);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2453);
				match(T__2);
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

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_transformArgument);
		try {
			setState(2459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2457);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2458);
				constant();
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2464);
				match(NOT);
				setState(2465);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2466);
				match(EXISTS);
				setState(2467);
				match(T__1);
				setState(2468);
				query();
				setState(2469);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2471);
				valueExpression(0);
				setState(2473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2472);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2477);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2478);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2479);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2480);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2481);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2482);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
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

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SparkSqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode ANY() { return getToken(SparkSqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SparkSqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SparkSqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(SparkSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SparkSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkSqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SparkSqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkSqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_predicate);
		int _la;
		try {
			setState(2570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2488);
					match(NOT);
					}
				}

				setState(2491);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2492);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2493);
				match(AND);
				setState(2494);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2496);
					match(NOT);
					}
				}

				setState(2499);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2500);
				match(T__1);
				setState(2501);
				expression();
				setState(2506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2502);
					match(T__3);
					setState(2503);
					expression();
					}
					}
					setState(2508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2509);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2511);
					match(NOT);
					}
				}

				setState(2514);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2515);
				match(T__1);
				setState(2516);
				query();
				setState(2517);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2519);
					match(NOT);
					}
				}

				setState(2522);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2523);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2524);
					match(NOT);
					}
				}

				setState(2527);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2528);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2529);
					match(T__1);
					setState(2530);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(2531);
					match(T__1);
					setState(2532);
					expression();
					setState(2537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2533);
						match(T__3);
						setState(2534);
						expression();
						}
						}
						setState(2539);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2540);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2544);
					match(NOT);
					}
				}

				setState(2547);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2548);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2549);
					match(ESCAPE);
					setState(2550);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2553);
				match(IS);
				setState(2555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2554);
					match(NOT);
					}
				}

				setState(2557);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2558);
				match(IS);
				setState(2560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2559);
					match(NOT);
					}
				}

				setState(2562);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2563);
				match(IS);
				setState(2565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2564);
					match(NOT);
					}
				}

				setState(2567);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2568);
				match(FROM);
				setState(2569);
				((PredicateContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SparkSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SparkSqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SparkSqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SparkSqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SparkSqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 198;
		enterRecursionRule(_localctx, 198, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2573);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2574);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PLUS - 294)) | (1L << (MINUS - 294)) | (1L << (TILDE - 294)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2575);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2597);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2578);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2579);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (ASTERISK - 296)) | (1L << (SLASH - 296)) | (1L << (PERCENT - 296)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2580);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2581);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2582);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PLUS - 294)) | (1L << (MINUS - 294)) | (1L << (CONCAT_PIPE - 294)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2583);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2584);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2585);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2586);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2587);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2588);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2589);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2590);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2591);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2592);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2593);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2594);
						comparisonOperator();
						setState(2595);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SparkSqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkSqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkSqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SparkSqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SparkSqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SparkSqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SparkSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkSqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SparkSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SparkSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SparkSqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SparkSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SparkSqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SparkSqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SparkSqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SparkSqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SparkSqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public TerminalNode OVER() { return getToken(SparkSqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SparkSqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkSqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkSqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SparkSqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2603);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2604);
				match(CASE);
				setState(2606); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2605);
					whenClause();
					}
					}
					setState(2608); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2610);
					match(ELSE);
					setState(2611);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2614);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2616);
				match(CASE);
				setState(2617);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2619); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2618);
					whenClause();
					}
					}
					setState(2621); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2623);
					match(ELSE);
					setState(2624);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2627);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2629);
				match(CAST);
				setState(2630);
				match(T__1);
				setState(2631);
				expression();
				setState(2632);
				match(AS);
				setState(2633);
				dataType();
				setState(2634);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2636);
				match(STRUCT);
				setState(2637);
				match(T__1);
				setState(2646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2638);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2639);
						match(T__3);
						setState(2640);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2645);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2648);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2649);
				match(FIRST);
				setState(2650);
				match(T__1);
				setState(2651);
				expression();
				setState(2654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2652);
					match(IGNORE);
					setState(2653);
					match(NULLS);
					}
				}

				setState(2656);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2658);
				match(LAST);
				setState(2659);
				match(T__1);
				setState(2660);
				expression();
				setState(2663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2661);
					match(IGNORE);
					setState(2662);
					match(NULLS);
					}
				}

				setState(2665);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2667);
				match(POSITION);
				setState(2668);
				match(T__1);
				setState(2669);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2670);
				match(IN);
				setState(2671);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2672);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2674);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2675);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2676);
				qualifiedName();
				setState(2677);
				match(T__4);
				setState(2678);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2680);
				match(T__1);
				setState(2681);
				namedExpression();
				setState(2684); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2682);
					match(T__3);
					setState(2683);
					namedExpression();
					}
					}
					setState(2686); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2688);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2690);
				match(T__1);
				setState(2691);
				query();
				setState(2692);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2694);
				functionName();
				setState(2695);
				match(T__1);
				setState(2707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
				case 1:
					{
					setState(2697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
					case 1:
						{
						setState(2696);
						setQuantifier();
						}
						break;
					}
					setState(2699);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2704);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2700);
						match(T__3);
						setState(2701);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2706);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2709);
				match(T__2);
				setState(2716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
				case 1:
					{
					setState(2710);
					match(FILTER);
					setState(2711);
					match(T__1);
					setState(2712);
					match(WHERE);
					setState(2713);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2714);
					match(T__2);
					}
					break;
				}
				setState(2720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
				case 1:
					{
					setState(2718);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2719);
					match(NULLS);
					}
					break;
				}
				setState(2724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2722);
					match(OVER);
					setState(2723);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2726);
				identifier();
				setState(2727);
				match(T__7);
				setState(2728);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2730);
				match(T__1);
				setState(2731);
				identifier();
				setState(2734); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2732);
					match(T__3);
					setState(2733);
					identifier();
					}
					}
					setState(2736); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2738);
				match(T__2);
				setState(2739);
				match(T__7);
				setState(2740);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2742);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2743);
				match(T__1);
				setState(2744);
				expression();
				setState(2745);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2747);
				match(EXTRACT);
				setState(2748);
				match(T__1);
				setState(2749);
				((ExtractContext)_localctx).field = identifier();
				setState(2750);
				match(FROM);
				setState(2751);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2752);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2754);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2755);
				match(T__1);
				setState(2756);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2757);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2758);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2759);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2760);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2763);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2765);
				match(TRIM);
				setState(2766);
				match(T__1);
				setState(2768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
				case 1:
					{
					setState(2767);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
				case 1:
					{
					setState(2770);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2773);
				match(FROM);
				setState(2774);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2775);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2777);
				match(OVERLAY);
				setState(2778);
				match(T__1);
				setState(2779);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2780);
				match(PLACING);
				setState(2781);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2782);
				match(FROM);
				setState(2783);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2784);
					match(FOR);
					setState(2785);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2788);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2800);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2792);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2793);
						match(T__8);
						setState(2794);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2795);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2797);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2798);
						match(T__4);
						setState(2799);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_constant);
		try {
			int _alt;
			setState(2817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2805);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2806);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2807);
				identifier();
				setState(2808);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2810);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2811);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2813); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2812);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2815); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,359,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SparkSqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SparkSqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SparkSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SparkSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SparkSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SparkSqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SparkSqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2819);
			_la = _input.LA(1);
			if ( !(((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (EQ - 286)) | (1L << (NSEQ - 286)) | (1L << (NEQ - 286)) | (1L << (NEQJ - 286)) | (1L << (LT - 286)) | (1L << (LTE - 286)) | (1L << (GT - 286)) | (1L << (GTE - 286)))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SparkSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SparkSqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SparkSqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SparkSqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2821);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PLUS - 294)) | (1L << (MINUS - 294)) | (1L << (ASTERISK - 294)) | (1L << (SLASH - 294)) | (1L << (PERCENT - 294)) | (1L << (TILDE - 294)) | (1L << (AMPERSAND - 294)) | (1L << (PIPE - 294)) | (1L << (CONCAT_PIPE - 294)) | (1L << (HAT - 294)))) != 0)) ) {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2823);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (IN - 120)) | (1L << (NOT - 120)) | (1L << (OR - 120)))) != 0)) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SparkSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2825);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SparkSqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			match(INTERVAL);
			setState(2830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				{
				setState(2828);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2829);
				errorCapturingUnitToUnitInterval();
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

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
			multiUnitsInterval();
			setState(2834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2833);
				unitToUnitInterval();
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

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> unit = new ArrayList<IdentifierContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2839); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2836);
					intervalValue();
					setState(2837);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2841); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2843);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				{
				setState(2844);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2845);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
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

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2849);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2850);
			match(TO);
			setState(2851);
			((UnitToUnitIntervalContext)_localctx).to = identifier();
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SparkSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_intervalValue);
		int _la;
		try {
			setState(2858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2853);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2856);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2857);
				match(STRING);
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

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_colPosition);
		try {
			setState(2863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2860);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2861);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2862);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(SparkSqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SparkSqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SparkSqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkSqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_dataType);
		int _la;
		try {
			setState(2899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2865);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2866);
				match(LT);
				setState(2867);
				dataType();
				setState(2868);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2870);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2871);
				match(LT);
				setState(2872);
				dataType();
				setState(2873);
				match(T__3);
				setState(2874);
				dataType();
				setState(2875);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2877);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2884);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2878);
					match(LT);
					setState(2880);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
					case 1:
						{
						setState(2879);
						complexColTypeList();
						}
						break;
					}
					setState(2882);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2883);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2886);
				identifier();
				setState(2897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
				case 1:
					{
					setState(2887);
					match(T__1);
					setState(2888);
					match(INTEGER_VALUE);
					setState(2893);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2889);
						match(T__3);
						setState(2890);
						match(INTEGER_VALUE);
						}
						}
						setState(2895);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2896);
					match(T__2);
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

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2901);
			qualifiedColTypeWithPosition();
			setState(2906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2902);
				match(T__3);
				setState(2903);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2908);
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

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2909);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2910);
			dataType();
			setState(2913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2911);
				match(NOT);
				setState(2912);
				match(NULL);
				}
			}

			setState(2916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2915);
				commentSpec();
				}
			}

			setState(2919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2918);
				colPosition();
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2921);
			colType();
			setState(2926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2922);
					match(T__3);
					setState(2923);
					colType();
					}
					} 
				}
				setState(2928);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
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

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2929);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2930);
			dataType();
			setState(2933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				{
				setState(2931);
				match(NOT);
				setState(2932);
				match(NULL);
				}
				break;
			}
			setState(2936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				{
				setState(2935);
				commentSpec();
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2938);
			complexColType();
			setState(2943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2939);
				match(T__3);
				setState(2940);
				complexColType();
				}
				}
				setState(2945);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2946);
			identifier();
			setState(2947);
			match(T__10);
			setState(2948);
			dataType();
			setState(2951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2949);
				match(NOT);
				setState(2950);
				match(NULL);
				}
			}

			setState(2954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2953);
				commentSpec();
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SparkSqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2956);
			match(WHEN);
			setState(2957);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2958);
			match(THEN);
			setState(2959);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SparkSqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2961);
			match(WINDOW);
			setState(2962);
			namedWindow();
			setState(2967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2963);
					match(T__3);
					setState(2964);
					namedWindow();
					}
					} 
				}
				setState(2969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2970);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2971);
			match(AS);
			setState(2972);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SparkSqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SparkSqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_windowSpec);
		int _la;
		try {
			setState(3020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2974);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2975);
				match(T__1);
				setState(2976);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2977);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2979);
				match(T__1);
				setState(3014);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2980);
					match(CLUSTER);
					setState(2981);
					match(BY);
					setState(2982);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2987);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2983);
						match(T__3);
						setState(2984);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2989);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(3000);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2990);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2991);
						match(BY);
						setState(2992);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2997);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2993);
							match(T__3);
							setState(2994);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2999);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(3012);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(3002);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3003);
						match(BY);
						setState(3004);
						sortItem();
						setState(3009);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(3005);
							match(T__3);
							setState(3006);
							sortItem();
							}
							}
							setState(3011);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(3016);
					windowFrame();
					}
				}

				setState(3019);
				match(T__2);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SparkSqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SparkSqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_windowFrame);
		try {
			setState(3038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3022);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3023);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3024);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3025);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3026);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3027);
				match(BETWEEN);
				setState(3028);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3029);
				match(AND);
				setState(3030);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3032);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3033);
				match(BETWEEN);
				setState(3034);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3035);
				match(AND);
				setState(3036);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SparkSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_frameBound);
		int _la;
		try {
			setState(3047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3040);
				match(UNBOUNDED);
				setState(3041);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3042);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(3043);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3044);
				expression();
				setState(3045);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3049);
			qualifiedName();
			setState(3054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(3050);
				match(T__3);
				setState(3051);
				qualifiedName();
				}
				}
				setState(3056);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SparkSqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SparkSqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SparkSqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_functionName);
		try {
			setState(3061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3057);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3058);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3059);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3060);
				match(RIGHT);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3063);
			identifier();
			setState(3068);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,396,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3064);
					match(T__4);
					setState(3065);
					identifier();
					}
					} 
				}
				setState(3070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,396,_ctx);
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

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3071);
			identifier();
			setState(3072);
			errorCapturingIdentifierExtra();
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

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SparkSqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SparkSqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3076); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3074);
						match(MINUS);
						setState(3075);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3078); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,397,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_identifier);
		try {
			setState(3086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,399,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3083);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3084);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3085);
				strictNonReserved();
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SparkSqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_strictIdentifier);
		try {
			setState(3094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3088);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3089);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3090);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3091);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3092);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3093);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SparkSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3096);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SparkSqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SparkSqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SparkSqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SparkSqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SparkSqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SparkSqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SparkSqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SparkSqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_number);
		int _la;
		try {
			setState(3141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3098);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3099);
					match(MINUS);
					}
				}

				setState(3102);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3103);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3104);
					match(MINUS);
					}
				}

				setState(3107);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3108);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3109);
					match(MINUS);
					}
				}

				setState(3112);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3113);
					match(MINUS);
					}
				}

				setState(3116);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3117);
					match(MINUS);
					}
				}

				setState(3120);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3121);
					match(MINUS);
					}
				}

				setState(3124);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3125);
					match(MINUS);
					}
				}

				setState(3128);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3129);
					match(MINUS);
					}
				}

				setState(3132);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3133);
					match(MINUS);
					}
				}

				setState(3136);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3137);
					match(MINUS);
					}
				}

				setState(3140);
				match(BIGDECIMAL_LITERAL);
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

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public TerminalNode TYPE() { return getToken(SparkSqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_alterColumnAction);
		int _la;
		try {
			setState(3150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3143);
				match(TYPE);
				setState(3144);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3145);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(3146);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(3147);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3148);
				match(NOT);
				setState(3149);
				match(NULL);
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

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkSqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SparkSqlBaseParser.ANTI, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SparkSqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SparkSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SparkSqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SparkSqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkSqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SparkSqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkSqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkSqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SparkSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SparkSqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkSqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONVERT() { return getToken(SparkSqlBaseParser.CONVERT, 0); }
		public TerminalNode COST() { return getToken(SparkSqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SparkSqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlBaseParser.DATABASES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SparkSqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkSqlBaseParser.DELIMITED, 0); }
		public TerminalNode DELTA() { return getToken(SparkSqlBaseParser.DELTA, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DETAIL() { return getToken(SparkSqlBaseParser.DETAIL, 0); }
		public TerminalNode DFS() { return getToken(SparkSqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode DRY() { return getToken(SparkSqlBaseParser.DRY, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkSqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SparkSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SparkSqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkSqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SparkSqlBaseParser.GROUPING, 0); }
		public TerminalNode HISTORY() { return getToken(SparkSqlBaseParser.HISTORY, 0); }
		public TerminalNode HOURS() { return getToken(SparkSqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkSqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SparkSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkSqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SparkSqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkSqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SparkSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkSqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SparkSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SparkSqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SparkSqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SparkSqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SparkSqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SparkSqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SparkSqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SparkSqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkSqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SparkSqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode MSCK() { return getToken(SparkSqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SparkSqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SparkSqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SparkSqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SparkSqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SparkSqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SparkSqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SparkSqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PARQUET() { return getToken(SparkSqlBaseParser.PARQUET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SparkSqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SparkSqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SparkSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SparkSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SparkSqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SparkSqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SparkSqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SparkSqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SparkSqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SparkSqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkSqlBaseParser.REVOKE, 0); }
		public TerminalNode RETAIN() { return getToken(SparkSqlBaseParser.RETAIN, 0); }
		public TerminalNode RLIKE() { return getToken(SparkSqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkSqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SparkSqlBaseParser.ROWS, 0); }
		public TerminalNode RUN() { return getToken(SparkSqlBaseParser.RUN, 0); }
		public TerminalNode SCHEMA() { return getToken(SparkSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SEMI() { return getToken(SparkSqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkSqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkSqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SparkSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SparkSqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SparkSqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkSqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkSqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SparkSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SparkSqlBaseParser.SYNC, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkSqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SparkSqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SparkSqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SparkSqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SparkSqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkSqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkSqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SparkSqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SparkSqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public TerminalNode VACUUM() { return getToken(SparkSqlBaseParser.VACUUM, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SparkSqlBaseParser.VIEWS, 0); }
		public TerminalNode WINDOW() { return getToken(SparkSqlBaseParser.WINDOW, 0); }
		public TerminalNode ZONE() { return getToken(SparkSqlBaseParser.ZONE, 0); }
		public TerminalNode KILL() { return getToken(SparkSqlBaseParser.KILL, 0); }
		public TerminalNode READ() { return getToken(SparkSqlBaseParser.READ, 0); }
		public TerminalNode JOB() { return getToken(SparkSqlBaseParser.JOB, 0); }
		public TerminalNode ADDJAR() { return getToken(SparkSqlBaseParser.ADDJAR, 0); }
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode FILE() { return getToken(SparkSqlBaseParser.FILE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ANTI) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONVERT) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASES - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DELTA - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DETAIL - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (DRY - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOURS - 64)) | (1L << (HISTORY - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (INTERVAL - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (LAST - 128)) | (1L << (LATERAL - 128)) | (1L << (LAZY - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OUT - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PARQUET - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RANGE - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (RECOVER - 192)) | (1L << (REDUCE - 192)) | (1L << (REFRESH - 192)) | (1L << (RENAME - 192)) | (1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESPECT - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RETAIN - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (RUN - 192)) | (1L << (SCHEMA - 192)) | (1L << (SEMI - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SET - 192)) | (1L << (SETMINUS - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYNC - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (TOUCH - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRUNCATE - 256)) | (1L << (TYPE - 256)) | (1L << (UNARCHIVE - 256)) | (1L << (UNBOUNDED - 256)) | (1L << (UNCACHE - 256)) | (1L << (UNLOCK - 256)) | (1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (VALUES - 256)) | (1L << (VACUUM - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WINDOW - 256)) | (1L << (ZONE - 256)) | (1L << (KILL - 256)) | (1L << (READ - 256)) | (1L << (JOB - 256)) | (1L << (ADDJAR - 256)) | (1L << (COMPRESS - 256)) | (1L << (FILE - 256)))) != 0)) ) {
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

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SparkSqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SparkSqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkSqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SparkSqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SparkSqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SparkSqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SparkSqlBaseParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(SparkSqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SparkSqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SparkSqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SparkSqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkSqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SparkSqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3154);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EXCEPT - 86)) | (1L << (FULL - 86)) | (1L << (INNER - 86)) | (1L << (INTERSECT - 86)) | (1L << (JOIN - 86)) | (1L << (LEFT - 86)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (NATURAL - 159)) | (1L << (ON - 159)) | (1L << (RIGHT - 159)) | (1L << (SEMI - 159)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (SETMINUS - 225)) | (1L << (UNION - 225)) | (1L << (USING - 225)))) != 0)) ) {
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkSqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SparkSqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SparkSqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SparkSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SparkSqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SparkSqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SparkSqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SparkSqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkSqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SparkSqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SparkSqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SparkSqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SparkSqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkSqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SparkSqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkSqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SparkSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SparkSqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkSqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SparkSqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode CONVERT() { return getToken(SparkSqlBaseParser.CONVERT, 0); }
		public TerminalNode COST() { return getToken(SparkSqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SparkSqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SparkSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SparkSqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SparkSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SparkSqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SparkSqlBaseParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SparkSqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkSqlBaseParser.DELIMITED, 0); }
		public TerminalNode DELTA() { return getToken(SparkSqlBaseParser.DELTA, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DETAIL() { return getToken(SparkSqlBaseParser.DETAIL, 0); }
		public TerminalNode DFS() { return getToken(SparkSqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkSqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode DRY() { return getToken(SparkSqlBaseParser.DRY, 0); }
		public TerminalNode ELSE() { return getToken(SparkSqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SparkSqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SparkSqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkSqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SparkSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SparkSqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SparkSqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SparkSqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SparkSqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SparkSqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkSqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SparkSqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SparkSqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SparkSqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SparkSqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SparkSqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SparkSqlBaseParser.HOURS, 0); }
		public TerminalNode HISTORY() { return getToken(SparkSqlBaseParser.HISTORY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkSqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SparkSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkSqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SparkSqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkSqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SparkSqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SparkSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkSqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SparkSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SparkSqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SparkSqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SparkSqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SparkSqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SparkSqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SparkSqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SparkSqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SparkSqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkSqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SparkSqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(SparkSqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SparkSqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SparkSqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SparkSqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SparkSqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SparkSqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SparkSqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SparkSqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SparkSqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SparkSqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SparkSqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SparkSqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SparkSqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SparkSqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PARQUET() { return getToken(SparkSqlBaseParser.PARQUET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SparkSqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SparkSqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SparkSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SparkSqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SparkSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SparkSqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SparkSqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SparkSqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SparkSqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SparkSqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SparkSqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SparkSqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkSqlBaseParser.REVOKE, 0); }
		public TerminalNode RETAIN() { return getToken(SparkSqlBaseParser.RETAIN, 0); }
		public TerminalNode RLIKE() { return getToken(SparkSqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkSqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SparkSqlBaseParser.ROWS, 0); }
		public TerminalNode RUN() { return getToken(SparkSqlBaseParser.RUN, 0); }
		public TerminalNode SCHEMA() { return getToken(SparkSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SparkSqlBaseParser.SECOND, 0); }
		public TerminalNode SELECT() { return getToken(SparkSqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkSqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SparkSqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SparkSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SparkSqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SparkSqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SparkSqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkSqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkSqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SparkSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SparkSqlBaseParser.SYNC, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkSqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(SparkSqlBaseParser.TIME, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SparkSqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SparkSqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SparkSqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SparkSqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SparkSqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkSqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SparkSqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SparkSqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkSqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SparkSqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SparkSqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SparkSqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public TerminalNode VACUUM() { return getToken(SparkSqlBaseParser.VACUUM, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SparkSqlBaseParser.VIEWS, 0); }
		public TerminalNode WHEN() { return getToken(SparkSqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SparkSqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode YEAR() { return getToken(SparkSqlBaseParser.YEAR, 0); }
		public TerminalNode KILL() { return getToken(SparkSqlBaseParser.KILL, 0); }
		public TerminalNode READ() { return getToken(SparkSqlBaseParser.READ, 0); }
		public TerminalNode JOB() { return getToken(SparkSqlBaseParser.JOB, 0); }
		public TerminalNode ADDJAR() { return getToken(SparkSqlBaseParser.ADDJAR, 0); }
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode FILE() { return getToken(SparkSqlBaseParser.FILE, 0); }
		public TerminalNode ZONE() { return getToken(SparkSqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << CONVERT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASES - 64)) | (1L << (DAY - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DELTA - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DETAIL - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (DRY - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (HOURS - 64)) | (1L << (HISTORY - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (INTERVAL - 128)) | (1L << (INTO - 128)) | (1L << (IS - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (LAST - 128)) | (1L << (LATERAL - 128)) | (1L << (LAZY - 128)) | (1L << (LEADING - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PARQUET - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RANGE - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (RECOVER - 192)) | (1L << (REDUCE - 192)) | (1L << (REFERENCES - 192)) | (1L << (REFRESH - 192)) | (1L << (RENAME - 192)) | (1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESPECT - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RETAIN - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (RUN - 192)) | (1L << (SCHEMA - 192)) | (1L << (SECOND - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYNC - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TIME - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRUNCATE - 256)) | (1L << (TYPE - 256)) | (1L << (UNARCHIVE - 256)) | (1L << (UNBOUNDED - 256)) | (1L << (UNCACHE - 256)) | (1L << (UNIQUE - 256)) | (1L << (UNKNOWN - 256)) | (1L << (UNLOCK - 256)) | (1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (USER - 256)) | (1L << (VALUES - 256)) | (1L << (VACUUM - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (ZONE - 256)) | (1L << (YEAR - 256)) | (1L << (KILL - 256)) | (1L << (READ - 256)) | (1L << (JOB - 256)) | (1L << (ADDJAR - 256)) | (1L << (COMPRESS - 256)) | (1L << (FILE - 256)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 97:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 99:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 100:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 131:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 132:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 134:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enabled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enabled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enabled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0141\u0c59\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\3\2\3\2\7\2\u011b\n\2"+
		"\f\2\16\2\u011e\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t\u0136\n\t\3\t\3\t\3\t\5\t\u013b"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0143\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u014b\n\t\f\t\16\t\u014e\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0161\n\t\3\t\3\t\5\t\u0165\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u016b\n\t\3\t\5\t\u016e\n\t\3\t\5\t\u0171\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0178\n\t\3\t\5\t\u017b\n\t\3\t\3\t\5\t\u017f\n\t\3\t\5"+
		"\t\u0182\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0189\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u0194\n\t\f\t\16\t\u0197\13\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u019e\n\t\3\t\5\t\u01a1\n\t\3\t\3\t\5\t\u01a5\n\t\3\t\5\t\u01a8\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u01ae\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01b9"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u01bf\n\t\3\t\3\t\3\t\5\t\u01c4\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0204\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u020d\n\t\3\t\3\t\5\t\u0211\n\t\3\t\3\t\3\t\3\t\5\t\u0217\n\t\3\t"+
		"\3\t\5\t\u021b\n\t\3\t\3\t\3\t\5\t\u0220\n\t\3\t\3\t\3\t\3\t\5\t\u0226"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0232\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u023a\n\t\3\t\3\t\3\t\3\t\5\t\u0240\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u024d\n\t\3\t\6\t\u0250\n\t\r\t\16"+
		"\t\u0251\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0262"+
		"\n\t\3\t\3\t\3\t\7\t\u0267\n\t\f\t\16\t\u026a\13\t\3\t\5\t\u026d\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0273\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0282\n\t\3\t\3\t\5\t\u0286\n\t\3\t\3\t\3\t\3\t\5\t\u028c"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u0292\n\t\3\t\5\t\u0295\n\t\3\t\5\t\u0298\n\t"+
		"\3\t\3\t\3\t\3\t\5\t\u029e\n\t\3\t\3\t\5\t\u02a2\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u02aa\n\t\f\t\16\t\u02ad\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02b5"+
		"\n\t\3\t\5\t\u02b8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02c1\n\t\3\t\3"+
		"\t\3\t\5\t\u02c6\n\t\3\t\3\t\3\t\3\t\5\t\u02cc\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u02d3\n\t\3\t\5\t\u02d6\n\t\3\t\3\t\3\t\3\t\5\t\u02dc\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u02e5\n\t\f\t\16\t\u02e8\13\t\5\t\u02ea\n\t\3"+
		"\t\3\t\5\t\u02ee\n\t\3\t\3\t\3\t\5\t\u02f3\n\t\3\t\3\t\3\t\5\t\u02f8\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u02ff\n\t\3\t\5\t\u0302\n\t\3\t\5\t\u0305\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u030c\n\t\3\t\3\t\3\t\5\t\u0311\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u031a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0322\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0328\n\t\3\t\5\t\u032b\n\t\3\t\5\t\u032e\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0334\n\t\3\t\3\t\5\t\u0338\n\t\3\t\3\t\5\t\u033c\n"+
		"\t\3\t\3\t\5\t\u0340\n\t\5\t\u0342\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u034a"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0352\n\t\3\t\3\t\3\t\3\t\5\t\u0358\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0364\n\t\3\t\3\t\5\t\u0368"+
		"\n\t\3\t\5\t\u036b\n\t\3\t\3\t\5\t\u036f\n\t\3\t\5\t\u0372\n\t\3\t\3\t"+
		"\5\t\u0376\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0390\n\t\f\t\16\t\u0393"+
		"\13\t\5\t\u0395\n\t\3\t\3\t\5\t\u0399\n\t\3\t\3\t\3\t\3\t\5\t\u039f\n"+
		"\t\3\t\5\t\u03a2\n\t\3\t\5\t\u03a5\n\t\3\t\3\t\3\t\3\t\5\t\u03ab\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u03b3\n\t\3\t\3\t\3\t\5\t\u03b8\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u03be\n\t\3\t\3\t\3\t\3\t\5\t\u03c4\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u03cc\n\t\3\t\3\t\3\t\3\t\7\t\u03d2\n\t\f\t\16\t\u03d5\13\t"+
		"\5\t\u03d7\n\t\3\t\3\t\3\t\7\t\u03dc\n\t\f\t\16\t\u03df\13\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03ed\n\t\f\t\16\t\u03f0\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03fb\n\t\f\t\16\t\u03fe\13"+
		"\t\5\t\u0400\n\t\3\t\3\t\7\t\u0404\n\t\f\t\16\t\u0407\13\t\3\t\3\t\3\t"+
		"\3\t\7\t\u040d\n\t\f\t\16\t\u0410\13\t\3\t\3\t\3\t\3\t\7\t\u0416\n\t\f"+
		"\t\16\t\u0419\13\t\3\t\3\t\3\t\3\t\5\t\u041f\n\t\3\t\3\t\5\t\u0423\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u042e\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u043a\n\t\3\t\5\t\u043d\n\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0443\n\t\3\t\3\t\3\t\3\t\5\t\u0449\n\t\3\t\3\t\3\t\3\t\5\t\u044f\n"+
		"\t\3\t\3\t\5\t\u0453\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u045a\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0462\n\t\3\t\3\t\5\t\u0466\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0472\n\t\3\t\3\t\5\t\u0476\n\t\3\t\3\t\7\t\u047a"+
		"\n\t\f\t\16\t\u047d\13\t\5\t\u047f\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u048b\n\f\3\f\3\f\5\f\u048f\n\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0496\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u050a\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0512\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u051a\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0523\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u052d\n\f\3\r\3\r\5\r\u0531\n\r\3\r\5\r\u0534\n\r\3\r\3\r\3\r\3\r"+
		"\5\r\u053a\n\r\3\r\3\r\3\16\3\16\5\16\u0540\n\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u054c\n\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0558\n\20\3\20\3\20\3\20\5\20\u055d\n"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\5\23\u0566\n\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\5\24\u056e\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0575\n"+
		"\24\5\24\u0577\n\24\3\24\5\24\u057a\n\24\3\24\3\24\3\24\5\24\u057f\n\24"+
		"\3\24\3\24\5\24\u0583\n\24\3\24\3\24\3\24\5\24\u0588\n\24\3\24\5\24\u058b"+
		"\n\24\3\24\3\24\3\24\5\24\u0590\n\24\3\24\3\24\3\24\5\24\u0595\n\24\3"+
		"\24\5\24\u0598\n\24\3\24\3\24\3\24\5\24\u059d\n\24\3\24\3\24\5\24\u05a1"+
		"\n\24\3\24\3\24\3\24\5\24\u05a6\n\24\5\24\u05a8\n\24\3\25\3\25\5\25\u05ac"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u05b3\n\26\f\26\16\26\u05b6\13\26"+
		"\3\26\3\26\3\27\3\27\3\27\5\27\u05bd\n\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u05c6\n\31\3\32\3\32\3\32\7\32\u05cb\n\32\f\32\16\32\u05ce"+
		"\13\32\3\33\3\33\3\33\3\33\7\33\u05d4\n\33\f\33\16\33\u05d7\13\33\3\34"+
		"\3\34\5\34\u05db\n\34\3\34\5\34\u05de\n\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\7\36\u05f6\n\36\f\36\16\36\u05f9\13\36\3\37\3\37\3\37\3"+
		"\37\7\37\u05ff\n\37\f\37\16\37\u0602\13\37\3\37\3\37\3 \3 \5 \u0608\n"+
		" \3 \5 \u060b\n \3!\3!\3!\7!\u0610\n!\f!\16!\u0613\13!\3!\5!\u0616\n!"+
		"\3\"\3\"\3\"\3\"\5\"\u061c\n\"\3#\3#\3#\3#\7#\u0622\n#\f#\16#\u0625\13"+
		"#\3#\3#\3$\3$\3$\3$\7$\u062d\n$\f$\16$\u0630\13$\3$\3$\3%\3%\3%\3%\3%"+
		"\3%\5%\u063a\n%\3&\3&\3&\3&\3&\5&\u0641\n&\3\'\3\'\3\'\3\'\5\'\u0647\n"+
		"\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\6)\u0652\n)\r)\16)\u0653\3)\3)\3)\3)\3)"+
		"\5)\u065b\n)\3)\3)\3)\3)\3)\5)\u0662\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\5)\u066e\n)\3)\3)\3)\3)\7)\u0674\n)\f)\16)\u0677\13)\3)\7)\u067a\n)\f"+
		")\16)\u067d\13)\5)\u067f\n)\3*\3*\3*\3*\3*\7*\u0686\n*\f*\16*\u0689\13"+
		"*\5*\u068b\n*\3*\3*\3*\3*\3*\7*\u0692\n*\f*\16*\u0695\13*\5*\u0697\n*"+
		"\3*\3*\3*\3*\3*\7*\u069e\n*\f*\16*\u06a1\13*\5*\u06a3\n*\3*\3*\3*\3*\3"+
		"*\7*\u06aa\n*\f*\16*\u06ad\13*\5*\u06af\n*\3*\5*\u06b2\n*\3*\3*\3*\5*"+
		"\u06b7\n*\5*\u06b9\n*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u06c5\n,\3,\3,"+
		"\3,\3,\3,\5,\u06cc\n,\3,\3,\3,\3,\3,\5,\u06d3\n,\3,\7,\u06d6\n,\f,\16"+
		",\u06d9\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u06e4\n-\3.\3.\5.\u06e8\n.\3"+
		".\3.\5.\u06ec\n.\3/\3/\6/\u06f0\n/\r/\16/\u06f1\3\60\3\60\5\60\u06f6\n"+
		"\60\3\60\3\60\3\60\3\60\7\60\u06fc\n\60\f\60\16\60\u06ff\13\60\3\60\5"+
		"\60\u0702\n\60\3\60\5\60\u0705\n\60\3\60\5\60\u0708\n\60\3\60\5\60\u070b"+
		"\n\60\3\60\3\60\5\60\u070f\n\60\3\61\3\61\5\61\u0713\n\61\3\61\5\61\u0716"+
		"\n\61\3\61\3\61\5\61\u071a\n\61\3\61\7\61\u071d\n\61\f\61\16\61\u0720"+
		"\13\61\3\61\5\61\u0723\n\61\3\61\5\61\u0726\n\61\3\61\5\61\u0729\n\61"+
		"\3\61\5\61\u072c\n\61\5\61\u072e\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u073a\n\62\3\62\5\62\u073d\n\62\3\62\3\62\5\62"+
		"\u0741\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u074b\n\62\3"+
		"\62\3\62\5\62\u074f\n\62\5\62\u0751\n\62\3\62\5\62\u0754\n\62\3\62\3\62"+
		"\5\62\u0758\n\62\3\63\3\63\7\63\u075c\n\63\f\63\16\63\u075f\13\63\3\63"+
		"\5\63\u0762\n\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u076d"+
		"\n\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u0777\n\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0783\n\67\38\38\38\38\3"+
		"8\38\38\38\38\38\38\78\u0790\n8\f8\168\u0793\138\38\38\58\u0797\n8\39"+
		"\39\39\79\u079c\n9\f9\169\u079f\139\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3"+
		"=\3=\5=\u07ae\n=\3=\7=\u07b1\n=\f=\16=\u07b4\13=\3=\3=\3>\3>\3>\3>\3>"+
		"\3>\7>\u07be\n>\f>\16>\u07c1\13>\3>\3>\5>\u07c5\n>\3?\3?\3?\3?\7?\u07cb"+
		"\n?\f?\16?\u07ce\13?\3?\7?\u07d1\n?\f?\16?\u07d4\13?\3?\5?\u07d7\n?\3"+
		"@\3@\3@\3@\3@\7@\u07de\n@\f@\16@\u07e1\13@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\7@\u07ed\n@\f@\16@\u07f0\13@\3@\3@\5@\u07f4\n@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\7@\u07fe\n@\f@\16@\u0801\13@\3@\3@\5@\u0805\n@\3A\3A\3A\3A\7A\u080b"+
		"\nA\fA\16A\u080e\13A\5A\u0810\nA\3A\3A\5A\u0814\nA\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\7B\u0820\nB\fB\16B\u0823\13B\3B\3B\3B\3C\3C\3C\3C\3C\7C\u082d"+
		"\nC\fC\16C\u0830\13C\3C\3C\5C\u0834\nC\3D\3D\5D\u0838\nD\3D\5D\u083b\n"+
		"D\3E\3E\3E\5E\u0840\nE\3E\3E\3E\3E\3E\7E\u0847\nE\fE\16E\u084a\13E\5E"+
		"\u084c\nE\3E\3E\3E\5E\u0851\nE\3E\3E\3E\7E\u0856\nE\fE\16E\u0859\13E\5"+
		"E\u085b\nE\3F\3F\3G\3G\7G\u0861\nG\fG\16G\u0864\13G\3H\3H\3H\3H\5H\u086a"+
		"\nH\3H\3H\3H\3H\3H\5H\u0871\nH\3I\5I\u0874\nI\3I\3I\3I\5I\u0879\nI\3I"+
		"\5I\u087c\nI\3I\3I\3I\5I\u0881\nI\3I\3I\5I\u0885\nI\3I\5I\u0888\nI\3I"+
		"\5I\u088b\nI\3J\3J\3J\3J\5J\u0891\nJ\3K\3K\3K\5K\u0896\nK\3K\3K\3L\5L"+
		"\u089b\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u08ad\nL"+
		"\5L\u08af\nL\3L\5L\u08b2\nL\3M\3M\3M\3M\3N\3N\3N\7N\u08bb\nN\fN\16N\u08be"+
		"\13N\3O\3O\3O\3O\7O\u08c4\nO\fO\16O\u08c7\13O\3O\3O\3P\3P\5P\u08cd\nP"+
		"\3Q\3Q\3Q\3Q\7Q\u08d3\nQ\fQ\16Q\u08d6\13Q\3Q\3Q\3R\3R\5R\u08dc\nR\3S\3"+
		"S\5S\u08e0\nS\3S\3S\3S\3S\3S\3S\5S\u08e8\nS\3S\3S\3S\3S\3S\3S\5S\u08f0"+
		"\nS\3S\3S\3S\3S\5S\u08f6\nS\3T\3T\3T\3T\7T\u08fc\nT\fT\16T\u08ff\13T\3"+
		"T\3T\3U\3U\3U\3U\3U\7U\u0908\nU\fU\16U\u090b\13U\5U\u090d\nU\3U\3U\3U"+
		"\3V\5V\u0913\nV\3V\3V\5V\u0917\nV\5V\u0919\nV\3W\3W\3W\3W\3W\3W\3W\5W"+
		"\u0922\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u092e\nW\5W\u0930\nW\3W\3W"+
		"\3W\3W\3W\5W\u0937\nW\3W\3W\3W\3W\3W\5W\u093e\nW\3W\3W\3W\3W\5W\u0944"+
		"\nW\3W\3W\3W\3W\5W\u094a\nW\5W\u094c\nW\3X\3X\3X\7X\u0951\nX\fX\16X\u0954"+
		"\13X\3Y\3Y\3Y\7Y\u0959\nY\fY\16Y\u095c\13Y\3Z\3Z\3Z\5Z\u0961\nZ\3Z\3Z"+
		"\3[\3[\3[\5[\u0968\n[\3[\3[\3\\\3\\\5\\\u096e\n\\\3\\\3\\\5\\\u0972\n"+
		"\\\5\\\u0974\n\\\3]\3]\3]\7]\u0979\n]\f]\16]\u097c\13]\3^\3^\3^\3^\7^"+
		"\u0982\n^\f^\16^\u0985\13^\3^\3^\3_\3_\5_\u098b\n_\3`\3`\3`\3`\3`\3`\7"+
		"`\u0993\n`\f`\16`\u0996\13`\3`\3`\5`\u099a\n`\3a\3a\5a\u099e\na\3b\3b"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u09ac\nc\5c\u09ae\nc\3c\3c\3c\3c\3c"+
		"\3c\7c\u09b6\nc\fc\16c\u09b9\13c\3d\5d\u09bc\nd\3d\3d\3d\3d\3d\3d\5d\u09c4"+
		"\nd\3d\3d\3d\3d\3d\7d\u09cb\nd\fd\16d\u09ce\13d\3d\3d\3d\5d\u09d3\nd\3"+
		"d\3d\3d\3d\3d\3d\5d\u09db\nd\3d\3d\3d\5d\u09e0\nd\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\7d\u09ea\nd\fd\16d\u09ed\13d\3d\3d\5d\u09f1\nd\3d\5d\u09f4\nd\3d"+
		"\3d\3d\3d\5d\u09fa\nd\3d\3d\5d\u09fe\nd\3d\3d\3d\5d\u0a03\nd\3d\3d\3d"+
		"\5d\u0a08\nd\3d\3d\3d\5d\u0a0d\nd\3e\3e\3e\3e\5e\u0a13\ne\3e\3e\3e\3e"+
		"\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\7e\u0a28\ne\fe\16e\u0a2b"+
		"\13e\3f\3f\3f\3f\6f\u0a31\nf\rf\16f\u0a32\3f\3f\5f\u0a37\nf\3f\3f\3f\3"+
		"f\3f\6f\u0a3e\nf\rf\16f\u0a3f\3f\3f\5f\u0a44\nf\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\7f\u0a54\nf\ff\16f\u0a57\13f\5f\u0a59\nf\3f\3f\3f"+
		"\3f\3f\3f\5f\u0a61\nf\3f\3f\3f\3f\3f\3f\3f\5f\u0a6a\nf\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\6f\u0a7f\nf\rf\16f\u0a80\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0a8c\nf\3f\3f\3f\7f\u0a91\nf\ff\16f\u0a94"+
		"\13f\5f\u0a96\nf\3f\3f\3f\3f\3f\3f\3f\5f\u0a9f\nf\3f\3f\5f\u0aa3\nf\3"+
		"f\3f\5f\u0aa7\nf\3f\3f\3f\3f\3f\3f\3f\3f\6f\u0ab1\nf\rf\16f\u0ab2\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0acc"+
		"\nf\3f\3f\3f\3f\3f\5f\u0ad3\nf\3f\5f\u0ad6\nf\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\5f\u0ae5\nf\3f\3f\5f\u0ae9\nf\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\7f\u0af3\nf\ff\16f\u0af6\13f\3g\3g\3g\3g\3g\3g\3g\3g\6g\u0b00\ng\rg\16"+
		"g\u0b01\5g\u0b04\ng\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3l\5l\u0b11\nl\3m\3"+
		"m\5m\u0b15\nm\3n\3n\3n\6n\u0b1a\nn\rn\16n\u0b1b\3o\3o\3o\5o\u0b21\no\3"+
		"p\3p\3p\3p\3p\3q\5q\u0b29\nq\3q\3q\5q\u0b2d\nq\3r\3r\3r\5r\u0b32\nr\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0b43\ns\3s\3s\5s\u0b47"+
		"\ns\3s\3s\3s\3s\3s\7s\u0b4e\ns\fs\16s\u0b51\13s\3s\5s\u0b54\ns\5s\u0b56"+
		"\ns\3t\3t\3t\7t\u0b5b\nt\ft\16t\u0b5e\13t\3u\3u\3u\3u\5u\u0b64\nu\3u\5"+
		"u\u0b67\nu\3u\5u\u0b6a\nu\3v\3v\3v\7v\u0b6f\nv\fv\16v\u0b72\13v\3w\3w"+
		"\3w\3w\5w\u0b78\nw\3w\5w\u0b7b\nw\3x\3x\3x\7x\u0b80\nx\fx\16x\u0b83\13"+
		"x\3y\3y\3y\3y\3y\5y\u0b8a\ny\3y\5y\u0b8d\ny\3z\3z\3z\3z\3z\3{\3{\3{\3"+
		"{\7{\u0b98\n{\f{\16{\u0b9b\13{\3|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}"+
		"\3}\3}\7}\u0bac\n}\f}\16}\u0baf\13}\3}\3}\3}\3}\3}\7}\u0bb6\n}\f}\16}"+
		"\u0bb9\13}\5}\u0bbb\n}\3}\3}\3}\3}\3}\7}\u0bc2\n}\f}\16}\u0bc5\13}\5}"+
		"\u0bc7\n}\5}\u0bc9\n}\3}\5}\u0bcc\n}\3}\5}\u0bcf\n}\3~\3~\3~\3~\3~\3~"+
		"\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u0be1\n~\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\5\177\u0bea\n\177\3\u0080\3\u0080\3\u0080\7\u0080\u0bef\n"+
		"\u0080\f\u0080\16\u0080\u0bf2\13\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u0bf8\n\u0081\3\u0082\3\u0082\3\u0082\7\u0082\u0bfd\n\u0082\f"+
		"\u0082\16\u0082\u0c00\13\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\6\u0084\u0c07\n\u0084\r\u0084\16\u0084\u0c08\3\u0084\5\u0084\u0c0c\n"+
		"\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u0c11\n\u0085\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0c19\n\u0086\3\u0087\3\u0087\3"+
		"\u0088\3\u0088\5\u0088\u0c1f\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0c24"+
		"\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0c29\n\u0088\3\u0088\3\u0088"+
		"\5\u0088\u0c2d\n\u0088\3\u0088\3\u0088\5\u0088\u0c31\n\u0088\3\u0088\3"+
		"\u0088\5\u0088\u0c35\n\u0088\3\u0088\3\u0088\5\u0088\u0c39\n\u0088\3\u0088"+
		"\3\u0088\5\u0088\u0c3d\n\u0088\3\u0088\3\u0088\5\u0088\u0c41\n\u0088\3"+
		"\u0088\3\u0088\5\u0088\u0c45\n\u0088\3\u0088\5\u0088\u0c48\n\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0c51\n\u0089"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\13\u0391\u03d3"+
		"\u03dd\u03ee\u03fc\u0405\u040e\u0417\u047b\6V\u00c4\u00c8\u00ca\u008d"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\2\60\4\2DD\u00bf"+
		"\u00bf\4\2\"\"\u00ce\u00ce\4\2BB\u00a0\u00a0\4\2kkzz\3\2-.\4\2\u00f2\u00f2"+
		"\u0112\u0112\4\2\21\21%%\7\2**\67\67]]jj\u0097\u0097\3\2IJ\4\2]]jj\4\2"+
		"\u00a4\u00a4\u0132\u0132\5\2\16\16RR\u00f1\u00f1\4\2\16\16\u0090\u0090"+
		"\4\2\u0093\u0093\u0132\u0132\4\2HH\u00b7\u00b7\5\2AA\u009f\u009f\u00da"+
		"\u00da\6\2XX\u0081\u0081\u00e3\u00e3\u0107\u0107\5\2XX\u00e3\u00e3\u0107"+
		"\u0107\4\2\31\31II\4\2ee\u0088\u0088\4\2\20\20OO\4\2\u0136\u0136\u0138"+
		"\u0138\5\2\20\20\25\25\u00e7\u00e7\5\2``\u0101\u0101\u0109\u0109\4\2\u0128"+
		"\u0129\u012d\u012d\4\2QQ\u012a\u012c\4\2\u0128\u0129\u0130\u0130\4\2<"+
		"<>>\4\2xx\u00cd\u00cd\3\2\u00ef\u00f0\4\2\6\6kk\4\2\6\6gg\5\2\35\35\u008b"+
		"\u008b\u00fc\u00fc\3\2\u0120\u0127\4\2QQ\u0128\u0131\6\2\23\23zz\u00a3"+
		"\u00a3\u00ab\u00ab\4\2``\u0101\u0101\3\2\u0128\u0129\4\2PP\u00b4\u00b4"+
		"\4\2\u00ac\u00ac\u00e8\u00e8\4\2ff\u00bc\u00bc\3\2\u0137\u0138\4\2RR\u00e2"+
		"\u00e2\66\2\16\17\21\22\24\24\26\27\31\32\34\34\36\"%%\'*,,.\64\66\67"+
		":;@BDNPSWWY_bbdfijmorruy{|~\u0080\u0082\u0082\u0085\u0085\u0087\u008a"+
		"\u008d\u0090\u0092\u009b\u009e\u00a0\u00a2\u00a2\u00a5\u00a6\u00a9\u00aa"+
		"\u00ad\u00ad\u00af\u00b0\u00b2\u00bc\u00be\u00c6\u00c8\u00d0\u00d2\u00da"+
		"\u00dd\u00e0\u00e2\u00e6\u00e8\u00f1\u00f3\u00f7\u00fb\u00fb\u00fd\u0106"+
		"\u010a\u010d\u0110\u0113\u0116\u0116\u0118\u0118\u011a\u011f\21\2\24\24"+
		"99XXll}}\u0081\u0081\u0086\u0086\u008c\u008c\u00a1\u00a1\u00a7\u00a7\u00d1"+
		"\u00d1\u00dd\u00dd\u00e3\u00e3\u0107\u0107\u010f\u010f\23\2\16\23\258"+
		":WYkm|~\u0080\u0082\u0085\u0087\u008b\u008d\u0090\u0092\u00a0\u00a2\u00a6"+
		"\u00a8\u00d0\u00d2\u00dc\u00de\u00e2\u00e4\u0106\u0108\u010e\u0110\u011f"+
		"\2\u0e4f\2\u0118\3\2\2\2\4\u0121\3\2\2\2\6\u0124\3\2\2\2\b\u0127\3\2\2"+
		"\2\n\u012a\3\2\2\2\f\u012d\3\2\2\2\16\u0130\3\2\2\2\20\u047e\3\2\2\2\22"+
		"\u0480\3\2\2\2\24\u0482\3\2\2\2\26\u052c\3\2\2\2\30\u052e\3\2\2\2\32\u053f"+
		"\3\2\2\2\34\u0545\3\2\2\2\36\u0551\3\2\2\2 \u055e\3\2\2\2\"\u0561\3\2"+
		"\2\2$\u0565\3\2\2\2&\u05a7\3\2\2\2(\u05a9\3\2\2\2*\u05ad\3\2\2\2,\u05b9"+
		"\3\2\2\2.\u05be\3\2\2\2\60\u05c5\3\2\2\2\62\u05c7\3\2\2\2\64\u05cf\3\2"+
		"\2\2\66\u05d8\3\2\2\28\u05e3\3\2\2\2:\u05f7\3\2\2\2<\u05fa\3\2\2\2>\u0605"+
		"\3\2\2\2@\u0615\3\2\2\2B\u061b\3\2\2\2D\u061d\3\2\2\2F\u0628\3\2\2\2H"+
		"\u0639\3\2\2\2J\u0640\3\2\2\2L\u0642\3\2\2\2N\u0648\3\2\2\2P\u067e\3\2"+
		"\2\2R\u068a\3\2\2\2T\u06ba\3\2\2\2V\u06bd\3\2\2\2X\u06e3\3\2\2\2Z\u06e5"+
		"\3\2\2\2\\\u06ed\3\2\2\2^\u070e\3\2\2\2`\u072d\3\2\2\2b\u0739\3\2\2\2"+
		"d\u0759\3\2\2\2f\u0765\3\2\2\2h\u0768\3\2\2\2j\u0771\3\2\2\2l\u0782\3"+
		"\2\2\2n\u0796\3\2\2\2p\u0798\3\2\2\2r\u07a0\3\2\2\2t\u07a4\3\2\2\2v\u07a7"+
		"\3\2\2\2x\u07aa\3\2\2\2z\u07c4\3\2\2\2|\u07c6\3\2\2\2~\u0804\3\2\2\2\u0080"+
		"\u0813\3\2\2\2\u0082\u0815\3\2\2\2\u0084\u0833\3\2\2\2\u0086\u0835\3\2"+
		"\2\2\u0088\u083c\3\2\2\2\u008a\u085c\3\2\2\2\u008c\u085e\3\2\2\2\u008e"+
		"\u0870\3\2\2\2\u0090\u088a\3\2\2\2\u0092\u0890\3\2\2\2\u0094\u0892\3\2"+
		"\2\2\u0096\u08b1\3\2\2\2\u0098\u08b3\3\2\2\2\u009a\u08b7\3\2\2\2\u009c"+
		"\u08bf\3\2\2\2\u009e\u08ca\3\2\2\2\u00a0\u08ce\3\2\2\2\u00a2\u08d9\3\2"+
		"\2\2\u00a4\u08f5\3\2\2\2\u00a6\u08f7\3\2\2\2\u00a8\u0902\3\2\2\2\u00aa"+
		"\u0918\3\2\2\2\u00ac\u094b\3\2\2\2\u00ae\u094d\3\2\2\2\u00b0\u0955\3\2"+
		"\2\2\u00b2\u0960\3\2\2\2\u00b4\u0967\3\2\2\2\u00b6\u096b\3\2\2\2\u00b8"+
		"\u0975\3\2\2\2\u00ba\u097d\3\2\2\2\u00bc\u098a\3\2\2\2\u00be\u0999\3\2"+
		"\2\2\u00c0\u099d\3\2\2\2\u00c2\u099f\3\2\2\2\u00c4\u09ad\3\2\2\2\u00c6"+
		"\u0a0c\3\2\2\2\u00c8\u0a12\3\2\2\2\u00ca\u0ae8\3\2\2\2\u00cc\u0b03\3\2"+
		"\2\2\u00ce\u0b05\3\2\2\2\u00d0\u0b07\3\2\2\2\u00d2\u0b09\3\2\2\2\u00d4"+
		"\u0b0b\3\2\2\2\u00d6\u0b0d\3\2\2\2\u00d8\u0b12\3\2\2\2\u00da\u0b19\3\2"+
		"\2\2\u00dc\u0b1d\3\2\2\2\u00de\u0b22\3\2\2\2\u00e0\u0b2c\3\2\2\2\u00e2"+
		"\u0b31\3\2\2\2\u00e4\u0b55\3\2\2\2\u00e6\u0b57\3\2\2\2\u00e8\u0b5f\3\2"+
		"\2\2\u00ea\u0b6b\3\2\2\2\u00ec\u0b73\3\2\2\2\u00ee\u0b7c\3\2\2\2\u00f0"+
		"\u0b84\3\2\2\2\u00f2\u0b8e\3\2\2\2\u00f4\u0b93\3\2\2\2\u00f6\u0b9c\3\2"+
		"\2\2\u00f8\u0bce\3\2\2\2\u00fa\u0be0\3\2\2\2\u00fc\u0be9\3\2\2\2\u00fe"+
		"\u0beb\3\2\2\2\u0100\u0bf7\3\2\2\2\u0102\u0bf9\3\2\2\2\u0104\u0c01\3\2"+
		"\2\2\u0106\u0c0b\3\2\2\2\u0108\u0c10\3\2\2\2\u010a\u0c18\3\2\2\2\u010c"+
		"\u0c1a\3\2\2\2\u010e\u0c47\3\2\2\2\u0110\u0c50\3\2\2\2\u0112\u0c52\3\2"+
		"\2\2\u0114\u0c54\3\2\2\2\u0116\u0c56\3\2\2\2\u0118\u011c\5\20\t\2\u0119"+
		"\u011b\7\3\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\7\2\2\3\u0120\3\3\2\2\2\u0121\u0122\5\u00b6\\\2\u0122\u0123\7\2"+
		"\2\3\u0123\5\3\2\2\2\u0124\u0125\5\u00b2Z\2\u0125\u0126\7\2\2\3\u0126"+
		"\7\3\2\2\2\u0127\u0128\5\u00b0Y\2\u0128\u0129\7\2\2\3\u0129\t\3\2\2\2"+
		"\u012a\u012b\5\u00b4[\2\u012b\u012c\7\2\2\3\u012c\13\3\2\2\2\u012d\u012e"+
		"\5\u00e4s\2\u012e\u012f\7\2\2\3\u012f\r\3\2\2\2\u0130\u0131\5\u00eav\2"+
		"\u0131\u0132\7\2\2\3\u0132\17\3\2\2\2\u0133\u047f\5$\23\2\u0134\u0136"+
		"\5\64\33\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u047f\5P)\2\u0138\u013a\7\u010d\2\2\u0139\u013b\7\u009f\2\2\u013a"+
		"\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u047f\5\u00b0"+
		"Y\2\u013d\u013e\78\2\2\u013e\u0142\5.\30\2\u013f\u0140\7w\2\2\u0140\u0141"+
		"\7\u00a3\2\2\u0141\u0143\7Z\2\2\u0142\u013f\3\2\2\2\u0142\u0143\3\2\2"+
		"\2\u0143\u0144\3\2\2\2\u0144\u014c\5\u00b0Y\2\u0145\u014b\5\"\22\2\u0146"+
		"\u014b\5 \21\2\u0147\u0148\7\u0117\2\2\u0148\u0149\t\2\2\2\u0149\u014b"+
		"\5<\37\2\u014a\u0145\3\2\2\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u047f\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\21\2\2\u0150\u0151\5.\30\2\u0151"+
		"\u0152\5\u00b0Y\2\u0152\u0153\7\u00e2\2\2\u0153\u0154\t\2\2\2\u0154\u0155"+
		"\5<\37\2\u0155\u047f\3\2\2\2\u0156\u0157\7\21\2\2\u0157\u0158\5.\30\2"+
		"\u0158\u0159\5\u00b0Y\2\u0159\u015a\7\u00e2\2\2\u015a\u015b\5 \21\2\u015b"+
		"\u047f\3\2\2\2\u015c\u015d\7R\2\2\u015d\u0160\5.\30\2\u015e\u015f\7w\2"+
		"\2\u015f\u0161\7Z\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0164\5\u00b0Y\2\u0163\u0165\t\3\2\2\u0164\u0163\3\2\2"+
		"\2\u0164\u0165\3\2\2\2\u0165\u047f\3\2\2\2\u0166\u0167\7\u00e5\2\2\u0167"+
		"\u016a\t\4\2\2\u0168\u0169\t\5\2\2\u0169\u016b\5\u00b0Y\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0170\3\2\2\2\u016c\u016e\7\u008d\2"+
		"\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171"+
		"\7\u0132\2\2\u0170\u016d\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u047f\3\2\2"+
		"\2\u0172\u0177\5\30\r\2\u0173\u0174\7\4\2\2\u0174\u0175\5\u00eav\2\u0175"+
		"\u0176\7\5\2\2\u0176\u0178\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u017b\58\35\2\u017a\u0179\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0181\5:\36\2\u017d\u017f\7\30"+
		"\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0182\5$\23\2\u0181\u017e\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u047f\3\2"+
		"\2\2\u0183\u0184\78\2\2\u0184\u0188\7\u00f2\2\2\u0185\u0186\7w\2\2\u0186"+
		"\u0187\7\u00a3\2\2\u0187\u0189\7Z\2\2\u0188\u0185\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5\u00b2Z\2\u018b\u018c\7\u008d"+
		"\2\2\u018c\u0195\5\u00b2Z\2\u018d\u0194\58\35\2\u018e\u0194\5\u00acW\2"+
		"\u018f\u0194\5H%\2\u0190\u0194\5 \21\2\u0191\u0192\7\u00f5\2\2\u0192\u0194"+
		"\5<\37\2\u0193\u018d\3\2\2\2\u0193\u018e\3\2\2\2\u0193\u018f\3\2\2\2\u0193"+
		"\u0190\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u047f\3\2\2\2\u0197\u0195\3\2\2\2\u0198"+
		"\u019d\5\32\16\2\u0199\u019a\7\4\2\2\u019a\u019b\5\u00eav\2\u019b\u019c"+
		"\7\5\2\2\u019c\u019e\3\2\2\2\u019d\u0199\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u01a1\58\35\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a7\5:\36\2\u01a3\u01a5\7\30\2\2\u01a4"+
		"\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\5$"+
		"\23\2\u01a7\u01a4\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u047f\3\2\2\2\u01a9"+
		"\u01aa\7\22\2\2\u01aa\u01ab\7\u00f2\2\2\u01ab\u01ad\5\u00b0Y\2\u01ac\u01ae"+
		"\5*\26\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\7\63\2\2\u01b0\u01b8\7\u00eb\2\2\u01b1\u01b9\5\u0108\u0085\2\u01b2"+
		"\u01b3\7g\2\2\u01b3\u01b4\7.\2\2\u01b4\u01b9\5\u009aN\2\u01b5\u01b6\7"+
		"g\2\2\u01b6\u01b7\7\20\2\2\u01b7\u01b9\7.\2\2\u01b8\u01b1\3\2\2\2\u01b8"+
		"\u01b2\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u047f\3\2"+
		"\2\2\u01ba\u01bb\7\22\2\2\u01bb\u01be\7\u00f3\2\2\u01bc\u01bd\t\5\2\2"+
		"\u01bd\u01bf\5\u00b0Y\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\7\63\2\2\u01c1\u01c3\7\u00eb\2\2\u01c2\u01c4"+
		"\5\u0108\u0085\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u047f\3"+
		"\2\2\2\u01c5\u01c6\7\21\2\2\u01c6\u01c7\7\u00f2\2\2\u01c7\u01c8\5\u00b0"+
		"Y\2\u01c8\u01c9\7\16\2\2\u01c9\u01ca\t\6\2\2\u01ca\u01cb\5\u00e6t\2\u01cb"+
		"\u047f\3\2\2\2\u01cc\u01cd\7\21\2\2\u01cd\u01ce\7\u00f2\2\2\u01ce\u01cf"+
		"\5\u00b0Y\2\u01cf\u01d0\7\16\2\2\u01d0\u01d1\t\6\2\2\u01d1\u01d2\7\4\2"+
		"\2\u01d2\u01d3\5\u00e6t\2\u01d3\u01d4\7\5\2\2\u01d4\u047f\3\2\2\2\u01d5"+
		"\u01d6\7\21\2\2\u01d6\u01d7\7\u00f2\2\2\u01d7\u01d8\5\u00b0Y\2\u01d8\u01d9"+
		"\7\u00c9\2\2\u01d9\u01da\7-\2\2\u01da\u01db\5\u00b0Y\2\u01db\u01dc\7\u00fa"+
		"\2\2\u01dc\u01dd\5\u0104\u0083\2\u01dd\u047f\3\2\2\2\u01de\u01df\7\21"+
		"\2\2\u01df\u01e0\7\u00f2\2\2\u01e0\u01e1\5\u00b0Y\2\u01e1\u01e2\7R\2\2"+
		"\u01e2\u01e3\t\6\2\2\u01e3\u01e4\7\4\2\2\u01e4\u01e5\5\u00aeX\2\u01e5"+
		"\u01e6\7\5\2\2\u01e6\u047f\3\2\2\2\u01e7\u01e8\7\21\2\2\u01e8\u01e9\7"+
		"\u00f2\2\2\u01e9\u01ea\5\u00b0Y\2\u01ea\u01eb\7R\2\2\u01eb\u01ec\t\6\2"+
		"\2\u01ec\u01ed\5\u00aeX\2\u01ed\u047f\3\2\2\2\u01ee\u01ef\7\21\2\2\u01ef"+
		"\u01f0\t\7\2\2\u01f0\u01f1\5\u00b0Y\2\u01f1\u01f2\7\u00c9\2\2\u01f2\u01f3"+
		"\7\u00fa\2\2\u01f3\u01f4\5\u00b0Y\2\u01f4\u047f\3\2\2\2\u01f5\u01f6\7"+
		"\21\2\2\u01f6\u01f7\t\7\2\2\u01f7\u01f8\5\u00b0Y\2\u01f8\u01f9\7\u00e2"+
		"\2\2\u01f9\u01fa\7\u00f5\2\2\u01fa\u01fb\5<\37\2\u01fb\u047f\3\2\2\2\u01fc"+
		"\u01fd\7\21\2\2\u01fd\u01fe\t\7\2\2\u01fe\u01ff\5\u00b0Y\2\u01ff\u0200"+
		"\7\u010b\2\2\u0200\u0203\7\u00f5\2\2\u0201\u0202\7w\2\2\u0202\u0204\7"+
		"Z\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\5<\37\2\u0206\u047f\3\2\2\2\u0207\u0208\7\21\2\2\u0208\u0209\7"+
		"\u00f2\2\2\u0209\u020a\5\u00b0Y\2\u020a\u020c\t\b\2\2\u020b\u020d\7-\2"+
		"\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210"+
		"\5\u00b0Y\2\u020f\u0211\5\u0110\u0089\2\u0210\u020f\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u047f\3\2\2\2\u0212\u0213\7\21\2\2\u0213\u0214\7\u00f2"+
		"\2\2\u0214\u0216\5\u00b0Y\2\u0215\u0217\5*\26\2\u0216\u0215\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\7%\2\2\u0219\u021b\7-\2"+
		"\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d"+
		"\5\u00b0Y\2\u021d\u021f\5\u00ecw\2\u021e\u0220\5\u00e2r\2\u021f\u021e"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u047f\3\2\2\2\u0221\u0222\7\21\2\2"+
		"\u0222\u0223\7\u00f2\2\2\u0223\u0225\5\u00b0Y\2\u0224\u0226\5*\26\2\u0225"+
		"\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\7\u00cb"+
		"\2\2\u0228\u0229\7.\2\2\u0229\u022a\7\4\2\2\u022a\u022b\5\u00e6t\2\u022b"+
		"\u022c\7\5\2\2\u022c\u047f\3\2\2\2\u022d\u022e\7\21\2\2\u022e\u022f\7"+
		"\u00f2\2\2\u022f\u0231\5\u00b0Y\2\u0230\u0232\5*\26\2\u0231\u0230\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\7\u00e2\2\2\u0234"+
		"\u0235\7\u00df\2\2\u0235\u0239\7\u0132\2\2\u0236\u0237\7\u0117\2\2\u0237"+
		"\u0238\7\u00e0\2\2\u0238\u023a\5<\37\2\u0239\u0236\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023a\u047f\3\2\2\2\u023b\u023c\7\21\2\2\u023c\u023d\7\u00f2"+
		"\2\2\u023d\u023f\5\u00b0Y\2\u023e\u0240\5*\26\2\u023f\u023e\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\7\u00e2\2\2\u0242\u0243"+
		"\7\u00e0\2\2\u0243\u0244\5<\37\2\u0244\u047f\3\2\2\2\u0245\u0246\7\21"+
		"\2\2\u0246\u0247\t\7\2\2\u0247\u0248\5\u00b0Y\2\u0248\u024c\7\16\2\2\u0249"+
		"\u024a\7w\2\2\u024a\u024b\7\u00a3\2\2\u024b\u024d\7Z\2\2\u024c\u0249\3"+
		"\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u0250\5(\25\2\u024f"+
		"\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u047f\3\2\2\2\u0253\u0254\7\21\2\2\u0254\u0255\7\u00f2\2\2"+
		"\u0255\u0256\5\u00b0Y\2\u0256\u0257\5*\26\2\u0257\u0258\7\u00c9\2\2\u0258"+
		"\u0259\7\u00fa\2\2\u0259\u025a\5*\26\2\u025a\u047f\3\2\2\2\u025b\u025c"+
		"\7\21\2\2\u025c\u025d\t\7\2\2\u025d\u025e\5\u00b0Y\2\u025e\u0261\7R\2"+
		"\2\u025f\u0260\7w\2\2\u0260\u0262\7Z\2\2\u0261\u025f\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0268\5*\26\2\u0264\u0265\7\6\2\2\u0265"+
		"\u0267\5*\26\2\u0266\u0264\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026b"+
		"\u026d\7\u00c0\2\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u047f"+
		"\3\2\2\2\u026e\u026f\7\21\2\2\u026f\u0270\7\u00f2\2\2\u0270\u0272\5\u00b0"+
		"Y\2\u0271\u0273\5*\26\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\7\u00e2\2\2\u0275\u0276\5 \21\2\u0276\u047f"+
		"\3\2\2\2\u0277\u0278\7\21\2\2\u0278\u0279\7\u00f2\2\2\u0279\u027a\5\u00b0"+
		"Y\2\u027a\u027b\7\u00c5\2\2\u027b\u027c\7\u00b6\2\2\u027c\u047f\3\2\2"+
		"\2\u027d\u027e\7R\2\2\u027e\u0281\7\u00f2\2\2\u027f\u0280\7w\2\2\u0280"+
		"\u0282\7Z\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283\u0285\5\u00b0Y\2\u0284\u0286\7\u00c0\2\2\u0285\u0284\3\2\2"+
		"\2\u0285\u0286\3\2\2\2\u0286\u047f\3\2\2\2\u0287\u0288\7R\2\2\u0288\u028b"+
		"\7\u0112\2\2\u0289\u028a\7w\2\2\u028a\u028c\7Z\2\2\u028b\u0289\3\2\2\2"+
		"\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u047f\5\u00b0Y\2\u028e"+
		"\u0291\78\2\2\u028f\u0290\7\u00ab\2\2\u0290\u0292\7\u00cb\2\2\u0291\u028f"+
		"\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0297\3\2\2\2\u0293\u0295\7o\2\2\u0294"+
		"\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\7\u00f6"+
		"\2\2\u0297\u0294\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029d\7\u0112\2\2\u029a\u029b\7w\2\2\u029b\u029c\7\u00a3\2\2\u029c\u029e"+
		"\7Z\2\2\u029d\u029a\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a1\5\u00b0Y\2\u02a0\u02a2\5\u00a0Q\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2"+
		"\3\2\2\2\u02a2\u02ab\3\2\2\2\u02a3\u02aa\5\"\22\2\u02a4\u02a5\7\u00b5"+
		"\2\2\u02a5\u02a6\7\u00a7\2\2\u02a6\u02aa\5\u0098M\2\u02a7\u02a8\7\u00f5"+
		"\2\2\u02a8\u02aa\5<\37\2\u02a9\u02a3\3\2\2\2\u02a9\u02a4\3\2\2\2\u02a9"+
		"\u02a7\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\7\30\2\2\u02af"+
		"\u02b0\5$\23\2\u02b0\u047f\3\2\2\2\u02b1\u02b4\78\2\2\u02b2\u02b3\7\u00ab"+
		"\2\2\u02b3\u02b5\7\u00cb\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b7\3\2\2\2\u02b6\u02b8\7o\2\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7\u00f6\2\2\u02ba\u02bb\7\u0112\2"+
		"\2\u02bb\u02c0\5\u00b2Z\2\u02bc\u02bd\7\4\2\2\u02bd\u02be\5\u00eav\2\u02be"+
		"\u02bf\7\5\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02bc\3\2\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c5\58\35\2\u02c3\u02c4\7\u00aa\2\2\u02c4"+
		"\u02c6\5<\37\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u047f\3\2"+
		"\2\2\u02c7\u02c8\7\21\2\2\u02c8\u02c9\7\u0112\2\2\u02c9\u02cb\5\u00b0"+
		"Y\2\u02ca\u02cc\7\30\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02ce\5$\23\2\u02ce\u047f\3\2\2\2\u02cf\u02d2\78"+
		"\2\2\u02d0\u02d1\7\u00ab\2\2\u02d1\u02d3\7\u00cb\2\2\u02d2\u02d0\3\2\2"+
		"\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d6\7\u00f6\2\2\u02d5"+
		"\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02db\7m"+
		"\2\2\u02d8\u02d9\7w\2\2\u02d9\u02da\7\u00a3\2\2\u02da\u02dc\7Z\2\2\u02db"+
		"\u02d8\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\5\u00b0"+
		"Y\2\u02de\u02df\7\30\2\2\u02df\u02e9\7\u0132\2\2\u02e0\u02e1\7\u010f\2"+
		"\2\u02e1\u02e6\5N(\2\u02e2\u02e3\7\6\2\2\u02e3\u02e5\5N(\2\u02e4\u02e2"+
		"\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02e0\3\2\2\2\u02e9\u02ea\3\2"+
		"\2\2\u02ea\u047f\3\2\2\2\u02eb\u02ed\7R\2\2\u02ec\u02ee\7\u00f6\2\2\u02ed"+
		"\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f2\7m"+
		"\2\2\u02f0\u02f1\7w\2\2\u02f1\u02f3\7Z\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u047f\5\u00b0Y\2\u02f5\u02f7\7[\2\2"+
		"\u02f6\u02f8\t\t\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9"+
		"\3\2\2\2\u02f9\u047f\5\20\t\2\u02fa\u02fb\7\u00e5\2\2\u02fb\u02fe\7\u00f3"+
		"\2\2\u02fc\u02fd\t\5\2\2\u02fd\u02ff\5\u00b0Y\2\u02fe\u02fc\3\2\2\2\u02fe"+
		"\u02ff\3\2\2\2\u02ff\u0304\3\2\2\2\u0300\u0302\7\u008d\2\2\u0301\u0300"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0305\7\u0132\2"+
		"\2\u0304\u0301\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u047f\3\2\2\2\u0306\u0307"+
		"\7\u00e5\2\2\u0307\u0308\7\u00f2\2\2\u0308\u030b\7]\2\2\u0309\u030a\t"+
		"\5\2\2\u030a\u030c\5\u00b0Y\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2"+
		"\u030c\u030d\3\2\2\2\u030d\u030e\7\u008d\2\2\u030e\u0310\7\u0132\2\2\u030f"+
		"\u0311\5*\26\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u047f\3\2"+
		"\2\2\u0312\u0313\7\u00e5\2\2\u0313\u0314\7\u00f5\2\2\u0314\u0319\5\u00b0"+
		"Y\2\u0315\u0316\7\4\2\2\u0316\u0317\5@!\2\u0317\u0318\7\5\2\2\u0318\u031a"+
		"\3\2\2\2\u0319\u0315\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u047f\3\2\2\2\u031b"+
		"\u031c\7\u00e5\2\2\u031c\u031d\7.\2\2\u031d\u031e\t\5\2\2\u031e\u0321"+
		"\5\u00b0Y\2\u031f\u0320\t\5\2\2\u0320\u0322\5\u00b0Y\2\u0321\u031f\3\2"+
		"\2\2\u0321\u0322\3\2\2\2\u0322\u047f\3\2\2\2\u0323\u0324\7\u00e5\2\2\u0324"+
		"\u0327\7\u0113\2\2\u0325\u0326\t\5\2\2\u0326\u0328\5\u00b0Y\2\u0327\u0325"+
		"\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032d\3\2\2\2\u0329\u032b\7\u008d\2"+
		"\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032e"+
		"\7\u0132\2\2\u032d\u032a\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u047f\3\2\2"+
		"\2\u032f\u0330\7\u00e5\2\2\u0330\u0331\7\u00b6\2\2\u0331\u0333\5\u00b0"+
		"Y\2\u0332\u0334\5*\26\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u047f\3\2\2\2\u0335\u0337\7\u00e5\2\2\u0336\u0338\5\u0108\u0085\2\u0337"+
		"\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u0341\7n"+
		"\2\2\u033a\u033c\7\u008d\2\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u033f\3\2\2\2\u033d\u0340\5\u00b0Y\2\u033e\u0340\7\u0132\2\2\u033f\u033d"+
		"\3\2\2\2\u033f\u033e\3\2\2\2\u0340\u0342\3\2\2\2\u0341\u033b\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u047f\3\2\2\2\u0343\u0344\7\u00e5\2\2\u0344\u0345"+
		"\78\2\2\u0345\u0346\7\u00f2\2\2\u0346\u0349\5\u00b0Y\2\u0347\u0348\7\30"+
		"\2\2\u0348\u034a\7\u00df\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u047f\3\2\2\2\u034b\u034c\7\u00e5\2\2\u034c\u034d\7;\2\2\u034d\u047f"+
		"\7\u009f\2\2\u034e\u034f\t\n\2\2\u034f\u0351\7m\2\2\u0350\u0352\7]\2\2"+
		"\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u047f"+
		"\5\60\31\2\u0354\u0355\t\n\2\2\u0355\u0357\5.\30\2\u0356\u0358\7]\2\2"+
		"\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a"+
		"\5\u00b0Y\2\u035a\u047f\3\2\2\2\u035b\u035c\t\n\2\2\u035c\u035d\7K\2\2"+
		"\u035d\u047f\5\u00b0Y\2\u035e\u035f\t\n\2\2\u035f\u0360\7v\2\2\u0360\u0363"+
		"\5\u00b0Y\2\u0361\u0362\7\u008e\2\2\u0362\u0364\7\u0136\2\2\u0363\u0361"+
		"\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u047f\3\2\2\2\u0365\u0367\t\n\2\2\u0366"+
		"\u0368\7\u00f2\2\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a"+
		"\3\2\2\2\u0369\u036b\t\13\2\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2"+
		"\u036b\u036c\3\2\2\2\u036c\u036e\5\u00b0Y\2\u036d\u036f\5*\26\2\u036e"+
		"\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u0372\5\62"+
		"\32\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u047f\3\2\2\2\u0373"+
		"\u0375\t\n\2\2\u0374\u0376\7\u00c1\2\2\u0375\u0374\3\2\2\2\u0375\u0376"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u047f\5$\23\2\u0378\u0379\7/\2\2\u0379"+
		"\u037a\7\u00a7\2\2\u037a\u037b\5.\30\2\u037b\u037c\5\u00b0Y\2\u037c\u037d"+
		"\7\u0084\2\2\u037d\u037e\t\f\2\2\u037e\u047f\3\2\2\2\u037f\u0380\7/\2"+
		"\2\u0380\u0381\7\u00a7\2\2\u0381\u0382\7\u00f2\2\2\u0382\u0383\5\u00b0"+
		"Y\2\u0383\u0384\7\u0084\2\2\u0384\u0385\t\f\2\2\u0385\u047f\3\2\2\2\u0386"+
		"\u0387\7\u00c8\2\2\u0387\u0388\7\u00f2\2\2\u0388\u047f\5\u00b0Y\2\u0389"+
		"\u038a\7\u00c8\2\2\u038a\u038b\7m\2\2\u038b\u047f\5\u00b0Y\2\u038c\u0394"+
		"\7\u00c8\2\2\u038d\u0395\7\u0132\2\2\u038e\u0390\13\2\2\2\u038f\u038e"+
		"\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u0392\3\2\2\2\u0391\u038f\3\2\2\2\u0392"+
		"\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u038d\3\2\2\2\u0394\u0391\3\2"+
		"\2\2\u0395\u047f\3\2\2\2\u0396\u0398\7!\2\2\u0397\u0399\7\u008a\2\2\u0398"+
		"\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\7\u00f2"+
		"\2\2\u039b\u039e\5\u00b0Y\2\u039c\u039d\7\u00aa\2\2\u039d\u039f\5<\37"+
		"\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a4\3\2\2\2\u03a0\u03a2"+
		"\7\30\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2"+
		"\u03a3\u03a5\5$\23\2\u03a4\u03a1\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u047f"+
		"\3\2\2\2\u03a6\u03a7\7\u0106\2\2\u03a7\u03aa\7\u00f2\2\2\u03a8\u03a9\7"+
		"w\2\2\u03a9\u03ab\7Z\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03ac\u047f\5\u00b0Y\2\u03ad\u03ae\7\'\2\2\u03ae\u047f"+
		"\7!\2\2\u03af\u03b0\7\u0092\2\2\u03b0\u03b2\7@\2\2\u03b1\u03b3\7\u0093"+
		"\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b5\7~\2\2\u03b5\u03b7\7\u0132\2\2\u03b6\u03b8\7\u00b3\2\2\u03b7\u03b6"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\7\u0083\2"+
		"\2\u03ba\u03bb\7\u00f2\2\2\u03bb\u03bd\5\u00b0Y\2\u03bc\u03be\5*\26\2"+
		"\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u047f\3\2\2\2\u03bf\u03c0"+
		"\7\u0102\2\2\u03c0\u03c1\7\u00f2\2\2\u03c1\u03c3\5\u00b0Y\2\u03c2\u03c4"+
		"\5*\26\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u047f\3\2\2\2\u03c5"+
		"\u03c6\7\u009e\2\2\u03c6\u03c7\7\u00ca\2\2\u03c7\u03c8\7\u00f2\2\2\u03c8"+
		"\u03cb\5\u00b0Y\2\u03c9\u03ca\t\r\2\2\u03ca\u03cc\7\u00b6\2\2\u03cb\u03c9"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u047f\3\2\2\2\u03cd\u03ce\t\16\2\2"+
		"\u03ce\u03d6\5\u0108\u0085\2\u03cf\u03d7\7\u0132\2\2\u03d0\u03d2\13\2"+
		"\2\2\u03d1\u03d0\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d3"+
		"\u03d1\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03cf\3\2"+
		"\2\2\u03d6\u03d3\3\2\2\2\u03d7\u047f\3\2\2\2\u03d8\u03d9\7\u00e2\2\2\u03d9"+
		"\u03dd\7\u00d3\2\2\u03da\u03dc\13\2\2\2\u03db\u03da\3\2\2\2\u03dc\u03df"+
		"\3\2\2\2\u03dd\u03de\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u047f\3\2\2\2\u03df"+
		"\u03dd\3\2\2\2\u03e0\u03e1\7\u00e2\2\2\u03e1\u03e2\7\u00f9\2\2\u03e2\u03e3"+
		"\7\u0118\2\2\u03e3\u047f\5\u00d6l\2\u03e4\u03e5\7\u00e2\2\2\u03e5\u03e6"+
		"\7\u00f9\2\2\u03e6\u03e7\7\u0118\2\2\u03e7\u047f\t\17\2\2\u03e8\u03e9"+
		"\7\u00e2\2\2\u03e9\u03ea\7\u00f9\2\2\u03ea\u03ee\7\u0118\2\2\u03eb\u03ed"+
		"\13\2\2\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ef\3\2\2\2"+
		"\u03ee\u03ec\3\2\2\2\u03ef\u047f\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2"+
		"\7\u00e2\2\2\u03f2\u03f3\5\22\n\2\u03f3\u03f4\7\u0120\2\2\u03f4\u03f5"+
		"\5\24\13\2\u03f5\u047f\3\2\2\2\u03f6\u03f7\7\u00e2\2\2\u03f7\u03ff\5\22"+
		"\n\2\u03f8\u03fc\7\u0120\2\2\u03f9\u03fb\13\2\2\2\u03fa\u03f9\3\2\2\2"+
		"\u03fb\u03fe\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u0400"+
		"\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u03f8\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"\u047f\3\2\2\2\u0401\u0405\7\u00e2\2\2\u0402\u0404\13\2\2\2\u0403\u0402"+
		"\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0406\3\2\2\2\u0405\u0403\3\2\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0409\7\u0120\2\2\u0409\u047f"+
		"\5\24\13\2\u040a\u040e\7\u00e2\2\2\u040b\u040d\13\2\2\2\u040c\u040b\3"+
		"\2\2\2\u040d\u0410\3\2\2\2\u040e\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f"+
		"\u047f\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0412\7\u00cc\2\2\u0412\u047f"+
		"\5\22\n\2\u0413\u0417\7\u00cc\2\2\u0414\u0416\13\2\2\2\u0415\u0414\3\2"+
		"\2\2\u0416\u0419\3\2\2\2\u0417\u0418\3\2\2\2\u0417\u0415\3\2\2\2\u0418"+
		"\u047f\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041b\7\u009b\2\2\u041b\u041c"+
		"\7\u00f2\2\2\u041c\u041e\5\u00b0Y\2\u041d\u041f\5*\26\2\u041e\u041d\3"+
		"\2\2\2\u041e\u041f\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u0421\7\u00aa\2\2"+
		"\u0421\u0423\5<\37\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u047f"+
		"\3\2\2\2\u0424\u0425\7\u011a\2\2\u0425\u0426\7\u011c\2\2\u0426\u047f\5"+
		"\u0108\u0085\2\u0427\u0428\7\u011d\2\2\u0428\u047f\5\u0108\u0085\2\u0429"+
		"\u042a\7\u011b\2\2\u042a\u042b\7\u00f2\2\2\u042b\u042d\5\u00b0Y\2\u042c"+
		"\u042e\5*\26\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2"+
		"\2\2\u042f\u0430\7\u008e\2\2\u0430\u0431\5\u010e\u0088\2\u0431\u047f\3"+
		"\2\2\2\u0432\u0433\7\u0092\2\2\u0433\u0434\7@\2\2\u0434\u0435\5\u00cc"+
		"g\2\u0435\u0436\7\u00f2\2\2\u0436\u0439\5\u00b0Y\2\u0437\u0438\7\u00aa"+
		"\2\2\u0438\u043a\5<\37\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u047f\3\2\2\2\u043b\u043d\5\64\33\2\u043c\u043b\3\2\2\2\u043c\u043d\3"+
		"\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\7\\\2\2\u043f\u0440\7\u00f2\2\2"+
		"\u0440\u0442\5\u00b0Y\2\u0441\u0443\5*\26\2\u0442\u0441\3\2\2\2\u0442"+
		"\u0443\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\7\u00fa\2\2\u0445\u0448"+
		"\5\u00ccg\2\u0446\u0447\7\u00aa\2\2\u0447\u0449\5<\37\2\u0448\u0446\3"+
		"\2\2\2\u0448\u0449\3\2\2\2\u0449\u047f\3\2\2\2\u044a\u044b\7\u011e\2\2"+
		"\u044b\u044c\7\u00f2\2\2\u044c\u044e\5\u00b0Y\2\u044d\u044f\5*\26\2\u044e"+
		"\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u0451\7\u00aa"+
		"\2\2\u0451\u0453\5<\37\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453"+
		"\u047f\3\2\2\2\u0454\u0455\7\u011e\2\2\u0455\u0456\7\u011f\2\2\u0456\u0459"+
		"\5\u00ccg\2\u0457\u0458\7\u00aa\2\2\u0458\u045a\5<\37\2\u0459\u0457\3"+
		"\2\2\2\u0459\u045a\3\2\2\2\u045a\u047f\3\2\2\2\u045b\u045c\7\u0111\2\2"+
		"\u045c\u0461\5\u00b0Y\2\u045d\u045e\7\u00d0\2\2\u045e\u045f\5\u010e\u0088"+
		"\2\u045f\u0460\7u\2\2\u0460\u0462\3\2\2\2\u0461\u045d\3\2\2\2\u0461\u0462"+
		"\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0464\7S\2\2\u0464\u0466\7\u00d9\2"+
		"\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u047f\3\2\2\2\u0467\u0468"+
		"\7\66\2\2\u0468\u0469\7\u00fa\2\2\u0469\u046a\t\20\2\2\u046a\u0471\5\u00b0"+
		"Y\2\u046b\u046c\7\u00b5\2\2\u046c\u046d\7 \2\2\u046d\u046e\7\4\2\2\u046e"+
		"\u046f\5\u00eav\2\u046f\u0470\7\5\2\2\u0470\u0472\3\2\2\2\u0471\u046b"+
		"\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0474\7\u00aa\2"+
		"\2\u0474\u0476\5<\37\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u047f"+
		"\3\2\2\2\u0477\u047b\5\26\f\2\u0478\u047a\13\2\2\2\u0479\u0478\3\2\2\2"+
		"\u047a\u047d\3\2\2\2\u047b\u047c\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u047f"+
		"\3\2\2\2\u047d\u047b\3\2\2\2\u047e\u0133\3\2\2\2\u047e\u0135\3\2\2\2\u047e"+
		"\u0138\3\2\2\2\u047e\u013d\3\2\2\2\u047e\u014f\3\2\2\2\u047e\u0156\3\2"+
		"\2\2\u047e\u015c\3\2\2\2\u047e\u0166\3\2\2\2\u047e\u0172\3\2\2\2\u047e"+
		"\u0183\3\2\2\2\u047e\u0198\3\2\2\2\u047e\u01a9\3\2\2\2\u047e\u01ba\3\2"+
		"\2\2\u047e\u01c5\3\2\2\2\u047e\u01cc\3\2\2\2\u047e\u01d5\3\2\2\2\u047e"+
		"\u01de\3\2\2\2\u047e\u01e7\3\2\2\2\u047e\u01ee\3\2\2\2\u047e\u01f5\3\2"+
		"\2\2\u047e\u01fc\3\2\2\2\u047e\u0207\3\2\2\2\u047e\u0212\3\2\2\2\u047e"+
		"\u0221\3\2\2\2\u047e\u022d\3\2\2\2\u047e\u023b\3\2\2\2\u047e\u0245\3\2"+
		"\2\2\u047e\u0253\3\2\2\2\u047e\u025b\3\2\2\2\u047e\u026e\3\2\2\2\u047e"+
		"\u0277\3\2\2\2\u047e\u027d\3\2\2\2\u047e\u0287\3\2\2\2\u047e\u028e\3\2"+
		"\2\2\u047e\u02b1\3\2\2\2\u047e\u02c7\3\2\2\2\u047e\u02cf\3\2\2\2\u047e"+
		"\u02eb\3\2\2\2\u047e\u02f5\3\2\2\2\u047e\u02fa\3\2\2\2\u047e\u0306\3\2"+
		"\2\2\u047e\u0312\3\2\2\2\u047e\u031b\3\2\2\2\u047e\u0323\3\2\2\2\u047e"+
		"\u032f\3\2\2\2\u047e\u0335\3\2\2\2\u047e\u0343\3\2\2\2\u047e\u034b\3\2"+
		"\2\2\u047e\u034e\3\2\2\2\u047e\u0354\3\2\2\2\u047e\u035b\3\2\2\2\u047e"+
		"\u035e\3\2\2\2\u047e\u0365\3\2\2\2\u047e\u0373\3\2\2\2\u047e\u0378\3\2"+
		"\2\2\u047e\u037f\3\2\2\2\u047e\u0386\3\2\2\2\u047e\u0389\3\2\2\2\u047e"+
		"\u038c\3\2\2\2\u047e\u0396\3\2\2\2\u047e\u03a6\3\2\2\2\u047e\u03ad\3\2"+
		"\2\2\u047e\u03af\3\2\2\2\u047e\u03bf\3\2\2\2\u047e\u03c5\3\2\2\2\u047e"+
		"\u03cd\3\2\2\2\u047e\u03d8\3\2\2\2\u047e\u03e0\3\2\2\2\u047e\u03e4\3\2"+
		"\2\2\u047e\u03e8\3\2\2\2\u047e\u03f1\3\2\2\2\u047e\u03f6\3\2\2\2\u047e"+
		"\u0401\3\2\2\2\u047e\u040a\3\2\2\2\u047e\u0411\3\2\2\2\u047e\u0413\3\2"+
		"\2\2\u047e\u041a\3\2\2\2\u047e\u0424\3\2\2\2\u047e\u0427\3\2\2\2\u047e"+
		"\u0429\3\2\2\2\u047e\u0432\3\2\2\2\u047e\u043c\3\2\2\2\u047e\u044a\3\2"+
		"\2\2\u047e\u0454\3\2\2\2\u047e\u045b\3\2\2\2\u047e\u0467\3\2\2\2\u047e"+
		"\u0477\3\2\2\2\u047f\21\3\2\2\2\u0480\u0481\5\u010c\u0087\2\u0481\23\3"+
		"\2\2\2\u0482\u0483\5\u010c\u0087\2\u0483\25\3\2\2\2\u0484\u0485\78\2\2"+
		"\u0485\u052d\7\u00d3\2\2\u0486\u0487\7R\2\2\u0487\u052d\7\u00d3\2\2\u0488"+
		"\u048a\7p\2\2\u0489\u048b\7\u00d3\2\2\u048a\u0489\3\2\2\2\u048a\u048b"+
		"\3\2\2\2\u048b\u052d\3\2\2\2\u048c\u048e\7\u00cf\2\2\u048d\u048f\7\u00d3"+
		"\2\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u052d\3\2\2\2\u0490"+
		"\u0491\7\u00e5\2\2\u0491\u052d\7p\2\2\u0492\u0493\7\u00e5\2\2\u0493\u0495"+
		"\7\u00d3\2\2\u0494\u0496\7p\2\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2"+
		"\2\u0496\u052d\3\2\2\2\u0497\u0498\7\u00e5\2\2\u0498\u052d\7\u00be\2\2"+
		"\u0499\u049a\7\u00e5\2\2\u049a\u052d\7\u00d4\2\2\u049b\u049c\7\u00e5\2"+
		"\2\u049c\u049d\7;\2\2\u049d\u052d\7\u00d4\2\2\u049e\u049f\7\\\2\2\u049f"+
		"\u052d\7\u00f2\2\2\u04a0\u04a1\7y\2\2\u04a1\u052d\7\u00f2\2\2\u04a2\u04a3"+
		"\7\u00e5\2\2\u04a3\u052d\7\62\2\2\u04a4\u04a5\7\u00e5\2\2\u04a5\u04a6"+
		"\78\2\2\u04a6\u052d\7\u00f2\2\2\u04a7\u04a8\7\u00e5\2\2\u04a8\u052d\7"+
		"\u00fe\2\2\u04a9\u04aa\7\u00e5\2\2\u04aa\u052d\7|\2\2\u04ab\u04ac\7\u00e5"+
		"\2\2\u04ac\u052d\7\u0096\2\2\u04ad\u04ae\78\2\2\u04ae\u052d\7{\2\2\u04af"+
		"\u04b0\7R\2\2\u04b0\u052d\7{\2\2\u04b1\u04b2\7\21\2\2\u04b2\u052d\7{\2"+
		"\2\u04b3\u04b4\7\u0095\2\2\u04b4\u052d\7\u00f2\2\2\u04b5\u04b6\7\u0095"+
		"\2\2\u04b6\u052d\7A\2\2\u04b7\u04b8\7\u010a\2\2\u04b8\u052d\7\u00f2\2"+
		"\2\u04b9\u04ba\7\u010a\2\2\u04ba\u052d\7A\2\2\u04bb\u04bc\78\2\2\u04bc"+
		"\u04bd\7\u00f6\2\2\u04bd\u052d\7\u0098\2\2\u04be\u04bf\7R\2\2\u04bf\u04c0"+
		"\7\u00f6\2\2\u04c0\u052d\7\u0098\2\2\u04c1\u04c2\7\21\2\2\u04c2\u04c3"+
		"\7\u00f2\2\2\u04c3\u04c4\5\u00b2Z\2\u04c4\u04c5\7\u00a3\2\2\u04c5\u04c6"+
		"\7)\2\2\u04c6\u052d\3\2\2\2\u04c7\u04c8\7\21\2\2\u04c8\u04c9\7\u00f2\2"+
		"\2\u04c9\u04ca\5\u00b2Z\2\u04ca\u04cb\7)\2\2\u04cb\u04cc\7 \2\2\u04cc"+
		"\u052d\3\2\2\2\u04cd\u04ce\7\21\2\2\u04ce\u04cf\7\u00f2\2\2\u04cf\u04d0"+
		"\5\u00b2Z\2\u04d0\u04d1\7\u00a3\2\2\u04d1\u04d2\7\u00e9\2\2\u04d2\u052d"+
		"\3\2\2\2\u04d3\u04d4\7\21\2\2\u04d4\u04d5\7\u00f2\2\2\u04d5\u04d6\5\u00b2"+
		"Z\2\u04d6\u04d7\7\u00e6\2\2\u04d7\u04d8\7 \2\2\u04d8\u052d\3\2\2\2\u04d9"+
		"\u04da\7\21\2\2\u04da\u04db\7\u00f2\2\2\u04db\u04dc\5\u00b2Z\2\u04dc\u04dd"+
		"\7\u00a3\2\2\u04dd\u04de\7\u00e6\2\2\u04de\u052d\3\2\2\2\u04df\u04e0\7"+
		"\21\2\2\u04e0\u04e1\7\u00f2\2\2\u04e1\u04e2\5\u00b2Z\2\u04e2\u04e3\7\u00a3"+
		"\2\2\u04e3\u04e4\7\u00ec\2\2\u04e4\u04e5\7\30\2\2\u04e5\u04e6\7M\2\2\u04e6"+
		"\u052d\3\2\2\2\u04e7\u04e8\7\21\2\2\u04e8\u04e9\7\u00f2\2\2\u04e9\u04ea"+
		"\5\u00b2Z\2\u04ea\u04eb\7\u00e2\2\2\u04eb\u04ec\7\u00e6\2\2\u04ec\u04ed"+
		"\7\u0094\2\2\u04ed\u052d\3\2\2\2\u04ee\u04ef\7\21\2\2\u04ef\u04f0\7\u00f2"+
		"\2\2\u04f0\u04f1\5\u00b2Z\2\u04f1\u04f2\7Y\2\2\u04f2\u04f3\7\u00b4\2\2"+
		"\u04f3\u052d\3\2\2\2\u04f4\u04f5\7\21\2\2\u04f5\u04f6\7\u00f2\2\2\u04f6"+
		"\u04f7\5\u00b2Z\2\u04f7\u04f8\7\26\2\2\u04f8\u04f9\7\u00b4\2\2\u04f9\u052d"+
		"\3\2\2\2\u04fa\u04fb\7\21\2\2\u04fb\u04fc\7\u00f2\2\2\u04fc\u04fd\5\u00b2"+
		"Z\2\u04fd\u04fe\7\u0104\2\2\u04fe\u04ff\7\u00b4\2\2\u04ff\u052d\3\2\2"+
		"\2\u0500\u0501\7\21\2\2\u0501\u0502\7\u00f2\2\2\u0502\u0503\5\u00b2Z\2"+
		"\u0503\u0504\7\u00fb\2\2\u0504\u052d\3\2\2\2\u0505\u0506\7\21\2\2\u0506"+
		"\u0507\7\u00f2\2\2\u0507\u0509\5\u00b2Z\2\u0508\u050a\5*\26\2\u0509\u0508"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\7\61\2\2"+
		"\u050c\u052d\3\2\2\2\u050d\u050e\7\21\2\2\u050e\u050f\7\u00f2\2\2\u050f"+
		"\u0511\5\u00b2Z\2\u0510\u0512\5*\26\2\u0511\u0510\3\2\2\2\u0511\u0512"+
		"\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\7\64\2\2\u0514\u052d\3\2\2\2"+
		"\u0515\u0516\7\21\2\2\u0516\u0517\7\u00f2\2\2\u0517\u0519\5\u00b2Z\2\u0518"+
		"\u051a\5*\26\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2"+
		"\2\2\u051b\u051c\7\u00e2\2\2\u051c\u051d\7d\2\2\u051d\u052d\3\2\2\2\u051e"+
		"\u051f\7\21\2\2\u051f\u0520\7\u00f2\2\2\u0520\u0522\5\u00b2Z\2\u0521\u0523"+
		"\5*\26\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\3\2\2\2\u0524"+
		"\u0525\7\u00cb\2\2\u0525\u0526\7.\2\2\u0526\u052d\3\2\2\2\u0527\u0528"+
		"\7\u00ea\2\2\u0528\u052d\7\u00fd\2\2\u0529\u052d\7\60\2\2\u052a\u052d"+
		"\7\u00d5\2\2\u052b\u052d\7L\2\2\u052c\u0484\3\2\2\2\u052c\u0486\3\2\2"+
		"\2\u052c\u0488\3\2\2\2\u052c\u048c\3\2\2\2\u052c\u0490\3\2\2\2\u052c\u0492"+
		"\3\2\2\2\u052c\u0497\3\2\2\2\u052c\u0499\3\2\2\2\u052c\u049b\3\2\2\2\u052c"+
		"\u049e\3\2\2\2\u052c\u04a0\3\2\2\2\u052c\u04a2\3\2\2\2\u052c\u04a4\3\2"+
		"\2\2\u052c\u04a7\3\2\2\2\u052c\u04a9\3\2\2\2\u052c\u04ab\3\2\2\2\u052c"+
		"\u04ad\3\2\2\2\u052c\u04af\3\2\2\2\u052c\u04b1\3\2\2\2\u052c\u04b3\3\2"+
		"\2\2\u052c\u04b5\3\2\2\2\u052c\u04b7\3\2\2\2\u052c\u04b9\3\2\2\2\u052c"+
		"\u04bb\3\2\2\2\u052c\u04be\3\2\2\2\u052c\u04c1\3\2\2\2\u052c\u04c7\3\2"+
		"\2\2\u052c\u04cd\3\2\2\2\u052c\u04d3\3\2\2\2\u052c\u04d9\3\2\2\2\u052c"+
		"\u04df\3\2\2\2\u052c\u04e7\3\2\2\2\u052c\u04ee\3\2\2\2\u052c\u04f4\3\2"+
		"\2\2\u052c\u04fa\3\2\2\2\u052c\u0500\3\2\2\2\u052c\u0505\3\2\2\2\u052c"+
		"\u050d\3\2\2\2\u052c\u0515\3\2\2\2\u052c\u051e\3\2\2\2\u052c\u0527\3\2"+
		"\2\2\u052c\u0529\3\2\2\2\u052c\u052a\3\2\2\2\u052c\u052b\3\2\2\2\u052d"+
		"\27\3\2\2\2\u052e\u0530\78\2\2\u052f\u0531\7\u00f6\2\2\u0530\u052f\3\2"+
		"\2\2\u0530\u0531\3\2\2\2\u0531\u0533\3\2\2\2\u0532\u0534\7^\2\2\u0533"+
		"\u0532\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0539\7\u00f2"+
		"\2\2\u0536\u0537\7w\2\2\u0537\u0538\7\u00a3\2\2\u0538\u053a\7Z\2\2\u0539"+
		"\u0536\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\5\u00b0"+
		"Y\2\u053c\31\3\2\2\2\u053d\u053e\78\2\2\u053e\u0540\7\u00ab\2\2\u053f"+
		"\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\7\u00cb"+
		"\2\2\u0542\u0543\7\u00f2\2\2\u0543\u0544\5\u00b0Y\2\u0544\33\3\2\2\2\u0545"+
		"\u0546\7)\2\2\u0546\u0547\7 \2\2\u0547\u054b\5\u0098M\2\u0548\u0549\7"+
		"\u00e9\2\2\u0549\u054a\7 \2\2\u054a\u054c\5\u009cO\2\u054b\u0548\3\2\2"+
		"\2\u054b\u054c\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\7\u0083\2\2\u054e"+
		"\u054f\7\u0136\2\2\u054f\u0550\7\37\2\2\u0550\35\3\2\2\2\u0551\u0552\7"+
		"\u00e6\2\2\u0552\u0553\7 \2\2\u0553\u0554\5\u0098M\2\u0554\u0557\7\u00a7"+
		"\2\2\u0555\u0558\5D#\2\u0556\u0558\5F$\2\u0557\u0555\3\2\2\2\u0557\u0556"+
		"\3\2\2\2\u0558\u055c\3\2\2\2\u0559\u055a\7\u00ec\2\2\u055a\u055b\7\30"+
		"\2\2\u055b\u055d\7M\2\2\u055c\u0559\3\2\2\2\u055c\u055d\3\2\2\2\u055d"+
		"\37\3\2\2\2\u055e\u055f\7\u0094\2\2\u055f\u0560\7\u0132\2\2\u0560!\3\2"+
		"\2\2\u0561\u0562\7/\2\2\u0562\u0563\7\u0132\2\2\u0563#\3\2\2\2\u0564\u0566"+
		"\5\64\33\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0567\3\2\2\2"+
		"\u0567\u0568\5V,\2\u0568\u0569\5R*\2\u0569%\3\2\2\2\u056a\u056b\7\u0080"+
		"\2\2\u056b\u056d\7\u00b3\2\2\u056c\u056e\7\u00f2\2\2\u056d\u056c\3\2\2"+
		"\2\u056d\u056e\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0576\5\u00b0Y\2\u0570"+
		"\u0574\5*\26\2\u0571\u0572\7w\2\2\u0572\u0573\7\u00a3\2\2\u0573\u0575"+
		"\7Z\2\2\u0574\u0571\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\3\2\2\2\u0576"+
		"\u0570\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u057a\5\u0098"+
		"M\2\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u05a8\3\2\2\2\u057b"+
		"\u057c\7\u0080\2\2\u057c\u057e\7\u0083\2\2\u057d\u057f\7\u00f2\2\2\u057e"+
		"\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\5\u00b0"+
		"Y\2\u0581\u0583\5*\26\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583"+
		"\u0587\3\2\2\2\u0584\u0585\7w\2\2\u0585\u0586\7\u00a3\2\2\u0586\u0588"+
		"\7Z\2\2\u0587\u0584\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058a\3\2\2\2\u0589"+
		"\u058b\5\u0098M\2\u058a\u0589\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u05a8"+
		"\3\2\2\2\u058c\u058d\7\u0080\2\2\u058d\u058f\7\u00b3\2\2\u058e\u0590\7"+
		"\u0093\2\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2"+
		"\u0591\u0592\7N\2\2\u0592\u0594\7\u0132\2\2\u0593\u0595\5\u00acW\2\u0594"+
		"\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0598\5H"+
		"%\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u05a8\3\2\2\2\u0599"+
		"\u059a\7\u0080\2\2\u059a\u059c\7\u00b3\2\2\u059b\u059d\7\u0093\2\2\u059c"+
		"\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a0\7N"+
		"\2\2\u059f\u05a1\7\u0132\2\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1"+
		"\u05a2\3\2\2\2\u05a2\u05a5\58\35\2\u05a3\u05a4\7\u00aa\2\2\u05a4\u05a6"+
		"\5<\37\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2\2\2\u05a7"+
		"\u056a\3\2\2\2\u05a7\u057b\3\2\2\2\u05a7\u058c\3\2\2\2\u05a7\u0599\3\2"+
		"\2\2\u05a8\'\3\2\2\2\u05a9\u05ab\5*\26\2\u05aa\u05ac\5 \21\2\u05ab\u05aa"+
		"\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac)\3\2\2\2\u05ad\u05ae\7\u00b4\2\2\u05ae"+
		"\u05af\7\4\2\2\u05af\u05b4\5,\27\2\u05b0\u05b1\7\6\2\2\u05b1\u05b3\5,"+
		"\27\2\u05b2\u05b0\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4"+
		"\u05b5\3\2\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05b8\7\5"+
		"\2\2\u05b8+\3\2\2\2\u05b9\u05bc\5\u0108\u0085\2\u05ba\u05bb\7\u0120\2"+
		"\2\u05bb\u05bd\5\u00ccg\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd"+
		"-\3\2\2\2\u05be\u05bf\t\21\2\2\u05bf/\3\2\2\2\u05c0\u05c6\5\u0102\u0082"+
		"\2\u05c1\u05c6\7\u0132\2\2\u05c2\u05c6\5\u00ceh\2\u05c3\u05c6\5\u00d0"+
		"i\2\u05c4\u05c6\5\u00d2j\2\u05c5\u05c0\3\2\2\2\u05c5\u05c1\3\2\2\2\u05c5"+
		"\u05c2\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c4\3\2\2\2\u05c6\61\3\2\2"+
		"\2\u05c7\u05cc\5\u0108\u0085\2\u05c8\u05c9\7\7\2\2\u05c9\u05cb\5\u0108"+
		"\u0085\2\u05ca\u05c8\3\2\2\2\u05cb\u05ce\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc"+
		"\u05cd\3\2\2\2\u05cd\63\3\2\2\2\u05ce\u05cc\3\2\2\2\u05cf\u05d0\7\u0117"+
		"\2\2\u05d0\u05d5\5\66\34\2\u05d1\u05d2\7\6\2\2\u05d2\u05d4\5\66\34\2\u05d3"+
		"\u05d1\3\2\2\2\u05d4\u05d7\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d6\3\2"+
		"\2\2\u05d6\65\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d8\u05da\5\u0104\u0083\2"+
		"\u05d9\u05db\5\u0098M\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db"+
		"\u05dd\3\2\2\2\u05dc\u05de\7\30\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3"+
		"\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\7\4\2\2\u05e0\u05e1\5$\23\2\u05e1"+
		"\u05e2\7\5\2\2\u05e2\67\3\2\2\2\u05e3\u05e4\7\u010f\2\2\u05e4\u05e5\5"+
		"\u00b0Y\2\u05e59\3\2\2\2\u05e6\u05e7\7\u00aa\2\2\u05e7\u05f6\5<\37\2\u05e8"+
		"\u05e9\7\u00b5\2\2\u05e9\u05ea\7 \2\2\u05ea\u05f6\5\u00ba^\2\u05eb\u05f6"+
		"\5\36\20\2\u05ec\u05f6\5\34\17\2\u05ed\u05f6\5\u00acW\2\u05ee\u05f6\5"+
		"H%\2\u05ef\u05f6\5 \21\2\u05f0\u05f6\5\"\22\2\u05f1\u05f2\7\u0091\2\2"+
		"\u05f2\u05f6\7\u0136\2\2\u05f3\u05f4\7\u00f5\2\2\u05f4\u05f6\5<\37\2\u05f5"+
		"\u05e6\3\2\2\2\u05f5\u05e8\3\2\2\2\u05f5\u05eb\3\2\2\2\u05f5\u05ec\3\2"+
		"\2\2\u05f5\u05ed\3\2\2\2\u05f5\u05ee\3\2\2\2\u05f5\u05ef\3\2\2\2\u05f5"+
		"\u05f0\3\2\2\2\u05f5\u05f1\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f9\3\2"+
		"\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8;\3\2\2\2\u05f9\u05f7"+
		"\3\2\2\2\u05fa\u05fb\7\4\2\2\u05fb\u0600\5> \2\u05fc\u05fd\7\6\2\2\u05fd"+
		"\u05ff\5> \2\u05fe\u05fc\3\2\2\2\u05ff\u0602\3\2\2\2\u0600\u05fe\3\2\2"+
		"\2\u0600\u0601\3\2\2\2\u0601\u0603\3\2\2\2\u0602\u0600\3\2\2\2\u0603\u0604"+
		"\7\5\2\2\u0604=\3\2\2\2\u0605\u060a\5@!\2\u0606\u0608\7\u0120\2\2\u0607"+
		"\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060b\5B"+
		"\"\2\u060a\u0607\3\2\2\2\u060a\u060b\3\2\2\2\u060b?\3\2\2\2\u060c\u0611"+
		"\5\u0108\u0085\2\u060d\u060e\7\7\2\2\u060e\u0610\5\u0108\u0085\2\u060f"+
		"\u060d\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2"+
		"\2\2\u0612\u0616\3\2\2\2\u0613\u0611\3\2\2\2\u0614\u0616\7\u0132\2\2\u0615"+
		"\u060c\3\2\2\2\u0615\u0614\3\2\2\2\u0616A\3\2\2\2\u0617\u061c\7\u0136"+
		"\2\2\u0618\u061c\7\u0138\2\2\u0619\u061c\5\u00d4k\2\u061a\u061c\7\u0132"+
		"\2\2\u061b\u0617\3\2\2\2\u061b\u0618\3\2\2\2\u061b\u0619\3\2\2\2\u061b"+
		"\u061a\3\2\2\2\u061cC\3\2\2\2\u061d\u061e\7\4\2\2\u061e\u0623\5\u00cc"+
		"g\2\u061f\u0620\7\6\2\2\u0620\u0622\5\u00ccg\2\u0621\u061f\3\2\2\2\u0622"+
		"\u0625\3\2\2\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626\3\2"+
		"\2\2\u0625\u0623\3\2\2\2\u0626\u0627\7\5\2\2\u0627E\3\2\2\2\u0628\u0629"+
		"\7\4\2\2\u0629\u062e\5D#\2\u062a\u062b\7\6\2\2\u062b\u062d\5D#\2\u062c"+
		"\u062a\3\2\2\2\u062d\u0630\3\2\2\2\u062e\u062c\3\2\2\2\u062e\u062f\3\2"+
		"\2\2\u062f\u0631\3\2\2\2\u0630\u062e\3\2\2\2\u0631\u0632\7\5\2\2\u0632"+
		"G\3\2\2\2\u0633\u0634\7\u00ec\2\2\u0634\u0635\7\30\2\2\u0635\u063a\5J"+
		"&\2\u0636\u0637\7\u00ec\2\2\u0637\u0638\7 \2\2\u0638\u063a\5L\'\2\u0639"+
		"\u0633\3\2\2\2\u0639\u0636\3\2\2\2\u063aI\3\2\2\2\u063b\u063c\7\177\2"+
		"\2\u063c\u063d\7\u0132\2\2\u063d\u063e\7\u00af\2\2\u063e\u0641\7\u0132"+
		"\2\2\u063f\u0641\5\u0108\u0085\2\u0640\u063b\3\2\2\2\u0640\u063f\3\2\2"+
		"\2\u0641K\3\2\2\2\u0642\u0646\7\u0132\2\2\u0643\u0644\7\u0117\2\2\u0644"+
		"\u0645\7\u00e0\2\2\u0645\u0647\5<\37\2\u0646\u0643\3\2\2\2\u0646\u0647"+
		"\3\2\2\2\u0647M\3\2\2\2\u0648\u0649\5\u0108\u0085\2\u0649\u064a\7\u0132"+
		"\2\2\u064aO\3\2\2\2\u064b\u064c\5&\24\2\u064c\u064d\5V,\2\u064d\u064e"+
		"\5R*\2\u064e\u067f\3\2\2\2\u064f\u0651\5|?\2\u0650\u0652\5T+\2\u0651\u0650"+
		"\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654"+
		"\u067f\3\2\2\2\u0655\u0656\7F\2\2\u0656\u0657\7k\2\2\u0657\u0658\5\u00b0"+
		"Y\2\u0658\u065a\5\u00aaV\2\u0659\u065b\5t;\2\u065a\u0659\3\2\2\2\u065a"+
		"\u065b\3\2\2\2\u065b\u067f\3\2\2\2\u065c\u065d\7\u010c\2\2\u065d\u065e"+
		"\5\u00b0Y\2\u065e\u065f\5\u00aaV\2\u065f\u0661\5f\64\2\u0660\u0662\5t"+
		";\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u067f\3\2\2\2\u0663"+
		"\u0664\7\u009b\2\2\u0664\u0665\7\u0083\2\2\u0665\u0666\5\u00b0Y\2\u0666"+
		"\u0667\5\u00aaV\2\u0667\u066d\7\u010f\2\2\u0668\u066e\5\u00b0Y\2\u0669"+
		"\u066a\7\4\2\2\u066a\u066b\5$\23\2\u066b\u066c\7\5\2\2\u066c\u066e\3\2"+
		"\2\2\u066d\u0668\3\2\2\2\u066d\u0669\3\2\2\2\u066e\u066f\3\2\2\2\u066f"+
		"\u0670\5\u00aaV\2\u0670\u0671\7\u00a7\2\2\u0671\u0675\5\u00c4c\2\u0672"+
		"\u0674\5h\65\2\u0673\u0672\3\2\2\2\u0674\u0677\3\2\2\2\u0675\u0673\3\2"+
		"\2\2\u0675\u0676\3\2\2\2\u0676\u067b\3\2\2\2\u0677\u0675\3\2\2\2\u0678"+
		"\u067a\5j\66\2\u0679\u0678\3\2\2\2\u067a\u067d\3\2\2\2\u067b\u0679\3\2"+
		"\2\2\u067b\u067c\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067e"+
		"\u064b\3\2\2\2\u067e\u064f\3\2\2\2\u067e\u0655\3\2\2\2\u067e\u065c\3\2"+
		"\2\2\u067e\u0663\3\2\2\2\u067fQ\3\2\2\2\u0680\u0681\7\u00ac\2\2\u0681"+
		"\u0682\7 \2\2\u0682\u0687\5Z.\2\u0683\u0684\7\6\2\2\u0684\u0686\5Z.\2"+
		"\u0685\u0683\3\2\2\2\u0686\u0689\3\2\2\2\u0687\u0685\3\2\2\2\u0687\u0688"+
		"\3\2\2\2\u0688\u068b\3\2\2\2\u0689\u0687\3\2\2\2\u068a\u0680\3\2\2\2\u068a"+
		"\u068b\3\2\2\2\u068b\u0696\3\2\2\2\u068c\u068d\7(\2\2\u068d\u068e\7 \2"+
		"\2\u068e\u0693\5\u00c2b\2\u068f\u0690\7\6\2\2\u0690\u0692\5\u00c2b\2\u0691"+
		"\u068f\3\2\2\2\u0692\u0695\3\2\2\2\u0693\u0691\3\2\2\2\u0693\u0694\3\2"+
		"\2\2\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0696\u068c\3\2\2\2\u0696"+
		"\u0697\3\2\2\2\u0697\u06a2\3\2\2\2\u0698\u0699\7P\2\2\u0699\u069a\7 \2"+
		"\2\u069a\u069f\5\u00c2b\2\u069b\u069c\7\6\2\2\u069c\u069e\5\u00c2b\2\u069d"+
		"\u069b\3\2\2\2\u069e\u06a1\3\2\2\2\u069f\u069d\3\2\2\2\u069f\u06a0\3\2"+
		"\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f\3\2\2\2\u06a2\u0698\3\2\2\2\u06a2"+
		"\u06a3\3\2\2\2\u06a3\u06ae\3\2\2\2\u06a4\u06a5\7\u00e8\2\2\u06a5\u06a6"+
		"\7 \2\2\u06a6\u06ab\5Z.\2\u06a7\u06a8\7\6\2\2\u06a8\u06aa\5Z.\2\u06a9"+
		"\u06a7\3\2\2\2\u06aa\u06ad\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ab\u06ac\3\2"+
		"\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ae\u06a4\3\2\2\2\u06ae"+
		"\u06af\3\2\2\2\u06af\u06b1\3\2\2\2\u06b0\u06b2\5\u00f4{\2\u06b1\u06b0"+
		"\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b8\3\2\2\2\u06b3\u06b6\7\u008e\2"+
		"\2\u06b4\u06b7\7\20\2\2\u06b5\u06b7\5\u00c2b\2\u06b6\u06b4\3\2\2\2\u06b6"+
		"\u06b5\3\2\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b3\3\2\2\2\u06b8\u06b9\3\2"+
		"\2\2\u06b9S\3\2\2\2\u06ba\u06bb\5&\24\2\u06bb\u06bc\5^\60\2\u06bcU\3\2"+
		"\2\2\u06bd\u06be\b,\1\2\u06be\u06bf\5X-\2\u06bf\u06d7\3\2\2\2\u06c0\u06c1"+
		"\f\5\2\2\u06c1\u06c2\6,\3\2\u06c2\u06c4\t\22\2\2\u06c3\u06c5\5\u008aF"+
		"\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06d6"+
		"\5V,\6\u06c7\u06c8\f\4\2\2\u06c8\u06c9\6,\5\2\u06c9\u06cb\7\u0081\2\2"+
		"\u06ca\u06cc\5\u008aF\2\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc"+
		"\u06cd\3\2\2\2\u06cd\u06d6\5V,\5\u06ce\u06cf\f\3\2\2\u06cf\u06d0\6,\7"+
		"\2\u06d0\u06d2\t\23\2\2\u06d1\u06d3\5\u008aF\2\u06d2\u06d1\3\2\2\2\u06d2"+
		"\u06d3\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d6\5V,\4\u06d5\u06c0\3\2\2"+
		"\2\u06d5\u06c7\3\2\2\2\u06d5\u06ce\3\2\2\2\u06d6\u06d9\3\2\2\2\u06d7\u06d5"+
		"\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8W\3\2\2\2\u06d9\u06d7\3\2\2\2\u06da"+
		"\u06e4\5`\61\2\u06db\u06e4\5\\/\2\u06dc\u06dd\7\u00f2\2\2\u06dd\u06e4"+
		"\5\u00b0Y\2\u06de\u06e4\5\u00a6T\2\u06df\u06e0\7\4\2\2\u06e0\u06e1\5$"+
		"\23\2\u06e1\u06e2\7\5\2\2\u06e2\u06e4\3\2\2\2\u06e3\u06da\3\2\2\2\u06e3"+
		"\u06db\3\2\2\2\u06e3\u06dc\3\2\2\2\u06e3\u06de\3\2\2\2\u06e3\u06df\3\2"+
		"\2\2\u06e4Y\3\2\2\2\u06e5\u06e7\5\u00c2b\2\u06e6\u06e8\t\24\2\2\u06e7"+
		"\u06e6\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06eb\3\2\2\2\u06e9\u06ea\7\u00a5"+
		"\2\2\u06ea\u06ec\t\25\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec"+
		"[\3\2\2\2\u06ed\u06ef\5|?\2\u06ee\u06f0\5^\60\2\u06ef\u06ee\3\2\2\2\u06f0"+
		"\u06f1\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2]\3\2\2\2"+
		"\u06f3\u06f5\5b\62\2\u06f4\u06f6\5t;\2\u06f5\u06f4\3\2\2\2\u06f5\u06f6"+
		"\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\5R*\2\u06f8\u070f\3\2\2\2\u06f9"+
		"\u06fd\5d\63\2\u06fa\u06fc\5\u0088E\2\u06fb\u06fa\3\2\2\2\u06fc\u06ff"+
		"\3\2\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0701\3\2\2\2\u06ff"+
		"\u06fd\3\2\2\2\u0700\u0702\5t;\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2"+
		"\2\u0702\u0704\3\2\2\2\u0703\u0705\5~@\2\u0704\u0703\3\2\2\2\u0704\u0705"+
		"\3\2\2\2\u0705\u0707\3\2\2\2\u0706\u0708\5v<\2\u0707\u0706\3\2\2\2\u0707"+
		"\u0708\3\2\2\2\u0708\u070a\3\2\2\2\u0709\u070b\5\u00f4{\2\u070a\u0709"+
		"\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\5R*\2\u070d"+
		"\u070f\3\2\2\2\u070e\u06f3\3\2\2\2\u070e\u06f9\3\2\2\2\u070f_\3\2\2\2"+
		"\u0710\u0712\5b\62\2\u0711\u0713\5|?\2\u0712\u0711\3\2\2\2\u0712\u0713"+
		"\3\2\2\2\u0713\u0715\3\2\2\2\u0714\u0716\5t;\2\u0715\u0714\3\2\2\2\u0715"+
		"\u0716\3\2\2\2\u0716\u072e\3\2\2\2\u0717\u0719\5d\63\2\u0718\u071a\5|"+
		"?\2\u0719\u0718\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071e\3\2\2\2\u071b"+
		"\u071d\5\u0088E\2\u071c\u071b\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c"+
		"\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0722\3\2\2\2\u0720\u071e\3\2\2\2\u0721"+
		"\u0723\5t;\2\u0722\u0721\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0725\3\2\2"+
		"\2\u0724\u0726\5~@\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0728"+
		"\3\2\2\2\u0727\u0729\5v<\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729"+
		"\u072b\3\2\2\2\u072a\u072c\5\u00f4{\2\u072b\u072a\3\2\2\2\u072b\u072c"+
		"\3\2\2\2\u072c\u072e\3\2\2\2\u072d\u0710\3\2\2\2\u072d\u0717\3\2\2\2\u072e"+
		"a\3\2\2\2\u072f\u0730\7\u00dc\2\2\u0730\u0731\7\u00ff\2\2\u0731\u0732"+
		"\7\4\2\2\u0732\u0733\5\u00b8]\2\u0733\u0734\7\5\2\2\u0734\u073a\3\2\2"+
		"\2\u0735\u0736\7\u0099\2\2\u0736\u073a\5\u00b8]\2\u0737\u0738\7\u00c6"+
		"\2\2\u0738\u073a\5\u00b8]\2\u0739\u072f\3\2\2\2\u0739\u0735\3\2\2\2\u0739"+
		"\u0737\3\2\2\2\u073a\u073c\3\2\2\2\u073b\u073d\5\u00acW\2\u073c\u073b"+
		"\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u0740\3\2\2\2\u073e\u073f\7\u00c4\2"+
		"\2\u073f\u0741\7\u0132\2\2\u0740\u073e\3\2\2\2\u0740\u0741\3\2\2\2\u0741"+
		"\u0742\3\2\2\2\u0742\u0743\7\u010f\2\2\u0743\u0750\7\u0132\2\2\u0744\u074e"+
		"\7\30\2\2\u0745\u074f\5\u009aN\2\u0746\u074f\5\u00eav\2\u0747\u074a\7"+
		"\4\2\2\u0748\u074b\5\u009aN\2\u0749\u074b\5\u00eav\2\u074a\u0748\3\2\2"+
		"\2\u074a\u0749\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u074d\7\5\2\2\u074d\u074f"+
		"\3\2\2\2\u074e\u0745\3\2\2\2\u074e\u0746\3\2\2\2\u074e\u0747\3\2\2\2\u074f"+
		"\u0751\3\2\2\2\u0750\u0744\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0753\3\2"+
		"\2\2\u0752\u0754\5\u00acW\2\u0753\u0752\3\2\2\2\u0753\u0754\3\2\2\2\u0754"+
		"\u0757\3\2\2\2\u0755\u0756\7\u00c3\2\2\u0756\u0758\7\u0132\2\2\u0757\u0755"+
		"\3\2\2\2\u0757\u0758\3\2\2\2\u0758c\3\2\2\2\u0759\u075d\7\u00dc\2\2\u075a"+
		"\u075c\5x=\2\u075b\u075a\3\2\2\2\u075c\u075f\3\2\2\2\u075d\u075b\3\2\2"+
		"\2\u075d\u075e\3\2\2\2\u075e\u0761\3\2\2\2\u075f\u075d\3\2\2\2\u0760\u0762"+
		"\5\u008aF\2\u0761\u0760\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0763\3\2\2"+
		"\2\u0763\u0764\5\u00b8]\2\u0764e\3\2\2\2\u0765\u0766\7\u00e2\2\2\u0766"+
		"\u0767\5p9\2\u0767g\3\2\2\2\u0768\u0769\7\u0114\2\2\u0769\u076c\7\u009a"+
		"\2\2\u076a\u076b\7\23\2\2\u076b\u076d\5\u00c4c\2\u076c\u076a\3\2\2\2\u076c"+
		"\u076d\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u076f\7\u00f8\2\2\u076f\u0770"+
		"\5l\67\2\u0770i\3\2\2\2\u0771\u0772\7\u0114\2\2\u0772\u0773\7\u00a3\2"+
		"\2\u0773\u0776\7\u009a\2\2\u0774\u0775\7\23\2\2\u0775\u0777\5\u00c4c\2"+
		"\u0776\u0774\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0779"+
		"\7\u00f8\2\2\u0779\u077a\5n8\2\u077ak\3\2\2\2\u077b\u0783\7F\2\2\u077c"+
		"\u077d\7\u010c\2\2\u077d\u077e\7\u00e2\2\2\u077e\u0783\7\u012a\2\2\u077f"+
		"\u0780\7\u010c\2\2\u0780\u0781\7\u00e2\2\2\u0781\u0783\5p9\2\u0782\u077b"+
		"\3\2\2\2\u0782\u077c\3\2\2\2\u0782\u077f\3\2\2\2\u0783m\3\2\2\2\u0784"+
		"\u0785\7\u0080\2\2\u0785\u0797\7\u012a\2\2\u0786\u0787\7\u0080\2\2\u0787"+
		"\u0788\7\4\2\2\u0788\u0789\5\u00aeX\2\u0789\u078a\7\5\2\2\u078a\u078b"+
		"\7\u0110\2\2\u078b\u078c\7\4\2\2\u078c\u0791\5\u00c2b\2\u078d\u078e\7"+
		"\6\2\2\u078e\u0790\5\u00c2b\2\u078f\u078d\3\2\2\2\u0790\u0793\3\2\2\2"+
		"\u0791\u078f\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0794\3\2\2\2\u0793\u0791"+
		"\3\2\2\2\u0794\u0795\7\5\2\2\u0795\u0797\3\2\2\2\u0796\u0784\3\2\2\2\u0796"+
		"\u0786\3\2\2\2\u0797o\3\2\2\2\u0798\u079d\5r:\2\u0799\u079a\7\6\2\2\u079a"+
		"\u079c\5r:\2\u079b\u0799\3\2\2\2\u079c\u079f\3\2\2\2\u079d\u079b\3\2\2"+
		"\2\u079d\u079e\3\2\2\2\u079eq\3\2\2\2\u079f\u079d\3\2\2\2\u07a0\u07a1"+
		"\5\u00b0Y\2\u07a1\u07a2\7\u0120\2\2\u07a2\u07a3\5\u00c2b\2\u07a3s\3\2"+
		"\2\2\u07a4\u07a5\7\u0115\2\2\u07a5\u07a6\5\u00c4c\2\u07a6u\3\2\2\2\u07a7"+
		"\u07a8\7s\2\2\u07a8\u07a9\5\u00c4c\2\u07a9w\3\2\2\2\u07aa\u07ab\7\b\2"+
		"\2\u07ab\u07b2\5z>\2\u07ac\u07ae\7\6\2\2\u07ad\u07ac\3\2\2\2\u07ad\u07ae"+
		"\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b1\5z>\2\u07b0\u07ad\3\2\2\2\u07b1"+
		"\u07b4\3\2\2\2\u07b2\u07b0\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b5\3\2"+
		"\2\2\u07b4\u07b2\3\2\2\2\u07b5\u07b6\7\t\2\2\u07b6y\3\2\2\2\u07b7\u07c5"+
		"\5\u0108\u0085\2\u07b8\u07b9\5\u0108\u0085\2\u07b9\u07ba\7\4\2\2\u07ba"+
		"\u07bf\5\u00caf\2\u07bb\u07bc\7\6\2\2\u07bc\u07be\5\u00caf\2\u07bd\u07bb"+
		"\3\2\2\2\u07be\u07c1\3\2\2\2\u07bf\u07bd\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0"+
		"\u07c2\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c2\u07c3\7\5\2\2\u07c3\u07c5\3\2"+
		"\2\2\u07c4\u07b7\3\2\2\2\u07c4\u07b8\3\2\2\2\u07c5{\3\2\2\2\u07c6\u07c7"+
		"\7k\2\2\u07c7\u07cc\5\u008cG\2\u07c8\u07c9\7\6\2\2\u07c9\u07cb\5\u008c"+
		"G\2\u07ca\u07c8\3\2\2\2\u07cb\u07ce\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cc"+
		"\u07cd\3\2\2\2\u07cd\u07d2\3\2\2\2\u07ce\u07cc\3\2\2\2\u07cf\u07d1\5\u0088"+
		"E\2\u07d0\u07cf\3\2\2\2\u07d1\u07d4\3\2\2\2\u07d2\u07d0\3\2\2\2\u07d2"+
		"\u07d3\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d5\u07d7\5\u0082"+
		"B\2\u07d6\u07d5\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7}\3\2\2\2\u07d8\u07d9"+
		"\7q\2\2\u07d9\u07da\7 \2\2\u07da\u07df\5\u00c2b\2\u07db\u07dc\7\6\2\2"+
		"\u07dc\u07de\5\u00c2b\2\u07dd\u07db\3\2\2\2\u07de\u07e1\3\2\2\2\u07df"+
		"\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07f3\3\2\2\2\u07e1\u07df\3\2"+
		"\2\2\u07e2\u07e3\7\u0117\2\2\u07e3\u07f4\7\u00d6\2\2\u07e4\u07e5\7\u0117"+
		"\2\2\u07e5\u07f4\7:\2\2\u07e6\u07e7\7r\2\2\u07e7\u07e8\7\u00e4\2\2\u07e8"+
		"\u07e9\7\4\2\2\u07e9\u07ee\5\u0080A\2\u07ea\u07eb\7\6\2\2\u07eb\u07ed"+
		"\5\u0080A\2\u07ec\u07ea\3\2\2\2\u07ed\u07f0\3\2\2\2\u07ee\u07ec\3\2\2"+
		"\2\u07ee\u07ef\3\2\2\2\u07ef\u07f1\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f1\u07f2"+
		"\7\5\2\2\u07f2\u07f4\3\2\2\2\u07f3\u07e2\3\2\2\2\u07f3\u07e4\3\2\2\2\u07f3"+
		"\u07e6\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u0805\3\2\2\2\u07f5\u07f6\7q"+
		"\2\2\u07f6\u07f7\7 \2\2\u07f7\u07f8\7r\2\2\u07f8\u07f9\7\u00e4\2\2\u07f9"+
		"\u07fa\7\4\2\2\u07fa\u07ff\5\u0080A\2\u07fb\u07fc\7\6\2\2\u07fc\u07fe"+
		"\5\u0080A\2\u07fd\u07fb\3\2\2\2\u07fe\u0801\3\2\2\2\u07ff\u07fd\3\2\2"+
		"\2\u07ff\u0800\3\2\2\2\u0800\u0802\3\2\2\2\u0801\u07ff\3\2\2\2\u0802\u0803"+
		"\7\5\2\2\u0803\u0805\3\2\2\2\u0804\u07d8\3\2\2\2\u0804\u07f5\3\2\2\2\u0805"+
		"\177\3\2\2\2\u0806\u080f\7\4\2\2\u0807\u080c\5\u00c2b\2\u0808\u0809\7"+
		"\6\2\2\u0809\u080b\5\u00c2b\2\u080a\u0808\3\2\2\2\u080b\u080e\3\2\2\2"+
		"\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u0810\3\2\2\2\u080e\u080c"+
		"\3\2\2\2\u080f\u0807\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0811\3\2\2\2\u0811"+
		"\u0814\7\5\2\2\u0812\u0814\5\u00c2b\2\u0813\u0806\3\2\2\2\u0813\u0812"+
		"\3\2\2\2\u0814\u0081\3\2\2\2\u0815\u0816\7\u00b9\2\2\u0816\u0817\7\4\2"+
		"\2\u0817\u0818\5\u00b8]\2\u0818\u0819\7g\2\2\u0819\u081a\5\u0084C\2\u081a"+
		"\u081b\7z\2\2\u081b\u081c\7\4\2\2\u081c\u0821\5\u0086D\2\u081d\u081e\7"+
		"\6\2\2\u081e\u0820\5\u0086D\2\u081f\u081d\3\2\2\2\u0820\u0823\3\2\2\2"+
		"\u0821\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0824\3\2\2\2\u0823\u0821"+
		"\3\2\2\2\u0824\u0825\7\5\2\2\u0825\u0826\7\5\2\2\u0826\u0083\3\2\2\2\u0827"+
		"\u0834\5\u0108\u0085\2\u0828\u0829\7\4\2\2\u0829\u082e\5\u0108\u0085\2"+
		"\u082a\u082b\7\6\2\2\u082b\u082d\5\u0108\u0085\2\u082c\u082a\3\2\2\2\u082d"+
		"\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0831\3\2"+
		"\2\2\u0830\u082e\3\2\2\2\u0831\u0832\7\5\2\2\u0832\u0834\3\2\2\2\u0833"+
		"\u0827\3\2\2\2\u0833\u0828\3\2\2\2\u0834\u0085\3\2\2\2\u0835\u083a\5\u00c2"+
		"b\2\u0836\u0838\7\30\2\2\u0837\u0836\3\2\2\2\u0837\u0838\3\2\2\2\u0838"+
		"\u0839\3\2\2\2\u0839\u083b\5\u0108\u0085\2\u083a\u0837\3\2\2\2\u083a\u083b"+
		"\3\2\2\2\u083b\u0087\3\2\2\2\u083c\u083d\7\u0089\2\2\u083d\u083f\7\u0112"+
		"\2\2\u083e\u0840\7\u00ae\2\2\u083f\u083e\3\2\2\2\u083f\u0840\3\2\2\2\u0840"+
		"\u0841\3\2\2\2\u0841\u0842\5\u0102\u0082\2\u0842\u084b\7\4\2\2\u0843\u0848"+
		"\5\u00c2b\2\u0844\u0845\7\6\2\2\u0845\u0847\5\u00c2b\2\u0846\u0844\3\2"+
		"\2\2\u0847\u084a\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0849\3\2\2\2\u0849"+
		"\u084c\3\2\2\2\u084a\u0848\3\2\2\2\u084b\u0843\3\2\2\2\u084b\u084c";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\7\5\2\2\u084e\u085a\5\u0108\u0085"+
		"\2\u084f\u0851\7\30\2\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2\2\u0851"+
		"\u0852\3\2\2\2\u0852\u0857\5\u0108\u0085\2\u0853\u0854\7\6\2\2\u0854\u0856"+
		"\5\u0108\u0085\2\u0855\u0853\3\2\2\2\u0856\u0859\3\2\2\2\u0857\u0855\3"+
		"\2\2\2\u0857\u0858\3\2\2\2\u0858\u085b\3\2\2\2\u0859\u0857\3\2\2\2\u085a"+
		"\u0850\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u0089\3\2\2\2\u085c\u085d\t\26"+
		"\2\2\u085d\u008b\3\2\2\2\u085e\u0862\5\u00a4S\2\u085f\u0861\5\u008eH\2"+
		"\u0860\u085f\3\2\2\2\u0861\u0864\3\2\2\2\u0862\u0860\3\2\2\2\u0862\u0863"+
		"\3\2\2\2\u0863\u008d\3\2\2\2\u0864\u0862\3\2\2\2\u0865\u0866\5\u0090I"+
		"\2\u0866\u0867\7\u0086\2\2\u0867\u0869\5\u00a4S\2\u0868\u086a\5\u0092"+
		"J\2\u0869\u0868\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u0871\3\2\2\2\u086b"+
		"\u086c\7\u00a1\2\2\u086c\u086d\5\u0090I\2\u086d\u086e\7\u0086\2\2\u086e"+
		"\u086f\5\u00a4S\2\u086f\u0871\3\2\2\2\u0870\u0865\3\2\2\2\u0870\u086b"+
		"\3\2\2\2\u0871\u008f\3\2\2\2\u0872\u0874\7}\2\2\u0873\u0872\3\2\2\2\u0873"+
		"\u0874\3\2\2\2\u0874\u088b\3\2\2\2\u0875\u088b\79\2\2\u0876\u0878\7\u008c"+
		"\2\2\u0877\u0879\7\u00ae\2\2\u0878\u0877\3\2\2\2\u0878\u0879\3\2\2\2\u0879"+
		"\u088b\3\2\2\2\u087a\u087c\7\u008c\2\2\u087b\u087a\3\2\2\2\u087b\u087c"+
		"\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u088b\7\u00dd\2\2\u087e\u0880\7\u00d1"+
		"\2\2\u087f\u0881\7\u00ae\2\2\u0880\u087f\3\2\2\2\u0880\u0881\3\2\2\2\u0881"+
		"\u088b\3\2\2\2\u0882\u0884\7l\2\2\u0883\u0885\7\u00ae\2\2\u0884\u0883"+
		"\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u088b\3\2\2\2\u0886\u0888\7\u008c\2"+
		"\2\u0887\u0886\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088b"+
		"\7\24\2\2\u088a\u0873\3\2\2\2\u088a\u0875\3\2\2\2\u088a\u0876\3\2\2\2"+
		"\u088a\u087b\3\2\2\2\u088a\u087e\3\2\2\2\u088a\u0882\3\2\2\2\u088a\u0887"+
		"\3\2\2\2\u088b\u0091\3\2\2\2\u088c\u088d\7\u00a7\2\2\u088d\u0891\5\u00c4"+
		"c\2\u088e\u088f\7\u010f\2\2\u088f\u0891\5\u0098M\2\u0890\u088c\3\2\2\2"+
		"\u0890\u088e\3\2\2\2\u0891\u0093\3\2\2\2\u0892\u0893\7\u00f4\2\2\u0893"+
		"\u0895\7\4\2\2\u0894\u0896\5\u0096L\2\u0895\u0894\3\2\2\2\u0895\u0896"+
		"\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0898\7\5\2\2\u0898\u0095\3\2\2\2\u0899"+
		"\u089b\7\u0129\2\2\u089a\u0899\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u089c"+
		"\3\2\2\2\u089c\u089d\t\27\2\2\u089d\u08b2\7\u00b8\2\2\u089e\u089f\5\u00c2"+
		"b\2\u089f\u08a0\7\u00d8\2\2\u08a0\u08b2\3\2\2\2\u08a1\u08a2\7\36\2\2\u08a2"+
		"\u08a3\7\u0136\2\2\u08a3\u08a4\7\u00ad\2\2\u08a4\u08a5\7\u00a6\2\2\u08a5"+
		"\u08ae\7\u0136\2\2\u08a6\u08ac\7\u00a7\2\2\u08a7\u08ad\5\u0108\u0085\2"+
		"\u08a8\u08a9\5\u0102\u0082\2\u08a9\u08aa\7\4\2\2\u08aa\u08ab\7\5\2\2\u08ab"+
		"\u08ad\3\2\2\2\u08ac\u08a7\3\2\2\2\u08ac\u08a8\3\2\2\2\u08ad\u08af\3\2"+
		"\2\2\u08ae\u08a6\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b2\3\2\2\2\u08b0"+
		"\u08b2\5\u00c2b\2\u08b1\u089a\3\2\2\2\u08b1\u089e\3\2\2\2\u08b1\u08a1"+
		"\3\2\2\2\u08b1\u08b0\3\2\2\2\u08b2\u0097\3\2\2\2\u08b3\u08b4\7\4\2\2\u08b4"+
		"\u08b5\5\u009aN\2\u08b5\u08b6\7\5\2\2\u08b6\u0099\3\2\2\2\u08b7\u08bc"+
		"\5\u0104\u0083\2\u08b8\u08b9\7\6\2\2\u08b9\u08bb\5\u0104\u0083\2\u08ba"+
		"\u08b8\3\2\2\2\u08bb\u08be\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bc\u08bd\3\2"+
		"\2\2\u08bd\u009b\3\2\2\2\u08be\u08bc\3\2\2\2\u08bf\u08c0\7\4\2\2\u08c0"+
		"\u08c5\5\u009eP\2\u08c1\u08c2\7\6\2\2\u08c2\u08c4\5\u009eP\2\u08c3\u08c1"+
		"\3\2\2\2\u08c4\u08c7\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6"+
		"\u08c8\3\2\2\2\u08c7\u08c5\3\2\2\2\u08c8\u08c9\7\5\2\2\u08c9\u009d\3\2"+
		"\2\2\u08ca\u08cc\5\u0104\u0083\2\u08cb\u08cd\t\24\2\2\u08cc\u08cb\3\2"+
		"\2\2\u08cc\u08cd\3\2\2\2\u08cd\u009f\3\2\2\2\u08ce\u08cf\7\4\2\2\u08cf"+
		"\u08d4\5\u00a2R\2\u08d0\u08d1\7\6\2\2\u08d1\u08d3\5\u00a2R\2\u08d2\u08d0"+
		"\3\2\2\2\u08d3\u08d6\3\2\2\2\u08d4\u08d2\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5"+
		"\u08d7\3\2\2\2\u08d6\u08d4\3\2\2\2\u08d7\u08d8\7\5\2\2\u08d8\u00a1\3\2"+
		"\2\2\u08d9\u08db\5\u0108\u0085\2\u08da\u08dc\5\"\22\2\u08db\u08da\3\2"+
		"\2\2\u08db\u08dc\3\2\2\2\u08dc\u00a3\3\2\2\2\u08dd\u08df\5\u00b0Y\2\u08de"+
		"\u08e0\5\u0094K\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1"+
		"\3\2\2\2\u08e1\u08e2\5\u00aaV\2\u08e2\u08f6\3\2\2\2\u08e3\u08e4\7\4\2"+
		"\2\u08e4\u08e5\5$\23\2\u08e5\u08e7\7\5\2\2\u08e6\u08e8\5\u0094K\2\u08e7"+
		"\u08e6\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9\u08ea\5\u00aa"+
		"V\2\u08ea\u08f6\3\2\2\2\u08eb\u08ec\7\4\2\2\u08ec\u08ed\5\u008cG\2\u08ed"+
		"\u08ef\7\5\2\2\u08ee\u08f0\5\u0094K\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0"+
		"\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f2\5\u00aaV\2\u08f2\u08f6\3\2\2"+
		"\2\u08f3\u08f6\5\u00a6T\2\u08f4\u08f6\5\u00a8U\2\u08f5\u08dd\3\2\2\2\u08f5"+
		"\u08e3\3\2\2\2\u08f5\u08eb\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f5\u08f4\3\2"+
		"\2\2\u08f6\u00a5\3\2\2\2\u08f7\u08f8\7\u0110\2\2\u08f8\u08fd\5\u00c2b"+
		"\2\u08f9\u08fa\7\6\2\2\u08fa\u08fc\5\u00c2b\2\u08fb\u08f9\3\2\2\2\u08fc"+
		"\u08ff\3\2\2\2\u08fd\u08fb\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0900\3\2"+
		"\2\2\u08ff\u08fd\3\2\2\2\u0900\u0901\5\u00aaV\2\u0901\u00a7\3\2\2\2\u0902"+
		"\u0903\5\u0100\u0081\2\u0903\u090c\7\4\2\2\u0904\u0909\5\u00c2b\2\u0905"+
		"\u0906\7\6\2\2\u0906\u0908\5\u00c2b\2\u0907\u0905\3\2\2\2\u0908\u090b"+
		"\3\2\2\2\u0909\u0907\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090d\3\2\2\2\u090b"+
		"\u0909\3\2\2\2\u090c\u0904\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2"+
		"\2\2\u090e\u090f\7\5\2\2\u090f\u0910\5\u00aaV\2\u0910\u00a9\3\2\2\2\u0911"+
		"\u0913\7\30\2\2\u0912\u0911\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0914\3"+
		"\2\2\2\u0914\u0916\5\u010a\u0086\2\u0915\u0917\5\u0098M\2\u0916\u0915"+
		"\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0919\3\2\2\2\u0918\u0912\3\2\2\2\u0918"+
		"\u0919\3\2\2\2\u0919\u00ab\3\2\2\2\u091a\u091b\7\u00d7\2\2\u091b\u091c"+
		"\7i\2\2\u091c\u091d\7\u00df\2\2\u091d\u0921\7\u0132\2\2\u091e\u091f\7"+
		"\u0117\2\2\u091f\u0920\7\u00e0\2\2\u0920\u0922\5<\37\2\u0921\u091e\3\2"+
		"\2\2\u0921\u0922\3\2\2\2\u0922\u094c\3\2\2\2\u0923\u0924\7\u00d7\2\2\u0924"+
		"\u0925\7i\2\2\u0925\u092f\7G\2\2\u0926\u0927\7b\2\2\u0927\u0928\7\u00f7"+
		"\2\2\u0928\u0929\7 \2\2\u0929\u092d\7\u0132\2\2\u092a\u092b\7W\2\2\u092b"+
		"\u092c\7 \2\2\u092c\u092e\7\u0132\2\2\u092d\u092a\3\2\2\2\u092d\u092e"+
		"\3\2\2\2\u092e\u0930\3\2\2\2\u092f\u0926\3\2\2\2\u092f\u0930\3\2\2\2\u0930"+
		"\u0936\3\2\2\2\u0931\u0932\7,\2\2\u0932\u0933\7\u0085\2\2\u0933\u0934"+
		"\7\u00f7\2\2\u0934\u0935\7 \2\2\u0935\u0937\7\u0132\2\2\u0936\u0931\3"+
		"\2\2\2\u0936\u0937\3\2\2\2\u0937\u093d\3\2\2\2\u0938\u0939\7\u0099\2\2"+
		"\u0939\u093a\7\u0087\2\2\u093a\u093b\7\u00f7\2\2\u093b\u093c\7 \2\2\u093c"+
		"\u093e\7\u0132\2\2\u093d\u0938\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u0943"+
		"\3\2\2\2\u093f\u0940\7\u008f\2\2\u0940\u0941\7\u00f7\2\2\u0941\u0942\7"+
		" \2\2\u0942\u0944\7\u0132\2\2\u0943\u093f\3\2\2\2\u0943\u0944\3\2\2\2"+
		"\u0944\u0949\3\2\2\2\u0945\u0946\7\u00a4\2\2\u0946\u0947\7E\2\2\u0947"+
		"\u0948\7\30\2\2\u0948\u094a\7\u0132\2\2\u0949\u0945\3\2\2\2\u0949\u094a"+
		"\3\2\2\2\u094a\u094c\3\2\2\2\u094b\u091a\3\2\2\2\u094b\u0923\3\2\2\2\u094c"+
		"\u00ad\3\2\2\2\u094d\u0952\5\u00b0Y\2\u094e\u094f\7\6\2\2\u094f\u0951"+
		"\5\u00b0Y\2\u0950\u094e\3\2\2\2\u0951\u0954\3\2\2\2\u0952\u0950\3\2\2"+
		"\2\u0952\u0953\3\2\2\2\u0953\u00af\3\2\2\2\u0954\u0952\3\2\2\2\u0955\u095a"+
		"\5\u0104\u0083\2\u0956\u0957\7\7\2\2\u0957\u0959\5\u0104\u0083\2\u0958"+
		"\u0956\3\2\2\2\u0959\u095c\3\2\2\2\u095a\u0958\3\2\2\2\u095a\u095b\3\2"+
		"\2\2\u095b\u00b1\3\2\2\2\u095c\u095a\3\2\2\2\u095d\u095e\5\u0104\u0083"+
		"\2\u095e\u095f\7\7\2\2\u095f\u0961\3\2\2\2\u0960\u095d\3\2\2\2\u0960\u0961"+
		"\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0963\5\u0104\u0083\2\u0963\u00b3\3"+
		"\2\2\2\u0964\u0965\5\u0104\u0083\2\u0965\u0966\7\7\2\2\u0966\u0968\3\2"+
		"\2\2\u0967\u0964\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\3\2\2\2\u0969"+
		"\u096a\5\u0104\u0083\2\u096a\u00b5\3\2\2\2\u096b\u0973\5\u00c2b\2\u096c"+
		"\u096e\7\30\2\2\u096d\u096c\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u0971\3"+
		"\2\2\2\u096f\u0972\5\u0104\u0083\2\u0970\u0972\5\u0098M\2\u0971\u096f"+
		"\3\2\2\2\u0971\u0970\3\2\2\2\u0972\u0974\3\2\2\2\u0973\u096d\3\2\2\2\u0973"+
		"\u0974\3\2\2\2\u0974\u00b7\3\2\2\2\u0975\u097a\5\u00b6\\\2\u0976\u0977"+
		"\7\6\2\2\u0977\u0979\5\u00b6\\\2\u0978\u0976\3\2\2\2\u0979\u097c\3\2\2"+
		"\2\u097a\u0978\3\2\2\2\u097a\u097b\3\2\2\2\u097b\u00b9\3\2\2\2\u097c\u097a"+
		"\3\2\2\2\u097d\u097e\7\4\2\2\u097e\u0983\5\u00bc_\2\u097f\u0980\7\6\2"+
		"\2\u0980\u0982\5\u00bc_\2\u0981\u097f\3\2\2\2\u0982\u0985\3\2\2\2\u0983"+
		"\u0981\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0986\3\2\2\2\u0985\u0983\3\2"+
		"\2\2\u0986\u0987\7\5\2\2\u0987\u00bb\3\2\2\2\u0988\u098b\5\u00be`\2\u0989"+
		"\u098b\5\u00ecw\2\u098a\u0988\3\2\2\2\u098a\u0989\3\2\2\2\u098b\u00bd"+
		"\3\2\2\2\u098c\u099a\5\u0102\u0082\2\u098d\u098e\5\u0108\u0085\2\u098e"+
		"\u098f\7\4\2\2\u098f\u0994\5\u00c0a\2\u0990\u0991\7\6\2\2\u0991\u0993"+
		"\5\u00c0a\2\u0992\u0990\3\2\2\2\u0993\u0996\3\2\2\2\u0994\u0992\3\2\2"+
		"\2\u0994\u0995\3\2\2\2\u0995\u0997\3\2\2\2\u0996\u0994\3\2\2\2\u0997\u0998"+
		"\7\5\2\2\u0998\u099a\3\2\2\2\u0999\u098c\3\2\2\2\u0999\u098d\3\2\2\2\u099a"+
		"\u00bf\3\2\2\2\u099b\u099e\5\u0102\u0082\2\u099c\u099e\5\u00ccg\2\u099d"+
		"\u099b\3\2\2\2\u099d\u099c\3\2\2\2\u099e\u00c1\3\2\2\2\u099f\u09a0\5\u00c4"+
		"c\2\u09a0\u00c3\3\2\2\2\u09a1\u09a2\bc\1\2\u09a2\u09a3\7\u00a3\2\2\u09a3"+
		"\u09ae\5\u00c4c\7\u09a4\u09a5\7Z\2\2\u09a5\u09a6\7\4\2\2\u09a6\u09a7\5"+
		"$\23\2\u09a7\u09a8\7\5\2\2\u09a8\u09ae\3\2\2\2\u09a9\u09ab\5\u00c8e\2"+
		"\u09aa\u09ac\5\u00c6d\2\u09ab\u09aa\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac"+
		"\u09ae\3\2\2\2\u09ad\u09a1\3\2\2\2\u09ad\u09a4\3\2\2\2\u09ad\u09a9\3\2"+
		"\2\2\u09ae\u09b7\3\2\2\2\u09af\u09b0\f\4\2\2\u09b0\u09b1\7\23\2\2\u09b1"+
		"\u09b6\5\u00c4c\5\u09b2\u09b3\f\3\2\2\u09b3\u09b4\7\u00ab\2\2\u09b4\u09b6"+
		"\5\u00c4c\4\u09b5\u09af\3\2\2\2\u09b5\u09b2\3\2\2\2\u09b6\u09b9\3\2\2"+
		"\2\u09b7\u09b5\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8\u00c5\3\2\2\2\u09b9\u09b7"+
		"\3\2\2\2\u09ba\u09bc\7\u00a3\2\2\u09bb\u09ba\3\2\2\2\u09bb\u09bc\3\2\2"+
		"\2\u09bc\u09bd\3\2\2\2\u09bd\u09be\7\34\2\2\u09be\u09bf\5\u00c8e\2\u09bf"+
		"\u09c0\7\23\2\2\u09c0\u09c1\5\u00c8e\2\u09c1\u0a0d\3\2\2\2\u09c2\u09c4"+
		"\7\u00a3\2\2\u09c3\u09c2\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\3\2\2"+
		"\2\u09c5\u09c6\7z\2\2\u09c6\u09c7\7\4\2\2\u09c7\u09cc\5\u00c2b\2\u09c8"+
		"\u09c9\7\6\2\2\u09c9\u09cb\5\u00c2b\2\u09ca\u09c8\3\2\2\2\u09cb\u09ce"+
		"\3\2\2\2\u09cc\u09ca\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09cf\3\2\2\2\u09ce"+
		"\u09cc\3\2\2\2\u09cf\u09d0\7\5\2\2\u09d0\u0a0d\3\2\2\2\u09d1\u09d3\7\u00a3"+
		"\2\2\u09d2\u09d1\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4"+
		"\u09d5\7z\2\2\u09d5\u09d6\7\4\2\2\u09d6\u09d7\5$\23\2\u09d7\u09d8\7\5"+
		"\2\2\u09d8\u0a0d\3\2\2\2\u09d9\u09db\7\u00a3\2\2\u09da\u09d9\3\2\2\2\u09da"+
		"\u09db\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u09dd\7\u00d2\2\2\u09dd\u0a0d"+
		"\5\u00c8e\2\u09de\u09e0\7\u00a3\2\2\u09df\u09de\3\2\2\2\u09df\u09e0\3"+
		"\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e2\7\u008d\2\2\u09e2\u09f0\t\30\2"+
		"\2\u09e3\u09e4\7\4\2\2\u09e4\u09f1\7\5\2\2\u09e5\u09e6\7\4\2\2\u09e6\u09eb"+
		"\5\u00c2b\2\u09e7\u09e8\7\6\2\2\u09e8\u09ea\5\u00c2b\2\u09e9\u09e7\3\2"+
		"\2\2\u09ea\u09ed\3\2\2\2\u09eb\u09e9\3\2\2\2\u09eb\u09ec\3\2\2\2\u09ec"+
		"\u09ee\3\2\2\2\u09ed\u09eb\3\2\2\2\u09ee\u09ef\7\5\2\2\u09ef\u09f1\3\2"+
		"\2\2\u09f0\u09e3\3\2\2\2\u09f0\u09e5\3\2\2\2\u09f1\u0a0d\3\2\2\2\u09f2"+
		"\u09f4\7\u00a3\2\2\u09f3\u09f2\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f5"+
		"\3\2\2\2\u09f5\u09f6\7\u008d\2\2\u09f6\u09f9\5\u00c8e\2\u09f7\u09f8\7"+
		"V\2\2\u09f8\u09fa\7\u0132\2\2\u09f9\u09f7\3\2\2\2\u09f9\u09fa\3\2\2\2"+
		"\u09fa\u0a0d\3\2\2\2\u09fb\u09fd\7\u0084\2\2\u09fc\u09fe\7\u00a3\2\2\u09fd"+
		"\u09fc\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a0d\7\u00a4"+
		"\2\2\u0a00\u0a02\7\u0084\2\2\u0a01\u0a03\7\u00a3\2\2\u0a02\u0a01\3\2\2"+
		"\2\u0a02\u0a03\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a0d\t\31\2\2\u0a05"+
		"\u0a07\7\u0084\2\2\u0a06\u0a08\7\u00a3\2\2\u0a07\u0a06\3\2\2\2\u0a07\u0a08"+
		"\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09\u0a0a\7O\2\2\u0a0a\u0a0b\7k\2\2\u0a0b"+
		"\u0a0d\5\u00c8e\2\u0a0c\u09bb\3\2\2\2\u0a0c\u09c3\3\2\2\2\u0a0c\u09d2"+
		"\3\2\2\2\u0a0c\u09da\3\2\2\2\u0a0c\u09df\3\2\2\2\u0a0c\u09f3\3\2\2\2\u0a0c"+
		"\u09fb\3\2\2\2\u0a0c\u0a00\3\2\2\2\u0a0c\u0a05\3\2\2\2\u0a0d\u00c7\3\2"+
		"\2\2\u0a0e\u0a0f\be\1\2\u0a0f\u0a13\5\u00caf\2\u0a10\u0a11\t\32\2\2\u0a11"+
		"\u0a13\5\u00c8e\t\u0a12\u0a0e\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a13\u0a29"+
		"\3\2\2\2\u0a14\u0a15\f\b\2\2\u0a15\u0a16\t\33\2\2\u0a16\u0a28\5\u00c8"+
		"e\t\u0a17\u0a18\f\7\2\2\u0a18\u0a19\t\34\2\2\u0a19\u0a28\5\u00c8e\b\u0a1a"+
		"\u0a1b\f\6\2\2\u0a1b\u0a1c\7\u012e\2\2\u0a1c\u0a28\5\u00c8e\7\u0a1d\u0a1e"+
		"\f\5\2\2\u0a1e\u0a1f\7\u0131\2\2\u0a1f\u0a28\5\u00c8e\6\u0a20\u0a21\f"+
		"\4\2\2\u0a21\u0a22\7\u012f\2\2\u0a22\u0a28\5\u00c8e\5\u0a23\u0a24\f\3"+
		"\2\2\u0a24\u0a25\5\u00ceh\2\u0a25\u0a26\5\u00c8e\4\u0a26\u0a28\3\2\2\2"+
		"\u0a27\u0a14\3\2\2\2\u0a27\u0a17\3\2\2\2\u0a27\u0a1a\3\2\2\2\u0a27\u0a1d"+
		"\3\2\2\2\u0a27\u0a20\3\2\2\2\u0a27\u0a23\3\2\2\2\u0a28\u0a2b\3\2\2\2\u0a29"+
		"\u0a27\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u00c9\3\2\2\2\u0a2b\u0a29\3\2"+
		"\2\2\u0a2c\u0a2d\bf\1\2\u0a2d\u0ae9\t\35\2\2\u0a2e\u0a30\7#\2\2\u0a2f"+
		"\u0a31\5\u00f2z\2\u0a30\u0a2f\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a30"+
		"\3\2\2\2\u0a32\u0a33\3\2\2\2\u0a33\u0a36\3\2\2\2\u0a34\u0a35\7T\2\2\u0a35"+
		"\u0a37\5\u00c2b\2\u0a36\u0a34\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37\u0a38"+
		"\3\2\2\2\u0a38\u0a39\7U\2\2\u0a39\u0ae9\3\2\2\2\u0a3a\u0a3b\7#\2\2\u0a3b"+
		"\u0a3d\5\u00c2b\2\u0a3c\u0a3e\5\u00f2z\2\u0a3d\u0a3c\3\2\2\2\u0a3e\u0a3f"+
		"\3\2\2\2\u0a3f\u0a3d\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a43\3\2\2\2\u0a41"+
		"\u0a42\7T\2\2\u0a42\u0a44\5\u00c2b\2\u0a43\u0a41\3\2\2\2\u0a43\u0a44\3"+
		"\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46\7U\2\2\u0a46\u0ae9\3\2\2\2\u0a47"+
		"\u0a48\7$\2\2\u0a48\u0a49\7\4\2\2\u0a49\u0a4a\5\u00c2b\2\u0a4a\u0a4b\7"+
		"\30\2\2\u0a4b\u0a4c\5\u00e4s\2\u0a4c\u0a4d\7\5\2\2\u0a4d\u0ae9\3\2\2\2"+
		"\u0a4e\u0a4f\7\u00ee\2\2\u0a4f\u0a58\7\4\2\2\u0a50\u0a55\5\u00b6\\\2\u0a51"+
		"\u0a52\7\6\2\2\u0a52\u0a54\5\u00b6\\\2\u0a53\u0a51\3\2\2\2\u0a54\u0a57"+
		"\3\2\2\2\u0a55\u0a53\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56\u0a59\3\2\2\2\u0a57"+
		"\u0a55\3\2\2\2\u0a58\u0a50\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5a\3\2"+
		"\2\2\u0a5a\u0ae9\7\5\2\2\u0a5b\u0a5c\7e\2\2\u0a5c\u0a5d\7\4\2\2\u0a5d"+
		"\u0a60\5\u00c2b\2\u0a5e\u0a5f\7x\2\2\u0a5f\u0a61\7\u00a5\2\2\u0a60\u0a5e"+
		"\3\2\2\2\u0a60\u0a61\3\2\2\2\u0a61\u0a62\3\2\2\2\u0a62\u0a63\7\5\2\2\u0a63"+
		"\u0ae9\3\2\2\2\u0a64\u0a65\7\u0088\2\2\u0a65\u0a66\7\4\2\2\u0a66\u0a69"+
		"\5\u00c2b\2\u0a67\u0a68\7x\2\2\u0a68\u0a6a\7\u00a5\2\2\u0a69\u0a67\3\2"+
		"\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b\u0a6c\7\5\2\2\u0a6c"+
		"\u0ae9\3\2\2\2\u0a6d\u0a6e\7\u00bb\2\2\u0a6e\u0a6f\7\4\2\2\u0a6f\u0a70"+
		"\5\u00c8e\2\u0a70\u0a71\7z\2\2\u0a71\u0a72\5\u00c8e\2\u0a72\u0a73\7\5"+
		"\2\2\u0a73\u0ae9\3\2\2\2\u0a74\u0ae9\5\u00ccg\2\u0a75\u0ae9\7\u012a\2"+
		"\2\u0a76\u0a77\5\u0102\u0082\2\u0a77\u0a78\7\7\2\2\u0a78\u0a79\7\u012a"+
		"\2\2\u0a79\u0ae9\3\2\2\2\u0a7a\u0a7b\7\4\2\2\u0a7b\u0a7e\5\u00b6\\\2\u0a7c"+
		"\u0a7d\7\6\2\2\u0a7d\u0a7f\5\u00b6\\\2\u0a7e\u0a7c\3\2\2\2\u0a7f\u0a80"+
		"\3\2\2\2\u0a80\u0a7e\3\2\2\2\u0a80\u0a81\3\2\2\2\u0a81\u0a82\3\2\2\2\u0a82"+
		"\u0a83\7\5\2\2\u0a83\u0ae9\3\2\2\2\u0a84\u0a85\7\4\2\2\u0a85\u0a86\5$"+
		"\23\2\u0a86\u0a87\7\5\2\2\u0a87\u0ae9\3\2\2\2\u0a88\u0a89\5\u0100\u0081"+
		"\2\u0a89\u0a95\7\4\2\2\u0a8a\u0a8c\5\u008aF\2\u0a8b\u0a8a\3\2\2\2\u0a8b"+
		"\u0a8c\3\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a92\5\u00c2b\2\u0a8e\u0a8f"+
		"\7\6\2\2\u0a8f\u0a91\5\u00c2b\2\u0a90\u0a8e\3\2\2\2\u0a91\u0a94\3\2\2"+
		"\2\u0a92\u0a90\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93\u0a96\3\2\2\2\u0a94\u0a92"+
		"\3\2\2\2\u0a95\u0a8b\3\2\2\2\u0a95\u0a96\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97"+
		"\u0a9e\7\5\2\2\u0a98\u0a99\7c\2\2\u0a99\u0a9a\7\4\2\2\u0a9a\u0a9b\7\u0115"+
		"\2\2\u0a9b\u0a9c\5\u00c4c\2\u0a9c\u0a9d\7\5\2\2\u0a9d\u0a9f\3\2\2\2\u0a9e"+
		"\u0a98\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f\u0aa2\3\2\2\2\u0aa0\u0aa1\t\36"+
		"\2\2\u0aa1\u0aa3\7\u00a5\2\2\u0aa2\u0aa0\3\2\2\2\u0aa2\u0aa3\3\2\2\2\u0aa3"+
		"\u0aa6\3\2\2\2\u0aa4\u0aa5\7\u00b0\2\2\u0aa5\u0aa7\5\u00f8}\2\u0aa6\u0aa4"+
		"\3\2\2\2\u0aa6\u0aa7\3\2\2\2\u0aa7\u0ae9\3\2\2\2\u0aa8\u0aa9\5\u0108\u0085"+
		"\2\u0aa9\u0aaa\7\n\2\2\u0aaa\u0aab\5\u00c2b\2\u0aab\u0ae9\3\2\2\2\u0aac"+
		"\u0aad\7\4\2\2\u0aad\u0ab0\5\u0108\u0085\2\u0aae\u0aaf\7\6\2\2\u0aaf\u0ab1"+
		"\5\u0108\u0085\2\u0ab0\u0aae\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab0\3"+
		"\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0ab4\3\2\2\2\u0ab4\u0ab5\7\5\2\2\u0ab5"+
		"\u0ab6\7\n\2\2\u0ab6\u0ab7\5\u00c2b\2\u0ab7\u0ae9\3\2\2\2\u0ab8\u0ae9"+
		"\5\u0108\u0085\2\u0ab9\u0aba\7\4\2\2\u0aba\u0abb\5\u00c2b\2\u0abb\u0abc"+
		"\7\5\2\2\u0abc\u0ae9\3\2\2\2\u0abd\u0abe\7_\2\2\u0abe\u0abf\7\4\2\2\u0abf"+
		"\u0ac0\5\u0108\u0085\2\u0ac0\u0ac1\7k\2\2\u0ac1\u0ac2\5\u00c8e\2\u0ac2"+
		"\u0ac3\7\5\2\2\u0ac3\u0ae9\3\2\2\2\u0ac4\u0ac5\t\37\2\2\u0ac5\u0ac6\7"+
		"\4\2\2\u0ac6\u0ac7\5\u00c8e\2\u0ac7\u0ac8\t \2\2\u0ac8\u0acb\5\u00c8e"+
		"\2\u0ac9\u0aca\t!\2\2\u0aca\u0acc\5\u00c8e\2\u0acb\u0ac9\3\2\2\2\u0acb"+
		"\u0acc\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd\u0ace\7\5\2\2\u0ace\u0ae9\3\2"+
		"\2\2\u0acf\u0ad0\7\u0100\2\2\u0ad0\u0ad2\7\4\2\2\u0ad1\u0ad3\t\"\2\2\u0ad2"+
		"\u0ad1\3\2\2\2\u0ad2\u0ad3\3\2\2\2\u0ad3\u0ad5\3\2\2\2\u0ad4\u0ad6\5\u00c8"+
		"e\2\u0ad5\u0ad4\3\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7"+
		"\u0ad8\7k\2\2\u0ad8\u0ad9\5\u00c8e\2\u0ad9\u0ada\7\5\2\2\u0ada\u0ae9\3"+
		"\2\2\2\u0adb\u0adc\7\u00b2\2\2\u0adc\u0add\7\4\2\2\u0add\u0ade\5\u00c8"+
		"e\2\u0ade\u0adf\7\u00ba\2\2\u0adf\u0ae0\5\u00c8e\2\u0ae0\u0ae1\7k\2\2"+
		"\u0ae1\u0ae4\5\u00c8e\2\u0ae2\u0ae3\7g\2\2\u0ae3\u0ae5\5\u00c8e\2\u0ae4"+
		"\u0ae2\3\2\2\2\u0ae4\u0ae5\3\2\2\2\u0ae5\u0ae6\3\2\2\2\u0ae6\u0ae7\7\5"+
		"\2\2\u0ae7\u0ae9\3\2\2\2\u0ae8\u0a2c\3\2\2\2\u0ae8\u0a2e\3\2\2\2\u0ae8"+
		"\u0a3a\3\2\2\2\u0ae8\u0a47\3\2\2\2\u0ae8\u0a4e\3\2\2\2\u0ae8\u0a5b\3\2"+
		"\2\2\u0ae8\u0a64\3\2\2\2\u0ae8\u0a6d\3\2\2\2\u0ae8\u0a74\3\2\2\2\u0ae8"+
		"\u0a75\3\2\2\2\u0ae8\u0a76\3\2\2\2\u0ae8\u0a7a\3\2\2\2\u0ae8\u0a84\3\2"+
		"\2\2\u0ae8\u0a88\3\2\2\2\u0ae8\u0aa8\3\2\2\2\u0ae8\u0aac\3\2\2\2\u0ae8"+
		"\u0ab8\3\2\2\2\u0ae8\u0ab9\3\2\2\2\u0ae8\u0abd\3\2\2\2\u0ae8\u0ac4\3\2"+
		"\2\2\u0ae8\u0acf\3\2\2\2\u0ae8\u0adb\3\2\2\2\u0ae9\u0af4\3\2\2\2\u0aea"+
		"\u0aeb\f\n\2\2\u0aeb\u0aec\7\13\2\2\u0aec\u0aed\5\u00c8e\2\u0aed\u0aee"+
		"\7\f\2\2\u0aee\u0af3\3\2\2\2\u0aef\u0af0\f\b\2\2\u0af0\u0af1\7\7\2\2\u0af1"+
		"\u0af3\5\u0108\u0085\2\u0af2\u0aea\3\2\2\2\u0af2\u0aef\3\2\2\2\u0af3\u0af6"+
		"\3\2\2\2\u0af4\u0af2\3\2\2\2\u0af4\u0af5\3\2\2\2\u0af5\u00cb\3\2\2\2\u0af6"+
		"\u0af4\3\2\2\2\u0af7\u0b04\7\u00a4\2\2\u0af8\u0b04\5\u00d6l\2\u0af9\u0afa"+
		"\5\u0108\u0085\2\u0afa\u0afb\7\u0132\2\2\u0afb\u0b04\3\2\2\2\u0afc\u0b04"+
		"\5\u010e\u0088\2\u0afd\u0b04\5\u00d4k\2\u0afe\u0b00\7\u0132\2\2\u0aff"+
		"\u0afe\3\2\2\2\u0b00\u0b01\3\2\2\2\u0b01\u0aff\3\2\2\2\u0b01\u0b02\3\2"+
		"\2\2\u0b02\u0b04\3\2\2\2\u0b03\u0af7\3\2\2\2\u0b03\u0af8\3\2\2\2\u0b03"+
		"\u0af9\3\2\2\2\u0b03\u0afc\3\2\2\2\u0b03\u0afd\3\2\2\2\u0b03\u0aff\3\2"+
		"\2\2\u0b04\u00cd\3\2\2\2\u0b05\u0b06\t#\2\2\u0b06\u00cf\3\2\2\2\u0b07"+
		"\u0b08\t$\2\2\u0b08\u00d1\3\2\2\2\u0b09\u0b0a\t%\2\2\u0b0a\u00d3\3\2\2"+
		"\2\u0b0b\u0b0c\t&\2\2\u0b0c\u00d5\3\2\2\2\u0b0d\u0b10\7\u0082\2\2\u0b0e"+
		"\u0b11\5\u00d8m\2\u0b0f\u0b11\5\u00dco\2\u0b10\u0b0e\3\2\2\2\u0b10\u0b0f"+
		"\3\2\2\2\u0b10\u0b11\3\2\2\2\u0b11\u00d7\3\2\2\2\u0b12\u0b14\5\u00dan"+
		"\2\u0b13\u0b15\5\u00dep\2\u0b14\u0b13\3\2\2\2\u0b14\u0b15\3\2\2\2\u0b15"+
		"\u00d9\3\2\2\2\u0b16\u0b17\5\u00e0q\2\u0b17\u0b18\5\u0108\u0085\2\u0b18"+
		"\u0b1a\3\2\2\2\u0b19\u0b16\3\2\2\2\u0b1a\u0b1b\3\2\2\2\u0b1b\u0b19\3\2"+
		"\2\2\u0b1b\u0b1c\3\2\2\2\u0b1c\u00db\3\2\2\2\u0b1d\u0b20\5\u00dep\2\u0b1e"+
		"\u0b21\5\u00dan\2\u0b1f\u0b21\5\u00dep\2\u0b20\u0b1e\3\2\2\2\u0b20\u0b1f"+
		"\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21\u00dd\3\2\2\2\u0b22\u0b23\5\u00e0q"+
		"\2\u0b23\u0b24\5\u0108\u0085\2\u0b24\u0b25\7\u00fa\2\2\u0b25\u0b26\5\u0108"+
		"\u0085\2\u0b26\u00df\3\2\2\2\u0b27\u0b29\t\'\2\2\u0b28\u0b27\3\2\2\2\u0b28"+
		"\u0b29\3\2\2\2\u0b29\u0b2a\3\2\2\2\u0b2a\u0b2d\t\27\2\2\u0b2b\u0b2d\7"+
		"\u0132\2\2\u0b2c\u0b28\3\2\2\2\u0b2c\u0b2b\3\2\2\2\u0b2d\u00e1\3\2\2\2"+
		"\u0b2e\u0b32\7e\2\2\u0b2f\u0b30\7\17\2\2\u0b30\u0b32\5\u0104\u0083\2\u0b31"+
		"\u0b2e\3\2\2\2\u0b31\u0b2f\3\2\2\2\u0b32\u00e3\3\2\2\2\u0b33\u0b34\7\27"+
		"\2\2\u0b34\u0b35\7\u0124\2\2\u0b35\u0b36\5\u00e4s\2\u0b36\u0b37\7\u0126"+
		"\2\2\u0b37\u0b56\3\2\2\2\u0b38\u0b39\7\u0099\2\2\u0b39\u0b3a\7\u0124\2"+
		"\2\u0b3a\u0b3b\5\u00e4s\2\u0b3b\u0b3c\7\6\2\2\u0b3c\u0b3d\5\u00e4s\2\u0b3d"+
		"\u0b3e\7\u0126\2\2\u0b3e\u0b56\3\2\2\2\u0b3f\u0b46\7\u00ee\2\2\u0b40\u0b42"+
		"\7\u0124\2\2\u0b41\u0b43\5\u00eex\2\u0b42\u0b41\3\2\2\2\u0b42\u0b43\3"+
		"\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b47\7\u0126\2\2\u0b45\u0b47\7\u0122"+
		"\2\2\u0b46\u0b40\3\2\2\2\u0b46\u0b45\3\2\2\2\u0b47\u0b56\3\2\2\2\u0b48"+
		"\u0b53\5\u0108\u0085\2\u0b49\u0b4a\7\4\2\2\u0b4a\u0b4f\7\u0136\2\2\u0b4b"+
		"\u0b4c\7\6\2\2\u0b4c\u0b4e\7\u0136\2\2\u0b4d\u0b4b\3\2\2\2\u0b4e\u0b51"+
		"\3\2\2\2\u0b4f\u0b4d\3\2\2\2\u0b4f\u0b50\3\2\2\2\u0b50\u0b52\3\2\2\2\u0b51"+
		"\u0b4f\3\2\2\2\u0b52\u0b54\7\5\2\2\u0b53\u0b49\3\2\2\2\u0b53\u0b54\3\2"+
		"\2\2\u0b54\u0b56\3\2\2\2\u0b55\u0b33\3\2\2\2\u0b55\u0b38\3\2\2\2\u0b55"+
		"\u0b3f\3\2\2\2\u0b55\u0b48\3\2\2\2\u0b56\u00e5\3\2\2\2\u0b57\u0b5c\5\u00e8"+
		"u\2\u0b58\u0b59\7\6\2\2\u0b59\u0b5b\5\u00e8u\2\u0b5a\u0b58\3\2\2\2\u0b5b"+
		"\u0b5e\3\2\2\2\u0b5c\u0b5a\3\2\2\2\u0b5c\u0b5d\3\2\2\2\u0b5d\u00e7\3\2"+
		"\2\2\u0b5e\u0b5c\3\2\2\2\u0b5f\u0b60\5\u00b0Y\2\u0b60\u0b63\5\u00e4s\2"+
		"\u0b61\u0b62\7\u00a3\2\2\u0b62\u0b64\7\u00a4\2\2\u0b63\u0b61\3\2\2\2\u0b63"+
		"\u0b64\3\2\2\2\u0b64\u0b66\3\2\2\2\u0b65\u0b67\5\"\22\2\u0b66\u0b65\3"+
		"\2\2\2\u0b66\u0b67\3\2\2\2\u0b67\u0b69\3\2\2\2\u0b68\u0b6a\5\u00e2r\2"+
		"\u0b69\u0b68\3\2\2\2\u0b69\u0b6a\3\2\2\2\u0b6a\u00e9\3\2\2\2\u0b6b\u0b70"+
		"\5\u00ecw\2\u0b6c\u0b6d\7\6\2\2\u0b6d\u0b6f\5\u00ecw\2\u0b6e\u0b6c\3\2"+
		"\2\2\u0b6f\u0b72\3\2\2\2\u0b70\u0b6e\3\2\2\2\u0b70\u0b71\3\2\2\2\u0b71"+
		"\u00eb\3\2\2\2\u0b72\u0b70\3\2\2\2\u0b73\u0b74\5\u0104\u0083\2\u0b74\u0b77"+
		"\5\u00e4s\2\u0b75\u0b76\7\u00a3\2\2\u0b76\u0b78\7\u00a4\2\2\u0b77\u0b75"+
		"\3\2\2\2\u0b77\u0b78\3\2\2\2\u0b78\u0b7a\3\2\2\2\u0b79\u0b7b\5\"\22\2"+
		"\u0b7a\u0b79\3\2\2\2\u0b7a\u0b7b\3\2\2\2\u0b7b\u00ed\3\2\2\2\u0b7c\u0b81"+
		"\5\u00f0y\2\u0b7d\u0b7e\7\6\2\2\u0b7e\u0b80\5\u00f0y\2\u0b7f\u0b7d\3\2"+
		"\2\2\u0b80\u0b83\3\2\2\2\u0b81\u0b7f\3\2\2\2\u0b81\u0b82\3\2\2\2\u0b82"+
		"\u00ef\3\2\2\2\u0b83\u0b81\3\2\2\2\u0b84\u0b85\5\u0108\u0085\2\u0b85\u0b86"+
		"\7\r\2\2\u0b86\u0b89\5\u00e4s\2\u0b87\u0b88\7\u00a3\2\2\u0b88\u0b8a\7"+
		"\u00a4\2\2\u0b89\u0b87\3\2\2\2\u0b89\u0b8a\3\2\2\2\u0b8a\u0b8c\3\2\2\2"+
		"\u0b8b\u0b8d\5\"\22\2\u0b8c\u0b8b\3\2\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d\u00f1"+
		"\3\2\2\2\u0b8e\u0b8f\7\u0114\2\2\u0b8f\u0b90\5\u00c2b\2\u0b90\u0b91\7"+
		"\u00f8\2\2\u0b91\u0b92\5\u00c2b\2\u0b92\u00f3\3\2\2\2\u0b93\u0b94\7\u0116"+
		"\2\2\u0b94\u0b99\5\u00f6|\2\u0b95\u0b96\7\6\2\2\u0b96\u0b98\5\u00f6|\2"+
		"\u0b97\u0b95\3\2\2\2\u0b98\u0b9b\3\2\2\2\u0b99\u0b97\3\2\2\2\u0b99\u0b9a"+
		"\3\2\2\2\u0b9a\u00f5\3\2\2\2\u0b9b\u0b99\3\2\2\2\u0b9c\u0b9d\5\u0104\u0083"+
		"\2\u0b9d\u0b9e\7\30\2\2\u0b9e\u0b9f\5\u00f8}\2\u0b9f\u00f7\3\2\2\2\u0ba0"+
		"\u0bcf\5\u0104\u0083\2\u0ba1\u0ba2\7\4\2\2\u0ba2\u0ba3\5\u0104\u0083\2"+
		"\u0ba3\u0ba4\7\5\2\2\u0ba4\u0bcf\3\2\2\2\u0ba5\u0bc8\7\4\2\2\u0ba6\u0ba7"+
		"\7(\2\2\u0ba7\u0ba8\7 \2\2\u0ba8\u0bad\5\u00c2b\2\u0ba9\u0baa\7\6\2\2"+
		"\u0baa\u0bac\5\u00c2b\2\u0bab\u0ba9\3\2\2\2\u0bac\u0baf\3\2\2\2\u0bad"+
		"\u0bab\3\2\2\2\u0bad\u0bae\3\2\2\2\u0bae\u0bc9\3\2\2\2\u0baf\u0bad\3\2"+
		"\2\2\u0bb0\u0bb1\t(\2\2\u0bb1\u0bb2\7 \2\2\u0bb2\u0bb7\5\u00c2b\2\u0bb3"+
		"\u0bb4\7\6\2\2\u0bb4\u0bb6\5\u00c2b\2\u0bb5\u0bb3\3\2\2\2\u0bb6\u0bb9"+
		"\3\2\2\2\u0bb7\u0bb5\3\2\2\2\u0bb7\u0bb8\3\2\2\2\u0bb8\u0bbb\3\2\2\2\u0bb9"+
		"\u0bb7\3\2\2\2\u0bba\u0bb0\3\2\2\2\u0bba\u0bbb\3\2\2\2\u0bbb\u0bc6\3\2"+
		"\2\2\u0bbc\u0bbd\t)\2\2\u0bbd\u0bbe\7 \2\2\u0bbe\u0bc3\5Z.\2\u0bbf\u0bc0"+
		"\7\6\2\2\u0bc0\u0bc2\5Z.\2\u0bc1\u0bbf\3\2\2\2\u0bc2\u0bc5\3\2\2\2\u0bc3"+
		"\u0bc1\3\2\2\2\u0bc3\u0bc4\3\2\2\2\u0bc4\u0bc7\3\2\2\2\u0bc5\u0bc3\3\2"+
		"\2\2\u0bc6\u0bbc\3\2\2\2\u0bc6\u0bc7\3\2\2\2\u0bc7\u0bc9\3\2\2\2\u0bc8"+
		"\u0ba6\3\2\2\2\u0bc8\u0bba\3\2\2\2\u0bc9\u0bcb\3\2\2\2\u0bca\u0bcc\5\u00fa"+
		"~\2\u0bcb\u0bca\3\2\2\2\u0bcb\u0bcc\3\2\2\2\u0bcc\u0bcd\3\2\2\2\u0bcd"+
		"\u0bcf\7\5\2\2\u0bce\u0ba0\3\2\2\2\u0bce\u0ba1\3\2\2\2\u0bce\u0ba5\3\2"+
		"\2\2\u0bcf\u00f9\3\2\2\2\u0bd0\u0bd1\7\u00c2\2\2\u0bd1\u0be1\5\u00fc\177"+
		"\2\u0bd2\u0bd3\7\u00d8\2\2\u0bd3\u0be1\5\u00fc\177\2\u0bd4\u0bd5\7\u00c2"+
		"\2\2\u0bd5\u0bd6\7\34\2\2\u0bd6\u0bd7\5\u00fc\177\2\u0bd7\u0bd8\7\23\2"+
		"\2\u0bd8\u0bd9\5\u00fc\177\2\u0bd9\u0be1\3\2\2\2\u0bda\u0bdb\7\u00d8\2"+
		"\2\u0bdb\u0bdc\7\34\2\2\u0bdc\u0bdd\5\u00fc\177\2\u0bdd\u0bde\7\23\2\2"+
		"\u0bde\u0bdf\5\u00fc\177\2\u0bdf\u0be1\3\2\2\2\u0be0\u0bd0\3\2\2\2\u0be0"+
		"\u0bd2\3\2\2\2\u0be0\u0bd4\3\2\2\2\u0be0\u0bda\3\2\2\2\u0be1\u00fb\3\2"+
		"\2\2\u0be2\u0be3\7\u0105\2\2\u0be3\u0bea\t*\2\2\u0be4\u0be5\7;\2\2\u0be5"+
		"\u0bea\7\u00d7\2\2\u0be6\u0be7\5\u00c2b\2\u0be7\u0be8\t*\2\2\u0be8\u0bea"+
		"\3\2\2\2\u0be9\u0be2\3\2\2\2\u0be9\u0be4\3\2\2\2\u0be9\u0be6\3\2\2\2\u0bea"+
		"\u00fd\3\2\2\2\u0beb\u0bf0\5\u0102\u0082\2\u0bec\u0bed\7\6\2\2\u0bed\u0bef"+
		"\5\u0102\u0082\2\u0bee\u0bec\3\2\2\2\u0bef\u0bf2\3\2\2\2\u0bf0\u0bee\3"+
		"\2\2\2\u0bf0\u0bf1\3\2\2\2\u0bf1\u00ff\3\2\2\2\u0bf2\u0bf0\3\2\2\2\u0bf3"+
		"\u0bf8\5\u0102\u0082\2\u0bf4\u0bf8\7c\2\2\u0bf5\u0bf8\7\u008c\2\2\u0bf6"+
		"\u0bf8\7\u00d1\2\2\u0bf7\u0bf3\3\2\2\2\u0bf7\u0bf4\3\2\2\2\u0bf7\u0bf5"+
		"\3\2\2\2\u0bf7\u0bf6\3\2\2\2\u0bf8\u0101\3\2\2\2\u0bf9\u0bfe\5\u0108\u0085"+
		"\2\u0bfa\u0bfb\7\7\2\2\u0bfb\u0bfd\5\u0108\u0085\2\u0bfc\u0bfa\3\2\2\2"+
		"\u0bfd\u0c00\3\2\2\2\u0bfe\u0bfc\3\2\2\2\u0bfe\u0bff\3\2\2\2\u0bff\u0103"+
		"\3\2\2\2\u0c00\u0bfe\3\2\2\2\u0c01\u0c02\5\u0108\u0085\2\u0c02\u0c03\5"+
		"\u0106\u0084\2\u0c03\u0105\3\2\2\2\u0c04\u0c05\7\u0129\2\2\u0c05\u0c07"+
		"\5\u0108\u0085\2\u0c06\u0c04\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08\u0c06\3"+
		"\2\2\2\u0c08\u0c09\3\2\2\2\u0c09\u0c0c\3\2\2\2\u0c0a\u0c0c\3\2\2\2\u0c0b"+
		"\u0c06\3\2\2\2\u0c0b\u0c0a\3\2\2\2\u0c0c\u0107\3\2\2\2\u0c0d\u0c11\5\u010a"+
		"\u0086\2\u0c0e\u0c0f\6\u0085\22\2\u0c0f\u0c11\5\u0114\u008b\2\u0c10\u0c0d"+
		"\3\2\2\2\u0c10\u0c0e\3\2\2\2\u0c11\u0109\3\2\2\2\u0c12\u0c19\7\u013c\2"+
		"\2\u0c13\u0c19\5\u010c\u0087\2\u0c14\u0c15\6\u0086\23\2\u0c15\u0c19\5"+
		"\u0112\u008a\2\u0c16\u0c17\6\u0086\24\2\u0c17\u0c19\5\u0116\u008c\2\u0c18"+
		"\u0c12\3\2\2\2\u0c18\u0c13\3\2\2\2\u0c18\u0c14\3\2\2\2\u0c18\u0c16\3\2"+
		"\2\2\u0c19\u010b\3\2\2\2\u0c1a\u0c1b\7\u013d\2\2\u0c1b\u010d\3\2\2\2\u0c1c"+
		"\u0c1e\6\u0088\25\2\u0c1d\u0c1f\7\u0129\2\2\u0c1e\u0c1d\3\2\2\2\u0c1e"+
		"\u0c1f\3\2\2\2\u0c1f\u0c20\3\2\2\2\u0c20\u0c48\7\u0137\2\2\u0c21\u0c23"+
		"\6\u0088\26\2\u0c22\u0c24\7\u0129\2\2\u0c23\u0c22\3\2\2\2\u0c23\u0c24"+
		"\3\2\2\2\u0c24\u0c25\3\2\2\2\u0c25\u0c48\7\u0138\2\2\u0c26\u0c28\6\u0088"+
		"\27\2\u0c27\u0c29\7\u0129\2\2\u0c28\u0c27\3\2\2\2\u0c28\u0c29\3\2\2\2"+
		"\u0c29\u0c2a\3\2\2\2\u0c2a\u0c48\t+\2\2\u0c2b\u0c2d\7\u0129\2\2\u0c2c"+
		"\u0c2b\3\2\2\2\u0c2c\u0c2d\3\2\2\2\u0c2d\u0c2e\3\2\2\2\u0c2e\u0c48\7\u0136"+
		"\2\2\u0c2f\u0c31\7\u0129\2\2\u0c30\u0c2f\3\2\2\2\u0c30\u0c31\3\2\2\2\u0c31"+
		"\u0c32\3\2\2\2\u0c32\u0c48\7\u0133\2\2\u0c33\u0c35\7\u0129\2\2\u0c34\u0c33"+
		"\3\2\2\2\u0c34\u0c35\3\2\2\2\u0c35\u0c36\3\2\2\2\u0c36\u0c48\7\u0134\2"+
		"\2\u0c37\u0c39\7\u0129\2\2\u0c38\u0c37\3\2\2\2\u0c38\u0c39\3\2\2\2\u0c39"+
		"\u0c3a\3\2\2\2\u0c3a\u0c48\7\u0135\2\2\u0c3b\u0c3d\7\u0129\2\2\u0c3c\u0c3b"+
		"\3\2\2\2\u0c3c\u0c3d\3\2\2\2\u0c3d\u0c3e\3\2\2\2\u0c3e\u0c48\7\u013a\2"+
		"\2\u0c3f\u0c41\7\u0129\2\2\u0c40\u0c3f\3\2\2\2\u0c40\u0c41\3\2\2\2\u0c41"+
		"\u0c42\3\2\2\2\u0c42\u0c48\7\u0139\2\2\u0c43\u0c45\7\u0129\2\2\u0c44\u0c43"+
		"\3\2\2\2\u0c44\u0c45\3\2\2\2\u0c45\u0c46\3\2\2\2\u0c46\u0c48\7\u013b\2"+
		"\2\u0c47\u0c1c\3\2\2\2\u0c47\u0c21\3\2\2\2\u0c47\u0c26\3\2\2\2\u0c47\u0c2c"+
		"\3\2\2\2\u0c47\u0c30\3\2\2\2\u0c47\u0c34\3\2\2\2\u0c47\u0c38\3\2\2\2\u0c47"+
		"\u0c3c\3\2\2\2\u0c47\u0c40\3\2\2\2\u0c47\u0c44\3\2\2\2\u0c48\u010f\3\2"+
		"\2\2\u0c49\u0c4a\7\u0103\2\2\u0c4a\u0c51\5\u00e4s\2\u0c4b\u0c51\5\"\22"+
		"\2\u0c4c\u0c51\5\u00e2r\2\u0c4d\u0c4e\t,\2\2\u0c4e\u0c4f\7\u00a3\2\2\u0c4f"+
		"\u0c51\7\u00a4\2\2\u0c50\u0c49\3\2\2\2\u0c50\u0c4b\3\2\2\2\u0c50\u0c4c"+
		"\3\2\2\2\u0c50\u0c4d\3\2\2\2\u0c51\u0111\3\2\2\2\u0c52\u0c53\t-\2\2\u0c53"+
		"\u0113\3\2\2\2\u0c54\u0c55\t.\2\2\u0c55\u0115\3\2\2\2\u0c56\u0c57\t/\2"+
		"\2\u0c57\u0117\3\2\2\2\u019f\u011c\u0135\u013a\u0142\u014a\u014c\u0160"+
		"\u0164\u016a\u016d\u0170\u0177\u017a\u017e\u0181\u0188\u0193\u0195\u019d"+
		"\u01a0\u01a4\u01a7\u01ad\u01b8\u01be\u01c3\u0203\u020c\u0210\u0216\u021a"+
		"\u021f\u0225\u0231\u0239\u023f\u024c\u0251\u0261\u0268\u026c\u0272\u0281"+
		"\u0285\u028b\u0291\u0294\u0297\u029d\u02a1\u02a9\u02ab\u02b4\u02b7\u02c0"+
		"\u02c5\u02cb\u02d2\u02d5\u02db\u02e6\u02e9\u02ed\u02f2\u02f7\u02fe\u0301"+
		"\u0304\u030b\u0310\u0319\u0321\u0327\u032a\u032d\u0333\u0337\u033b\u033f"+
		"\u0341\u0349\u0351\u0357\u0363\u0367\u036a\u036e\u0371\u0375\u0391\u0394"+
		"\u0398\u039e\u03a1\u03a4\u03aa\u03b2\u03b7\u03bd\u03c3\u03cb\u03d3\u03d6"+
		"\u03dd\u03ee\u03fc\u03ff\u0405\u040e\u0417\u041e\u0422\u042d\u0439\u043c"+
		"\u0442\u0448\u044e\u0452\u0459\u0461\u0465\u0471\u0475\u047b\u047e\u048a"+
		"\u048e\u0495\u0509\u0511\u0519\u0522\u052c\u0530\u0533\u0539\u053f\u054b"+
		"\u0557\u055c\u0565\u056d\u0574\u0576\u0579\u057e\u0582\u0587\u058a\u058f"+
		"\u0594\u0597\u059c\u05a0\u05a5\u05a7\u05ab\u05b4\u05bc\u05c5\u05cc\u05d5"+
		"\u05da\u05dd\u05f5\u05f7\u0600\u0607\u060a\u0611\u0615\u061b\u0623\u062e"+
		"\u0639\u0640\u0646\u0653\u065a\u0661\u066d\u0675\u067b\u067e\u0687\u068a"+
		"\u0693\u0696\u069f\u06a2\u06ab\u06ae\u06b1\u06b6\u06b8\u06c4\u06cb\u06d2"+
		"\u06d5\u06d7\u06e3\u06e7\u06eb\u06f1\u06f5\u06fd\u0701\u0704\u0707\u070a"+
		"\u070e\u0712\u0715\u0719\u071e\u0722\u0725\u0728\u072b\u072d\u0739\u073c"+
		"\u0740\u074a\u074e\u0750\u0753\u0757\u075d\u0761\u076c\u0776\u0782\u0791"+
		"\u0796\u079d\u07ad\u07b2\u07bf\u07c4\u07cc\u07d2\u07d6\u07df\u07ee\u07f3"+
		"\u07ff\u0804\u080c\u080f\u0813\u0821\u082e\u0833\u0837\u083a\u083f\u0848"+
		"\u084b\u0850\u0857\u085a\u0862\u0869\u0870\u0873\u0878\u087b\u0880\u0884"+
		"\u0887\u088a\u0890\u0895\u089a\u08ac\u08ae\u08b1\u08bc\u08c5\u08cc\u08d4"+
		"\u08db\u08df\u08e7\u08ef\u08f5\u08fd\u0909\u090c\u0912\u0916\u0918\u0921"+
		"\u092d\u092f\u0936\u093d\u0943\u0949\u094b\u0952\u095a\u0960\u0967\u096d"+
		"\u0971\u0973\u097a\u0983\u098a\u0994\u0999\u099d\u09ab\u09ad\u09b5\u09b7"+
		"\u09bb\u09c3\u09cc\u09d2\u09da\u09df\u09eb\u09f0\u09f3\u09f9\u09fd\u0a02"+
		"\u0a07\u0a0c\u0a12\u0a27\u0a29\u0a32\u0a36\u0a3f\u0a43\u0a55\u0a58\u0a60"+
		"\u0a69\u0a80\u0a8b\u0a92\u0a95\u0a9e\u0aa2\u0aa6\u0ab2\u0acb\u0ad2\u0ad5"+
		"\u0ae4\u0ae8\u0af2\u0af4\u0b01\u0b03\u0b10\u0b14\u0b1b\u0b20\u0b28\u0b2c"+
		"\u0b31\u0b42\u0b46\u0b4f\u0b53\u0b55\u0b5c\u0b63\u0b66\u0b69\u0b70\u0b77"+
		"\u0b7a\u0b81\u0b89\u0b8c\u0b99\u0bad\u0bb7\u0bba\u0bc3\u0bc6\u0bc8\u0bcb"+
		"\u0bce\u0be0\u0be9\u0bf0\u0bf7\u0bfe\u0c08\u0c0b\u0c10\u0c18\u0c1e\u0c23"+
		"\u0c28\u0c2c\u0c30\u0c34\u0c38\u0c3c\u0c40\u0c44\u0c47\u0c50";
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
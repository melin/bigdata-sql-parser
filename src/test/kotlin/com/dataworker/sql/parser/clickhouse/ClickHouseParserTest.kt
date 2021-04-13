package com.dataworker.sql.parser.clickhouse

import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.arithmetic.ArithmeticHelper
import com.dataworker.sql.parser.model.*
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class ClickHouseParserTest {

    @Test
    fun createTableTest() {
        val sql = """CREATE TABLE ods.access_log (
              add_time DateTime DEFAULT now(),
              big_app_id String comment '添加时间',
              app_id String DEFAULT 'sd',
              seq_id Nullable(String),
              uuid1 Nullable(String),
              time Nullable(String),
              device_key Nullable(String),
              manufacturer Nullable(String) TTL d + INTERVAL 1 MONTH,
              ds Date
            ) ENGINE = MergeTree() 
            ORDER BY add_time, big_app_id, app_id
            PARTITION BY toYYYYMM(ds)
            PRIMARY KEY seq_id
            SAMPLE BY intHash32(seq_id)
            TTL ds + INTERVAL 1 MONTH DELETE,
                ds + INTERVAL 1 WEEK TO VOLUME 'aaa',
                ds + INTERVAL 2 WEEK TO DISK 'bbb'
            SETTINGS index_granularity = 8192
            Comment 'hello world'
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.CREATE_TABLE, statementData?.type)
        if (statement is ClickHouseTable) {
            Assert.assertEquals("access_log", statement.tableName)
            Assert.assertEquals("MergeTree", statement.engine)
            Assert.assertEquals("toYYYYMM(ds)", statement.partitionExpr)
            Assert.assertEquals("add_time,big_app_id,app_id", statement.orderExpr)
            Assert.assertEquals("seq_id", statement.primaryExpr)
            Assert.assertEquals("index_granularity=8192", statement.settingsExpr)
            Assert.assertEquals("hello world", statement.comment)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest1() {
        val sql = """CREATE TABLE datainsight.sales_data_zhengs
                (
                    `the_year` Int64,
                    `month_of_year` Int64,
                    `day_of_month` Int64,
                    `the_date` DateTime,
                    `SALES_DISTRICT` String,
                    `SALES_REGION` String,
                    `SALES_COUNTRY` String,
                    `yearly_income` String,
                    `total_children` Int64,
                    `member_card` String,
                    `num_cars_owned` Int64,
                    `gender` String,
                    `store_sales` Float64,
                    `store_cost` Float64,
                    `unit_sales` Float64,
                    `ck_version` Int8 DEFAULT 1,
                    `ck_update_time` DateTime DEFAULT now()
                )
                ENGINE = MergeTree()
                ORDER BY the_year
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.CREATE_TABLE, statementData?.type)
        if (statement is ClickHouseTable) {
            Assert.assertEquals("sales_data_zhengs", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest2() {
        val sql = """CREATE TABLE feature.tdl_join_1488_data_table 
     ENGINE = MergeTree() 
     PRIMARY KEY xmg_jyid 
     ORDER BY xmg_jyid AS 
       SELECT 
           tuple.1 AS xmg_jyid, 
           xmg_shanghu, 
           tuple.2 AS xmg_time_time, 
           tuple.3 AS xmg_time_date, 
           tuple.4 AS xmg_jine, 
           length(groupData) as arrSize, 
           if(length(groupData) > 1000, [], groupData) AS groupData, 
           num_index_ % 32 as index 
       FROM feature.tdl_group_1488_data_table a 
       LEFT ARRAY JOIN a.groupData AS tuple, arrayEnumerate(a.groupData) AS num_index_ 
 where xmg_time_time >= toDateTime('2020-07-01 16:44:55') and xmg_time_time <= toDateTime('2020-08-21 16:44:55')
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData?.type)
        if (statement is ClickHouseTableAsSelect) {
            Assert.assertEquals("tdl_join_1488_data_table", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableAsLikeTest() {
        val sql = """CREATE TABLE feature.group_154_data_table_bsli4 AS group_154_data_table_bsli5
            ENGINE = MergeTree() ORDER BY TRANSACTIONKEY PRIMARY KEY TRANSACTIONKEY
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.CREATE_TABLE_AS_LIKE, statementData?.type)
        if (statement is ClickHouseTableAsLike) {
            Assert.assertEquals("group_154_data_table_bsli4", statement.tableName)
            Assert.assertEquals("MergeTree", statement.engine)
            Assert.assertEquals("TRANSACTIONKEY", statement.orderExpr)
            Assert.assertEquals("TRANSACTIONKEY", statement.primaryExpr)
            Assert.assertEquals("group_154_data_table_bsli5", statement.srcTableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableAsSelectTest() {
        val sql = """CREATE TABLE feature.group_154_data_table_bsli4
            ENGINE = MergeTree() ORDER BY TRANSACTIONKEY PRIMARY KEY TRANSACTIONKEY AS
            SELECT
               tuple.1 AS TRANSACTIONKEY,
               BASE_ACCT_NUM AS BASE_ACCT_NUM,
               tuple.2 AS transTime_time,
               tuple.3 AS transTime_date,
               tuple.5 AS transAmount,
               groupData AS groupData
            FROM (
               SELECT BASE_ACCT_NUM, arr AS tuple, groupData FROM (
                   SELECT BASE_ACCT_NUM,
                       groupArray((TRANSACTIONKEY,toUnixTimestamp(transTime),substring(toString(transTime), 1, 10),inCnt7d_calc_where,transAmount)) AS groupData
                   FROM (
                       SELECT
                       case when DEBIT_CREDIT=='C' then 1 else 0 end as inCnt7d_calc_where,
                           TRANSACTIONKEY as TRANSACTIONKEY,
                           CNY_AMT as transAmount,
                           DT_TIME as transTime,
                           OPP_ISPARTY as OPP_ISPARTY,
                           OPP_ACCT_NUM as OPP_ACCT_NUM,
                           DEBIT_CREDIT as DEBIT_CREDIT,
                           ACCT_NUM as BASE_ACCT_NUM,
                           1 as _end_tag_
                       from datainsight.sample_transaction_data3
                       where BASE_ACCT_NUM != 'null' and BASE_ACCT_NUM != '' and isNull(BASE_ACCT_NUM) = 0
                   )
                   GROUP BY BASE_ACCT_NUM
               )
               LEFT ARRAY JOIN groupData AS arr
           )
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData?.type)
        if (statement is ClickHouseTableAsSelect) {
            Assert.assertEquals("group_154_data_table_bsli4", statement.tableName)
            Assert.assertEquals("MergeTree", statement.engine)
            Assert.assertEquals("TRANSACTIONKEY", statement.orderExpr)
            Assert.assertEquals("TRANSACTIONKEY", statement.primaryExpr)
            Assert.assertEquals("sample_transaction_data3", statement.inputTables?.iterator().next().tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableAsSelectTest1() {
        val sql = """
           CREATE TABLE feature.tdl_group_1054_data_table 
     ENGINE = MergeTree() 
     PRIMARY KEY group_field_concat 
     ORDER BY group_field_concat AS 
       SELECT 
           srcip AS group_field_concat, 
           srcip, 
           groupArray((srcip,toUnixTimestamp(time),substring(toString(time), 1, 10),last_10m_srcip_abnormal_code_percent_calc_numerator_where,last_30m_srcip_abnormal_code_percent_calc_numerator_where)) AS groupData 
       FROM 
       ( 
           SELECT 
                   case when  responseCode !='200' then 1 else 0 end as last_10m_srcip_abnormal_code_percent_calc_numerator_where, 
                   case when  responseCode != 200 then 1 else 0 end as last_30m_srcip_abnormal_code_percent_calc_numerator_where, 
                   EventId as eventid, 
                   SrcIp as srcip, 
                   HostName as domain, 
                   ImmediateAction as action, 
                   PolicyName as policyname, 
                   RuleName as rulename, 
                   Timestamp as time, 
                   ResponseCode as responseCode, 
                   1 as _end_tag_ 
           from datainsight.waf_data_test 
           where srcip != 'null' and srcip != '' and isNull(srcip) = 0 
       ) 
       GROUP BY srcip
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData?.type)
        if (statement is ClickHouseTableAsSelect) {
            Assert.assertEquals("tdl_group_1054_data_table", statement.tableName)
            Assert.assertEquals("MergeTree", statement.engine)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableAsSelectTest2() {
        val sql = """
        CREATE MATERIALIZED VIEW docking_activity_info (
            `actitcy_raw` String,
            `sequence_id` String,
            `appname`  String,
            `event_id` String,
            `event_occur_time` DateTime64(3),
            `activity_map` Map(String, String)
        ) ENGINE = MergeTree
        PARTITION BY toYYYYMMDD(event_occur_time)
        ORDER BY (event_id,event_occur_time,sequence_id)
        PRIMARY KEY (event_id,event_occur_time)
        TTL toDateTime(event_occur_time) + toIntervalMonth(6)
        POPULATE AS
        SELECT
            actitcy_raw, sequence_id, appname, event_id, event_occur_time,
            cast((arrayMap((x) -> x.1, actitcyArray),arrayMap((x) -> toString(x.2), actitcyArray)), 'Map(String, String)') activity_map FROM
            (select JSONExtractRaw(data_json, 'activity') AS actitcy_raw,JSONExtractKeysAndValuesRaw(actitcy_raw) actitcyArray,
                    sequence_id, appname, event_id, event_occur_time
             FROM docking_raw_data )
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.CREATE_MATERIALIZED_VIEW, statementData?.type)
        if (statement is ClickHouseMaterializedView) {
            Assert.assertEquals("docking_activity_info", statement.tableName)
            Assert.assertEquals("MergeTree", statement.engine)
            Assert.assertEquals("docking_raw_data", statement.inputTables?.iterator().next().tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableMV() {
        val sql = """
        CREATE MATERIALIZED VIEW docking_service_names (
            `appname` String,
            `event_id` String,
            `service_name` String
        ) ENGINE = MergeTree
        ORDER BY (appname, event_id)
        POPULATE as
        SELECT distinct appname, event_id, JSONExtractString(actitcy_raw, 'S_S_SERVICENAME') 
        AS service_name FROM docking_activity_info where service_name<>'';
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.CREATE_MATERIALIZED_VIEW, statementData?.type)
        if (statement is ClickHouseMaterializedView) {
            Assert.assertEquals("docking_service_names", statement.tableName)
            Assert.assertEquals("MergeTree", statement.engine)
            Assert.assertEquals("docking_activity_info", statement.inputTables?.iterator().next().tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun selectTest() {
        val sql = """
            SELECT a.EventId as eventid,  Rulename,  toUnixTimestamp(a.Timestamp1) AS time_time, 
            substring(toString(a.Timestamp1), 1, 10) AS time_date, b.groupData AS groupData 
            from datainsight.waf_1_1 a left join feature.group_1037_data_table b on a.RuleName=b.Rulename
            """
        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.SELECT, statementData?.type)
        if (statement is ClickHouseSelectQuery) {
            Assert.assertEquals(2, statement.tables?.size)
            Assert.assertEquals("group_1037_data_table", statement.tables?.iterator().next().tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun showCreatTable() {
        val sql = """
            show create table group_1037_data_table
            """
        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.SHOW_CREATE_TABLE, statementData?.type)
        if (statement is TableSource) {
            Assert.assertEquals("group_1037_data_table", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertValuesTest() {
        val sql = """
            INSERT INTO datainsight_temp.tdl_feature_verify_table_guangyue_yang(zc_jyid, zc_dqzh, 
            zc_dfzh, zc_jyje, zc_jyzt, zc_zhye, zc_bs, zc_jysj) VALUES 
            ('aaa', -1645948497, 1764821699, 0.6208606906470072, -524355840, 0.25318743326580506, 
            'aaa', '2021-03-31 14:23:19')
        """.trimIndent()

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is ClickHouseInsertStmt) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals("datainsight_temp", statement.databaseName)
            Assert.assertEquals("tdl_feature_verify_table_guangyue_yang", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertSelectTest() {
        val sql = """
            INSERT INTO datainsight_temp.tdl_feature_verify_table_guangyue_yang(zc_jyid, zc_dqzh, 
            zc_dfzh, zc_jyje, zc_jyzt, zc_zhye, zc_bs, zc_jysj) select * from test111
        """.trimIndent()

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is ClickHouseInsertStmt) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("datainsight_temp", statement.databaseName)
            Assert.assertEquals("tdl_feature_verify_table_guangyue_yang", statement.tableName)
            Assert.assertEquals("test111", statement.inputTables?.iterator().next().tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun alterTable() {
        val sql = """
            ALTER TABLE datainsight.di_warning_record  delete  where warning_id = 1;
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData?.type)
        if (statement is ClickHouseAlterTableStmt) {
            Assert.assertEquals("datainsight", statement.databaseName)
            Assert.assertEquals("di_warning_record", statement.tableName)
            Assert.assertEquals("AlterTableClauseDelete", statement.action)
        } else {
            Assert.fail()
        }
    }
}


package com.dataworker.sql.parser.arithmetic

import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.model.ArithmeticData
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class ArithmetricParserTest {

    @Test
    fun test0() {
        val sql = """
            特征1 / (特征_dd_2
                - (log2(feature_12) + 特征3))
            """

        val statementData = ArithmeticHelper.getStatementData(sql, false)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.ARITHMETIC, statementData?.type)
        if (statement is ArithmeticData) {
            Assert.assertEquals(4, statement.variables.toArray().size)
            Assert.assertEquals(1, statement.functions.size)
            Assert.assertEquals("log2", statement.functions.toArray().get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun testCase1() {
        val sql = """
            CASE when rand <= 12 then 1
                                when rand1 <= 23 then 2
                                else 3 end
            """

        val statementData = ArithmeticHelper.getStatementData(sql, false)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.ARITHMETIC, statementData?.type)
        if (statement is ArithmeticData) {
            Assert.assertEquals(2, statement.variables.toArray().size)
            Assert.assertEquals("rand", statement.variables.toArray().get(0))
            Assert.assertEquals(0, statement.functions.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun testCase2() {
        val sql = """
            case when type='emptyTable' then '空表'
                when type='emptyDqcTable' then 'DQC未配置'
                when type='365DayNoAccess' then '365日未访问'
                when type='scrapFile' then '碎文件'
                when type='emptyDetail' then '表或列缺少注释'
                when type='scheduleJobFailed' then '调度作业失败'
                else '其他'  end
            """

        val statementData = ArithmeticHelper.getStatementData(sql, false)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.ARITHMETIC, statementData?.type)
        if (statement is ArithmeticData) {
            Assert.assertEquals(1, statement.variables.toArray().size)
            Assert.assertEquals("type", statement.variables.toArray().get(0))
            Assert.assertEquals(0, statement.functions.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun test2() {
        val sql = """
            [特征1] / ([特征_dd_2]
                - (log2([feature_12]) + [特征3]))
            """

        val statementData = ArithmeticHelper.getStatementData(sql)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.ARITHMETIC, statementData?.type)
        if (statement is ArithmeticData) {
            Assert.assertEquals(4, statement.variables.toArray().size)
            Assert.assertEquals(1, statement.functions.size)
            Assert.assertEquals("log2", statement.functions.toArray().get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun test3() {
        val sql = """
            count(distinct case when white_list = 1 then name else null end)
            """

        val statementData = ArithmeticHelper.getStatementData(sql, false)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.ARITHMETIC, statementData?.type)
        if (statement is ArithmeticData) {
            Assert.assertEquals(2, statement.variables.toArray().size)
            Assert.assertEquals("white_list", statement.variables.toArray().get(0))
            Assert.assertEquals("name", statement.variables.toArray().get(1))
            Assert.assertEquals(1, statement.functions.size)
            Assert.assertEquals("count", statement.functions.toArray().get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun test4() {
        val sql = """
            if(is_dingtalk=1,id,null)
            """

        val statementData = ArithmeticHelper.getStatementData(sql, false)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.ARITHMETIC, statementData?.type)
        if (statement is ArithmeticData) {
            Assert.assertEquals(2, statement.variables.toArray().size)
            Assert.assertEquals("is_dingtalk", statement.variables.toArray().get(0))
            Assert.assertEquals("id", statement.variables.toArray().get(1))
            Assert.assertEquals(1, statement.functions.size)
            Assert.assertEquals("if", statement.functions.toArray().get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun testWindowFunction() {
        val sql = """
            rank() OVER (PARTITION BY clerk
                    ORDER BY totalprice DESC)
            """

        val statementData = ArithmeticHelper.getStatementData(sql, false)
        val statement = statementData?.statement
        Assert.assertEquals(StatementType.ARITHMETIC, statementData?.type)
        if (statement is ArithmeticData) {
            Assert.assertEquals(2, statement.variables.toArray().size)
            Assert.assertEquals("clerk", statement.variables.toArray().get(0))
            Assert.assertEquals("totalprice", statement.variables.toArray().get(1))
            Assert.assertEquals(1, statement.functions.size)
            Assert.assertEquals("rank#over", statement.functions.toArray().get(0))
        } else {
            Assert.fail()
        }
    }
}

### 介绍

基于antlr4 statement 解析器，支持spark sql, tidb sql, flink sql, Spark/flink jar 运行命令解析。开发大数据平台和BI等系统时，需要解析用到的数据库SQL，获取SQL语句类型、表、函数等信息，校验权限或者限制某种sql不允许执行等需求，包括BI系统中需要表达式解析和校验。具体使用实例，请看TestCase

```xml
<dependency>
    <groupId>com.github.melin</groupId>
    <artifactId>dataworker-sql-parser</artifactId>
    <!-- 版本号与spark 最新版本对其 -->
    <version>3.2.0</version>
</dependency>
```

###
1. [MySQL](https://github.com/antlr/grammars-v4/tree/master/sql/mysql)
2. [PrestoSQL](https://github.com/prestosql/presto/tree/master/presto-parser/src/main/antlr4/io/prestosql/sql/parser)
3. [PostgreSQL](https://github.com/pgcodekeeper/pgcodekeeper/tree/master/apgdiff/antlr-src)
4. [Spark 3.0](https://github.com/apache/spark/tree/master/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser)
5. [T-SQL](https://github.com/antlr/grammars-v4/tree/master/sql/tsql)
6. [ClickHouse](https://github.com/ClickHouse/ClickHouse/blob/master/src/Parsers/New/ClickHouseParser.g4)


### Spark Structed Streaming sql
```sql
create stream TABLE tdl_kafka_users (
    user_name "/name" string,
    age	    int,
    email   string
) WITH (
    kafka.bootstrap.servers = 'xxx.xxx.xxx.xxx:9092',
    kafka.group.id = 'dataworker-stream',
    subscribe = 'users',
    includeHeaders = true,
    startingOffsets = 'latest',
    failOnDataLoss = true,
    format='json'
);

insert into bigdata.test_delta_dt select * from tdl_kafka_users;

-- {name:'zhangsan', age: 28, email:'zhangsan@gmail.com'}
```

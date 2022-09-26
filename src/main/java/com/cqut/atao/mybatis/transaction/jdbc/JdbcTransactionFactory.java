package com.cqut.atao.mybatis.transaction.jdbc;

import com.cqut.atao.mybatis.transaction.Transaction;
import com.cqut.atao.mybatis.transaction.TransactionFactory;
import com.cqut.atao.mybatis.transaction.TransactionIsolationLevel;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName JdbcTransactionFactory.java
 * @Description JdbcTransaction 工厂
 * @createTime 2022年09月26日 09:51:00
 */
public class JdbcTransactionFactory implements TransactionFactory {

    @Override
    public Transaction newTransaction(Connection conn) {
        return new JdbcTransaction(conn);
    }

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return new JdbcTransaction(dataSource, level, autoCommit);
    }

}

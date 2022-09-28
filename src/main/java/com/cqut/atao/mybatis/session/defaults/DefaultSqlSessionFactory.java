package com.cqut.atao.mybatis.session.defaults;

import com.cqut.atao.mybatis.executor.Executor;
import com.cqut.atao.mybatis.mapping.Environment;
import com.cqut.atao.mybatis.session.Configuration;
import com.cqut.atao.mybatis.session.SqlSession;
import com.cqut.atao.mybatis.session.SqlSessionFactory;
import com.cqut.atao.mybatis.transaction.Transaction;
import com.cqut.atao.mybatis.transaction.TransactionFactory;
import com.cqut.atao.mybatis.transaction.TransactionIsolationLevel;

import java.sql.SQLException;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName DefaultSqlSessionFactory.java
 * @Description 默认的 DefaultSqlSessionFactory
 * @createTime 2022年09月24日 23:00:00
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        Transaction tx = null;
        try {
            final Environment environment = configuration.getEnvironment();
            TransactionFactory transactionFactory = environment.getTransactionFactory();
            tx = transactionFactory.newTransaction(configuration.getEnvironment().getDataSource(), TransactionIsolationLevel.READ_COMMITTED, false);
            // 创建执行器
            final Executor executor = configuration.newExecutor(tx);
            // 创建DefaultSqlSession
            return new DefaultSqlSession(configuration, executor);
        } catch (Exception e) {
            try {
                assert tx != null;
                tx.close();
            } catch (SQLException ignore) {

            }
            throw new RuntimeException("Error opening session.  Cause: " + e);
        }
    }

}

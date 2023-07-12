package com.cqut.atao.mybatis.executor;

import com.cqut.atao.mybatis.mapping.BoundSql;
import com.cqut.atao.mybatis.mapping.MappedStatement;
import com.cqut.atao.mybatis.session.ResultHandler;
import com.cqut.atao.mybatis.session.RowBounds;
import com.cqut.atao.mybatis.transaction.Transaction;


import java.sql.SQLException;
import java.util.List;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName Executor.java
 * @Description 执行器
 * @createTime 2022年09月28日 09:40:00
 */
public interface Executor {

    ResultHandler NO_RESULT_HANDLER = null;

    int update(MappedStatement ms, Object parameter) throws SQLException;

    <E> List<E> query(MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql);

    Transaction getTransaction();

    void commit(boolean required) throws SQLException;

    void rollback(boolean required) throws SQLException;

    void close(boolean forceRollback);

}

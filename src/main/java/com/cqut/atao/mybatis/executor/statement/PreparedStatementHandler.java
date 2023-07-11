package com.cqut.atao.mybatis.executor.statement;

import com.cqut.atao.mybatis.executor.Executor;
import com.cqut.atao.mybatis.mapping.BoundSql;
import com.cqut.atao.mybatis.mapping.MappedStatement;
import com.cqut.atao.mybatis.session.ResultHandler;
import com.cqut.atao.mybatis.session.RowBounds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName PreparedStatementHandler.java
 * @Description 预处理语句处理器（PREPARED）
 * @createTime 2022年09月28日 09:52:00
 */
public class PreparedStatementHandler extends BaseStatementHandler{

    public PreparedStatementHandler(Executor executor, MappedStatement mappedStatement, Object parameterObject, RowBounds rowBounds,  ResultHandler resultHandler, BoundSql boundSql) {
        super(executor, mappedStatement, parameterObject, rowBounds, resultHandler, boundSql);
    }

    @Override
    protected Statement instantiateStatement(Connection connection) throws SQLException {
        String sql = boundSql.getSql();
        return connection.prepareStatement(sql);
    }

    @Override
    public void parameterize(Statement statement) throws SQLException {
        parameterHandler.setParameters((PreparedStatement) statement);
    }

    @Override
    public <E> List<E> query(Statement statement, ResultHandler resultHandler) throws SQLException {
        PreparedStatement ps = (PreparedStatement) statement;
        ps.execute();
        return resultSetHandler.<E> handleResultSets(ps);
    }

}

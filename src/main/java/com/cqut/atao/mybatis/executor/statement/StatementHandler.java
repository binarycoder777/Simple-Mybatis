package com.cqut.atao.mybatis.executor.statement;



import com.cqut.atao.mybatis.session.ResultHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName StatementHandler.java
 * @Description 语句处理器
 * @createTime 2022年09月28日 09:47:00
 */
public interface StatementHandler {

    /**
     * 准备语句
     */
    Statement prepare(Connection connection) throws SQLException;

    /**
     * 参数化
     */
    void parameterize(Statement statement) throws SQLException;

    /**
     * 执行查询
     */
    <E> List<E> query(Statement statement, ResultHandler resultHandler) throws SQLException;

}


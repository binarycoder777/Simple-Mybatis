package com.cqut.atao.mybatis.executor.resultset;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ResultSetHandler.java
 * @Description 结果集处理器
 * @createTime 2022年09月28日 09:49:00
 */
public interface ResultSetHandler {

    <E> List<E> handleResultSets(Statement stmt) throws SQLException;

}


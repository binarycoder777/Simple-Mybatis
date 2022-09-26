package com.cqut.atao.mybatis.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName Transaction.java
 * @Description 事务接口
 * @createTime 2022年09月26日 09:36:00
 */
public interface Transaction {

    Connection getConnection() throws SQLException;

    void commit() throws SQLException;

    void rollback() throws SQLException;

    void close() throws SQLException;

}

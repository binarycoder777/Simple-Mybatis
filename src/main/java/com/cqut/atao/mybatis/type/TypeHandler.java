package com.cqut.atao.mybatis.type;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName TypeHandler.java
 * @Description 类型处理器
 * @createTime 2023年06月21日 17:22:00
 */
public interface TypeHandler<T> {

    /**
     * 设置参数
     */
    void setParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException;

}


package com.cqut.atao.mybatis.type;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName StringTypeHandler.java
 * @Description String类型处理器
 * @createTime 2023年06月22日 21:20:00
 */
public class StringTypeHandler extends BaseTypeHandler<String>{

    @Override
    protected void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter);
    }

    @Override
    protected String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return rs.getString(columnName);
    }


}


package com.cqut.atao.mybatis.mapping;


import com.cqut.atao.mybatis.session.Configuration;
import com.cqut.atao.mybatis.type.JdbcType;
import com.cqut.atao.mybatis.type.TypeHandler;

/**
 * 结果映射
 */
public class ResultMapping {

    private Configuration configuration;

    private String property;
    private String column;
    private Class<?> javaType;
    private JdbcType jdbcType;
    private TypeHandler<?> typeHandler;

    ResultMapping() {
    }

    public static class Builder {
        private ResultMapping resultMapping = new ResultMapping();


    }

}

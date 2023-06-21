package com.cqut.atao.mybatis.builder;

import com.cqut.atao.mybatis.mapping.BoundSql;
import com.cqut.atao.mybatis.mapping.ParameterMapping;
import com.cqut.atao.mybatis.mapping.SqlSource;
import com.cqut.atao.mybatis.session.Configuration;

import java.util.List;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName StaticSqlSource.java
 * @Description 静态SQL源码
 * @createTime 2023年06月21日 17:13:00
 */
public class StaticSqlSource implements SqlSource {

    private String sql;
    private List<ParameterMapping> parameterMappings;
    private Configuration configuration;

    public StaticSqlSource(Configuration configuration, String sql) {
        this(configuration, sql, null);
    }

    public StaticSqlSource(Configuration configuration, String sql, List<ParameterMapping> parameterMappings) {
        this.sql = sql;
        this.parameterMappings = parameterMappings;
        this.configuration = configuration;
    }

    @Override
    public BoundSql getBoundSql(Object parameterObject) {
        return new BoundSql(configuration, sql, parameterMappings, parameterObject);
    }

}


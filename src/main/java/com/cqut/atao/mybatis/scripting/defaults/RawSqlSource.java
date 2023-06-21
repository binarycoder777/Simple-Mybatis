package com.cqut.atao.mybatis.scripting.defaults;

import com.cqut.atao.mybatis.builder.SqlSourceBuilder;
import com.cqut.atao.mybatis.mapping.BoundSql;
import com.cqut.atao.mybatis.mapping.SqlSource;
import com.cqut.atao.mybatis.scripting.xmltags.DynamicContext;
import com.cqut.atao.mybatis.scripting.xmltags.SqlNode;
import com.cqut.atao.mybatis.session.Configuration;

import java.util.HashMap;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName RawSqlSource.java
 * @Description 原始SQL源码
 * @createTime 2023年06月21日 16:43:00
 */
public class RawSqlSource implements SqlSource {

    private final SqlSource sqlSource;

    public RawSqlSource(Configuration configuration, SqlNode rootSqlNode, Class<?> parameterType) {
        this(configuration, getSql(configuration, rootSqlNode), parameterType);
    }

    public RawSqlSource(Configuration configuration, String sql, Class<?> parameterType) {
        SqlSourceBuilder sqlSourceParser = new SqlSourceBuilder(configuration);
        Class<?> clazz = parameterType == null ? Object.class : parameterType;
        sqlSource = sqlSourceParser.parse(sql, clazz, new HashMap<>());
    }

    @Override
    public BoundSql getBoundSql(Object parameterObject) {
        return sqlSource.getBoundSql(parameterObject);
    }

    private static String getSql(Configuration configuration, SqlNode rootSqlNode) {
        DynamicContext context = new DynamicContext(configuration, null);
        rootSqlNode.apply(context);
        return context.getSql();
    }

}

package com.cqut.atao.mybatis.session.defaults;

import com.cqut.atao.mybatis.binding.MapperRegistry;
import com.cqut.atao.mybatis.session.SqlSession;
import com.cqut.atao.mybatis.session.SqlSessionFactory;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName DefaultSqlSessionFactory.java
 * @Description 默认的 DefaultSqlSessionFactory
 * @createTime 2022年09月24日 23:00:00
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }

}

package com.cqut.atao.mybatis.session.defaults;


import com.cqut.atao.mybatis.mapping.MappedStatement;
import com.cqut.atao.mybatis.session.Configuration;
import com.cqut.atao.mybatis.session.SqlSession;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName DefaultSqlSession.java
 * @Description 默认SqlSession实现类
 * @createTime 2022年09月24日 22:52:00
 */
public class DefaultSqlSession implements SqlSession {

    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了！" + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        MappedStatement mappedStatement = configuration.getMappedStatement(statement);
        return (T) ("你被代理了！" + "\n方法：" + statement + "\n入参：" + parameter + "\n待执行SQL：" + mappedStatement.getSql());
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return configuration.getMapper(type, this);
    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

}

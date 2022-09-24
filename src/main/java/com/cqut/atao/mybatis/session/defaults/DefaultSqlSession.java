package com.cqut.atao.mybatis.session.defaults;

import com.cqut.atao.mybatis.binding.MapperRegistry;
import com.cqut.atao.mybatis.session.SqlSession;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName DefaultSqlSession.java
 * @Description 默认SqlSession实现类
 * @createTime 2022年09月24日 22:52:00
 */
public class DefaultSqlSession implements SqlSession {

    /**
     * 映射器注册机
     */
    private MapperRegistry mapperRegistry;

    public DefaultSqlSession(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了！" + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        return (T) ("你被代理了！" + "方法：" + statement + " 入参：" + parameter);
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return mapperRegistry.getMapper(type, this);
    }


}

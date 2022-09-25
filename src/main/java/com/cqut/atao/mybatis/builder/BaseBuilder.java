package com.cqut.atao.mybatis.builder;

import com.cqut.atao.mybatis.session.Configuration;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BaseBuilder.java
 * @Description 构建器的基类，建造者模式
 * @createTime 2022年09月24日 23:49:00
 */
public abstract class BaseBuilder {

    protected final Configuration configuration;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }


}

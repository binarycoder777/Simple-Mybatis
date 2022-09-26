package com.cqut.atao.mybatis.session;

import com.cqut.atao.mybatis.builder.xml.XMLConfigBuilder;
import com.cqut.atao.mybatis.session.defaults.DefaultSqlSessionFactory;

import java.io.Reader;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName SqlSessionFactoryBuilder.java
 * @Description 构建SqlSessionFactory的工厂
 * @createTime 2022年09月25日 00:00:00
 */
public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(Reader reader) {
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        return build(xmlConfigBuilder.parse());
    }

    public SqlSessionFactory build(Configuration config) {
        return new DefaultSqlSessionFactory(config);
    }

}

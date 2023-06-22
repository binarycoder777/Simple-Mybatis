package com.cqut.atao.mybatis.scripting;

import com.cqut.atao.mybatis.executor.parameter.ParameterHandler;
import com.cqut.atao.mybatis.mapping.BoundSql;
import com.cqut.atao.mybatis.mapping.MappedStatement;
import com.cqut.atao.mybatis.mapping.SqlSource;
import com.cqut.atao.mybatis.session.Configuration;
import org.dom4j.Element;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName LanguageDriver.java
 * @Description 脚本语言驱动
 * @createTime 2023年06月21日 16:33:00
 */
public interface LanguageDriver {

    /**
     * 创建SQL源码(mapper xml方式)
     */
    SqlSource createSqlSource(Configuration configuration, Element script, Class<?> parameterType);

    /**
     * 创建参数处理器
     */
    ParameterHandler createParameterHandler(MappedStatement mappedStatement, Object parameterObject, BoundSql boundSql);

}

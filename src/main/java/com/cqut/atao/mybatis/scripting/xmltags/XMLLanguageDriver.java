package com.cqut.atao.mybatis.scripting.xmltags;

import com.cqut.atao.mybatis.executor.parameter.ParameterHandler;
import com.cqut.atao.mybatis.mapping.BoundSql;
import com.cqut.atao.mybatis.mapping.MappedStatement;
import com.cqut.atao.mybatis.mapping.SqlSource;
import com.cqut.atao.mybatis.scripting.LanguageDriver;
import com.cqut.atao.mybatis.scripting.defaults.DefaultParameterHandler;
import com.cqut.atao.mybatis.scripting.defaults.RawSqlSource;
import com.cqut.atao.mybatis.session.Configuration;
import org.dom4j.Element;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName XMLLanguageDriver.java
 * @Description XML语言驱动器
 * @createTime 2023年06月21日 16:48:00
 */
public class XMLLanguageDriver implements LanguageDriver {

    @Override
    public SqlSource createSqlSource(Configuration configuration, Element script, Class<?> parameterType) {
        // 用XML脚本构建器解析
        XMLScriptBuilder builder = new XMLScriptBuilder(configuration, script, parameterType);
        return builder.parseScriptNode();
    }

    /**
     * step-12 新增方法，用于处理注解配置 SQL 语句
     */
    @Override
    public SqlSource createSqlSource(Configuration configuration, String script, Class<?> parameterType) {
        // 暂时不解析动态 SQL
        return new RawSqlSource(configuration, script, parameterType);
    }

    @Override
    public ParameterHandler createParameterHandler(MappedStatement mappedStatement, Object parameterObject, BoundSql boundSql) {
        return new DefaultParameterHandler(mappedStatement, parameterObject, boundSql);
    }


}

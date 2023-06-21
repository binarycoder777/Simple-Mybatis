package com.cqut.atao.mybatis.scripting;

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

    SqlSource createSqlSource(Configuration configuration, Element script, Class<?> parameterType);

}

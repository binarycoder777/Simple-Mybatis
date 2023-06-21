package com.cqut.atao.mybatis.scripting.xmltags;

import com.cqut.atao.mybatis.mapping.SqlSource;
import com.cqut.atao.mybatis.scripting.LanguageDriver;
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

}

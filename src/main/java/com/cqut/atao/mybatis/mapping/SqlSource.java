package com.cqut.atao.mybatis.mapping;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName SqlSource.java
 * @Description SQL源码
 * @createTime 2023年06月21日 16:34:00
 */
public interface SqlSource {

    BoundSql getBoundSql(Object parameterObject);

}

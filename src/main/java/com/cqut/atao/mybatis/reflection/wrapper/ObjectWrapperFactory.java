package com.cqut.atao.mybatis.reflection.wrapper;

import com.cqut.atao.mybatis.reflection.MetaObject;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ObjectWrapperFactory.java
 * @Description 对象包装工厂
 * @createTime 2022年09月29日 10:41:00
 */
public interface ObjectWrapperFactory {

    /**
     * 判断有没有包装器
     */
    boolean hasWrapperFor(Object object);

    /**
     * 得到包装器
     */
    ObjectWrapper getWrapperFor(MetaObject metaObject, Object object);

}

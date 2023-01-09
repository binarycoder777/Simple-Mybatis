package com.cqut.atao.mybatis.reflection.wrapper;

import com.cqut.atao.mybatis.reflection.MetaObject;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName DefaultObjectWrapperFactory.java
 * @Description 默认对象包装工厂
 * @createTime 2022年09月29日 10:43:00
 */
public class DefaultObjectWrapperFactory implements ObjectWrapperFactory {

    @Override
    public boolean hasWrapperFor(Object object) {
        return false;
    }

    @Override
    public ObjectWrapper getWrapperFor(MetaObject metaObject, Object object) {
        throw new RuntimeException("The DefaultObjectWrapperFactory should never be called to provide an ObjectWrapper.");
    }

}

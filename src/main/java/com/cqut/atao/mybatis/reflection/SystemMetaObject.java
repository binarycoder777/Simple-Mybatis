package com.cqut.atao.mybatis.reflection;

import com.cqut.atao.mybatis.reflection.factory.DefaultObjectFactory;
import com.cqut.atao.mybatis.reflection.factory.ObjectFactory;
import com.cqut.atao.mybatis.reflection.wrapper.DefaultObjectWrapperFactory;
import com.cqut.atao.mybatis.reflection.wrapper.ObjectWrapperFactory;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName SystemMetaObject.java
 * @Description 一些系统级别的元对象
 * @createTime 2022年10月05日 19:16:00
 */
public class SystemMetaObject {

    public static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
    public static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
    public static final MetaObject NULL_META_OBJECT = MetaObject.forObject(NullObject.class, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);

    private SystemMetaObject() {
        // Prevent Instantiation of Static Class
    }

    /**
     * 空对象
     */
    private static class NullObject {
    }

    public static MetaObject forObject(Object object) {
        return MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);
    }

}


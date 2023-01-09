package com.cqut.atao.mybatis.reflection;

import cn.hutool.core.map.MapWrapper;
import com.cqut.atao.mybatis.reflection.factory.ObjectFactory;
import com.cqut.atao.mybatis.reflection.wrapper.BeanWrapper;
import com.cqut.atao.mybatis.reflection.wrapper.CollectionWrapper;
import com.cqut.atao.mybatis.reflection.wrapper.ObjectWrapper;
import com.cqut.atao.mybatis.reflection.wrapper.ObjectWrapperFactory;

import java.util.Collection;
import java.util.Map;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName MetaObject.java
 * @Description 元对象
 * @createTime 2022年09月29日 10:18:00
 */
public class MetaObject {
    // 原对象
    private Object originalObject;
    // 对象包装器
    private ObjectWrapper objectWrapper;
    // 对象工厂
    private ObjectFactory objectFactory;
    // 对象包装工厂
    private ObjectWrapperFactory objectWrapperFactory;

    private MetaObject(Object object, ObjectFactory objectFactory, ObjectWrapperFactory objectWrapperFactory) {
        this.originalObject = object;
        this.objectFactory = objectFactory;
        this.objectWrapperFactory = objectWrapperFactory;

        if (object instanceof ObjectWrapper) {
            // 如果对象本身已经是ObjectWrapper型，则直接赋给objectWrapper
            this.objectWrapper = (ObjectWrapper) object;
        } else if (objectWrapperFactory.hasWrapperFor(object)) {
            // 如果有包装器,调用ObjectWrapperFactory.getWrapperFor
            this.objectWrapper = objectWrapperFactory.getWrapperFor(this, object);
        } else if (object instanceof Map) {
            // 如果是Map型，返回MapWrapper
            this.objectWrapper = new MapWrapper(this, (Map) object);
        } else if (object instanceof Collection) {
            // 如果是Collection型，返回CollectionWrapper
            this.objectWrapper = new CollectionWrapper(this, (Collection) object);
        } else {
            // 除此以外，返回BeanWrapper
            this.objectWrapper = new BeanWrapper(this, object);
        }
    }

}

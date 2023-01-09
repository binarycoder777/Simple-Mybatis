package com.cqut.atao.mybatis.reflection.invoker;

import java.lang.reflect.Field;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName GetFieldInvoker.java
 * @Description getter 调用者
 * @createTime 2022年09月28日 16:27:00
 */
public class GetFieldInvoker implements Invoker {

    private Field field;

    public GetFieldInvoker(Field field) {
        this.field = field;
    }

    @Override
    public Object invoke(Object target, Object[] args) throws Exception {
        return field.get(target);
    }

    @Override
    public Class<?> getType() {
        return field.getType();
    }
}

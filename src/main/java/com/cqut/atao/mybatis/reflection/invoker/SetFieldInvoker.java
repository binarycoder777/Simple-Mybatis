package com.cqut.atao.mybatis.reflection.invoker;

import java.lang.reflect.Field;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName SetFieldInvoker.java
 * @Description setter 调用者
 * @createTime 2022年09月28日 16:28:00
 */
public class SetFieldInvoker implements Invoker {

    private Field field;

    public SetFieldInvoker(Field field) {
        this.field = field;
    }

    @Override
    public Object invoke(Object target, Object[] args) throws Exception {
        field.set(target, args[0]);
        return null;
    }

    @Override
    public Class<?> getType() {
        return field.getType();
    }

}

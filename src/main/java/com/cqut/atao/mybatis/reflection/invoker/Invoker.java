package com.cqut.atao.mybatis.reflection.invoker;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName Invoker.java
 * @Description 调用者
 * @createTime 2022年09月28日 16:20:00
 */
public interface Invoker {

    Object invoke(Object target, Object[] args) throws Exception;

    Class<?> getType();

}

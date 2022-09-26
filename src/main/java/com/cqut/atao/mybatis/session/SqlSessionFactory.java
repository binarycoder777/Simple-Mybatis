package com.cqut.atao.mybatis.session;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName SqlSessionFactory.java
 * @Description 工厂模式接口，构建SqlSession的工厂
 * @createTime 2022年09月24日 22:33:00
 */
public interface SqlSessionFactory {

    /**
     * 打开一个 session
     *
     * @return SqlSession
     */
    SqlSession openSession();

}

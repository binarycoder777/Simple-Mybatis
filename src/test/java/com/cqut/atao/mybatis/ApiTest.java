package com.cqut.atao.mybatis;

import com.alibaba.fastjson.JSON;
import com.cqut.atao.mybatis.builder.xml.XMLConfigBuilder;
import com.cqut.atao.mybatis.dao.IUserDao;
import com.cqut.atao.mybatis.io.Resources;
import com.cqut.atao.mybatis.po.User;
import com.cqut.atao.mybatis.session.Configuration;
import com.cqut.atao.mybatis.session.SqlSession;
import com.cqut.atao.mybatis.session.SqlSessionFactory;
import com.cqut.atao.mybatis.session.SqlSessionFactoryBuilder;
import com.cqut.atao.mybatis.session.defaults.DefaultSqlSession;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ApiTest.java
 * @Description api test
 * @createTime 2022年09月26日 10:42:00
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        // 1. 从SqlSessionFactory中获取SqlSession
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config-datasource.xml"));
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void test_queryUserInfoById() {
        // 1. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 2. 测试验证：基本参数
        User user = userDao.queryUserInfoById(1L);
        logger.info("测试结果：{}", JSON.toJSONString(user));
    }

    @Test
    public void test_queryUserInfo() {
        // 1. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 2. 测试验证：对象参数
        User user = userDao.queryUserInfo(new User(1L, "10001"));
        logger.info("测试结果：{}", JSON.toJSONString(user));
    }


}

package com.cqut.atao.mybatis.dao;

import com.cqut.atao.mybatis.po.User;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName IUserDao.java
 * @Description TODO
 * @createTime 2022年09月26日 10:40:00
 */
public interface IUserDao {

    User queryUserInfoById(Long uId);

    User queryUserInfo(User req);

}

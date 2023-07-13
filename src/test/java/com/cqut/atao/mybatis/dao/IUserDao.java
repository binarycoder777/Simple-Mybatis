package com.cqut.atao.mybatis.dao;

import com.cqut.atao.mybatis.annotations.Insert;
import com.cqut.atao.mybatis.annotations.Select;
import com.cqut.atao.mybatis.po.User;

import java.util.List;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName IUserDao.java
 * @Description TODO
 * @createTime 2022年09月26日 10:40:00
 */
public interface IUserDao {

    User queryUserInfo(User req);


//    List<User> queryUserInfoList();

    int updateUserInfo(User req);

    void insertUserInfo(User req);

    int deleteUserInfoByUserId(String userId);


    @Select("SELECT id, userId, userName, userHead\n" +
            "FROM user\n" +
            "where id = #{id}")
    User queryUserInfoById(Long id);

    @Select("SELECT id, userId, userName, userHead\n" +
            "FROM user")
    List<User> queryUserInfoList();


}

package com.sand.mybatis.dao;

import com.sand.mybatis.pojo.User;

public interface UserDao {
    /*根据id查找用户*/
    public String getUserById(Integer id);
    /*插入用户*/
    public void insertUser(User user);
    /*name find user*/
    public String getUseByUsername(String username);
    /*update*/
    public void updateUsername(User user);
    /*delete*/
    public void delete(Integer id);
}

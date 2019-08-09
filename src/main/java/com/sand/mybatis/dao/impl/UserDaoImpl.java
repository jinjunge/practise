package com.sand.mybatis.dao.impl;

import com.sand.mybatis.dao.UserDao;
import com.sand.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public String getUserById(Integer id) {
        SqlSession sqlSession=super.getSqlSession();
        User user=sqlSession.selectOne("user.findUserById",id);
        return user.toString();
    }

    @Override
    public void insertUser(User user) {
        SqlSession sqlSession=super.getSqlSession();
        sqlSession.insert("user.insertUser",user);
    }

    @Override
    public String getUseByUsername(String username) {
        SqlSession sqlSession=super.getSqlSession();
        List<User> user=sqlSession.selectList("user.getUserByUsername",username);
        for (User user1 :user){
            System.out.println(user1.toString());
        }
        return "123";
    }

    @Override
    public void updateUsername(User user) {
        SqlSession sqlSession=super.getSqlSession();
        sqlSession.update("user.updateUser",user);
    }

    @Override
    public void delete(Integer id) {
        SqlSession sqlSession=super.getSqlSession();
        sqlSession.delete("user.deleteUser",id);
    }

}

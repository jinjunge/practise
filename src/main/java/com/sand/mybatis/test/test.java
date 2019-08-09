package com.sand.mybatis.test;

import com.sand.mybatis.dao.UserDao;
import com.sand.mybatis.pojo.User;
import com.sand.tx.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;

/*测试环境*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class test {
    @Autowired
    private ApplicationContext applicationContext;
    @Resource(name="userDao")
    UserDao userDao;
    @Test
    public void  test1(){
      /*  System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));
        String name=userDao.getUserById(1);
        System.out.println(name);
        User user=new User();
        user.setAddress("zhejiang");
        Date date=new Date();
        user.setBirthday(date);
        user.setSex("男");
        user.setUsername("张是");
        //userDao.insertUser(user);
        System.out.println(userDao.getUseByUsername("张"));*/
//        User user=new User();
//        user.setId(28);
//        user.setUsername("tian cai");
//        userDao.updateUsername(user);
        userDao.delete(27);

    }
}

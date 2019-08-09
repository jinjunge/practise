package com.sand.mybatis.test;

import com.sand.mybatis.mapper.OrderMapper;
import com.sand.mybatis.mapper.UserMapper;
import com.sand.mybatis.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context. ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class MapperTest {
    @Autowired
    OrderMapper orderMapper;
    @Test
    public void test(){
        /*ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
        OrderMapper orderMapper=applicationContext.getBean(OrderMapper.class);*/
        //Order order=orderMapper.selectByPrimaryKey(3);
        System.out.println(orderMapper.selectByPrimaryKey(3));
    }

}

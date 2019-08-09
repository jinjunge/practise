package com.sand.dao;


import com.sand.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
* 使用jdbc模板
*
* */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class jdbcDemo1 {
    @Resource(name="jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Test
    //保存
    public void demo1(){
/*//        创建连接池

        DriverManagerDataSource datasource=new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://172.27.82.2:3306/spring");
        datasource.setUsername("root");
        datasource.setPassword("password");


//        创建jdbc模板
        JdbcTemplate  jt=new JdbcTemplate(datasource);*/
        jdbcTemplate.update("insert into account values (null,?,?)","hello2",1000d);
    }
    @Test
    //修改
    public void vi(){
        jdbcTemplate.update("update account set name=? ,money = ? where id=1","gejinjun",1);
    }
    @Test
    //删除
    public void remove(){
        jdbcTemplate.update("delete from account  where id = ?",1);
    }
    @Test
    //query
    public void query(){
        String name=jdbcTemplate.queryForObject("select name from account where id=?",String.class,2);
        System.out.println(name);
    }
    @Test
    //查询统计
    public void query1(){
        int count=jdbcTemplate.queryForObject("select count(*) from account",Integer.class);
        System.out.println(count);
    }
    @Test
    //封装到对象中
    public void query2() {
        Account account = jdbcTemplate.queryForObject("select * from account where id=?", new MyRowMapper(),3);
        System.out.println(account);
    }
    @Test
    //封装到对象数组中
    public void query3() {
        List<Account> account1 = jdbcTemplate.query("select * from account", new MyRowMapper());
        System.out.println(account1);
    }
    class MyRowMapper implements RowMapper<Account> {
        @Override
        public Account mapRow(ResultSet resultSet, int i) throws SQLException {
            Account a=new Account();
            a.setId(resultSet.getInt("id"));
            a.setMoney(resultSet.getDouble("money"));
            a.setName(resultSet.getString("name"));
            return a;
        }

    }


}

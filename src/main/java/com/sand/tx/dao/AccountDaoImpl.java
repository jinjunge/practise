package com.sand.tx.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.annotation.Resource;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void outMoney(String from, Double money) {
        Double balance=this.getJdbcTemplate().queryForObject("select money from account where name= ?",Double.class,from);
        if(balance>=money){
            this.getJdbcTemplate().update("update account set money= ? where name= ?",balance-money,from);
        }else {
           System.out.println("余额不足");
        }
    }

    @Override
    public void inMoney(String to, Double money) {
        Double balance=this.getJdbcTemplate().queryForObject("select money from account where name= ?",Double.class,to);
        this.getJdbcTemplate().update("update account set money = ? where name= ?",money+balance,to);
    }

}

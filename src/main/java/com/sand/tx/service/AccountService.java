package com.sand.tx.service;
/*
* 转账的业务层接口
* */
public interface AccountService {
    public void transfer(String from,String to,Double money);



}

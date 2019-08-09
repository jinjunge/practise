package com.sand.tx;

import com.sand.tx.dao.AccountDao;
import com.sand.tx.dao.AccountDaoImpl;
import com.sand.tx.service.AccountService;
import com.sand.tx.service.AccountServiceImpl;
import org.aspectj.apache.bcel.util.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;

/*测试环境*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext1.xml")
public class test {
    @Autowired
    private ApplicationContext applicationContext;
    @Resource(name="accountService")
    AccountService accountService;
    @Test
    public void test1(){
        System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));
        accountService.transfer("gejinjun","gejinjun1",10d);
    }
}

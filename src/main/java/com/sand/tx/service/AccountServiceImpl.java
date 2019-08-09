package com.sand.tx.service;

import com.sand.tx.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/*转账的业务层实现类
*/
@Transactional
public class AccountServiceImpl implements AccountService {
   /* //注入事务管理模板
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
*/
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String from, String to, Double money) {

        accountDao.outMoney(from,money);
        int d=1/0;
        accountDao.inMoney(to,money);
    }
}

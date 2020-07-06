package com.san.service.impl;

import com.san.dao.AccountDao;
import com.san.domain.Account;
import com.san.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 三七 on 2020/4/22.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountDao accountDao;
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }



    @Override
    public List<Account> findAll() {

        System.out.println("业务层：查询所有账户...");
        return accountDao.findAll();
    }
}

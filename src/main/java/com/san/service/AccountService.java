package com.san.service;

import com.san.domain.Account;

import java.util.List;

/**
 * Created by 三七 on 2020/4/22.
 */
public interface AccountService {

    public void saveAccount(Account account);

    public List<Account> findAll();

}

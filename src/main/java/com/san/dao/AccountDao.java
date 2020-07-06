package com.san.dao;

import com.san.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

    /**
     * Created by 三七 on 2020/4/22.
     */
    @Repository
    public interface AccountDao {

        @Insert(value="insert into account (name,money) values (#{name},#{money})")
        public void saveAccount(Account account);

        @Select("select * from account")
        public List<Account> findAll();

}

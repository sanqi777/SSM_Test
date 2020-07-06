package com.san.controller;

import com.san.domain.Account;
import com.san.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 三七 on 2020/4/22.
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("执行了查询账户");
        List<Account> list = accountService.findAll();
       model.addAttribute("list",list);
        return "list";
    }
}

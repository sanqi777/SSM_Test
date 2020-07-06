package com.san.controller;

import com.san.domain.Role;
import com.san.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 三七 on 2020/6/21.
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private  RoleService roleService;


    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        List<Role> roles = roleService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("roleList",roles);
        mv.setViewName("role-list");
        return mv;
    }


    @RequestMapping("/save.do")
    public String save(Role role){
        roleService.save(role);
        return "redirect:findAll.do";
    }

}

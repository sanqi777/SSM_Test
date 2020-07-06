package com.san.service.impl;

import com.san.dao.UserInfoDao;

import com.san.domain.Role;
import com.san.domain.UserInfo;
import com.san.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 三七 on 2020/5/4.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoDao userDao;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(UserInfo userInfo) {
        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        userDao.save(userInfo);
    }

    @Override
    public UserInfo findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public List<Role> findOtherRole(String userId) {
        return userDao.findOtherRole(userId);
    }

    @Override
    public void addRoleToUser(String userId, String[] roleIds) {
        for (String RoleId : roleIds){
            userDao.addRoleToUser(userId,RoleId);
        }
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       UserInfo userInfo = userDao.selectFindByUserName(username);

        //List<Role> roles = userInfo.getRoles();
        //List<SimpleGrantedAuthority> authoritys = getAuthority(roles);

        //处理自己的用户对象封装成UserDetails
        //User user = new User(userInfo.getP_name(),"{noop}" + userInfo.getP_password(),getAuthority());
        User user = new User(userInfo.getUsername(), userInfo.getPassword(), userInfo.getStatus() == 0 ? false : true, true, true, true, getAuthority(userInfo.getRoles()));
        return user;

    }

    //作用就是返回一个List集合，集合中装入的是角色描述
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {

        List<SimpleGrantedAuthority> authoritys = new ArrayList<>();
        for (Role role : roles) {
            authoritys.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
            System.out.println(role.getRoleName());
        }
        return authoritys;
    }



}

package com.san.service;

import com.san.domain.Role;
import com.san.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by 三七 on 2020/5/4.
 */
public interface UserService extends UserDetailsService {

    List<UserInfo> findAll();

    void save(UserInfo userInfo);

    UserInfo findById(String id);

    List<Role> findOtherRole(String userId);

    void addRoleToUser(String userId, String[] roleIds);
}

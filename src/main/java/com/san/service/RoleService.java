package com.san.service;

import com.san.domain.Role;

import java.util.List;

/**
 * Created by 三七 on 2020/6/21.
 */
public interface RoleService {

    List<Role> findAll();

    void save(Role role);
}

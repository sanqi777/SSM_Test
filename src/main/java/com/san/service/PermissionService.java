package com.san.service;

import com.san.domain.Permission;

import java.util.List;

/**
 * Created by 三七 on 2020/6/21.
 */
public interface PermissionService {

    List<Permission> findAll();

}

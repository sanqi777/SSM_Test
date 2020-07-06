package com.san.dao;

import com.san.domain.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 三七 on 2020/6/21.
 */
public interface PermissionDao {

    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{roleId})")

    List<Permission> findByRoleId(String roleId);

    @Select("select * from permission")
    List<Permission> findAll();
}

package com.san.dao;

import com.san.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by 三七 on 2020/5/5.
 */
public interface RoleDao {

    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    List<Role> selectFindByName(Integer p_job_id );


    @Select("select * from role where id in( select roleId from users_role where userId=#{userId})")
    @Results(
            {
                @Result(id=true,column="id",property="id"),
                @Result(column="roleName",property="roleName"),
                @Result(column="roleDesc",property="roleDesc"),
                @Result(column="id",property="permissions",javaType=List.class,many=@Many(select="com.san.dao.PermissionDao.findByRoleId"))
                        })
       List<Role> findRoleByUserId(String userId );

    @Select("select *from role")
    List<Role> findAll();

    @Insert("insert into role(id,roleName,roleDesc) value(#{id},#{roleName},#{roleDesc})")
    void save(Role role);
}

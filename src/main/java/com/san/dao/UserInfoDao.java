package com.san.dao;


import com.san.domain.Role;
import com.san.domain.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * Created by 三七 on 2020/5/4.
 */
public interface UserInfoDao {

//      @Select("select * from jb_员工 where p_name=#{p_name}")
//      @Results({
//              @Result(id = true, property = "p_id", column = "p_id"),
//              @Result(property = "p_name", column = "p_name"),
//              @Result(property = "p_password", column = "p_password"),
//              @Result(property = "p_tel", column = "p_tel"),
//              @Result(property = "p_add", column = "p_add"),
//              @Result(property = "p_job_id", column = "p_job_id"),
//              @Result(property = "roles",column = "p_job_id",javaType = java.util.List.class,many = @Many(select = "com.san.dao.RoleDao.selectFindByName"))
//      })
@Select("select * from users where username=#{username}")
@Results({
        @Result(id = true, property = "id", column = "id"),
        @Result(property = "username", column = "username"),
        @Result(property = "email", column = "email"),
        @Result(property = "password", column = "password"),
        @Result(property = "phoneNum", column = "phoneNum"),
        @Result(property = "status", column = "status"),
        @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "com.san.dao.RoleDao.selectFindByName"))
})
      UserInfo selectFindByUserName(String p_name);


      @Select("select * from users ")
      List<UserInfo> findAll();

      @Insert("insert into users(id,email,username,password,phoneNum,status) values(#{id},#{email},#{username},#{password},#{phoneNum},#{status})")
     void  save(UserInfo userInfo) ;


      @Select("select * from users where id=#{id}")
      @Results({
              @Result(id = true, property = "id", column = "id"),
              @Result(property = "username", column = "username"),
              @Result(property = "email", column = "email"),
              @Result(property = "password", column = "password"),
              @Result(property = "phoneNum", column = "phoneNum"),
              @Result(property = "status", column = "status"),
              @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "com.san.dao.RoleDao.findRoleByUserId"))
      })
      UserInfo findById(String id);


    @Select("select * from role where id not in( select roleId from users_role where userId=#{userId})")
    List<Role> findOtherRole(String userId);

    @Insert("insert into users_role(userId,roleId) value(#{userId},#{roleId})")
    void addRoleToUser(@Param("userId") String userId,@Param("roleId") String roleId);
}

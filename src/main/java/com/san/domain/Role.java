package com.san.domain;



import java.io.Serializable;
import java.util.List;

/**
 * Created by 三七 on 2020/5/3.
 */
public class Role implements Serializable {

    private String id;
    private String roleName;
    private String roleDesc;
    private List<Permission> permissions;
    private List<UserInfo> users;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<UserInfo> getUsers() {
        return users;
    }

    public void setUsers(List<UserInfo> users) {
        this.users = users;
    }

    //    private Integer job_id;
//    private String  job_zw;
//
//
//    private List<UserInfo> userInfos;
//
//    public List<UserInfo> getUserInfos() {
//        return userInfos;
//    }
//
//    public void setUserInfos(List<UserInfo> userInfos) {
//        this.userInfos = userInfos;
//    }
//
//    public Integer getJob_id() {
//        return job_id;
//    }
//
//    public void setJob_id(Integer job_id) {
//        this.job_id = job_id;
//    }
//
//    public String getJob_zw() {
//        return job_zw;
//    }
//
//    public void setJob_zw(String job_zw) {
//        this.job_zw = job_zw;
//    }
//
//    @Override
//    public String toString() {
//        return "Role{" +
//                "job_id=" + job_id +
//                ", job_zw='" + job_zw + '\'' +
//                ", userInfos=" + userInfos +
//                '}';
//    }
}

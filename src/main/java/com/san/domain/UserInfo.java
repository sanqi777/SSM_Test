package com.san.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 三七 on 2020/5/3.
 */
public class UserInfo implements Serializable {
    private String id;
    private String username;
    private String email;
    private String password;
    private String phoneNum;
    private int status;
    private String statusStr;
    private List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusStr() {
        if (status == 0){
            statusStr = "未开启";
        }else if(status == 1){
            statusStr = "开启";
        }
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", status=" + status +
                ", statusStr='" + statusStr + '\'' +
                ", roles=" + roles +
                '}';
    }

    //    private Integer p_id;
//    private String  p_name;
//    private String  p_password;
//    private String  p_tel;
//    private String  p_add;
//    private Integer p_job_id;
//    private Integer p_w_cellid;
//
//    private List<Role> roles;
//   private List<Workcell> workcells;
//
//
//    public List<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<Role> roles) {
//        this.roles = roles;
//    }
//
//
//
//    public Integer getP_id() {
//        return p_id;
//    }
//
//    public void setP_id(Integer p_id) {
//        this.p_id = p_id;
//    }
//
//    public String getP_name() {
//        return p_name;
//    }
//
//    public void setP_name(String p_name) {
//        this.p_name = p_name;
//    }
//
//    public String getP_password() {
//        return p_password;
//    }
//
//    public void setP_password(String p_password) {
//        this.p_password = p_password;
//    }
//
//    public String getP_tel() {
//        return p_tel;
//    }
//
//    public void setP_tel(String p_tel) {
//        this.p_tel = p_tel;
//    }
//
//    public String getP_add() {
//        return p_add;
//    }
//
//    public void setP_add(String p_add) {
//        this.p_add = p_add;
//    }
//
//    public Integer getP_job_id() {
//        return p_job_id;
//    }
//
//    public void setP_job_id(Integer p_job_id) {
//        this.p_job_id = p_job_id;
//    }
//
//    public Integer getP_w_cellid() {
//        return p_w_cellid;
//    }
//
//    public void setP_w_cellid(Integer p_w_cellid) {
//        this.p_w_cellid = p_w_cellid;
//    }
//
//    @Override
//    public String toString() {
//        return "UserInfo{" +
//                "p_id=" + p_id +
//                ", p_name='" + p_name + '\'' +
//                ", p_password='" + p_password + '\'' +
//                ", p_tel='" + p_tel + '\'' +
//                ", p_add='" + p_add + '\'' +
//                ", p_job_id=" + p_job_id +
//                ", p_w_cellid=" + p_w_cellid +
//                ", roles=" + roles +
//                '}';
//    }

}

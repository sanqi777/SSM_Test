package com.san.domain;

/**
 * Created by 三七 on 2020/5/18.
 */
public class Stool {
    private Integer s_id;
    private Integer s_Sid;
    private String  s_bcode;
    private Integer s_count;
    private Integer s_status;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getS_Sid() {
        return s_Sid;
    }

    public void setS_Sid(Integer s_Sid) {
        this.s_Sid = s_Sid;
    }

    public String getS_bcode() {
        return s_bcode;
    }

    public void setS_bcode(String s_bcode) {
        this.s_bcode = s_bcode;
    }

    public Integer getS_count() {
        return s_count;
    }

    public void setS_count(Integer s_count) {
        this.s_count = s_count;
    }

    public Integer getS_status() {

        return s_status;
    }

    public void setS_status(Integer s_status) {
        this.s_status = s_status;
    }

    @Override
    public String toString() {
        return "Stool{" +
                "s_id=" + s_id +
                ", s_Sid=" + s_Sid +
                ", s_bcode='" + s_bcode + '\'' +
                ", s_count=" + s_count +
                ", s_status=" + s_status +
                '}';
    }
}
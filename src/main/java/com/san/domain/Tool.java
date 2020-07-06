package com.san.domain;

import java.io.Serializable;

/**
 * Created by 三七 on 2020/4/24.
 */
public class Tool implements Serializable {
    private Integer j_id;
    private String  j_code;
    private String  j_name;
    private String  j_UPL;
    private String  j_usedFor;
    private Integer j_PM;
    private String  j_RecOn;
    private String  j_RecBy;
    private String  j_EditOn;
    private String  j_EditBy;
    private String  j_Owner;

    private Model model;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getJ_id() {
        return j_id;
    }

    public void setJ_id(Integer j_id) {
        this.j_id = j_id;
    }

    public String getJ_code() {
        return j_code;
    }

    public void setJ_code(String j_code) {
        this.j_code = j_code;
    }

    public String getJ_name() {
        return j_name;
    }

    public void setJ_name(String j_name) {
        this.j_name = j_name;
    }

    public String getJ_UPL() {
        return j_UPL;
    }

    public void setJ_UPL(String j_UPL) {
        this.j_UPL = j_UPL;
    }

    public String getJ_usedFor() {
        return j_usedFor;
    }

    public void setJ_usedFor(String j_usedFor) {
        this.j_usedFor = j_usedFor;
    }

    public Integer getJ_PM() {
        return j_PM;
    }

    public void setJ_PM(Integer j_PM) {
        this.j_PM = j_PM;
    }

    public String getJ_RecOn() {
        return j_RecOn;
    }

    public void setJ_RecOn(String j_RecOn) {
        this.j_RecOn = j_RecOn;
    }

    public String getJ_RecBy() {
        return j_RecBy;
    }

    public void setJ_RecBy(String j_RecBy) {
        this.j_RecBy = j_RecBy;
    }

    public String getJ_EditOn() {
        return j_EditOn;
    }

    public void setJ_EditOn(String j_EditOn) {
        this.j_EditOn = j_EditOn;
    }

    public String getJ_EditBy() {
        return j_EditBy;
    }

    public void setJ_EditBy(String j_EditBy) {
        this.j_EditBy = j_EditBy;
    }

    public String getJ_Owner() {
        return j_Owner;
    }

    public void setJ_Owner(String j_Owner) {
        this.j_Owner = j_Owner;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "j_id=" + j_id +
                ", j_code='" + j_code + '\'' +
                ", j_name='" + j_name + '\'' +
                ", j_UPL='" + j_UPL + '\'' +
                ", j_usedFor='" + j_usedFor + '\'' +
                ", j_PM=" + j_PM +
                ", j_RecOn='" + j_RecOn + '\'' +
                ", j_RecBy='" + j_RecBy + '\'' +
                ", j_EditOn='" + j_EditOn + '\'' +
                ", j_EditBy='" + j_EditBy + '\'' +
                ", j_Owner='" + j_Owner + '\'' +
                '}';
    }
}

package com.san.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 三七 on 2020/5/3.
 */
public class Workcell implements Serializable {
    private Integer w_cellid;
    private String  workcell;

    private List<UserInfo> userInfos;



    public Integer getW_cellid() {
        return w_cellid;
    }

    public void setW_cellid(Integer w_cellid) {
        this.w_cellid = w_cellid;
    }

    public String getWorkcell() {
        return workcell;
    }

    public void setWorkcell(String workcell) {
        this.workcell = workcell;
    }

    @Override
    public String toString() {
        return "Workcell{" +
                "w_cellid=" + w_cellid +
                ", workcell='" + workcell + '\'' +
                '}';
    }
}

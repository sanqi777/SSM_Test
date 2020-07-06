package com.san.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 三七 on 2020/4/24.
 */
public class Model implements Serializable {
    private Integer model_id;
    private String  model_code;
    private String  model_partno;

    public Integer getModel_id() {
        return model_id;
    }

    public void setModel_id(Integer model_id) {
        this.model_id = model_id;
    }

    public String getModel_code() {
        return model_code;
    }

    public void setModel_code(String model_code) {
        this.model_code = model_code;
    }

    public String getModel_partno() {
        return model_partno;
    }

    public void setModel_partno(String model_partno) {
        this.model_partno = model_partno;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model_id=" + model_id +
                ", model_code='" + model_code + '\'' +
                ", model_partno='" + model_partno + '\'' +
                '}';
    }
}

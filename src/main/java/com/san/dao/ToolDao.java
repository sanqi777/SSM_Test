package com.san.dao;


import com.san.domain.Tool;


import java.util.List;

/**
 * Created by 三七 on 2020/4/24.
 */

public interface ToolDao {


       List <Tool> findAll();

       List<Tool> findByName(String j_code);



}

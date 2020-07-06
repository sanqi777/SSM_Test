package com.san.dao;

import com.san.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 三七 on 2020/6/25.
 */
public interface SysLogDao {


    @Insert("insert into syslog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
     void save(SysLog sysLog);

    @Select("select * from syslog")
    List<SysLog> findAll();
}

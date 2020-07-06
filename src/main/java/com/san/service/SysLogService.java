package com.san.service;

import com.san.domain.SysLog;

import java.util.List;

/**
 * Created by 三七 on 2020/6/25.
 */
public interface SysLogService {

    public void save(SysLog sysLog) ;


    List<SysLog> findAll();
}

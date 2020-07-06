package com.san.service.impl;

import com.github.pagehelper.PageHelper;
import com.san.dao.ToolDao;
import com.san.domain.Tool;
import com.san.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 三七 on 2020/4/24.
 */
@Service("toolService")
public class ToolServiceImpl implements ToolService {

    @Autowired
    private ToolDao toolDao;

    @Override
    public List<Tool> findAll(int page, int size) {

        //参数pageNum是页码值 pageSize代表每页显示条数----------------必须写在执行方法前面
        PageHelper.startPage(page, size);
        return toolDao.findAll();
    }

    @Override
    public List<Tool> findByName(int page, int size, String j_code) {

        PageHelper.startPage(page, size);
        return toolDao.findByName(j_code);
    }



}



package com.san.service;

import com.san.domain.Tool;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 三七 on 2020/4/24.
 */

public interface ToolService {



      List<Tool> findAll(int page, int size);

      List<Tool> findByName(int page, int size,String j_code);


}

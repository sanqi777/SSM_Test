package com.san.controller;

import com.github.pagehelper.PageInfo;
import com.san.domain.Tool;
import com.san.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 三七 on 2020/4/26.
 */
@Controller
@RequestMapping("/tool")
public class ToolController {

    @Autowired
    private ToolService toolService;

    @RequestMapping("/findAll.do")
//    public ModelAndView findAll(){
//        ModelAndView mv = new ModelAndView();
//        List<Tool> toolList = toolService.findAll();
//        mv.addObject("toolList",toolList);
//        mv.setViewName("tool-list");
//        return mv;
//    }
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1") Integer page,@RequestParam(name = "size",required = true,defaultValue = "4") Integer size){
        ModelAndView mv = new ModelAndView();
        List<Tool> toolList = toolService.findAll(page, size);
        //PageInfo就是一个分页bean
        PageInfo pageInfo = new PageInfo(toolList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("tool-list");
        return mv;
    }

    @RequestMapping("/findByName.do")
    public ModelAndView findByName(@RequestParam(value = "name") String j_code,@RequestParam(name = "page",required = true,defaultValue = "1") Integer page, @RequestParam(name = "size",required = true,defaultValue = "4") Integer size) {
        ModelAndView mv = new ModelAndView();
        List<Tool> toolList = toolService.findByName(page, size,j_code);
        //PageInfo就是一个分页bean
        PageInfo pageInfo = new PageInfo(toolList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("tool-list");
        return mv;
    }
}

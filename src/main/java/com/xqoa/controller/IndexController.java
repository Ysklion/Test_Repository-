package com.xqoa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName IndexController
 * @Author dell
 * @Date: 2018/5/8 11:35
 * @Description: TODD
 * @Version 1.0
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView  Index(){
        return new ModelAndView("index");
    }
}

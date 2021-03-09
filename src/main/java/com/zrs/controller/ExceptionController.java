package com.zrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


@Controller
public class ExceptionController {


    @RequestMapping("/testSimpleMappingExceptionResolver")
    public String testSimpleMappingExceptionResolver() {
        String[] values = new String[10];
        // 下标越界了
        System.out.println(values[11]);
        return "success";
    }



    @RequestMapping("/test01")
    public String test01(Date time){
        System.out.println(time);
        return "success";
    }
}

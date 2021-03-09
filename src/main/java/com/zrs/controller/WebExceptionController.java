package com.zrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Controller
public class WebExceptionController {

    @ExceptionHandler(value = { RuntimeException.class })
    public ModelAndView handleRuntimeException2(Exception ex) {
        System.out.println("全局异常处理--[出异常了]:" + ex);
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        return mv;
    }
}

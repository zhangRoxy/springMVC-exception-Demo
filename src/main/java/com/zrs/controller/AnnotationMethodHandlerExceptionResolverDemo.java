package com.zrs.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class AnnotationMethodHandlerExceptionResolverDemo {
    @ExceptionHandler(value = { RuntimeException.class })
    public ModelAndView handleArithmeticException2(Exception ex)
    {
        System.out.println("[出异常了]:" + ex);
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        return mv;
    }
    @ExceptionHandler(value = { ArithmeticException.class })
    public ModelAndView handleArithmeticException(Exception ex) {
        System.out.println("出异常了，算术异常:" + ex);
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        return mv;
    }
    @RequestMapping("/testExceptionHandler1")
    public String test1() {
        String s=null;
        System.out.println(s.length());
        return "success";
    }
    @RequestMapping("/testExceptionHandler2")
    public String test2() {
        int i=100/0;
        return "success";
    }
}

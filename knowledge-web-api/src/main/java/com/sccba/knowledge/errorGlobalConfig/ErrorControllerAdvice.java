package com.sccba.knowledge.errorGlobalConfig;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Hello on 2019/12/24.
 */
@ControllerAdvice(basePackages = "com.sccba.knowledge.controller")
public class ErrorControllerAdvice {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView customGenericExceptionHnadler(Exception exception, HttpServletRequest request){
        String name = request.getParameter("name");
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("error","您请求的页面蹦溃了");
        return modelAndView;
    }
}

package com.atguigu.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Liulei
 * @create 2020-09-10 15:00
 */
@ControllerAdvice
public class exception {
    @ExceptionHandler(ClassNotFoundException.class)
    public String ex(Model model,Exception ex){
        model.addAttribute("exception",ex);
        return "error/5xx";
    }
}

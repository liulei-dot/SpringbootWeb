package com.atguigu.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Liulei
 * @create 2020-09-09 18:42
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("k1","张三");
        map.put("k2","李四");
        System.out.println(map);
        return "test01";
    }
}

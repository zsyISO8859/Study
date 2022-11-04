package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhousy
 * @date : 2022/11/3 17:02
 * @version : 1.0
 */

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello spring boot...";
    }
}

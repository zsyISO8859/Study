package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author : zhousy
 * @date : 2022/11/3 17:02
 * @version : 1.0
 */
@Slf4j
@RestController
public class HelloController {
    @Autowired
    Car car;

    @GetMapping("/getcCar")
    public Car getCar() {
        return car;
    }

    @GetMapping("hello")
    public String hello() {
        return "hello spring boot...";
    }

    @GetMapping("test/{path}")
    public String test(@MatrixVariable("username") String username,
                       @MatrixVariable("password") String password,
                       @MatrixVariable() Map<String, String> map) {
        System.out.println(username + " " + password);
        System.out.println(map);
        return "success";
    }

    @GetMapping("/exception")
    public void exception(){
        int i = 10/0;
    }

}

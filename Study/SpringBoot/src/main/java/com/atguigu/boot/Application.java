package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.util.UrlPathHelper;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        UrlPathHelper urlPathHelper = (UrlPathHelper)run.getBean("mvcUrlPathHelper");
        System.out.println(urlPathHelper);
    }

}

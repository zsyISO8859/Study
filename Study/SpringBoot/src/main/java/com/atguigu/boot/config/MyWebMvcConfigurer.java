package com.atguigu.boot.config;

import com.atguigu.boot.bean.Car;
import com.atguigu.boot.interceptor.LoginInterceptor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : zhousy
 * @date : 2022/11/4 11:12
 * @version : 1.0
 */

@Configuration
@EnableConfigurationProperties(Car.class)
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/test/**");
    }
}

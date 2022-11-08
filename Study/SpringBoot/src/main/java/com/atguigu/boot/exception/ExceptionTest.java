package com.atguigu.boot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author : zhousy
 * @date : 2022/11/8 15:47
 * @version : 1.0
 */

//@ControllerAdvice
public class ExceptionTest {
    @ExceptionHandler(ArithmeticException.class)
    public void getException(){
        System.out.println("ArithmeticException");
    }

    @ExceptionHandler(Exception.class)
    public void getException1(Exception e){
        System.out.println("Exception"+e);
    }
}

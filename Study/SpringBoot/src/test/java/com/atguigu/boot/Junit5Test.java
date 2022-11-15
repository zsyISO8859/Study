package com.atguigu.boot;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.Repeatable;
import java.util.concurrent.TimeUnit;

/**
 * @author : zhousy
 * @date : 2022/11/11 9:54
 * @version : 1.0
 */

@SpringBootTest  //标注了此注解就可以注入springboot的组件，比如jdbcTemplate
@DisplayName("Junit5Test")
public class Junit5Test {


    @DisplayName("测试1DisplayName作用") //给测试的方法起个名字，在控制台的run栏目里面可以看到。
    @Test
    public void testDisplayName() {
        System.out.println("1");
    }

    @Disabled //禁用测试
    @DisplayName("测试2")
    @Test
    public void testDisplayName2() {
        System.out.println("2");
    }

    @Test
    @Timeout(value = 500,unit = TimeUnit.MILLISECONDS) //设置方法运行的时间，超过就抛异常
    public void testTimeout() throws InterruptedException {
        Thread.sleep(600);
    }

    @Test
    @RepeatedTest(5) //连续重复5次测试
    public void testRepeated(){
        System.out.println(5);
    }

    @BeforeEach //每个测试之前都会运行的方法
    public void testBeforeEach() {
        System.out.println("准备开始测试.....");
    }


    @AfterEach  //每个测试之后都会运行的方法
    public void testAfterEach() {
        System.out.println("测试即将结束.....");
    }

    @BeforeAll //所有测试之前会运行的方法
    public static void testBeforeAll() {
        System.out.println("所有测试即将开始.....");
    }

    @AfterAll //所有测试之后会运行的方法
    public static void testAfterAll() {
        System.out.println("所有测试即将结束.....");
    }
}

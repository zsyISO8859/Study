package com.atguigu.boot;

/**
 * @author : zhousy
 * @date : 2022/11/11 11:17
 * @version : 1.0
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 嵌套测试
 */
public class Junit5Test2 {
    @BeforeEach
    void createNewStack() {
        System.out.println(0);
    }

    @Test
    @DisplayName("is instantiated with new Stack()")
    void isInstantiatedWithNew() {
        System.out.println(1);
    }

    @Nested
    @DisplayName("when new")
    class WhenNew {

        @BeforeEach
        void createNewStack() {
            System.out.println(2);
        }

        @Test
        @DisplayName("is empty")
        void isEmpty() {
            System.out.println(3);
        }

        @Test
        @DisplayName("throws EmptyStackException when popped")
        void throwsExceptionWhenPopped() {
            System.out.println(4);
        }

        @Test
        @DisplayName("throws EmptyStackException when peeked")
        void throwsExceptionWhenPeeked() {
            System.out.println(5);
        }

        @Nested
        @DisplayName("after pushing an element")
        class AfterPushing {

            String anElement = "an element";

            @BeforeEach
            void pushAnElement() {
                System.out.println(6);
            }

            @Test
            @DisplayName("it is no longer empty")
            void isNotEmpty() {
                System.out.println(7);
            }

            @Test
            @DisplayName("returns the element when popped and is empty")
            void returnElementWhenPopped() {
                System.out.println(8);
            }

            @Test
            @DisplayName("returns the element when peeked but remains not empty")
            void returnElementWhenPeeked() {
                System.out.println(9);
            }
        }
    }
}

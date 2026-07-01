package com.cts.junit;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void firstTest() {
        System.out.println("Executing First Test");
    }

    @Test
    @Order(2)
    void secondTest() {
        System.out.println("Executing Second Test");
    }

    @Test
    @Order(3)
    void thirdTest() {
        System.out.println("Executing Third Test");
    }
}
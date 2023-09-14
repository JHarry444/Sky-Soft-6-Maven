package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void test5Factorial() {
        Assertions.assertEquals("5!", Factorial.reverse(120));
    }

    @Test
    void testNoneFactorial() {
        Assertions.assertEquals("NONE", Factorial.reverse(150));
    }
}

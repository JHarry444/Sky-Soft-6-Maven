package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Maven auto-detects test classes that start or end with
// the word 'Test'
public class DemoTest {


    @Test // annotates the method as a test
    void testOne() {
        Assertions.assertEquals(1 + 1, 2);
    }

    @Test // annotates the method as a test
    void testTwo() {
        Assertions.assertEquals(1 + 1, 1);
    }

    @Test // annotates the method as a test
    void testThree() {
    }

}

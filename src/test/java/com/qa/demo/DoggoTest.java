package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoggoTest {


    @Test
    void testLength() {
        Assertions.assertTrue(Doggo.compete(12).size() == 99);
    }

    @Test
    void testSkip() {
        Assertions.assertFalse(Doggo.compete(24).contains("24th"));
    }

    @Test
    void test1st() {
        Assertions.assertTrue(Doggo.compete(22).contains("21st"));
    }

    @Test
    void test2nd() {
        Assertions.assertTrue(Doggo.compete(22).contains("32nd"));
    }

    @Test
    void test3rd() {
        Assertions.assertTrue(Doggo.compete(22).contains("43rd"));
    }

    @Test
    void test11th() {
        Assertions.assertTrue(Doggo.compete(22).contains("11th"));
    }

    @Test
    void test12th() {
        Assertions.assertTrue(Doggo.compete(22).contains("12th"));
    }

    @Test
    void test13th() {
        Assertions.assertTrue(Doggo.compete(22).contains("13th"));
    }

}

package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    void testAdd1And1() {
        Assertions.assertEquals(2, Calc.add(1, 1));
    }

    @Test
    void testAdd2And2() {
        Assertions.assertEquals(4, Calc.add(2, 2));
    }

    @Test
    void testAdd3And4() {
        Assertions.assertEquals(7, Calc.add(3, 4));
    }
}

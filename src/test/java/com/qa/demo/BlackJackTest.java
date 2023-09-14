package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackTest {

    @Test
    void testP1Win() {
        Assertions.assertEquals(16, BlackJack.play(16, 15));
    }

    @Test
    void testP1Lose() {
        Assertions.assertEquals(17, BlackJack.play(16, 17));
    }

    @Test
    void testP1Draw() {
        Assertions.assertEquals(18, BlackJack.play(18, 18));
    }

    @Test
    void testP1Bust() {
        Assertions.assertEquals(19, BlackJack.play(27, 19));
    }

    @Test
    void testP2Bust() {
        Assertions.assertEquals(20, BlackJack.play(20, 26));
    }

    @Test
    void testBothBust() {
        Assertions.assertEquals(0, BlackJack.play(30, 29));
    }
}

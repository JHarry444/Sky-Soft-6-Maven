package com.qa.demo.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

@ExtendWith(MockitoExtension.class)
public class TestGame {

    @Mock
    private Random rand;

    @InjectMocks
    private Game game;

    @Test
    void testHeadsCorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(2)).thenReturn(1);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertTrue(this.game.flipCoin(CoinFlip.HEADS));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(2);
    }

    @Test
    void testHeadsIncorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(2)).thenReturn(2);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertFalse(this.game.flipCoin(CoinFlip.HEADS));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(2);
    }

    @Test
    void testTailsCorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(2)).thenReturn(2);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertTrue(this.game.flipCoin(CoinFlip.TAILS));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(2);
    }

    @Test
    void testTailsIncorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(2)).thenReturn(1);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertFalse(this.game.flipCoin(CoinFlip.TAILS));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(2);
    }
}

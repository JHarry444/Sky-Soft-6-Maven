package com.qa.demo.mockito;

import java.util.Random;

public class Game {
    private Random rand = new Random();

    public boolean flipCoin(CoinFlip call) {
        int num = this.rand.nextInt(2);
        CoinFlip actual = null;
        if (num == 1) actual = CoinFlip.HEADS;
        else actual = CoinFlip.TAILS;

        System.out.println("You called " + call);
        System.out.println("And it was " + actual);
        return call == actual;
    }

    public Result rps(RPS player) {
        RPS cpu = RPS.values()[this.rand.nextInt(RPS.values().length)];

        System.out.println("Player: " + player);
        System.out.println("CPU: " + cpu);

        return player.beats(cpu);
    }
}

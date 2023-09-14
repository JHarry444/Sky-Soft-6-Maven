package com.qa.demo;

public class Factorial {

    public static String reverse(float num) {
        int count = 1;
        while (num > 1) num /= ++count;
        return num == 1 ? count + "!" : "NONE";
    }
}

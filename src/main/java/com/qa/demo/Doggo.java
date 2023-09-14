package com.qa.demo;

import java.util.ArrayList;
import java.util.List;

public class Doggo {

    public static List<String> compete(int place) {
        List<String> placements  = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i == place) continue;

            if (i % 10 == 1 && i != 11) placements.add(i + "st");
            else if (i % 10 == 2 && i != 12) placements.add(i + "nd");
            else if (i % 10 == 3 && i != 13) placements.add(i + "rd");
            else placements.add(i + "th");
        }


        return placements;
    }
}

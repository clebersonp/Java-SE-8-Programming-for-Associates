package com.readlearncode.lesson1.section3.subsection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CollectionsSort {

    public static void main(String... args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(-30);
        scores.add(80);
        scores.add(0);
        Collections.sort(scores);
        System.out.print(scores);
    }
}
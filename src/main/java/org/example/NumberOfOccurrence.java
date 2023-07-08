package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class NumberOfOccurrence {
    public static void main(String[] args) {
        String testString = "iloveendgame";
        String[] splitStr = testString.split("");

        Map<String,Long> charOcc = Arrays.stream(splitStr).
                        collect(Collectors.groupingBy(e->e , Collectors.counting()));

        System.out.println(charOcc);
    }
}

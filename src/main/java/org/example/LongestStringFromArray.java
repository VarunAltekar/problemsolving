package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestStringFromArray {
    public static void main(String[] args) {
        String[] given = {"Longest","String","From","Array"};

        String key = Arrays.stream(given)
                        .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                                .get();
        System.out.println(key);
    }
}

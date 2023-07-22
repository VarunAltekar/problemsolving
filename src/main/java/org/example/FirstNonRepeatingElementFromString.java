package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstNonRepeatingElementFromString {
    public static void main(String[] args) {
        String name = "aabbccdef";

        String nonRepeatingChar = Arrays.stream(name.split("")).collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e-> e.getValue() == 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println(nonRepeatingChar);
    }
}

package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstRepeatingElementFromString {

    public static void main(String[] args) {
    String name = "abcdeeaff";

    String repeatingChar = Arrays.stream(name.split("")).
            collect(Collectors.groupingBy(e->e, LinkedHashMap::new,Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e-> e.getValue() > 1)
            .findFirst()
            .get()
            .getKey();

    System.out.println(repeatingChar);
    }
}

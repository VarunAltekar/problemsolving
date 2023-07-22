package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class DuplicateElementFromString {
    public static void main(String[] args) {
        String test = "iloveendgame";

        Map<String, Long> dupCount = Arrays.stream(test.split("")).
                collect(Collectors.groupingBy(e->e, Collectors.counting()));
        List<String> dupChars = new ArrayList<>();
        for(Map.Entry c : dupCount.entrySet()){
            if( (long)c.getValue() > 1){
                dupChars.add(c.getKey().toString());
            }
        }
        System.out.println(dupCount);
        System.out.println(dupChars);
    }
}

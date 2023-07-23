package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementsInArrayThatStartsWithGiven {
    public static void main(String[] args) {
        // find all element starts with 1
        int[] numbers = {5,23,12,21,1,31,34};

        List<String> ans = Arrays.stream(numbers)
                .boxed()
                .map(s -> "" + s )
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}

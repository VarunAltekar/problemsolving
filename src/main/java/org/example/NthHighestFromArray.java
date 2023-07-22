package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class NthHighestFromArray {
    public static void main(String[] args) {
        int[] sal = {23,54,11,87,10};

        Integer secondHighestNumber = Arrays.stream(sal).boxed()
                //.sorted(Comparator.naturalOrder())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get()
                .intValue();
        System.out.println(secondHighestNumber);
    }
}

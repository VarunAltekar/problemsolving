package com.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        twoSum(nums, 5);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> complementVal = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            int comp = target - nums[i];
            if(complementVal.containsKey(comp)) {
                result[0] = i;
                result[1] = complementVal.get(comp);
                System.out.println(result[0] + ":" + result[1]);
                return result;
            }
            complementVal.put(nums[i], i);
        }
        return result;
    }
}

package com.slidingwindow;

import java.util.Arrays;
import java.util.HashSet;

public class MinDiffBetHigAndLowInKScores {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        minimumDifference(nums, 3);
    }

    public static int minimumDifference(int[] nums, int k) {
        if(k == 1)
            return 0;
        Arrays.sort(nums);
        int diff = 0;
        int maxDiff = 0;
        for(int i =0, j = i+k-1 ; i <= nums.length - k ; i++, j++){
            diff = nums[j] - nums[i];
            if(diff < maxDiff || maxDiff == 0)
                maxDiff = diff;
        }
        return maxDiff;
    }
}

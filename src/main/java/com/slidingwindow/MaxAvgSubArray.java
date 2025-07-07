package com.slidingwindow;

import java.util.Arrays;

public class MaxAvgSubArray {
    public static void main(String[] args) {
        int[] nums = {0,1,1,3,3};
        findMaxAverage(nums, 4);
    }
    public static double findMaxAverage(int[] nums, int k) {

        double current = 0;
        double result = 0;
        for(int i=0; i < k ; i++) {
            current = nums[i] + current;
        }
        if(nums.length == k){
            result = current / k;
            return result;
        }

        double maxx = current;
        for(int i=1; i <= nums.length - k; i++ ){
            current = current - nums[i-1] + nums[i+k-1];
            if(current > maxx)
                maxx = current;
        }
        result = maxx / k;
        System.out.println(result);
        return result;
    }
}

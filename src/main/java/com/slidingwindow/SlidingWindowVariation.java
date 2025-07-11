package com.slidingwindow;

public class SlidingWindowVariation {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        maxSumSubArray(nums, 2);
    }

    public static void maxSumSubArray(int[] nums, int k) {
        int i=0,j=0, sum=0, maxx = 0;
        while(j<nums.length){
            sum = sum + nums[j];
            if(j-i+1 < k)
                j++;
            else if (j-i+1 == k) {
                if(maxx < sum)
                    maxx = sum;

                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        System.out.println(maxx);
    }
}

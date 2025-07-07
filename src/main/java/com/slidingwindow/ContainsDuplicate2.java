package com.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        //int[] nums = {13,23,1,2,3};
        int[] nums = {4,5,0,1,1};

        System.out.println( containsNearbyDuplicate(nums, 5) );
    }

    /**
     *
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(res.containsKey(nums[i])){
                if(Math.abs(i-res.get(nums[i])) <= k)
                    System.out.println(" value==" +res.get(nums[i]));
                    return true;
            }
            res.put(nums[i], i);
        }
        return false;
    }




}

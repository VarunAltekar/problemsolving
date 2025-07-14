package com.slidingwindow;

import java.util.Arrays;
import java.util.List;

public class MinPosSumSubArray {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(17,13);
        System.out.println( minPosSumSubArray(nums, 1, 2) );
    }

    public static int minPosSumSubArray(List<Integer> nums, int l, int r){
        int i=0,j=0,k=0,sumSmallWindow=0,sumLargeWindow=0, maxx =Integer.MAX_VALUE;

        while(k < nums.size()){

            sumSmallWindow += nums.get(j);
            sumLargeWindow += nums.get(k);
            if(j-i+1 < l) {
                j++;
            }
            else if (j-i+1 == l && k-i+1 < r) {
                if(sumSmallWindow > 0 && sumSmallWindow < maxx)
                    maxx = sumSmallWindow;
            }
            if(k-i+1 < r)
                k++;
            else if (k-i+1 == r) {
                if(sumLargeWindow > 0 && sumLargeWindow < maxx)
                    maxx = sumLargeWindow;
                if(k != 1){
                    sumSmallWindow = sumSmallWindow - nums.get(i);
                    sumLargeWindow = sumLargeWindow - nums.get(i);
                }

                i++;
                j = j+1;
                k = k+1;
            }
        }
//        if(l ==1){
//            maxx = sumSmallWindow < sumLargeWindow ? sumSmallWindow : sumLargeWindow;
//            while(i < nums.size())
//                if(nums.get(i) > 0 && nums.get(i) < maxx) {
//                    maxx = nums.get(i);
//                    i++;
//                }else{
//                    i++;
//                }
//        }
        if(maxx == Integer.MAX_VALUE)
            return -1;
        return maxx;
    }
}

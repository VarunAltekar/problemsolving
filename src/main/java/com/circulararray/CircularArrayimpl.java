package com.circulararray;

public class CircularArrayimpl {
    public static void main(String[] args) {
        int[] code = {5,7,1,4};
        decrypt(code, 3);
    }

    public static int[] decrypt(int[] code, int k) {
        int[] resArr = new int[code.length];
        if(k == 0)
            return resArr;

        int sum = 0;
        int first = 1;
        int last =k;

        if(k<0) {
            first = code.length - (-1 * k);
            last = code.length -1;
        }

        for(int i = first; i <= last ; i++)
            sum = sum + code[i];

        for(int i=0; i < resArr.length; i++){
            resArr[i] = sum;
            sum = sum - code[first % code.length];
            sum = sum + code[(last+1)% code.length];
            first = first +1;
            last = last+1;

        }

        return resArr;

    }
}

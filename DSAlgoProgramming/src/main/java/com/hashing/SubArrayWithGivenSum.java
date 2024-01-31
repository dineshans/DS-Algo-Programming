package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {6,-1,2,1,-1};
        int sum = 0;
        System.out.println(subArrayForGivenSum(arr,sum));

        // breute force
        //System.out.println(SumOfSubArray(arr,sum));

    }

    // using bruete force Apprioach
    public static boolean SumOfSubArray(int[] arr, int sum){

        for(int i = 0; i < arr.length; i++){
            int s = 0;
            for(int j = i; j < arr.length; j++){
                s += arr[j];
                if(s == sum){
                    System.out.println("SubArray Elements are : " + arr[i] + " , " + arr[j]);
                    return true;

                }

            }

        }

        return false;

    }

    // Time - O(N), Spcae - O(N)
    public static boolean subArrayForGivenSum(int[] arr, int sum) {

        Map<Integer, Integer> map = new HashMap<>();
        int preSum = 0;

        map.put(preSum, 1);
        for (int i = 0; i < arr.length; i++) {
            preSum+= arr[i];
            if(map.containsKey(preSum)){
                System.out.println("preSum is - " + preSum + " index is - " + i);
                return true;
            }

            map.put(preSum+arr[i], 1);
        }
        return false;
    }
}

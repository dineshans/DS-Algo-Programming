package com.DSAlgo.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckForPaires {

    public static void main(String[] args) {

        int arr[] = {5, 2, -3, 7, 11};
        int x = 2;
        // checkForPairesSum(arr,x);
        findPairesForGivenSum(x, arr);
    }

    // using 2-pointer technique
    public static void checkForPairesSum(int[] arr, int x) {

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] + arr[j] == x) {
                System.out.println("True");

            }

            if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }

        }

    }

    // using HasMap
    public static void findPairesForGivenSum(int x, int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(x-arr[i])){
                count = 1;
                System.out.println("true");
                System.out.println("Count is " + count++);
            }
            map.put(arr[i], 1);
        }
        if(count == 0){
            System.out.println("false");
        }

    }
}

package com.twopointer;

public class FindPairesOfGivenSum {

    public static void main(String[] args) {

        int[] arr = {1,4,4,5,5,5,6,6,11};
        boolean result = paireOfSum(arr, 10);
        System.out.println("Paire of sum is available : " + result);

    }

    public static boolean paireOfSum(int[] arr, int sum){

        int i = 0;
        int j = arr.length-1;

        while (i < j) {
            int currentSum = arr[i] + arr[j];
            if (currentSum == sum) {
                System.out.println("array element is " + arr[i] + " , " + arr[j]);
                return true;
            } else if (currentSum < sum) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}

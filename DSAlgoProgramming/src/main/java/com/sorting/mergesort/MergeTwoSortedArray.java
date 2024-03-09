package com.sorting.mergesort;


public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int[] resultArra = mergeArray(arr1,arr2);

        System.out.print(" { ");
        for(int i = 0; i < resultArra.length; i++){
            System.out.print(resultArra[i] + "  ");
        }
        System.out.print(" } ");

    }

    /*
    * Given arrays arr1 = {1,3,5}  , arr2 = {2,4,6}
    * result = {1,2,3,4,5,6}
    * */

    /*
    * Time Complexity = O(arr1Length + arr2Length)
    * Space Complexity = O(arr1Length + arr2Length)
    * */

    public static int[] mergeArray(int[] arr1, int[] arr2) {

        int[] resultArr = new int[arr1.length+arr2.length];
        int i = 0,j = 0,index = 0;

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        while(i < arr1Length && j < arr2Length){

            if(arr1[i] < arr2[j]){
                resultArr[index++] = arr1[i++];
            } else {
                resultArr[index++] = arr2[j++];
            }
        }
        while (i < arr1Length) {
            resultArr[index++] = arr1[i];
        }
        while (j < arr2Length) {
            resultArr[index++] = arr2[j++];
        }
        return resultArr;
    }
}

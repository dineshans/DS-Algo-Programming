package com.Array;

public class MergeTwoSortedArrayUsingTwoPointers {

    public static void main(String[] args) {

        int[] nums1 = {2,3,4,0,0,0};
        int[] nums2 = {4,6,7};


        /*   while(i >= 0 && j >= 0){

            if(a[i] > b[j]){

                a[k--] = a[i--];
            }
            else {
                a[k--] = b[j--];
            }

        }
        while(j >= 0) {
            a[k--] = b[j--];

        }

        System.out.println("Array is - " + " [ ");
        for(int c = 0; c < a.length; c++){
            System.out.print(a[c] + " , ");
        } */


        int m = 3;
        int n = 3;

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        for(; i >=0 && j >=0; k--){
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }
        }


        while(i >= 0) {
            nums1[k--] = nums1[i--];
        }

        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }

        System.out.println("Array is - " + " [ ");
        for(int c = 0; c < nums1.length; c++){
            System.out.print(nums2[c] + " , ");
        }


    }
}

package com.Array;

public class MergeTwoSortedArrayUsingTwoPointers {

    public static void main(String[] args) {

        int[] a = {2,3,4,9,10,0,0,0};
        int[] b = {4,6,7};

        int m = a.length;
        int n = b.length;

        int i = m-1;
        int j = n-1;
        int k = m-n;

        while(i >= 0 && j >= 0){

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
        }

    }
}

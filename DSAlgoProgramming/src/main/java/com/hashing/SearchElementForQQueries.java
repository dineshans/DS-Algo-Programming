package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class SearchElementForQQueries {

    public static void main(String[] args){

        int[] arr = {3,4,3,5,-2};
        int q = 2;
        int x = 5;

        searchQeuries(arr,q,x);
    }

    public static void searchQeuries(int[] arr,int q, int x){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, 0);
        }

        for(int i = 0; i < q-1; i++){

            if(map.containsKey(x)){
                System.out.println("Map contains key : " + "true");
            } else {
                System.out.println("Map not contains key : " + "false");
            }

            }

        }

    }

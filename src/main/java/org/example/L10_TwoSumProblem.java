package org.example;

import java.util.HashMap;
import java.util.Map;

public class L10_TwoSumProblem {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;

//        int[] arr = {3,2,4};
//        int target = 6;

        findTwoSum(arr, target);
    }

    private static void findTwoSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){   // TC : O(n)
            int b = target - arr[i];
            if(map.containsKey(b)){
                System.out.println("["+map.get(b) + "," +i+ "]");
            }
            map.put(arr[i], i);
        }
    }
}

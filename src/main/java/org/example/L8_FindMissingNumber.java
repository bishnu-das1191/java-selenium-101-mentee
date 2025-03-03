package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L8_FindMissingNumber {
    public static void main(String[] args) {

        /**
         *  Find the missing number from unsorted sequenced integer array
         */

        int[] arr = {1,5,3,7,9,8,4};
        int n = 9;

        //List<int[]> list = Arrays.asList(arr);

        ArrayList<Integer> al = new ArrayList<>();
        for(int num : arr){
            al.add(num);
        }

        System.out.println(al);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=1; i<n; i++){
            if(!al.contains(i)){
                System.out.println(i);
            }
        }





    }
}

package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class L9_CharOccurrence {
    public static void main(String[] args) {

        /**
         * find the occurrence of given input string
         */

        //String str = "success"; //s=3, u=1, c=2, e=1
        String str = "automation";

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] arr = str.toCharArray();
        for(int i=0; i<str.length(); i++){    // TC : O(n)
            char ch = arr[i];
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        System.out.println(map);

    }
}

class FreqCharWithoutUsingMap{
    public static void main(String[] args) {

        int[] arr = {5,2,9,1,7,2,7};

        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);

        for(int i=0; i<arr.length; i++){   // T.C : O(n^2)

            if(visited[i]) continue;
            int count = 1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "->"+count);
        }


    }
}

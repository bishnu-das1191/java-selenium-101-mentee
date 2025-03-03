package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class L7_RemoveDuplicates {
    public static void main(String[] args) {
        /**
         *  Remove duplicate characters
         */
        String str = "success";  // suce
        //String str = "terscharac";  //

        StringBuilder result  = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()){
            if(set.add(ch)){
                result.append(ch);
            }
        }

        System.out.println(result);


    }
}

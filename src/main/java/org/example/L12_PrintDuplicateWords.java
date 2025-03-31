package org.example;

import java.util.HashMap;
import java.util.Map;

public class L12_PrintDuplicateWords {
    public static void main(String[] args) {

        String input = "Java is great and Java is powerful";

        String[] words = input.toLowerCase().split("\\W+");

        Map<String, Integer> map = new HashMap<>();

        for(String word : words){
            //map.put(word, map.getOrDefault(word,0)+1);
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }

        boolean hasDuplicates = false;
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+" ");
                hasDuplicates = true;
            }
        }

        if(!hasDuplicates){
            System.out.println("No Duplicates");
        }
    }
}

// swiss

package org.example;

import java.util.Arrays;

public class L1_Reverse {
    public static void main(String[] args) {

        //program to reverse a String
        String input = "bishnu";  // unhsib

        StringBuilder result = new StringBuilder(input);
        for(int i=input.length()-1; i>=0; i--){         // T.C : O(n)
            result.append(input.charAt(i));
        }
        System.out.println(result);
    }
}

class Reverse_2 {
    public static void main(String[] args) {

        String input = "bishnu";  // unhsib
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        System.out.println(sb);

    }
}


class L1_Reverse_optimized {
    public static void main(String[] args) {

        //program to reverse a String
        String input = "bishnu";  // unhsib

        int i = 0;
        int j = input.length()-1;
        char[] arr = input.toCharArray();

        while(i<j){                     // T.C : O(n/2) = 1/2*n = O(n)
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(arr));  // Arrays.toString(arr)
    }
}

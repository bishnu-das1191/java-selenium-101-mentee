package org.example;

public class L4_StringCompression {
    public static void main(String[] args) {

        String str = "aabcccccaaa";  // a2b1c5a3

        String result = "";

        int count = 1;
        for(int i=0; i<str.length(); i++){
            if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count ++;
            }else{
                result = result +  str.charAt(i);
                result += count;
                count = 1;
            }
        }

        System.out.println(result);

    }
}

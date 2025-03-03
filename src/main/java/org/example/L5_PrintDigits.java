package org.example;

public class L5_PrintDigits {
    public static void main(String[] args) {

        int num = 123; // 12 // 1

        while (num !=0){
         int lastDigit = num % 10;
         System.out.println(lastDigit);
         num = num/10;
        }

    }
}

class ReverseNumber {
    public static void main(String[] args) {

        int num = 12345;
        int rev = 0;
        while(num !=0){
           int ld =  num % 10;
           rev = ld + rev * 10;
           num = num/10;
        }
        System.out.println(rev);
    }
}

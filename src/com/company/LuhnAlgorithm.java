package com.company;

import java.util.Scanner;

public class LuhnAlgorithm {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your card number");
        long num=sc.nextLong();
        //System.out.println("Length is"+getLength(num));
        System.out.println("sum is"+getDigit(num));

    }
    public static void checkLuhn(long number){

    }
    public static long getLength(long num){
        String length =num+"";
        return length.length();

    }
    public static long sum(long num){
        num=(getLength(num)-2)*2;
        return num;
    }
    public static long getDigit(long num){
        if (num<9)
        {
            return num;
        }
        return num/10 +num%10;
    }

}

package com.kavin.others;

public class BinaryToInteger {
    public static void main(String[] args) {
        int number = 111111110;
        System.out.println(getInteger(number));
        System.out.println(Integer.parseInt(String.valueOf(number),2));
    }
    public static int getInteger(int number) {
        int result = 0, n = 0;
        for (int i = number,temp = number%10; i > 0; i /= 10) {
            result +=  (temp * (int) Math.pow(2, n++));
        }
        return result;
    }
}

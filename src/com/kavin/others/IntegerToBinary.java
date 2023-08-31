package com.kavin.others;

public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.println(getBinaryNumber(100));
        System.out.println(getBinary(10));

    }
    public static String getBinaryNumber(int number) {
        StringBuilder binary = new StringBuilder();
        while (number>0){
            binary.insert(0,number%2);
            number/=2;
        }
        return binary.toString();
    }
    @SuppressWarnings("all")
    public static String getBinary (int number){
        String binary = "";
        while (number>0){
            binary = number%2+binary;
            number/=2;
        }
        return binary;
    }
}

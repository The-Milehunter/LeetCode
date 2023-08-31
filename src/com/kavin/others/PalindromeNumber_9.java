package com.kavin.others;

@SuppressWarnings("unused")
public class PalindromeNumber_9 {
    //Beats 100% of users on speed with Java, beats 45% of users on memory usage
    public boolean isPalindrome(int x) {
        int number = x;
        int reverse = 0;
        while (number > 0) {
            int last = number % 10;
            reverse *= 10;
            reverse += last;
            number /= 10;
        }
        return reverse == x;
    }
}

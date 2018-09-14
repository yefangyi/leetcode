package com.yfy.Array;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int total = 0, pre = x;
        while (x != 0) {
            total = total * 10 + x %10 ;
            x /= 10;
        }
        return total == pre;
    }

}

package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void case1() {
        Assert.assertEquals(true, palindromeNumber.isPalindrome(121));
    }

    @Test
    public void case2() {
        Assert.assertEquals(false, palindromeNumber.isPalindrome(-121));
    }

    @Test
    public void case3() {
        Assert.assertEquals(false, palindromeNumber.isPalindrome(10));
    }

    @Test
    public void case4() {
        Assert.assertEquals(true, palindromeNumber.isPalindrome(0));
    }

}

package com.yfy.String;

import org.junit.Assert;
import org.junit.Test;

/**
 * Question 344
 */
public class ReverseStringTest {

    private ReverseString reverseString = new ReverseString();

    @Test
    public void case1() {
        Assert.assertEquals("olleh", reverseString.reverseString("hello"));
    }

}

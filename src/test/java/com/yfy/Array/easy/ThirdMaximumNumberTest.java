package com.yfy.Array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Question 414
 */
public class ThirdMaximumNumberTest {

    private ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();

    @Test
    public void case1() {
        Assert.assertEquals(1, thirdMaximumNumber.thirdMax(new int[]{1, 2, 3}));
    }

}

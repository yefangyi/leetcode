package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    private MajorityElement majorityElement = new MajorityElement();

    @Test
    public void case1() {
        Assert.assertEquals(3, majorityElement.majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(2, majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    public void case3() {
        Assert.assertEquals(2, majorityElement.majorityElement(new int[]{2, 2, 3}));
    }
}

package com.yfy.Array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Question 896
 */
public class MonotonicArrayTest {

    private MonotonicArray monotonicArray = new MonotonicArray();

    @Test
    public void case1() {
        Assert.assertEquals(true, monotonicArray.isMonotonic(new int[]{1,2,2,3}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(true, monotonicArray.isMonotonic(new int[]{6,5,4,4}));
    }

    @Test
    public void case3() {
        Assert.assertEquals(false, monotonicArray.isMonotonic(new int[]{1,3,2}));
    }

    @Test
    public void case4() {
        Assert.assertEquals(true, monotonicArray.isMonotonic(new int[]{1,2,4,5}));
    }
    @Test
    public void case5() {
        Assert.assertEquals(true, monotonicArray.isMonotonic(new int[]{1,1,1}));
    }
}

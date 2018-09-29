package com.yfy.Array.easy;

import com.yfy.Array.easy.PlusOne;
import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    private PlusOne plusOne = new PlusOne();

    @Test
    public void case1() {
        Assert.assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void case2() {
        Assert.assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void case3() {
        Assert.assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
    }

    @Test
    public void case4() {
        Assert.assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, plusOne.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }

    @Test
    public void case5() {
        Assert.assertArrayEquals(new int[]{1, 0 , 0}, plusOne.plusOne(new int[]{9,9}));
    }
}

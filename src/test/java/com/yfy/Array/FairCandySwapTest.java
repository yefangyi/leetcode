package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class FairCandySwapTest {

    private FairCandySwap fairCandySwap = new FairCandySwap();

    @Test
    public void case1() {
        Assert.assertArrayEquals(new int[]{1, 2}, fairCandySwap.fairCandySwap(new int[]{1, 1}, new int[]{2, 2}));
    }

    @Test
    public void case2() {
        Assert.assertArrayEquals(new int[]{1, 2}, fairCandySwap.fairCandySwap(new int[]{1, 2}, new int[]{2, 3}));
    }

    @Test
    public void case3() {
        Assert.assertArrayEquals(new int[]{2, 3}, fairCandySwap.fairCandySwap(new int[]{2}, new int[]{1, 3}));
    }

    @Test
    public void case4() {
        Assert.assertArrayEquals(new int[]{5, 4}, fairCandySwap.fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4}));
    }

    @Test
    public void case5() {
        Assert.assertArrayEquals(new int[]{91, 1}, fairCandySwap.fairCandySwap(new int[]{14,54,83,100,72,1,91,60,13,71,94,28,58,63,61,34,55,93,56,17}, new int[]{58,75,8,87,48,22,23,9,85,82,42,99,23,1,83,77,19,32,9,56}));
    }

}

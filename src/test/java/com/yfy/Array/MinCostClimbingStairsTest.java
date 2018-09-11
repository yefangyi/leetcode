package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class MinCostClimbingStairsTest {

    private MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();

    @Test
    public void case1() {
        Assert.assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(10, minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15}));
    }

    @Test
    public void case3() {
        Assert.assertEquals(6, minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @Test
    public void case4() {
        Assert.assertEquals(2, minCostClimbingStairs.minCostClimbingStairs(new int[]{0, 1, 2, 2}));
    }

    @Test
    public void case5() {
        Assert.assertEquals(2, minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 2, 2, 0}));
    }
    @Test
    public void case6() {
        Assert.assertEquals(0, minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 0, 0, 1}));
    }

    @Test
    public void case7() {
        Assert.assertEquals(0, minCostClimbingStairs.minCostClimbingStairs(new int[]{2, 0, 0, 1}));
    }

}

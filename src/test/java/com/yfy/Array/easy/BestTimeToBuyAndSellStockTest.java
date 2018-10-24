package com.yfy.Array.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.DoubleStream;

public class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStock();

    @Test
    public void case1() {
        Assert.assertEquals(5, bestTimeToBuyAndSellStockII.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(4, bestTimeToBuyAndSellStockII.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

}

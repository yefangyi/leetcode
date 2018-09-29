package com.yfy.Array.easy;

import com.yfy.Array.easy.BestTimeToBuyAndSellStockII;
import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockIITest {

    private BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();

    @Test
    public void case1() {
        Assert.assertEquals(7, bestTimeToBuyAndSellStockII.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(4, bestTimeToBuyAndSellStockII.maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void case3() {
        Assert.assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void case4() {
        Assert.assertEquals(25, bestTimeToBuyAndSellStockII.maxProfit(new int[]{1,9,6,9,1,7,1,1,5,9,9,9}));
    }
}

package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductofThreeNumbersTest {

    private MaximumProductofThreeNumbers maximumProductofThreeNumbers = new MaximumProductofThreeNumbers();

    @Test
    public void case1() {
        Assert.assertEquals(6, maximumProductofThreeNumbers.maximumProduct(new int[]{1, 2, 3}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(24, maximumProductofThreeNumbers.maximumProduct(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void case3() {
        Assert.assertEquals(-6, maximumProductofThreeNumbers.maximumProduct(new int[]{-1, -2, -3, -4, -5}));
    }

    @Test
    public void case4() {
        Assert.assertEquals(8, maximumProductofThreeNumbers.maximumProduct(new int[]{1, 2, -3, 4}));
    }

    @Test
    public void case5() {
        Assert.assertEquals(24, maximumProductofThreeNumbers.maximumProduct(new int[]{1, 2, -3, -4}));
    }

}

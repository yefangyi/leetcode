package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAverageSubarrayITest {

    private MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();

    @Test
    public void case1() {
        Assert.assertEquals(12.75, maximumAverageSubarrayI.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4), 0);
    }

}

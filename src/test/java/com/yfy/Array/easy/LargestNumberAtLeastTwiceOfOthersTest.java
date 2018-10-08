package com.yfy.Array.easy;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberAtLeastTwiceOfOthersTest {

    private LargestNumberAtLeastTwiceOfOthers largestNumberAtLeastTwiceOfOthers = new LargestNumberAtLeastTwiceOfOthers();


    @Test
    public void case1() {
        Assert.assertEquals(1, largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{3, 6, 1, 0}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(-1, largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void case3() {
        Assert.assertEquals(-1, largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{0, 0, 3, 2}));
    }
}

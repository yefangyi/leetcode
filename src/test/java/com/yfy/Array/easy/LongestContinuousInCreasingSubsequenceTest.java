package com.yfy.Array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Question 674.
 */
public class LongestContinuousInCreasingSubsequenceTest {

    private LongestContinuousInCreasingSubsequence longestContinuousInCreasingSubsequence = new LongestContinuousInCreasingSubsequence();

    @Test
    public void case1() {
        Assert.assertEquals(3, longestContinuousInCreasingSubsequence.findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(1, longestContinuousInCreasingSubsequence.findLengthOfLCIS(new int[]{2,2,2,2,2}));
    }

    @Test
    public void case3() {
        Assert.assertEquals(4, longestContinuousInCreasingSubsequence.findLengthOfLCIS(new int[]{1,3,5,7}));
    }

}

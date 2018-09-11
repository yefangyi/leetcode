package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class DegreeOfAnArrayTest {

    private DegreeOfAnArray degreeOfAnArray = new DegreeOfAnArray();

    @Test
    public void case1() {
        Assert.assertEquals(2, degreeOfAnArray.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(6, degreeOfAnArray.findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }

}

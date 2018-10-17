package com.yfy.Array.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void case1() {
        Assert.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1,1,2}));
    }

}

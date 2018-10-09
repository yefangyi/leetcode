package com.yfy.Array.medium;

import org.junit.Assert;
import org.junit.Test;

public class FindAllDuplicatesInAnArrayTest {

    private FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();

    @Test
    public void case1() {
        Assert.assertArrayEquals(new Integer[]{2, 3}, findAllDuplicatesInAnArray.findDuplicates(new int[]{4,3,2,7,8,2,3,1}).toArray(new Integer[2]));
    }
}

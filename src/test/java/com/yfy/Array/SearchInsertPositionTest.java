package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    public void case1() {
        Assert.assertEquals(2, searchInsertPosition.searchInsert(new int[]{1,3,5,6},5));
    }

    @Test
    public void case2() {
        Assert.assertEquals(1, searchInsertPosition.searchInsert(new int[]{1,3,5,6},2));
    }

    @Test
    public void case3() {
        Assert.assertEquals(4, searchInsertPosition.searchInsert(new int[]{1,3,5,6},7));
    }

    @Test
    public void case4() {
        Assert.assertEquals(0, searchInsertPosition.searchInsert(new int[]{1,3,5,6},0));
    }

    @Test
    public void case5() {
        Assert.assertEquals(2, searchInsertPosition.searchInsert(new int[]{1,3,5},4));
    }

    @Test
    public void case6() {
        Assert.assertEquals(1, searchInsertPosition.searchInsert(new int[]{1,3},3));
    }

}

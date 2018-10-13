package com.yfy.Array.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    private RemoveElement removeElement = new RemoveElement();

    @Test
    public void case1() {
        Assert.assertEquals(2, removeElement.removeElement(new int[]{3,2,2,3}, 3));
    }

    @Test
    public void case2() {
        Assert.assertEquals(5, removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    @Test
    public void case3() {
        Assert.assertEquals(1, removeElement.removeElement(new int[]{2}, 3));
    }

    @Test
    public void case4() {
        Assert.assertEquals(0, removeElement.removeElement(new int[]{}, 3));
    }

    @Test
    public void case5() {
        Assert.assertEquals(0, removeElement.removeElement(new int[]{3, 3}, 3));
    }

}

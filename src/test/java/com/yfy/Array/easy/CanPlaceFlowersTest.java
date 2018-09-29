package com.yfy.Array.easy;

import com.yfy.Array.easy.CanPlaceFlowers;
import org.junit.Assert;
import org.junit.Test;

public class CanPlaceFlowersTest {

    private CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

    @Test
    public void case1() {
        Assert.assertEquals(true, canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    }

    @Test
    public void case2() {
        Assert.assertEquals(false, canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0, 1}, 2));
    }

    @Test
    public void case3() {
        Assert.assertEquals(false, canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,0,1}, 2));
    }

    @Test
    public void case4() {
        Assert.assertEquals(true, canPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,1}, 1));
    }

    @Test
    public void case5() {
        Assert.assertEquals(true, canPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,1, 0, 0}, 2));
    }

    @Test
    public void case6() {
        Assert.assertEquals(true, canPlaceFlowers.canPlaceFlowers(new int[]{0,0,0}, 2));
    }

    @Test
    public void case7() {
        Assert.assertEquals(false, canPlaceFlowers.canPlaceFlowers(new int[]{1,0,1,0,0,1,0}, 1));
    }


}

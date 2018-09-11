package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    private MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void case1() {
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, moveZeroes.moveZeroes1(new int[]{0, 1, 0, 3, 12}));
    }

    @Test
    public void case2() {
        Assert.assertArrayEquals(new int[]{1}, moveZeroes.moveZeroes1(new int[]{1}));
    }


    @Test
    public void case3() {
        Assert.assertArrayEquals(new int[]{2, 1}, moveZeroes.moveZeroes1(new int[]{2, 1}));

    }

}

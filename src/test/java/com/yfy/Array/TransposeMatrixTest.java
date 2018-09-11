package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class TransposeMatrixTest {

    private TransposeMatrix transposeMatrix = new TransposeMatrix();

    @Test
    public void case1() {
        Assert.assertArrayEquals(new int[][]{{1,4,7},{2,5,8},{3,6,9}}, transposeMatrix.transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    @Test
    public void case2() {
        Assert.assertArrayEquals(new int[][]{{1,4},{2,5},{3,6}}, transposeMatrix.transpose(new int[][]{{1,2,3},{4,5,6}}));
    }

}

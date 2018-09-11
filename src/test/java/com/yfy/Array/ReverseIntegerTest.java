package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    private ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void case1() {
        Assert.assertEquals(321, reverseInteger.reverse(123));
    }

    @Test
    public void case2() {
        Assert.assertEquals(-321, reverseInteger.reverse(-123));
    }

    @Test
    public void case3() {
        Assert.assertEquals(21, reverseInteger.reverse(120));
    }

    @Test
    public void case4() {
        Assert.assertEquals(201, reverseInteger.reverse(102));
    }

    @Test
    public void case5() {
        Assert.assertEquals(0, reverseInteger.reverse(1534236469));
    }

    @Test
    public void case6() {
        Assert.assertEquals(0, reverseInteger.reverse(-2147483648));
    }

}

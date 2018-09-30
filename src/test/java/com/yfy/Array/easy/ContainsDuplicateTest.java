package com.yfy.Array.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void case1() {
        Assert.assertEquals(true, containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    public void case2() {
        Assert.assertEquals(false, containsDuplicate.containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    public void case3() {
        Assert.assertEquals(true, containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

}

package com.yfy.Array.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Question 219
 */
public class ContainsDuplicateIITest {

    private ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();

    @Test
    public void case1() {
        Assert.assertEquals(true, containsDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }


}

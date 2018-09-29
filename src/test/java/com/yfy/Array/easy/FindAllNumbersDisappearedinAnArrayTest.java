package com.yfy.Array.easy;

import com.yfy.Array.easy.FindAllNumbersDisappearedinAnArray;
import org.junit.Assert;
import org.junit.Test;

public class FindAllNumbersDisappearedinAnArrayTest {

    private FindAllNumbersDisappearedinAnArray findAllNumbersDisappearedinAnArray = new FindAllNumbersDisappearedinAnArray();

    @Test
    public void case1() {
        Assert.assertArrayEquals(new Integer[]{ 5, 6}, findAllNumbersDisappearedinAnArray.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}).toArray(new Integer[2]));
    }

}

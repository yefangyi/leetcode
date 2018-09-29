package com.yfy.Array.easy;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int result1 = nums[0] * nums[1] * nums[nums.length - 1];
        int result2 = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];
        return Math.max(result1, result2);
    }

}

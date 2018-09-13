package com.yfy.Array;

public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        int result = 0, pre = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i < k) {
                pre = result += nums[i];
                continue;
            }
            pre += nums[i] - nums[i - k];
            result = Math.max(pre, result);
        }
        return result * 1.0D/ k;
    }

}

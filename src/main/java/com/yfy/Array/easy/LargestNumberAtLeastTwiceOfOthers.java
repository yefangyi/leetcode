package com.yfy.Array.easy;

/**
 * the question of the 747
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int max = 0, secondMax = 0, index = 0 ;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                index = i;
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax){
                secondMax = nums[i];
            }
        }
        return max >= 2 * secondMax ? index : -1;
    }

}

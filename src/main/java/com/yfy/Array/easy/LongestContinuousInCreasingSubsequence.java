package com.yfy.Array.easy;

/**
 * Question 674.
 */
public class LongestContinuousInCreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        int res = 0, cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i-1] < nums[i]) res = Math.max(res, ++cnt);
            else cnt = 1;
        }
        return res;
    }

//    public int findLengthOfLCIS(int[] nums) {
//        int index = 0, result = 0;
//        for(int i = 0; i < nums.length - 1; i ++) {
//            if(nums[i] >= nums[i + 1]) {
//                result = Math.max(result, i - index + 1);
//                index =  i + 1;
//            }
//        }
//
//        return Math.max(result, nums.length - index);
//    }

}

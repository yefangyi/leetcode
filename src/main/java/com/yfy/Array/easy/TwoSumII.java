package com.yfy.Array.easy;

/**
 * Question 896
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while(left < right) {
            int result = numbers[left] + numbers[right];
            if(result > target) {
                right--;
            } else if(result < target) {
                left++;
            } else {
                break;
            }
        }
        return new int[]{left + 1, right + 1};
    }

}

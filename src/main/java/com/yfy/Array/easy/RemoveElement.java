package com.yfy.Array.easy;

/**
 * the question of the 27
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result ++] = nums[i];
            }
        }
        return result;
    }

//    public int removeElement(int[] nums, int val) {
//        int lastIndex = nums.length - 1, result = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if (nums[i] == val) {
//                for(int j = lastIndex; j > i; j --) {
//                    if(nums[j] != val) {
//                        nums[i] = nums[j];
//                        nums[j] = val;
//                        lastIndex = j;
//                        result ++;
//                        break;
//                    }
//                }
//            } else {
//                result ++;
//            }
//        }
//        return result;
//    }

}

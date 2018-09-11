package com.yfy.Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }

//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        for(int i = 0; i < nums.length;) {
//            int num = nums[i];
//            if(nums[num - 1] != num) {
//                nums[i] = nums[num - 1];
//                nums[num - 1] = num;
//            } else {
//                i++;
//            }
//        }
//
//        List<Integer> result = new ArrayList<>(nums.length);
//        for(int i = 0; i < nums.length; i++) {
//            if(i != nums[i] - 1) {
//                result.add(i + 1);
//            }
//        }
//        return result;
//    }

}

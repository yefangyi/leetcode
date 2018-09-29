package com.yfy.Array.easy;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int times = 0, current = 0;
        for(int i : nums) {
            if(times == 0) {
                current = i;
                times ++ ;
            } else if(current != i) {
                times--;
            } else {
                times ++;
            }
        }
        return current;
    }

//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> result = new HashMap<>();
//        for(int i = 0; i < nums.length; i++) {
//            int value = result.getOrDefault(nums[i], 0);
//            result.put(nums[i], ++ value);
//            if(value > nums.length / 2) {
//                return nums[i];
//            }
//        }
//        return 0;
//    }

}

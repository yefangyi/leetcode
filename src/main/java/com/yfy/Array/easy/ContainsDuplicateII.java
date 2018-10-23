package com.yfy.Array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Question 219
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer, Integer> intMap = new HashMap<>();
//        for(int i = 0; i < nums.length; i++) {
//            Integer temp = intMap.get(nums[i]);
//            if(temp != null && i - temp <= k){
//                return true;
//            } else {
//                intMap.put(nums[i], i);
//            }
//        }
//        return false;
//    }

}

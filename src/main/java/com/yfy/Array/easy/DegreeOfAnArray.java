package com.yfy.Array.easy;

import java.util.*;

public class DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], new int[]{1, i, i});  // the first element in array is degree, second is first index of this key, third is last index of this key
            } else {
                int[] temp = map.get(nums[i]);
                temp[0]++;
                temp[2] = i;
            }
        }
        int degree = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
        for (int[] value : map.values()){
            if (value[0] > degree){
                degree = value[0];
                res = value[2] - value[1] + 1;
            } else if (value[0] == degree){
                res = Math.min( value[2] - value[1] + 1, res);
            }
        }
        return res;
    }

//    public int findShortestSubArray(int[] nums) {
//        Map<Integer, List<Integer>> gruop = new HashMap<>();
//        for(int i = 0; i < nums.length; i++) {
//            gruop.putIfAbsent(nums[i], new ArrayList<>());
//            gruop.get(nums[i]).add(i);
//        }
//
//        int num = 0;
//        int result = 0;
//        List<List<Integer>> collection = new ArrayList<>(gruop.values());
//        for(List<Integer> list : collection) {
//            if(list.size() > num) {
//                num = list.size();
//                result = list.get(num - 1) - list.get(0) + 1;
//            } else if(list.size() == num){
//                result = Math.min(list.get(num - 1) - list.get(0) + 1, result);
//            }
//        }
//        return result;
//    }

}

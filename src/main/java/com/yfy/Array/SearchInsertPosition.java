package com.yfy.Array;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

//    public int searchInsert(int[] nums, int target) {
//        if(target < nums[0]) {
//            return 0;
//        }
//        if(target > nums[nums.length -1]) {
//            return nums.length;
//        }
//        return search(nums, 0, nums.length - 1, target);
//    }
//
//    private int search(int[] nums, int left, int right, int target) {
//        int mid = (left + right) / 2;
//        int midVale = nums[mid];
//        if(midVale == target) {
//            return mid;
//        }
//        if(left == right - 1) {
//            return right;
//        }
//        if(midVale > target) {
//            return search(nums, left, mid, target);
//        } else {
//            return search(nums, mid, right, target);
//        }
//    }

}

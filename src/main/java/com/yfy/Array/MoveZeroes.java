package com.yfy.Array;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

//    public void moveZeroes(int[] nums) {
//        for(int i=0, noZeroIndex = 0; i < nums.length; i++) {
//            int temp = nums[i];
//            if(temp != 0) {
//                if(i > noZeroIndex) {
//                    nums[noZeroIndex] = temp;
//                    nums[i] = 0;
//                }
//                noZeroIndex ++ ;
//            }
//        }
//    }

    public int[] moveZeroes1(int[] nums) {
        moveZeroes(nums);
        return nums;
    }

}

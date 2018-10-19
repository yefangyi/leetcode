package com.yfy.Array.easy;

/**
 * Question 896
 */
public class MonotonicArray {

    public boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        for (int i = 1; i < A.length; ++i) {
            inc &= A[i - 1] <= A[i];
            dec &= A[i - 1] >= A[i];
        }
        return inc || dec;
    }

//    public boolean isMonotonic(int[] A) {
//        int size = 0, equal = 0;
//        for(int i = 1; i < A.length; i++) {
//            if(A[i] > A[i - 1]) {
//                size++;
//            } else if(A[i] == A[i -1]) {
//                equal++;
//            }
//        }
//        return size == 0 || (size + equal) == A.length - 1;
//    }

}

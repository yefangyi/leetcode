package com.yfy.Array;

import java.util.HashSet;
import java.util.stream.IntStream;

public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        int dif = (IntStream.of(A).sum() - IntStream.of(B).sum()) / 2;
        HashSet<Integer> S = new HashSet<>();
        for (int a : A) {
            S.add(a);
        }
        for (int b : B) {
            if (S.contains(b + dif)) {
                return new int[] {b + dif, b};
            }
        }
        return new int[0];
    }

//    public int[] fairCandySwap(int[] A, int[] B) {
//        int aSum = 0;
//        int[] tempA = new int[100000 + 1];
//        for(int a : A) {
//            aSum += a;
//            tempA[a] = 1;
//        }
//
//        int[] tempB = new int[100000 + 1];
//        int bSum = 0;
//        for(int b : B) {
//            bSum += b;
//            tempB[b] = 1;
//        }
//
//        int average = (aSum + bSum)/2;
//        int[] result = new int[2];
//        for(int i = 0; i < tempA.length; i ++ ) {
//            int temp = tempA[i];
//            int bindex = aSum - i - average;
//            if(temp != 0 && bindex < 0 && tempB[-bindex] != 0) {
//                result[0] = i;
//                result[1] = -bindex;
//                break;
//            }
//        }
//        return result;
//    }
}

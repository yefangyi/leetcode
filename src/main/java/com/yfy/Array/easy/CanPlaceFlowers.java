package com.yfy.Array.easy;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length && count < n; i++) {
            if(flowerbed[i] == 0) {
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if(next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count == n;
    }

//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int index = 0;
//        for(int i = 0; i < flowerbed.length; i++) {
//            if(flowerbed[i] == 1) {
//                if(index == 0) {
//                    n -= (i - index) / 2;
//                } else {
//                    int temp = i - index;
//                    n -= temp >= 2 && temp % 2 == 0 ? temp / 2 - 1 : temp / 2;
//                }
//                index = i + 1;
//
//            }
//        }
//
//        if(index == 0) {
//            n -= (flowerbed.length + 1) / 2;
//        } else {
//            n -= (flowerbed.length - index) / 2;
//        }
//        return n <= 0;
//    }

}

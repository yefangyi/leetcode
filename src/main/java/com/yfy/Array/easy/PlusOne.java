package com.yfy.Array.easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

//    public int[] plusOne(int[] digits) {
//        digits[digits.length - 1] = (++digits[digits.length - 1]) % 10 ;
//        for(int i = digits.length - 1; i >0; i--) {
//            if(digits[i] == 0) {
//                digits[i - 1] = (++ digits[i - 1]) % 10;
//            } else {
//                break;
//            }
//        }
//        if(digits[0] == 0) {
//            int[] result = new int[digits.length + 1];
//            result[0] = 1;
//            return result;
//        }
//        return digits;
//    }

}

package com.yfy.Array.easy;

public class ReverseInteger {

    public int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }


//    public int reverse(int x) {
//        String numStr = String.valueOf(x);
//        if(numStr.charAt(0) == '-') {
//            numStr = numStr.substring(1, numStr.length());
//        }
//        int zeroNum = 0;
//        for(; zeroNum < numStr.length(); zeroNum ++ ) {
//            if(numStr.charAt(zeroNum) != '0') {
//                break;
//            }
//        }
//
//        int result = 0;
//        for(int i = zeroNum; i < numStr.length(); i++) {
//            result += Integer.valueOf(String.valueOf(numStr.charAt(i))) * Math.pow(10, i - zeroNum);
//        }
//        return result == Integer.MAX_VALUE? 0 : x >=0 ? result : -1 * result;
//    }

}

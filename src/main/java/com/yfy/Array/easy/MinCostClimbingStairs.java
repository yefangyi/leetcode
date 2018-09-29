package com.yfy.Array.easy;

public class MinCostClimbingStairs {

    //1、结果：走完楼梯花费最小
    //2、dp[i] 表示走到第i层的最小花费
    //3、i >= 2，所以dp[0] = 0、dp[1] = 1;
    //4、dp[i] = Min(dp[i-1] + cost[i-1] , dp[i-2] + cost[i-2]), //可能走1步，也可能走2步到达该层
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length + 1;
        int dp0 = 0;
        int dp1 = 0;
        int dp2 = 0;
        for (int i = 2; i < length; i++) {
            dp2 = Math.min(dp0 + cost[i - 2] , dp1 + cost[i - 1]);
            dp0 = dp1;
            dp1 = dp2;
        }
        return dp2;
    }


//    public int minCostClimbingStairs(int[] cost) {
//        int[] result = new int[cost.length + 1];
//        result[0] = 0;
//        result[1] = 0;
//        for(int i = 2; i < result.length; i++) {
//            result[i] = Math.min(result[i-1] + cost[i-1] , result[i-2] + cost[i-2]);
//        }
//        return result[cost.length];
//    }

}

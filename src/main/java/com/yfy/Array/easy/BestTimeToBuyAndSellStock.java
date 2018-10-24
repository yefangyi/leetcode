package com.yfy.Array.easy;

/**
 * Question 121
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int profit = 0, endOfMax = 0;
        for(int i = 1; i < prices.length; i++) {
            endOfMax = Math.max(0, endOfMax += prices[i] - prices[i-1]);
            profit = Math.max(endOfMax, profit);
        }
        return profit;
    }

//    public int maxProfit(int[] prices) {
//        int profit = 0, i = 0, min = -1;
//        while (i < prices.length) {
//            while (i < prices.length-1 && prices[i+1] <= prices[i]) i++;
//            min = min == -1? prices[i++] : Math.min(min, prices[i++]);
//            while (i < prices.length-1 && prices[i+1] >= prices[i]) i++;
//            profit = Math.max(profit, i < prices.length ? prices[i++] - min : 0);
//        }
//        return profit;
//    }

}

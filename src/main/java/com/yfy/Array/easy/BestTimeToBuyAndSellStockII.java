package com.yfy.Array.easy;

public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0, i = 0;
        while (i < prices.length) {
            // find next local minimum
            while (i < prices.length-1 && prices[i+1] <= prices[i]) i++;
            int min = prices[i++]; // need increment to avoid infinite loop for "[1]"
            // find next local maximum
            while (i < prices.length-1 && prices[i+1] >= prices[i]) i++;
            profit += i < prices.length ? prices[i++] - min : 0;
        }
        return profit;
    }

//    public int maxProfit(int[] prices) {
//        if(prices.length < 2) {
//            return 0;
//        }
//        int lowest = prices[0], result = 0;
//        for(int i = 1; i < prices.length - 1; i++) {
//            if(prices[i] < lowest) {//最低价买入
//                lowest = prices[i];
//            }else if(prices[i] > prices[i + 1]) { //卖出
//                result += prices[i] - lowest;
//                lowest = prices[i + 1];
//            }
//        }
//        if(prices[prices.length -1] >= prices[prices.length -2]) {
//            result += prices[prices.length -1] - lowest;
//        }
//        return result;
//    }

}

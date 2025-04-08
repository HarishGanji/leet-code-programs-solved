package com.leetcode.practice;

public class BuyStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int temp = prices[0];
        for (int i = 1; i < prices.length; i++) {
                int calc = prices[i] - temp;
                if (calc > profit) {
                    profit = calc;
            }
            if(prices[i] < temp){
                temp = prices[i];
            }

        }
        return profit;
    }
    public static void main(String args[]) {
    	BuyStock by = new BuyStock();
    	int[] a = {7,1,5,3,6,4};
    	int result = by.maxProfit(a);
    	System.out.println(result);
    	
    }
}

package com.array;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// 1) Say you have an array for which the ith element is the price of a given stock on day i.
// If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm
// to find the maximum profit.

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// 2) Say you have an array for which the ith element is the price of a given stock on day i.
// Design an algorithm to find the maxium profit. You may complete as many transactions as you like (ie buy one and sell one share of the
// stock multiple times). However, you may not engage in multiple transactions at the same time (ie you must sell the stock before you buy
// again).

public class BuySellStockProfit {
	// 1)
	public int oneProfit(int arr[]) {
		//
		int minPrice = arr[0];
		int maxProfit = 0;
		for(int i = 1; i < arr.length; i++) {
			if((arr[i] - minPrice) > maxProfit) {
				maxProfit = arr[i] - minPrice;
			}
			if(arr[i] < minPrice) {
				minPrice = arr[i];
			}
		}
		//
		return maxProfit;
	}
	
	// 2)
	public int allProfit(int[] prices) {
        //
        if(prices.length <= 0) {
            return 0;
        }
        //
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            //
            if((prices[i + 1] - prices[i]) > 0) {
                maxProfit += (prices[i + 1] - prices[i]);
            }
        }
        //
        return maxProfit;
    }
	
	// test
	public static void main(String[] args) {
		int arr[] = {7, 1, 5, 3, 6, 4};
		int arr1[] = {6,4,1,3,5,7,3,1,3,4,7,9,2,5,6,0,1,2};
        BuySellStockProfit bss = new BuySellStockProfit();
        System.out.println(bss.oneProfit(arr));
        System.out.println(bss.allProfit(arr1));
        
	}
	
}

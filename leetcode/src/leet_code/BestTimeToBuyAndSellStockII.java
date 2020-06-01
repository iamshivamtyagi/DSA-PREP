package leet_code;

public class BestTimeToBuyAndSellStockII {

	/*
	 * Problem ID : 122 (Easy)
	 * 
	 * Say you have an array prices for which the ith element is the price of a
	 * given stock on day i.
	 * 
	 * Design an algorithm to find the maximum profit. You may complete as many
	 * transactions as you like (i.e., buy one and sell one share of the stock
	 * multiple times).
	 * 
	 * Note: You may not engage in multiple transactions at the same time (i.e., you
	 * must sell the stock before you buy again).
	 *
	 * Input: [7,1,5,3,6,4] --> Output: 7
	 * 
	 * Explanation:
	 * 
	 * Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.Then
	 * buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
	 *
	 *
	 * Input: [7,6,4,3,1] --> Output: 0
	 * 
	 * Explanation:
	 * 
	 * In this case, no transaction is done, i.e. max profit = 0.
	 */

	public static void main(String[] args) {

		System.out.println(maxProfit(new int[] { 1, 2, 5,3, 4, 5 }));
	}

	private static int maxProfit(int[] prices) {

		// initial profit
		int profit = 0;

		int size = prices.length;

		// traverse the array of price from 1 day ahead
		for (int i = 1; i < size; ++i) {
			// if price of yesterday is less than today we add it in the profit
			if (prices[i - 1] < prices[i]) {
				profit += prices[i] - prices[i - 1];
			}
		}
		return profit;
	}

}

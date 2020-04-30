
public class BuyAndSellStockII {

	public static void main(String[] args) {

		System.out.println(maxProfit(new int[] { 1, 2, 3, 4, 5 }));
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

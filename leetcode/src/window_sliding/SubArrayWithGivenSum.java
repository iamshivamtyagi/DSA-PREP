package window_sliding;

public class SubArrayWithGivenSum {

	/*
	 * Given an array of integers and a target sum k. Find maximum sum of
	 * consecutive'k'elements.
	 * 
	 * Input : A = {1,8,30,-5,20,7} , k = 3
	 * 
	 * Output : 45
	 * 
	 * Input : A = {5,-10,6,90,3} , k = 2
	 * 
	 * Output : 96
	 *
	 */

	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 30, -5, 20, 7 };
		int k = 3;

		System.out.println(subArraySum(a, k));
	}

	private static int subArraySum(int[] a, int k) {
		int currSum = 0;
		int n = a.length;

		// window of size - k
		for (int i = 0; i < k; i++) {
			currSum += a[i];
		}

		// resultant sum
		int max = currSum;

		// sliding window and update currSum
		for (int i = k; i < n; i++) {
			currSum = currSum - a[i - k] + a[i];

			// update max iff max is smaller
			max = Math.max(max, currSum);
		}
		return max;
	}
}

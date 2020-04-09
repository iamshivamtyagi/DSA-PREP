
public class MaximumSubarray {

	// Kadane's Algorithm
	public static int maximumSubarray(int[] a) {
		// result stored in maxSum
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		int size = a.length;

		for (int i = 0; i < size; ++i) {
			// calculating current sum by adding current element of array into current sum
			currentSum += a[i];
			// update maxSum only if currentSum is more
			maxSum = Math.max(currentSum, maxSum);
			// update current sum in case of negative value
			currentSum = Math.max(currentSum, 0);
		}
		return maxSum;
	}
}

package main_package;

public class MaximumSubarray {

	/*
	 * Given an integer array nums, find the contiguous subarray (containing at
	 * least one number) which has the largest sum and return its sum.
	 * 
	 * Example:
	 * 
	 * Input: [-2,1,-3,4,-1,2,1,-5,4] -- > Output: 6
	 * 
	 * Explanation: [4,-1,2,1] has the largest sum = 6.
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(maximumSubarray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

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

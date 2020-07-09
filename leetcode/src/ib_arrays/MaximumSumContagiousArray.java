package ib_arrays;

public class MaximumSumContagiousArray {

	public static void main(String[] args) {

	}

	public static int maxSumContagiousArray(int[] a) {

		int max = Integer.MIN_VALUE;
		int currMax = 0;

		/*
		 * Kadane's Algorithm :
		 * 
		 * 1) Find currMax by adding elements.
		 * 
		 * 2) If current max is less than current element, update it with current
		 * element.
		 * 
		 * 3) If current max is greater than max , update max with currMax.
		 */
		for (int i = 0; i < a.length; i++) {
			currMax += a[i];
			if (currMax < a[i]) {
				currMax = a[i];
			}

			if (currMax > max) {
				max = currMax;
			}
		}

		return max;
	}
}

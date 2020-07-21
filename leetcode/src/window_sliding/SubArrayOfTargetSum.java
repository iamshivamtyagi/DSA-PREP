package window_sliding;

public class SubArrayOfTargetSum {

	/*
	 * Given unsorted array of non-negative integers. Find if there is a subarray
	 * with given target sum.
	 * 
	 * Input : A = { 1, 4, 20, 3, 10, 5 } , target = 33
	 * 
	 * Output : true
	 */

	public static void main(String[] args) {
		int[] a = new int[] { 1, 4, 20, 3, 10, 5 };
		int target = 33;
		System.out.println(subArrayOfTarget(a, target));
	}

	private static boolean subArrayOfTarget(int[] a, int target) {
		int currSum = a[0];
		int start = 0;

		for (int end = start + 1; end < a.length; end++) {

			// clean previous window
			// if currSum exceeds the target, then remove the starting elements
			while (currSum > target && start < end - 1) {

				currSum = currSum - a[start];
				start++;
			}

			if (currSum == target) {
				return true;
			}

			// add end element to currSum
			if (end < a.length) {
				currSum += a[end];
			}

		}

		return target == currSum;
	}

}

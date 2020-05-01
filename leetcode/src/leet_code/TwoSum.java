package leet_code;

class TwoSum {

	/*
	 * Problem ID : 1 (Easy)
	 * 
	 * Given an array of integers, return indices of the two numbers such that they
	 * add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * Example:
	 * 
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 *
	 */

	public static void main(String[] args) {
		int[] b = new int[] { 0, 1, 0, 3, 12 };
		int ans[] = twoSum(b, 7);
		display(ans);
	}

	public static int[] twoSum(int[] nums, int target) {
		// resultant array with default result
		int[] a = new int[] { -1, -1 };

		// traverse array from left to right
		for (int i = 0; i < nums.length; ++i) {
			// traverse from one step ahead index to end of array
			for (int j = i + 1; j < nums.length; ++j) {
				// checking, target achieved by two numbers or not
				if (nums[i] == target - nums[j]) {
					a[0] = i;
					a[1] = j;
					return a;
				}
			}
		}
		return a;
	}

	public static void display(int[] z) {
		for (int i : z)
			System.out.print(i + " ");
		System.out.println();
	}
}

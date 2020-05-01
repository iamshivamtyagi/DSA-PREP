package main_package;

class TwoSum {

	public static void main(String[] args) {
		int[] b = new int[] { 0, 1, 0, 3, 12 };
		int ans[] = new TwoSum().twoSum(b, 7);
		display(ans);
	}

	public int[] twoSum(int[] nums, int target) {
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

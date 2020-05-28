package leet_code;

public class NonDecreasingArray {

	/*
	 * Problem Id : 665 (Easy)
	 * 
	 * Given an array nums with n integers, your task is to check if it could become
	 * non-decreasing by modifying at most 1 element.
	 * 
	 * We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for
	 * every i (0-based) such that (0 <= i <= n - 2).
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [4,2,3] Output: true
	 * 
	 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [4,2,1] Output: false
	 * 
	 * Explanation: You can't get a non-decreasing array by modify at most one
	 * element.
	 */
	public static void main(String[] args) {
		int[] a = { 4, 2, 3 };
		System.out.println(nonDecreasingArray(a));
	}

	public static boolean nonDecreasingArray(int[] a) {
		boolean isChanged = false;
		int size = a.length;

		// traverse the array upto second last element
		for (int i = 0; i < size - 1; i++) {
			/*
			 * when current element is greate than next element & no changes done before
			 */
			if (a[i] > a[i + 1] && !isChanged) {

				/*
				 * now,there are 2 possibilities :
				 * 
				 * 1) If the element greater than next element is at first index.
				 * 
				 * In this case, we know we just need to change the current index element to
				 * equal or less than next element. This case handled easily by updating
				 * isChanged variable to true.
				 * 
				 * 2) If element greater than next element & it is at index other than first
				 * index. Now, there is also 2 possibilities :
				 * 
				 * a) If previous index element is greater than current index's next index
				 * element. In this case we update the next element to current element.
				 * 
				 * b) If previous index element is smaller than or equal to current index's next
				 * index element. In this case we update the current element to previous
				 * element.
				 */
				if (i > 0) {
					if (a[i - 1] <= a[i + 1]) {
						a[i] = a[i - 1];
					} else {
						a[i + 1] = a[i];
					}
				}
				isChanged = true;
			} else if (a[i] > a[i + 1] && isChanged) {
				return false;
			} else {
				continue;
			}
		}
		return true;
	}

}

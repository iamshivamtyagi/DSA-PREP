package leet_code;

public class MaxConsecutiveOnes {

	/*
	 * Problem ID : 485 (Easy)
	 * 
	 * Given a binary array, find the maximum number of consecutive 1s in this
	 * array.
	 * 
	 * Example 1: Input: [1,1,0,1,1,1] Output: 3
	 * 
	 * Explanation: The first two digits or the last three digits are consecutive
	 * 1s. The maximum number of consecutive 1s is 3.
	 * 
	 * 
	 * Note:
	 * 
	 * The input array will only contain 0 and 1.
	 * 
	 * The length of input array is a positive integer and will not exceed 10,000
	 */

	public static void main(String[] args) {
		System.out.println(findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {

		int currentConsecutiveOnes = 0;

		int maxConsecutiveOne = Integer.MIN_VALUE;

		// traverse the array
		for (int j : nums) {
			// when current element is 1, increment the current consecutive ones
			if (j == 1) {
				currentConsecutiveOnes++;
			}
			/*
			 * when 0 encounter, we store maximum of currentConsecutiveOnes &
			 * maxConsecutiveOnes
			 */
			else {
				maxConsecutiveOne = Math.max(maxConsecutiveOne, currentConsecutiveOnes);
				currentConsecutiveOnes = 0;
			}
		}
		return Math.max(maxConsecutiveOne, currentConsecutiveOnes);
	}
}
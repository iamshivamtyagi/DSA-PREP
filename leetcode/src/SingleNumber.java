
public class SingleNumber {

	/*
	 * Given a non-empty array of integers, every element appears twice except for
	 * one. Find that single one.
	 * 
	 * Note: Your algorithm should have a linear runtime complexity. Could you
	 * implement it without using extra memory?
	 * 
	 * Input: [2,2,1] --> Output: 1
	 * 
	 * Input: [4,1,2,1,2] --> Output: 4
	 */

	public static int singleNumber(int[] nums) {
		int n = 0;

		for (int i : nums) {
			n = n ^ i;
		}
		return n;
	}
}

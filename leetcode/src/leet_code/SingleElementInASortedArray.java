package leet_code;

import java.util.HashMap;

public class SingleElementInASortedArray {

	/*
	 * Problem ID : 540 (Medium)
	 * 
	 * You are given a sorted array consisting of only integers where every element
	 * appears exactly twice, except for one element which appears exactly once.
	 * Find this single element that appears only once.
	 * 
	 * Follow up: Your solution should run in O(log n) time and O(1) space.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,1,2,3,3,4,4,8,8]
	 * 
	 * Output: 2
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [3,3,7,7,10,11,11]
	 * 
	 * Output: 10
	 */

	public static void main(String[] args) {
		int[] a = { 3, 3, 7, 7, 10, 11, 11 };
		System.out.println(singleNonDuplicate(a));

	}

	// My Approach : O(n) Time & Space Complexity
	public static int singleNonDuplicate(int[] nums) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		/*
		 * Put every numbers in Array in the hashmap with the number of occurance in
		 * their value
		 */
		for (int n : nums) {
			hm.put(n, hm.getOrDefault(n, 0) + 1);
		}

		// return that number from the array whose value is less than 2
		for (int n : nums) {
			if (hm.get(n) < 2) {
				return n;
			} else {
				continue;
			}
		}
		return -1;
	}

	// optimized approach : O(logN) & O(1) Time & Space Complexity
	public static int singleNonDuplicateOptimal(int[] nums) {

		int size = nums.length;

		// if size of array is 1 than that single number is the answers
		if (size == 1) {
			return nums[0];
		}
		/*
		 * Two Pointer Approach
		 * 
		 * We start from index 0 & 1. We compare index elements for equality, if they
		 * are equal we move both pointers 2 steps. If they are not equal, then first
		 * index pointer element is the answer.
		 * 
		 */
		for (int i = 0, j = 1; i < size - 1; i += 2) {
			if (nums[i] != nums[j]) {
				return nums[i];
			}
			j += 2;
		}

		/*
		 * if array have odd number or elements & we reach end of loop, then last
		 * element is the answer
		 */
		return nums[size - 1];
	}
}

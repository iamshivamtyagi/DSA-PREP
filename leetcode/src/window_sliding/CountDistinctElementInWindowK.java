package window_sliding;

import java.util.HashMap;

public class CountDistinctElementInWindowK {

	/*
	 * Count distinct elements in every window of size k
	 *
	 * Given an array of size n and an integer k, return the count of distinct
	 * numbers in all windows of size k.
	 * 
	 * Example:
	 * 
	 * Input: arr[] = {1, 2, 1, 3, 4, 2, 3}; k = 4
	 * 
	 * Output: 3 4 4 3
	 * 
	 * Explanation:
	 * 
	 * First window is {1, 2, 1, 3}, count of distinct numbers is 3
	 * 
	 * Second window is {2, 1, 3, 4} count of distinct numbers is 4
	 * 
	 * Third window is {1, 3, 4, 2} count of distinct numbers is 4
	 * 
	 * Fourth window is {3, 4, 2, 3} count of distinct numbers is 3
	 * 
	 * Input: arr[] = {1, 2, 4, 4}; k = 2
	 * 
	 * Output: 2 2 1
	 * 
	 * Explanation:
	 * 
	 * First window is {1, 2}, count of distinct numbers is 2
	 * 
	 * First window is {2, 4}, count of distinct numbers is 2
	 * 
	 * First window is {4, 4}, count of distinct numbers is 1
	 */

	public static void main(String[] args) {
		countDistinct(new int[] { 1, 2, 4, 4 }, 2);
	}

	public static void countDistinct(int[] a, int k) {

		// hashmap to count unique characters/elements
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		// first windows of size k
		for (int i = 0; i < k; i++) {
			hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
		}

		// distinct element in current window of size 'k'
		System.out.println(hm.size());

		for (int i = k; i < a.length; i++) {

			// removing leftmost item from window
			if (hm.get(a[i - k]) == 1) {
				hm.remove(a[i - k]);
			} else {
				hm.put(a[i - k], hm.get(a[i - k]) - 1);
			}

			// adding new element in the window
			hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);

			System.out.println(hm.size());
		}
	}

}

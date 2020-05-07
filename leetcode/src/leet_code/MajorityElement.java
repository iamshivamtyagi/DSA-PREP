package leet_code;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	/*
	 * Problem ID : 169 (Easy)
	 * 
	 * Given an array of size n, find the majority element. The majority element is
	 * the element that appears more than [n/2] times.
	 * 
	 * You may assume that the array is non-empty and the majority element always
	 * exist in the array.
	 * 
	 * Example 1:
	 * 
	 * Input: [3,2,3] -> Output: 3
	 * 
	 * Example 2:
	 * 
	 * Input: [2,2,1,1,1,2,2] -> Output: 2
	 */

	public static void main(String[] args) {

		System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
	}

	private static int majorityElement(int[] nums) {

		int maxKey = 0;
		int maxValue = 0;

		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i : nums) {
			if (m.containsKey(i)) {
				m.put(i, m.getOrDefault(i, 0) + 1);
			} else {
				m.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : m.entrySet()) {
			if (e.getValue() > maxValue) {
				maxKey = e.getKey();
				maxValue = e.getValue();
			}
		}

		return maxKey;
	}

}

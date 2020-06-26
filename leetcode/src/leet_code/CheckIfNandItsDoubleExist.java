package leet_code;

import java.util.HashSet;

public class CheckIfNandItsDoubleExist {

	/*
	 * Problem ID : 1346 (Easy)
	 * 
	 * Given an array arr of integers, check if there exists two integers N and M
	 * such that N is the double of M ( i.e. N = 2 * M).
	 * 
	 * More formally check if there exists two indices i and j such that :
	 * 
	 * i != j 0 <= i, j < arr.length arr[i] == 2 * arr[j]
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: arr = [10,2,5,3] Output: true
	 * 
	 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
	 * 
	 * Example 2:
	 * 
	 * Input: arr = [7,1,14,11] Output: true
	 * 
	 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
	 * 
	 * Example 3:
	 * 
	 * Input: arr = [3,1,7,11] Output: false
	 * 
	 * Explanation: In this case does not exist N and M, such that N = 2 * M.
	 */

	public static void main(String[] args) {

		int[] a = new int[] { 7, 1, 14, 11 };

		System.out.println(checkIfExist(a));
	}

	private static boolean checkIfExist(int[] a) {

		HashSet<Integer> h = new HashSet<>();

		for (int i = 0; i < a.length; ++i) {

			if (h.contains(2 * a[i]) || (a[i] % 2 == 0 && h.contains(a[i] / 2))) {
				return true;
			} else {
				h.add(a[i]);
			}
		}
		return false;
	}

}

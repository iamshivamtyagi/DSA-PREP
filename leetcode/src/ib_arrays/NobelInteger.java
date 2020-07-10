package ib_arrays;

import java.util.Arrays;

public class NobelInteger {

	/*
	 * Noble Integer
	 * 
	 * Problem Description
	 * 
	 * Given an integer array A, find if an integer p exists in the array such that
	 * the number of integers greater than p in the array equals to p.
	 * 
	 * 
	 * 
	 * Input Format
	 * 
	 * First and only argument is an integer array A.
	 * 
	 * 
	 * 
	 * Output Format
	 * 
	 * Return 1 if any such integer p is found else return -1.
	 * 
	 * 
	 * 
	 * Example Input
	 * 
	 * Input 1:
	 * 
	 * A = [3, 2, 1, 3]
	 * 
	 * Output 1: 1
	 * 
	 * Input 2:
	 * 
	 * A = [1, 1, 3, 3]
	 * 
	 * Output 2: -1
	 * 
	 * Example Explanation
	 * 
	 * Explanation 1:
	 * 
	 * For integer 2, there are 2 greater elements in the array. So, return 1.
	 * 
	 * Explanation 2:
	 * 
	 * There is no such integer exists.
	 */

	public static void main(String[] args) {
		System.out.println(solve(new int[] { 1, 2, 7, 0, 9, 3, 6, 0, 6 }));
	}

	public static int solve(int[] a) {

		int size = a.length;
		Arrays.sort(a);

		if (a[size - 1] == 0) {
			return 1;
		}

		int p = 0;
		int count = 0;

		for (int i = 0; i < size - 1; i++) {
			p = a[i];
			count = 0;
			if (p < a[i + 1]) {
				count = size - i - 1;
				if (count == p)
					return 1;
				else
					continue;

			}
		}
		return -1;
	}
}

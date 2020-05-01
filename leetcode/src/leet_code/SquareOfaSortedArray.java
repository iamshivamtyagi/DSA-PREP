package leet_code;


import java.util.Arrays;

public class SquareOfaSortedArray {

	/*
	 * Problem Id : 977 (Easy)
	 * 
	 * Given an array of integers A sorted in non-decreasing order, return an array
	 * of the squares of each number, also in sorted non-decreasing order.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: [-4,-1,0,3,10] -> Output: [0,1,9,16,100]
	 * 
	 * Example 2:
	 * 
	 * Input: [-7,-3,2,3,11] -> Output: [4,9,9,49,121]
	 * 
	 * 
	 * Note:
	 * 
	 * a) 1 <= A.length <= 10000
	 * 
	 * b) -10000 <= A[i] <= 10000
	 * 
	 * c) A is sorted in non-decreasing order.
	 *
	 */

	public static void main(String[] args) {

		int[] a = new int[] { -1, 0, 5, 10 };
		int[] b = SquareOfaSortedArray.sortedSquares(a);
		display(b);
	}

	public static int[] sortedSquares(int[] A) {
		int size = A.length;
		int[] ans = new int[size];
		// loop to store square of original array data into answer array
		for (int i = 0; i < size; ++i) {
			ans[i] = A[i] * A[i];
		}
		// sorting answer array
		Arrays.sort(ans);
		return ans;
	}

	public static void display(int[] z) {
		for (int i : z)
			System.out.print(i + " ");
		System.out.println();
	}
}
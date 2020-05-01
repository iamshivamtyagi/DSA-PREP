package main_package;

import java.util.Arrays;

public class SquareOfaSortedArray {

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
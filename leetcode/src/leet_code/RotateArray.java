package leet_code;

public class RotateArray {

	/*
	 * Problem ID : 189 (Easy)
	 * 
	 * Given an array, rotate the array to the right by k steps, where k is
	 * non-negative.
	 * 
	 * Follow up:
	 * 
	 * Try to come up as many solutions as you can, there are at least 3 different
	 * ways to solve this problem. Could you do it in-place with O(1) extra space?
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]
	 * 
	 * Explanation: rotate 1 steps to the right: [7,1,2,3,4,5,6]
	 * 
	 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
	 * 
	 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [-1,-100,3,99], k = 2 Output: [3,99,-1,-100]
	 * 
	 * Explanation:
	 * 
	 * rotate 1 steps to the right: [99,-1,-100,3]
	 * 
	 * rotate 2 steps to the right: [3,99,-1,-100]
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("Original Array : ");
		display(a);
		// rotateBasic(a, 3);
		// display(a);
		// rotateIntermediate(a, 3);
		// display(a);
		rotateOptimize(a, 3);
		display(a);
	}

	private static void display(int[] a) {
		for (int i : a)
			System.out.print(i + " ");
		System.out.println("\n");
	}

	// O(k*n) & O(1)
	public static void rotateBasic(int[] a, int k) {

		// rotate array k times
		for (int i = 0; i < k; i++) {
			int next = a[0];
			int last = a[a.length - 1];

			// rotate array by 1 step
			for (int j = 1; j < a.length; ++j) {
				int temp = a[j];
				a[j] = next;
				next = temp;
			}
			a[0] = last;
		}
	}

	// O(n) & O(n)
	public static void rotateIntermediate(int[] a, int k) {
		int size = a.length;

		/*
		 * when rotate number is equal to size of the array, resultant array is same as
		 * before
		 */
		k %= size;

		// new array of size n
		int[] n = new int[size];

		// storing data of given array to new array by positioning it from kth index
		for (int i = 0; i < size; i++) {
			n[(i + k) % size] = a[i];
		}
		for (int i = 0; i < size; i++) {
			a[i] = n[i];
		}
	}

	// O(n) & O(1)
	public static void rotateOptimize(int[] a, int k) {
		/*
		 * We follow, reversing the array technique by parts here. First, we rotate the
		 * whole array,then partly reverse is according to given value of k
		 */
		reverseArray(a, 0, a.length - 1);
		reverseArray(a, 0, k - 1);
		reverseArray(a, k, a.length - 1);
	}

	public static void reverseArray(int[] a, int l, int r) {

		while (l < r) {
			int t = a[l];
			a[l] = a[r];
			a[r] = t;
			l++;
			r--;
		}
	}
}

package leet_code;

public class DuplicateZeros {

	/*
	 * Given a fixed length array arr of integers, duplicate each occurrence of
	 * zero, shifting the remaining elements to the right.
	 * 
	 * Note that elements beyond the length of the original array are not written.
	 * 
	 * Do the above modifications to the input array in place, do not return
	 * anything from your function.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: [1,0,2,3,0,4,5,0] Output: null
	 * 
	 * Explanation: After calling your function, the input array is modified to:
	 * [1,0,0,2,3,0,0,4]
	 * 
	 * Example 2:
	 * 
	 * Input: [1,2,3] Output: null
	 * 
	 * Explanation: After calling your function, the input array is modified to:
	 * [1,2,3]
	 */

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 2, 3, 0, 3, 0, 1, 4, 0 };
		display(a);
		duplicateZeroes(a);
		display(a);
	}

	private static void display(int[] a) {
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void duplicateZeroes(int[] a) {

		// loop to traverse the array (upto 2nd Last element) & check for zeroes
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == 0) {
				moveElements(a, i + 1);
				a[i + 1] = a[i];
				i++;
			}
		}

	}

	private static void moveElements(int[] a, int idx) {
		for (int i = a.length - 1; i >= idx; --i) {
			a[i] = a[i - 1];
		}
	}

}

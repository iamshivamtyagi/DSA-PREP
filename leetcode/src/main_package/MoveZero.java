package main_package;

public class MoveZero {

	/*
	 * Given an array nums, write a function to move all 0's to the end of it while
	 * maintaining the relative order of the non-zero elements.
	 * 
	 * Example:
	 * 
	 * Input: [0,1,0,3,12] --> Output: [1,3,12,0,0]
	 * 
	 * Note:
	 * 
	 * You must do this in-place without making a copy of the array & Minimize the
	 * total number of operations.
	 */

	public static void main(String[] args) {

		int a[] = new int[] { 0, 1, 0, 3, 12 };

		display(a);

		moveZeroes(a);

		display(a);
	}

	private static void display(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void moveZeroes(int[] a) {

		/*
		 * two pointer approach, we simply take two indices, first one is start from 0
		 * ans second start from one index ahead of first index
		 */
		int l = 0;
		int size = a.length;
		int r = l + 1;

		// loop until any indices reaches end of the array
		while (l < size && r < size) {
			/*
			 * CASE I : When left index element is 0 & right index is also zero.
			 */
			/*
			 * In this case we simply increment the right by 1 position
			 */
			if (a[l] == 0 && a[r] == 0) {
				r++;
			}
			/*
			 * CASE II : When left index element is zero but right index element is not zero
			 */
			/*
			 * In this case we switch left index element with right index element
			 */
			else if (a[l] == 0 && a[r] != 0) {
				int temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				++l;
				++r;
			}
			/*
			 * CASE III : When left index element is not zero.
			 */
			/*
			 * In this case, we simply increment both indices by 1.
			 */
			else {
				++r;
				++l;
			}
		}
	}
}

package leet_code;

public class RemoveDuplicatesFromSortedArray {

	/*
	 * Problem ID : 26 (Easy)
	 * 
	 * 
	 * Given a sorted array nums, remove the duplicates in-place such that each
	 * element appear only once and return the new length.
	 * 
	 * Do not allocate extra space for another array, you must do this by modifying
	 * the input array in-place with O(1) extra memory.
	 * 
	 * Example 1:
	 * 
	 * Given nums = [1,1,2],
	 * 
	 * Your function should return length = 2, with the first two elements of nums
	 * being 1 and 2 respectively.
	 * 
	 * It doesn't matter what you leave beyond the returned length.
	 * 
	 * Example 2:
	 * 
	 * Given nums = [0,0,1,1,1,2,2,3,3,4],
	 * 
	 * Your function should return length = 5, with the first five elements of nums
	 * being modified to 0, 1, 2, 3, and 4 respectively.
	 * 
	 * It doesn't matter what values are set beyond the returned length.
	 */

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		int len = removeDuplicatesFromSortedArray(arr);

		display(arr, len);
	}

	private static void display(int[] arr, int len) {

		for (int i = 0; i < len; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static int removeDuplicatesFromSortedArray(int[] arr) {

		// index where we insert non duplicate element
		int newIndex = 0;

		// traverse the array
		for (int j = 0; j < arr.length; ++j) {
			/*
			 * check current index is equal to newIndex element ;
			 * 
			 * 1) If not equal, increment newIndex and insert current element into newIndex
			 * 2) If equal, simly continue the loop.
			 */
			if (arr[j] != arr[newIndex]) {
				++newIndex;
				arr[newIndex] = arr[j];
			} else {
				continue;
			}
		}
		
		return newIndex + 1;
	}

}

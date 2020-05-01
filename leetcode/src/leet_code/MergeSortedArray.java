package leet_code;

public class MergeSortedArray {

	/*
	 * Problem ID : 88 (Easy)
	 * 
	 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
	 * one sorted array.
	 * 
	 * Note:
	 * 
	 * The number of elements initialized in nums1 and nums2 are m and n
	 * respectively.
	 * 
	 * You may assume that nums1 has enough space (size that is greater or equal to
	 * m + n) to hold additional elements from nums2.
	 * 
	 * Example:
	 * 
	 * Input: nums1 = [1,2,3,0,0,0], m = 3 ; nums2 = [2,5,6], n = 3
	 * 
	 * Output: [1,2,2,3,5,6]
	 * 
	 */

	public static void main(String[] args) {
		int[] a = new int[] { -1, 0, 5, 10, 0 };
		int[] b = new int[] { 3 };
		merge(a, 4, b, 1);
		display(a);
	}

	public static void merge(int[] a, int m, int[] b, int n) {
		int l = 0, r = 0, size = a.length;
		// loop to traverse primary array "a"
		while (l != size && r != n) {
			/*
			 * check whether secondary array element larger than primary array element
			 */
			if (a[l] > b[r]) {
				/*
				 * insert the element at index 'l' if secondary array element is smaller
				 */
				insertAtIndex(a, l, b[r], size);
				++r;
			}
			++l;
		}
		// inserting remaining element of secondary array into primary array if any left
		while (r != n) {
			a[m + r] = b[r];
			++r;
		}
	}

	public static void insertAtIndex(int[] a, int idx, int data, int size) {
		// shifting elements in array by 1 index from right until insert data index
		// reached
		for (int i = size - 1; i > idx; --i) {
			a[i] = a[i - 1];
		}
		a[idx] = data;
	}

	public static void display(int[] z) {
		for (int i : z)
			System.out.print(i + " ");
		System.out.println();
	}
}
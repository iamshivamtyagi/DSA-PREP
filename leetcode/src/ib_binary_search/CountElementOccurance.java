package ib_binary_search;

public class CountElementOccurance {

	/*
	 * Given a sorted array of integers, find the number of occurrences of a given
	 * target value. Your algorithm’s runtime complexity must be in the order of
	 * O(log n).
	 * 
	 * If the target is not found in the array, return 0
	 * 
	 * Example :
	 * 
	 * Given [5, 7, 7, 8, 8, 10] and target value 8
	 * 
	 * return 2.
	 */

	public static void main(String[] args) {
		System.out.println(countElementOccurance(new int[] { 2 }, 1));
	}

	public static int countElementOccurance(int[] a, int b) {
		int l = 0;
		int r = a.length - 1;
		int first = -1;
		int last = -1;

		// finding first occurance
		while (l <= r) {
			int mid = l + (r - l) / 2; // finding mid

			if (a[mid] == b) {
				first = mid;
				r = mid - 1;
			} else if (a[mid] < b) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		if (first == -1)
			return 0;

		l = first + 1;
		r = a.length - 1;

		// finding last occurance
		while (l <= r) {
			int mid = l + (r - l) / 2; // finding mid

			if (a[mid] == b) {
				last = mid;
				l = mid + 1;
			} else if (a[mid] < b) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		// if last occurance not found
		if (last == -1) {
			return 1;
		}

		return (last - first) + 1;
	}
}

public class MergeTwoSortedArray {
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

}
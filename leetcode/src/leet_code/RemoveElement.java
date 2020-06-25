package leet_code;

public class RemoveElement {

	/*
	 * Problem ID : 27 (Easy)
	 * 
	 * Given an array nums and a value val, remove all instances of that value
	 * in-place and return the new length.
	 * 
	 * Do not allocate extra space for another array, you must do this by modifying
	 * the input array in-place with O(1) extra memory.
	 * 
	 * The order of elements can be changed. It doesn't matter what you leave beyond
	 * the new length.
	 * 
	 * Example 1:
	 * 
	 * Given nums = [3,2,2,3], val = 3,
	 * 
	 * Your function should return length = 2, with the first two elements of nums
	 * being 2. It doesn't matter what you leave beyond the returned length.
	 * 
	 * Example 2:
	 * 
	 * Given nums = [0,1,2,2,3,0,4,2], val = 2,
	 * 
	 * Your function should return length = 5, with the first five elements of nums
	 * containing 0, 1, 3, 0, and 4.
	 * 
	 */

	public static void main(String[] args) {
		int[] a = new int[] { 3, 2, 2, 3 };
		int val = 3;
		int newLength = 0;
		// int newLength = removeElement(a, val);

		newLength = removeElementOptimized(a, val);

		for (int i = 0; i < newLength; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	private static int removeElement(int[] a, int val) {

		// non-val element of array inserted/stored at this index
		int mainIndex = 0;

		// iterate the array
		for (int i = 0; i < a.length; ++i) {
			// we insert element at mainIndex only if it is not equal to val
			if (a[i] != val) {
				a[mainIndex] = a[i];
				++mainIndex;
			}
			// we encounter element equal to val then we simply skip insertion
			else {
				continue;
			}
		}
		return mainIndex;
	}

	/*
	 * This method eliminates unnecessary copy operation. Copy of the element only
	 * when we find element equal to 'val'
	 */
	private static int removeElementOptimized(int[] a, int val) {

		int i = 0;
		int endIndex = a.length;

		// iterate the element
		while (i < endIndex) {
			// swap element with endIndex and reduce endIndex by 1
			if (a[i] == val) {
				a[i] = a[endIndex - 1];
				--endIndex;
			}
			// move pointer to next index if current element not equal to val
			else {
				++i;
			}
		}

		return endIndex;

	}

}

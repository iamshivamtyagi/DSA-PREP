package ib_arrays;

public class FindDuplicateInArray {

	/*
	 * Find Duplicate in Array
	 * 
	 * Asked in: Amazon VMWare Riverbed
	 * 
	 * Given a read only array of n + 1 integers between 1 and n, find one number
	 * that repeats in linear time using less than O(n) space and traversing the
	 * stream sequentially O(1) times.
	 * 
	 * Sample Input:
	 * 
	 * [3 4 1 4 1]
	 * 
	 * Sample Output:
	 * 
	 * 1
	 * 
	 * If there are multiple possible answers ( like in the sample case above ),
	 * output any one.
	 * 
	 * If there is no duplicate, output -1
	 */

	public static void main(String[] args) {

		System.out.println(findDuplicate(new int[] { 1, 2, 3, 4, 5, 6, 1 }));
	}

	/*
	 * In problem statement, it is given that array consist of elements between 1 &
	 * n. It means for every element value, there also exist an index equal to the
	 * element value.
	 * 
	 * We can use our current array as HashSet & find duplicate (also every
	 * duplicates) present in the array.
	 * 
	 * Algorithm :
	 * 
	 * 1) we traverse the array from 0th index to a.length - 1 index.
	 * 
	 * 2) for every ith element, we check element at the current element's value
	 * index is more than zero or not. i.e., arr[abs(a[i])] >= 0 or not.
	 * 
	 * 3) if arr[abs(a[i])] >= 0 is true, update that index element by multiply
	 * value by -1. i.e., arr[abs(a[i])] = -arr[abs(a[i])]
	 * 
	 * 4) if arr[abs(a[i])] >= 0 is false, hurrey we find first duplicate.
	 * 
	 */

	public static int findDuplicate(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int curr = a[Math.abs(a[i])];
			if (curr >= 0) {
				a[Math.abs(a[i])] = -curr;
			} else {
				int ans = Math.abs(a[i]);
				return ans;
			}
		}
		return -1;
	}

}

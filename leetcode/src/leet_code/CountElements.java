package leet_code;
import java.util.HashSet;

public class CountElements {

	/*
	 * 
	 * Given an integer array arr, count element x such that x + 1 is also in arr.If
	 * there're duplicates in arr, count them seperately.
	 * 
	 * Input: arr = [1,2,3] --> Output: 2 ;
	 * 
	 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
	 * 
	 * Input: arr = [1,1,3,3,5,5,7,7] --> Output: 0
	 * 
	 * Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
	 */

	public static void main(String[] args) {
		System.out.println(countElements(new int[] { 1, 1, 3, 3, 5, 5, 7, 7 }));
	}

	static int countElements(int[] a) {

		HashSet<Integer> m = new HashSet<Integer>();

		// first we push all the elements in the hashset
		for (int i : a) {
			m.add(i);
		}

		int count = 0;

		// traverse the array to check x+1 existed or not
		for (int i = 0; i < a.length; ++i) {
			if (m.contains(a[i] + 1))
				++count;
		}

		return count;
	}
}

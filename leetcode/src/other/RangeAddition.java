package other;

public class RangeAddition {

	/*
	 * Range Addition : Medium
	 * 
	 * Assume you have an array of length n initialized with all 0's and are given k
	 * update operations.
	 * 
	 * Each operation is represented as a triplet: [startIndex, endIndex, inc] which
	 * increments each element of subarray A[startIndex ... endIndex] (startIndex
	 * and endIndex inclusive) with inc.
	 * 
	 * Return the modified array after all k operations were executed.
	 * 
	 * Example Given: length = 5, updates = [ [1, 3, 2], [2, 4, 3], [0, 2, -2] ]
	 * return [-2, 0, 3, 5, 3]
	 * 
	 * Explanation:
	 * 
	 * Initial state: [ 0, 0, 0, 0, 0 ]
	 * 
	 * After applying operation [1, 3, 2] : [ 0, 2, 2, 2, 0 ]
	 * 
	 * After applying operation [2, 4, 3] : [ 0, 2, 5, 5, 3 ]
	 * 
	 * After applying operation [0, 2, -2]: [-2, 0, 3, 5, 3 ]
	 */

	public static void main(String[] args) {
		int[][] updates = { { 1, 3, 2 }, { 2, 4, 3 }, { 0, 2, -2 } };

		display(getModifiedArray(5, updates));
	}

	private static void display(int[] modifiedArray) {
		for (int i : modifiedArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int[] getModifiedArray(int length, int[][] updates) {
		// saves the answer
		int[] a = new int[length];

		// traverse updates array rows
		for (int i = 0; i < updates.length; ++i) {
			// traverse indices given by update array rows in first two indices
			for (int k = updates[i][0]; k <= updates[i][1]; k++) {
				// update the element of the array by last index element
				a[k] += updates[i][2];
			}
		}
		return a;
	}
}

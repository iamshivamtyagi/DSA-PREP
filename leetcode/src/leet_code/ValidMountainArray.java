package leet_code;

public class ValidMountainArray {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 1 };

		System.out.println(validMountainArray(a));

	}

	public static boolean validMountainArray(int[] A) {
		boolean increasing = false;
		boolean decreasing = false;

		int i = 0;

		// traverse array until it strictly increasing
		while (i < A.length - 1 && A[i + 1] - A[i] > 0) {
			if (!increasing)
				increasing = true;
			i++;
		}
		// check whether we encounter stable state or not
		if (i < A.length - 1 && A[i + 1] - A[i] == 0)
			return false;

		// traverse array until it strictly decreasing
		while (i < A.length - 1 && A[i + 1] - A[i] < 0) {
			if (!decreasing)
				decreasing = true;
			++i;
		}

		/*
		 * Checking for final conditions :
		 * 
		 * 1) Array must be Strictly Increasing
		 * 
		 * 2) Array must be strictly increasing
		 * 
		 * 3) i must be equal to size - 1
		 * 
		 * If all condition satisfy, then return true else false
		 */
		if (i == A.length - 1 && increasing && decreasing)
			return true;
		else
			return false;
	}

}

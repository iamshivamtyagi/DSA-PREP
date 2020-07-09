package ib_arrays;

public class MaximumAbsoluteDifference {

	/*
	 * Maximum Absolute Difference
	 * 
	 * Asked in: Amazon
	 * 
	 * You are given an array of N integers, A1, A2 ,..., AN. Return maximum value
	 * of f(i, j) for all 1 <= i, j <= N. f(i, j) is defined as
	 * 
	 * |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
	 * 
	 * For example,
	 * 
	 * A=[1, 3, -1]
	 * 
	 * f(1, 1) = f(2, 2) = f(3, 3) = 0
	 * 
	 * f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
	 * 
	 * f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
	 * 
	 * f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5
	 * 
	 * So, we return 5.
	 */

	public static void main(String[] args) {
		System.out.println(maxArr(new int[] { 1, 3, -1 }));
	}

	/*
	 * Here, we need to return maximum of following possible values:
	 * 
	 * f(i,j) = |A[i] - A[j]| + |i - j|
	 * 
	 * We need to simplify above statement -
	 * 
	 * 1) (A[i] - A[j]) - (i - j) , when (i - j) < 0 && (A[i] - A[j]) > 0
	 * 
	 * 2) (A[i] - A[j]) + (i - j) , when (i - j) > 0 && (A[i] - A[j]) > 0
	 * 
	 * 3) -(A[i] - A[j]) + (i - j) , when (i - j) > 0 && (A[i] - A[j]) < 0
	 * 
	 * 4) -(A[i] - A[j]) - (i - j) , when (i - j) < 0 && (A[i] - A[j]) < 0
	 * 
	 * Here, 1 & 3 equations are equal && 2 & 4 equations are equal.
	 * 
	 * Now, we just need to find max1, min1 & max2 ,min2 as:
	 * 
	 * max1 = max( max1, A[i] + i)
	 * 
	 * min1 = min( min1, A[i] + i)
	 * 
	 * max2 = max( max2, -A[i] + i)
	 * 
	 * min2 = min( min2, -A[i] + i)
	 * 
	 * MAX = max(max1 - min1, max2 - min2)
	 */

	public static int maxArr(int[] A) {

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i = 0; i < A.length; i++) {
			max1 = Math.max(max1, A[i] + i);
			min1 = Math.min(min1, A[i] + i);
			max2 = Math.max(max2, -A[i] + i);
			min2 = Math.min(min2, -A[i] + i);
		}

		return Math.max(max1 - min1, max2 - min2);
	}
}

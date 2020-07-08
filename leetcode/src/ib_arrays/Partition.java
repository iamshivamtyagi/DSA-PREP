package ib_arrays;

public class Partition {

	/*
	 * Partitions
	 * 
	 * Asked in: EzCred
	 * 
	 * Problem Description :
	 * 
	 * You are given a 1D integer array B containing A integers.
	 * 
	 * Count the number of ways to split all the elements of the array into 3
	 * contiguous parts so that the sum of elements in each part is the same.
	 * 
	 * Such that : sum(B[1],..B[i]) = sum(B[i+1],...B[j]) = sum(B[j+1],...B[n])
	 * 
	 * 
	 * 
	 * Problem Constraints
	 * 
	 * a) 1 <= A <= 105
	 * 
	 * b) -109 <= B[i] <= 109
	 * 
	 * 
	 * Input Format First argument is an integer A.
	 * 
	 * Second argument is an 1D integer array B of size A.
	 * 
	 * 
	 * Output Format Return a single integer denoting the number of ways to split
	 * the array B into three parts with the same sum. *
	 * 
	 * Example
	 * 
	 * Input 1:
	 * 
	 * A = 5 B = [1, 2, 3, 0, 3]
	 * 
	 * Input 2:
	 * 
	 * A = 4 B = [0, 1, -1, 0]
	 * 
	 * 
	 * Output 1:
	 * 
	 * 2
	 * 
	 * Output 2:
	 * 
	 * 1
	 * 
	 * 
	 * Explanation 1:
	 * 
	 * There are no 2 ways to make partitions -
	 * 
	 * 1.(1,2)+(3)+(0,3).
	 * 
	 * 2. (1,2)+(3,0)+(3).
	 * 
	 * Explanation 2:
	 * 
	 * There is only 1 way to make partition - 1. (0)+(-1,1)+(0).
	 */

	public static void main(String[] args) {
		System.out.println(solve(5, new int[] { 1, 2, 3, 0, 3 }));
	}

	public static int solve(int A, int[] B) {

		for (int i = 1; i < A; i++)
			B[i] += B[i - 1];

		if (B[A - 1] % 3 != 0)
			return 0;

		int one = B[A - 1] / 3;
		int two = 2 * (B[A - 1] / 3), count = 0;

		for (int i = 0; i < A - 2; i++) {
			if (B[i] == one) {
				for (int j = i + 1; j < A - 1; j++)
					if (B[j] == two)
						count += 1;
			}
		}
		return count;
	}
}

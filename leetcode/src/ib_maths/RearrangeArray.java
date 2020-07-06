package ib_maths;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {

	/*
	 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra
	 * space.
	 * 
	 * Example:
	 * 
	 * Input : [1, 0] Return : [0, 1]
	 * 
	 * 
	 * Lets say N = size of the array. Then, following holds true :
	 * 
	 * 1)All elements in the array are in the range [0, N-1]
	 * 
	 * 2)N * N does not overflow for a signed integer
	 */

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(4, 0, 2, 1, 3));

		arrange(a);

		System.out.println(a);
	}

	/*
	 * Simplest way to solve this problem is to create new array and store the
	 * original array in it.
	 * 
	 * Then we simply update original array by : A[i] = T[T[i]];
	 *
	 * Extra Space Complexity of this approach will be : O(N)
	 */

	/*
	 * For Extra Space Complexity : O(1)
	 * 
	 * We use some mathematics here to achieve O(1) complexity.
	 * 
	 * Big problem in inplace updating of element is OLD VALUE GOT OVERWRITE.
	 * 
	 * We need a way to make every index of array can hold 2 elements old and udated
	 * one.
	 * 
	 * i.e., NEW_VALUE A[i] = OLD_VALUE A[OLD_VALUE of A[i]]
	 * 
	 * Since, it is given that N*N does not overflow, we use following tricks :
	 * 
	 * 1) Increase every Array element A[i] by ( A[A[i]] % n ) * n.
	 * 
	 * 2) Divide every element by n.
	 * 
	 * 
	 * Mathematically :
	 * 
	 * A = old_value + new_index_value * N
	 * 
	 * A % N = old_value
	 * 
	 * A / N = new_index_value
	 */

	public static void arrange(ArrayList<Integer> a) {

		int n = a.size();

		for (int i = 0; i < n; i++) {
			int oldValue = a.get(i);
			int newValue = (a.get(a.get(i)) % n);
			int holder = oldValue + newValue * n;
			a.add(i, holder);
		}

		for (int i = 0; i < n; i++) {
			a.set(i, a.get(i) / n);
		}
	}
}

package ib_arrays;

import java.util.Arrays;

public class WaveArray {

	/*
	 * Wave Array
	 * 
	 * Asked in: Google Adobe Amazon
	 * 
	 * Given an array of integers, sort the array into a wave like array and return
	 * it, In other words, arrange the elements into a sequence such that a1 >= a2
	 * <= a3 >= a4 <= a5.....
	 * 
	 * Example
	 * 
	 * Given [1, 2, 3, 4]
	 * 
	 * One possible answer : [2, 1, 4, 3]
	 * 
	 * Another possible answer : [4, 1, 3, 2]
	 * 
	 * If there are multiple answers possible, return the one thats
	 * lexicographically smallest. So, in example case, you will return [2, 1, 4, 3]
	 */

	public static void main(String[] args) {

		int[] a = wave(new int[] { 1, 2, 3, 4 });

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	private static int[] wave(int[] a) {

		Arrays.sort(a);

		for (int i = 1; i < a.length; i += 2) {
			int temp = a[i];
			a[i] = a[i - 1];
			a[i - 1] = temp;
		}

		return a;
	}

}

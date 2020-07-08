package ib_maths;

import java.util.Arrays;

public class NextSimilarNumber {

	public static void main(String[] args) {

		System.out.println(solve("1152"));
	}

	public static String solve(String A) {

		char[] a = A.toCharArray();
		int size = A.length();
		int i = size - 1;

		while (i > 0) {
			if (a[i - 1] < a[i]) {
				i = i - 1;
				break;
			}
			--i;
		}
		
		if (i == 0) {
			return new String("-1");
		}
		
		int minIdx = i + 1;
		
		for(int j = i + 1 ; j < size ; j++) {
			if(Character.getNumericValue(ch))
		}
		
		

		swap(a, i, minIdx);

		Arrays.sort(a, i + 1, size - 1);

		return new String(a);
	}

	public static void swap(char[] a, int i, int j) {
		char t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}

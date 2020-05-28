package leet_code;

import java.util.Arrays;

public class NextGreaterElementIII {

	public static void main(String[] args) {

		System.out.println(nextGreaterElement(12));
	}

	public static int nextGreaterElement(int n) {

		int digits = countDigits(n);

		int[] a = new int[digits];

		Arrays.sort(a);

		reverseArray(a);

		int t = formDigits(a);

		if (t > n)
			return t;
		else
			return -1;

	}

	public static int formDigits(int[] a) {
		int n = 0;
		for (int i : a) {
			n = n * 10 + i;
		}
		return n;
	}

	public static int countDigits(int n) {
		int c = 0;
		while (n != 0) {
			c++;
			n /= 10;
		}
		return c;
	}

	public static void reverseArray(int[] a) {
		int l = 0;
		int r = a.length - 1;
		while (l < r) {
			int t = a[l];
			a[l] = a[r];
			a[r] = t;
			r--;
			l++;
		}
	}
}

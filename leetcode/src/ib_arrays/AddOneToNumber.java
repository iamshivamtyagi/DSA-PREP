package ib_arrays;

public class AddOneToNumber {

	/*
	 * Add One To Number
	 * 
	 * Asked in: Google Microsoft
	 * 
	 * Given a non-negative number represented as an array of digits,add 1 to the
	 * number ( increment the number represented by the digits ).
	 * 
	 * The digits are stored such that the most significant digit is at the head of
	 * the list.
	 * 
	 * Example:
	 * 
	 * If the array has [1, 2, 3]
	 * 
	 * the returned vector should be [1, 2, 4]
	 * 
	 * as 123 + 1 = 124.
	 * 
	 * NOTE: Certain things are intentionally left unclear in this question which
	 * you should practice asking the interviewer.
	 * 
	 * For example, for this problem, following are some good questions to ask :
	 * 
	 * Q : Can the input have 0’s before the most significant digit. Or in other
	 * words, is 0 1 2 3 a valid input?
	 * 
	 * A : For the purpose of this question, YES
	 * 
	 * Q : Can the output have 0’s before the most significant digit? Or in other
	 * words, is 0 1 2 4 a valid output?
	 * 
	 * A : For the purpose of this question, NO. Even if the input has zeroes before
	 * the most significant digit.
	 */
	public static void main(String[] args) {

		int[] a = plusOne(new int[] { 0, 1, 2, 3, 9 });

		for (int i : a)
			System.out.print(i + " ");

		System.out.println();
	}

	private static int[] plusOne(int[] a) {

		int size = a.length;
		int count = 0;
		boolean isNeg = false;

		if (size >= 1)
			if (a[0] < 0)
				isNeg = true;

		for (int i = 0; i < size; i++) {
			if (a[i] == 0)
				count++;
			else
				break;
		}

		reverseArray(a);

		int j = 0;
		int carry = isNeg ? -1 : 1;

		for (int i = 0; i < size - count; i++) {

			j = a[i] + carry;

			carry = j / 10;

			a[i] = j % 10;
		}

		if (carry != 0) {
			int[] b = new int[size + 1];
			b[0] = carry;

			for (int i = 1; i < b.length; i++) {
				b[i] = a[i - 1];
			}
		}

		reverseArray(a);

		return a;
	}

	private static void reverseArray(int[] a) {
		int i = 0;
		int j = a.length - 1;

		while (i <= j) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			++i;
			--j;
		}
	}

}

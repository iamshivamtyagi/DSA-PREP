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
		int[] a = plusOne(new int[] { 1, 9, 9, 9, 9, 9 });

		for (int i : a)
			System.out.print(i + " ");

	}

	public static int[] plusOne(int[] A) {
		// size of original array
		int size = A.length;

		/*
		 * to store intermediate result
		 *
		 * we store the element of original array from right to left by adding carry in
		 * this array.
		 * 
		 */
		int[] arr = new int[size];

		// carry will be one initially
		int carry = 1;

		/*
		 * Filling the intermediate array :
		 * 
		 * 1) We add the carry to original array's last element & store it in our
		 * intermediate array.
		 * 
		 * 2) We calculate new carry by dividing recently updated element by 10. If
		 * after adding carry number become >= 10 , carry updated to 1 else remain 0.
		 * 
		 * 3) Since, element at an index represent a single digit of number, we modulus
		 * current number by 10.
		 */
		for (int i = size - 1; i >= 0; i--) {
			arr[i] = A[i] + carry;
			carry = arr[i] / 10;
			arr[i] = arr[i] % 10;
		}

		int count = 0;

		/*
		 * if carry is zero, we count leading zeroes in our intermediate array if
		 * present
		 */
		if (carry == 0) {
			for (int i : arr) {
				if (i != 0)
					break;
				++count;
			}
		}
		/*
		 * if carry is 1, then all remaining numbers are definitely 0.
		 *
		 * we simply create a new array with size greater than 1 from intermediate array
		 * & insert 1 at the beginning of it.
		 * 
		 */

		else {
			int[] ans = new int[size + 1];
			ans[0] = 1;
			return ans;
		}

		// if no leading zeroes, then intermediate array is the answer
		if (count == 0) {
			return arr;
		}

		// if count is more than 0, we reduce size by zero coun & fill final array from
		// left to right
		int[] ans = new int[size - count];

		int l = ans.length - 1;
		int r = arr.length - 1;

		while (l >= 0 && r >= count) {
			ans[l] = arr[r];
			--l;
			--r;
		}
		return ans;
	}
}

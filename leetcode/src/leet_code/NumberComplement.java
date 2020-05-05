package leet_code;

public class NumberComplement {

	/*
	 * Problem ID : 476 (Easy)
	 *
	 * Same as Problem ID : 1009 (Complement of Base 10 Integer)
	 * 
	 * Given a positive integer, output its complement number. The complement
	 * strategy is to flip the bits of its binary representation.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: 5 -> Output: 2
	 * 
	 * Explanation: The binary representation of 5 is 101 (no leading zero bits),
	 * and its complement is 010. So you need to output 2.
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: 1 -> Output: 0
	 * 
	 * Explanation: The binary representation of 1 is 1 (no leading zero bits), and
	 * its complement is 0. So you need to output 0.
	 * 
	 * 
	 * Note:
	 * 
	 * The given integer is guaranteed to fit within the range of a 32-bit signed
	 * integer.
	 * 
	 * You could assume no leading zero bit in the integer’s binary representation.
	 * 
	 * This question is the same as 1009:
	 * https://leetcode.com/problems/complement-of-base-10-integer/
	 */

	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}

	public static int findComplement(int num) {

		String s = toBinary(num);

		return toDecimal(s);

	}

	private static String toBinary(int n) {
		String s = "";
		while (n != 0) {
			if (n % 2 == 1)
				s = "0" + s;
			else
				s = "1" + s;
			n = n / 2;
		}

		if (s.equals(""))
			return s + "1";
		else
			return s;
	}

	private static int toDecimal(String n) {
		char[] c = n.toCharArray();
		int i = c.length - 1;
		int pow = 0;
		int num = 0;
		while (i >= 0) {
			num += Character.getNumericValue(c[i]) * (int) Math.pow(2, pow++);
			i--;
		}
		return num;
	}

}

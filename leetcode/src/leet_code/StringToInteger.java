package leet_code;

public class StringToInteger {

	/*
	 * Problem Id : 8 (Medium)
	 * 
	 * Implement atoi which converts a string to an integer.
	 * 
	 * The function first discards as many whitespace characters as necessary until
	 * the first non-whitespace character is found. Then, starting from this
	 * character, takes an optional initial plus or minus sign followed by as many
	 * numerical digits as possible, and interprets them as a numerical value.
	 * 
	 * The string can contain additional characters after those that form the
	 * integral number, which are ignored and have no effect on the behavior of this
	 * function.
	 * 
	 * If the first sequence of non-whitespace characters in str is not a valid
	 * integral number, or if no such sequence exists because either str is empty or
	 * it contains only whitespace characters, no conversion is performed.
	 * 
	 * If no valid conversion could be performed, a zero value is returned.
	 * 
	 * Note:
	 * 
	 * Only the space character ' ' is considered as whitespace character. Assume we
	 * are dealing with an environment which could only store integers within the
	 * 32-bit signed integer range: [−231, 231 − 1]. If the numerical value is out
	 * of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is
	 * returned.
	 * 
	 * 
	 * 
	 * Testcases :
	 * 
	 * "+1" -> 1
	 * 
	 * "+-1" -> 0
	 * 
	 * "   +0 123" -> 0
	 * 
	 * "2147483648" -> 2147483647
	 *
	 * "2147483646" -> 2147483646
	 * 
	 * "-2147483648" -> -2147483648
	 * 
	 * "-2147483647" -> -2147483647
	 * 
	 * "0-1" -> 0
	 * 
	 * "0   123" -> 0
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(myAtoi("1-2"));
	}

	public static int myAtoi(String str) {

		// first remove white spaces from start & end
		str = str.trim();

		// to traverse the string
		int i = 0;
		int sign = 1;
		boolean isSigned = false;
		int size = str.length();
		boolean isNum = false;
		int n = 0;

		while (i < size) {

			/*
			 * Case 1 : Sign Encounter
			 * 
			 * a) If sign encounters, there are two cases :
			 * 
			 * 1) Sign occured before any number & hence it considered.
			 * 
			 * 2) Sign occured between formation of number i.e., 58+7. We return zero.
			 * 
			 */
			if (!isNum && (str.charAt(i) == '-' || str.charAt(i) == '+') && !isSigned) {
				if (str.charAt(i) == '+')
					sign = 1;
				else
					sign = -1;
				isSigned = true;
			}

			/*
			 * Case 2 : Any Space Encounter between number
			 * 
			 * Simply return number formed til now.
			 * 
			 */
			else if (str.charAt(i) == ' ') {
				return n * sign;
			}

			/*
			 * Case 3 : Number range exceeds
			 *
			 */
			else if ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57) {
				int t = Character.getNumericValue(str.charAt(i));

				if (Integer.MIN_VALUE / 10 - 8 > sign * (n + t)) {
					return Integer.MIN_VALUE;
				} else if (Integer.MAX_VALUE / 10 + 7 < sign * (n + t)) {
					return Integer.MAX_VALUE;
				} else {
					n = n * 10 + t;
				}
				isNum = true;
			} else {
				return n * sign;
			}
			++i;
		}

		return n * sign;
	}
}

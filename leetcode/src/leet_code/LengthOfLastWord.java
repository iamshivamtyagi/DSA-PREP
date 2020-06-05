package leet_code;

public class LengthOfLastWord {

	/*
	 * Problem ID : 58 (Easy)
	 * 
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word (last word means the last
	 * appearing word if we loop from left to right) in the string.
	 * 
	 * If the last word does not exist, return 0.
	 * 
	 * Note: A word is defined as a maximal substring consisting of non-space
	 * characters only.
	 * 
	 * Example:
	 * 
	 * Input: "Hello World " ; Output: 5
	 * 
	 * Input: "a " ; Output: 1
	 */

	public static void main(String[] args) {
		String s = " a    b      ";
		System.out.println("My Approach : " + lengthOfLastWord(s));
		System.out.println("Optimal Solution : " + lengthOfLastWordBest(s));
	}

	// My Approach (Accepted)
	public static int lengthOfLastWord(String s) {

		if (s.length() == 0)
			return 0;

		// to iterate the string
		int i = 0;
		// remove the spaces from front & back of the string
		s = s.trim();
		int size = s.length();
		// keep track of size of a word in a string separated by whitespace
		int wordLength = 0;

		while (i < size) {
			// when white space encounter, set word length to zero
			if (s.charAt(i) == ' ') {
				wordLength = 0;
			} else {
				++wordLength;
			}
			i++;
		}

		return wordLength;

	}

	/*
	 * Best Approach
	 *
	 * In this approach, we start counting the letters from right to left instead of
	 * left to right
	 */
	public static int lengthOfLastWordBest(String s) {
		// string empty then return zero
		if (s.length() == 0)
			return 0;

		int size = s.length(); // size of string
		int count = 0; // count length of a word
		int i = size - 1; // to iterate the string from end of string

		/*
		 * here, we traverse the string from end until we find a character other than
		 * whitespace
		 */
		while (s.charAt(i) == ' ' && i > 0) {
			i--;
		}
		/*
		 * now, traverse right to left until we find whitespace or reach starting of the
		 * string
		 */
		for (int j = i; j >= 0 && s.charAt(j) != ' '; j--) {
			++count;
		}
		return count;
	}
}

package leet_code;


class ReverseString {

	/*
	 * Problem ID : 344 (Easy)
	 * 
	 * Write a function that reverses a string. The input string is given as an
	 * array of characters char[].
	 * 
	 * Do not allocate extra space for another array, you must do this by modifying
	 * the input array in-place with O(1) extra memory.
	 * 
	 * You may assume all the characters consist of printable ascii characters.
	 * 
	 * 
	 * Input: ["h","e","l","l","o"] -> Output: ["o","l","l","e","h"]
	 * 
	 * Input: ["H","a","n","n","a","h"] -> Output: ["h","a","n","n","a","H"]
	 * 
	 */

	public static void main(String[] args) {
		char[] a = new char[] { 'a', 'b', 'c', 'd', 'e' };
		reverseString(a);

		display(a);

	}

	private static void display(char[] a) {
		for (char i : a) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

	public static void reverseString(char[] s) {
		int l = 0;
		int r = s.length - 1;
		// two pointer approach, swaping left character from it's mirror right element
		while (l < r) {
			char c = s[l];
			s[l] = s[r];
			s[r] = c;
			++l;
			--r;
		}
	}
}

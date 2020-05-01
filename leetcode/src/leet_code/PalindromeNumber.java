package leet_code;

public class PalindromeNumber {

	/*
	 * Problem Id : 9 (Easy)
	 * 
	 * Determine whether an integer is a palindrome. An integer is a palindrome when
	 * it reads the same backward as forward.
	 * 
	 * Input: 121 -> Output: true
	 * 
	 * Input: -121 -> Output: false
	 * 
	 * Explanation: From left to right, it reads -121. From right to left, it
	 * becomes 121-. Therefore it is not a palindrome.
	 * 
	 * Input: 10 -> Output: false
	 * 
	 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
	 */

	public static void main(String[] args) {
		System.out.println(isPalindrome(70));
	}

	public static boolean isPalindrome(int x) {
		int n = x, rem = 0, rev = 0;
		// if given number is negative return false (can't be Palindrome)
		if (x < 0) {
			return false;
		}
		// if single digit number, then it is palindrome
		if (x < 10) {
			return true;
		}
		// calculating reverse of the number
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		// if reverse is equal to original number return true else false
		if (rev == x)
			return true;
		else
			return false;
	}
}
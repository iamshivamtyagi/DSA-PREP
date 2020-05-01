package main_package;

public class PalindromeNumber {

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
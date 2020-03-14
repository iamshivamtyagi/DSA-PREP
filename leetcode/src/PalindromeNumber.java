
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		int n = x, rem = 0, rev = 0;
		if (x < 0) {
			return false;
		}
		if (x < 10) {
			return true;
		}
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		if (rev == x)
			return true;
		else
			return false;
	}
}
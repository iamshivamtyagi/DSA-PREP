import java.util.ArrayList;

public class HappyNumber {

	public static boolean isHappy(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		while (true) {
			if (n == 1) {
				return true;
			}
			n = getDigitSum(n);

			if (a.contains(n))
				return false;

			a.add(n);
		}

	}

	public static int getDigitSum(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum += rem * rem;
			n = n / 10;
		}
		return sum;
	}
}

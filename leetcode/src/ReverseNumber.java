class ReverseNumber {
	public int reverse(int x) {
		int t = x;
		if (x < 0) {
			t = t * -1;
		}
		int n = 0;
		while (t != 0) {
			int rem = t % 10;
			// checking, is number exceeding it's max range or not
			if (n > Integer.MAX_VALUE / 10 || (n >= Integer.MAX_VALUE / 10 + rem && rem > 7)) {
				return 0;
				// checking, is number exceeding it's min range or not
			} else if (n < Integer.MIN_VALUE / 10 || (n <= Integer.MIN_VALUE / 10 + rem && rem < -8)) {
				return 0;
			} else {
				n = n * 10 + rem;
				t = t / 10;
			}
		}
		// if number is negative, multiply resultant by -1;
		if (x < 0) {
			n = n * -1;
		}
		return n;
	}
}

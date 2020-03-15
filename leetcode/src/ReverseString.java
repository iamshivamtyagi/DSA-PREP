class ReverseString {
	public void reverseString(char[] s) {
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

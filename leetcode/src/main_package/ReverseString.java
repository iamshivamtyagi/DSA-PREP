package main_package;
class ReverseString {

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

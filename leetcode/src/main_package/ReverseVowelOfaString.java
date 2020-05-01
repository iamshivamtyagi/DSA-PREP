package main_package;

public class ReverseVowelOfaString {

	public static void main(String[] args) {
		System.out.println(reverseVowels("Hello"));

	}

	public static String reverseVowels(String s) {
		int size = s.length();
		int i = size - 1;
		char[] c = new char[size]; // character array to store vowels of a string

		int count = 0; // to keep track of vowel array size & index of next element to be inserted

		// loop from right to left & scanning each character
		while (i >= 0) {
			// if char is vowel store it in char array
			if (isVowel(s.charAt(i))) {
				c[count++] = s.charAt(i);
			}
			i--;
		}
		i = 0;
		count = 0;
		String ans = "";

		// traverse string left to right
		while (i < size) {
			// if vowel encountered insert char array in it otherwise original string char
			if (isVowel(s.charAt(i))) {
				ans = ans + c[count];
				++count;
			} else {
				ans = ans + s.charAt(i);
			}
			i++;
		}
		return ans;
	}

	private static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		} else {
			return false;
		}

	}
}

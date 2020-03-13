
public class ReverseVowelOfaString {
	public String reverseVowels(String s) {
		int size = s.length();
		int i = size - 1;
		char[] c = new char[size];
		int count = 0;
		while (i >= 0) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				c[count++] = s.charAt(i);
			}
			i--;
		}
		i = 0;
		count = 0;
		String ans = "";
		while (i < size) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				ans = ans + c[count];
				++count;
			} else {
				ans = ans + s.charAt(i);
			}
			i++;
		}
		return ans;
	}
}

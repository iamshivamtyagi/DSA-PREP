
public class ReverseVowelOfaString {
	public String reverseVowels(String s) {
		int size = s.length();
		int i = size - 1;
		char[] c = new char[size];
		int count = 0;
		while (i >= 0) {
			if (isVowel(s.charAt(i))) {
				c[count++] = s.charAt(i);
			}
			i--;
		}
		i = 0;
		count = 0;
		String ans = "";
		while (i < size) {
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
	private boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c=='u'){
			return true;
		}else if (c == 'A' || c == 'E' || c == 'I' || c == 'O'|| c=='U') {
			return true;
		}else {
			return false;
		}
		
	}
}

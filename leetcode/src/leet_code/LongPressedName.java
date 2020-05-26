package leet_code;

public class LongPressedName {

	public static void main(String[] args) {

		System.out.println(longPressedName("lele", "llleeele"));
	}

	// Two Pointer Approach : O(n + k) & O(1)
	public static boolean longPressedName(String name, String typed) {
		if (name.length() > typed.length())
			return false;

		int i = 0;
		int j = 0;

		// iterate over character of String 'typed'
		while (j < typed.length()) {

			/*
			 * first we check if the character at index i & j of String name & typed are
			 * equal or not
			 * 
			 * if characters are equal we simply increment the index of String name by 1
			 */
			if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
				++i;
			}
			/*
			 * if character of current index of name & typed String are not equal, then we
			 * check following two conditions :
			 * 
			 * (a) Is current index of typed String is the first ?
			 * 
			 * (b) If (a) is not true, then we check character at current & previous index
			 * are not same.
			 * 
			 * If any of these condition become true, we return false
			 */
			else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
				return false;
			}
			++j;
		}
		// return true only if name String is iterated to its end
		return i == name.length();
	}

}

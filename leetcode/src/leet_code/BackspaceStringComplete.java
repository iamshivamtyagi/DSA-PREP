package leet_code;

import java.util.Stack;

public class BackspaceStringComplete {

	/*
	 * Problem Id : 844 (Easy)
	 * 
	 * Given two strings S and T, return if they are equal when both are typed into
	 * empty text editors. # means a backspace character.
	 * 
	 * Note that after backspacing an empty text, the text will continue empty.
	 * 
	 * Example 1:
	 * 
	 * Input: S = "ab#c", T = "ad#c"
	 * 
	 * Output: true -> Explanation: Both S and T become "ac".
	 * 
	 * Example 2:
	 * 
	 * Input: S = "ab##", T = "c#d#"
	 * 
	 * Output: true -> Explanation: Both S and T become "".
	 * 
	 * Example 3:
	 * 
	 * Input: S = "a##c", T = "#a#c"
	 * 
	 * Output: true -> Explanation: Both S and T become "c".
	 * 
	 * Example 4:
	 * 
	 * Input: S = "a#c", T = "b"
	 * 
	 * Output: false -> Explanation: S becomes "c" while T becomes "b".
	 * 
	 * Note:
	 * 
	 * 1 <= S.length <= 200
	 * 
	 * 1 <= T.length <= 200
	 * 
	 * S and T only contain lowercase letters and '#' characters.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean backspaceCompare(String s, String t) {

		// stack to store the characters of the given string
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();

		// loop to traverse the String 's'
		for (int i = 0; i < s.length(); ++i) {

			// when character at index 'i' is '#', we remove recently inserted character
			if (getChar(s, i) == '#' && !stack1.empty()) {
				stack1.pop();
			}
			// when char at index 'i' is '#' but stack empty we do nothing
			else if (getChar(s, i) == '#' && stack1.empty()) {

			}
			// when character is different from '#', we insert it in stack
			else {
				stack1.push(getChar(s, i));
			}
		}

		// Same for String 't'
		for (int i = 0; i < t.length(); ++i) {
			if (getChar(t, i) == '#' && !stack2.empty()) {
				stack2.pop();
			} else if (getChar(t, i) == '#' && stack2.empty()) {

			} else {
				stack2.push(getChar(t, i));
			}
		}

		// two string to store new string after performing backspace operation
		String s1, t1;
		s1 = "";
		t1 = "";

		// remove stack data and insert it in s1
		while (!stack1.empty()) {
			s1 += stack1.pop();
		}
		// remove stack data and insert it in t1
		while (!stack2.empty()) {
			t1 += stack2.pop();
		}

		// compare string and return binary conclusion accordingly
		if (s1.equals(t1)) {
			return true;
		} else {
			return false;
		}
	}

	public char getChar(String s, int i) {
		return s.charAt(i);
	}
}

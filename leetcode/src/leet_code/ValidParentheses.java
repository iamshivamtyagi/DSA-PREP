package leet_code;

import java.util.Stack;

public class ValidParentheses {

	/*
	 * Problem ID : 20 (Easy)
	 * 
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets.
	 * 
	 * Open brackets must be closed in the correct order.
	 * 
	 * Note that an empty string is also considered valid.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: "()" Output: true
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: "()[]{}" Output: true
	 * 
	 * 
	 * Example 3:
	 * 
	 * Input: "(]" Output: false
	 * 
	 * 
	 * Example 4:
	 * 
	 * Input: "([)]" Output: false
	 * 
	 * 
	 * Example 5:
	 * 
	 * Input: "{[]}" Output: true
	 */

	public static void main(String[] args) {

		System.out.println(isValidParentheses("()"));
	}

	public static boolean isValidParentheses(String s) {
		// if there is only one parentheses, return false
		if (s.length() == 1)
			return false;

		Stack<Character> stack = new Stack<Character>();
		int i = 0;

		// extracting character of given string one by one
		while (i != s.length()) {
			// current index parentheses
			char currentParentheses = s.charAt(i);

			// push current parentheses in stack if it is opening parentheses
			if (isOpeningParentheses(currentParentheses)) {
				stack.push(currentParentheses);
				++i;
			}

			/*
			 * if current parentheses is not opening parenthesis, then we check for current
			 * closing parentheses's opening parenthesis in the stack
			 * 
			 * if stack poped parentheses is equal to current Closing Parentheses's opening
			 * parentheses, we continue the extracting of character from the string
			 * 
			 * if not equal return false
			 */
			else {
				char currentParenthesesOpening = getOpeningParentheses(currentParentheses);
				char previousParentheses = stack.pop();
				if (previousParentheses == currentParenthesesOpening) {
					++i;
					continue;
				} else {
					return false;
				}
			}
		}
		/*
		 * return true only when stack is empty at the end of the loop
		 */
		return stack.isEmpty() ? true : false;
	}

	// this fxn checks that passed parenthese is opening or not

	public static boolean isOpeningParentheses(char c) {
		switch (c) {
		case '[':
			return true;
		case '(':
			return true;
		case '{':
			return true;
		default:
			return false;
		}
	}

	// this fxn returns the opening parentheses for a given closing parentheses

	public static char getOpeningParentheses(char c) {
		switch (c) {
		case ']':
			return '[';
		case '}':
			return '{';
		case ')':
			return '(';
		default:
			return ' ';
		}
	}

}

package leet_code;

import java.util.HashSet;

public class JewelsAndStones {

	/*
	 * Problem ID : 771 (Easy)
	 * 
	 * You're given strings J representing the types of stones that are jewels, and
	 * S representing the stones you have. Each character in S is a type of stone
	 * you have. You want to know how many of the stones you have are also jewels.
	 * 
	 * The letters in J are guaranteed distinct, and all characters in J and S are
	 * letters. Letters are case sensitive, so "a" is considered a different type of
	 * stone from "A".
	 * 
	 * Example 1:
	 * 
	 * Input: J = "aA", S = "aAAbbbb" -> Output: 3
	 * 
	 * Example 2:
	 * 
	 * Input: J = "z", S = "ZZ" -> Output: 0
	 * 
	 * Note:
	 * 
	 * S and J will consist of letters and have length at most 50. The characters in
	 * J are distinct.
	 */

	public static void main(String[] args) {
		System.out.println(numJewelsInStones("z", "ZZ"));
	}

	public static int numJewelsInStones(String J, String S) {

		// HashSet to store unique stones that are jewels 'J'
		HashSet<Character> m = new HashSet<Character>();

		// temporary string of J
		String temp = new String(J);

		// size of the temp string
		int size = temp.length();

		// counter for unique stones
		int count = 0;

		// loop until temp is null or string length is zero
		while ((temp != null) && (temp.length() > 0)) {

			// add unique stones of jewel in hashset
			m.add(temp.charAt(size - 1));

			// reducing size of the temp string
			temp = temp.substring(0, temp.length() - 1);
			size--;
		}

		// Alternate Easy Way

		// for(char i : J.toCharArray()){
		// m.add(i);
		// }

		// now temp copy of String S
		temp = new String(S);

		size = temp.length();

		// similarly extracting each character from String of 'S'
		while ((temp != null) && (temp.length() > 0)) {

			// if hashset contains the character of S increment the counter
			if (m.contains(temp.charAt(size - 1))) {
				++count;
			}

			// reduce temp string size
			temp = temp.substring(0, temp.length() - 1);
			size--;
		}

		// Alternate Easier Way

		// for(int i : S.toCharArray()){
		// if(m.contains(i)){
		// ++count;
		// }
		// }

		return count;
	}

}

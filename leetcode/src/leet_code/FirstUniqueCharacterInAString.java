package leet_code;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

	/*
	 * Problem ID : 387 (Easy)
	 * 
	 * Given a string, find the first non-repeating character in it and return it's
	 * index. If it doesn't exist, return -1.
	 * 
	 * Examples:
	 * 
	 * s = "leetcode" -> return 0.
	 * 
	 * s = "loveleetcode" -> return 2.
	 * 
	 * Note: You may assume the string contain only lowercase letters.
	 */

	public static void main(String[] args) {
		System.out.println(firstUniqueCharacterInAString("loveleetcode"));
	}

	private static int firstUniqueCharacterInAString(String s) {

		/*
		 * HashMap to store the characters of the strings with their frequency of
		 * occurence
		 */
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// size of the string
		int n = s.length();

		// iterete the index to extract characters from the string 1 by 1
		for (int i = 0; i < n; ++i) {

			// character at index i
			char c = s.charAt(i);

			/*
			 * put key 'c' in the HashMap with value '0' if key doesnt existed inside the
			 * HashMap
			 * 
			 * if key 'c' existed inside the HashMap, update its previous value by 1
			 */
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// again iterate through the string and extract characters one by one
		for (int i = 0; i < n; ++i) {

			char c = s.charAt(i);

			// if key 'c' existed inside the map with value 1 return current index 'i'
			if (map.get(c) == 1) {
				return i;
			}
		}

		return -1;
	}

}

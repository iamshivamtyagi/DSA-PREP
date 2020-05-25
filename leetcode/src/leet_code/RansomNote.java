package leet_code;

import java.util.HashMap;

public class RansomNote {

	/*
	 * Problem ID : 383 (Easy)
	 * 
	 * Given an arbitrary ransom note string and another string containing letters
	 * from all the magazines, write a function that will return true if the ransom
	 * note can be constructed from the magazines ; otherwise, it will return false.
	 * 
	 * Each letter in the magazine string can only be used once in your ransom note.
	 *
	 * Example 1:
	 * 
	 * Input: ransomNote = "a", magazine = "b"
	 * 
	 * Output: false
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: ransomNote = "aa", magazine = "ab"
	 * 
	 * Output: false
	 * 
	 * 
	 * Example 3:
	 * 
	 * Input: ransomNote = "aa", magazine = "aab"
	 * 
	 * Output: true
	 * 
	 * 
	 * Constraints:
	 * 
	 * You may assume that both strings contain only lowercase letters.
	 *
	 */

	public static void main(String[] args) {

		System.out.println(canConstruct("aa", "aab"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		// to store magazine letters with their number of occurance
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// put magazine letters in the hashmap
		for (char c : magazine.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		/*
		 * to check the ransome Note can be construct from Magazine
		 * 
		 * we check each letter of the ransomNote with the HashMap key
		 * 
		 * if key has value more than zero then we decrement its corresponding value by
		 * 1
		 * 
		 * if key doesnt contain in the HashMap or its correnponding value is 0 we
		 * return false
		 */
		for (char c : ransomNote.toCharArray()) {
			if (hm.containsKey(c) && hm.get(c) > 0) {
				hm.put(c, hm.get(c) - 1);
			} else {
				return false;
			}
		}
		return true;
	}

}

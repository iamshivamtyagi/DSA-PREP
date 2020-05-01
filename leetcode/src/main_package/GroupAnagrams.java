package main_package;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	/*
	 * Given an array of strings, group anagrams together.
	 * 
	 * Example:
	 * 
	 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
	 * 
	 * Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
	 */

	public static void main(String[] args) {

		System.out.println(groupAnagrams(new String[] { "are", "bat", "ear", "code", "tab", "era" }));

	}

	private static List<List<String>> groupAnagrams(String[] a) {

		// HashMap to store unique string values
		HashMap<String, List<String>> m = new HashMap<String, List<String>>();

		// Traverse the given String array
		for (int i = 0; i < a.length; ++i) {

			String s1 = a[i];

			// converting current string into the charArray
			char[] temp = s1.toCharArray();

			// sort the charArray
			Arrays.sort(temp);

			// convert the sorted charArray back to the String
			s1 = new String(temp);

			// now check if the hashmap contains unique key s1 i.e., sorted string
			if (!m.containsKey(s1)) {
				/*
				 * add unique sorted string as key & allocate the memory to its corresponding
				 * value arraylist
				 */
				m.put(s1, new ArrayList<String>());
			}
			// add the original string to its correnponding key
			m.get(s1).add(a[i]);
		}

		// return the arraylist of the values
		return new ArrayList<List<String>>(m.values());
	}

}

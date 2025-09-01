package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import LinkedList.Node;

/*
 * Input: s = "abcabcbb"
Output: 3
Explanation: The longest substring without repeating characters is "abc", which has a length of 3.

 */

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "abcabcbb";
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (char ch : set) {
			System.err.print(ch);
		}
		
	}
}

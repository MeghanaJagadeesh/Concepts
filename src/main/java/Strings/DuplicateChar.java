package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * Input:  "programming"
Output: { 'r': 2, 'g': 2, 'm': 2 }
TC=>O(n)
SC=> O(n)
 */
public class DuplicateChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		findDuplicate(s);
		scanner.close();
	}

	private static void findDuplicate(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 2)
				System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
}

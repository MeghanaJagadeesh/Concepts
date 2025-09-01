package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		frequency(s);
	}

	private static void frequency(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : s.toCharArray()) {
			if (ch != ' ')
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			/*
			 * The getOrDefault() method in Java is used to retrieve the value associated
			 * with a given key in a HashMap. If the key is not present, it returns a
			 * specified default value instead of null. getOrDefault(Object key, V
			 * defaultValue) key → The key whose value is to be retrieved. defaultValue →
			 * The value to return if the key is not found in the map.
			 */
//			System.out.println(ch + " " + map.getOrDefault(ch, 0));
		}
		System.out.println(map);
		
	}
}

package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ReplaceAllOccuranceChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();

		System.out.println("Replace with : ");
		String replace = scanner.nextLine();
		System.out.println("character to be replaced: ");
		String occurance = scanner.nextLine();
		System.out.println("Method 1 : " + replaceAllOccuranceChar(s, replace));
		System.out.println("Method 2 : " + s.replaceAll(occurance, replace));
	}

	private static String replaceAllOccuranceChar(String s, String replace) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
		}
		for (Entry<Character, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() >= 2)
				s = s.replaceAll(entry.getKey().toString(), replace);
		}
		return s;

	}
}

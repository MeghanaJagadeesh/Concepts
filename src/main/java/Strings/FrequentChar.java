package Strings;
/*
 * Input: "success" → Output: 's' (appears 3 times)
 */
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequentChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		System.out.println(frequentChar(s));
		;
		scanner.close();
	}

	private static char frequentChar(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		char ch = '\0';
		int maxCount = 0;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				ch = entry.getKey();
			}
		}
		return ch;
	}
}

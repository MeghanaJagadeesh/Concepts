package Strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 Input: "listen", "silent" → Output: true
 
"angel" = "glean"
"dormitory" = "dirty room"

"William Shakespeare" = "I am a weakish speller"
"The Morse code" = "Here come dots"

 */
public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string1 : ");
		String s1 = scanner.nextLine();
		System.out.println("Enter the string2 : ");
		String s2 = scanner.nextLine();
		System.out.println(isAnagram(s1, s2));
	}
	//method 2
	public static boolean checkAnagram(String s1, String s2) {
		char[] ch1=s1.replace("\\s+", "").toLowerCase().toCharArray();
		char[] ch2=s2.replace("\\s+", "").toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}
//method 1
	private static boolean isAnagram(String s1, String s2) {
		s1 = s1.toLowerCase().replaceAll("\\s", "");
		s2 = s2.toLowerCase().replaceAll("\\s", "");
		if (s1.length() != s2.length())
			return false;

		for (String ch : s1.split("")) {
			if (!s2.contains(ch))
				return false;
		}
		for (String ch : s2.split("")) {
			if (!s1.contains(ch))
				return false;
		}
		return true;
	}
}

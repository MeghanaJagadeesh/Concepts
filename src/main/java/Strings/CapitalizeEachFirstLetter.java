package Strings;

import java.util.Scanner;

/*
 * Capitalize the First Letter of Each Word in a Sentence
	Example: Input: "hello world" → Output: "Hello World"
 */
public class CapitalizeEachFirstLetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		System.out.println(capital(s));
		scanner.close();
	}

	private static String capital(String s) {
		StringBuilder result = new StringBuilder();
		String[] arr = s.split(" ");
		for (String str : arr) {
			result.append(Character.toUpperCase(str.charAt(0))).append(str.substring(1)).append(" ");
		}
		return result.toString();
	}

}

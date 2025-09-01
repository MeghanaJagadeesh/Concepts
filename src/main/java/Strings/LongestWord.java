package Strings;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		System.out.println(longestWord(s));
	}

	private static String longestWord(String s) {
		String[] arr = s.split(" ");
		String largeString = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > largeString.length()) {
				largeString = arr[i];
			}
		}
		return largeString;
	}
}

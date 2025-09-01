package Strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scanner.nextLine();
		reverseString(s);
	}

	private static void reverseString(String s) {
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}

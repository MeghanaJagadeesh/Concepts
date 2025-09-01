package Strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		palindrome(s);
	}

	private static void palindrome(String s) {
		char[] ch = s.toCharArray();
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += ch[i];
		}
		if (rev.equals(s)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}

package Strings;

import java.util.Scanner;

public class NonRepeatChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		System.out.println("first non repeating char : " + firstnonRepeatChar(s));
		System.out.println("non repeating chars are : " + nonRepeatChar(s));
	}

	private static char firstnonRepeatChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return s.charAt(i);
			}
		}
		return ' ';
	}

//TC O(n)  SC=O(1)
	private static String nonRepeatChar(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				result = result + s.charAt(i) + " ";
			}
		}
		return result;
	}
}

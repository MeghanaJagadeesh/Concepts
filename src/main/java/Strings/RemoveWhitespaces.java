package Strings;

import java.util.Scanner;

public class RemoveWhitespaces {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		removeWhiteSpace(s);
	}

	private static void removeWhiteSpace(String s) {
		System.out.println(s.replaceAll("\\s", ""));

	}
}

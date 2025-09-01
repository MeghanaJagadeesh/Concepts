package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		System.out.println(sortString(s));
	}

	// TC= O(n log n) SC= O(n)
	private static char[] sortString(String s) {
		char[] arr = s.toCharArray(); // O(n) O(n)
		Arrays.sort(arr); // O(n log n) O(1)
		return arr; // O(1) O(1)
	}
}

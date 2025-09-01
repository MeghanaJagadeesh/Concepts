package Strings;

import java.util.Scanner;

/*
 * Find the Smallest and Largest Palindromic Substring
Example: Input: "banana" → Smallest: "ana", Largest: "anana"
 */
public class PalindromicSubstring {
	static String smallest;
	static String largest = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = scanner.nextLine();
		smallest = s; // Initialize `smallest` to the full string
		palindromicSubstring(s);
//		checkPalindrome(s);
		scanner.close();
	}

	// method 2
	public static boolean isPalindrome(String s) {
		String[] arr = s.split("");
		String rev = "";
		for (int i = arr.length-1; i >= 0; i--) {
			rev = rev + arr[i];
		}
		if (rev.equals(s))
			return true;
		else
			return false;
	}

	private static void checkPalindrome(String s) {
		String smallest = null;
		String largest = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <=s.length() ; j++) {
				String substring = s.substring(i, j);
				if (isPalindrome(substring)) {
					if (smallest == null || smallest.length() < substring.length())
						smallest = substring;
					if (largest.length() < substring.length())
						largest = substring;
				}
			}
		}
		System.out.println("Method 2 -> Smallest: " + smallest + "\nLargest: " + largest);
	}

	// Method 1
	private static void palindromicSubstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			findPalindrome(s, i, i); // Odd length palindromes
			System.out.println("**");
			findPalindrome(s, i, i + 1); // Even length palindromes
			System.out.println("###");
		}
		System.out.println("Method 1 -> Smallest: " + smallest + "\nLargest: " + largest);
	}

	public static void findPalindrome(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			
			String palindrome = s.substring(left, right + 1);
			System.out.println(palindrome+" "+left+" "+right);
			if (palindrome.length() > largest.length()) {
				largest = palindrome;
			}
			if (palindrome.length() >= 2) {
				if (smallest == null || palindrome.length() < smallest.length()) {
					smallest = palindrome;
				}
			}
			left--;
			right++;
		}
	}
}

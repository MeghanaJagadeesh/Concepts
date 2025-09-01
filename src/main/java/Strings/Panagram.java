package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// input : Abcdefghijklmnopqrstuvwxyz - true
// The quick brown fox jumps over the lazy dog - true
//tc - O(n)  SC- O(n)
public class Panagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		System.out.println(panagram(s));
	}

	private static boolean panagram(String s) {
		s = s.toLowerCase().replaceAll("\\s", "");
		Set<Character> set = new HashSet<Character>();
		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				set.add(ch);
			}
		}
		System.out.println(set);
		if (set.size() == 26)
			return true;
		else
			return false;

	}
}

package Strings;

/*
 * Reverse the Words in a Sentence
Example: Input: "Java is fun" → Output: "fun is Java"
 */
import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		reverseWord(s);
	}

	private static void reverseWord(String s) {
		String[] arr = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}

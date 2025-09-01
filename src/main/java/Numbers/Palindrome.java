package Numbers;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		System.out.println(palindrome(num));
	}

	private static boolean palindrome(int num) {
		int copy = num;
		int result = 0;
		while (num != 0) {
			result =result*10+num%10;
			num = num / 10;
		}
		System.out.println(result);
		if (copy == result)
			return true;
		else
			return false;
	}
}

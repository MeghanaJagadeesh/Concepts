package Numbers;

import java.util.Scanner;

//perfect number =6=>1+2+3=6
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the last range : ");
		int num = scanner.nextInt();
		System.out.println(perfectNum(num));
	}

	private static boolean perfectNum(int num) {
		int result = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				result = result + i;
			}
		}
		if (result == num)
			return true;
		else
			return false;
	}
}

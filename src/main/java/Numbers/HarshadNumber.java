package Numbers;

import java.util.Scanner;

//18 → 1+8=9, 18 is divisible by 9 → Harshad number
public class HarshadNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		System.out.println(harshad(num));
	}

	private static boolean harshad(int num) {
		int sum = 0;
		int copy = num;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		if (copy % sum == 0)
			return true;
		else
			return false;
	}
}

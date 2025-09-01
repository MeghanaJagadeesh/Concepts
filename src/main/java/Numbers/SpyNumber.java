package Numbers;

import java.util.Scanner;

//123 → (1+2+3) = (1*2*3) → Spy Number
public class SpyNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		System.out.println(spyNumber(num));
	}

	private static boolean spyNumber(int num) {
		int sum = 0;
		int product = 1;
		while (num != 0) {
			int rem = num % 10;
			sum += rem;
			product *= rem;
			num /= 10;
		}
		if (sum == product)
			return true;
		else
			return false;
	}
}

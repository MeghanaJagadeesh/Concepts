package Numbers;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scanner.nextInt();
		System.out.println("normal approach : " + prime(num));
		System.out.println("optimized Approach : " + optimizedApproach(num));

//		System.out.println("Enter the range : ");
//		int num1=scanner.nextInt();
//		int num2=scanner.nextInt();
//		primeInRange(num1, num2);
	}

	private static boolean optimizedApproach(int num) {
		if (num == 1)
			return false;
		if (num == 2 || num == 3)
			return false;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (int i = 5; i * i < num; i = i + 6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;
		}
		return true;

	}

	// TC = O(n^2) SC=O(1)
	private static void primeInRange(int num1, int num2) {
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		for (int i = min; i <= max; i++) {
			boolean prime = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

	// TC= O(n) SC=O(1)
	private static boolean prime(int num) {
		boolean prime = true;
		// for (int i = 2; i < num/2; i++) {
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

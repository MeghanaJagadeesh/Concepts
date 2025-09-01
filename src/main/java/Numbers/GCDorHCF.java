package Numbers;

import java.util.Scanner;

public class GCDorHCF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two valuses : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Normal Approach : " + GCDNormalApproach(a, b));
		System.out.println("Euclid Approach : " + EuclidApproach(a, b));
		System.out.println("Optimised Euclid Approach : " + OptimisedEuclidApproach(a, b));
	}

	private static int OptimisedEuclidApproach(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}
		if (a == 0)
			return b;
		else
			return a;
	}

	private static int EuclidApproach(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	public static int GCDNormalApproach(int a, int b) {
		int min = 0;
		if (a > b)
			min = a;
		else
			min = b;
		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;

	}
}

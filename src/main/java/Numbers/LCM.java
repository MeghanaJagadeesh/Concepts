package Numbers;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two valuses : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Normal Approach : " + LCMNormalApproach(a, b));
		System.out.println("Optimised Approach : " + LCMOptimisedApproach(a, b));
	}

	private static int LCMOptimisedApproach(int a, int b) {
		return a * b / GCD(a, b);
	}

	private static int GCD(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}
		if (a != 0)
			return a;
		else
			return b;
	}

	private static int LCMNormalApproach(int a, int b) {
		int res = Math.max(a, b);
		while (true) {
			if (res % a == 0 && res % b == 0)
				break;
			res++;
		}
		return res;
	}
}

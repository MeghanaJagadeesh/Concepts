package Numbers;

import java.util.Scanner;

/*
 * Input  : N = 76 
Output : Automorphic
Explanation: As 76*76 = 5776

Input  : N = 25
Output : Automorphic
As 25*25 = 625


Input : N = 7
Output : Not Automorphic
As 7*7 = 49
 */
public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = scanner.nextInt();
		System.out.println(automorphic(num1));
	}

	private static boolean automorphic(int num1) {
		int sqr = num1 * num1;
		if (num1 <= 0)
			return false;

		while (num1 != 0) {
			if (num1 % 10 != sqr % 10)
				return false;
			num1 /= 10;
			sqr /= 10;
		}
		return true;
	}
}

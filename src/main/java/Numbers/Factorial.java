package Numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();
		System.out.println("Iterative method : " + factorial(n));
		System.out.println("Recurcive method : "+fact(n));
	}

	private static int fact(int n) {
		if(n==1)
			return n;
		
		return n*fact(n-1);
	}

	private static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact*i;
		}
		return fact;
	}
}

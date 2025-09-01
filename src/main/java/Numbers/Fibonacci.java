package Numbers;

import java.util.Scanner;

// first n th Fibonacci Series
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the last range : ");
		int num = scanner.nextInt();
		fibonacci(num);
	}

	private static void fibonacci(int num) {
		int fib1 = 0;
		int fib2 = 1;
		System.out.print(fib1 + " " + fib2 + " ");
		for (int i = 1; i <= num; i++) {
			int fib3 = fib1 + fib2;
			System.out.print(fib3 + " ");
			fib1 = fib2;
			fib2 = fib3;
		}
	}
}

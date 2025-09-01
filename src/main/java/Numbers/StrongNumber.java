package Numbers;

import java.util.Scanner;

// 145 → 1! + 4! + 5! = 145 (Strong Number)
public class StrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		System.out.println(strongNum(num));
	}

	private static boolean strongNum(int num) {
		int sum = 0;
		int fact = 1;
		int copy = num;
		while (num != 0) {
			int rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			fact=1;
			num /= 10;
		}
		System.out.println(sum);
		if (copy == sum)
			return true;
		else
			return false;
	}
}

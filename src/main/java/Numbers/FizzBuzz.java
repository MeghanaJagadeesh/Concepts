package Numbers;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String arg[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr number: ");
		int number=scanner.nextInt();
		if(number%3==0&&number%7==0) {
			System.out.println("fizz buzz");
		}else if(number%3==0) {
			System.out.println("fizz fizz");
		}
		else if(number%7==0) {
			System.out.println("buzz buzz");
		}else {
			System.out.println("invalid number");
		}
	}
}

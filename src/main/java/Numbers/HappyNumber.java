package Numbers;

import java.util.Scanner;

//happy number : sum of square of each number until we get single digit anf that should be equal to 1 or 7
//ex : 19, 68
public class HappyNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int number=scanner.nextInt();
		int copy=number;
		while(number>9) {
			number=happyNumber(number);
		}
		if(number==1||number==7) {
			System.out.println(copy+" is a happy number");
		}else {
			System.out.println(copy+" is not a happy number");
		}
	}

	private static int happyNumber(int number) {
		int sum=0;
		while(number!=0) {
			int rem=number%10;
			sum=sum+(rem*rem);
			number=number/10;
		}
		return sum;
	}
}

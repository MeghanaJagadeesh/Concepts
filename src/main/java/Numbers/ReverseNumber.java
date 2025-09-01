package Numbers;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int copy=number;
		int rev=0;
		while(number!=0) {
			int rem=number%10;
			rev=(rev*10)+rem;
			number=number/10;
		}
		System.out.println(rev);
		anotherway(copy);
	}
	
	public static void anotherway(int number) {
		String num=number+"";
		char[] arr = num.toCharArray();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}

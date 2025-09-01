package Numbers;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter begining and ending number");
		int a=scanner.nextInt(), b=scanner.nextInt();
		System.out.print("Even numbers : ");
		int count=0;
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println("count : "+count);
	}
}

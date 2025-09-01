package Numbers;

//sum and square of each number until u get single digit
import java.util.Scanner;

public class SumAndSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		int copy=number;
		while(number>9) {
			number=happyNum(number);
		}
		System.out.println(number);
	}
	public static int happyNum(int number) {
		int sum=0;
		while(number!=0) {
			int rem=number%10;
			sum+=(rem*rem);
			number=number/10;
		}
//		System.out.println(sum);
		return sum;
	}
}

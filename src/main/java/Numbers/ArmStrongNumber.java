package Numbers;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scanner.nextInt();
		System.out.println(armStrongNumber(num));
	}

	private static boolean armStrongNumber(int num) {
		int copy=num;
		int result=0;
		while (num!=0) {
			result+=Math.pow(num%10, 3);
			num=num/10;
		}
		if(result==copy) {
			return true;
		}else {
			return false;
		}
		
	}
}

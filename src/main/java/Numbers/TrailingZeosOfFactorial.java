package Numbers;

import java.util.Scanner;

/*	Here the number of 5 is directly reflecting on number of zeros
 * 	5!= 1*2*3*4*5 = 120=>1
 * 	8! = 1*2*..*5*6*7*8 => 1
 * 	10! = 1*...*5
 * 		  6*....*10(10 can be 5*2)
 * 		so the number of trailing is 2
 * 
 * 	25!= 1*...*5
 * 		  6*...*10(5*2)
 * 		  11*...15(5*3)
 * 		  16*....20(5*4)
 * 		  21*....25(5*5) => number of 5 and number of trailing zeros are 6
 * 
 * 		5!=5/5=1 
 * 		10!=10/5=2 
 * 		15!=15/5=3
 * 		20!=20/5=4
 * 		25!=25/5=5 but our answer should be 6, to make it genericc we can make it as n/5+n/25 so
 * 
 * 		5!=5/5 + 5/25=1+0=1 
 * 		10!=10/5+ 10/25=2+0=2
 * 		15!=15/5+ 15/25=3+0=3
 * 		20!=20/5+ 20/25=4+0=4
 * 		25!=25/5+ 25/25=5+1=26		
 * 
 * 		so we can make it like n/5+n/25+n/125....
 * 		this is known as n/5^1 + n/5^2 + n/5^3....
 * 
 */

public class TrailingZeosOfFactorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();
		System.out.println(trailing(n));
	}

	private static int trailing(int n) {
		int result = 0;
		int powOf5 = 5;
		while (n >= powOf5) {
			result += n / powOf5;
			powOf5 *= 5;
		}
		return result;
	}
}

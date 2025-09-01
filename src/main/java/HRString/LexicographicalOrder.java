package HRString;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * input : welcometojava	3
 * output : ava
			wel
			
Explanation : String s="welcometojava"  has the following lexicographically-ordered substrings of length : k=3

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) 
substring as two newline-separated values (i.e., ava\nwel).
The stub code in the editor then prints ava as our first line of output and wel as our second line of 
output.
 */
public class LexicographicalOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = scanner.nextLine();
		int k = 3;
		System.out.println(lexi(s, k));
		scanner.close();
	}

	private static String lexi(String s, int k) {
		Set<String> set = new TreeSet<String>();
		for (int i = 0; i < s.length() - k + 1; i++) { // substring work from beigining index to the last's next
			// index, so we have added +1 here, and -k bacause in substring we are usinh k
			// as end index if not String out of bounf exception comes

			String substring = s.substring(i, i + k);
			set.add(substring);
		}
		System.out.println(set);
		Object[] arr = set.toArray();

		String smallest = arr[0].toString();
		String largest = arr[arr.length - 1].toString();
		return smallest + "\n" + largest;
	}
}

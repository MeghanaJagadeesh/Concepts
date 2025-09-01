package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Print All Permutations of a Given String
Example: Input: "abc" → Output: ["abc", "acb", "bac", "bca", "cab", "cba"]
 */
public class PermutationOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		permutation(s.toCharArray(), 0,s.length()-1);
		System.out.println(count);
		scanner.close();
		
	}
	static int count=0;
	private static void permutation(char[] ch, int left, int right) {
		 List<char[]> list=Arrays.asList(ch);
		 
		if(right==left) {
			count++;
			System.out.println(ch);
			return;
		}
							
		for(int i=left; i<=right;i++) {	
			swap(ch,left,i);// Swap current character with left
			permutation(ch,left+1, right);
			swap(ch,left,i);
		}
		
	}
	private static void swap(char[] ch, int left, int right) {
		char temp=ch[left];		
		ch[left]=ch[right];
		ch[right]=temp;
		
	}

	
	/*
	 * permute("ABC", 0, 2)
    swap("ABC", 0, 0) → "ABC"
    permute("ABC", 1, 2)
        swap("ABC", 1, 1) → "ABC"
        permute("ABC", 2, 2) → PRINT "ABC"
        swap("ABC", 1, 1) → "ABC" (backtrack)

        swap("ABC", 1, 2) → "ACB"
        permute("ACB", 2, 2) → PRINT "ACB"
        swap("ACB", 1, 2) → "ABC" (backtrack)

    swap("ABC", 0, 0) → "ABC" (backtrack)

    swap("ABC", 0, 1) → "BAC"
    permute("BAC", 1, 2)
        swap("BAC", 1, 1) → "BAC"
        permute("BAC", 2, 2) → PRINT "BAC"
        swap("BAC", 1, 1) → "BAC" (backtrack)

        swap("BAC", 1, 2) → "BCA"
        permute("BCA", 2, 2) → PRINT "BCA"
        swap("BCA", 1, 2) → "BAC" (backtrack)

    swap("BAC", 0, 1) → "ABC" (backtrack)

    swap("ABC", 0, 2) → "CBA"
    permute("CBA", 1, 2)
        swap("CBA", 1, 1) → "CBA"
        permute("CBA", 2, 2) → PRINT "CBA"
        swap("CBA", 1, 1) → "CBA" (backtrack)

        swap("CBA", 1, 2) → "CAB"
        permute("CAB", 2, 2) → PRINT "CAB"
        swap("CAB", 1, 2) → "CBA" (backtrack)

    swap("CBA", 0, 2) → "ABC" (backtrack)

	 */
}

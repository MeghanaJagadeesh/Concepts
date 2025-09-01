package Strings;

import java.util.Scanner;

public class VowelAndConsonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scanner.nextLine();
		vowelAndConsonants(s);
	}

	private static void vowelAndConsonants(String s) {
		String vowels="aeiou";
		int vowelsCOunt=0;
		for(int i=0; i<s.length(); i++) {
			if(vowels.indexOf(s.charAt(i))!=-1) {
				vowelsCOunt++;
			}
		}
		int con=s.length()-vowelsCOunt;
		System.out.println("vowels : "+vowelsCOunt);
		System.err.println("Consonants: "+con);
	}
}

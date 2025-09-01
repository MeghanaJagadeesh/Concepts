package Strings;

public class StringInbuiltMethod {
	public static void main(String[] args) {
		String s = "meghana";
		System.out.println("1. "+s.repeat(4)); // repeat the string number of time
		System.out.println("2. "+s.charAt(2)); //get the character at the specific index
		System.out.println("3. "+s.codePointAt(3)); //return the unicode of the char
		System.out.println("4. "+s.compareTo("cn"));
		System.out.println("5. "+s.concat("abc")); //for concatination
		System.out.println("6. "+s.contains("a"));// to check if it contains a string
		System.out.println("7. "+s.replace("a","e"));
		System.out.println("8. "+s.indexOf('a'));
		System.out.println("9. "+s.lastIndexOf('a'));
		System.out.println("10. "+s.endsWith("a"));
		System.out.println("11. "+s.replaceAll("a","o"));
		System.out.println("12. "+s.startsWith("m"));
		System.out.println("13. "+s.toCharArray().toString());
		System.out.println("14. "+s.toLowerCase()+" "+s.toUpperCase());
		System.out.println("15. "+s.substring(3));
	}
}

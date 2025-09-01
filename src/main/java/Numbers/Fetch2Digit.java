package Numbers;

//fetch two digits of number
public class Fetch2Digit {
	public static void main(String[] args) {
		int num=1234156;
		int no=1;
		while (num!=0) {
			int rem=num%100;
			System.out.println(no+++". "+rem);
			num=num/100;
		}
	}
}

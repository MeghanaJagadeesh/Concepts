package Numbers;

//count how many two are there in sequence of number
public class Count {

	public static void main(String[] args) {
		int num=1236292722;
		int count=0;
		while(num!=0) {
			int rem=num%10;
			if(rem==2)
				count++;
			num=num/10;
		}
		System.out.println("count = "+count);
	}
}

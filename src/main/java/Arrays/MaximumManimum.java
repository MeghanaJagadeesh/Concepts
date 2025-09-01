package Arrays;

import java.util.Arrays;

public class MaximumManimum {

	public static void main(String[] args) {
		int[] arr= {3, 1, 5, 2, 8};
		Arrays.sort(arr);
		System.out.println("Max : "+arr[arr.length-1]+"\nMin : "+arr[0]);
	}
}

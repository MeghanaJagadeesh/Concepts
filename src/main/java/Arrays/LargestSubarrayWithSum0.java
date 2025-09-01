package Arrays;

import java.util.Arrays;

/*
 * Find the Largest Subarray with Sum 0
Example: Input: [1, -1, 3, -3, 2] → Output: Subarray with sum 0: [1, -1]
 */
public class LargestSubarrayWithSum0 {
	public static void main(String[] args) {
		int[] arr = { 1, -1, 3, -3, 2,-4, -2,-1 }; 	
		LargestSubarrayWithSum0(arr);
	}

	private static void LargestSubarrayWithSum0(int[] arr) {
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			sum = arr[i] + arr[i + 1];
			if (sum == 0) {
				System.out.println(arr[i] + " " + arr[i + 1]);
//				break;
			}

		}
	}
}

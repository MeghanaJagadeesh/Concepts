package Arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * Check if an Array is a Subarray of Another Array

Example: Input: [1, 2, 3], [2, 3] → Output: true
Example: Input: [1, 2, 3], [3, 4] → Output: false
 */
public class CheckSubArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int subarr[] = { 2, 3 };
		System.out.println(isSubArray(arr, subarr));
	}

	// TC = O(n) sc= O(n)
	private static boolean isSubArray(int[] arr, int[] subarr) {
		if (subarr.length > arr.length) {
			return false;
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int i = 0; i < subarr.length; i++) {
			if (!set.contains(subarr[i]))
				return false;
		}
		return true;
	}
}

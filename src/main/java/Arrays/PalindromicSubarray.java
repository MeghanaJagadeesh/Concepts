package Arrays;

import java.util.LinkedList;

/*
 * Find the Longest Palindromic Subarray

Example: Input: [1, 2, 3, 2, 1, 4] → Output: [1, 2, 3, 2, 1]
 */
public class PalindromicSubarray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1, 4 };
		longestPalindrome(arr);
	}

	private static void longestPalindrome(int[] arr) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int ele : arr) {
			list.add(ele);
		}
		int left = 0, right = arr.length - 2;
		while (left < right) {	
			if (arr[left] != arr[right]) {
				list.remove(right);
			}
			if (arr[left] == arr[right]) {
				left = left + 1;
				right = right - 1;
			}

		}
		System.err.println(list);
	}
}

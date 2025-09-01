package Arrays;

/*
 * Check if an Array is a Palindrome

Example: Input: [1, 2, 3, 2, 1] → Output: true
Example: Input: [1, 2, 3, 4] → Output: false
 */
public class Palindrome {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };
		System.out.println(palindrome(arr, 0, arr.length - 1));
	}

	private static boolean palindrome(int[] arr, int left, int right) {
		while (left < right) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left = left + 1;
			right = right - 1;
		}
		return true;

	}
}

package Arrays;

/*
 * Find the Missing Number in a Given Array of 1 to N
Example: Input: [1, 2, 4, 5], N=5 → Output: 3
 */
public class FindTheMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		int n = 5;
		System.out.println(findMissingNum(arr, n));
	}

	private static int findMissingNum(int[] arr, int n) {
		int sum = n * (n + 1) / 2;
		int actual = 0;
		for (int i : arr) {
			actual += i;
		}
		return sum - actual;
	}

}

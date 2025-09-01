package Arrays;

public class CheckArraySortedInAscending {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(isSortedInAscending(arr));
	}

	// TC= O(n) SC= O(1)
	private static boolean isSortedInAscending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}
}

package Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		rotateArray(arr, k, arr.length);
	}

	// TC=O(n) SC=O(1)
	private static void rotateArray(int[] arr, int k, int n) {
		k = k % n;
		for (int i = 0; i < arr.length; i++) {
			if (i < k) {
				System.out.print(arr[n + i - k] + " ");
			} else {
				System.out.print(arr[i - k] + " ");
			}
		}
		System.out.println();
	}
}

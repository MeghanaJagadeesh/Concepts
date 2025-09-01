package Arrays;

import java.util.Arrays;

public class MoveAllZeros {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 0, 3 };
		moveZeros(arr);
	}

	// TC= O(n), SC=O(1)
	private static void moveZeros(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

package Arrays;

/*
 * Find the Maximum Product of Two Numbers in an Array

Example: Input: [1, 2, 3, 4] → Output: 12 (3*4)
 */
public class Product {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		product(arr);
	}

	private static void product(int[] arr) {
		int pro = 1;
		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int mul = arr[i] * arr[i + 1];
			if (mul > pro) {
				pro = mul;
				x = arr[i];
				y = arr[i + 1];

			}
		}
		System.out.println(pro + " (" + x + "*" + y + ")");

	}
}

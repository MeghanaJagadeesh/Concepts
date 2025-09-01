package Arrays;

/*
 * Find the Maximum Difference Between Two Elements in an Array

Example: Input: [1, 5, 3, 6, 7] → Output: 6 (7-1)
 */
public class MaximumDifference {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 6, 7 };
		maximumDifference(arr);
		maximumDiff(arr);
	}

	private static void maximumDifference(int[] arr) {
		int maxdiff = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				int diff = arr[j] - arr[i];
				if (maxdiff < diff)
					maxdiff = diff;
			}
		}
		System.out.println(maxdiff);

	}

//{ 1, 5, 3, 6, 7 }
	private static void maximumDiff(int[] arr) {
		// we are tracking min element here coz we will get the maximum difference when
		// we minus with the smallest element
		int maxDiff = 0;
		int minele = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxDiff = Math.max(maxDiff, arr[i] - minele);
			minele = Math.min(minele, arr[i]);
		}
		System.out.println(maxDiff);
	}
}

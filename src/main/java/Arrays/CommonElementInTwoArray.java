package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElementInTwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 2, 4, 6 };
		compareElement(arr1, arr2);
	}

	//Tc=O(n) SP = o(n)
	private static void compareElement(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : arr1) {
			set.add(num);
		}

		for (int num : arr2) {
			if (set.contains(num)) {
				System.out.print(num + " ");
			}
		}
	}
}

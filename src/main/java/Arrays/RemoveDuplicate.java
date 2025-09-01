package Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3 };
		removeDuplicate(arr);

	}
	//TC = O(n), SC=O(n)
	private static void removeDuplicate(int[] arr) {
		Set<Integer> unique = new HashSet<Integer>();
		for (int element : arr) {
			unique.add(element);
		}
		System.out.println(unique);
	}
}

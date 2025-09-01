package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Find the Union of Two Arrays

Example: Input: [1, 2, 3], [3, 4, 5] → Output: [1, 2, 3, 4, 5]
 */
public class UnionOfTwoArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 7, 3 };
		int[] arr2 = { 3, 4, 2 };
		System.out.println(findUnion(arr1, arr2));
	}

	private static Set<Integer> findUnion(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int ele : arr1) {
			set.add(ele);
		}
		for (int ele : arr2) {
			set.add(ele);
		}
		return set;
	}
}

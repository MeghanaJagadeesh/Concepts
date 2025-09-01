package Arrays;

import java.util.HashSet;
import java.util.Set;

public class InterSectionOfTwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 1,5, 2, 3 };
		int[] arr2 = { 2, 3, 4, 5 };
		findIntersection(arr1, arr2);
	}

	private static void findIntersection(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int ele : arr1) {
			set.add(ele);
		}
		for (int ele : arr2) {
			if (set.contains(ele)) {
				System.out.print(ele + " ");
			}
		}
	}
}

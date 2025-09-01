package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Find the Most Frequent Element in an Array

Example: Input: [1, 2, 2, 3, 3, 3] → Output: 3 (appears 3 times)

 */
public class MostFrequent {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 3 };
		frequentChar(arr);
	}

	private static void frequentChar(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		Entry<Integer, Integer> entry = null;
		for (Entry<Integer, Integer> ele : map.entrySet()) {
			if (entry==null||ele.getValue() > entry.getValue()) {
				entry = ele;
			}
		}
		System.out.println(entry);
	}
}

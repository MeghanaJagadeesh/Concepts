package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FreqyencyElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 2, 4 };
		findAccurance(arr);
	}

	// TC = O(n) SC=O(n)
	private static void findAccurance(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int ele : arr) {
			map.put(ele, map.getOrDefault(ele, 0) + 1);
		}
		System.out.println(map);

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getKey() == 2) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}

	}
}

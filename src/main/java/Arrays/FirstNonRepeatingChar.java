package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 3 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (Entry<Integer, Integer> ele : map.entrySet()) {
			if (ele.getValue() == 1) {
				System.out.println(ele.getKey());
				break;
			}
		}
	}
}

package Arrays;

import java.util.Arrays;

public class TwoSum {
	public static void twoSum(int[] nums, int target) {

		if (nums.length < 2) {
			System.out.println(Arrays.toString(nums));
		}
		int sum = nums[0] + nums[1];
		if (sum == target) {
			System.out.println(nums[0] + " " + nums[1]);
		}
		for (int i = 1; i < nums.length - 1; i++) {
			sum = sum - nums[i - 1] + nums[i + 1];
			if (sum == target) {
				System.out.println(nums[i] + " " + nums[i + 1]);
			}
		}
//		HashMap<Integer, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < nums.length; i++) {
//			int complement = target - nums[i];
//
//			// Check if complement exists in the HashMap
//			if (map.containsKey(complement)) {
//				return new int[] { map.get(complement), i }; // Return indices
//			}
//
//			// Store the current number and its index in the HashMap
//			map.put(nums[i], i);
//		}
//
//		return new int[] {}; // Return empty array if no solution exists
	}

	public static void main(String[] args) {
		int[] nums = { -2, 2, 7, 11, 15 };
		int target = 9;

		twoSum(nums, target);
//		System.out.println("Indices: [" + nums[result[0]] + ", " + nums[result[1]] + "]");
	}
}

package Arrays;

public class Meem {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int j = removeDuplicate(nums);
        for (int i = 0; i < j; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int removeDuplicate(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}

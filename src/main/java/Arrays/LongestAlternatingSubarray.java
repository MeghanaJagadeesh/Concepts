package Arrays;

public class LongestAlternatingSubarray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4,};
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] * arr[i] < 0) {
                maxLength++;
            }
            else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);

        }
        System.out.println(maxLength);
    }

}

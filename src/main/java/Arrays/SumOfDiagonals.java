package Arrays;

/*
 * Input: 
1  2  3  
4  5  6  
7  8  9  
→ Output: Sum of Diagonals = 1 + 5 + 9 + 3 + 5 = 23
 */
public class SumOfDiagonals {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		sumofDailog(matrix);
	}

	private static void sumofDailog(int[][] matrix) {
		int n = matrix.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += matrix[i][i];
			if (i != n - i - 1)
				sum += matrix[i][n - i - 1];
		}
		System.out.println(sum);
	}
}

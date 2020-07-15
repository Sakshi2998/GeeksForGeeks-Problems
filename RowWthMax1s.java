import java.util.Scanner;

public class RowWthMax1s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = sc.nextInt(); tc > 0; tc--) {
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			int[][] matrix = new int[rows][cols];

			for (int i = 0; i < rows; i++)
				for (int j = 0; j < cols; j++)
					matrix[i][j] = sc.nextInt();

			findMaximum(rows, cols, matrix);
		}
	}

	// Method 1 : binary search : O(mlogn) m = rows , n =columns
	static void binarySearch(int rows, int cols, int[][] matrix) {
		int low = 0;
		int high = cols;
		int answer = 0;
		boolean found;
		while (high >= low) {
			found = false;
			int mid = low + (high - low) / 2;
			for (int i = 0; i < rows; i++) {
				if (matrix[i][mid] == 1) {
					answer = i;
					high = mid - 1;
					found = true;
				}
			}
			if (!found) {
				low = mid + 1;
			}
		}
		System.out.println(answer);
	}

	// Method 2 : O(m+n)
	static void findMaximum(int rows, int cols, int[][] matrix) {
		int i = 0;
		int j = cols - 1;
		int answer = 0;
		while (i < rows && j >= 0) {
			if (matrix[i][j] == 0) // move down
			{
				i++;
			} else // move left
			{
				answer = i;
				j--;
			}
		}
		System.out.println(answer);
	}
}
/*
 * Given a boolean 2D array where each row is sorted. Find the row with the
 * maximum number of 1s.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. The first line of each test case contains n and m, where n is the
 * number of rows and m is the number of columns. The second line of each test
 * case contains the array elements.
 * 
 * Output: Print the row with the maximum number of 1s.
 * 
 * Constraints: 1 <= T <= 50 1 <= n,m <= 103
 * 
 * Example: Input: 2 4 4 0 1 1 1 0 0 1 1 1 1 1 1 0 0 0 0 2 2 0 0 1 1
 * 
 * Output: 2 1
 * 
 * Explanation : Testcase 1 : Row 2 is having maximum number of 1s (0-based
 * indexing).
 */

import java.util.Scanner;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = sc.nextInt(); tc > 0; tc--) {
			int size = sc.nextInt();
			int array[] = new int[size];
			for (int i = 0; i < size; i++) {
				array[i] = sc.nextInt();
			}
			findMaximumArray(array);
		}
	}

	static void findMaximumArray(int nums[]) {
		long prevmax;
		long prevmin;
		long answer = prevmax = prevmin = nums[0];

		for (int i = 1; i < nums.length; i++) {
			long max, min;
			if (nums[i] > 0) {
				max = Math.max(nums[i], nums[i] * prevmax);
				min = Math.min(nums[i], nums[i] * prevmin);
			} else {
				max = Math.max(nums[i], nums[i] * prevmin);
				min = Math.min(nums[i], nums[i] * prevmax);
			}
			answer = Math.max(answer, max);
			prevmax = max;
			prevmin = min;
		}

		System.out.println(answer);

	}

}

/*
 * Given an array A that contains N integers (may be positive, negative or
 * zero). Find the product of the maximum product subarray such that after
 * taking the mod by 1000000007, the product is maximum.
 * 
 * Input: First line of input contain number of test cases T. First line of test
 * case contain the size of array and second line of test case contain the array
 * elements.
 * 
 * Output: Output the maximum product of subarray.
 * 
 * Constraints: 1 <= T <= 100 1 <= N <= 104 -104 <= Ai <= 104
 * 
 * Example: Input: 3 5 6 -3 -10 0 2 6 2 3 4 5 -1 0 10 8 -2 -2 0 8 0 -6 -8 -6 -1
 * 
 * Output: 180 120 288
 * 
 * Explanation: Testcase 1: Subarray with maximum product is 6, -3, -10 which
 * gives product as 180.
 */

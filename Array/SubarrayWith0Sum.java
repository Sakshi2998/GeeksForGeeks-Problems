import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubarrayWith0Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (int tc = sc.nextInt(); tc > 0; tc--) {
			int size = sc.nextInt();
			int[] array = new int[size];
			for (int i = 0; i < size; i++)
				array[i] = sc.nextInt();
			zeroSubarray(array);
		}

	}

	static void zeroSubarray(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		set.add(sum);
		boolean found = false;
		for (int n : nums) {
			sum += n;
			if (set.contains(sum)) {
				System.out.println("Yes");
				found = true;
				break;
			}

			set.add(sum);

		}
		if (!found)
			System.out.println("No");
	}

}
/*
 * Given an array a[] of N positive and negative numbers. Find if there is a
 * subarray (of size at-least one) with 0 sum.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. Then T test cases follow. Each test case contains an integer n
 * denoting the size of the array. The next line contains N space separated
 * integers forming the array.
 * 
 * Output: Print "Yes" ( without quotes) if there exist a subarray of size at
 * least one with sum equal to 0 or else print "No" ( without quotes).
 * 
 * Constraints: 1 <= T <= 100 1 <= N <= 104 -105 <= a[i] <= 105
 * 
 * Example: Input: 2 5 4 2 -3 1 6 5 4 2 0 1 6
 * 
 * Output: Yes Yes
 * 
 * Explanation: Testcase 1: 2, -3, 1 is the subarray with sum 0.
 */

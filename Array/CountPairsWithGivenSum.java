import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		for (; testCases > 0; testCases--) {
			int count = 0;
			int size = sc.nextInt();
			int target = sc.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			int[] array = new int[size];

			for (int i = 0; i < size; i++) {
				array[i] = sc.nextInt();
				map.put(array[i], map.getOrDefault(array[i], 0) + 1);
			}

			for (int i = 0; i < size; i++) {
				map.put(array[i], map.get(array[i]) - 1);

				if (map.containsKey(target - array[i]))
					count += map.get(target - array[i]);
			}

			System.out.println(count);
		}

	}
}

//Given an array of integers, and an integer  ‘K’ , find the count of pairs of elements in the array whose sum is equal to 'K'.
//
//Input:
//First line of the input contains an integer T, denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains 2 space separated integers N and K denoting the size of array and the sum respectively. Second line of each test case contains N space separated integers denoting the elements of the array.
//
//Output:
//Print the count of pairs of elements in the array whose sum is equal to the K.
//
//Constraints:
//1<=T<=50
//1<=N<=50
//1<=K<=50
//1<=A[i]<=100
//
//Example:
//Input
//2
//4 6
//1  5  7 1
//4 2
//1 1 1 1
//Output
//2
//6


public class FindTheLargestThreeElementsinanArray {

	static void printLargest(int arr[]) {
		int large1 = Integer.MIN_VALUE;
		int large2 = Integer.MIN_VALUE;
		int large3 = Integer.MIN_VALUE;

		for (int n : arr) {
			if (n >= large1) {
				large3 = large2;
				large2 = large1;
				large1 = n;
			} else if (n >= large2) {
				large3 = large2;
				large2 = n;
			} else if (n > large3) {
				large3 = n;
			}
		}

		if (arr.length > 0) {
			System.out.println(large1);
			if (arr.length > 1) {
				System.out.println(large2);
				if (arr.length > 2)
					System.out.println(large3);
			}
		}

	}
	
	public static void main(String[] args) {
		printLargest(new int[] {1,5,3,2,66,7,-2,9});
	}

}

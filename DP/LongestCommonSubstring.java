import java.util.Scanner;

public class LongestCommonSubstring {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = sc.nextInt();tc>0;tc--) {
			sc.nextInt();
			sc.nextInt();
			longestCommanSubstring(sc.next(), sc.next());
		}
	}
	
	static void longestCommanSubstring(String str1,String str2) {
		int[][] dp = new int[str1.length()+1][str2.length()+1];
		int max = 0;
		for(int i=1;i<=str1.length();i++) {
			for(int j=1;j<=str2.length();j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					dp[i][j]= dp[i-1][j-1]+1;
					max = Math.max(max,dp[i][j]);
				}
			}
		}
		System.out.println(max);
	}

}
/*
 * Given two strings X and Y. The task is to find the length of the longest
 * common substring.
 * 
 * Input: First line of the input contains number of test cases T. Each test
 * case consist of three lines, first of which contains 2 space separated
 * integers N and M denoting the size of string X and Y strings respectively.
 * The next two lines contains the string X and Y.
 * 
 * Output: For each test case print the length of longest common substring of
 * the two strings .
 * 
 * Constraints: 1 <= T <= 200 1 <= N, M <= 100
 * 
 * Example: Input: 2 6 6 ABCDGH ACDGHR 3 2 ABC AC
 * 
 * Output: 4 1
 * 
 * Example: Testcase 1: CDGH is the longest substring present in both of the
 * strings.
 */

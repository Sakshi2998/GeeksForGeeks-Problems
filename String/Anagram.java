import java.util.Map;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = sc.nextInt(); tc > 0; tc--) {
			String s1 = sc.next();
			String s2 = sc.next();
			if (s1.length() != s2.length())
				System.out.println("NO");
			else
				isAnagram(s1, s2);
		}
	}

	static void isAnagram(String s1, String s2) {
		int arr[] = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i) - 'a']++;
			arr[s2.charAt(i) - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (arr[i] != 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
/*
 * Given two strings a and b consisting of lowercase characters. The task is to
 * check whether two given strings are anagram of each other or not. An anagram
 * of a string is another string that contains same characters, only the order
 * of characters can be different. For example, “act” and “tac” are anagram of
 * each other.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. Each test case consist of two strings in 'lowercase' only, in a
 * single line.
 * 
 * Output: Print "YES" without quotes if the two strings are anagram else print
 * "NO".
 * 
 * Constraints: 1 <= T <= 300 1 <= |s| <= 106
 * 
 * Example: Input: 2 geeksforgeeks forgeeksgeeks allergy allergic
 * 
 * Output: YES NO
 * 
 * Explanation: Testcase 1: Both the string have same characters with same
 * frequency. So, both are anagrams. Testcase 2: Characters in both the strings
 * are not same, so they are not anagrams.
 */

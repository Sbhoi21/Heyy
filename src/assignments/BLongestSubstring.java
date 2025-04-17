package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// two pointer approach, sliding window
public class BLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given a string s, find the length of the longest 
//		substring
//		 without repeating characters.
//
//		Example 1:
//
//		Input: s = "abcabdbb"
//		Output: 3
//		Explanation: The answer is "abc", with the length of 3.
//		Example 2:
//
//		Input: s = "bbbbb"
//		Output: 1
//		Explanation: The answer is "b", with the length of 1.
//		Example 3:
//
//		Input: s = "pwwkew"
//		Output: 3
//		Explanation: The answer is "wke", with the length of 3.
//		Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

		String s = "bacabdbb";
		String s2 = "bbbbb";
		String s6 = "pwwkew";
		String s3 = " ";
		String s4 = "au";
		// big string
		String s5 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(lengthOfLongestSubstring(s2));
		System.out.println(lengthOfLongestSubstring(s6));
		System.out.println(lengthOfLongestSubstring(s3));
		System.out.println(lengthOfLongestSubstring(s4));
		System.out.println(lengthOfLongestSubstring(s5));
//		System.out.println(lengthOfLongestSubstring2(s));
//		System.out.println(lengthOfLongestSubstring2(s2));
//		System.out.println(lengthOfLongestSubstring2(s6));
//		System.out.println(lengthOfLongestSubstring2(s3));
//		System.out.println(lengthOfLongestSubstring2(s4));
//		System.out.println(lengthOfLongestSubstring2(s5));
		System.out.println(lengthOfLongestSubstring3(s));
		System.out.println(lengthOfLongestSubstring3(s2));
		System.out.println(lengthOfLongestSubstring3(s6));
		System.out.println(lengthOfLongestSubstring3(s3));
		System.out.println(lengthOfLongestSubstring3(s4));
		System.out.println(lengthOfLongestSubstring3(s5));
//		System.out.println(lengthOfLongestSubstring4(s));
//		System.out.println(lengthOfLongestSubstring4(s2));
//		System.out.println(lengthOfLongestSubstring4(s6));
//		System.out.println(lengthOfLongestSubstring4(s3));
//		System.out.println(lengthOfLongestSubstring4(s4));
//		System.out.println(lengthOfLongestSubstring4(s5));

	}

	// two pointer approach
	// O(n) time complexity
	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();

		int[] index = new int[128]; // ASCII characters, 128 characters, 0-127, 0 = null, 1 = start, 127 = delete, a
									// = 97, z = 122, A = 65, Z = 90
		int res = 0;
		for (int i = 0, j = 0; j < n; j++) {
			i = Math.max(index[s.charAt(j)], i);
			res = Math.max(res, j - i + 1);
			index[s.charAt(j)] = j + 1;
//			System.out.println("i: " + i + " j: " + j + " res: " + res + " index: " + (int) s.charAt(j) + " "
//					+ index[s.charAt(j)]);
		}
		return res;
	}

	// This is a brute force solution that will take O(n^3) time
	// Time limit exceeded
	public static int lengthOfLongestSubstring2(String s) {
		int n = s.length();
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (allUnique(s, i, j)) {
					res = Math.max(res, j - i);
				}
			}
		}
		return res;
	}

	public static boolean allUnique(String s, int start, int end) {
		int[] index = new int[128];
		for (int i = start; i < end; i++) {
			char ch = s.charAt(i);
			if (index[ch] == 1) {
				return false;
			}
			index[ch]++;
		}
		return true;
	}




	// by using set
	// O(n) time complexity
	public static int lengthOfLongestSubstring3(String s) {
		int n = s.length();
		List<Character> list = new ArrayList<>();
		int res = 0, j = 0;
		while (j < n) {
			if (!list.contains(s.charAt(j))) {
				list.add(s.charAt(j++));
				res = Math.max(res, list.size());
			} else {
				// remove from zero to character
//				list.subList(0, (list.indexOf(s.charAt(j)) + 1)).clear();
				// by for loop
				for (int i = 0; i < list.indexOf(s.charAt(j)) + 1; i++) {
					list.remove(0);
				}
			}
		}
		return res;
	}

	// increase character in set if not found, otherwise empty down the set and
	// repeat the process
	public static int lengthOfLongestSubstring4(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int res = 0, j = 0;

		for (int i = 0; i < n; i++) {
			if (!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				res = Math.max(res, set.size());
			} else {
				set = new HashSet<>();
			}
		}
		return res;
	}

}

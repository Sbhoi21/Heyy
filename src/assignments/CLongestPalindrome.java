package assignments;

public class CLongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given a string s, return the longest palindromic substring in s.
//
//			Example 1:
//
//				Input: s = "babad"
//				Output: "bab"
//				Explanation: "aba" is also a valid answer.
//				Example 2:
//
//				Input: s = "cbbd"
//				Output: "bb"
//				 
//
//				Constraints:
//
//				1 <= s.length <= 1000
//				s consist of only digits and English letters.

		String s = "babad";
		String s2 = "cbbc";
		String s3 = "a";
		String s4 = "ac";
		String s5 = "bb";
		String s6 = "abcda";
		String s7 = "abacdfgdcaba";
		System.out.println(longestPalindrome(s));
		System.out.println(longestPalindrome(s2));
		System.out.println(longestPalindrome(s3));
		System.out.println(longestPalindrome(s4));
		System.out.println(longestPalindrome(s5));
		System.out.println(longestPalindrome(s6));
		System.out.println(longestPalindrome(s7));

	}

	// Brute force solution
	public static String longestPalindrome(String s) {
		String result = "";
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sub = s.substring(i, j + 1);
				if (isPalindrome(sub) && sub.length() > maxLength) {
					result = sub;
					maxLength = sub.length();
				}
			}
		}
		return result;
	}

	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	// optimal solution
	public String longestPalindrome2(String s) {
		if (s == null || s.isEmpty())
			return "";
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	public int expandAroundCenter(String s, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}

}

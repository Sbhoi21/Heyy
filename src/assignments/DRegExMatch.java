package assignments;

enum Result {
	TRUE, FALSE
}

public class DRegExMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
//
//			'.' Matches any single character.​​​​
//			'*' Matches zero or more of the preceding element.
//			The matching should cover the entire input string (not partial).
//
//			 
//
//			Example 1:
//
//			Input: s = "aa", p = "a"
//			Output: false
//			Explanation: "a" does not match the entire string "aa".
//			Example 2:
//
//			Input: s = "aa", p = "a*"
//			Output: true
//			Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
//			Example 3:
//
//			Input: s = "ab", p = ".*"
//			Output: true
//			Explanation: ".*" means "zero or more (*) of any character (.)".
//			 
//
//			Constraints:
//
//			1 <= s.length <= 20
//			1 <= p.length <= 20
//			s contains only lowercase English letters.
//			p contains only lowercase English letters, '.', and '*'.
//			It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.

		String s = "aa";
		String p = "a";
		System.out.println(isMatch(s, p));
		s = "ab";
		p = ".*";
		System.out.println(isMatch(s, p));
		s = "aab";
		p = "c*a*b";
		System.out.println(isMatch(s, p));
		s = "mississippi";
		p = "mis*is*p*.";
		System.out.println(isMatch(s, p));
	}

	// solution 1
	static Result[][] memo;

	public static boolean isMatch(String s, String p) {
		memo = new Result[s.length() + 1][p.length() + 1];
		return dp(0, 0, s, p);
	}

	public static boolean dp(int i, int j, String s, String p) {
		if (memo[i][j] != null) {
			return memo[i][j] == Result.TRUE;
		}

		boolean ans;
		if (j == p.length()) {
			ans = i == s.length();
		} else {
			boolean firstMatch = (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

			if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
				ans = (dp(i, j + 2, s, p) || firstMatch && dp(i + 1, j, s, p));
			} else {
				ans = firstMatch && dp(i + 1, j + 1, s, p);
			}
		}

		memo[i][j] = ans ? Result.TRUE : Result.FALSE;
		return ans;
	}

	// solution 2
	Boolean[][] cache;

	public boolean isMatch1(String s, String p) {
		int m = s.length(), n = p.length();
		cache = new Boolean[m + 1][n];
		return dfs(s, p, 0, 0);
	}

	public boolean dfs(String s, String p, int i, int j) {
		if (j == p.length())
			return i == s.length();
		if (cache[i][j] != null)
			return cache[i][j];
		char c1 = i < s.length() ? s.charAt(i) : ' ';
		char c2 = p.charAt(j);
		boolean isDot = p.charAt(j) == '.';
		boolean isStar = j < p.length() - 1 && p.charAt(j + 1) == '*';
		if (c1 == c2 || isDot && c1 != ' ') {
			if (!isStar) {
				if (dfs(s, p, i + 1, j + 1)) {
					return cache[i][j] = true;
				}
			} else {
				if (dfs(s, p, i + 1, j) || dfs(s, p, i + 1, j + 2) || dfs(s, p, i, j + 2)) {
					return cache[i][j] = true;
				}
			}
		} else if (c1 != c2 && isStar) {
			if (dfs(s, p, i, j + 2)) {
				return cache[i][j] = true;
			}
		}
		return cache[i][j] = false;
	}

	// solution 3
	public boolean isMatch3(String s, String p) {
		int m = s.length();
		int n = p.length();

		boolean[][] dp = new boolean[m + 1][n + 1];
		dp[0][0] = true;

		for (int j = 1; j <= n; j++) {
			if (p.charAt(j - 1) == '*') {
				dp[0][j] = dp[0][j - 2];
			}
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				char sChar = s.charAt(i - 1);
				char pChar = p.charAt(j - 1);

				if (pChar == '.' || pChar == sChar) {
					dp[i][j] = dp[i - 1][j - 1];
				} else if (pChar == '*') {
					dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (sChar == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
				}
			}
		}

		return dp[m][n];
	}

}

package d_list;

public class Max_depth_of_parentheses_1614 {

//	1614. Maximum Nesting Depth of the Parentheses
//	Easy
//	Topics
//	Companies
//	Hint
//	A string is a valid parentheses string (denoted VPS) if it meets one of the following:
//
//	It is an empty string "", or a single character not equal to "(" or ")",
//	It can be written as AB (A concatenated with B), where A and B are VPS's, or
//	It can be written as (A), where A is a VPS.
//	We can similarly define the nesting depth depth(S) of any VPS S as follows:
//
//	depth("") = 0
//	depth(C) = 0, where C is a string with a single character not equal to "(" or ")".
//	depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.
//	depth("(" + A + ")") = 1 + depth(A), where A is a VPS.
//	For example, "", "()()", and "()(()())" are VPS's (with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.
//
//	Given a VPS represented as string s, return the nesting depth of s.
//
//	 
//
//	Example 1:
//
//	Input: s = "(1+(2*3)+((8)/4))+1"
//	Output: 3
//	Explanation: Digit 8 is inside of 3 nested parentheses in the string.
//	Example 2:
//
//	Input: s = "(1)+((2))+(((3)))"
//	Output: 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maxDepth("(1+(2*3)+(((8))/4))+1"));
//		System.out.println(maxDepth("(1)+((2))+(((3)))"));
	}

	public static int maxDepth(String s) {

		
		int[] max = {0};
		int t = s.chars().map(c -> {
			System.out.println("c: " + (char) c);
			if (c == '(')
				return 1;
			else if (c == ')')
				return -1;
			else
				return 0;
		}).reduce((a, b) -> {
			System.out.println("a: " + a + " b: " + b + " a+b: " + (a + b) + " max: " + max[0]);
			max[0] = Math.max(max[0], a + b);
			return a + b;
		}).getAsInt();
		return max[0];
//		int maxDepth = 0;
//		int currentDepth = 0;
//
//		for (char c : s.toCharArray()) {
//			if (c == '(') {
//				currentDepth++;
//				maxDepth = Math.max(maxDepth, currentDepth);
//			} else if (c == ')') {
//				currentDepth--;
//			}
//		}

//		return maxDepth;
	}

}

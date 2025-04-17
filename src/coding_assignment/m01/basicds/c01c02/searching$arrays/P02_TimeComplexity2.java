package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P02_TimeComplexity2 {

//	You are given an integer value 'n'. Your task is to execute a series of nested loops to perform certain operations.
//	The loops are defined as follows:
//
//	Outer Loop:
//	Initializer:
//	int i = n, Endpoint: i > 0, Update: i = i / 2
//
//	Inner Loop:
//	Initializer:
//	int j = 0, Endpoint: j <= i, Update: j = j+1
//
//	During each iteration of the 'j-loop', a function 'print()' is called, which takes constant time O(1) to execute.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sample Input:
		// 8
		// Sample Output:
		// 36
		// Explanation:
		// When n = 8, the loops execute as follows:
		// For i = 8: j-loop runs 9 times (0 to 8), and each time print() is called
		// (total 9).
		// For i = 4: j-loop runs 5 times (0 to 4), and each time print() is called
		// (total 5).
		// For i = 2: j-loop runs 3 times (0 to 2), and each time print() is called
		// (total 3).
		// For i = 1: j-loop runs 2 times (0 to 1), and each time print() is called
		// (total 2).
		// Summing up: 9 + 5 + 3 + 2 = 19.

		int n = 8;
		System.out.println(print(n));

	}

	public static int print(int n) {
		int count = 0;
		for (int i = n; i > 0; i = i / 2) {
			for (int j = 0; j <= i; j++) {
				count++;
			}
		}
		return count;
	}

}

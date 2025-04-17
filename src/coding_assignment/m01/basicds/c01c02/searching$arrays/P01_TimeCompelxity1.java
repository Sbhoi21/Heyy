package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P01_TimeCompelxity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		You are given an integer n. Your task is to simulate the execution of a series of nested loops, where the innermost loop calls a print() function. You need to determine the total number of times the print() function is executed based on the value of n.
//
//		Input Format:
//		A single integer n.
//		Output Format:
//		A single integer representing the number of times the print() function was called.
//		Outer Loop (i-loop):
//		Initializer:
//		int i = 0, Endpoint: i < n , Increment: i++
//
//		First Inner Loop (j-loop):
//		Initializer:
//		int j = i , Endpoint: j >= 0, Decrement: j--
//
//		Second Inner Loop (k-loop):
//		Initializer:
//		int k = i, Endpoint: k >= i - 1, Decrement: k--
//
//		During each iteration of the 'k-loop', a function 'print()' is called, which takes constant time O(1) to execute.
//
//		Nested Loops Explanation:
//		Outer Loop (i-loop): Runs from 0 to n-1.
//		First Inner Loop (j-loop): Starts at i and decrements until 0.
//		Second Inner Loop (k-loop): Starts at i and decrements until i-1 (runs exactly 2 times for each j).
//		Sample Input:
//		3
//		Sample Output:
//		12
//		Explanation:
//		When n = 3, the loops execute as follows:
//		For i = 0: j-loop runs 1 time, and each time k-loop runs 2 times (total 2).
//		For i = 1: j-loop runs 2 times, and each time k-loop runs 2 times (total 4).
//		For i = 2: j-loop runs 3 times, and each time k-loop runs 2 times (total 6).
//		Summing up: 2 + 4 + 6 = 12 (error in previous manual calculation, it should be 12).
//		Sample Input:
//		5
//		Sample Output:
//		30
//		Explanation:
//		For n = 5, let's analyze the execution:
//
//		Outer Loop (i-loop): Iterates from 0 to 4 (since n = 5).
//		First Inner Loop (j-loop): Starts at i and decrements down to 0.
//		Second Inner Loop (k-loop): Starts at i and decrements to i-1. This loop will always execute exactly 2 times for each iteration of the j-loop.
//		Breakdown by Iterations:
//		When i = 0:
//
//		j iterates from 0 to 0 (1 time).
//		For each j, k iterates from 0 to -1 (2 times).
//		Total for i = 0: 1x2= 2 calls to print().
//		When i = 1:
//
//		j iterates from 1 to 0 (2 times).
//		For each j, k iterates from 1 to 0 (2 times).
//		Total for i = 1: 2 x 2= 4 calls to print().
//		When i = 2:
//
//		j iterates from 2 to 0 (3 times).
//		For each j, k iterates from 2 to 1 (2 times).
//		Total for i = 2: 3*2 = 6 calls to print().
//		When i = 3:
//
//		j iterates from 3 to 0 (4 times).
//		For each j, k iterates from 3 to 2 (2 times).
//		Total for i = 3: 4*2 = 8 calls to print().
//		When i = 4:
//
//		j iterates from 4 to 0 (5 times).
//		For each j, k iterates from 4 to 3 (2 times).
//		Total for i = 4: 5*2 = 10 calls to print().
//		Calculation for n = 5:
//		Adding all these together:
//
//		2 + 4 + 6 + 8 + 10 = 30
//		Therefore, when the input n is 5, the print() function is called a total of 30 times.
		
		solve(5);
	}
	
	static int count = 0;
	
	public static void print() {
        count++;
    }
	
	public static void solve(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j >= 0; j--) {
				for (int k = i; k >= i - 1; k--) {
					print();
				}
			}
		}
		System.out.println(count);
	}

}

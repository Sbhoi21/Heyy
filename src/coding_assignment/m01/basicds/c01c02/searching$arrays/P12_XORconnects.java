package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.ArrayList;

public class P12_XORconnects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Find the XOR Connects
//		You have been given two arrays A,B of sizes n, m respectively. You need to return the total connects in the arrays. A connect is defined as XOR of two elements from different arrays which results in 0.
//
//		Example 1:-
//		Input :
//		A[ ] = {1,2,3,4,5} ,
//		B[ ] = {1,2,3,4,5}
//
//		Output : 5
//		Example 2:-
//		Input : 
//		A[ ]={1,2,3,4,5} ,
//		B[ ]={7}
//
//		Output : 0
//		Constraints:
//		1 <= n,m <= 10^5
//		1 <= A[i],B[i] <= 10^9

	}

	public static int xorConnects(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((A[i] ^ B[j]) == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static int solve(ArrayList<Integer> a, ArrayList<Integer> b) {
		int n = a.size();
		int m = b.size();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((a.get(i) ^ b.get(j)) == 0) {
					count++;
				}
			}
		}
		return count;
	}

}

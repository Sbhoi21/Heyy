package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P09_ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Reverse Array
//		Given an integer array a[ ] of length n, you want to create an array res of length 2n where x res[i] == a[i] and res[i + n] == a[n-i-1] for 0 <= i < n (0-indexed).
//
//		Hint:
//		res[ ] array is the concatenation of a[ ] and reverse of a[ ].
//
//		Constraints:
//
//		1 <= n <= 1000
//
//		-1000 <= nums[i] <= 1000

		
		int n = 4;
		int[] a = { 1, 2, 3, 4 };
		int[] res = reverseArray(n, a);
		for (int i = 0; i < 2 * n; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
		int[] res2 = reverseArray2(n, a);
		for (int i = 0; i < 2 * n; i++) {
			System.out.print(res2[i] + " ");
		}
		
	}
	
	public static int[] reverseArray(int n, int[] a) {
		int[] res = new int[2 * n];
		for (int i = 0; i < n; i++) {
			res[i] = a[i];
		}
		for (int i = n; i < 2 * n; i++) {
			res[i] = a[2 * n - i - 1];
		}
		return res;
	}
	
	//optimized solution
	public static int[] reverseArray2(int n, int[] a) {
		int[] res = new int[2 * n];
		for (int i = 0; i < n; i++) {
			res[i] = a[i];
			res[i + n] = a[n - i - 1];
		}
		return res;
	}
	

}

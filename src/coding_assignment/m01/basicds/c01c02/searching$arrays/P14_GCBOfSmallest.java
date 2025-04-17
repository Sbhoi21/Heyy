package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.ArrayList;

public class P14_GCBOfSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		GCD of the smallest
//		You have been given an array of size n. You need to perform certain operations on the array to reduce the size of the array to one according to the following rule:
//
//		1). Add two smallest numbers from the array and append the number back to the array.
//
//		2). The cost of doing the above operation is equal to GCD (Greatest Common Divisor) of the smallest two numbers in the array.
//
//		Return the total cost after the last number is left in the array.
//
//		Example:
//
//		Input : n = 5  ar =  [5,4,2,3,1]
//
//		Output:  8
//		Constraints:
//
//		1 <= n <= 1000
//
//		1 <= array[i] <= 1000

		int n = 5;
		int[] ar = { 5, 4, 2, 3, 1 };
		System.out.println(gcdOfSmallest(n, ar));

	}

	public static int gcdOfSmallest(int n, int[] ar) {
		int cost = 0;
		while (n > 1) {
			int min1 = Integer.MAX_VALUE;
			int min2 = Integer.MAX_VALUE;
			int index1 = -1;
			int index2 = -1;
			for (int i = 0; i < n; i++) {
				if (ar[i] < min1) {
					min2 = min1;
					index2 = index1;
					min1 = ar[i];
					index1 = i;
				} else if (ar[i] < min2) {
					min2 = ar[i];
					index2 = i;
				}
			}
			cost += gcd(min1, min2);
			ar[index1] = min1 + min2;
			for (int i = index2; i < n - 1; i++) {
				ar[i] = ar[i + 1];
			}
			n--;
		}
		return cost;
	}

	public static int gcdOfSmallest(ArrayList<Integer> ar) {
		int cost = 0;
		int n = ar.size();
		while (n > 1) {
			int min1 = Integer.MAX_VALUE;
			int min2 = Integer.MAX_VALUE;
			int index1 = -1;
			int index2 = -1;
			for (int i = 0; i < n; i++) {
				if (ar.get(i) < min1) {
					min2 = min1;
					index2 = index1;
					min1 = ar.get(i);
					index1 = i;
				} else if (ar.get(i) < min2) {
					min2 = ar.get(i);
					index2 = i;
				}
			}
			cost += gcd(min1, min2);
			ar.set(index1, min1 + min2);
			ar.remove(index2);
			n--;
		}
		return cost;
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}

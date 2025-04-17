package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.List;

public class P19_CountInversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Count Inversions
//		Given an array of integers, write a function to count the number of elements that are greater than a specified threshold.
//
//		Input Format:
//
//		The first line contains the size of the array (n).
//		The next line contains n space-separated integers i.e. elements of array arr.
//		The third line contains the threshold value x.
//		Output Format:
//
//		Return a single integer equal to the number of elements greater than the threshold value.
//
//		Input:
//
//		5
//
//		1 3 5 7 9
//
//		10
//		Output:
//
//		0
//
//		Explanation:
//
//		Since the threshold value is equal to 10 and there are no values greater than that in the array hence the result is zero.
//
//		Constraints:
//
//		Size of the array (n): 1 ≤ n ≤ 10^5
//
//		Elements of the array: -10^9 ≤ arr[i] ≤ 10^9
//
//		Threshold: -10^9 ≤ threshold ≤ 10^9

		int[] arr = { 1, 3, 5, 7, 9 };
		int x = 10;
		System.out.println(countInversions(arr, x));

	}

	public static int countInversions(int[] arr, int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > x) {
				count++;
			}
		}
		return count;
	}

	// with list argument
	public static int countInversions(List<Integer> arr, int x) {
		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > x) {
				count++;
			}
		}
		return count;
	}

}

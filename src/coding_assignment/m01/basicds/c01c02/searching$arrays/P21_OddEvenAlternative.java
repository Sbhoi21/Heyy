package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.Arrays;

public class P21_OddEvenAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Odd Even Alternative
//		You are given an array of integers of length N. Your task is to rearrange the numbers in such a way that the resulting array follows an alternate odd-even pattern.
//		In other words, the first number in the rearranged array should be odd if the smallest element is odd, and the first number should be even if the smallest element is even. Subsequently, the second number should be even if the first number is odd, and the second number should be odd if the first number is even. This pattern continues alternately throughout the array.
//
//		Additionally, the groups of odd and even numbers should be individually sorted in the resulting array. For example, if the given array is [2,9,5,13,8,12], and the smallest element is 2 (which is even), then the output should be [2,5,8,9,12,13], following the even-odd pattern and sorting the even and odd numbers separately.
//
//		Input Format:
//		The first line of input contains an integer N (1 ≤ N ≤ 10^5), representing the length of the array.
//		The second line of input contains N space-separated integers A1, A2, ..., AN (-10^9 ≤ Ai ≤ 10^9), representing the elements of the array.
//		Output Format:
//		If it is possible to rearrange the array to achieve the alternate odd-even pattern while sorting the odd and even numbers individually, output the rearranged array on a single line, separated by spaces.
//
//		If it is not possible, output "Not Possible".
//
//		Sample Input:
//		6
//
//		2 9 5 13 8 12
//		Sample Output:
//		2 5 8 9 12 13
//		Sample Input:
//		6
//
//		1 11 7 2 8 16
//		Sample Output:
//		1 2 7 8 11 16
//		Sample Input:
//		2
//		2 4
//		Sample Output:
//		Not Possible
//		Constraints:
//		The input array will always contain at least one odd and one even number.
//		The length of the array will not exceed 10^5.
//		The elements of the array can range from -10^9 to 10^9.

		int[] arr = { 2, 9, 5, 13, 8, 12 };
//		{3 9 2 4 11}
		arr = new int[] { 3, 9, 2, 4, 11 };

		
		oddEvenAlternative(arr);

	}

	public static void oddEvenAlternative(int[] arr) {

		int n = arr.length;
		int[] odd = new int[n];
		int[] even = new int[n];
		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				even[evenCount++] = arr[i];
			} else {
				odd[oddCount++] = arr[i];
			}
		}
//		if (oddCount < (n/2) || evenCount < (n/2)) {
//			System.out.println("Not Possible");
//			return;
//		}
		Arrays.sort(odd, 0, oddCount);
		Arrays.sort(even, 0, evenCount);
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < oddCount && j < evenCount) {
			if (k % 2 == 0) {
				arr[k++] = even[j++];
			} else {
				arr[k++] = odd[i++];
			}
		}
		if (i < oddCount || j < evenCount) {
			System.out.println("Not Possible");
			return;
		}
//		while (i < oddCount) {
//			arr[k++] = odd[i++];
//		}
//		while (j < evenCount) {
//			arr[k++] = even[j++];
//		}
		for (int l = 0; l < n; l++) {
			System.out.print(arr[l] + " ");
		}
		System.out.println();
	}

	// optimized solution
	public static void oddEvenAlternativeOptimized(int[] arr) {

		int n = arr.length;
		Arrays.sort(arr);
		int i = 0;
		int j = 0;
		int k = 0;
		int[] result = new int[n];
		if (arr[0] % 2 == 0) {
			j = 0;
			k = 0;
		} else {
			j = 1;
			k = 1;
		}
		while (j < n && k < n) {
			if (i % 2 == 0) {
				result[i++] = arr[j];
				j += 2;
			} else {
				result[i++] = arr[k];
				k += 2;
			}
		}
		if (j < n) {
			while (j < n) {
				result[i++] = arr[j];
				j += 2;
			}
		}
		if (k < n) {
			while (k < n) {
				result[i++] = arr[k];
				k += 2;
			}
		}
		for (int l = 0; l < n; l++) {
			System.out.print(result[l] + " ");
		}
		System.out.println();
	}

}

package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P20_PositiveNegativeAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Positive Negative Alternate
//		In a town, residents have a unique way of arranging numbers in arrays. They prefer to maintain an alternating pattern of Negative and positive numbers to create a harmonious sequence. However, sometimes they need a little help rearranging their arrays to achieve this pattern.
//
//		Task
//
//		As an assistant to the townspeople of Alternville, your task is to write a function that takes an array of integers as input and rearranges it to create an alternating pattern of negative and positive numbers. If there are more of one kind than other (meaning if there are more positive numbers or more negative numbers) you should move all the remaining to the end of the array and if there is a zero do not include it in the array.
//		Also make sure that positive and negative numbers are sorted in their own individual group, for example, if the given array is [-1, 3,4,-6,2,5,9,-2] then the output should be: [-6,2,-2,3,-1,4,5,9]. The resulting array should start with the lowest number of the given array.
//
//		Input
//
//		An integer n (1 ≤ n ≤ 100), represents the number of elements in the array.
//		A list of n integers, where each integer is in the range of -1000 to 1000 (inclusive).
//		Output:
//
//		A list of n integers, representing the rearranged array with an alternating begative-positive pattern.
//
//		Sample Input:
//
//		5
//		-9 11 4 6 -2
//		Sample Output:
//
//		-9 4 -2 6 11
//		Sample Input:
//
//		7
//		0 -3 5 9 -4 10 -6
//		Sample Output:
//
//		-6 5 -4 9 -3 10 
//		Note you don't have to include zeroes in result
//
//		int[] arr = { -9, 11, 4, 6, -2 };
//////		int[] result = positiveNegativeAlternate(arr);
////		for (int i = 0; i < result.length; i++) {
////			System.out.print(result[i] + " ");
////		}
////		System.out.println();
//
//		int[] arr1 = { 0, -3, 5, 9, -4, 10, -6 };
//		// -3 -4 -9 -11 -2 -13 -27 -99
////		arr1 = new int[] { -3, -4, -9, -11, -2, -13, -27, -99 };
//		int[] result1 = positiveNegativeAlternate(arr1);
////		for (int i = 0; i < result1.length; i++) {
////			System.out.print(result1[i] + " ");
////		}
//		System.out.println();

//		Arrays.sort(arr1);
//		System.out.println(pivot(arr1, 7));

//		rearrangeAlternate(arr1);

//		for (int num : arr1) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
		
		issubsequece("abc", "ahbgdc");

	}

	public static int[] positiveNegativeAlternate(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		int j = -2;
		// sort the array by library function
		Arrays.sort(arr);

		int p = pivot(arr, n);
		System.out.println(p);
		if (p > (n / 2)) {
			// if there are more negative numbers than positive numbers
			// then add positive numbers first and then negative numbers
			j = -1;
			for (int i = p; i < n; i++) {
				j = j + 2;
				result[j] = arr[i];
			}
			int last = j;
			j = 0;
			for (int i = 0; i < p; i++) {
				result[j] = arr[i];
				if (j < last)
					j = j + 2;
				else
					j = j + 1;
			}
		} else {
			// if there are more positive numbers than negative numbers
			// then add negative numbers first and then positive numbers
			for (int i = 0; i < p; i++) {
				j = j + 2;
				result[j] = arr[i];
			}
			int last = j;
			j = 1;
			while (arr[p] == 0) {
				p++;
			}
			for (int i = p; i < n; i++) {
				result[j] = arr[i];
				if (j < last)
					j = j + 2;
				else
					j = j + 1;
			}
		}

		for (int i = 0; i < n; i++) {
			if (result[i] != 0) {
				System.out.print(result[i] + " ");
			}
		}

		return result;

//		for (int i = 0; i < n; i++) {
//			if (arr[i] < 0) {
//				result[j] = arr[i];
//				j = j + 2;
//			}
//		}
//		j = 1;
//		for (int i = 0; i < n; i++) {
//			if (arr[i] > 0) {
//				result[j] = arr[i];
//				j = j + 2;
//			}
//		}
//		return result;
	}

	// find the index where the positive and negative numbers are separated by
	// binary search
	public static int pivot(int[] arr, int n) {

		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	private static void rearrangeAlternate(int[] arr) {
		// Separate positive and negative numbers
		List<Integer> negatives = new ArrayList<>();
		List<Integer> positives = new ArrayList<>();

		for (int num : arr) {
			if (num < 0) {
				negatives.add(num);
			} else if (num > 0) {
				positives.add(num);
			}
			// Ignore zero as per requirements
		}

		// Sort both lists
		Collections.sort(negatives);
		Collections.sort(positives);

		// Merge alternately
		List<Integer> result = new ArrayList<>();
		int negIndex = 0, posIndex = 0;

		while (negIndex < negatives.size() && posIndex < positives.size()) {
			result.add(negatives.get(negIndex++));
			result.add(positives.get(posIndex++));
		}

		// Add remaining negative numbers
		while (negIndex < negatives.size()) {
			result.add(negatives.get(negIndex++));
		}

		// Add remaining positive numbers
		while (posIndex < positives.size()) {
			result.add(positives.get(posIndex++));
		}

		// Convert result list to array and print
		for (int num : result) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	
	public static boolean issubsequece(String s, String t) {
		int c= 0;
		for (int i = 0; i < t.length(); i++) {
			System.out.println("c: " + c + " i: " + i + " s: " + s.charAt(c) + " t: " + t.charAt(i));
			if (t.charAt(i) == s.charAt(c)) {
				c++;
			}
			if (c == s.length()) {
				return true;
			}
			
//			int index = t.indexOf(s.charAt(i));
//			if (index == -1) {
//				return false;
//			}
//			t = t.substring(index + 1);
		}
		return false;
	}
	
	
	
	
}

package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.Vector;

public class P05_MergeSort {

	public static void main(String[] args) {
//		In the friendly village of Sortville, there lived a kind wizard named Willy. Willy was known for his love of arranging things neatly. One day, while exploring the forest, he found a box filled with jumbled-up numbers written on colourful pebbles. Willy wanted to put them in order because he thought it would be fun.
//
//		Task:
//		Now, it's your job to help Willy arrange these colourful pebbles in the correct order. Write a program named mergeSort to sort the numbers on the pebbles using this method.
//
//		Expected Time Complexity is O(n*log(n))
//		Input:
//		An integer n (1 to 100,000), tells you how many pebbles there are.
//
//		A list of n numbers, written on the pebbles. Each number is between 1 and 100,000.
//
//		Output:
//		A list of n numbers, the pebbles sorted from the smallest to the biggest.
//
//		Input:
//		4
//		10 5 3 7
//
//		Output:
//		3 5 7 10

		int n = 4;
		Vector<Integer> arr = new Vector<>();
		arr.add(10);
		arr.add(5);
		arr.add(3);
		arr.add(7);
		mergeSort(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr.get(i) + " ");
		}

	}

	public static void mergeSort(Vector<Integer> arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	public static void merge(Vector<Integer> arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		Vector<Integer> L = new Vector<>();
		Vector<Integer> R = new Vector<>();
		for (int i = 0; i < n1; i++) {
			L.add(arr.get(left + i));
		}
		for (int i = 0; i < n2; i++) {
			R.add(arr.get(mid + 1 + i));
		}
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L.get(i) <= R.get(j)) {
				arr.set(k, L.get(i));
				i++;
			} else {
				arr.set(k, R.get(j));
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr.set(k, L.get(i));
			i++;
			k++;
		}
		while (j < n2) {
			arr.set(k, R.get(j));
			j++;
			k++;
		}
	}
}

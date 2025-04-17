package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P07_SpecialPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Special Pair of Scores
//		You are given an array of integers representing the performance scores of n participants in a coding competition. Each participant is assigned a unique score based on their performance, and no two participants have the same score. Your task is to calculate the total number of Special pairs in the list of scores.
//		A Special pair is defined as a pair of indices (i, j) such that i < j and scores[i] > scores[j].
//
//		Sample Input:
//		6
//
//		8 4 2 1 5 3
//		Output:
//		10
//
//		Constraints:
//		The number of participants (n): 2 ≤ n ≤ 10^5.
//		The scores of participants: 1 ≤ score[i] ≤ 10^9. For example, out of the 10 total pairs 3 possible pairs are : (8,4),(8,5),(4,3).

		int[] scores = { 8, 4, 2, 1, 5, 3 };
		System.out.println(specialPairs(scores));
		
		System.out.println(new P07_SpecialPairs().countSpecialPairs(scores));

	}

	public static int specialPairs(int[] scores) {
		int n = scores.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (scores[i] > scores[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public int countSpecialPairs(int[] scores) {
		if (scores == null || scores.length < 2) {
			return 0;
		}

		// Create a temporary array to store sorted values during merge
		int[] temp = new int[scores.length];

		// Use merge sort to count inversions (special pairs)
		return mergeSortAndCount(scores, temp, 0, scores.length - 1);
	}

	private int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
		int count = 0;
		if (left < right) {
			int mid = (left + right) / 2;

			// Count inversions in left half
			count += mergeSortAndCount(arr, temp, left, mid);

			// Count inversions in right half
			count += mergeSortAndCount(arr, temp, mid + 1, right);

			// Count inversions across the split
			count += mergeAndCount(arr, temp, left, mid, right);
		}
		return count;
	}

	private int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
		// Copy both halves into the temp array
		System.arraycopy(arr, left, temp, left, right - left + 1);

		int i = left; // Pointer for left subarray
		int j = mid + 1; // Pointer for right subarray
		int k = left; // Pointer for merged array
		int count = 0;

		// Merge the two halves back into arr[] and count inversions
		while (i <= mid && j <= right) {
			if (temp[i] > temp[j]) {
				// If left element is greater, it's an inversion
				arr[k++] = temp[j++];
				count += (mid - i + 1);
			} else {
				arr[k++] = temp[i++];
			}
		}

		// Copy remaining elements of left subarray
		while (i <= mid) {
			arr[k++] = temp[i++];
		}

		// Copy remaining elements of right subarray
		while (j <= right) {
			arr[k++] = temp[j++];
		}

		return count;
	}

}

package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P08_DutchFlagProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dutch Flag Problem
//		You are given an array of colourful balls represented by integers, where each integer can have one of three distinct values: 0 (red), 1 (white), or 2 (blue). Your task is to sort the array in such a way that all the red balls come first, followed by all the white balls, and then all the blue balls, effectively solving the Dutch National Flag problem.
//
//		Input Format:
//
//		The first line of input contains an integer N (1 ≤ N ≤ 10^5), representing the number of colourful balls in the array.
//		The second line of input contains N space-separated integers, where each integer is either 0 (red), 1 (white), or 2 (blue).
//		Output Format:
//
//		Output the sorted array of colourful balls on a single line, separated by spaces.
//
//		Input:
//
//		8
//
//		1 0 2 1 0 2 1 0
//		Output:
//		0 0 0 1 1 1 2 2

		int[] balls = { 1, 0, 2, 1, 0, 2, 1, 0 };
		dutchFlag(balls, balls.length);
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
	}

	public static void dutchFlag(int[] balls, int n) {
		int low = 0;
		int mid = 0;
		int high = n - 1;
		while (mid <= high) {
			if (balls[mid] == 0) {
				swap(balls, low, mid);
				low++;
				mid++;
			} else if (balls[mid] == 1) {
				mid++;
			} else {
				swap(balls, mid, high);
				high--;
			}
		}
	}

	public static void swap(int[] balls, int i, int j) {
		int temp = balls[i];
		balls[i] = balls[j];
		balls[j] = temp;
	}

}

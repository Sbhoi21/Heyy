package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P04_BubbleSort {

//	Anish and Binish are playing a game. They both have to pick 'n' stones of varying sizes with non-duplicates and give their set of stones to the other. They have to sort these stones in increasing order but are allowed to do just one operation on them that is they can swap any adjacent stones with each other.
//	The one who sorts their set of stones with the least number of swaps wins. You are given two arrays named 'Anish' and 'Binish' representing the size of stones that they have to sort.
//	Determine the winner of the game.
//
//	Note: If the game is a tie print out "Tie".
//
//	Sample Input:
//	5
//
//	7 2 8 9 5
//
//	4 6 2 5 3
//	Sample Output:
//	Anish
//	Constraints:
//	1<=n<=1000
//
//	1<=s[i]<=10^5

	public static void main(String[] args) {
		int[] anish = { 7, 2, 8, 9, 5 };
		int[] binish = { 4, 6, 2, 5, 3 };
		System.out.println(winner(anish, binish));

	}

	public static String winner(int[] anish, int[] binish) {
		int anishSwaps = bubbleSort(anish);
		int binishSwaps = bubbleSort(binish);
		if (anishSwaps < binishSwaps) {
			return "Anish";
		} else if (anishSwaps > binishSwaps) {
			return "Binish";
		} else {
			return "Tie";
		}
	}

	public static int bubbleSort(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
			}
		}
		return count;
	}

}

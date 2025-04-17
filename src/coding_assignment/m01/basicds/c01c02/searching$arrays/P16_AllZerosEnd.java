package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.ArrayList;

public class P16_AllZerosEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		All Zeroes End
//		You are given a set of cards, each having either a number or a symbol. Your task is to rearrange the cards in such a way that all the cards with numbers come first,
//		followed by the cards with symbols, while maintaining the relative order of numbers and symbols.
//
//		Example :
//
//		Input:
//		8
//		3 2 + 4 * - $ 5
//
//		Output:
//		3  2 4 5 + * - $
//
//		Input Format:
//		The first line of input contains an integer N (1 ≤ N ≤ 10^5), representing the number of cards.
//		The second line of input contains N space-separated elements, where each element is either a positive integer or a single symbol ('+', '-', '*', '$', etc.).

//		Output Format:
//		Output the rearranged set of cards on a single line, separated by spaces.
//		Constraints :
//		1 ≤ N ≤ 10^5

		int n = 8;
		ArrayList<String> arr = new ArrayList<String>();

		arr.add("3");
		arr.add("2");
		arr.add("+");
		arr.add("4");
		arr.add("*");
		arr.add("-");
		arr.add("$");
		arr.add("5");
		allZeroesEnd(arr);

	}

	public static void allZeroesEnd(ArrayList<String> arr) {

		int n = arr.size();
		for (int i = 0; i < n; i++) {
			if (arr.get(i).charAt(0) >= '0' && arr.get(i).charAt(0) <= '9') {
				System.out.print(arr.get(i) + " ");
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr.get(i).charAt(0) < '0' || arr.get(i).charAt(0) > '9') {
				System.out.print(arr.get(i) + " ");
			}
		}
		System.out.println();
	}

}

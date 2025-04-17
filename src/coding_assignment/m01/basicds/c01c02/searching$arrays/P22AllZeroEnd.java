package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.ArrayList;

public class P22AllZeroEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		All Zeroes End
//		You are given a set of cards, each having either a number or a symbol. Your task is to rearrange the cards in such a way that all the cards with numbers come first,
//		followed by the cards with symbols, while maintaining the relative order of numbers and symbols.
//
//		Example :
//
//		Input:
//
//		8
//
//		3 2 + 4 * - $ 5
//
//		Output:
//
//		3  2 4 5 + * - $
//
//		Input Format:
//
//		The first line of input contains an integer N (1 ≤ N ≤ 10^5), representing the number of cards.
//		The second line of input contains N space-separated elements, where each element is either a positive integer or a single symbol ('+', '-', '*', '$', etc.).
//		Output Format:
//
//		Output the rearranged set of cards on a single line, separated by spaces.
//		Constraints :
//
//		1 ≤ N ≤ 10^5

		int n = 8;
		String[] arr = { "3", "2", "+", "4", "*", "-", "$", "5" };

//		int[] nums = new int[n];
//		String[] symbols = new String[n];
//
//		int numIndex = 0;
//		int symIndex = 0;
//
//		for (int i = 0; i < n; i++) {
//			if (arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("$")) {
//				symbols[symIndex] = arr[i];
//				symIndex++;
//			} else {
//				nums[numIndex] = Integer.parseInt(arr[i]);
//				numIndex++;
//			}
//		}
//
//		for (int i = 0; i < numIndex; i++) {
//			System.out.print(nums[i] + " ");
//		}
//
//		for (int i = 0; i < symIndex; i++) {
//			System.out.print(symbols[i] + " ");
//		}
//
//		System.out.println();
//		

	}

	public void sortCards(ArrayList<String> cards, int n) {

		ArrayList<String> numbers = new ArrayList<>();
		ArrayList<String> symbols = new ArrayList<>();

		// by using ascii values
		for (int i = 0; i < n; i++) {
			if (cards.get(i).charAt(0) >= 48 && cards.get(i).charAt(0) <= 57) {
				numbers.add(cards.get(i));
			} else {
				symbols.add(cards.get(i));
			}
		}
		
		for (String number : numbers) {
			System.out.print(number + " ");
		}

		for (String symbol : symbols) {
			System.out.print(symbol + " ");
		}

	}

}

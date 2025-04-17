package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.ArrayList;
import java.util.List;

public class P06_CombineBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Combine the Books
//		In the enchanting village of Bookland, there are two mystical bookstores, Alara's Books and Balin's Reads.
//		Your task is to create a program that combines their inventories into a single sorted list.
//
//		Input:
//		4 4
//
//		book enchanted spell wand
//
//		ancient dragon magic scroll
//		Output:
//		ancient book dragon enchanted magic scroll spell wand
//
//		Constraints:
//		The size of each inventory (n) and (m): 1 ≤ n, m ≤ 10^5
//
//		Length of each book title: 1 ≤ length ≤ 100
//
//		The inventories are sorted in alphabetical order.

		String[] alara = { "book", "enchanted", "spell", "wand" };
		String[] balin = { "ancient", "dragon", "magic", "scroll" };
		System.out.println(combineBooks(alara, balin));
		System.out.println(combinebooks2(List.of(alara), List.of(balin)));

	}

	public static String combineBooks(String[] alara, String[] balin) {
		StringBuilder sb = new StringBuilder();
		int n = alara.length;
		int m = balin.length;
		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			if (alara[i].compareTo(balin[j]) < 0) {
				sb.append(alara[i] + " ");
				i++;
			} else {
				sb.append(balin[j] + " ");
				j++;
			}
		}
		while (i < n) {
			sb.append(alara[i] + " ");
			i++;
		}
		while (j < m) {
			sb.append(balin[j] + " ");
			j++;
		}
		return sb.toString();
	}

	public static List<String> combinebooks2(List<String> inventory1, List<String> inventory2) {

		List<String> combined = new ArrayList<>();
		int n = inventory1.size();
		int m = inventory2.size();
		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			if (inventory1.get(i).compareTo(inventory2.get(j)) < 0) {
				combined.add(inventory1.get(i));
				i++;
			} else {
				combined.add(inventory2.get(j));
				j++;
			}
		}
		while (i < n) {
			combined.add(inventory1.get(i));
			i++;
		}
		while (j < m) {
			combined.add(inventory2.get(j));
			j++;
		}
		return combined;

	}
}

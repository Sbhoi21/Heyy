package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P03_BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		You are the manager at "Dream Wheels" which is a Car Showroom and there are 'n' number of cars available here.
//		You read an analysis that customers tend to buy expensive rare cars if they come across them after the common cheaper cars.
//		Your task is to arrange the cars in the decreasing order of their frequency, cars are represented by a string of characters, if two or more cars have the same number of frequencies sort them lexicographically.
//
//		Sample Input:
//		ssgysyqa
//
//		Sample Output:
//		sssyyagq
//
//		Constraints:
//		1<= n <= 10^5
//		All characters are lowercase only and are English alphabets.

		String cars = "gysysddggswfsr";
		System.out.println(bucketSort(cars));
	}

	public static String bucketSort(String cars) {

		String[] bucket = new String[cars.length() + 1];
		int[] freq = new int[26];
		int maxCount = 0;
		for (int i = 0; i < cars.length(); i++) {
			freq[cars.charAt(i) - 'a']++;
			maxCount = Math.max(maxCount, freq[cars.charAt(i) - 'a']);
		}
		for (int i = 0; i < 26; i++) {
			if (freq[i] == 0)
				continue;
			if (bucket[freq[i]] == null) {
				bucket[freq[i]] = "";
			}
			bucket[freq[i]] += (char) (i + 'a');
			System.out.println("bucket[" + freq[i] + "] = " + bucket[freq[i]]);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = maxCount; i >= 1; i--) {
			if (bucket[i] != null) {
				for (int j = 0; j < bucket[i].length(); j++) {
					for (int k = 0; k < i; k++) {
						sb.append(bucket[i].charAt(j));
					}
				}
			}
		}
		return sb.toString();
	}

	// optimized solution
	public static String bucketSort2(String cars) {
		int[] freq = new int[26];
		for (int i = 0; i < cars.length(); i++) {
			freq[cars.charAt(i) - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < freq[i]; j++) {
				sb.append((char) (i + 'a'));
			}
		}
		return sb.toString();
	}
}

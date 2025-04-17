package coding_assignment.m01.basicds.c01c02.searching$arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P18_kDiffrentPairs {

	// concepts used: array, loops, if-else, math
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		k different pairs
//		Given an array of integers nums and an integer k, write a program to return the number of unique k-diff pairs in the array.
//		A k-diff pair is defined as an integer pair (nums[i], nums[j]), where the following conditions are true:
//
//		0≤i,j<length of nums and i≠j.
//
//		The absolute difference between the two numbers is exactly k, i.e., ∣nums[i]−nums[j]∣=k.
//
//		Input Format:
//		The first line contains an integer n and k space-separated, representing the number of elements in the array nums.
//
//		The second line contains n space-separated integers, the elements of the array nums.
//
//		Output Format:
//		Print a single integer representing the number of unique k-diff pairs in the array.
//
//		Sample Input:
//		5 2
//		3 1 4 1 5  
//
//		Sample Output:
//		2
//
//		Explanation:
//		In the given array, there are two unique pairs that have a difference of 2: the pair (1, 3) and the pair (3, 5). Hence, the output is 2.
//
//		Constraints:
//		The number of elements in the array nums is within the range [1,10^4].
//
//		The value of each element in nums is in the range [−10^7 ,10^7].
//
//		k is a non-negative integer within the range [0,10^7].

		int[] nums = { 3, 1, 4, 1, 5 };
		int k = 2;
		List<Integer> list = List.of(3, 1, 4, 1, 5);
//		System.out.println(kDiffPairs(list, k));
		// o/p = 2

		// 5 0 1 3 1 5 4
		List<Integer> list1 = List.of(1, 3, 1, 5, 4);
		System.out.println(kDiffPairs(list1, 0));
	}

	public static int kDiffPairs(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int diff = Math.abs(nums[i] - nums[j]);
				if (diff == k) {
					count++;
				}
			}
		}
		return count;
	}

	// with list argument
	public static int kDiffPairs(List<Integer> nums, int k) {
		int count = 0;
		Set<Integer> set = new HashSet<>(nums);
		if (k == 0) {
			return nums.size() - set.size();
		}
		for (int i : set) {
			if (set.contains(i + k)) {
				count++;
			}
		}

		return count;
	}

}

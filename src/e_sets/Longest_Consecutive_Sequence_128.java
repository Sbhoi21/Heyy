package e_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence_128 {

//	Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//
//			You must write an algorithm that runs in O(n) time.
//
//			 
//
//			Example 1:
//
//			Input: nums = [100,4,200,1,3,2]
//			Output: 4
//			Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//			Example 2:
//
//			Input: nums = [0,3,7,2,5,8,4,6,0,1]
//			Output: 9
//			 
//
//			Constraints:
//
//			0 <= nums.length <= 105
//			-109 <= nums[i] <= 109
//			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutive(nums));

	}

	public static int longestConsecutive(int[] nums) {

		if (nums.length == 0)
			return 0;

		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			set.add(num);
		}

		int max = 1;

		for (int num : nums) {

			if (!set.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;

				while (set.contains(currentNum + 1)) {
					currentNum++;
					currentStreak++;
				}

				max = Math.max(max, currentStreak);
			}
		}

		return max;
	}

	public static int longestConsecutive1(int[] nums) {
		int result = 0;
		if (nums.length > 0) {
			if (nums.length < 1000) {
				Arrays.sort(nums);
				int current = 0;
				for (int i = 1; i < nums.length; i++) {
					if (nums[i] != nums[i - 1]) {
						if (nums[i] - nums[i - 1] == 1) {
							current++;
						} else {
							if (current + 1 > result) {
								result = current + 1;
							}
							current = 0;
						}
					}
				}
				if (current + 1 > result) {
					result = current + 1;
				}
			} else {
				int min = Integer.MAX_VALUE;
				int max = Integer.MIN_VALUE;
				for (int num : nums) {
					if (num > max) {
						max = num;
					}
					if (num < min) {
						min = num;
					}
				}
				byte[] bits = new byte[max - min + 1];
				for (int num : nums) {
					bits[num - min] = 1;
				}
				int current = 0;
				for (byte bit : bits) {
					if (bit > 0) {
						current++;
					} else {
						if (current > result) {
							result = current;
						}
						current = 0;
					}
				}
				if (current > result) {
					result = current;
				}
			}
		}
		return result;
	}

	public static int longestConsecutive4(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		Arrays.sort(nums); // Sort the array in ascending order
		int longestStreak = 1;
		int currentStreak = 1;

		for (int i = 1; i < nums.length; i++) {
			// Check if the current number is consecutive with the previous one
			if (nums[i] != nums[i - 1]) {
				// If it's consecutive, increment the current streak
				if (nums[i] == nums[i - 1] + 1) {
					currentStreak++;
				} else {
					// If not consecutive, update the longest streak and reset the current streak
					longestStreak = Math.max(longestStreak, currentStreak);
					currentStreak = 1;
				}
			}
		}

		// Update the longest streak after the loop (in case the longest streak occurs
		// at the end)
		return Math.max(longestStreak, currentStreak);
	}

}

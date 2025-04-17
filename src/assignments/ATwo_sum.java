package assignments;

public class ATwo_sum {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] result = twoSum(nums, target);
        assert result != null;
        System.out.println(result[0] + " " + result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 1; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[j] + nums[j - i] == target) {
					return new int[] { j, j - i };
				}
			}
		}
		return null;

	}
}

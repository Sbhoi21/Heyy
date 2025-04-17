package mindmap.string;

public class BuildArray {

//	Build Array from Permutation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 2, 1, 5, 3, 4 };
		int[] ans = buildArray(nums);
		for (int i : ans) {
			System.out.print(i + " ");
		}

		System.out.println();

		int[] ans2 = buildArray2(nums);
		for (int i : ans2) {
			System.out.print(i + " ");
		}
	}

	public static int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}

	// by recursion
	public static int[] buildArray2(int[] nums) {
		aPermutation(nums, 0);
		return nums;
	}

	public static void aPermutation(int[] nums, int start) {
		if (start < nums.length) {
			int next = nums[nums[start]];
			aPermutation(nums, start + 1);
			nums[start] = next;
		}
	}

}

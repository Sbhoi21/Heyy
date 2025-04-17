package mindmap.string;

public class ConcantenationArray {

//	1929. Concatenation of Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 1 };
		int[] ans = getConcatenation(nums);
		for (int i : ans) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int[] ans2 = getConcatenation2(nums);
		for (int i : ans2) {
			System.out.print(i + " ");
		}
		
	}

	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}
		return ans;
	}

	// copy array
	public static int[] getConcatenation2(int[] nums) {
		int[] ans = new int[nums.length * 2];
		System.arraycopy(nums, 0, ans, 0, nums.length);
		System.arraycopy(nums, 0, ans, nums.length, nums.length);
		return ans;
	}

}

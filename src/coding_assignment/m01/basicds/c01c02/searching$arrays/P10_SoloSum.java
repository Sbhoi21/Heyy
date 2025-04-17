package coding_assignment.m01.basicds.c01c02.searching$arrays;

public class P10_SoloSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SOLO SUM
//		Ramesh is working on a problem given by his teacher, the problem states that he is given an array(say nums),
//
//		He has to find such an array (say ans) such that ans[i]=leftsum[i]+rightsum[i]. Help Ramesh to solve the problem. leftsum[i] is the sum of all the elements to the left of index i in the array nums, if there is no such element leftsum[i]=0;
//
//		rightsum[i] is the sum of all the elements to the right of index i in the array nums, if there is no such element rightsum[i]=0;
//
//		Example 1
//		Input:
//		nums = [1, 2, 3, 4, 5]
//		Output:
//		[14, 13, 12, 11, 10]
//		Example 2
//		Input
//		nums =[1, 2, -3, 4, -5]
//		Output:
//		[-2, -3, 2, -5, 4]
//		Constraints :
//		1 <= nums.length <= 1000
//
//		-10000 <= nums[i] <= 10000
		
		int[] nums = { 1, 2, 3, 0, 5 };
		int[] ans = soloSum(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();

		int[] nums1 = { 1, 2, -3, 4, -5 };
		int[] ans1 = soloSum(nums1);
		for (int i = 0; i < ans1.length; i++) {
			System.out.print(ans1[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] soloSum(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum += nums[j];
			}
			for (int j = i + 1; j < n; j++) {
				rightSum += nums[j];
			}
			ans[i] = leftSum + rightSum;
		}
		return ans;
	}

}

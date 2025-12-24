package mindmap2.array2.prefixsum;

public class Q1RunningSumOf1DArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }

}

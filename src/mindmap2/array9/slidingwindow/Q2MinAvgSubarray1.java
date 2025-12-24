package mindmap2.array9.slidingwindow;

public class Q2MinAvgSubarray1 {

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(maxAvg(nums, k)); // Output: 12.75



    }

    public static double maxAvg(int[] nums, int k) {
        if (nums == null || nums.length < k || k <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        double maxSum = 0;
        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double currentSum = maxSum;
        // Use sliding window to find the maximum sum of any subarray of size 'k'
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / k; // Return the maximum average
    }


}

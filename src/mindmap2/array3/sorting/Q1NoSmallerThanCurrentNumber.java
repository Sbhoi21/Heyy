package mindmap2.array3.sorting;

public class Q1NoSmallerThanCurrentNumber {

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent1(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


    // O(n) using counting sort
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] count = new int[101]; // Since nums[i] is in the range [0, 100]

        // Count occurrences of each number
        for (int num : nums) {
            count[num]++;
        }

        // Calculate the prefix sum to find how many numbers are smaller
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Fill the result array
        for (int i = 0; i < n; i++) {
            result[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];
        }

        return result;
    }

    // O(n^2)
    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int repeat;
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            repeat = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    repeat++;
                }
            }
            count[i] = repeat;
        }
        return count;
    }


}

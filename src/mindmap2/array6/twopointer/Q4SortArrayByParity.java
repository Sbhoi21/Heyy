package mindmap2.array6.twopointer;

public class Q4SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] result = sortArrayByParity(nums);
        System.out.print("Sorted Array by Parity: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                // Swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 == 1) right--;
        }
        return nums;
    }

    // by slow and fast pointer
    static int[] sortArrayByParity1(int[] nums) {
        int j = 0; // Slow pointer
        for (int i = 0; i < nums.length; i++) { // Fast pointer
            if (nums[i] % 2 == 0) {
                // Swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }

}

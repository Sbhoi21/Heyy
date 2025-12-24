package mindmap2.array1.simplearray;

public class Q1BuildArrayFromPermutation {


    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


    //1ms
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }

    // 0ms by recursion
    public static int[] buildArray2(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        buildArrayHelper(nums, result, 0);
        return result;
    }

    private static void buildArrayHelper(int[] nums, int[] result, int index) {
        if (index >= nums.length) {
            return;
        }
        result[index] = nums[nums[index]];
        buildArrayHelper(nums, result, index + 1);
    }


}

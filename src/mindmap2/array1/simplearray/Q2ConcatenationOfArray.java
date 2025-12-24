package mindmap2.array1.simplearray;

public class Q2ConcatenationOfArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = getConcatenation(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


    // 1ms
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        return result;
    }

    // 0ms
    public static int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        System.arraycopy(nums, 0, result, 0, n);
        System.arraycopy(nums, 0, result, n, n);
        return result;
    }

}

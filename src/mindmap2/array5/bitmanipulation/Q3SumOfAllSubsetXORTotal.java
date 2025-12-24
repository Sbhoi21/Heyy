package mindmap2.array5.bitmanipulation;

public class Q3SumOfAllSubsetXORTotal {

    public static void main(String[] args) {
        int[] arr = {5, 1, 6}; // Example input
        int result = subsetXORSum1(arr); // Output: 6
        System.out.println("Sum of all subset XOR totals: " + result);
    }

    static int subsetXORSum(int[] arr) {
        int n = arr.length;
        int totalSubsets = 1 << n; // 2^n subsets
        int totalXorSum = 0;

        for (int subsetMask = 0; subsetMask < totalSubsets; subsetMask++) {
            System.out.println("Subset Mask: " + subsetMask);
            int currentXor = 0;
            for (int j = 0; j < n; j++) {
                System.out.println("subsetMask   " + Integer.toBinaryString(subsetMask) + "       j: " + j + "          1<<j: " + Integer.toBinaryString(1 << j) + "     (full): " + Integer.toBinaryString(subsetMask & (1 << j)));
                if ((subsetMask & (1 << j)) != 0) {
                    currentXor ^= arr[j];
                }
            }
            totalXorSum += currentXor;
        }

        return totalXorSum;
    }

    public static int subsetXORSum1(int[] nums) {
        return helper(nums, 0, 0);
    }

    private static int helper(int[] nums, int index, int xorSoFar) {
        if (index == nums.length) {
            System.out.println("Base case reached at index: " + index + "   xorSoFar: " + xorSoFar);
            return xorSoFar;
        }
        System.out.println("xorSoFar: " + xorSoFar + "   index: " + index + "   nums[index]: " + nums[index]);
        int exclude = helper(nums, index + 1, xorSoFar);
        System.out.println("---------------------------------------------------");
        System.out.println("xorSoFar: " + xorSoFar + "   index: " + index + "   nums[index]: " + nums[index] + " exclude: " + exclude);
        int include = helper(nums, index + 1, xorSoFar ^ nums[index]);
        System.out.println("Done with index: " + index + "   include: " + include + "   exclude: " + exclude);
        System.out.println("---------------------------------------------------");
        return include + exclude;
    }


    private static int helper1(int[] nums, int index, int xorSoFar) {
        if (index == nums.length) {
            return xorSoFar;
        }
        int exclude = helper1(nums, index + 1, xorSoFar);
        int include = helper1(nums, index + 1, xorSoFar ^ nums[index]);
        return include + exclude;
    }

}


















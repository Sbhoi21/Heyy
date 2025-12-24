package mindmap2.array3.sorting;

public class Q3MaxProductDiffreceBetweenTwoPairs {

    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        int result = maxProductDifference(nums);
        System.out.println("Maximum product difference: " + result);
    }

    public static int maxProductDifference(int[] nums) {
        // Sort the array to easily find the largest and smallest pairs
        java.util.Arrays.sort(nums);

        // Calculate the product of the two largest numbers
        int maxProduct = nums[nums.length - 1] * nums[nums.length - 2];

        // Calculate the product of the two smallest numbers
        int minProduct = nums[0] * nums[1];

        // Return the difference between the two products
        return maxProduct - minProduct;
    }

    public static int maxProductDifference1(int[] nums) {
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int s_min = Integer.MAX_VALUE;

        for(int num : nums){
            if(num > max){
                s_max = max;
                max = num;
            }
            else if(num >= s_max){
                s_max = num;
            }
        }

        for(int num : nums){
            if(num < min){
                s_min = min;
                min = num;
            }
            else if(num <= s_min){
                s_min = num;
            }
        }
        return (max * s_max) - (min * s_min);
    }

}

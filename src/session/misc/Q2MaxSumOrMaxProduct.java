package session.misc;

public class Q2MaxSumOrMaxProduct {

//    check if in a given array say nums say s is the maximum sum out of all the subarray he can get from an array nums, and p is the maximum product he can get out of all subarrays, his task is to check if s is greater than p or not.
//if(s>p) print 1;
//if(s<p) print -1;
//if(s==p) print 0;

    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 4,5};
        System.out.println(maxSumOrMaxProduct(nums)); // Output: -1
    }

    public static int maxSumOrMaxProduct(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Calculate maximum subarray sum using Kadane's algorithm
        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        int maxProduct = maxSubArrayProduct(nums);

        System.out.println("Max Sum: " + maxSum + ", Max Product: " + maxProduct);

        // Compare maxSum and maxProduct
        if (maxSum > maxProduct) {
            return 1;
        } else if (maxSum < maxProduct) {
            return -1;
        } else {
            return 0;
        }
    }

    private static int maxSubArrayProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        // 1,2,-3,4,5
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }


        return maxProduct;
    }

}

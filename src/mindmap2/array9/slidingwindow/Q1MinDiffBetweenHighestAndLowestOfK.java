package mindmap2.array9.slidingwindow;

import java.util.Arrays;

public class Q1MinDiffBetweenHighestAndLowestOfK {

    public static void main(String[] args) {
//        int[] nums = {10, 100, 300, 200, 1000, 20, 30};
//        int k = 3;
            int[] nums = {9,4,1,7};
            int k = 2;
        System.out.println(minDiff(nums, k));
    }

    public static int minDiff(int[] nums, int k) {
        if (k <= 1) return 0;
        java.util.Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }


    public int minimumDifference2(int[] nums, int k) {
        int l=nums.length;
        int least=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int a=0;
        int b=k-1;
        while(b<l){
            least=least<nums[b]-nums[a]?least:nums[b]-nums[a];
            a++;
            b++;
        }
        return least;
    }
}

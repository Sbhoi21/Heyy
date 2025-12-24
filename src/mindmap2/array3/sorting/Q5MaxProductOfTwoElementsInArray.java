package mindmap2.array3.sorting;

public class Q5MaxProductOfTwoElementsInArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        int result = maxProduct(arr);
        System.out.println("Maximum product of two elements: " + result);
    }

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        // Find the two largest numbers in the array
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        // Calculate the maximum product
        return (firstMax - 1) * (secondMax - 1);
    }

}

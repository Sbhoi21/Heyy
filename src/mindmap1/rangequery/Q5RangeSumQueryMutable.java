package mindmap1.rangequery;

public class Q5RangeSumQueryMutable {

    public static void main(String[] args) {
//        NumArray numArray = new NumArray(new int[]{1, 3, 5});
//        System.out.println(numArray.sumRange(0, 2)); // Output: 9
//        numArray.update(1, 2); // Update index 1 to value 2
//        System.out.println(numArray.sumRange(0, 2)); // Output: 8

        // for [9,-8]

//        ["NumArray","update","sumRange","sumRange","update","sumRange"]
//         [[[9,-8]],[0,3],[1,1],[0,1],[1,-3],[0,1]]
//        Use Testcase
//        Output
//                [null,null,1,-5,null,0]
//        Expected
//                [null,null,-8,-5,null,0]
//
//        NumArray numArray = new NumArray(new int[]{9, -8});
//        numArray.update(0, 3); // Update index 0 to value 3
//        System.out.println(numArray.sumRange(1, 1)); // Output: -8 as sum from 1 to 1 is -8
//        System.out.println(numArray.sumRange(0, 1)); // Output: -5 as sum from 0 to 1 is 3 + (-8) = -5
//        numArray.update(1, -3); // Update index 1 to value -3
//        System.out.println(numArray.sumRange(0, 1)); // Output: 0 as sum from 0 to 1 is 3 + (-3) = 0

        // long input
        NumArray numArrayBig = new NumArray(new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        });
        System.out.println(numArrayBig.sumRange(0, 19)); // Output:
        // 210 as sum from 0 to 19 is 1 + 2 + ... + 20 = 210
        numArrayBig.update(0, 10); // Update index 0 to value
        System.out.println(numArrayBig.sumRange(0, 19)); // Output: 220 as sum from 0 to 19 is 10 + 2 + ... + 20 = 220
        numArrayBig.update(19, 30); // Update index 19 to value 30
        System.out.println(numArrayBig.sumRange(0, 19)); // Output:
        // 240 as sum from 0 to 19 is 10 + 2 + 19 + 30 = 240


        // Test nextFiveindex
        System.out.println("Next five indices from 0:");
        nextFiveindex(9); // Should print next indices from 0 to 4
        nextFiveindex(10);
        nextFiveindex(13); // Should print next indices from 4 to 8
        nextFiveindex(33); // Should print next indices from 33 to 37
    }

    static class NumArray {


        // Fenwick Tree (Binary Indexed Tree) implementation
        // This class allows for efficient range sum queries and updates.
        // It uses a Fenwick Tree to maintain the sum of elements in a dynamic array.
        // The update operation is O(log n) and the sumRange operation is O(log n).

        // step by step explanation:
        // 1. Initialize the Fenwick Tree with the given array.
        // 2. For each element in the array, update the Fenwick Tree.
        // 3. The update operation modifies the value at a specific index and updates the tree accordingly.




        private int[] nums;
        private int[] tree;
        private int n;

        public NumArray(int[] nums) {
            this.nums = nums;
            int n = nums.length;
            tree = new int[n + 1];

            // Build the Fenwick Tree
            for (int i = 0; i < n; i++) {
                int index = i + 1; // Fenwick Tree is 1-indexed
                while (index < tree.length) {
                    tree[index] += nums[i];
                    index += index & -index; // Move to the next index
                }
                // print complete tree
                System.out.print("Tree after inserting " + nums[i] + ": ");
                for (int j = 1; j < tree.length; j++) {
                    System.out.print(tree[j] + " ");
                }
                System.out.println();

            }

        }

        // Update the value at index and adjust the Fenwick Tree accordingly
        // The update operation modifies the value at a specific index and updates the tree accordingly.
        // The time complexity for the update operation is O(log n).

        public void update(int index, int val) {
            int diff = val - nums[index];
            nums[index] = val;
            for (int i = index + 1; i < tree.length; i += i & -i) {
                tree[i] += diff;
            }
        }

        public int sumRange(int left, int right) {
            return getSum(right + 1) - getSum(left);
        }

        // Get the sum from the start to the given index
        // This method calculates the sum of elements from the start of the array to the given index

        private int getSum(int index) {
            int sum = 0;
            while (index > 0) {
                sum += tree[index];
                index -= index & -index; // Move to the parent index
            }
            return sum;
        }


    }



//    calculate nextIndex in Fenwick Tree

    static void nextFiveindex(int i) {
        int c = 1;
        System.out.print("Next five indices from " + i + ": ");
        for (int nextIndex = i; c < 10; nextIndex += nextIndex & -nextIndex, c++) {
            System.out.print(nextIndex + " ");
        }
        System.out.println();


        // last five indices
        System.out.print("Last five indices from " + i + ": ");
        for (int nextIndex = i; c > 0; nextIndex -= nextIndex & -nextIndex, c--) {
            System.out.print(nextIndex + " ");
        }
        System.out.println();
    }


    // sum of range by using Fenwick Tree (Binary Indexed Tree) is O(log n)
    static int sumRange(int[] nums, int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
    /*

    // new solution


    *.
     */

}

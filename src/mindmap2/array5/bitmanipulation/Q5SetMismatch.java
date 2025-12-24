package mindmap2.array5.bitmanipulation;

public class Q5SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] result = findErrorNums(arr);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]); // Output: [2, 3]
    }

    static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int xorSum = 0;

        // Step 1: Compute the XOR of all elements in the array and numbers from 1 to n
        for (int num : nums) {
            xorSum ^= num;
        }
        for (int i = 1; i <= n; i++) {
            xorSum ^= i;
        }

        // Step 2: Find a set bit (rightmost set bit)
        int setBit = xorSum & -xorSum;

        // Step 3: Divide numbers into two groups and compute XOR for each group
        int xorGroup1 = 0, xorGroup2 = 0;
        for (int num : nums) {
            if ((num & setBit) != 0) {
                xorGroup1 ^= num;
            } else {
                xorGroup2 ^= num;
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i & setBit) != 0) {
                xorGroup1 ^= i;
            } else {
                xorGroup2 ^= i;
            }
        }

        // Step 4: Determine which is the duplicate and which is the missing number
        for (int num : nums) {
            if (num == xorGroup1) {
                return new int[]{xorGroup1, xorGroup2};
            }
        }
        return new int[]{xorGroup2, xorGroup1};
    }

    public int[] findErrorNums1(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        int dup = -1, miss = -1;

        for(int num: nums){
            if(seen[num]){
                dup = num;
            }
            seen[num] = true;
        }

        for(int i = 1; i <= n; i++){
            if(!seen[i]){
                miss = i;
                break;
            }
        }
        return new int[]{dup, miss};
    }

}

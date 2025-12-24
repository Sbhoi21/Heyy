package mindmap2.array4.hasing;

public class Q3NoOfPairsWithDiffK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        int k = 1;
        int result = countPairsWithDiffK(arr, k); // Output: 4
        System.out.println("Number of pairs with difference " + k + ": " + result);
    }

    static int countPairsWithDiffK(int[] arr, int k) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        int count = 0;

        for (int num : arr) {
            // Check for the complement that would give the required difference
            if (map.containsKey(num - k)) {
                count += map.get(num - k);
            }
            if (map.containsKey(num + k)) {
                count += map.get(num + k);
            }

            // Update the frequency of the current number
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    static int countPairsWithDiffK1(int[] arr, int k) {
        int[] table = new int[101];
        for (int n : arr) ++table[n];
        int count = 0;
        for (int i = k + 1; i <= 100; i++)
            count += table[i] * table[i - k];
        return count;
    }

    public static int countKDifference3(int[] nums, int k) {
        int[] freq = new int[101];
        int result = 0;

        for (int num : nums) {
            if (num - k >= 1) {
                result += freq[num - k];
            }
            if (num + k <= 100) {
                result += freq[num + k];
            }
            freq[num]++;
        }

        return result;
    }


}

package mindmap1.rangequery;

import java.util.*;

public class Q4NoOfLongestIncreasingSubSequence {

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(findNumberOfLIS1(nums)); // Output: 4
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Each element is a subsequence of length 1
            count[i] = 1; // Each element has one way to form a subsequence

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j]; // Reset count to count[j]
                    } else if (dp[i] == dp[j] + 1) {
                        count[i] += count[j]; // Add the number of ways
                    }
                }
            }

            maxLength = Math.max(maxLength, dp[i]);
        }

        int totalCount = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxLength) {
                totalCount += count[i];
            }
        }

        return totalCount;
    }


    public static int findNumberOfLIS(int[] nums) {
        Map<Integer, Map<Integer, Integer>> dp = new HashMap<>();
        dp.put(-1, new HashMap<>());
        dp.get(-1).put(Integer.MIN_VALUE, 1);
        List<Integer> sortedNums = new ArrayList<>();

        for (int num : nums) {
            int insertIndex = bisectLeft(sortedNums, num);
            if (insertIndex == sortedNums.size()) {
                sortedNums.add(num);
            } else {
                sortedNums.set(insertIndex, num);
            }

            int total = 0;
            for (Map.Entry<Integer, Integer> entry : dp.getOrDefault(insertIndex - 1, new HashMap<>()).entrySet()) {
                int prevNum = entry.getKey();
                int count = entry.getValue();
                if (prevNum < num) {
                    total += count;
                }
            }
            dp.putIfAbsent(insertIndex, new HashMap<>());
            dp.get(insertIndex).put(num, dp.getOrDefault(insertIndex, new HashMap<>()).getOrDefault(num, 0) + total);
        }

        int result = 0;
        for (int count : dp.getOrDefault(sortedNums.size() - 1, new HashMap<>()).values()) {
            result += count;
        }
        return result;
    }

    private static int bisectLeft(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }


    /*
     *
     *
     *
     *   More solutions
     *
     *
     *
     *
     *
     * */

    public static int findNumberOfLIS1(int[] nums) {
        final int len = nums.length;
        final ArrayList<int[]>[] arr = new ArrayList[len];

        int size = 0;
        for (int n : nums) {
            final int insertIndex = insertIndex(arr, n, size);
            final ArrayList<int[]> list;
            final int[] prevPair;
            if (insertIndex == size) {
                list = new ArrayList<>();
                arr[insertIndex] = list;
                prevPair = null;
                size++;

            } else {
                list = arr[insertIndex];
                prevPair = list.get(list.size() - 1);
            }

            int count = prevPair == null ? 0 : prevPair[1];
            if (insertIndex == 0) count += 1;
            else {
                final List<int[]> prevList = arr[insertIndex - 1];
                final int prevSize = prevList.size();
                count += prevList.get(prevSize - 1)[1];

                for (int i = prevSize - 1; i >= 0; i--) {
                    final int[] pair = prevList.get(i);
                    if (pair[0] >= n) {
                        count -= pair[1];
                        break;
                    }
                }
            }
            if (prevPair != null && prevPair[0] == n) prevPair[1] = count;
            else list.add(new int[]{n, count});
        }

        final List<int[]> list = arr[size - 1];
        return list.get(list.size() - 1)[1];
    }

    private static int insertIndex(ArrayList<int[]>[] arr, int n, int size) {

        // print arr
         for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "]: ");
            for (int[] pair : arr[i]) {
                System.out.print(Arrays.toString(pair) + " ");
            }
        }
        System.out.println();

        int left = 0;
        int right = size;
        while (left < right) {
            final int mid = left + (right - left) / 2;
            final int midVal = arr[mid].get(arr[mid].size() - 1)[0];
            if (midVal < n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}

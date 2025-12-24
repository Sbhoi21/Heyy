package session.misc;

public class Q1MaxFrequencyElementSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 2, 2, 5};
        int[] nums2 = {23, 55, 12, 28, 80, 27, 63, 54, 38, 44, 5, 71, 12, 65, 36, 78, 32, 2, 73, 29};
        System.out.println(maxFrequencyElementSum(nums2)); // Output: 5
        // Explanation: The elements 2 and 3 both have the highest frequency of 3. The sum is 2 + 3 = 5.
    }

    public static int maxFrequencyElementSum(int[] nums) {
        int maxFreq = 0;
        int sum = 0;
        java.util.HashMap<Integer, Integer> freqMap = new java.util.HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            int currentFreq = freqMap.get(num);

            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                sum = num;
            } else if (currentFreq == maxFreq) {
                sum += num;
            }
        }

        return sum;
    }


}

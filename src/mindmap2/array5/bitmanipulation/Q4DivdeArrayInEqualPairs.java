package mindmap2.array5.bitmanipulation;

public class Q4DivdeArrayInEqualPairs {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 2};
        boolean result = canDivideIntoEqualPairs(arr);
        System.out.println("Can divide into equal pairs: " + result); // Output: true
    }

    static boolean canDivideIntoEqualPairs(int[] arr) {


        int n = arr.length;
        if (n % 2 != 0) {
            return false; // If the array length is odd, we cannot form pairs
        }

        int xorSum = 0;
        for (int num : arr) {
            xorSum ^= 1 << num; // XOR all elements
        }

        return xorSum == 0; // If the final XOR is 0, pairs can be formed

    }

    // by hashmap
    public boolean canDivideIntoEqualPairs1(int[] arr) {
        int n = arr.length;
        if (n % 2 != 0) {
            return false; // If the array length is odd, we cannot form pairs
        }

        java.util.HashMap<Integer, Integer> frequencyMap = new java.util.HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int freq : frequencyMap.values()) {
            if (freq % 2 != 0) {
                return false; // If any number has an odd frequency, pairs cannot be formed
            }
        }

        return true; // All numbers have even frequencies, pairs can be formed
    }


    //making array because range in 500
    public boolean canDivideIntoEqualPairs2(int[] arr) {
        int n = arr.length;
        if (n % 2 != 0) {
            return false; // If the array length is odd, we cannot form pairs
        }

        int[] frequency = new int[501]; // Assuming the range of numbers is 0 to 500
        for (int num : arr) {
            frequency[num]++;
        }

        for (int freq : frequency) {
            if (freq % 2 != 0) {
                return false; // If any number has an odd frequency, pairs cannot be formed
            }
        }

        return true; // All numbers have even frequencies, pairs can be formed
    }
}

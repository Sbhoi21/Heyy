package mindmap2.array4.hasing;

public class Q1NoOfGoodPairs {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int result = numIdenticalPairs(arr);
        System.out.println("Number of good pairs: " + result);
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // by hashing
    public static int numIdenticalPairs1(int[] nums) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                count += map.get(num);
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        return count;
    }

}

package mindmap2.array6.twopointer;

public class Q3DIStringMatch {
    public static void main(String[] args) {
        String s = "IDID";
        int[] result = diStringMatch(s);
        System.out.print("Resulting Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        int low = 0, high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low; // or high, both are same here
        return result;
    }

    static int[] diStringMatch1(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        int low = 0, high = n;

        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (chars[i] == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low; // or high, both are same here
        return result;
    }
}

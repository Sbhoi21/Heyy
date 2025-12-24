package mindmap3.string3.sorting;

public class Q3FindTheDifference {

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(solution3(s, t));
    }

    private static char solution(String s, String t) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return c;
            }
        }

        return '\0'; // This line should never be reached if input is valid
    }

    // by sum of chars
    private static char solution2(String s, String t) {
        int sumS = 0, sumT = 0;

        for (char c : s.toCharArray()) {
            sumS += c;
        }
        for (char c : t.toCharArray()) {
            sumT += c;
        }
        return (char) (sumT - sumS);
    }

    // by xor
    private static char solution3(String s, String t) {
        int xor = 0;

        for (char c : s.toCharArray()) {
            xor ^= c;
        }
        for (char c : t.toCharArray()) {
            xor ^= c;
        }
        return (char) xor;
    }

}

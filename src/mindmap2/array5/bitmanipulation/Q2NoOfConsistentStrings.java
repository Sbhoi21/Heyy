package mindmap2.array5.bitmanipulation;

public class Q2NoOfConsistentStrings {

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int result = countConsistentStrings(allowed, words); // Output: 2
        System.out.println("Number of consistent strings: " + result);
    }

    static int countConsistentStrings(String allowed, String[] words) {
        int allowedMask = 0;
        for (char ch : allowed.toCharArray()) {
            allowedMask |= (1 << (ch - 'a'));
        }

        int count = 0;
        for (String word : words) {
            int wordMask = 0;
            for (char ch : word.toCharArray()) {
                wordMask |= (1 << (ch - 'a'));
            }
            if ((wordMask & ~allowedMask) == 0) {
                count++;
            }
        }

        return count;
    }

}

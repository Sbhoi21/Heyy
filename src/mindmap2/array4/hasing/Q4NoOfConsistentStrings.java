package mindmap2.array4.hasing;

public class Q4NoOfConsistentStrings {


    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int result = countConsistentStrings(allowed, words); // Output: 2
        System.out.println("Number of consistent strings: " + result);
    }

    static int countConsistentStrings(String allowed, String[] words) {
        java.util.HashSet<Character> allowedSet = new java.util.HashSet<>();
        for (char ch : allowed.toCharArray()) {
            allowedSet.add(ch);
        }

        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char ch : word.toCharArray()) {
                if (!allowedSet.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }

        return count;
    }

    // with char array
    static int countConsistentStrings1(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];
        for (char ch : allowed.toCharArray()) {
            allowedChars[ch - 'a'] = true;
        }

        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char ch : word.toCharArray()) {
                if (!allowedChars[ch - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }

        return count;
    }

}

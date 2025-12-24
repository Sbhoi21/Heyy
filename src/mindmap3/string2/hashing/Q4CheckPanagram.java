package mindmap3.string2.hashing;

public class Q4CheckPanagram {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkIfPangram(sentence)); // Output: true
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26]; // To track each letter of the alphabet
        int uniqueCount = 0; // Count of unique letters seen

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    uniqueCount++;
                    if (uniqueCount == 26) { // All letters found
                        return true;
                    }
                }
            }
        }

        return uniqueCount == 26; // Check if all letters were found
    }

    // one more optimized 1ms
    public static boolean checkIfPangramOptimized(String sentence) {
        int bitmask = 0; // Bitmask to track letters

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                bitmask |= (1 << index); // Set the bit for this letter
            }
        }

        return bitmask == (1 << 26) - 1; // Check if all 26 bits are set
    }

    // one more by string optimized 0ms
    public static boolean checkIfPangramString(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : alphabet.toCharArray()) {
            if (sentence.toLowerCase().indexOf(c) == -1) {
                return false; // If any letter is missing, return false
            }
        }
        return true; // All letters are present
    }

}

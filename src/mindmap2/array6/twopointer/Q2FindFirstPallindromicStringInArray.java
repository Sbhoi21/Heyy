package mindmap2.array6.twopointer;

public class Q2FindFirstPallindromicStringInArray {

    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        String result = firstPalindrome(words);
        System.out.println("First Palindromic String: " + result); // Output: "ada"
    }

    static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

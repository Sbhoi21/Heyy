package mindmap3.string3.sorting;

import java.util.Arrays;

public class Q2ValidAnagram {


    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(solution(s, t));
    }

    private static boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }


    // sort way
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }

    // hash way
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i) - 'a']--;
            if (hash[t.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }

    // optimized by array
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;
        }
        return true;
    }


}

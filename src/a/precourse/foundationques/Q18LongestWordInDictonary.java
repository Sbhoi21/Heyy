package a.precourse.foundationques;

import java.util.ArrayList;
import java.util.List;

public class Q18LongestWordInDictonary {


//    Longest Word in the Dictionary
//    Write a program that takes a dictionary of words as input and finds all the longest words in the dictionary. If there are multiple longest words of the same length, the program should output all of them.
//
//    Input Format:
//    The input consists of a list of words in the dictionary. Each word is on a separate line.
//
//    Output Format:
//    The program outputs all the longest words in the same order as they appear in the input, each on a new line.
//
//            Example:
//    Input:
//    apple
//            banana
//    orange
//            mango
//    pineapple
//    Output:
//    pineapple
//    Constraints:
//    The length of each word in the dictionary is at most 100 characters.
//    The dictionary can contain up to 10^4 words.
//            Explanation:
//    In the given dictionary, "pineapple" is the longest word with a length of 9 characters. Therefore, the program outputs "pineapple" as the longest word.


    public static void main(String[] args) {
        String[] dictionary = {"apple", "banana", "orange", "mango", "pineapple"};

        int maxLength = 0;

        // Find the maximum length of words in the dictionary and store in list

        List<String> longestWords = new ArrayList<>();

        for (String word : dictionary) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear(); // Clear the list if a longer word is found
                longestWords.add(word);
            } else if (word.length() == maxLength) {
                longestWords.add(word); // Add to the list if the same length is found
            }
        }


            System.out.println(longestWords);

    }

}

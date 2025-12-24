package a.precourse.foundationques;

public class Q12PenultimateWordFinder {

//    Penultimate Word Finder
//    Write a program that finds the penultimate word (next to last word) in a sentence.
//    The program takes a sentence as input and outputs the penultimate word from the sentence.
//
//    Input Format:
//    The input consists of a single sentence containing words separated by spaces.
//
//    Output Format:
//    The program outputs the penultimate word from the input sentence.
//
//    Sample Input 1:
//    Learning programming is fun.
//    Sample Output 1:
//    is
//    Constraints:
//    The sentence can contain alphabets, numbers, and special characters.
//    The sentence will not be empty.
//    The sentence will have at least two words.
//    Explanation:
//    The penultimate word is "the" as it is the next to last word in the sentence "She sells seashells by the seashore."
//    Note:The function should return the result.

    public static void main(String[] args) {
        String sentence = "Learning programming is fun.";
        String penultimateWord = findPenultimateWord(sentence);
        System.out.println("Penultimate word: " + penultimateWord);
    }

    public static String findPenultimateWord(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 2) {
            return ""; // Return an empty string if there are less than two words
        }
        return words[words.length - 2]; // Return the penultimate word
    }

}

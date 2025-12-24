package a.precourse.foundationques;

public class Q14InsertWordInMiddleOfString {

    public static void main(String[] args) {

//        Insert Word in Middle of the String
//        Write a program that takes a string and inserts a word in the middle of the string.
//                The inserted word should be placed at the middle position of the string, shifting the existing characters to accommodate the new word.
//
//                Input Format:
//        The input consists of two lines:
//        1. The first line contains the original string, which always has an even number of words separated by spaces.
//        2. The second line contains the word to be inserted.
//                Output Format:
//        The program outputs the modified string with the word inserted at the middle position.
//
//        Sample Input:
//        Hello World
//        Programming
//        Sample Output:
//        Hello Programming World
//
//        Explanation:
//        Word "Programming" is inserted in the middle of the string "Hello World", resulting in the modified string "Hello Programming World'
//        Constraints:
//
//        The original string always contains an even number of words (minimum 2 words ).
//
//        Each word in the original string has a maximum length of 20 characters.
//
//                The word to be inserted has a maximum length of 20 characters.
//
//                The total length of the original string (including spaces) does not exceed 100 characters.


        String input = "Hello World! This is a test.";
        String wordToInsert = "Java";
        int position = 2; // Position to insert the word (0-based index)

        String result = insertWordInMiddle(input, wordToInsert, position);
        System.out.println(result);

        // Example usage
        String originalString = "Hello World";
        wordToInsert = "Programming";
        String modifiedString = insertWordInMiddle(originalString, wordToInsert);
    }

    public static String insertWordInMiddle(String input, String wordToInsert, int position) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        // Insert words before the specified position
        for (int i = 0; i < position; i++) {
            result.append(words[i]).append(" ");
        }

        // Insert the new word
        result.append(wordToInsert).append(" ");

        // Insert remaining words
        for (int i = position; i < words.length; i++) {
            result.append(words[i]).append(" ");
        }

        return result.toString().trim(); // Remove trailing space
    }

    public static String insertWordInMiddle(String input, String wordToInsert) {
        String[] words = input.split(" ");
        int middleIndex = words.length / 2;

        // Insert the new word at the middle index
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < middleIndex; i++) {
            result.append(words[i]).append(" ");
        }
        result.append(wordToInsert).append(" ");
        for (int i = middleIndex; i < words.length; i++) {
            result.append(words[i]).append(" ");
        }

        System.out.println(result.toString().trim());
        return result.toString().trim(); // Remove trailing space
    }

}

package a.precourse.foundationques;

public class Q6StringAnalysis {

//
//    String Analysis
//    Write a program that counts the number of letters, spaces, numbers, and other characters in a given input string.
//    The program takes a string as input and outputs the counts of each category.
//
//    Input Format:
//    The input consists of a single string that may contain alphabets, spaces, numbers, and special characters. The length of the string is between 1 and 1000 characters.
//    Output Format:
//    The program outputs four integers separated by spaces, representing the counts of letters, spaces, numbers, and special characters in the input string, respectively.
//    Sample Input:
//    Hello World! 123
//    Sample Output:
//            10 2 3 1
//    Constraints:
//            1 <= Length of input string <= 1000
//    Explanation:
//    Input string is "Hello World! 123". The program counts 10 letters (including spaces), 2 spaces, 3 numbers, and 1 special character (the exclamation mark), resulting in the output "10 2 3 1".


    public static void main(String[] args) {
        String input = "Hello World! 123";
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println(letterCount + " " + spaceCount + " " + numberCount + " " + specialCharCount);
    }

}

package a.precourse.foundationques;

public class Q11ConvertToLowerCase {


//    Convert to Lowercase
//    Write a program that converts a given string into lowercase letters.
//    The program takes a string as input and outputs the string with all uppercase letters converted to lowercase.
//
//    Input Format:
//    The input consists of a single string containing uppercase and lowercase letters, as well as other characters.
//
//    Output Format:
//    The program outputs the input string with all uppercase letters converted to lowercase, while preserving the positions of lowercase letters and other characters.
//
//    Sample Input:
//    Hello World! This Is A Sample Input String.
//    Sample Output:
//    hello world! this is a sample input string.
//            Constraints:
//    There are no specific constraints on the input string.
//            Explanation:
//    Input string contains both uppercase and lowercase letters, along with other characters.
//    The program converts all uppercase letters to lowercase, resulting in the output string where all uppercase letters are replaced with their lowercase counterparts.


    public static void main(String[] args) {
        String input = "Hello World! This Is A Sample Input String.";
        String output = convertToLowerCase(input);
        System.out.println(output);
    }

    public static String convertToLowerCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}

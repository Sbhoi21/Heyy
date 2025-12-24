package a.precourse.foundationques;

public class Q4StringInversion {

//    String Inversion
//    Write a program that reverses a given string. The program takes a string as input and outputs the reversed string.
//
//    Input Format:
//    The input consists of a single string, which may contain alphabets, numbers, and special characters. The length of the string is between 1 and 1000 characters.
//    Output Format:
//    The program outputs a string representing the reversed version of the input string.
//    Sample Input:
//    Hello World!
//    Sample Output:
//            !dlroW olleH
//    Constraints:
//            1 <= Length of input string <= 1000


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String input = "Hello World!";
        String reversedString = reverseString(input);
        System.out.println(reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

}

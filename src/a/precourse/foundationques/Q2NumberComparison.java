package a.precourse.foundationques;

public class Q2NumberComparison {

//    Number Comparison
//    Write a program that compares two numbers and determines if they are equal, greater than, or less than each other. The program takes two integers as input and outputs a message indicating the relationship between the two numbers.
//
//    Input Format:
//    The input consists of two integers, num1 and num2, separated by a space.
//
//    Output Format:
//    The program outputs a message indicating the relationship between num1 and num2. Possible output messages are:
//
//    Numbers are equal." if num1 equals num2.
//    First number is greater." if num1 is greater than num2.
//    Second number is greater." if num2 is greater than num1.
//    Sample Input:
//
//            10 20
//    Sample Output:
//
//    Second number is greater.
//    Constraints:
//
//            -10^9 <= num1, num2 <= 10^9


    public static void main(String[] args) {

        // TODO Auto-generated method stub
        int num1 = 10;
        int num2 = 20;

        // Compare the numbers and print the result
        if (num1 == num2) {
            System.out.println("Numbers are equal.");
        } else if (num1 > num2) {
            System.out.println("First number is greater.");
        } else {
            System.out.println("Second number is greater.");
        }

    }

}

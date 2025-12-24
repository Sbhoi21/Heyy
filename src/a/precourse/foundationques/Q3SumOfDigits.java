package a.precourse.foundationques;

public class Q3SumOfDigits {

//    Sum of Digits
//    Write a program that computes the sum of the digits of an integer. The program takes an integer as input and calculates the sum of its digits.
//
//    Input Format:
//    The input consists of a single integer, N , where 0 <= N <= 10^9 .
//
//    Output Format:
//    The program outputs an integer representing the sum of the digits of the input number.
//
//    Sample Input:
//            12345
//    Sample Output:
//            15
//    Constraints:
//            0 <= N <= 10^9


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = 12345;
        int sum = 0;

        // Calculate the sum of digits
        while (N > 0) {
            sum += N % 10; // Add the last digit to the sum
            N /= 10; // Remove the last digit
        }

        // Print the result
        System.out.println(sum);
    }

}

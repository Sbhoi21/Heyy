package a.precourse.foundationques;

public class Q9RangeDivisibilityChecker {

//    Range Divisibility Checker
//    Write a program that prints numbers within a specified range that are divisible by two given numbers, num1 and num2, and also divisible by both num1 and num2.
//    The program takes four integers as input: the start and end of the range, num1, and num2. It outputs the numbers within the range that satisfy the divisibility criteria.
//
//    Input Format:
//    The input consists of four integers separated by spaces: start (the starting value of the range), end (the ending value of the range), num1, and num2.
//    Output Format:
//    The program outputs a list of numbers separated by spaces that are divisible by both num1 and num2 within the specified range.
//    Sample Input:
//            10 50 3 5
//    Sample Output:
//            15 30 45
//    Constraints:
//            1 <= start, end, num1, num2 <= 1000
//    start <= end
//    Explanation:
//    The input specifies a range from 10 to 50.
//    Numbers divisible by both 3 and 5 within this range are 15, 30, and 45.
//    These numbers are printed as the output of the program.

    public static void main(String[] args) {
        // Sample Input
        int start = 10;
        int end = 50;
        int num1 = 3;
        int num2 = 5;

        // Output numbers divisible by both num1 and num2 within the range
        for (int i = start; i <= end; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}

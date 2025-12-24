package a.precourse.foundationques;

public class Q5DivisibleValuesCount {

//    Divisible Values Count
//    Write a program that calculates the number of values within a given range that are divisible by a specified value.
//
//    The program takes three integers as input: the start and end of the range, and the value to check for divisibility. It outputs the count of numbers within the range that are divisible by the specified value.
//
//    Input Format:
//    The input consists of three integers separated by spaces:  start  (the starting value of the range),
//    end  (the ending value of the range), and  divisor  (the value to check for divisibility). All integers are within the range  -10^9  to  10^9 .
//    Output Format:
//    The program outputs a single integer representing the count of numbers within the range  start
//    to  end  (inclusive) that are divisible by  divisor .
//    Sample Input:
//            5 20 3
//    Sample Output:
//            5
//    Constraints:
//            -10^9 <= start , end , divisor <= 10^9
//    start <= end
//    Explanation:
//    Input specifies a range from 5 to 20 and checks for numbers divisible by 3. The numbers within this range that are divisible by 3 are 6, 9, 12, 15, and 18, resulting in a count of 5.

    public static void main(String[] args) {
        // Sample Input
        int start = 5;
        int end = 20;
        int divisor = 3;

        // Count of numbers divisible by divisor in the range [start, end]
        int count = 0;

        // Loop through the range and check divisibility
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }

        // Output the count
        System.out.println(count);
    }
}

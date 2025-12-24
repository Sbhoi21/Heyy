package a.precourse.foundationques;

import java.util.List;

public class Q19SumOfPositiveNumbers {


//    Sum of Positive Numbers
//    Write a program to calculate the sum of all positive numbers from a list of integers provided as input. Ignore negative numbers and zero during the summation.
//
//    Input Format:
//
//    A single line containing space-separated integers, e.g., 1 -2 3 4 -5.
//    Output Format:
//
//    A single integer representing the sum of all positive numbers.
//    Sample Input:
//
//            1 -2 3 4 -5
//    Sample Output:
//
//            8
//    Constraints:
//
//    The input may contain both positive and negative integers, as well as zero.
//    No prompts or extra messages should be printed.

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, -2, 3, 4, -5); // Sample input
        int sum = 0;

        // Iterate through the list and sum positive numbers
        for (int number : numbers) {
            if (number > 0) {
                sum += number; // Add to sum if positive
            }
        }

        // Output the result
        System.out.println(sum); // Print the sum of positive numbers
    }


}

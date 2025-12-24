package a.precourse.foundationques;

public class Q16FactorsCalculations {

//    Factors Calculation
//    Write a program that takes a number as input and prints all its factors except 1 and the number itself.
//    If the number has only two factors (1 and the number itself), then the program should print -1.
//
//    Input Format:
//    The input consists of a single integer 'n' on a single line.
//
//    Output Format:
//    The program outputs either:
//            1. All the factors of 'n' except 1 and 'n', are separated by spaces.
//            2. -1 if 'n' has only two factors (1 and 'n').
//    Example:
//    Input:
//            12
//    Output:
//            2 3 4 6
//    Constraints:
//            1 <= n <= 10^4
//    Explanation:
//    The factors of 12 are 1, 2, 3, 4, 6, and 12. Excluding 1 and 12, the remaining factors are 2, 3, 4, and 6, which are printed in ascending order separated by spaces.

    public static void main(String[] args) {
        int n = 17; // Sample input
        boolean hasFactors = false;

        // Iterate from 2 to n/2 to find factors
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                hasFactors = true;
            }
        }

        // If no factors were found, print -1
        if (!hasFactors) {
            System.out.println(-1);
        }
    }


}

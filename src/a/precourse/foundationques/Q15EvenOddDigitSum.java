package a.precourse.foundationques;

public class Q15EvenOddDigitSum {

//    Even and Odd Digit Sums
//    Write a program that takes an integer 'n' as input and prints the sum of all its even digits and the sum of all its odd digits separately. Digits refer to numbers, not places within the integer.
//
//    Input Format:
//    The input consists of a single integer 'n' on a single line.
//
//    Output Format:
//    The program outputs two space-separated integers on a single line:
//            1. The sum of all even digits in 'n'.
//            2. The sum of all odd digits in 'n'.
//    Example:
//    Input:
//            987654
//    Output:
//            18 21
//    Constraints:
//    The length of the input digits is between 0 and 10000 inclusive.
//            Explanation:
//    In the input integer 987654, the even digits are 8, 6, and 4. Their sum is 8 + 6 + 4 = 18 .
//
//    The odd digits in the input are 9, 7, and 5. Their sum is 9 + 7 + 5 = 21.
//
//    Therefore, the program outputs "18 21", where 18 is the sum of even digits and 21 is the sum of odd digits.

    public static void main(String[] args) {
        int n = 987654; // Sample input
        int evenSum = 0;
        int oddSum = 0;

        // Convert the integer to a string to iterate through its digits
        String strNum = String.valueOf(n);

        // Iterate through each character in the string
        for (char digitChar : strNum.toCharArray()) {
            int digit = Character.getNumericValue(digitChar); // Convert character to integer

            // Check if the digit is even or odd and update the respective sum
            if (digit % 2 == 0) {
                evenSum += digit; // Add to even sum
            } else {
                oddSum += digit; // Add to odd sum
            }
        }

        // Output the results
        System.out.println(evenSum + " " + oddSum);
    }


}

package a.precourse.foundationques;

public class Q13CheckCommonDigitInRange {


//    Check Common Digit in Range
//    Write a program that takes two integer values within a specified range as input and returns true if there is a common digit in both numbers.
//    A common digit refers to any digit that is present in both numbers.
//
//    Input Format:
//    The input consists of two integer values, num1andnum2, separated by spaces. Both num1andnum2 should be within the specified range.
//
//    Output Format:
//    The program outputs either "true" if there is a common digit in both numbers or "false" otherwise.
//
//    Sample Input:
//            79 67
//    Sample Output:
//            true
//    Constraints:
//    The range of input integers is from 0 to 1000 (inclusive).
//    Both num1andnum2 are within this range. Explanation:
//    First number is 35 and the second number is 45. Both numbers have the common digit 5, so the program outputs "true" indicating that there is a common digit in both numbers.

    public static void main(String[] args) {
        int num1 = 79;
        int num2 = 67;

        boolean hasCommonDigit = checkCommonDigit(num1, num2);
        System.out.println(hasCommonDigit);
    }

    public static boolean checkCommonDigit(int num1, int num2) {
        // Convert both numbers to strings
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        // Iterate through each digit in the first number
        for (char digit : strNum1.toCharArray()) {
            // Check if the digit is present in the second number
            if (strNum2.indexOf(digit) != -1) {
                return true; // Common digit found
            }
        }
        return false; // No common digit found
    }

    // by integers only
    public static boolean checkCommonDigit1(int num1, int num2) {
        // Create a boolean array to track digits
        boolean[] digitPresent = new boolean[10];

        // Mark digits present in the first number
        while (num1 > 0) {
            digitPresent[num1 % 10] = true;
            num1 /= 10;
        }

        // Check for common digits in the second number
        while (num2 > 0) {
            if (digitPresent[num2 % 10]) {
                return true; // Common digit found
            }
            num2 /= 10;
        }

        return false; // No common digit found
    }

}

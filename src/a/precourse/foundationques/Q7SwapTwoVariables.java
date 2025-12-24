package a.precourse.foundationques;

public class Q7SwapTwoVariables {

//    Swap Two Variables
//    Write a program that swaps the values of two variables. The program takes two variables as input and swaps their values. You need to print the values after swapping .
//
//    Input Format:
//    The input consists of two integers, a and b, separated by a space.
//
//    Output Format:
//    The program outputs two integers, representing the swapped values of a and b, separated by a space.
//
//    Sample Input:
//            5 10
//    Sample Output:
//            10 5
//    Constraints:
//            -10^9 <= a,b <= 10^9
//    Explanation:
//    Input is a = 5 and b = 10. After swapping their values, the output becomes a = 10 and b = 5 .
//
//            Note:-The Function should print two integers, representing the swapped values of a and b, separated by a space.


    public static void main(String[] args) {
        // Sample Input
        int a = 5;
        int b = 10;

        // Swapping the values of a and b
        int temp = a;
        a = b;
        b = temp;

        // Output the swapped values
        System.out.println(a + " " + b);
    }

}

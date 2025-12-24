package a.precourse.foundationques;

public class Q20PrimeNoInRange {

//    Prime Number in the Range
//    Write a program that takes an integer N as input and prints all the prime numbers that lie in the range from 2 to N (inclusive). Each prime number should be printed on a separate line.
//
//    Input Format:
//    The input consists of a single integer N.
//
//    Output Format:
//    The program outputs the prime numbers in the range from 2 to N (inclusive), with each prime number printed on a separate line.
//
//    Sample Input:
//            10
//    Sample Output:
//            2
//            3
//            5
//            7
//    Constraints:
//            1 <= N <= 1000

    public static void main(String[] args) {
        int N = 10; // Sample input
        boolean isPrime;

        // Iterate through numbers from 2 to N
        for (int num = 2; num <= N; num++) {
            isPrime = true; // Assume the number is prime

            // Check if num is divisible by any number from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Not a prime number
                    break;
                }
            }

            // If isPrime remains true, print the prime number
            if (isPrime) {
                System.out.println(num);
            }
        }
    }

}

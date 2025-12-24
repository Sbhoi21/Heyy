package a.precourse.foundationques;

public class Q17PowerCalculation {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = power(base, exponent);
        System.out.println("Result: " + result);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        }
        return base * power(base, exponent - 1); // Recursive case
    }
}

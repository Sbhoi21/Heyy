package mindmap.numbertheory;

import java.util.ArrayList;
import java.util.List;

public class Q1447SimplifiedFractions {

    public static void main(String[] args) {
        int n = 4;
        List<String> result = simplifiedFractions1(n);
        System.out.println(result);
    }

    public static List<String> simplifiedFractions(int n) {
        List<String> result = new ArrayList<>();
        for (int numerator = 1; numerator < n; numerator++) {
            for (int denominator = numerator + 1; denominator <= n; denominator++) {
                if (gcd(numerator, denominator) == 1) {
                    result.add(numerator + "/" + denominator);
                }
            }
        }
        return result;
    }

    // Function to calculate the greatest common divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


    // by dfs
    public static List<String> simplifiedFractions1(int n) {
        List<String> result = new ArrayList<>();
        dfs(0, 1, 1, 1, n, result);
        return result;
    }

    public static void dfs(int leftNumerator, int leftDenominator, int rightNumerator, int rightDenominator, int n, List<String> result) {
        if (leftDenominator + rightDenominator > n) {
            return;
        }
        int numerator = leftNumerator + rightNumerator;
        int denominator = leftDenominator + rightDenominator;
        result.add(numerator + "/" + denominator);

        dfs(leftNumerator, leftDenominator, numerator, denominator, n, result);
        dfs(numerator, denominator, rightNumerator, rightDenominator, n, result);

    }


}

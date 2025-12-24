package mindmap.numbertheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EasyNumberTheory {

    public static void main(String[] args) {

    }

    // find gcd
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 1979 gcd of smallest and largest number in array
    public static int gcdOfArray(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return gcd(min, max);


    }

    // 258. add digit

    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }

    public static int addDigits1(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }

    //914. X of a kind in a deck of cards

//    You are given an integer array deck where deck[i] represents the number written on the ith card.
//
//    Partition the cards into one or more groups such that:
//
//    Each group has exactly x cards where x > 1, and
//    All the cards in one group have the same integer written on them.
//            Return true if such partition is possible, or false otherwise.
//
//
//
//            Example 1:
//
//    Input: deck = [1,2,3,4,4,3,2,1]
//    Output: true
//    Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
//    Example 2:
//
//    Input: deck = [1,1,1,2,2,2,3,3]
//    Output: false
//    Explanation: No possible partition.

    // optimized
    public static boolean hasGroupsSizeX(int[] deck) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int gcd = 0;
        for (int count : map.values()) {
            gcd = gcd(gcd, count);
        }
        return gcd >= 2;
    }

    // using array
    public static boolean hasGroupsSizeX1(int[] deck) {
        int[] count = new int[10000];
        for (int i : deck) {
            count[i]++;
        }
        int gcd = 0;
        for (int i : count) {
            if (i > 0){
                gcd = gcd(gcd, i);
                if (gcd < 2) {
                    return false;
                }
            }

        }
        return gcd >= 2;
    }

    // using array 1ms
    public static boolean hasGroupsSizeX2(int[] deck) {

        int max = deck[0];

        for (int i : deck) {
            if (i > max) {
                max = i;
            }
        }
        int[] count = new int[max + 1];
        for (int i : deck) {
            count[i]++;
        }
        int gcd = 0;
        for (int i : count) {
            gcd = gcd(gcd, i);
        }
        return gcd >= 2;
    }


}

package mindmap2.array1.simplearray;

import java.util.ArrayList;
import java.util.List;

public class Q4KidsWithGreatestNoOfCandies {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        boolean[] result = kidsWithCandies(candies, extraCandies);
        for (boolean canHaveMost : result) {
            System.out.print(canHaveMost + " ");
        }
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            result[i] = (candies[i] + extraCandies >= maxCandies);
        }

        return result;
    }

    public static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }

}

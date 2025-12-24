package mindmap2.array2.prefixsum;

public class Q2FindTheHigestAltitude {

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int highestAltitude = largestAltitude(gain);
        System.out.println("Highest Altitude: " + highestAltitude);
    }

    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

}

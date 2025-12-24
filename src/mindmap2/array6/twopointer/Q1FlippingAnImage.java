package mindmap2.array6.twopointer;

public class Q1FlippingAnImage {

    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        int[][] result = flipAndInvertImage(image);
        System.out.println("Flipped and Inverted Image:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            int left = 0, right = n - 1;
            while (left <= right) {
                // Swap and invert the elements
                if (left == right) {
                    row[left] ^= 1; // Invert the middle element in case of odd length
                } else {
                    int temp = row[left] ^ 1;
                    row[left] = row[right] ^ 1;
                    row[right] = temp;
                }
                left++;
                right--;
            }
        }
        return image;
    }
}

package mindmap2.array7.binarysearch;

public class Q2CountNegativeNoInSortedMatrix {

    public static void main(String[] args) {
        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        int result = countNegatives(grid);
        System.out.println("Count of Negative Numbers: " + result); // Output: 8
    }

    static int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        int r = 0, c = col - 1;

        while (r < row && c >= 0) {
            if (grid[r][c] < 0) {
                count += (row - r); // All elements below are negative
                c--; // Move left
            } else {
                r++; // Move down
            }
        }
        return count;
    }

}

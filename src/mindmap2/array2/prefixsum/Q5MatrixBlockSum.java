package mindmap2.array2.prefixsum;

//1314
public class Q5MatrixBlockSum {

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k = 1;
        int[][] result = matrixBlockSum(mat, k);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefixSum = new int[m + 1][n + 1];

        // Calculate prefix sum
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = mat[i - 1][j - 1]
                    + prefixSum[i - 1][j]
                    + prefixSum[i][j - 1]
                    - prefixSum[i - 1][j - 1];
            }
        }

        int[][] result = new int[m][n];

        // Calculate block sums
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k);
                int r2 = Math.min(m - 1, i + k);
                int c1 = Math.max(0, j - k);
                int c2 = Math.min(n - 1, j + k);

                result[i][j] = prefixSum[r2 + 1][c2 + 1]
                             - prefixSum[r2 + 1][c1]
                             - prefixSum[r1][c2 + 1]
                             + prefixSum[r1][c1];
            }
        }

        return result;
    }
}

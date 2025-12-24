package mindmap2.array8.dpbased;

public class Q5BeautifulArrangement {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countArrangement(n));
    }

    public static int countArrangement(int n) {
        boolean[] visited = new boolean[n + 1];
        return countArrangementHelper(n, 1, visited);
    }

    private static int countArrangementHelper(int n, int position, boolean[] visited) {
        if (position > n) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && (i % position == 0 || position % i == 0)) {
                visited[i] = true;
                count += countArrangementHelper(n, position + 1, visited);
                visited[i] = false;
            }
        }
        return count;
    }


    /*

        one more



     */

    static boolean isValid[];
    static int count = 0;
    static int n = 0;

    public static int countArrangement1(int n) {
        Q5BeautifulArrangement.n = n;
        isValid = new boolean[n + 1];
        if (n == 1) return 1;
        if (n == 2) return 2;
        helper(n, isValid);
        return count;
    }

    public static void helper(int start, boolean[] isValid) {
        if (start < 1) {
            count++;
            return;
        }

        for (int i = n; i >= 1; i--) {
            if (isValid[i]) continue;
            if (start % i == 0 || i % start == 0) {
                isValid[i] = true;
                helper(start - 1, isValid);
                isValid[i] = false;
            }
        }
    }
}
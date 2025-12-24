package mindmap2.array3.sorting;

public class Q2MinNoOfMovesToSeatEveryone {

    public static void main(String[] args) {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        System.out.println(minMovesToSeat(seats, students)); // Output: 4
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        // Sort both arrays
        java.util.Arrays.sort(seats);
        java.util.Arrays.sort(students);

        int moves = 0;

        // Calculate the total moves required
        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }

        return moves;
    }


    // one more way to do it
    public static int minMovesToSeat1(int[] seats, int[] students) {
        int max_index = 0;
        for (int s : seats) max_index = Math.max(max_index, s);
        for (int s : students) max_index = Math.max(max_index, s);
        max_index++;

        int[] count_seats = new int[max_index];
        int[] count_students = new int[max_index];

        for (int seat : seats) count_seats[seat]++;
        for (int student : students) count_students[student]++;

        int i = 0, j = 0, res = 0, remain = seats.length;
        while (remain > 0) {
            if (count_seats[i] == 0) {
                i++;
                continue;
            }
            if (count_students[j] == 0) {
                j++;
                continue;
            }
            res += Math.abs(i - j);
            count_seats[i]--;
            count_students[j]--;
            remain--;
        }
        return res;
    }

}

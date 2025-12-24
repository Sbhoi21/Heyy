package mindmap1.rangequery;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q1QueueReconstructionByheight {

    public static void main(String[] args) {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] result= reconstructQueue1(people);
//        int[][] result1 = reconstructQueue(people);

        for (int[] person : result) {
            System.out.println("[" + person[0] + ", " + person[1] + "]");
        }
    }

    public static int[][] reconstructQueue(int[][] people) {
        // Sort the array by height in descending order and by k in ascending order
        java.util.Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int[] person : people) {
            System.out.print("[" + person[0] + ", " + person[1] + "] ");
        }
        System.out.println();

        java.util.List<int[]> result = new java.util.ArrayList<>();
        for (int[] person : people) {
            result.add(person[1], person);
            // show result array
            result.forEach(p -> System.out.print("[" + p[0] + ", " + p[1] + "] "));
            System.out.println();
        }

        return result.toArray(new int[result.size()][]);
    }

    // using Queue
    public static int[][] reconstructQueue1(int[][] people) {
        Queue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] == b[0] ?  a[1] - b[1] : b[0] - a[0]
        );

        for (int[] person : people) {
            pq.add(person);
            // print the queue state
            System.out.print("Queue state: ");
            for (int[] p : pq) {
                System.out.print("[" + p[0] + ", " + p[1] + "] ");
            }
            System.out.println();
        }

        System.out.print("Queue state: ");
        for (int[] p : pq) {
            System.out.print("[" + p[0] + ", " + p[1] + "] ");
        }
        System.out.println();

        List<int[]> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            int[] person = pq.poll();
            System.out.println("Polled person: [" + person[0] + ", " + person[1] + "]");
            result.add(person[1], person);
            // show result array
            result.forEach(p -> System.out.print("[" + p[0] + ", " + p[1] + "] "));
            System.out.println();
        }

        return result.toArray(new int[0][0]);
    }
}

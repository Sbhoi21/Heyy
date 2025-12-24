package mindmap1.rangequery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q3MyCalender2 {


//    731. My Calendar II
//            Medium
//    Topics
//    premium lock icon
//            Companies
//    Hint
//    You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a triple booking.
//    A triple booking happens when three events have some non-empty intersection (i.e., some moment is common to all the three events.).
//    The event can be represented as a pair of integers startTime and endTime that represents a booking on the half-open interval [startTime, endTime), the range of real numbers x such that startTime <= x < endTime.
//    Implement the MyCalendarTwo class:
//    MyCalendarTwo() Initializes the calendar object.
//    boolean book(int startTime, int endTime) Returns true if the event can be added to the calendar successfully without causing a triple booking. Otherwise, return false and do not add the event to the calendar.
//      Example 1:
//    Input
//["MyCalendarTwo", "book", "book", "book", "book", "book", "book"]
//        [[], [10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]]
//    Output
//[null, true, true, true, false, true, true]
//
//    Explanation
//    MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
//myCalendarTwo.book(10, 20); // return True, The event can be booked.
//myCalendarTwo.book(50, 60); // return True, The event can be booked.
//myCalendarTwo.book(10, 40); // return True, The event can be double booked.
//myCalendarTwo.book(5, 15);  // return False, The event cannot be booked, because it would result in a triple booking.
//myCalendarTwo.book(5, 10); // return True, The event can be booked, as it does not use time 10 which is already double booked.
//myCalendarTwo.book(25, 55); // return True, The event can be booked, as the time in [25, 40) will be double booked with the third event, the time [40, 50) will be single booked, and the time [50, 55) will be double booked with the second event.
//
//    Constraints:
//            0 <= start < end <= 109
//    At most 1000 calls will be made to book.


    public static void main(String[] args) {
        MyCalendarTwo3 myCalendarTwo = new MyCalendarTwo3();
        System.out.println(myCalendarTwo.book(10, 20)); // return True
//        System.out.println(myCalendarTwo.book(50, 60)); // return True
        System.out.println(myCalendarTwo.book(10, 40)); // return True
        System.out.println(myCalendarTwo.book(5, 15));  // return False
//        System.out.println(myCalendarTwo.book(5, 10)); // return True
//        System.out.println(myCalendarTwo.book(25, 55)); // return True
    }

    static class MyCalendarTwo {
        private final List<int[]> bookings;
        private final List<int[]> doubleBookings;

        public MyCalendarTwo() {
            bookings = new ArrayList<>();
            doubleBookings = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (int[] db : doubleBookings) {
                if (Math.max(start, db[0]) < Math.min(end, db[1])) {
                    return false; // Triple booking detected
                }
            }

            for (int[] b : bookings) {
                if (Math.max(start, b[0]) < Math.min(end, b[1])) {
                    doubleBookings.add(new int[]{Math.max(start, b[0]), Math.min(end, b[1])});
                }
            }

            bookings.add(new int[]{start, end});
            return true;
        }
    }

    /*





    diffrent soulution





    */


    static class Node {
        int reserved;
        int lazy = 0;
        Node left;
        Node right;

        Node(int n) {
            reserved = n;
            left = null;
            right = null;
        }
    }


    static class Segment {
        Node root;

        Segment() {
            root = new Node(0);
        }

        public boolean canBook(int l, int r, int start, int end, Node n) {
            System.out.println("Checking canBook for range [" + l + ", " + r + "] in segment [" + start + ", " + end + "]");
            if (l > end || r < start) return true;
            if (l <= start && end <= r) {
                if (n.reserved >= 2) return false;
                return true;
            }
            int mid = (start + end) / 2;
            if (n.left == null) {
                n.left = new Node(0);
            }
            if (n.right == null) {
                n.right = new Node(0);
            }
            if (n.lazy > 0) {
                n.left.reserved += n.lazy;
                n.left.lazy += n.lazy;

                n.right.reserved += n.lazy;
                n.right.lazy += n.lazy;
                n.lazy = 0;
            }
            return canBook(l, r, start, mid, n.left) && canBook(l, r, mid + 1, end, n.right);
        }

        public void book(int l, int r, int start, int end, Node n) {
            if (l > end || r < start) return;
            if (l <= start && end <= r) {
                n.reserved += 1;
                n.lazy += 1;
                return;
            }
            int mid = (start + end) / 2;
            book(l, r, start, mid, n.left);
            book(l, r, mid + 1, end, n.right);
            n.reserved = Math.max(n.left.reserved, n.right.reserved);
        }
    }

    static class MyCalendarTwo1 {
        // Using Segment Tree to handle the booking
        // This is a custom implementation of a segment tree to manage bookings
        // and check for triple bookings efficiently.
        Segment s;

        public MyCalendarTwo1() {
            s = new Segment();
        }

        public boolean book(int startTime, int endTime) {
            boolean canBook = s.canBook(startTime, endTime - 1, 0, 1000000000, s.root);
            if (canBook) {
                s.book(startTime, endTime - 1, 0, 1000000000, s.root);
            }
            return canBook;
        }
    }




    /*





        One more with tree




    */


    public static class MyCalendarTwo3 {
        // Using a custom tree structure to manage bookings
        // This implementation uses a binary tree to handle the booking intervals
        // and check for triple bookings efficiently.

        Tree root;

        private static class Tree {
            int beg;
            int end;
            int times;
            Tree left;
            Tree right;

            public Tree(int beg, int end) {
                this.beg = beg;
                this.end = end;
                this.times = 1;
            }

            public static boolean query(Tree node, int b, int e) {
                if (node == null) {
                    return true;
                }
                if (node.beg >= e) {
                    return query(node.left, b, e);
                }
                if (node.end <= b) {
                    return query(node.right, b, e);
                }
                if (node.times == 2) {
                    return false;
                }
                int l1 = Math.min(b, node.beg);
                int l2 = Math.max(b, node.beg);
                int r1 = Math.min(e, node.end);
                int r2 = Math.max(e, node.end);
                boolean re1 = true;
                if (l1 != l2) {
                    re1 = query(node.left, l1, l2);
                }
                boolean re2 = true;
                if (r1 != r2) {
                    re2 = query(node.right, r1, r2);
                }

                return re1 && re2;

            }

            public static Tree insert(Tree node, int b, int e) {
                if (node == null) {
                    return new Tree(b, e);
                }
                if (node.beg >= e) {
                    node.left = insert(node.left, b, e);
                    return node;
                }
                if (node.end <= b) {
                    node.right = insert(node.right, b, e);
                    return node;
                }
                int l1 = Math.min(b, node.beg);
                int l2 = Math.max(b, node.beg);
                int r1 = Math.min(e, node.end);
                int r2 = Math.max(e, node.end);
                node.beg = l2;
                node.end = r1;
                if (l1 != l2) {
                    node.left = insert(node.left, l1, l2);
                }
                if (r1 != r2) {
                    node.right = insert(node.right, r1, r2);
                }
                node.times++;
                return node;
            }
        }

        public MyCalendarTwo3() {

        }

        public boolean book(int start, int end) {
            if (root == null) {
                root = new Tree(start, end);
                return true;
            }
            if (!Tree.query(root, start, end)) {
                return false;
            }
            Tree.insert(root, start, end);
            return true;
        }

    }


}

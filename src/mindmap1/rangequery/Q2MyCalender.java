package mindmap1.rangequery;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

//729. My Calendar I
//        Medium
//Topics
//premium lock icon
//        Companies
//Hint
//You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a double booking.
//
//A double booking happens when two events have some non-empty intersection (i.e., some moment is common to both events.).
//
//The event can be represented as a pair of integers startTime and endTime that represents a booking on the half-open interval [startTime, endTime), the range of real numbers x such that startTime <= x < endTime.
//
//        Implement the MyCalendar class:
//
//        MyCalendar() Initializes the calendar object.
//        boolean book(int startTime, int endTime) Returns true if the event can be added to the calendar successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.
//
//
//        Example 1:
//
//        Input
//        ["MyCalendar", "book", "book", "book"]
//        [[], [10, 20], [15, 25], [20, 30]]
//        Output
//        [null, true, false, true]
//
//        Explanation
//        MyCalendar myCalendar = new MyCalendar();
//        myCalendar.book(10, 20); // return True
//        myCalendar.book(15, 25); // return False, It can not be booked because time 15 is already booked by another event.
//        myCalendar.book(20, 30); // return True, The event can be booked, as the first event takes every time less than 20, but not including 20.
//
//
//        Constraints:
//
//        0 <= start < end <= 109
//        At most 1000 calls will be made to book.
public class Q2MyCalender {

    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
//        System.out.println(myCalendar.book(10, 20)); // return True
//        System.out.println(myCalendar.book(15, 25)); // return False
//        System.out.println(myCalendar.book(20, 30)); // return True

        // [[],[47,50],[33,41],[39,45],[33,42],[25,32],[26,35],[19,25],[3,8],[8,13],[18,27]]
        System.out.println(myCalendar.book(47, 50)); // return True
        System.out.println(myCalendar.book(33, 41)); // return True
        System.out.println(myCalendar.book(39, 45)); // return False
        System.out.println(myCalendar.book(33, 42)); // return False
        System.out.println(myCalendar.book(25, 32)); // return True
        System.out.println(myCalendar.book(26, 35)); // return False
        System.out.println(myCalendar.book(19, 25)); // return True
        System.out.println(myCalendar.book(3, 8));   // return True
        System.out.println(myCalendar.book(8, 13));   // return True
        System.out.println(myCalendar.book(18, 27)); // return False

    }

    static class MyCalendar {
        private final List<int[]> bookings;

        public MyCalendar() {
            bookings = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (int[] booking : bookings) {
                if (start < booking[1] && end > booking[0]) {
                    return false; // Overlap detected
                }
            }
            bookings.add(new int[]{start, end});
            return true; // Booking successful
        }
    }

    // optimized
    static class MyCalendar1 {
        private final List<int[]> bookings;

        public MyCalendar1() {
            bookings = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (int[] booking : bookings) {
                if (start < booking[1] && end > booking[0]) {
                    return false; // Overlap detected
                }
            }
            bookings.add(new int[]{start, end});
            return true; // Booking successful
        }
    }

    // optimized with treemap
    static class MyCalendar2 {
        private TreeMap<Integer, Integer> bookings;

        public MyCalendar2() {
            bookings = new TreeMap<>();
        }

        public boolean book(int start, int end) {
            Integer prevEnd = bookings.floorKey(start);
            Integer nextStart = bookings.ceilingKey(start);

            if ((prevEnd != null && bookings.get(prevEnd) > start) || (nextStart != null && nextStart < end)) {
                return false; // Overlap detected
            }

            bookings.put(start, end);
            return true; // Booking successful
        }
    }
}

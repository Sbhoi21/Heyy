package a.precourse.foundationques;

public class Q10TimeConversionFromSec {

//    Time Conversion from Seconds
//    Write a program that converts a given number of seconds into hours, minutes, and remaining seconds.
//    The program takes an integer representing the total number of seconds as input and outputs the converted time in the format "HH:MM:SS".
//
//    Input Format:
//    The input consists of a single integer representing the total number of seconds.
//
//    Output Format:
//    The program outputs the converted time in the format "HH:MM:SS", where HH represents hours (00-23), MM represents minutes (00-59), and SS represents seconds (00-59).
//
//    Sample Input:
//            86399
//    Sample Output:
//            23:59:59
//    Constraints:
//            0 <= Total number of seconds <= 86399 (i.e., 23 hours, 59 minutes, and 59 seconds)
//    Explantion:
//    Input is 86399 seconds, which is equivalent to 23 hours, 59 minutes, and 59 seconds. The program converts this input to the output format "HH:MM:SS".

    public static void main(String[] args) {
        int totalSeconds = 86399; // Example input
        String time = convertSecondsToTime(totalSeconds);
        System.out.println(time); // Output: 23:59:59
    }

    public static String convertSecondsToTime(int totalSeconds) {
        int hours = totalSeconds / 3600; // Calculate hours
        int minutes = (totalSeconds % 3600) / 60; // Calculate minutes
        int seconds = totalSeconds % 60; // Calculate remaining seconds

        // Format the time as "HH:MM:SS"
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

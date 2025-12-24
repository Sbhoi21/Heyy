package a.precourse.foundationques;

public class Q1AverageMarks {

//    Average Marks
//    You are given the marks obtained by a student in five different subjects: Mathematics (M) , Science (S), English (E), History (H), and Computer Science (C).
//    The marks for each subject are integers in the range from 0 to 100 (both inclusive).
//
//    Write a program that takes the student's name (as a single character) and the marks for each subject as input.
//    Calculate the average of the given marks (round to the nearest integer) and print it along with the student's name.
//
//    Input:
//    The first line contains a single character representing the student's name (e.g., 'A', 'B', 'C', etc.).
//    The next line contains five integers separated by spaces, representing the marks obtained in Mathematics, Science, English, History, and Computer Science, respectively.
//    Output:
//    Print the student's name (single character) on the first line.
//    Print the integer part of the average marks (round to the nearest integer) on the second line.
//    Example:
//    Input:
//    A
//81 81 81 33 63
//    Output:
//    A
//68

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char studentName = 'A';
        int mathMarks = 81;
        int scienceMarks = 81;
        int englishMarks = 81;
        int historyMarks = 33;
        int computerScienceMarks = 63;

        // Calculate the average marks
        double averageMarks = (mathMarks + scienceMarks + englishMarks + historyMarks + computerScienceMarks) / 5.0;

        // Round to the nearest integer
        int roundedAverage = (int) Math.round(averageMarks);

        // Print the results
        System.out.println(studentName);
        System.out.println(roundedAverage);
    }



}

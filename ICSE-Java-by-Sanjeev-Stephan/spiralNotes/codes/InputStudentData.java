package spiralNotes.codes;

import java.util.Scanner;
/**
 * Real-Life Example Code-#6
 * File Name : InputStudentData.java
 * Class Name : InputStudentData
 * Description : Below Program uses different methods to read data of various types
 */
public class InputStudentData {
    public static void main(String[] args) {
        // Create a new Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompts user to input name
        System.out.print("Enter Student Name : ");
        // Input String Value
        String studentName = input.nextLine();

        System.out.print("Enter Student Roll No : ");
        int studentRollNum = input.nextInt();

        System.out.print("Enter Student Height (int ft) : ");
        double studentHeight = input.nextDouble();
        // Output the user's input values.
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Roll Number : " + studentRollNum);
        System.out.println("Student Height : " + studentHeight + " ft");
    }
}

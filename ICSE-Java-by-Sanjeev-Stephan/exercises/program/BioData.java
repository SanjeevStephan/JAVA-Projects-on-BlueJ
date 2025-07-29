package exercises.program;


/**
 * Question No : 19
 * Program : Design a program in Java to display the following information on the output screen 
 *           Name   : _____________
 *           Class  : _____________
 *           Rollno : _____________
 *           Subject: _____________
 *           School : _____________
 *
 * @author (Sanjeev Stephan)
 * @version (26-June-2025)
 */
public class BioData
{
    public static void main(String[] args)
    {
        String name = "Andy Anderson";
        String fatherName = "IX";
        String dob = "01-January-2000";
        char bloodGroup = 'A';
        int aadhaarNo = 123456789;
        String state = "Jharkhand";
        
        System.out.println("Name : " + name);
        System.out.println("Class : " + fatherName);
        System.out.println("Date of Birth : " + dob);
        System.out.println("Aadhaar No : " + aadhaarNo);
        System.out.println("State : " + state);
    }
}

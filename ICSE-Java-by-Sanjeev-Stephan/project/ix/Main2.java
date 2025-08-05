/**
    Program No : 00
    Program Title : Main
    Description :  This is the entry point of a Java program.
                   When you run a Java application, execution starts from this method.
 */
package project.ix;
// Java Classes from the package : project.ix.chapter4
import project.ix.chapter4.StudentBioData;
import project.ix.chapter4.CalculateSum;
import project.ix.chapter4.AreaOfSquare;
import project.ix.chapter4.CalculateGST;
import project.ix.chapter4.CalculateDiscount;
// Java Classes from the package : project.ix.chapter6
import project.ix.chapter6.FindDiagonalOfSq;
import project.ix.chapter6.FindSmallestNum;
import project.ix.chapter6.InputAndFindSmallestNum;
import project.ix.chapter6.FindCube;
import project.ix.chapter6.FindValueOfExpression;
import project.ix.chapter6.FindVelocity;
// Java Classes from the package : project.ix.chapter7
import project.ix.chapter7.SecondSmallestNum;
import project.ix.chapter7.GradeTheStudent;
import project.ix.chapter7.RectangleMenu;
import project.ix.chapter7.ElectricityBill;

public class Main2 
{
    public static void main(String[] args) 
    {
        System.out.println("---[ 01. Student Bio-Data ]---");
        StudentBioData.displayStudentBioData("Sanjeev Stephan"); // Write your own name here

        System.out.println("---[ 02. Add Two Numbers ]---");
        CalculateSum.inputAndDisplaySum();     //calling method() from class CalculateSum

        System.out.println("---[ 03. Area of Square ]---");
        AreaOfSquare.displaySquareArea();   //calling method() from class AreaOfSquare

        System.out.println("---[ 04. Goods & Service Tax ]---");
        CalculateGST.calculateGST(10000);  //calling method() from class AreaOfSquare

        System.out.println("---[ 05. Discounts ]---");
        CalculateDiscount.calculateDiscount();  //calling method() from class AreaOfSquare

        System.out.println("---[ 06. Diagonal of Square ]---");
        FindDiagonalOfSq.calculateDiagonal(); //calling method() from class FindDiagonalOfSq

        System.out.println("---[ 07. Display Smallest Number ]---");
        FindSmallestNum.findSmallestNum(12,16,19); //calling method() from class FindSmallestNum

        System.out.println("---[ 08. Find Smallest Number ]---");
        InputAndFindSmallestNum.inputAndFind();

        System.out.println("---[ 09. Find Side of Cube ]---");
        FindCube.displayCube(); //calling method() from class FindCube

        System.out.println("---[ 10. Find Value of Expression ]---");
        FindValueOfExpression.findExpression(); //calling method() from class FindVelocity

        System.out.println("---[ 11. Find Velocity ]---");
        FindVelocity.calculateVelocity(); //calling method() from class FindVelocity

        System.out.println("---[ 12. Display Second Smallest Number ]---");
        SecondSmallestNum.find2ndSmallestNum();

        System.out.println("---[ 13. Display Student Grades ]---");
        GradeTheStudent.displayGrades();

        System.out.println("---[ 14. Calculate Rectangle ]---");
        RectangleMenu.solveRectangle();

        System.out.println("---[ 15. Calculate Electricity Bill ]---");
        ElectricityBill.calculateBill();



    }
}

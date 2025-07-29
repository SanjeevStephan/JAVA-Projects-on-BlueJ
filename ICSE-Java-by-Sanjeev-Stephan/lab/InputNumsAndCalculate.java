package lab;


/**
 * Write a description of class InputNumAndCalculate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class InputNumsAndCalculate
{

    public static void main(String[] args)
    {
        int a, b, choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = input.nextInt();
        System.out.print("Enter Second Number : ");
        b = input.nextInt();
        System.out.println("------Calculate----");
        System.out.println("1. Add");
        System.out.println("2. Substract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide ");

        System.out.println("Choose Option to select Option (1-4) : ");
        choice = input.nextInt();
        
        switch(choice)
        {
            case 1 : 
                System.out.println(a + b);
                break;
            case 2 : 
                System.out.println(a - b );
                break;
            case 3 : 
                System.out.println(a * b);
                break;
            case 4 :
                System.out.println(a / b);
                break;
            default : 
                System.out.println("Wrong Choice!");
                break;
        }
    }
}

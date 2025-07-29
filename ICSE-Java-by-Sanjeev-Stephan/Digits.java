
/**Chapter : 05 (Input in Java)
 * Page No : 114
 * Program No : 4
 * Program Title : Write a Program to input a three digit number and display all the digits by using arithmetical operators
 * @author (Sanjeev Stephan Murmu)
 * @version (19th-July-2025)
 */

// A program to display all the digits of a three digit number
public class Digits
{
    static int h,t,u,d;
    static void display()
    {
          System.out.println("Divided by 100 : " + h);   
          System.out.println("Divided by 10 : " + h);   
    }
    
    public static void main(int num)
    {
     
        h = num / 100;
        d = num / 10;
        t = d%10;
        u = num%10;
        System.out.println("The digits are : ");
        System.out.println(h);
        System.out.println(t);
        System.out.println(u);
        
        //display();
    }
    
 
}

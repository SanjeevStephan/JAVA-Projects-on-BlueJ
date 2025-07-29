

/**
 * Chapter : 4 | Operators In Java
 * Page No : 99
 * Program No : 03
 * Program Title : Write a program in Java to find the area, perimeter and the diagonal of a square. 
 *                 Display the output of the program by taking side of a square as 25.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    public static void main(String[] args)
    {
        int s, ar=0, p=0;
        double d=0.0;
        s = 25;
        ar = s * s;
        p = 4 * s;
        d = Math.sqrt(2) * s;
        System.out.println("The area of Square = " + ar);
        System.out.println("The perimeter of square = " + p);
        System.out.println("THe diagonal of square = " + d);
    }
}

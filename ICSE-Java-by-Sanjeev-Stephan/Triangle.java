
/**
 * Page No : 112
 * Program No : 1
 * Program Title : Write a program in Java to find and display the area and perimeter of a right-angled triangle by using function argument.
 *                 Take perpendicular and base as inputs from the console.
 * @author (Sanjeev Stephan Murmu)
 * @version (27th-June-2025)
 */
public class Triangle
{
    public static void main(int perimeter, int base)
    {
        double d, area = 0, peri = 0 ;
        d = Math.sqrt(perimeter * perimeter + base * base );
        area = 1.0 / 2.0 * perimeter * base;
        peri = ( perimeter + base + d );
        
        System.out.println("The Area = " + area );
        System.out.println("The Perimeter = " + peri);
        
        
        
    }
        
}


/**Chapter : 05 (Input in Java)
 * Page No : 112
 * Program No : 1
 * Program Title : Write a Program in Java to find and display the sum and average of three numbers by using function argument
 * @author (Sanjeev Stephan Murmu)
 * @version (27th-June-2025)
 */
public class Average
{
    public static void main(int a, int b, int c)
    {
        int sum = 0;
        double average = 0.0;
        sum = ( a + b + c);
        average = sum/3.0;
        System.out.println(" The Sum = "  + sum);
        System.out.println("The Average = " + average);
    }
}

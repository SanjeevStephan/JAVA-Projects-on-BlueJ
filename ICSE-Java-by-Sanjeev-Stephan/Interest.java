
/**
 * Page No : 112
 * Program No : 1
 * Program Title : Write a program in Java to find and display the simple interest and amount by using the function argument when Principal, Interest and Time are input from the console.
 * @author (Sanjeev Stephan Murmu)
 * @version (27th-June-2025)
 */
public class Interest
{
    public static void main(int principle, int rate, int time)
    {
        double simpleInterest = 0, amount = 0;
        simpleInterest = ( principle * rate * time) / 100.0; 
        amount = principle + simpleInterest;
        
        System.out.println("The Simple Interest = " + simpleInterest);
        System.out.println("The Amount = " + amount);
    }
}

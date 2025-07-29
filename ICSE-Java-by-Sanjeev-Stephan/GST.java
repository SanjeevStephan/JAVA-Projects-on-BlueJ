
/**
 * Page No : 99
 * Program No : 4
 * Program Title : A shopkeeper sells an article for Rs 10,000. 
 *                 If the rate of tax under GST is 10%, calculate and display the tax and the amount paid by the Customer. 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GST
{
    public static void main(String[] args)
    {
        int price = 10000;
        double gst, amount;
        gst = price * 10.0/100.0;
        amount = price + gst;
        System.out.println("GST = " + gst);
        System.out.println("Amount to Pay = " + amount);
    }
}

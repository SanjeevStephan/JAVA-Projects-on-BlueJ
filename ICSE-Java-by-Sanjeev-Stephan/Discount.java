
/**
 * Page No : 100
 * Program No : 5
 * Program Title : A dealer allows his customer two successive discounts of 20% and 10%. 
 *                 If the article costs Rs 72,000, calculate and display the selling price and the total discounts given by the dealer.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Discount
{
    public static void main(String[] args)
    {
        int costPrice = 7200;
        double d1, d2, discount, amount;
        d1 = costPrice * 20.0/100.0;
        d2 = (costPrice - d1) * 10.0/100.0;
        discount = d1 + d2;
        amount = costPrice - discount;
        System.out.println("Total Discount = " + discount);
        System.out.println("Amount to pay = " + amount);
    }
}

package lab;


/**
 * Write a description of class IfStatement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IfStatement
{
    public static void main(String[] args)
    {
        int a = 155;
        int b = 1255;
        
        if( a >  b)  // here a is greater than b
        {  // This is display if the conditiosn is TRUE
            System.out.println("a is greater than b");
        }
        else if ( a < b )
        {
            System.out.println("a is lesser than b");
        }
        else if ( b > a )  // here b is greater than a 
        {    // if the conditiosn is FALSE this is display
            System.out.println("b is greater than a");
        }
        else 
        {
            System.out.println("b is lesser than a");
        }

    }
}

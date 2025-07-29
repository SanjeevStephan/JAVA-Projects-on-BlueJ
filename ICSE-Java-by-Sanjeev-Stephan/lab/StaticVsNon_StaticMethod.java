package lab;


/**
 * Write a description of class StaticVsNon_StaticMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaticVsNon_StaticMethod
{
    static void ThisIsStaticMethod()
    {
        System.out.println("This method can be called directly without creating an object");
    }
    
    void ThisisNonStaticMethod()
    {
        System.out.println("This method can only be called by creating an object of the class");
    }
    
    
    public static void main(String[] args)
    {
        ThisIsStaticMethod();  //  can be called directly
        
        // Creating an object of the class
        StaticVsNon_StaticMethod myobj = new StaticVsNon_StaticMethod();
        myobj.ThisisNonStaticMethod();
    }
}

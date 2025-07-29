package lab;


/**
 * Write a description of class GlobalScope here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GlobalScope
{
    static String name;  // declaring a variable 
    
    public static void Greeting()
    {
         name = "Sanjeev"; // Initialization
         System.out.println("From Method Greeting() : " + name);
       
    }
    
    public static void main(String[] args)
    {
        name = "Stephan";
        System.out.println("From Main() method : " + name);
        
        Greeting();
    }
   
}

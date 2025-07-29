package lab;


/**
 * Write a description of class MyStaticMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStaticMethod
{
    
     
     static void MyMethod()
     {
         System.out.println("This is a static method");
     }
     
     void MyNonStaticMethod()
     {
        System.out.println("This is a static method");
     }
     
     
     public static void main(String[] args)
     {
    
         MyMethod();
        
         // Creating an object of the class
         MyStaticMethod myobj = new MyStaticMethod();
         myobj.MyNonStaticMethod();
         
        
         
     }
     
}

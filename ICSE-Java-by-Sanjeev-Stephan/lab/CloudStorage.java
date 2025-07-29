package lab;


import java.util.Scanner;

public class CloudStorage
{
    // Memeber Variables
    int acno; // declaring a variable
    int space;
    double bill;
    
    CloudStorage()
    {
       acno = 0; 
       System.out.println("Constructor is called now");
    }
    
    // Member Methods
    void accept() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number : " );
        acno = input.nextInt();
        System.out.println("Enter your storage space : " );
        space = input.nextInt();
        System.out.println("Your account number is :  " + acno);
        System.out.println("Your storage space is : " + space + " GB");
        input.close(); 
    }
    
    void calculate()
    {
        if(space <= 15)
        {
            bill = space * 15;
        }
        else if(space <= 30)
        {
            bill = 15 * 15 + (( space - 15 ) * 13 );
        }
        else if (space > 30)
        {
            bill = 15 * 15 + 15 * 13 + ((space - 30) * 11);
        }
        
    }
    void display()
    {
        System.out.println("Account No : " + acno);
        System.out.println("Storage No : " + space + " GB");
        System.out.println("Bill : " + bill);
    }
    
    public static void main(String[] args)
    {
        
        // Create an object of the  class 
        // Syntax : <classname> <objectname> = new <classname>();  i cacn tyep anything. just to explain
       
        CloudStorage myobj = new CloudStorage();
        myobj.accept();
        myobj.calculate();
        myobj.display();
        
        
    }
}

package spiralNotes;


/**
 * Write a description of class AccessClassVariablesMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Car 
{
    String brand = "Audi";
    
    void start()
    {
        System.out.println("Car is Starting");
    }
}


public class AccessClassVariablesMethods
{
    public static void main(String[] args)
    {
        Car car = new Car();
        System.out.println(car.brand);
        car.start();
    }
}

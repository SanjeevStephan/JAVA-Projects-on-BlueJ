package spiralNotes.java.oop;

class Animal {
    String animalName = "This Animal";
    void wakesUp()
    {
        System.out.println(animalName + " everyday Behaviours");
        System.out.println(animalName + " wakes up");
    }

    void eat() {
        System.out.println(animalName + " eats food.");
    }

    void sleep() {
        System.out.println(animalName + " sleeps.\n");
    }

    void makeSound() {
        System.out.println("This animal makes a sound.");
    }

}

class Dog extends Animal
{
    @Override
    void makeSound() {
        System.out.println("Dog Makes Barks Sounds");
    }
}

// Cat class overrides makeSound
class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat Makes Meow Sounds");
    }
}

public class JavaInheritance {

    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Call the wakesUp(), eat() and sleep() method (from the Animal class) on the dog object
        myDog.animalName = "My Dog";
        myDog.wakesUp();
        myDog.eat();
        myDog.makeSound(); // Calls Dog's version
        myDog.sleep();

        myCat.animalName = "My Cat";
        myCat.wakesUp();
        myCat.eat();
        myCat.makeSound(); // Calls Cat's version
        myCat.sleep();

    }
}

package spiralNotes.java.basics;

public class SimpleClass {

    int x ;

    public static void main(String[] args) {
        SimpleClass myObj1 = new SimpleClass();
        SimpleClass myObj2 = new SimpleClass();

        myObj1.x = 10;
        myObj2.x = 101;

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

    }

}

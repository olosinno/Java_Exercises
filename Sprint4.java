import java.util.ArrayList;

public class Sprint4 {
    public static void main (String[] args) throws CloneNotSupportedException {
        Clyde_template Clyde2 = new Clyde_template(); // Creates Clyde2 from Clyde_template.
        Clyde_template Clyde3 = (Clyde_template)Clyde2.clone(); // Creates deep clone Clyde3 from Clyde2.
        Clyde2.age = 20;
        Clyde2.greeting = "Hey, I'm Clyde.";
        Clyde3.age = 5;
        Clyde3.greeting = "Hey, I'm Cwyde!";

        System.out.println("Age " + Clyde2.age + ". " + Clyde2.greeting);
        System.out.println("Age " + Clyde3.age + ". " + Clyde3.greeting);
    }
} // Finished in ?:??

class Clyde_template implements Cloneable { // class uses Cloneable interface, 
    int age = 30;
    String greeting = "Hi, I'm Clyde!";

    public Object clone() throws CloneNotSupportedException { // Using clone() method, clone two objects to have the same integer and string value.
        try {
            return super.clone(); // creates clone constructor/object for use
        }
        catch (CloneNotSupportedException e) {
			System.out.println (" Cloning not allowed. " );
            return this;
        }
    }
}

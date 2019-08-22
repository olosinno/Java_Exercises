public class Sprint10 implements Garage {
    public void square(int car) { System.out.print("How many cars are in your garage?  " + car*car); } // Implements methods square (abstract) and show from Garage.
    public static void main (String[] args) { // Using default methods, create a program portray how many cars are in a garage.
        Sprint10 coupe = new Sprint10();
        coupe.square(2);
        coupe.show();
    }
} // Finished in ?:??

interface Garage {
    public void square(int car); // abstract method establishes int car value
    default void show() {
        /*if (square(car) > 2)*/ System.out.println("\nWow, that's alotta cars!");
    }
}

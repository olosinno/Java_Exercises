import java.util.Arrays;
import java.util.List;

//@FunctionalInterface
//interface Iterate {}

public class Sprint14 {
    public static void main (String[] args) { // Using array and list libraries, make a program that iterates through ten characters in a list using lambda expression and method references.
        List <String> alphabet = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
        /* This uses Lambda expression. */
        long start = System.currentTimeMillis();
        alphabet.stream().forEach(x ->  System.out.print(x)); // Lambda expressions are much quicker.
        long end = System.currentTimeMillis();
        System.out.println(" Time " + (end-start));
        /* This uses method referencing. */
        long start2 = System.currentTimeMillis();
        alphabet.stream().forEach(x ->  System.out.print(x));
        long end2 = System.currentTimeMillis();
        System.out.println(" Time " + (end2-start2));
    }
} // Finished in ?:??

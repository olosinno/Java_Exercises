import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class Sprint13 {
    public static void main (String[] args) { // Reverse words using a string while still preserving whitespace and initial word order.
        System.out.println("Enter string to reverse:");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        Solution reversed = new Solution(); // Object reversed is a new class Object. Referenced an Object of class Solution.
        String returned_string = reversed.reverseWords(str); // Make reversed String with class' instance method. Reverse user String
//        for(int i = str.length() - 1; i >= 0; i--) reverse = reverse + str.charAt(i); // Use a foor loop to iterate backwards through a character list and add to String reverse.
        
        System.out.println("Reversed string is: " + returned_string);

        read.close();
    }
} // Finished in ?:??

class Solution {
    public String reverseWords(String s) { // Parameter doesn't leave its class' method and will only work there.
        return Arrays.stream(s.split(" ")).map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.joining(" "));
    }
}

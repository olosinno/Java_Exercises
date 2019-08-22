public class Sprint11 {

    public static void main(String[] args) { // Create a lambda expression which models an anonymous class.
        /* First we create our anonymous class. */
        PrintName printUserNameLambda = (String firstName, String lastName) -> { return String.format("%s %s", firstName, lastName); };
        System.out.println(printUserNameLambda.printUserName("Abraham", "Pierrot"));
    }
} // Finished in ?:??

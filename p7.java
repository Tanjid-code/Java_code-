// Main class containing the entry point of the program
public class p7 {

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Creating an instance of OverloadPart
        OverloadPart m = new OverloadPart();

        // Calling the overloaded methods
        m.MathOperation();            // No arguments
        m.MathOperation(7, 1);        // Two integer arguments
        m.MathOperation(1, 4, 0);     // Three integer arguments
        m.MathOperation(3.0f, 7.1f);  // Two float arguments
    }
}
// Class containing overloaded methods
class OverloadPart {

    // Method with no arguments
    void MathOperation() {
        System.out.println("Nothing to print.");
    }

    // Method with two integer arguments
    void MathOperation(int a, int b) {
        System.out.println("Result is " + (a - b));
    }

    // Method with three integer arguments
    void MathOperation(int a, int b, int c) {
        System.out.println("Result is " + (a + b + c));
    }

    // Method with two float arguments
    void MathOperation(float a, float b) {
        System.out.println("Result is " + (a * b));
    }
}
import java.util.Scanner; // Import the Scanner class for taking user input

class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt user to enter the first value and read the input
        System.out.println("Enter the first value :");
        int a = sc.nextInt();

        // Prompt user to enter the second value and read the input
        System.out.println("Enter the second value :");
        int b = sc.nextInt();

        // Perform and display the addition of the two values
        System.out.println("The addition of two values is : " + (a + b));

        // Perform and display the subtraction of the two values
        System.out.println("The subtraction of two values is : " + (a - b));

        // Perform and display the multiplication of the two values
        System.out.println("The multiplication of two values is : " + (a * b));

        // Perform and display the division of the two values
        System.out.println("The division of two values is : " + (a / b));
    }
}

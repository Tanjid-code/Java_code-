import java.util.Scanner; // Import the Scanner class for taking user input

class p4 { // Declare the class named 'p4'
    public static void main(String[] args) { // The main method where the program execution begins
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt user to enter the number and read the input
        System.out.println("Enter the number:");
        int a = sc.nextInt(); // Read the integer value representing the number
        int flag = 0; // Initialize a flag variable to indicate if the number is prime

        // Check if the number is 1
        if (a == 1) {
            flag = 1; // Set flag to 1 if the number is 1, since 1 is not a prime number
        } else {
            // Check for factors from 2 to a-1
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    flag = 1; // Set flag to 1 if a factor is found
                    break; // Exit the loop early if a factor is found
                }
            }
        }

        // Print the result
        if (flag == 0) {
            System.out.println("The number is a prime number."); // Print if the number is prime
        } else {
            System.out.println("The number is not a prime number."); // Print if the number is not prime
        }
    }
}

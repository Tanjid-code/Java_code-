import java.util.Scanner; // Import the Scanner class for taking user input

class p3 { // Declare the class named 'p3'
    public static void main(String[] args) { // The main method where the program execution begins
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt user to enter the year and read the input
        System.out.println("Enter the year : ");
        int a = sc.nextInt(); // Read the integer value representing the year

        // Check if the year is a leap year
        // A year is a leap year if it is divisible by 4 and not divisible by 100,
        // or it is divisible by 400
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println("This is a leap year."); // Print if the year is a leap year
        } else {
            System.out.println("Not a leap year."); // Print if the year is not a leap year
        }
    }
}

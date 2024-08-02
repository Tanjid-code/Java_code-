import java.util.Scanner;

public class p5c { // Class name reflects the program's purpose

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt(); // More descriptive variable name

        // Print the upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars (decreasing for upper half)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars (increasing for upper half)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }

        // Print the lower half of the diamond
        for (int i = 1; i <= rows - 1; i++) {
            // Print spaces before stars (increasing for lower half)
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Print stars (decreasing for lower half)
            for (int j = 1; j <= 2 * (rows - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }

        sc.close(); // Close the scanner resource (optional)
    }
}

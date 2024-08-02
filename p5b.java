import java.util.Scanner;

class p5b { 
    public static void main(String[] args) { 
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); 

        int i, j;

        // Prompt the user to enter the size of the pattern
        System.out.println("Enter the size :");
        int a = sc.nextInt(); 

        // Outer loop to handle the number of rows
        for(i = 1; i <= a; i++) {
            // Inner loop to handle the number of spaces before the stars
            for (j = 2 * (a - i); j >= 0; j--) {  
                System.out.print(" ");   
            }   

            // Inner loop to handle the number of stars in each row
            for(j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after printing each row
            System.out.println();  
        }
        
        // Close the scanner object
        sc.close();
    }
}

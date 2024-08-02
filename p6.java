// Superclass Tanjid
class Tanjid {
    int school = 4000;    // Variable to store school fees
    int coaching = 3500;  // Variable to store coaching fees
}

// Subclass p6 which extends Tanjid
public class p6 extends Tanjid {
    int privateFees = 2000;  // Variable to store private fees

    // Constructor for p6
    public p6() {
        super();  // Call the constructor of the superclass Tanjid
        this.privateFees = 2000;  // Use 'this' keyword to refer to the instance variable privateFees
    }

    public static void main(String[] args) {
        p6 t = new p6();  // Create an instance of the subclass p6

        // Accessing and printing the variables from both the superclass and subclass
        System.out.println("Tanjid's school fees: " + t.school);
        System.out.println("Tanjid's coaching fees: " + t.coaching);
        System.out.println("Tanjid's private fees: " + t.privateFees);
    }
}

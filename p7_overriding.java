// Main class to demonstrate the functionality of the Student class
public class p7_overriding {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student s1 = new Student();

        // Setting the attributes of the student
        s1.name = "Tanjid";          // Setting the name of the student
        s1.gender = "Male";          // Setting the gender of the student
        s1.age = 22;                 // Setting the age of the student
        s1.department = "CSE";       // Setting the department of the student
        s1.batch = 21;               // Setting the batch year of the student
        s1.id = 40;                  // Setting the ID of the student

        // Displaying the details of the student
        s1.show();
    }
}

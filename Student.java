// Class representing a student, which is a subclass of Person
public class Student extends Person {
    // Attributes specific to the Student class
    String department;  // Department of the student
    int batch;  // Batch year of the student
    int id;  // ID of the student

    // Overriding the show method from the Person class to include additional details
    @Override
    void show() {
        // Printing the name of the student (inherited from Person)
        System.out.println("Name : " + name);
        // Printing the gender of the student (inherited from Person)
        System.out.println("Gender : " + gender);
        // Printing the age of the student (inherited from Person)
        System.out.println("Age : " + age);
        // Printing the department of the student
        System.out.println("Department : " + department);
        // Printing the batch year of the student
        System.out.println("Batch : " + batch);
        // Printing the ID of the student
        System.out.println("Id : " + id);
    }
}

package StudentManagement.models;

/**
 * Student class to represent a student with an ID and name.
 */
public class Student {
    // Attributes for Student class
    private String id;
    private String name;

    /**
     * Constructor to initialize Student object with id and name.
     * @param id The unique identifier for the student.
     * @param name The name of the student.
     */
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get the student ID.
     * @return The student ID.
     */
    public String getId() {
	return id;
    }

    /**
     * Get the student name.
     * @return The student name.
     */
    public String getName(){
	return name;
    }

    /**
     * String representation of the Student object.
     * @return A string containing student ID and name.
     */
    public String toString() {
	return ("Student ID: " + id + ", Student Name: " + name + ".");
    }
}

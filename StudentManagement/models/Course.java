package StudentManagement.models;

/**
 * Course class to represent a course with a code and title.
 */
public class Course {
    // Attributes for Course class
    private String code;
    private String title;

    /**
     * Constructor to initialize Course object with code and title.
     * @param code The unique code for the course.
     * @param title The title of the course.
     */ 
    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    /**
     * Get the course code.
     * @return The course code.
     */
    public String getCode(){
	    return code;
    }

    /**
     * Get the course title.
     * @return The course title.
     */
    public String getTitle() {
	    return title;
    }

    /**
     * String representation of the Course object.
     * @return A string containing course title and code.
     */
    public String toString() {
	    return "Course Title: " + title + " Course Code " + code + ".";
    }
}

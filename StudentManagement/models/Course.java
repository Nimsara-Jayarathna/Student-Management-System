package StudentManagement.models;

import StudentManagement.mainapp.Main;
import StudentManagement.models.Course;
import StudentManagement.services.EnrollmentManager;

public class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
    
    public String getCode(){
	    return code;
    }

    public String getTitle() {
	    return title;
    }

    public String toString() {
	    return "Course Title: " + title + " Course Code " + code + ".";
    }
}

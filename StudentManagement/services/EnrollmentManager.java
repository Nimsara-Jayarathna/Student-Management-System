package StudentManagement.services;

import StudentManagement.models.Student;
import StudentManagement.models.Course;

public class EnrollmentManager {
    private Student[] students = new Student[100];
    private Course[] courses = new Course[50];

    private boolean [][] enrollmentMatrix = new boolean[100][50];
    private int studentCount = 0;
    private int coursecount = 0;

    


}
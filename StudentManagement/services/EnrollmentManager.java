package StudentManagement.services;

import StudentManagement.models.Student;
import StudentManagement.models.Course;
import java.util.Scanner;

public class EnrollmentManager {
    Scanner sc = new Scanner(System.in);
    private Student[] students = new Student[100];
    private Course[] courses = new Course[50];

    private boolean [][] enrollmentMatrix = new boolean[100][50];
    private int studentCount = 0;
    private int courseCount = 0;

    public int getStudentCount() {
        return studentCount;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void addStudent(String id, String name) {
        students[studentCount] = new Student(id, name);
        studentCount++;
        System.out.println("Student added successfully: " + students[studentCount - 1].toString());
    }

    public void addCourse(String code, String title) {
        courses[courseCount] = new Course(code, title);
        courseCount++;
        System.out.println("Course added successfully: " + courses[courseCount - 1].toString());
    }

    public void enrollStudentToCourse() {
        if ((studentCount == 0 ) || (courseCount == 0)) {
		    System.out.println("No Students or Courses available to enroll.");
			return;
		}
		for ( int i = 0; i < studentCount; i++) {
			System.out.println((i + 1) + ". " + students[i].toString());
		}
		System.out.print("Select the number which the student details are displayed");
		int studentIndex = sc.nextInt(); sc.nextLine();
		studentIndex--; // Adjust for zero-based index
		while (studentIndex < 0 || studentIndex >= studentCount) {
			System.out.println("Invalid student selection. PLease enter again: ");
			studentIndex = sc.nextInt(); sc.nextLine();
			studentIndex--; // Adjust for zero-based index
		}
		for ( int i = 0; i < courseCount; i++) {
			System.out.println((i + 1) + ". " + courses[i].toString());
	    }
		System.out.print("Select the number which the course details are displayed");
		int courseIndex = sc.nextInt(); sc.nextLine();
		courseIndex--; // Adjust for zero-based index
		while (courseIndex < 0 || courseIndex >= courseIndex) {
			System.out.println("Invalid course selection. PLease enter again: ");
			courseIndex = sc.nextInt(); sc.nextLine();
			courseIndex--; // Adjust for zero-based index
		}
        enrollmentMatrix[studentIndex][courseIndex] = true; 
        System.out.println("Student " + students[studentIndex].getName() + " enrolled in course " + courses[courseIndex].getTitle() + " successfully.");
    }

}
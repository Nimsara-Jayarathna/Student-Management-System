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

    public void InitilizeEnroller(){
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 50; j++) {
                enrollmentMatrix[i][j] = false;
            }
        }
    }

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
			System.out.println("Invalid student selection. Please enter again: ");
			studentIndex = sc.nextInt(); sc.nextLine();
			studentIndex--; // Adjust for zero-based index
		}
		for ( int i = 0; i < courseCount; i++) {
			System.out.println((i + 1) + ". " + courses[i].toString());
	    }
		System.out.print("Select the number which the course details are displayed");
		int courseIndex = sc.nextInt(); sc.nextLine();
		courseIndex--; // Adjust for zero-based index
		while (courseIndex < 0 || courseIndex >= courseCount) {
			System.out.println("Invalid course selection. Please enter again: ");
			courseIndex = sc.nextInt(); sc.nextLine();
			courseIndex--; // Adjust for zero-based index
		}
        enrollmentMatrix[studentIndex][courseIndex] = true; 
        System.out.println("Student " + students[studentIndex].getName() + " enrolled in course " + courses[courseIndex].getTitle() + " successfully.");
    }

    public void listEnrollments() {
        for ( int i = 0; i < studentCount; i++) {
            System.out.println("Enrolled Courses of " + students[i].getName() + ":");
            for (int j = 0; j < courseCount; j++) {
                if (enrollmentMatrix[i][j]) {
                    System.out.println(courses[j].toString());
                }
            }
        }
    }

    public void searchStudentById(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                System.out.println("Student found: " + students[i].toString());
                return;
            }
        }
        System.out.println("No student found with ID: " + id);
    }

    public void searchCourseByCode(String code) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getCode() == code) {
                System.out.println("Course found: " + courses[i].toString());
                return;
            }
        }
        System.out.println("No course found with code: " + code);
    }
}
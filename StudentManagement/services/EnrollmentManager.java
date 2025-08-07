package StudentManagement.services;

import StudentManagement.models.Student;
import StudentManagement.models.Course;
import java.util.Scanner;

/**
 * EnrollmentManager class to manage student and course enrollments.
 * This class provides methods to add students and courses, enroll students in courses,
 */
public class EnrollmentManager {
    Scanner sc = new Scanner(System.in);
    // Arrays to hold students, courses, and enrollment status
    private Student[] students = new Student[100];
    private Course[] courses = new Course[50];
    private boolean [][] enrollmentMatrix = new boolean[100][50];
    // Counters for the number of students and courses
    // These counters will help in managing the limits of students and courses, and the indexing of the arrays.
    private int studentCount = 0;
    private int courseCount = 0;

    /**
     * Method to initialize the enrollment manager.
     * This method sets up the enrollment matrix to false, indicating no enrollments initially.
     */
    // This method is called at the start of the program to ensure that the enrollment matrix is definded false.
    // Which means that every student is not enrolled to any course in the beginning.
    public void InitilizeEnroller(){
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 50; j++) {
                enrollmentMatrix[i][j] = false;
            }
        }
    }

    /**
     * Get the count of students.
     * @return The number of students enrolled.
     */
    public int getStudentCount() {
        return studentCount;
    }

    /**
     * Get the count of courses.
     * @return The number of courses available.
     */
    public int getCourseCount() {
        return courseCount;
    }

    /**
     * Add a new student to the system.
     * @param id The unique identifier for the student.
     * @param name The name of the student.
     */
    public void addStudent(String id, String name) {
        students[studentCount] = new Student(id, name);
        studentCount++;
        System.out.println("Student added successfully: " + students[studentCount - 1].toString());
    }

    /**
     * Add a new course to the system.
     * @param code The unique code for the course.
     * @param title The title of the course.
     */
    public void addCourse(String code, String title) {
        courses[courseCount] = new Course(code, title);
        courseCount++;
        System.out.println("Course added successfully: " + courses[courseCount - 1].toString());
    }

    /**
     * Enroll a student to a course.
     * This method allows a student to be enrolled in a specific course.
     * It checks if there are available students and courses before proceeding.
     */
    public void enrollStudentToCourse() {
        if ((studentCount == 0 ) || (courseCount == 0)) {
		    System.out.println("No Students or Courses available to enroll.");
			return;
		}
		for ( int i = 0; i < studentCount; i++) {
			System.out.println((i + 1) + ". " + students[i].toString());
		}
		System.out.print("Select the number which the student details are displayed: ");
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
		System.out.print("Select the number which the course details are displayed: ");
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

    /**
     * List all students.
     * This method prints the details of all enrolled students.
     */
    public void listStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].toString());
        }
    }

    /**
     * List all courses.
     * This method prints the details of all available courses.
     */
    public void listCourses() {
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].toString());
        }
    }

    /**
     * List all enrollments.
     * This method prints the courses each student is enrolled in.
     */
    public void listEnrollments() {
        int check = 0;
        for ( int i = 0; i < studentCount; i++) {
            check = 0;
            System.out.println("Enrolled Courses of " + students[i].getName() + ":");
            for (int j = 0; j < courseCount; j++) {
                if (enrollmentMatrix[i][j]) {
                    check = 1;
                    System.out.printf("\t" + courses[j].toString() + "\n");
                }
            }
            if (check == 0) {
                System.out.printf("\tNo courses enrolled.\n");
            }
        }
    }

    /**
     * Search for a student by ID.
     * @param id The unique identifier of the student to search for.
     */
    public void searchStudentById(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(id)) {
                System.out.println("Student found: " + students[i].toString());
                return;
            }
        }
        System.out.println("No student found with ID: " + id);
    }

    /**
     * Search for a course by code.
     * @param code The unique code of the course to search for.
     */
    public void searchCourseByCode(String code) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getCode().equals(code)) {
                System.out.println("Course found: " + courses[i].toString());
                return;
            }
        }
        System.out.println("No course found with code: " + code);
    }
    
    /**
     * Sort students by name using bubble sort.
     * @param count The number of students to sort.
     */
    public void sortStudentsByName(int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
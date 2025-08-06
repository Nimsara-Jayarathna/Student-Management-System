package StudentManagement.mainapp;

import StudentManagement.models.Student;
import StudentManagement.models.Course;
import StudentManagement.services.EnrollmentManager;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Student Management System");
		Student[] students = new Student[100];
		Course[] courses = new Course[50];
		int studentCount = 0;
		int courseCount = 0;
		int opt,opt1;
		while(true) {
			System.out.println("1. Enroll");
			System.out.println("2. List");
			System.out.println("3. Search");
			System.out.println("4. Exit");
			System.out.print("Enter the option to select: ");
			opt = sc.nextInt(); sc.nextLine();
			while ((opt < 1) && (opt > 4)) {
				/**
				 * Input Validation of the options and loop iterate until the correct input is entered.
				 * @input
				 */
				System.out.print("Invalid Response. Please Enter again: ");
				opt = sc.nextInt(); sc.nextLine();
			}		
			if (opt == 4){
				break;
			}
			opt1 = 0;
			switch(opt) {
				case 1:
					System.out.println("1. Enroll Student");
					System.out.println("2. Enroll Course");
					System.out.println("3. Enroll Student to Course");
					opt1 = sc.nextInt(); sc.nextLine();
					while ((opt1 < 1) && (opt1 > 3)) {
						/**
						 * Input Validation of the options and loop iterate until the correct input is entered.
						 * @input
						 */
						System.out.print("Invalid Response. Please Enter again: ");
						opt1 = sc.nextInt(); sc.nextLine();
					}
					switch (opt1) {
						case 1:
							if (studentCount >= 100) {
								System.out.println("Exceded Students limit!");
								break;
							}
							System.out.print("Enter Student ID: ");	
							String id = sc.nextLine();
							System.out.print("Enter Student Name: ");
							String name = sc.nextLine();
							students[studentCount] = new Student(id, name);
							System.out.println(students[studentCount].toString());
							studentCount++;
							System.out.println("Student added successfully.");
							break;
						case 2:
							if (courseCount >= 50) {
								System.out.println("Exceded Courses limit!");
								break;
							}
							System.out.print("Enter course code: ");
							String code = sc.nextLine();
							System.out.print("Enter course title: ");
							String title = sc.nextLine();
							courses[courseCount] = new Course(code, title);
							System.out.println(courses[courseCount].toString());
							courseCount++;
							System.out.println("Course added successfully.");
							break;
						case 3:
							if ((studentCount == 0 ) || (courseCount == 0)) {
								System.out.println("No Students or Courses available to enroll.");
								break;
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
							

							break;
					}					
					break;
				case 2:
					break;
				case 3:
					break;
			}
		}
	}
}

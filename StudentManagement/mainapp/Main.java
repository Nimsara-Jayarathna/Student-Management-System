package StudentManagement.mainapp;

import StudentManagement.services.EnrollmentManager;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Student Management System");
		EnrollmentManager enrollmentManager = new EnrollmentManager();
		int opt0, opt1, opt2, opt3;
		enrollmentManager.InitilizeEnroller();
		while(true) {
			System.out.printf("\t1. Enroll\n");
			System.out.printf("\t2. List\n");
			System.out.printf("\t3. Search\n");
			System.out.printf("\t4. Sort\n");
			System.out.printf("\t5. Exit\n");
			System.out.print("Enter the option to select: ");
			opt0 = sc.nextInt(); sc.nextLine();
			while ((opt0 < 1) && (opt0 > 5)) {
				/**
				 * Input Validation of the options and loop iterate until the correct input is entered.
				 * @input
				 */
				System.out.print("Invalid Response. Please Enter again: ");
				opt0 = sc.nextInt(); sc.nextLine();
			}		
			if (opt0 == 5){
				break;
			}
			opt1 = 0;
			switch(opt0) {
				case 1:
					System.out.printf("\t1. Enroll Student\n");
					System.out.printf("\t2. Enroll Course\n");
					System.out.printf("\t3. Enroll Student to Course\n");
					System.out.print("Enter the option to select: ");
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
							if (enrollmentManager.getStudentCount() >= 100) {
								System.out.println("Exceded Students limit!");
								break;
							}
							System.out.printf("Enter Student ID: ");	
							String id = sc.nextLine();
							System.out.printf("Enter Student Name: ");
							String name = sc.nextLine();
							enrollmentManager.addStudent(id, name);
							break;
						case 2:
							if (enrollmentManager.getCourseCount() >=50) {
								System.out.println("Exceded Courses limit!");
								break;
							}
							System.out.printf("Enter course code: ");
							String code = sc.nextLine();
							System.out.printf("Enter course title: ");
							String title = sc.nextLine();
							enrollmentManager.addCourse(code, title);
							break;
						case 3:
							enrollmentManager.enrollStudentToCourse();
							break;
					}					
					break;
				case 2:
					opt2 = 0;
					System.out.printf("\t1. List Students\n");
					System.out.printf("\t2. List Courses\n");
					System.out.printf("\t3. List Enrollments\n");
					System.out.print("Enter the option to select: ");
					opt2 = sc.nextInt(); sc.nextLine();
					while ((opt2 < 1) && (opt2 > 3)) {
						/**
						 * Input Validation of the options and loop iterate until the correct input is entered.
						 * @input
						 */
						System.out.print("Invalid Response. Please Enter again: ");
						opt2 = sc.nextInt(); sc.nextLine();
					}
					switch (opt2) {
						case 1:
							if (enrollmentManager.getStudentCount() == 0) {
								System.out.println("No Students available to list.");
								break;
							}
							System.out.println("List of Students:");
							enrollmentManager.listStudents();
							break;
						case 2:
							if (enrollmentManager.getCourseCount() == 0) {
								System.out.println("No Courses available to list.");
								break;
							}
							System.out.println("List of Courses:");
							enrollmentManager.listCourses();
							break;
						case 3:
							if (enrollmentManager.getStudentCount() == 0 || enrollmentManager.getCourseCount() == 0) {
								System.out.println("No Students or Courses available to list enrollments.");
								break;
							}
							System.out.println("List of Enrollments:");
							enrollmentManager.listEnrollments();
							break;
						default:
							break;
					}		
					break;
				case 3:
					opt3 = 0;
					System.out.printf("1. Search Student\n");
					System.out.printf("2. Search Course\n");
					opt3 = sc.nextInt(); sc.nextLine();
					while ((opt3 < 1) && (opt3 > 2)) {
						/**
						 * Input Validation of the options and loop iterate until the correct input is entered.
						 * @input
						 */
						System.out.print("Invalid Response. Please Enter again: ");
						opt3 = sc.nextInt(); sc.nextLine();
					}
					switch (opt3) {
						case 1:
							System.out.print("Enter Student ID to search: ");
							String searchId = sc.nextLine();
							enrollmentManager.searchStudentById(searchId);
							break;
						case 2:
							System.out.print("Enter Course Code to search: ");
							String searchCode = sc.nextLine();
							enrollmentManager.searchCourseByCode(searchCode);
							break;
					}
					break;
				case 4:
					enrollmentManager.sortStudentsByName(enrollmentManager.getStudentCount());
					break;
				default:
					break;
			}
		}
	}
}

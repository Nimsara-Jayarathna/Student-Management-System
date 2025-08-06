package StudentManagement.mainapp;

import StudentManagement.models.Student;
import StudentManagement.models.Course;
import StudentManagement.services.EnrollmentManager;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Student Management System");
		EnrollmentManager enrollmentManager = new EnrollmentManager();
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
							if (enrollmentManager.getStudentCount() >= 100) {
								System.out.println("Exceded Students limit!");
								break;
							}
							System.out.print("Enter Student ID: ");	
							String id = sc.nextLine();
							System.out.print("Enter Student Name: ");
							String name = sc.nextLine();
							enrollmentManager.addStudent(id, name);
							break;
						case 2:
							if (enrollmentManager.getCourseCount() >=50) {
								System.out.println("Exceded Courses limit!");
								break;
							}
							System.out.print("Enter course code: ");
							String code = sc.nextLine();
							System.out.print("Enter course title: ");
							String title = sc.nextLine();
							enrollmentManager.addCourse(code, title);
							break;
						case 3:
							


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

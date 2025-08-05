import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		while(true) {
			println("1. Enroll");
			println("2. List");
			println("3. Search");
			println("4. Exit");
			print("Enter the option to select: ");
			opt = sc.newInt(); sc.newLine();
			while ((opt < 1) && (opt > 4)) {
				/**
				 * Input Validation of the options and loop iterate until the correct input is entered.
				 * @input
				 */
				print("Invalid Response. Please Enter again: ");
				opt = sc.newInt(); sc.newLine();
			}		
			if (opt == 4){
				break;
			}
			switch(opt) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
			}
		}
	}
}

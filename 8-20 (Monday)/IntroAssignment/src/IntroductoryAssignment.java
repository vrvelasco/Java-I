import java.util.Scanner;
public class IntroductoryAssignment {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in); // Setup keyboard
			String firstName; // First Name variable
			String lastName; // Last Name variable
			System.out.println("Enter your first name: "); // Ask for first name
            firstName = input.nextLine(); // Get first name from user
            System.out.println("Enter your last name: "); // Ask for last name
            lastName = input.nextLine(); // Get last name from user
            System.out.printf("Welcome %s %s\n", firstName, lastName); // Concatenate message
            System.out.println("This is my first Java program!"); // Continues message
            input.close(); // Close input
	}

}

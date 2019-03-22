import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		String name;
		int age;
		double income;
		Scanner input = new Scanner(System.in);
		
		// Get user input
		System.out.println("Please enter your name: ");
		name = input.nextLine(); // String
		System.out.println("Please enter your age: ");
		age = input.nextInt(); // Integer
		System.out.println("Please enter your annual income: ");
		income = input.nextDouble();
				
		// Display user input
		System.out.println("Hello " + name + "\nYour age is: " + age);
		System.out.printf("Your income is: $%,.2f\n", income);
		input.close();
	}

}

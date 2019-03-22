import java.util.Scanner;

public class MPGMain {

	/*  
	 * 															Program 2
	 *  
	 * We will make some changes to our first program. If you recall we began with, A car's gas mileage or miles-per-gallon (MPG) 
	 * can be calculated with the following Formula: 
     *
	 * MPG = Miles Driven / Gallons of gas used 
     *
	 * Write a class called Mileage. The Mileage class should have two private member variables called miles and gallons of type 
	 * double. The class should have four public methods: setMiles and setGallons should use void return types; getMiles and 
	 * getGallons should use double return types. It should have one more method called getMPG that performs the math 
	 * calculation and returns the double MPG
	 * 
	 * Write a program called MPGMain that asks the user for the number of miles driven and the gallons of gas used. It should 
	 * call the Mileage class to calculate the car's MPG. The class should return the MPG to the MPGMain where it was called 
	 * and display the value on the screen. (Format the display and limit the miles-per-gallon to 2 decimal places)
	 * 
	 * Attach the compressed file containing the program files you created. Submit it through Blackboard for grading.
	*/
	
	public static void main(String[] args) 
	{
		// Create copies of class
		Scanner input = new Scanner(System.in);
		Mileage myMileage = new Mileage();
		
		// Get Miles
		System.out.println("Enter the number of miles driven: ");
		myMileage.setMiles(input.nextDouble());
		
		// Get Gallons used
		System.out.println("Enter the number of gallons used: ");
		myMileage.setGallons(input.nextDouble());
		
		// Display info
		System.out.printf("The MPG is: %.2f", myMileage.getMPG());
		
		// Close input
		input.close();
	}

}

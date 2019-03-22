import java.util.Scanner;
public class MPG
{

	/*                                            Program 1
		A car's gas mileage, or miles-per-gallon (MPG) can be calculated with the following Formula:
		
		MPG = Miles Driven / Gallons of gas used
		
		Write a program that asks the user for the number of miles driven and the gallons of gas used. Use
		double variables called: miles, gallons, and mpg. It should calculate the car's MPG and display it on
		the screen. (Be sure to format the display so that the mpg is limited to two decimal places)
		
		Compress the folder containing all of the files and folders associated with your program. Submit it
		through Blackboard for grading.
	*/
	
	public static void main(String[] args)
	{
		// Declare variables
		double miles, gallons, mpg;
	
		// Setup keyboard
		Scanner input = new Scanner(System.in);
		
		// Prompt user
		System.out.println("Please enter the Miles driven: ");
		miles = input.nextDouble();
		
		System.out.println("\nPlease enter the Gallons of gas used: ");
		gallons = input.nextDouble();
		
		// Math
		mpg = miles / gallons;
		
		// Output
		System.out.printf("\nThe MPG is: %.2f", mpg);		
		
		// Close input
		input.close();
	}

}

import java.util.Scanner;

public class MPGMain {
	
	public static void main(String[] args) 
	{
		// Create copies of class
		Scanner input = new Scanner(System.in);
		Mileage myMileage = new Mileage();
		Distance myDistance = new Distance();
		Speed mySpeed = new Speed();
		
		// Variable
		int menuEntry;
		
		menuEntry = displayMenu(input);
		
		// Loop for the menu
		while (menuEntry != 4)
		{
			if (menuEntry > 0 && menuEntry < 4)
			{
				// Swith
				switch (menuEntry)
				{
				case 1:
					// Get Miles
					System.out.println("Enter the number of miles driven: ");
					myMileage.setMiles(input.nextDouble());
					
					// Get Gallons used
					System.out.println("Enter the number of gallons used: ");
					myMileage.setGallons(input.nextDouble());
					
					// Display info
					System.out.printf("The MPG is: %.2f", myMileage.getMPG());
					menuEntry = displayMenu(input);
					break;
					
				case 2: 
					// Get Speed
					System.out.println("Enter the speed at which you were driving (in MPH): ");
					myDistance.setSpeed(input.nextDouble());
					
					// Get Time
					System.out.println("Enter the number of hours you drove: ");
					myDistance.setTime(input.nextDouble());
					
					// Display info
					System.out.printf("The distance traveled (in Miles): %.2f", myDistance.getDistance());
					menuEntry = displayMenu(input);
					break;
					
				case 3: 
					// Get Distance
					System.out.println("Enter the number of miles driven: ");
					mySpeed.setDistance(input.nextDouble());
					
					// Get Time
					System.out.println("Enter the number of hours traveled: ");
					mySpeed.setTime(input.nextDouble());
					
					// Display info
					System.out.printf("The MPH is: %.2f", mySpeed.getMPH());
					menuEntry = displayMenu(input);
					break;
					
				}
			}
			else
			{
				System.out.println("\nIncorrect Entry. Please try again.");
				menuEntry = displayMenu(input);
			}
	}
		
		// Close input
		input.close();
	}
	
	public static int displayMenu(Scanner input)
	{
		int menuEntry;
		
		// Menu
		System.out.println("\n\n................. MENU .................."
				           + "\n: Enter 1 to Determine Miles-per-Gallon :"
				           + "\n: Enter 2 to Determine Distance         :"
				           + "\n: Enter 3 to Determine Miles-per-Hour   :"
				           + "\n: Enter 4 to Exit                       :"
				           + "\n.........................................\n");
		
		menuEntry = input.nextInt();
		
		return menuEntry;
	}
}

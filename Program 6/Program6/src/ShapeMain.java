import java.util.Scanner;

public class ShapeMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String userString;
		int choice;
		
		title();  // Display title
		menu(); // Display menu
		
		userString = input.nextLine(); // Get user's input	
		choice = isValidNumber(userString); // Is it valid?

		while (choice != 5) // Do they want to exit?
		{
			if (choice >= 1 && choice <= 4) // Was the choice a valid option?
			{
				switch (choice) // Menu choices
				{
				
				case 1: // Circle
					System.out.println("\nWhat is the radius of the circle: ");
					double radius = isPositiveNumber(input.nextLine());
					
					while (radius <= 0) 
					{
						System.out.println("\nWrong entry. Please enter the radius of the circle: ");
					    radius = isPositiveNumber(input.nextLine());
					}
					
					Circle myCircle = new Circle("CIRCLE", radius);
					
					// Output
					System.out.printf("\n╔════════════════════════╗"
							        + "\n║ You selected a %s. ║"
							        + "\n╚════════════════════════╝"
							        + "\n The Area is:   %.2f"
							        + "\n The Volume is: %.2f\n",  myCircle.getName(), myCircle.getArea(), myCircle.getVolume());
					
					break;
				
				case 2: // Square
					System.out.println("\nWhat is the side of the square: ");
					double side = isPositiveNumber(input.nextLine());
					
					while (side < 1) 
					{
						System.out.println("\nWrong entry. Please enter the side of the square: ");
					    side = isPositiveNumber(input.nextLine());
					}
					
					Square mySquare = new Square("SQUARE", side);
					
					// Output
					System.out.printf("\n╔════════════════════════╗"
					                + "\n║ You selected a %s. ║"
					                + "\n╚════════════════════════╝"
					        		+ "\n The Area is:   %.2f"
					        		+ "\n The Volume is: %.2f\n",  mySquare.getName(), mySquare.getArea(), mySquare.getVolume());
					
					break;
				
				case 3: // Rectangle
					// LENGTH
					System.out.println("\nWhat is the length of the rectangle: ");
					double length = isPositiveNumber(input.nextLine());
					
					while (length < 1) 
					{
						System.out.println("\nWrong entry. Please enter the length of the rectangle: ");
					    length = isPositiveNumber(input.nextLine());
					}
					
					// HEIGHT
					System.out.println("\nWhat is the height of the rectangle: ");
					double height = isPositiveNumber(input.nextLine());
					
					while (height < 1) 
					{
						System.out.println("\nWrong entry. Please enter the height of the rectangle: ");
					    height = isPositiveNumber(input.nextLine());
					}
					
					// WIDTH
					System.out.println("\nWhat is the width of the rectangle: ");
					double width = isPositiveNumber(input.nextLine());
					
					while (width < 1) 
					{
						System.out.println("\nWrong entry. Please enter the width of the rectangle: ");
					    width = isPositiveNumber(input.nextLine());
					}
					
					Rectangle myRectangle = new Rectangle("RECTANGLE", length, height, width);
					
					// Output
					System.out.printf("\n╔═══════════════════════════╗"
					                + "\n║ You selected a %s. ║"
					                + "\n╚═══════════════════════════╝"
					                + "\n The Area is:   %.2f"
					                + "\n The Volume is: %.2f\n",  myRectangle.getName(), myRectangle.getArea(), myRectangle.getVolume());
					
					break;
				
				case 4: // Triangle
					// BASE
					System.out.println("\nWhat is the base of the triangle: ");
					double base = isPositiveNumber(input.nextLine());
					
					while (base < 1)
					{
						System.out.println("\nWrong entry. Please enter the base of the triangle: ");
					    base = isPositiveNumber(input.nextLine());
					}
					
					// LENGTH
					System.out.println("\nWhat is the length of the triangle: ");
					double triLength = isPositiveNumber(input.nextLine());
					
					while (triLength < 1)
					{
						System.out.println("\nWrong entry. Please enter the length of the triangle: ");
					    triLength = isPositiveNumber(input.nextLine());
					}
					
					// HEIGHT
					System.out.println("\nWhat is the height of the triangle: ");
					double triHeight = isPositiveNumber(input.nextLine());
					
					while (triHeight < 1)
					{
						System.out.println("\nWrong entry. Please enter the height of the triangle: ");
					    triHeight = isPositiveNumber(input.nextLine());
					}
					
					Triangle myTriangle = new Triangle("TRIANGLE", base, triLength, triHeight);
					
					// Output
					System.out.printf("\n╔══════════════════════════╗"
					                + "\n║ You selected a %s. ║"
					                + "\n╚══════════════════════════╝"
					                + "\n The Area is:   %.2f"
					                + "\n The Volume is: %.2f\n",  myTriangle.getName(), myTriangle.getArea(), myTriangle.getVolume());
					
					break;
					
				} // End of switch
				
			} // End of if
			else
				System.out.println("\nInvalid menu option. Please try again: ");
			
			// Let the user try menu selection again
			menu(); // Display menu
			userString = input.nextLine(); // Get user's input		
			choice = isValidNumber(userString); // Is it valid?
			
		}  // End of while
				
		input.close();
	}

	public static void menu()
	{
		System.out.print("\n╔═════════════════════════╗"
				       + "\n║        MAIN MENU        ║"
				       + "\n╠═════════════════════════╣"
				       + "\n║ Enter 1 for a Circle    ║"
				       + "\n║ Enter 2 for a Square    ║"
			           + "\n║ Enter 3 for a Rectangle ║"
				       + "\n║ Enter 4 for a Triangle  ║"
				       + "\n║ Enter 5 to Exit         ║"
				       + "\n╚═════════════════════════╝"
				       + "\nPlease make a selection: "); 
	}
	
	public static int isValidNumber(String userString) // Checks menu choice
	{
		try
			{
				int parsedInt = Integer.parseInt(userString);
				
				return parsedInt; // Return the successfully parsed integer
			}
			catch (NumberFormatException e)
			{
				return -1; // Returning -1, since there was an error
			}
		}
	
	public static double isPositiveNumber(String userString) // Checks valid measurement
	{
		try
		{
			double parsedDouble = Double.parseDouble(userString);
			
			return parsedDouble; // Return the successfully parsed double
		}
		catch (NumberFormatException e)
		{
			return -1; // Returning -1, since there was an error
		}
	}
	
	public static void title()
	{
		  System.out.println("\n\t .d8888b.  888                                       .d8888b.           888                   888          888                    \r\n" + 
		  		             "\td88P  Y88b 888                                      d88P  Y88b          888                   888          888                    \r\n" + 
		  	            	 "\tY88b.      888                                      888    888          888                   888          888                    \r\n" + 
		  		             "\t \"Y888b.   88888b.   8888b.  88888b.   .d88b.       888         8888b.  888  .d8888b 888  888 888  8888b.  888888 .d88b.  888d888 \r\n" + 
		  		             "\t    \"Y88b. 888 \"88b     \"88b 888 \"88b d8P  Y8b      888            \"88b 888 d88P\"    888  888 888     \"88b 888   d88\"\"88b 888P\"   \r\n" + 
		  		             "\t      \"888 888  888 .d888888 888  888 88888888      888    888 .d888888 888 888      888  888 888 .d888888 888   888  888 888     \r\n" + 
		  		             "\tY88b  d88P 888  888 888  888 888 d88P Y8b.          Y88b  d88P 888  888 888 Y88b.    Y88b 888 888 888  888 Y88b. Y88..88P 888     \r\n" + 
		  		             "\t \"Y8888P\"  888  888 \"Y888888 88888P\"   \"Y8888        \"Y8888P\"  \"Y888888 888  \"Y8888P  \"Y88888 888 \"Y888888  \"Y888 \"Y88P\"  888     \r\n" + 
		  		             "\t                             888                                                                                                  \r\n" + 
		  		             "\t                             888                                                                                                  \r\n" + 
		  		             "\t                             888                                                                                                  \r\n" + 
		  		             "\t\r\n");

	}
}

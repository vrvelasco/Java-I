import java.util.*;

public class Exam3ProgramMain 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str = "";
		int choice = 0;
		
		title(); // Displays title
		
		menu(); // Display menu
		choice = getChoice(input);
		
		while (choice != -1) // Loop until exit is selected
		{						
			if (choice >= 1 && choice <= 4)
			{
				str = getString(input); // Get string from user
				
				switch (choice) // Menu options
				{
				case 1:
					numberOfWords(str);
					break;
				case 2:
					allCapitals(str);
					break;
				case 3:
					allLowers(str);
					break;
				case 4:
					reverseOrder(str);
					break;
				}
			}
			else
				System.out.println("\n╔═══════╗"
						         + "\n║ ERROR ║ Invalid choice. Please try again."
						         + "\n╚═══════╝");
			
			menu(); // Display menu
			choice = getChoice(input);
		}
		
		input.close();
		ThankYou();
	}
	
	public static void menu() // Program menu
	{
		System.out.print("\n╔══════════════════════════════════════════════════════════╗\n"
				         + "║                         MAIN MENU                        ║\n"
				         + "╠══════════════════════════════════════════════════════════╣\n"
				         + "║ Enter  1 to display the number of words in the string    ║\n"  
				         + "║ Enter  2 to display the string in all capital letters    ║\n"  
				         + "║ Enter  3 to display the string in all lower case letters ║\n"  
				         + "║ Enter  4 to display the string in reverse order          ║\n"  
				         + "║ Enter -1 to exit                                         ║\n"
				         + "╚══════════════════════════════════════════════════════════╝\n"
				         + "► Please make a selection: ");
	}
	
	public static void title() // Title art
	{
		System.out.println("\n     _____ _             _   _____                     " 
	                     + "\n    |  ___(_)_ __   __ _| | | ____|_  ____ _ _ __ ___  " 
				         + "\n    | |_  | | '_ \\ / _` | | |  _| \\ \\/ / _` | '_ ` _ \\ "
				         + "\n    |  _| | | | | | (_| | | | |___ >  < (_| | | | | | |" 
				         + "\n    |_|   |_|_| |_|\\__,_|_| |_____/_/\\_\\__,_|_| |_| |_|");
	}
	
	public static String getString(Scanner input) // Prompts user for a string
	{
		// Ask user for string
		System.out.print("\nPlease enter a string to begin: ");
		String str = input.nextLine();
			
		// Verify that at least one character was entered
		while (str.length() <= 0)
		{
			System.out.print("\n╔═══════╗" 
					       + "\n║ ERROR ║ You must enter at least one character. Please try again."
					       + "\n╚═══════╝\n\nString: ");
			str = input.nextLine();
		}
		
		return str;
	}
	
	public static int getChoice(Scanner input) // Gets the user's choice as a string and then parses it
	{
		try
		{
			int number = Integer.parseInt(input.nextLine());
			
			return number;
		}
		catch (NumberFormatException e)
		{
			return 0; // Error
		}
		
	}
	
	public static void numberOfWords(String str) // Counts number of words
	{
		StringTokenizer strToken = new StringTokenizer(str);
		
		int count = strToken.countTokens();
		System.out.println("\n╔═════════════════╗"
				         + "\n║ NUMBER OF WORDS ║ " + count 
				         + "\n╚═════════════════╝");
	}
	
	public static void allCapitals(String str) // Displays the string in UpperCase
	{
		System.out.println("\n╔════════════╗"
	                     + "\n║ UPPER CASE ║ " + str.toUpperCase()
	                     + "\n╚════════════╝");
	}
	
	public static void allLowers(String str) // Displays the string in LowerCase
	{
		System.out.println("\n╔════════════╗"
				         + "\n║ LOWER CASE ║ " + str.toLowerCase()
				         + "\n╚════════════╝");
	}
	 
	public static void reverseOrder(String str) // String is displayed backwards
	{
		System.out.print("\n╔═══════════════╗"
				       + "\n║ REVERSE ORDER ║ ");
		
		for (int i = str.length() - 1; i >= 0; i--) // Go through string backwards
		{
			System.out.print(str.charAt(i)); // Print index
		}
		
		System.out.println("\n╚═══════════════╝");
	}
	
	public static void ThankYou()
	{
		System.out.println("\n\n\t###########################################"
				           + "\n\t#                                         #"
				           + "\n\t#   Thanks for the awesome semester! =)   #"
				           + "\n\t#                                         #"
				           + "\n\t###########################################");
	}
}

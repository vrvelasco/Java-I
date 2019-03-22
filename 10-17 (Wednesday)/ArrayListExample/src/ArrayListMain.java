import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		
		// Add items to list to start program
		nameList.add("Clark Kent");
		nameList.add("Bruce Wayne");
		nameList.add("Diana Prince");
		nameList.add("Helen Thomas");
		
		// Add to list in one line
		Collections.addAll(nameList, "Tony Stark", "Shrek The Ogre", "Wade Wilson", "Guy Gardner", "Hal Jordan");
		
		String name;
		int item, choice = menu(input);
		
		while (choice != 5)
		{
			switch (choice)
			{
			case 1:
				System.out.println("Enter the name that you want to add to the list: ");
				name = input.nextLine();
				
				// Check for a least one character
				while (name.length() < 1)
				{
					System.out.println("You must enter at least one character: ");
					name = input.nextLine();
				}
				
				nameList.add(name);
				break;
				
			case 2:
				printArrayList(nameList);
				
				System.out.println("Enter the index for the item you wish to edit: ");
				item = input.nextInt();
				
				while (item <= 0 || item > nameList.size())
				{
					System.out.println("Incorrect entry. Index must be greater than zero.");
					item = input.nextInt();
				}
				
				input.nextLine(); // Get rid of Keyboard Buffer
				
				System.out.println("Enter the new name: ");
				name = input.nextLine();
				
				while (name.length() < 1)
				{
					System.out.println("You must enter at least one character: ");
					name = input.nextLine();
				}
				
				nameList.set((item -1), name);
				
				break;
				
			case 3:
				printArrayList(nameList);
				
				System.out.println("Enter the index for the item you wish to edit: ");
				item = input.nextInt();
				
				while (item <= 0 || item > nameList.size())
				{
					System.out.println("Incorrect entry. Index must be greater than zero.");
					item = input.nextInt();
				}
				
				nameList.remove(item-1);
				
				break;
				
			case 4:
				printArrayList(nameList);
				break;
			} // End of Switch
			
			choice = menu(input); // Start menu again
			
		} // End of While Loop
	}
	
	public static int menu(Scanner input)
	{
		System.out.println("Enter 1 to add a name to the list: ");
		System.out.println("Enter 2 to edit a name on the list:");
		System.out.println("Enter 3 to delete a name from the list: ");
		System.out.println("Enter 4 to print the list: ");
		System.out.println("Enter 5 to exit: ");
		int choice = input.nextInt();
		
		while (choice <= 0 || choice > 5)
		{
			System.out.println("Incorrect entry. Enter a number between 1 and 5: ");
			choice = input.nextInt();
		}
		
		input.nextLine(); // Clear that extra "Enter"
		
		return choice;
	}
	
	public static void printArrayList(ArrayList<String> nameList)
	{
		for (int i = 0; i < nameList.size(); i++)
		{
			System.out.println("Index:" + (i + 1) + "\tName: " + nameList.get(i));
		}
	}
}

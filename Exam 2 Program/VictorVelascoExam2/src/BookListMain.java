import java.util.Scanner;
import java.util.ArrayList;

public class BookListMain
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		ArrayList<String> BookList = new ArrayList<String>();
		
		String title;
		int index, choice = menu(input);
		
		while (choice != 5)
		{
			switch (choice)
			{
			case 1:
				System.out.println("\n"); // Add some space
								
				System.out.println("Enter the title of the book that you want to add to the list: ");
				title = input.nextLine();
				
				// Check for a least one character
				while (title.length() < 1)
				{
					// Confirm to user
					System.out.println("\n╔════════╦════════════════════════════════════════╗" 
				        		     + "\n║ ERROR! ║ You must enter at least one character: ║" 
					                 + "\n╚════════╩════════════════════════════════════════╝\n");
					title = input.nextLine();
				}
				
				BookList.add(title.toUpperCase());
				
				// Confirm to user
				System.out.println("\n╔══════════╦═══════════════════════════════════╗" 
			        		     + "\n║ SUCCESS! ║ The book was written to the list. ║" 
				                 + "\n╚══════════╩═══════════════════════════════════╝\n");
				break;
				
			case 2:
				printArrayList(BookList);
				System.out.println("\n"); // Add some space
				
				if (BookList.size() != 0) // Is there something in the list?
				{
					System.out.println("Enter the index for the item you wish to edit: ");
					index = input.nextInt();
					
									
					while (index <= 0 || index > BookList.size())
					{
						System.out.println("\n╔════════╦════════════════════════════════════════════════════════════════════════════════════╗" 
	        		                     + "\n║ ERROR! ║ Incorrect entry. Index must be greater than zero and an index from the list above: ║" 
		                                 + "\n╚════════╩════════════════════════════════════════════════════════════════════════════════════╝\n");
						index = input.nextInt();
					}
				
					input.nextLine(); // Get rid of Keyboard Buffer
				
					System.out.println("Enter the new title: ");
					title = input.nextLine();
				
					while (title.length() < 1)
					{
						System.out.println("\n╔════════╦════════════════════════════════════════╗" 
   		                                 + "\n║ ERROR! ║ You must enter at least one character: ║" 
                                         + "\n╚════════╩════════════════════════════════════════╝\n");
						title = input.nextLine();
					}
				
					BookList.set((index -1), title.toUpperCase());
				}
					break;
				
			case 3:
				printArrayList(BookList);
				System.out.println("\n"); // Add some space
				
				if (BookList.size() != 0)
				{
					System.out.println("Enter the index for the item you wish to remove: ");
					index = input.nextInt();
				
					while (index <= 0 || index > BookList.size())
					{
						System.out.println("\n╔════════╦════════════════════════════════════════════════════════════════════════════════════╗" 
			        		             + "\n║ ERROR! ║ Incorrect entry. Index must be greater than zero and an index from the list above: ║" 
				                         + "\n╚════════╩════════════════════════════════════════════════════════════════════════════════════╝\n");
						index = input.nextInt();
					}
				
					BookList.remove(index-1);
				}
				
				break;
				
			case 4:
				printArrayList(BookList);
				System.out.println("\n"); // Add some space
				
				break;
			} // End of Switch
			
			choice = menu(input); // Start menu again
			
		} // End of While Loop
	
	input.close();
	}

	public static int menu(Scanner input)
	{
		// Fancy menu
		  System.out.println("╔═════════════════════════════════════════╗"
					     + "\n║                MAIN MENU                ║"
					     + "\n╠═════════════════════════════════════════╣"
				         + "\n║ Enter 1 to add a title to the list:     ║" 
		                 + "\n║ Enter 2 to edit a title on the list:    ║" 
		                 + "\n║ Enter 3 to delete a book from the list: ║"
	                     + "\n║ Enter 4 to print the list:              ║"
		                 + "\n║ Enter 5 to exit:                        ║"
		                 + "\n╚═════════════════════════════════════════╝\n");
		int choice = input.nextInt();
		
		while (choice <= 0 || choice > 5)
		{
			System.out.println("\n╔════════╦══════════════════════════════════════════════════╗" 
		                     + "\n║ ERROR! ║ Incorrect entry. Enter a number between 1 and 5: ║" 
                             + "\n╚════════╩══════════════════════════════════════════════════╝\n");
			choice = input.nextInt();
		}
		
		input.nextLine(); // Clear that extra "Enter"
		
		return choice;
	}

	public static void printArrayList(ArrayList<String> BookList)
	{
		if (BookList.size() == 0) // Is the list empty?
		{
			System.out.println("\n╔════════════╦═════════════════════════════════════════════════════════════════════╗" 
						     + "\n║ EMPTY LIST ║ Please try entering a book before viewing or editing the book list. ║" 
					         + "\n╚════════════╩═════════════════════════════════════════════════════════════════════╝");
		}
		else
		{
			System.out.println("\n╔═════════════════════════════════════════╗" 
                             + "\n║                BOOK LIST                ║" 
                             + "\n╚═════════════════════════════════════════╝");
			
			for (int i = 0; i < BookList.size(); i++)
			{
				System.out.println("Index: " + (i + 1) + "\tTitle: " + BookList.get(i));
			}
		}
	}
}
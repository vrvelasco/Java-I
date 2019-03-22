import java.util.Scanner;

public class ShipDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		title(); // Show fancy title
		
		String str = "", name = "", year = "";
		int tons = 0, passengers = 0, choice = 0;
		
		menu();
		choice = input.nextInt();
		
		while (choice != -1)
		{
			if (choice >= 1 && choice <= 3)
			{
				switch (choice)
				{
				case 1:
				{
					input.nextLine();
					
					System.out.println("\nWhat is the name of the Ship? ");
					name = input.nextLine();
										
					System.out.println("\nIn what year was it built? ");
					year = input.nextLine();
							
					
					Ship myShip = new Ship(name, year);
					
					str += myShip.toString();
					
					break;
				}
				
				case 2:
				{
					input.nextLine();
					
					System.out.println("\nWhat is the name of the Cruise Ship? ");
					name = input.nextLine();
					/*					
					System.out.println("\nIn what year was it built? ");
					year = input.nextLine();
					*/
					System.out.println("\nWhat is the maximum number of passengers? ");
					passengers = input.nextInt();
					
					CruiseShip myCruiseShip = new CruiseShip(name, year, passengers);
					
					str += myCruiseShip.toString();
					
					break;
				}
				
				case 3:
				{
					input.nextLine();
					
					System.out.println("\nWhat is the name of the Cargo Ship? ");
					name = input.nextLine();
					/*					
					System.out.println("\nIn what year was it built? ");
					year = input.nextLine();
					*/
					System.out.println("\nWhat is the cargo capacity in tons?");
					tons = input.nextInt();
					
					CargoShip myCargoShip = new CargoShip(name, year, tons);
					
					str += myCargoShip.toString();
					
					break;
				}
					
			} // End of switch (choice)
		} // End of if (choice >= 1 && choice <= 3)
		else
		{				
			System.out.println("\t╔════════╦════════════════════════════════════╗\n" 
                             + "\t║ ERROR! ║ Incorrect entry. Please try again: ║\n" 
                             + "\t╚════════╩════════════════════════════════════╝\n");
		}
			
			menu();
			choice = input.nextInt();
		
		} // End of while (choice != -1)
	
	
			// Display toString
			System.out.println("\t╔══════════════╗\n" 
                             + "\t║ Ship Details ║\n" 
                             + "\t╚══════════════╝\n" + str);
			
			input.close();
		
	} // End of main
	
	public static void title()
	{ 
		System.out.println("                __    __    __\r\n" + 
			"               |==|  |==|  |==|                ___                                ___ \r\n" + 
			"             __|__|__|__|__|__|_              | _ \\_ _ ___  __ _ _ _ __ _ _ __   | __|\r\n" + 
			"          __|___________________|___          |  _/ '_/ _ \\/ _` | '_/ _` | '  \\  |__ \\\r\n" +       // ASCII Art 
			"       __|__[]__[]__[]__[]__[]__[]__|___      |_| |_| \\___/\\__, |_| \\__,_|_|_|_| |___/\r\n" +
			"      |............................o.../                   |___/                      \r\n" + 
			"      \\.............................../\r\n" + 
			"   _,~')_,~')_,~')_,~')_,~')_,~')_,~')_,~')\r\n");		
	}
	
	public static void menu()
	{
		System.out.println("\n"
				         + "\t╔════════════════════════════╗\n" 
	                     + "\t║          MAIN MENU         ║\n"
				         + "\t╠════════════════════════════╣\n"
	                     + "\t║ Enter  1 For A Ship        ║\n"
	                     + "\t║ Enter  2 For A Cruise Ship ║\n"  
	                     + "\t║ Enter  3 For A Cargo Ship  ║\n"  
	                     + "\t║ Enter -1 To Exit           ║\n"
	                     + "\t╚════════════════════════════╝\n"
	                     + "\nPlease enter your choice: ");
	}
}
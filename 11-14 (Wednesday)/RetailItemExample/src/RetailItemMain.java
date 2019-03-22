import java.util.Scanner;

public class RetailItemMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String title, artist, genre, str = "";
		int time, choice;
		double price, total = 0;
		
		displayMenu();
		choice = Integer.parseInt(input.nextLine());
		
		while (choice != 4)
		{
			if (choice > 0 && choice < 4)
			{
				System.out.println("Enter the title: ");
				title = input.nextLine();
				
				while (title.length() <= 0)
				{
					System.out.println("You must enter at least on character.");
					title = input.nextLine();
				}
				
				System.out.println("Enter the price: ");
				price = Double.parseDouble(input.nextLine());
				
				while (price <= 0)
				{
					System.out.println("Price must be greater than zero: ");
					price = Double.parseDouble(input.nextLine());
				}
				
				switch (choice)
				{
				case 1:
					System.out.println("Enter the name of the artist: ");
					artist = input.nextLine();
					
					CD myCD = new CD(title, artist, price);
					
					total += myCD.getRetailPrice();
					
					str += "\nTitle: " + myCD.getTitle() + "\nArtist: " + myCD.getArtist() + "\nPrice: $" + myCD.getRetailPrice();
					
					break;
					
				case 2: 
					System.out.println("Enter the run time of the DVD: ");
					time = Integer.parseInt(input.nextLine());
					
					DVD myDVD = new DVD(title, time, price);
					
					total += myDVD.getRetailPrice();
					
					str += "\nTitle: " + myDVD.getTitle() + "\nRun Time: " + myDVD.getRunTime() + "\nPrice: $" + myDVD.getRetailPrice();
					
					break;
					
				case 3:
					System.out.println("Enter the name of the genre: ");
					genre = input.nextLine();
					
					BD myBD = new BD(title, genre, price);
					
					total += myBD.getRetailPrice();
					
					str += "\nTitle: " + myBD.getTitle() + "\nGenre: " + myBD.getGenre() + "\nPrice: $" + myBD.getRetailPrice();
					
					break;
				}	
			}
			else
				System.out.println("Incorrect entry: ");
			
			displayMenu();
			choice = Integer.parseInt(input.nextLine());
		}
		
		System.out.println("You purchased: " + str);
		System.out.println("Total Cost: $" + total);
		
	}

		public static void displayMenu()
		{
			System.out.println("Enter 1 for CD: \nEnter 2 for DVD: \nEnter 3 for BD: \nEnter 4 to Exit: ");
		}
}

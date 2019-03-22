import java.util.Scanner;

public class SportsCarDemo {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int choice = 0;
		CarColor color = null;
		CarType make = null;
		double price = 0.0;
		String str = null;
		
		displayMenu();
		choice = input.nextInt();
		System.out.println();
		
		while (choice != 7)
		{
			if (choice > 0 && choice < 7)
			{
				switch (choice)
				{
				case 1:
					make = CarType.PORSCHE;
					color = getColorMethod(input);
					price = getPriceMethod(input);
					
					SportsCar myCar1 = new SportsCar(make, color, price);
					str = myCar1.toString();
					
					System.out.println(str);
					break;
					
				case 2:
					make = CarType.FERRARI;
					color = getColorMethod(input);
					price = getPriceMethod(input);
					
					SportsCar myCar2 = new SportsCar(make, color, price);
					str = myCar2.toString();
					
					System.out.println(str);
					break;
					
				case 3:
					make = CarType.JAGUAR;
					color = getColorMethod(input);
					price = getPriceMethod(input);
					
					SportsCar myCar3 = new SportsCar(make, color, price);
					str = myCar3.toString();
					
					System.out.println(str);
					break;
					
				case 4:
					make = CarType.LAMBORGHINI;
					color = getColorMethod(input);
					price = getPriceMethod(input);
					
					SportsCar myCar4 = new SportsCar(make, color, price);
					str = myCar4.toString();
					
					System.out.println(str);
					break;
					
				case 5:
					make = CarType.MCLAREN;
					color = getColorMethod(input);
					price = getPriceMethod(input);
					
					SportsCar myCar5 = new SportsCar(make, color, price);
					str = myCar5.toString();
					
					System.out.println(str);
					break;
					
				case 6:
					make = CarType.MISC;
					color = getColorMethod(input);
					price = getPriceMethod(input);
					
					SportsCar myCar6 = new SportsCar(make, color, price);
					str = myCar6.toString();
					
					System.out.println(str);
					break;
				}
			} // End of if (choice > 0 && choice < 7)
			else
			System.out.println("Incorrect Entry. Please try again.");
			
			displayMenu();
			choice = input.nextInt();
			
		} // End of while (choice !=7)
	}
	
		private static double getPriceMethod(Scanner input) 
		{

			System.out.println("Enter the price of the vehicle: ");
			double price = input.nextDouble();
			
			while (price <= 0)
			{
				System.out.println("Price must be greater than zero. ");
				price = input.nextDouble();
			}
			return price;
		}

		public static CarColor getColorMethod(Scanner input) 
		{
			CarColor color = null;
			int colorChoice = 0;
			
			System.out.println("Choose the color of your car: "
					       + "\nEnter 1 for Red: "
					       + "\nEnter 2 for Black: "
					       + "\nEnter 3 for White: "
					       + "\nEnter 4 for Blue: "
					       + "\nEnter 5 for Silver: "
					       + "\nEnter 6 for Yellow: "
					       + "\nEnter 7 for Miscellaneous: ");
			colorChoice = input.nextInt();
			
			while (colorChoice <= 0 || colorChoice > 7)
			{
				System.out.println("Incorrect entry, please try again.");
				colorChoice = input.nextInt();
			}
			
			switch (colorChoice)
			{
			case 1:
				color = CarColor.RED;
				break;
			case 2:
				color = CarColor.BLACK;
				break;
			case 3:
				color = CarColor.WHITE;
				break;
			case 4:
				color = CarColor.BLUE;
				break;
			case 5:
				color = CarColor.SILVER;
				break;
			case 6:
				color = CarColor.YELLOW;
				break;
			case 7: 
				color = CarColor.MISCELANEOUS;
				break;
			}
						
			return color;
		}

		private static void displayMenu()
		{
			System.out.println("Enter 1 for Porsche: "
						   + "\nEnter 2 for Ferrari: "
				           + "\nEnter 3 for Jaguar: "
				           + "\nEnter 4 for Lamborghini: "
				           + "\nEnter 5 for McLaren: "
				           + "\nEnter 6 for All Others: "
				           + "\nEnter 7 to Exit: ");
		}
}

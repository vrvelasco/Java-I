import java.util.Scanner;

public class ThePetBoutiqueMain 
{

	public static void main(String[] args) 
	{
		// Create objects
		Scanner input = new Scanner(System.in);
		Customer myCustomer = new Customer();
		Pet myPet = new Pet();
		OfficeVisit myVisit = new OfficeVisit();
				
		// *** Introduction ***
		System.out.println("+===================================================================================+\n"
				         + "|   Welcome! Please fill out the following to complete the invoice for the visit.   |\n"
				         + "+===================================================================================+\n");
		// *** End intro ***
		
		// *** Get Customer's information from user ***
		System.out.println("*** LET'S GET THE CUSTOMER'S INFORMATION ***\n\nPlease enter the customer's name: ");
		myCustomer.setName(input.nextLine());
		
		System.out.println("Please enter the customer's address: ");
		myCustomer.setAddress(input.nextLine());
		
		System.out.println("Please enter the customer's phone number: ");
		myCustomer.setPhone(input.nextLine());
		
		System.out.println("Please enter the customer's e-mail address: ");
		myCustomer.setEmail(input.nextLine());
		// *** End customer's info ***
		
		// *** Get Pet's information from user ***
		System.out.println("\n*** NEXT, THE PET'S INFORMATION ***\n\nPlease enter the pet's name: ");
		myPet.setPetName(input.nextLine());
		
		System.out.println("Please enter the pet's type: ");
		myPet.setPetType(input.nextLine());
		
		System.out.println("Please enter the pet's age: ");
		myPet.setPetAge(input.nextLine());
		
		System.out.println("Please enter the pet's weight: ");
		myPet.setPetWeight(input.nextLine());
		// *** End pet's info ***
		
		// *** Get Office Visit information from user ***
		System.out.println("\n*** NOW WE WILL COLLECT THE INFORMATION ABOUT THE OFFICE VISIT ***\n\nPlease enter the charges for services: ");
		myVisit.setServices(input.nextDouble());
		
		System.out.println("Please enter the charges for medications: ");
		myVisit.setMedications(input.nextDouble());
		// *** End office visit info ***
		
		// *** Start of Invoice ***
		System.out.println("\n***** INVOICE COMPLETE! *****\n"
				         + "\n##############################################################\n"
				         + "\n********************************\t 2500 Carlyle Ave,\n" 
		                 + "*     Helen's Pet Boutique     *\t Belleville, IL 62221\n"
				         + "********************************\t (618) 235-2700\n"
		                 + "\n##############################################################\n");
		
		// Display Customer's info
		System.out.println("===== CUSTOMER =====\nName: " + myCustomer.getName() +
				"\nAddress: " + myCustomer.getAddress() + "\nPhone Number: " + 
				myCustomer.getPhone() + "\nE-mail Address: " + myCustomer.getEmail());
		
		// Display Pet's info
		System.out.println("\n===== PET =====\nName: " + myPet.getPetName() + "\nType: " +
		myPet.getPetType() + "\nAge: " + myPet.getPetAge() + "\nWeight: " + myPet.getPetWeight());
		
		// Math
		System.out.println("\n##############################################################\n");
		System.out.println("===== CHARGES =====");
		System.out.printf("\nServices: \t$%,.2f", myVisit.getServices());
		System.out.printf("\nMedications: \t$%,.2f", myVisit.getMedications());
		System.out.printf("\nSubtotal: \t$%,.2f", myVisit.getSubtotal());
		System.out.printf("\nSales Tax: \t$%,.2f", myVisit.getSales());
		System.out.println("\n----------------\t\t* THANK YOU! Have a great day! *");
		System.out.printf("Total: \t\t$%,.2f\n", myVisit.getTotal());
		// *** End of Invoice ***
		
		// Close input
		input.close();
	}

}

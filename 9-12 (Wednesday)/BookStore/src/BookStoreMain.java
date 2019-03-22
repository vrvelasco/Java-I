import java.util.Scanner;

public class BookStoreMain 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// Make copies of Classes
		Customer myCustomer = new Customer();
		Invoice myInvoice = new Invoice();
		Book myBook = new Book();
		
		// Customer information
		System.out.println("Enter the customer's name: ");
		String name = input.nextLine();
		while (name.length() <= 0) // Make sure there is at least one character
		{
			System.out.println("Incorrect entry.\nYou must enter at least one letter.\nTry again.");
			name = input.nextLine();
		}
		myCustomer.setName(name);
		
		System.out.println("Enter the customer's address: ");
		String address = input.nextLine();
		while (address.length() <= 0) // Make sure there is at least one character
		{
			System.out.println("Incorrect entry.\nYou must enter at least one letter.\nTry again.");
			address = input.nextLine();
		}
		myCustomer.setAddress(address);
		
		System.out.println("Enter the customer's phone number: ");
		myCustomer.setPhone(input.nextLine());
	
		// Book information
		System.out.println("Enter the Book's title: ");
		myBook.setTitle(input.nextLine());
	
		System.out.println("Enter the Book's ISBN: ");
		myBook.setIsbn(input.nextLine());
		
		// Invoice information
		System.out.println("Enter the quantity puchased: ");
		myInvoice.setQnty(input.nextInt());
		
		System.out.println("Enter the price: ");
		myInvoice.setPrice(input.nextDouble());
		
		// Display information
		System.out.println("***** Helen's Book Store *****");
		System.out.println("Customer Name: " + myCustomer.getName());
		System.out.println("Customer Address: " + myCustomer.getAddress());
		System.out.println("Customer Phone: " + myCustomer.getPhone());
		System.out.println("Book Purchased: " + myBook .getTitle());
		System.out.println("Book ISBN: " + myBook.getIsbn());
		System.out.println("Quantity: " + myInvoice.getQnty());
		System.out.printf("Price: $%,.2f\n", myInvoice.getPrice());
		System.out.printf("Subtotal: $%,.2f\n", myInvoice.getQnty() * myInvoice.getPrice());
		System.out.printf("Total: $%,.2f\n", myInvoice.getTotal());
		
		// Close input
		input.close();
	}

}

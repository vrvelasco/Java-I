import java.util.Scanner; // Keyboard
public class SalesMain
{

	public static void main(String[] args)
	{
		// Declaration
		final double TAX_RATE = 0.0975;    // Constant
		double subTotal, total, tax;       //  Double variables
		
		// Math
		Scanner input = new Scanner(System.in);                 // Object for the input
		System.out.println("Please enter the subtotal: ");     //  Ask for the subTotal
		subTotal = input.nextDouble();                        //   Store in subTotal variable
		tax = subTotal * TAX_RATE;                          
		total = tax + subTotal;      
		
		// Display info
		System.out.printf("Sub total: $%,.2f\n", subTotal); //     "$%,.2f" Converts to money
		System.out.printf("Sales Tax: $%,.2f\n", tax);
		System.out.printf("Total:     $%,.2f\n", total);
		input.close();                                    //       Close Scanner
	}

}

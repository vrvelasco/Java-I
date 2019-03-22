
public class LeadingZeros
{

	public static void main(String[] args)
	{
		double number1 = 1.2345;
		double number2 = 12.345;
		double number3 = 123.45;
		
		/* printf = format
		 * %09 = nine leading zeros (fills in spaces)
		 * .2 = number of decimal places
		 * "/n" = new line ("%n" when using print f)
		 * */
		
		System.out.printf("%09.2f\n", number1);
		System.out.printf("%09.2f%n", number2);
		System.out.printf("%09.2f\n", number3);
	}

}

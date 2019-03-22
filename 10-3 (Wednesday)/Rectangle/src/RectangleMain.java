import java.util.Scanner;

public class RectangleMain 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int rows, cols;
				
		System.out.println("How many rows?");
		rows = input.nextInt();
		
		while(rows <= 0)
		{
			System.out.println("Please enter a number greater than zero.");
			rows = input.nextInt();
		}
		
		System.out.println("How many columns?");
		cols = input.nextInt();
		
		while(cols <= 0)
		{
			System.out.println("Please enter a number greater than zero.");
			cols = input.nextInt();
		}
		
		for (int r = 0; r < rows; r++)
		{
			for (int c = 0; c < cols; c++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		input.close();
	}

}

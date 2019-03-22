import java.util.Scanner;

public class NewProjectMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int userNum, counter;
		
		System.out.println("Enter a number between 1 and 100:");
		userNum = input.nextInt();
		
		while (userNum <= 0 || userNum > 100)
		{
			System.out.println("Incorrect entry. Enter a number between 1 and 100.");
			userNum  = input.nextInt();
		}
		
		for (counter = userNum; counter >= 0; counter--)
		{
			System.out.println(counter);
		}
	}

}

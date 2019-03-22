import java.util.Scanner;

public class TestAverageMain
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String str;
		double score1, score2, score3, average=0;
		char repeat;
		final int NUMSCORES=3;
		
		System.out.println("This program calculates the average of three test scores.");
		
		do {
			System.out.println("Enter score #1: ");
			score1 = input.nextDouble();
			
			while (score1 < 0 || score1 > 100)
			{
				System.out.println("Incorrect entry, please try again. ");
				score1 = input.nextDouble();
			}
			
			System.out.println("Enter score #2: ");
			score2 = input.nextDouble();
			
			while (score2 < 0 || score2 > 100)
			{
				System.out.println("Incorrect entry, please try again. ");
				score2 = input.nextDouble();
			}
			
			System.out.println("Enter score #3: ");
			score3 = input.nextDouble();
			
			while (score3 < 0 || score3 > 100)
			{
				System.out.println("Incorrect entry, please try again. ");
				score3 = input.nextDouble();
			}
			
			input.nextLine();
			
			average = (score1 + score2 + score3) / NUMSCORES;
			System.out.printf("The average is %,.2f\n\n", average);
			System.out.println("Would you like to enter another set of scores?");
			System.out.println("Enter Y for yes or N for no: ");
			str = input.nextLine();
			repeat = str.charAt(0);
		}while (repeat == 'Y' || repeat == 'y');
		
		input.close();
	}
}

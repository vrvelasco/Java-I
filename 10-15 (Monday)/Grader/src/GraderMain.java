import java.util.Scanner;

public class GraderMain
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many scores do you want to average? ");
		int numScores = input.nextInt();
		
		double[] scores = new double [numScores];
		
		for (int index = 0; index < numScores; index++)
		{
			System.out.println("Enter score #" + (index + 1));
			scores[index] = input.nextDouble();
			
			while (scores[index] < 0)
			{
				System.out.println("Enter a number greater than or equal to zero: ");
				scores[index] = input.nextDouble();
			}
		}
		
		Grader myGrades = new Grader(scores);
		
		System.out.printf("The average grade is: %,.2f\n", myGrades.getAverage());
		System.out.printf("The highest grade is: %,.2f\n", myGrades.getHighest());
		System.out.printf("The lowest grade is: %,.2f\n", myGrades.getLowest());
	}

}

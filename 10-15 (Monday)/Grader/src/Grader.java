
public class Grader
{
	private double[] testScores;
	
	public Grader(double[] scoreArray)
	{
		testScores = scoreArray;
	}
	
	public double getLowest()
	{
		double lowest;
		
		lowest = testScores[0]; // Add first element
		
		for (int i = 1; i < testScores.length; i++) // Go through every number in array
		{
			
			if (testScores[i] < lowest) // Check to see if there is a lower number
				lowest = testScores[i]; // Switch to lower number
		}
		
		return lowest;
	}
		
		public double getHighest()
		{
			double highest = testScores[0];
			
			for (int j =1; j < testScores.length; j++)
			{
				if (testScores[j] > highest)
				{
					highest = testScores[j];
				}
			}
			
			return highest;
		}
			
			public double getAverage()
			{
				double average = 0;
				double total = 0;
				
				if (testScores.length < 2)
				{
					System.out.println("You must enter at least 2 test scores.");
				}
				else
				{
					for (double score : testScores)
						total += score;
					
					average = total / testScores.length;
				}
			
				return average;
			}
	}

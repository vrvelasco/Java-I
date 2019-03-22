import java.util.Scanner;

public class SportMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String tName, n, loc;
		int noPlay, s, sd, hr, choice;
		
		displayMenu();
		
		choice = input.nextInt();
		
		while (choice != 4)
		{
			if (choice > 0 && choice < 4)
			{
				switch (choice)
				{
				case 1: 
				{
					n = "Baseball";
					noPlay = 9;
					System.out.println("Enter the score: ");
					s = input.nextInt();
					input.nextLine(); // Consume white space
					
					System.out.println("Enter the name of the team: ");
					tName = input.nextLine();
					
					System.out.println("Enter the location: ");
					loc = input.nextLine();
					
					System.out.println("Enter the number of home runs: ");
					hr = input.nextInt();
					
					// Display
					Baseball team1 = new Baseball(n, noPlay, s, tName, loc, hr);
					
					System.out.println("The " + team1.getName() + " team named " + team1.getTeamName() + " scored " + team1.getScores() + " and " + team1.getNoHomeRuns() + " home runs!");
					
					break;
				}
				
				case 2:
				{
					n = "Basketball";
					noPlay = 9;
					System.out.println("Enter the score: ");
					s = input.nextInt();
					input.nextLine(); // Consume white space
					
					System.out.println("Enter the name of the team: ");
					tName = input.nextLine();
					
					System.out.println("Enter the location: ");
					loc = input.nextLine();
					
					System.out.println("Enter the number of slam dunks: ");
					sd = input.nextInt();
					
					// Display
					Basketball team2 = new Basketball(n, noPlay, s, tName, loc, sd);
					
					System.out.println("The " + team2.getName() + " team named " + team2.getTeamName() + " scored " + team2.getScores() + " and " + team2.getNoSlamDunks() + " slam dunks!");
				
					break;
				}
				
				case 3:
				{
					n = "Football";
					noPlay = 11;
					System.out.println("Enter the score: ");
					s = input.nextInt();
					input.nextLine(); // Consume white space
					
					System.out.println("Enter the name of the team: ");
					tName = input.nextLine();
					
					System.out.println("Enter the location: ");
					loc = input.nextLine();
					
					// Display
					Football team3 = new Football(n, noPlay, s, tName, loc);
					
					System.out.println("The " + team3.getName() + " team named " + team3.getTeamName() + " scored " + team3.getScores() + " points.");
				
					break;
				}
				
				} // End of switch (choice)
			
			} // End of if (choice > 0 && choice < 4)
			else
			System.out.println("Incorrect entry, please try again.");
			
			displayMenu();
			
			choice = input.nextInt();
			
		} // End of while (choice != 4)
		
		input.close();
		
	} // End of main

	public static void displayMenu()
	{
		System.out.println("Enter 1 for Baseball: \nEnter 2 for Basketball: \nEnter 3 for Football: \nEnter 4 to Exit: ");
	}
}

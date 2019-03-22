import java.util.Scanner;

public class StudentDemo 
{

	public static void main(String[] args) 
	{
		String name, id;
		int y, math, cs,genEd;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the student's name: ");
		name = input.nextLine();
		
		while (name.length() <= 0)
		{
			System.out.println("You must enter at least one letter: ");
			name = input.nextLine();
		}
		
		System.out.println("Enter the student's ID Number: ");
		id = input.nextLine();
		
		while (id.length() <= 0)
		{
			System.out.println("You must enter at least one letter: ");
			id = input.nextLine();
		}
		
		System.out.println("Enter the year the student was admitted: ");
		y = input.nextInt();
		
		while (y < 1987 || y > 2050)
		{
			System.out.println("Incorrect entry.");
			y = input.nextInt();
		}
		
		// Create student
		CompSciStudent csStu = new CompSciStudent(name, id, y);
		
		System.out.println("Enter the math hours already taken: ");
		math = input.nextInt();
		
		while (math < 0)
		{
			System.out.println("Incorrect entry.\n Try again.");
			math = input.nextInt();
		}
		
		// Set math
		csStu.setMathHours(math);

		System.out.println("Enter the computer science hours already taken: ");
		cs = input.nextInt();
		
		while (cs < 0)
		{
			System.out.println("Incorrect entry.\n Try again.");
			cs = input.nextInt();
		}
		
		// Set CS
		csStu.setCsHours(cs);
		
		System.out.println("Enter the general ed hours already taken: ");
		genEd = input.nextInt();
		
		while (genEd < 0)
		{
			System.out.println("Incorrect entry.\n Try again.");
			genEd = input.nextInt();
		}
		
		//set Gen Ed
		csStu.setGenEdHours(genEd);
		
		// Print
		System.out.println(csStu.toString());		
		System.out.println("Hours remaining: " +csStu.getRemainingHours());
		
		input.close();
	}

}

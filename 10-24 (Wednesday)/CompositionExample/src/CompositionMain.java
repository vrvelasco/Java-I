import java.util.Scanner;

public class CompositionMain 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// Instructor
		System.out.println("Enter the instructor's last name: ");
		String lname = input.nextLine();
		
		System.out.println("Enter the instructor's first name: ");
		String fname = input.nextLine();
		
		System.out.println("Enter the instructor's office number: ");
		String office = input.nextLine();
		
		Instructor myInstruct = new Instructor(lname, fname, office);
		
		// Textbook
		System.out.println("Enter the title of the textbook: ");
		String title = input.nextLine();
		
		System.out.println("Enter the name of the author: ");
		String author = input.nextLine();
		
		System.out.println("Enter the name of the publisher: ");
		String publisher = input.nextLine();
		
		Textbook myBook = new Textbook(title, author, publisher);
		
		// Course
		System.out.println("Enter the name of the course: ");
		String course = input.nextLine();
		
		Course myCourse = new Course(course, myInstruct, myBook);
		
		// Display
		System.out.println(myCourse);
	}
	
	

}

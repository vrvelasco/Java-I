import java.util.Scanner;

public class Book 
{
	private String title;
	private String isbn;
	Scanner input = new Scanner(System.in);
	
	public String getTitle()
	{
		while (title.length() <= 0)
		{
			System.out.println("Incorrect entry.\nYou must enter at least one letter.\nTry again.");
			title = input.nextLine();
		}
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getIsbn()
	{
		return isbn;
	}
	public void setIsbn(String isbn)
	{
		while (isbn.length() <= 0)
		{
			System.out.println("Incorrect entry.\nYou must enter at least one letter.\nTry again.");
			isbn = input.nextLine();
		}
		this.isbn = isbn;
	}
	
}

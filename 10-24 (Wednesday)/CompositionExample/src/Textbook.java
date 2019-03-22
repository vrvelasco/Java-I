
public class Textbook 
{
	private String title, author, publisher;
	
	public Textbook(String textTitle, String textAuthor, String textPub)
	{
		set(textTitle, textAuthor, textPub);
	}

	public Textbook(Textbook object1)
	{
		title = object1.title;
		author = object1.author;
		publisher = object1.publisher;
	}
	
	public void set(String textTitle, String textAuthor, String textPub) 
	{
		title = textTitle;
		author = textAuthor;
		publisher = textPub;
	}
	
	public String toString()
	{
		String str = "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher;
		
		return str;
	}
}

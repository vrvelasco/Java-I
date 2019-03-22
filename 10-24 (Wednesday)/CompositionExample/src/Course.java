
public class Course
{
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;
	
	public Course(String name, Instructor instr, Textbook text)
	{
		courseName = name;
		instructor = new Instructor(instr);
		textbook = new Textbook(text);
	}
	
	public String getName()
	{
		return courseName;
	}
	
	public Instructor getInstructor()
	{
		return new Instructor(instructor);
	}
	
	public Textbook getTextbook()
	{
		return new Textbook(textbook);
	}
	
	public String toString()
	{
		String str = "Course name: " + courseName + "\nInstructor information: \n" + instructor + "\nTextbook information: \n" + textbook;
		
		return str;
	}
}

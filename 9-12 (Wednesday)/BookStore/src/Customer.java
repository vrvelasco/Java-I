import java.util.Scanner;

public class Customer
{
	private String name;
	private String address;
	private String phone;
	Scanner input = new Scanner(System.in);
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		while (phone.length() <= 0)
		{
			System.out.println("Incorrect entry.\nYou must enter at least one letter.\nTry again.");
			phone = input.nextLine();
		}
		this.phone = phone;
	}
	
	
}

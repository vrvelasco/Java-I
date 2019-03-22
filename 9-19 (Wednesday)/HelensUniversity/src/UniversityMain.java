import java.util.Scanner;

public class UniversityMain 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// Copies of classes
		Student myStudent = new Student();
		Instructor myInstruct = new Instructor();
		Class myClass = new Class();
		
		// Student Information
		System.out.println("Enter the student's first name: ");
		String fName = input.nextLine();
		myStudent.setfName(fName);
		
		System.out.println("Enter the student's last name: ");
		String lName = input.nextLine();
		myStudent.setlName(lName);
		
		System.out.println("Enter the student's address: ");
		String address = input.nextLine();
		myStudent.setAddress(address);
		
		// Instructor Information
		System.out.println("Enter the instructor's first name: ");
		myInstruct.setiFirst(input.nextLine());
		
		System.out.println("Enter the instructor's last name: ");
		myInstruct.setiLast(input.nextLine());
		
		System.out.println("Enter the instructor's office number: ");
		myInstruct.setOfficeNo(input.nextLine());
		
		// Class Information
		System.out.println("Enter the course number: ");
		myClass.setClassNum(input.nextLine());
		
		System.out.println("Enter the course name: ");
		myClass.setClassName(input.nextLine());
		
		System.out.println("Enter the credit hours for the course: ");
		myClass.setCreditHours(input.nextInt());
		
		// Display Information
		System.out.println("Student: " + myStudent.getfName() + " " + myStudent.getlName());
		System.out.println("Address: " + myStudent.getAddress() + "\nInstructor: " + myInstruct.getiFirst() + " " + myInstruct.getiLast()
		+ "\nOffice Number: " + myInstruct.getOfficeNo() + "\nClass Number: " + myClass.getClassNum() + "\nClass Name: " + myClass.getClassName()
		+ "\nCredit Hours: " + myClass.getCreditHours());
	}

}

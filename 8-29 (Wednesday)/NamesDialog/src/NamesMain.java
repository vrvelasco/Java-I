import javax.swing.JOptionPane;
public class NamesMain {

	public static void main(String[] args) {
		// Variables
		String firstName, lastName;
		
		// Input
		firstName = JOptionPane.showInputDialog("What is your first name?");
		lastName = JOptionPane.showInputDialog("What is your last name?");
		
		// Display
		JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
		
		// Tell it to exit
		System.exit(0);
	}

}

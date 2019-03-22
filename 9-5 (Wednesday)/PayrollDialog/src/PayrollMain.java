import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PayrollMain 
{

	public static void main(String[] args) 
	{
		String name, inputStr;
		double hours, payRate, grossPay;
		DecimalFormat dollar = new DecimalFormat ("#,##0.00"); // Format decimal (# = placeholder for numbers)
		
		name = JOptionPane.showInputDialog("What is your name? ");
		// Get hours and parse it
		inputStr = JOptionPane.showInputDialog("How many hours did you work? ");
		hours = Double.parseDouble(inputStr);
		// Get Pay Rate and parse it
		inputStr = JOptionPane.showInputDialog("What is your hourly pay rate? ");
		payRate = Double.parseDouble(inputStr);
		
		if (hours > 40)
		{
			double otHours = hours - 40;
			double otPay = otHours * 2.0 * payRate;
			double regPay = 40 * payRate;
			grossPay = regPay + otPay;
		}
		else
			grossPay = hours * payRate;
		
		JOptionPane.showMessageDialog(null, "Hello" + name + ". Your gross pay is $" + dollar.format(grossPay));
		
	}

}

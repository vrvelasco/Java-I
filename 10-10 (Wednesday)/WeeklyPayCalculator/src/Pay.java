
public class Pay
{
	public static double getWeeklyPay(double h, double pr)
	{
		if (h > 40)
		{
			double otHours = h - 40;
			double otPay = otHours * 2.0 *pr;
			return otPay + (40 * pr);
		}
		else
		return h * pr;
	}
	
	public static double getWeeklyPay(double s)
	{
		return s / 52;
	}
}

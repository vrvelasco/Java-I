import java.util.Scanner;

public class EnumMain
{

	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
	
	public static void main(String[] args)
	{
		Day workDay = Day.WEDNESDAY;
		System.out.println(workDay);
		
		Day weekEnd = Day.SATURDAY;
		System.out.println(weekEnd);
		
		if (workDay.ordinal() > weekEnd.ordinal())
		{
			System.out.println(workDay + " is greater than " + weekEnd);
		}
		else
			System.out.println(weekEnd + " is greater than " + workDay);
		
		if (Day.FRIDAY.compareTo(Day.MONDAY) > 0)
			System.out.println(Day.FRIDAY + " is greater than " + Day.MONDAY);
		
			System.out.println("The ordinal of " + Day.SUNDAY + " is " + Day.SUNDAY.ordinal());
		
			weekEnd = Day.SUNDAY;
			System.out.println(weekEnd);
	}

}

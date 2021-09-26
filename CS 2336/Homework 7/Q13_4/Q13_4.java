/*
    Krithika Kannan
    CS 2336.501
    HW 7 - Q13_4
    10/24/2020
*/

//Imports
import java.util.*;//for calender

/*
    This program receives the month and year from the command line and prints
    the calender for the specific month and year.
*/
public class Q13_4
{
	public static void main(String[] args) 
	{
	    //Checks command line
		int argSize = args.length;
		if (argSize != 2) 
		{
			System.out.println("Usage: java Q13_4 month year");
			System.exit(1); //exists if the command line is wrong
		}

		//Creates a new Calendar
		Calendar cal = new GregorianCalendar(Integer.valueOf(args[1]), 
			Integer.valueOf(args[0]) - 1, 1);
		calHeader(cal); //sets up the header
		
		//Prints the calendar
		for (int i = 1; i < cal.get(Calendar.DAY_OF_WEEK); i++) 
		{
			System.out.print("    ");
		}
		while (cal.get(Calendar.DATE) < cal.getActualMaximum(Calendar.DATE)) 
		{
			if (cal.get(Calendar.DAY_OF_WEEK) == 7)
			{
				System.out.printf("%4d\n", cal.get(Calendar.DATE));
			}
			else
			{
				System.out.printf("%4d", cal.get(Calendar.DATE));
			}
			//Next day
			cal.add(Calendar.DATE, 1);
		}
		System.out.printf("%4d\n", cal.get(Calendar.DATE));
	}

	//Header
	public static void calHeader(Calendar cal)
	{
		//Array of months
		String[] months = {"January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"};

		//Format calendar
		int length = 29 / 2 - (months[cal.get(Calendar.MONTH)].length() / 2 + 3);
		for (int i = 0; i < length; i++)
		{
			System.out.print(" ");
		}
		System.out.println(months[cal.get(Calendar.MONTH)] + ", " + 
			cal.get(Calendar.YEAR));

		//Prints after the month and year
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
}
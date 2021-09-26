/*
    Krithika Kannan
    CS 2336.501
    Homework 2 - Question 4.17 
    9/20/20
*/

//Imports
import java.util.Scanner; //to get user input

/*
    This program asks the user to enter the year and a month, it then
    calculates the number of days in the month.
*/
public class Q4_17 {
    public static void main(String args[]) 
    {
        //Asks the user to enter the month and the year
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int inputYear = scan.nextInt();
		System.out.print("Enter a month: ");
		String inputMonth = scan.next();

		//Displays the month and year that the user entered
		System.out.print(inputMonth + " " + inputYear + " has ");
		
		//Checks whether entered year is a leap year
		boolean isLeapYear = ((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0);
		
		//Calculates the number of days in the month
		if (inputMonth.equals("Jan") || inputMonth.equals("Mar") || inputMonth.equals("May") 
		   || inputMonth.equals("Jul") || inputMonth.equals("Aug") || inputMonth.equals("Oct") 
		   || inputMonth.equals("Dec"))
		{
		    System.out.println(31 + " days");
		}
		else if (inputMonth.equals("Apr") ||inputMonth.equals("Jun") || inputMonth.equals("Sep") 
		   || inputMonth.equals("Nov"))
		{
			System.out.println(30 + " days");
		}
		else
		{
		    if(isLeapYear)
		    {
			    System.out.println(29 + " days");
		    }
			else
			{
			    System.out.println(28 + " days");
			}
		}
    }
}
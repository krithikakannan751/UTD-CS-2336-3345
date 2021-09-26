/*
    Krithika Kannan
    CS 2336.501
    Homework 2 - Question 4.21 
    9/20/20
*/

//Imports
import java.util.Scanner; //to get user input

/*
    This program asks the user to enter a social security number in the
    DDD-DD-DDDD format, where D is a digit. It then checks to see if the
    input social security number format is valid.
*/
public class Q4_21 {
    public static void main(String args[]) 
    {
        //Asks user to enter a SSN
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter a SSN: ");
		String ssnInput = scan.nextLine();

		//Checks whether ssn is valid
		boolean ssnValid = 
			(ssnInput.length() == 11) && (Character.isDigit(ssnInput.charAt(0))) &&
			(Character.isDigit(ssnInput.charAt(1))) && (Character.isDigit(ssnInput.charAt(2))) &&
			(ssnInput.charAt(3) == '-') && (Character.isDigit(ssnInput.charAt(4))) &&
			(Character.isDigit(ssnInput.charAt(5))) && (Character.isDigit(ssnInput.charAt(7))) &&
			(ssnInput.charAt(6) == '-') && (Character.isDigit(ssnInput.charAt(8))) &&
			(Character.isDigit(ssnInput.charAt(9))) && (Character.isDigit(ssnInput.charAt(10)));

		//Prints whether the SSN is valid
		if(ssnValid)
		{
		    System.out.println(ssnInput + " is a valid social security number");
		}
		else
		{
		     System.out.println(ssnInput + " is an invalid social security number");
		}
    }
}
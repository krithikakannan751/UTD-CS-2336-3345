/*
    Krithika Kannan
    CS 2336.501
    Homework 1 - Question 3.9 
    9/12/20
*/

//Imports
import java.util.Scanner; //used for scanner inputs

/*
    This program asks the user to enter the first 9 digits of an ISBN-10 number.
    Then the program calculates the last digit, and prints the whole ISBN number.
*/
public class Q3_9 
{
    public static void main(String args[])
    {
        //Asks the user to input a the first 9 digits of an ISBN number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn9Digits = input.nextInt();
		
		//Variables used to loop through the 9 digits
	    int tempIsbn = isbn9Digits; //stores the user input into a temporary variable
	    int digit10 = 0; //stores the calculation of the 10th digit
	    int count = 9; //is a counter for the while loop
	    
	    //Goes through the digits from back to front
	    while(tempIsbn > 0)
	    {
	        digit10 += (tempIsbn % 10) * count;
	        tempIsbn /= 10;
	        count --;
	    }
	    
	    //Finishes the calculation of the 10th digit
	    digit10 %= 11;

		//Prints the 10 digit isbn number 
		System.out.print("The ISBN-10 number is ");
		System.out.print(isbn9Digits);
		if (digit10 == 10) //if the last digit calculation is 10, then X is printed.
		{
			System.out.println("X");
		}
		else	
		{
			System.out.println(digit10);
		}
    }
}
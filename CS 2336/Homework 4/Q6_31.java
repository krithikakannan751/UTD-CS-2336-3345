/*
    Krithika Kannan
    CS 2336.501
    Homework 4 - Question 6.31 
    10/4/20
*/

//Imports 
import java.util.Scanner; //to get user input

/*
    This program prompts the user to enter a credit card number as a long
    integer and displays whether the number is valid or invalid. 
*/
public class Q6_31 {
    public static void main(String args[]) 
    {
        //Ask the user to enter their credit card number
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		long creditCardNumber = scan.nextLong();
        
        //Checks whether card is invalid or valid and then prints the answer
        if(isValid(creditCardNumber))
        {
            System.out.println(creditCardNumber + " is valid");
        }
        else
        {
            System.out.println(creditCardNumber + " is invalid");
        }
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) 
	{
	    //Checks to see if the card number is valid and returns boolean
		boolean isNumValid =
			(getSize(number) >= 13 && getSize(number) <= 16) &&
			(prefixMatched(number, 4) || prefixMatched(number, 5) ||
			prefixMatched(number, 37) || prefixMatched(number, 6)) &&
			((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

		return isNumValid;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) 
	{
	    //Doubles every second digit from left to right and find the sum
		int total = 0;
		String cardNum = number + "";
		for (int i = getSize(number) - 2; i >= 0; i = i - 2) 
		{
			total += getDigit(Integer.parseInt(cardNum.charAt(i) + "") * 2);
		}
		return total;
	}
	
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number)
	{
	    //checks to see if the number is a digit from 0 -9
		if (number < 9)
		{
			return number;
		}
		else
		{
			return number / 10 + number % 10;
		}
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) 
	{
	    //Finds the sum of all odd place digits
		int total = 0;
		String cardNum = number + "";
		for (int i = getSize(number) - 1; i >= 0; i = i - 2) 
		{
			total += Integer.parseInt(cardNum.charAt(i) + "");
		}
		return total;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) 
	{
	    //Calls getPrefix() method to see if the prefixes match
	    boolean result = getPrefix(number, getSize(d)) == d;
		return result;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) 
	{
		String cardNum = d + "";
		return cardNum.length();
	}
	
	/** Return the first k number of digits from number. If the
	* number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) 
	{
		if (getSize(number) > k)  
		{
			String cardNum = number + "";
			return  Long.parseLong(cardNum.substring(0, k));
		}
		return number;
	}
}
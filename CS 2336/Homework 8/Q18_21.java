/*
    Krithika Kannan
    CS 2336.501
    HW 8 - Q18.21
    10/30/2020
*/

//Imports
import java.util.Scanner; //for cin

/*
    This program converts a decimal number into binary.
*/
public class Q18_21 
{
	public static void main(String[] args) 
	{
		//Asks user to enter decimal
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decVal = scan.nextInt();

		//Display the value in binary
		System.out.println("The binary form of " 
			+ decVal + " is " + dec2Bin(decVal));
	}

	//converts decimal to binary
	public static String dec2Bin(int decVal)
	{
		String binary = "";
		return dec2Bin(decVal, binary);
	}

	//recursive method
	public static String dec2Bin(int decVal, String binary) 
	{
		if (decVal / 2 == 0) 
		{
			return (decVal % 2) + binary;
		}
		else
		{
		    //recursion
			return dec2Bin(decVal / 2, (decVal % 2) + binary);
		}
	}
}
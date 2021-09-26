/*
    Krithika Kannan
    CS 2336.501
    Homework 4 - Question 7.15 
    10/4/20
*/

//Imports 
import java.util.Scanner; //to get user input

/*
    This program asks the user to enter 10 digits and returns a new array by eliminating 
    the duplicate values that the user entered.
*/
public class Q7_15 {
    public static void main(String args[]) 
    {
        //Asks the user to enter 10 numbers
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter ten number: ");
		
		//Stores the entered numbers into  an array
		int[] enteredNums = new int[10]; 
		for (int i = 0; i < enteredNums.length; i++)
			enteredNums[i] = scan.nextInt();

		//Maked new array with no duplicated
		int[] noDuplicateNums = eliminateDuplicates(enteredNums);

		// Display the result
		System.out.print("The distinct numbers are:");
		for (int i: noDuplicateNums) 
		{
			if (i > 0) //duplicate numbers are set to -1
			{
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}

	/** eleminate Duplicates returns a new array with duplicate values eliminated */
	public static int[] eliminateDuplicates(int[] list) 
	{
		int[] noDuplicateNums = new int[list.length];
		int count = 0;
		for (int i: list) 
		{
			if (linearSearch(noDuplicateNums, i) == -1) //if item not in list
			{
				noDuplicateNums[count] = i;
				count++;
			}
		}
		return noDuplicateNums;
	}

	//Linear search
	public static int linearSearch(int[] array, int numFind) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			if (numFind == array[i])
			{
				return i; //if number found
			}
		}
		return -1; //if number not found
	}
}
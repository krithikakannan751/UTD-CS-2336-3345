/*
    Krithika Kannan
    CS 2336.501
    Homework 4 - Question 7.19
    10/4/20
*/

//Imports 
import java.util.Scanner; //for user input

/*
    This program prompts the user to enter a list and displays whether 
    the list is sorted or not.
*/
public class Q7_19 {
    public static void main(String args[]) 
    {
        //Asks the user to enter a list
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter list: ");
		
		//Stores the list into an array
		int[] arr = new int[scan.nextInt()]; //first int is the length of the list
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}

		//calculates whether sorted or not
		if(isSorted(arr))
		{
		    System.out.println("The list is already sorted");
		}
		else
		{
		    System.out.println("The list is not sorted");
		}
	}

	//returns true if the array is sorted in ascending order
	public static boolean isSorted(int[] arr) 
	{
		for (int i = 0; i < arr.length - 1; i++) 
		{
			if (arr[i] > arr[i + 1])
			{
				return false;
			}
		}
		return true;
	}
}
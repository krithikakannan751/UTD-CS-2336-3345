/*
    Krithika Kannan
    CS 2336.501 
    HW 6 - Q11_11
    10/18/2020
*/

//Import
import java.util.Scanner; //for cin
import java.util.ArrayList; //for Arraylist

/*
    This program calculates the sum of an arraylist
*/
public class Q11_12
{
	public static void main(String[] args)
	{
		// Create an ArrayList
		ArrayList<Double> list = new ArrayList<Double>();

		// Prompt the user to enter 5 numbers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) 
		{
			list.add(input.nextDouble());
		}

		// Display the sum of the list
		System.out.println("Sum of list: " + sum(list));
	}

	//Calculates sum of arraylist
	public static double sum(ArrayList<Double> list) 
	{
		double sum = 0;
		for (int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		return sum;
	}
}
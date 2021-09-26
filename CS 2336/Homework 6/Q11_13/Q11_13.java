/*
    Krithika Kannan
    CS 2336.501 
    HW 6 - Q11_13
    10/18/2020
*/

//Import
import java.util.Scanner; //for cin
import java.util.ArrayList; //for Arraylist

/*
    This program removes duplicates from an array list
*/
public class Q11_13
{
	public static void main(String[] args) 
	{
        // Create an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt ther user to enter 10 integers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) 
		{
			list.add(input.nextInt());
		}

		// Invoke removeDuplicate method
		removeDuplicate(list);

		// Display the distinct integers
		System.out.print("The unique integers are ");
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	//Removes duplicates
	public static void removeDuplicate(ArrayList<Integer> list) 
	{
		for (int i = 0; i < list.size() - 1; i++) 
		{
			for (int j = i + 1; j < list.size(); j++) 
			{
				if (list.get(i) == list.get(j))
				{
					list.remove(j);
					i--;
					j--;
				}
			}
		}
	}
}
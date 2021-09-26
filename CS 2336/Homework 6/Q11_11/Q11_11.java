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
    This program sorts an array list of integers in ascending order
*/
public class Q11_11
{
	public static void main(String[] args)
	{
		// Create an ArrayList of Integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter 5 numbers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) 
		{
			list.add(input.nextInt());
		}

		// Display list in increasing order
		sort(list);
		System.out.println(list.toString());
	}
	
	//sort method
	public static void sort(ArrayList<Integer> list) 
	{
	    int count = list.size();
	    int temp; 
		for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) 
            { 
                if (list.get(i) > list.get(j)) 
                {
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }
        }		
	}
}
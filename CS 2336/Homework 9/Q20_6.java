/*
    Krithika Kannan
    CS 2336.501
    Homework 9 - Q20_6
    11/8/20
*/

//Imports
import java.util.*;

/*
    This program stores 5 million integers in a linked list and tests the time 
    to traverse the list using an iterator vs. using the get(index) method.
*/
public class Q20_6 
{
	public static void main(String[] args) 
	{
		//Stores 5000000 int into a list
		List<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < 5000000; i++) 
		{
			arrList.add(i);
		}
		LinkedList<Integer> list = new LinkedList<>(arrList);

		//Using an iterator
		long iteratorStartTime = System.currentTimeMillis();
		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) 
		{
			listIterator.next();
		}
		long iteratorEndTime = System.currentTimeMillis();
		System.out.println("Time to go through a list of 5000000 elements using an iterator:"
			 + (iteratorEndTime - iteratorStartTime) + " milli seconds");

		//Using the get(index) method 
		long timerStart = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) 
		{
			list.get(i);
		}
		long timerEnd = System.currentTimeMillis();
		System.out.println("Time to go through a list of 5000000 elements using get(index) method:"
			+ (timerEnd - timerStart) + " milli seconds");
	}
}

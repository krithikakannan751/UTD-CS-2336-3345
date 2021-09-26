/*
    Krithika Kannan
    CS 2336.501
    HW 8 - Q19.7
    10/30/2020
*/

/*
    This program performs a binary search.
*/
public class Q19_7
{
	public static <E extends Comparable<E>>
			int binarySearch(E[] list, E key) 
	{
		int low = 0;
		int high = list.length - 1;

		while (high >= low)
		{
			int mid = (low + high / 2);
			if (key.compareTo(list[mid]) < 0) //left side
			{
				high = mid - 1;
			}
			else if (key.compareTo(list[mid]) == 0) //if element is in the middle
			{
				return mid;
			}
			else //right side
			{
				low = mid + 1;
			}
		}
		return -low - 1;
	}
}
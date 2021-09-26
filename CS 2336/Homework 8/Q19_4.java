/*
    Krithika Kannan
    CS 2336.501
    HW 8 - Q19.4
    10/30/2020
*/

/*
    This program performs a linear search.
*/
public class Q19_4
{
	public static <E extends Comparable<E>>
			int linearSearch(E[] list, E key) 
	{
		for (int i = 0; i < list.length; i++) 
		{
			if (key.compareTo(list[i]) == 0)
				return i;
		}
		return -1;
	}
}
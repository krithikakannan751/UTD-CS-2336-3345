/*
    Krithika Kannan
    CS 2336.501
    Homework 4 - Question 7.16 
    10/4/20
*/

/*
    This program randomly generates an array of 100,000 integers and a key. 
    It estimates the execution time of invoking the linearSearch method and 
    the execution time of invoking the binarySearch method.
*/
public class Q7_16 {
    public static void main(String args[]) 
    {
       //generates an array of 100,000 numbers and a key
		int[] generatedArr = new int[10000];
		for (int i = 0; i < generatedArr.length; i++) 
		{
			generatedArr[i] = randomIntGenerated();
		}
		int key = randomIntGenerated();
		
		//Execution time of linearsort
		long startTime = System.currentTimeMillis();
		int result = linearSearch(generatedArr, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the linearSearch in milliseconds: " 
			+ executionTime);
			
		//Execution time of binarySearch
		selectionSort(generatedArr); //sorts array
		startTime = System.currentTimeMillis();
		result = binarySearch(generatedArr, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the binarySearch in milliseconds: " 
			+ executionTime);
	}

	//get a random integer
	public static int randomIntGenerated()
	{
		return (1 + (int)(Math.random() * 100000));
	}

	//linear search
	public static int linearSearch(int[] array, int key)
	{
		for (int i = 0; i < array.length; i++) 
		{
			if (key == array[i]) //if key is found
				return i;
		}
		return -1; //if key is not found
	}

	//binary search
	public static int binarySearch(int[] array, int key)
	{
		int low = 0;
		int high = array.length - 1;
		
		while (high >= low) 
		{
			int mid = (low + high) / 2;
			
			if (key < mid)
			{
				high = mid - 1;
			}
			else if (key == mid)
			{
				return mid; //if the num is found
			}
			else
			{
				low = mid + 1;
			}
		}
		return -low -1; // if the num is not found
	}

	//Selection Sort
	public static void selectionSort(int[] array) 
	{
		for (int i = 0; i < array.length-1; i++) 
		{
		    //Finds min
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) 
			{
				if (array[j] < array[minIndex])
				{
					minIndex = j;
				}
			}
            
            //Swap
			int temp = array[minIndex]; 
            array[minIndex] = array[i]; 
            array[i] = temp; 
		}
	}
}
/*
    Krithika Kannan
    CS 2336.501
    Homework 6 - Q10.6 
    10/17/2020
*/

/*
    The Q10_6.java class is a tester class that prints all prime numbers until 
    120 in reverse.
*/
public class Q10_6 
{
	public static void main(String[] args) 
	{
		//Creates an integer stack with default capacity of 16
		StackOfIntegers intStack = new StackOfIntegers();

		//Pushes prime numbers less than 120 to the stack
		for (int i = 2; i < 120; i++)
		{
			if (isPrime(i))
			{
				intStack.push(i);
			}
		}

		//Displays the numbers in decreasing order
		System.out.println(
			"\nPrinting all prime numbers less than 120 in decreasing order:");
		while (!intStack.empty()) 
		{
			System.out.print(intStack.pop() + " ");
		}
		System.out.println();
	}

	//Returns true if prime number is found
	public static boolean isPrime(int x) 
	{
		for (int i = 2; i <= x / 2; i++) 
		{
			if (x % i == 0) 
				return false;
		}
		return true;
	}
}
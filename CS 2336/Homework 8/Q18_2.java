/*
    Krithika Kannan
    CS 2336.501
    HW 8 - Q18.2
    10/30/2020
*/

//Imports
import java.util.Scanner; //for cin

/*
    This program that prompts the user to enter an index and displays its 
    Fibonacci number, using iterations.
*/
public class Q18_2 
{
	public static void main(String[] args)
	{
        //Asks user to enter a number
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an index(integer): ");
		int indexNumb = scan.nextInt();

		//Display Fibonacci number
		System.out.println("The Fibonacci number at index " 
			+ indexNumb + " is " + fib(indexNumb));

	}

	//Method for finding fibonacci pattern
	public static long fib(long index) 
	{
		long f0 = 0; //For fib(0)         
		long f1 = 1; //For fib(1)
		long currentFib = 0;  

		if (index == 0)
		{
			return f0;
		}
		else if (index == 1)
		{
			return f1;     
		}
        else 
        {
			for (int i = 1; i < index; i++) 
			{
				currentFib = f0 + f1;     
				f0 = f1;                  
				f1 = currentFib;          
			} 
			return currentFib;                            
        }                       
	}
}
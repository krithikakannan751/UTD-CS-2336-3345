/*
    Krithika Kannan
    CS 2336.501
    HW 8 - Q18.8
    10/30/2020
*/

//Imports
import java.util.Scanner; //for cin

/*
    This program asks a user to enter an int and then reverses the numbers.
*/
public class Q18_8
{
	public static void main(String[] args) 
	{
		//Ask user to enter an int
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int intVal = scan.nextInt();

		//Display reverse value
		reverseDisplay(intVal);
	}

	//Method to reverse number
	private static void reverseDisplay(int intVal)
	{
		if (intVal < 10)
		{
			System.out.println(intVal);
		}
		else 
		{ 
			System.out.print(intVal % 10);
			//recusrsion
			reverseDisplay(intVal / 10);
		}
	}
}
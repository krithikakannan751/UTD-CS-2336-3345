/*
    Krithika Kannan
    CS 2336.501
    HW 8 - Q19.2
    10/30/2020
*/

//Imports
import java.util.Scanner; //for cin

/*
    This is a tester class.
*/
public class Q19_2 
{
	public static void main(String[] args)
	{
		//Asks user to enter 5 strings
		Scanner scan = new Scanner(System.in);
		GenericStack<String> stack = new GenericStack<>(); 
        System.out.print("Enter 5 strings: ");
		for (int i = 0; i < 5; i++) 
		{
			stack.push(scan.next());
		}
		
		//Display inputs in reverse order
		while (!stack.isEmpty())
		{
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}
}
/*
    Krithika Kannan
    CS 2336.501
    Homework 5 - Question 9.10
    Q9_10.java
    10/10/20
*/

//Imports
import java.util.Scanner; //to get user input

/*
    Tester class
*/
public class Q9_10 
{
	public static void main(String[] args) 
	{
	    //Ask user to enter a b and c
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		// Create a QuadraticEquation object
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

		//Calculates roots
		System.out.print("The equation has ");
		if (quadraticEquation.getDiscriminant() < 0)
		{
			System.out.println("no real roots");
		}
		else if (quadraticEquation.getDiscriminant() > 0)
		{
			System.out.println("two roots " + quadraticEquation.getRoot1() + 
				" and " + quadraticEquation.getRoot2());
		}
		else 
		{
			System.out.println("one root " + (quadraticEquation.getRoot1() > 0 ? 
				quadraticEquation.getRoot1() : quadraticEquation.getRoot2()));
		}
	}
}
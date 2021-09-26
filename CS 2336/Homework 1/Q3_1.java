/*
    Krithika Kannan
    CS 2336.501
    Homework 1 - Question 3.1 
    9/12/20
*/

//Imports
import java.util.Scanner; //used for scanner inputs
import java.lang.Math; //used for Math.pow
import java.text.DecimalFormat; //used to format decimals for output

/*
    This program asks the user to enter the coefficients a, b, and c from a
    quadratic equation. Using the quadratic formula, the quadratic roots of the 
    equation is then calculated.
*/
public class Q3_1 
{
    public static void main(String args[]) 
    {
        //Varibles to store user input
	    double a; 
	    double b; 
	    double c;
	    
	    //Variables to calculate the discriminant and roots
		double quadraticDiscriminant;
		double r1;
		double r2;
		
		//Asks user to enter a, b, and c
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		//Calculates discriminant using b^2-4ac
		quadraticDiscriminant = Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5);
		
		//Creates a DecimalFormat Object
		DecimalFormat df = new DecimalFormat("0.######");
		
		//Calculating the roots of the equation based on the discriminant
		if (quadraticDiscriminant > 0) //if the discriminant is positive
		{
		    r1 = (-b + quadraticDiscriminant) / (2 * a); //calculates first root
			r2 = (-b - quadraticDiscriminant) / (2 * a); //calculates second root
			System.out.println("The equation has two roots " + df.format(r1) + 
			                   " and "+ df.format(r2));
		} 
		else if (quadraticDiscriminant == 0)//if the disciminant is equal to 0
		{
			r1 = -b / (2 * a); //calculates root
			System.out.println("The equation has one root " + df.format(r1));
		} 
		else //if the discriminant is negative
		{
			System.out.println("The equation has no real roots");
		}	
    }
}
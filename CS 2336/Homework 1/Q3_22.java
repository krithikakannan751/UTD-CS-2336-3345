/*
    Krithika Kannan
    CS 2336.501
    Homework 1 - Question 3.22
    9/12/20
*/

//Imports
import java.util.Scanner; //used for scanner inputs
import java.lang.Math; //used for Math.pow

/*
    This program asks the user to enter a point (x,y). It then checks to see if 
    the entered point lies within a circle of radius 10, centered at the origin.
*/
public class Q3_22
{
    public static void main(String args[]) 
    {
        //Asks user to enter coordinates of a point
	    System.out.println("Enter a point with two coordinates: ");
	    Scanner input = new Scanner(System.in);
	    
	    //Reads the x and y value inputs
	    double xVal = input.nextDouble();
	    double yVal = input.nextDouble();
	    
	    //Computes the distance from the center of the circle to the input point
	    double calcDistance = Math.pow((Math.pow(xVal,2) + Math.pow(yVal,2)), 0.5);
	    
	    //Checks to see if the calculated distance of the point is in the circle
	    if(calcDistance <=10) //if the distance is equal or less than 10
	    {
	        System.out.println("Point (" + xVal + ", " + yVal +") is in the circle");
	    }
	    else
	    {
	        System.out.println("Point (" + xVal + ", " + yVal +") is not in the circle");
	    }
    }
}
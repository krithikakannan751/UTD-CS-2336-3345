/*
    Krithika Kannan
    CS 2336.501
    Homework 1 - Question 3.28
    9/12/20
*/

//Imports
import java.util.Scanner; //used for scanner inputs
import java.lang.Math; //used for Math.abs

/*
    This program asks the user to enter the center x and y coordinates, width, 
    and height of two rectangle.The program then calculates whether the first 
    rectangle is inside, overlapping, or not overlapping the second rectangle.
*/
public class Q3_28
{
    public static void main(String args[]) 
    {
        //Creates scanner Object
	    Scanner input = new Scanner(System.in);
	    
	    /*Asks the user to enter the center x and y-coordinates, width, and height
	    for the first rectangle*/
	    System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        
        /*Asks the user to enter the center x and y-coordinates, width, and height
	    for the second rectangle*/
        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        
        //Calculates the distance between the centers of the two rectangles
        double xDist = Math.abs(x1 - x2);
        double yDist = Math.abs(y1 - y2);
        
        /*Calculates the absolute difference between the widths and heights of the
        two rectangles*/
        double xWidthDiff = Math.abs(w1 - w2);
        double yHeightDiff = Math.abs(h1 - h2);
        
        /*Calculates the absolute sum between the widths and heights of the
        two rectangles*/
        double xWidthSum = Math.abs(w1 + w2);
        double yHeightSum = Math.abs(h1 + h2);
        
        //Checks to see if the rectangles are inside each other
        if((xDist <= (xWidthDiff/2)) && (yDist <= (yHeightDiff/2))) //if rectangle is inside
        {
            if (h1 > h2) //only need to check either height or width
            {
                System.out.println("r2 is inside r1");
            }
            else if(h2 > h1) //only need to check either height or width
            {
                System.out.println("r1 is inside r2");
            }
        }
        else if((xDist <= (xWidthSum/2)) && (yDist <= (yHeightSum/2))) //if rectangle overlaps
        {
            System.out.println("r2 overlaps r1");
        }
        else //if rectangles do not overlap
        {
            System.out.println("r2 does not overlap r1");
        }
    }
}
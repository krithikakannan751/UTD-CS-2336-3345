/*
    Krithika Kannan
    CS 2336.501
    Homework 4 - Question 7.11 
    10/4/20
*/

//Imports 
import java.util.Scanner; //to get user input

/*
    This program calculates the standard deviation and mean of 10
    numbers that the user enters.
*/
public class Q7_11 {
    public static void main(String args[]) 
    {
        //Asks user to enter 10 numbers
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter ten numbers: ");
        
        //An array to store the 10 entered numbers
		double[] inputArr = new double[10];
		for (int i = 0; i < inputArr.length; i++)
		{
			inputArr[i] = scan.nextDouble();
		}

		//Calculates the mean and Standard deviation
		System.out.printf("The mean is %.2f%n" , mean(inputArr));
		System.out.printf("The standard deviation is %.5f%n", deviation(inputArr));
	}

	/** Compute the deviation of double values */
	public static double deviation(double[] x) 
	{
		double deviationCalc = 0;
		double mean = mean(x); //finds the mean from mean() method
		for (double i: x) 
		{
			deviationCalc += Math.pow(i - mean, 2);
		}
		return Math.sqrt(deviationCalc / (x.length - 1));
	}

	/** Compute the mean of an array of double values */
	public static double mean(double[] x) 
	{
		double mean = 0;
		for (double i: x) 
		{
			mean = mean + i;
		}
		return (mean / x.length);
	}
}
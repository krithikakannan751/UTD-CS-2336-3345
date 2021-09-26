/*
    Krithika Kannan
    CS 2336.501
    Homework 3 - Question 5.23 
    9/27/20
*/

/*
Write a program that compares the results of the summation of the series, 
1 + 1 / 2 +  1 / 3 + ... +  1 / n, computing from left to right and from 
right to left with n = 50000.
*/
public class Q5_23 {
    public static void main(String args[]) 
    {
        //Calculates the series output from right to left
		double sumRightToLeft = 0.0;
		for (double i = 50000.0; i >= 1.0; i--)
		{
			sumRightToLeft += 1 / i;
		}
		System.out.println("Summation of series right to left: " + sumRightToLeft);
		
		//Calculates the series output from left to right
		double sumLeftToRight = 0.0;
		for (double i = 1.0; i <= 50000.0; i++)
		{
			sumLeftToRight += 1 / i;
		}
		System.out.println("Summation of series left to right: " + sumLeftToRight);

		//Difference between the series output from left to right and right to left
		System.out.println("Difference between both the outputs: " 
			+ (sumRightToLeft - sumLeftToRight));
    }
}
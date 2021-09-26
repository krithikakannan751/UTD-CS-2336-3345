/*
    Krithika Kannan
    CS 2336.501
    Homework 3 - Question 5.21 
    9/27/20
*/

//Imports
import java.util.Scanner; //to get user input

/*
This program asks the user to enter the loan amount and loan period(in number of years) 
and displays the monthly and total payments for each interest rate starting from 5% 
to 8%, with an increment of 1/8.
*/
public class Q5_21 {
    public static void main(String args[]) 
    {
        //Asks the user to enter the loan amount and period
        Scanner scan = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = scan.nextDouble();
		System.out.print("Number of Years: ");
		int loanPeriod = scan.nextInt();


		//Prints the display for the table
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
		//Variables to store the monthly interest rate and Payment
		double interestRate = 0;
		double payment = 0;
		
		//Calculate and display the interest rates
		for (double i = 5.0; i <= 8; i += 0.125) 
		{
			System.out.printf("%-5.3f", i);
			System.out.print("%           ");
			interestRate = i / 1200;
			payment = loanAmount * interestRate / (1- 1 / Math.pow(1 + interestRate, loanPeriod * 12));
			System.out.printf("%-19.2f", payment);
			System.out.printf("%-8.2f\n",(payment * 12) * loanPeriod);
		}
    }
}
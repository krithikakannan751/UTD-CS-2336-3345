/*
    Krithika Kannan
    CS 2336.501
    Homework 3 - Question 5.22 
    9/27/20
*/

//Imports
import java.util.Scanner; //to get user input

/*
This program asks the user to enter the loan amount, number of years, and interest
rate and displays the amortization schedule for the loan.
*/
public class Q5_22 {
    public static void main(String args[]) 
    {
        //Asks user to enter loan amount, loan period, and annual interest rate
		Scanner scan = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = scan.nextDouble();
		System.out.print("Number of Years: ");
		int loanPeriod = scan.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = scan.nextDouble();

		//Calculation for monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		//Calculation for monthly payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / 
								Math.pow(1 + monthlyInterestRate, loanPeriod * 12));
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);

		//Calculation for total payment
		System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * loanPeriod);

		//Prints schedule
		double principal = 0;
		double interest = 0;
		double balance = loanAmount;
		System.out.println("Payment#     Interest     Principal     Balance");
		for (int i = 1; i <= loanPeriod * 12; i++) 
		{
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance -= principal;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
    	}
    }
}
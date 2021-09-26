/*
    Krithika Kannan
    CS 2336.501
    Homework 5 - Question 9.7
    Q9_7.java
    10/10/20
*/

/*
    Tester class to create new account
*/
public class Q9_7 
{
	public static void main(String[] args) 
	{
		// Create an Account with ID of 1122, and a balance of $20,000
		Account account = new Account(1122, 20000);

		// Set annual interest rate of 4.5%
		account.setAnnualInterestRate(4.5);

		// Withdraw $2,500
		account.withdraw(2500);

		// Deposit $3,000
		account.deposit(3000);

		// Display Account info
		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", 
			account.getMonthlyInterest());
	}
}

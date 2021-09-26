/*
    Krithika Kannan
    CS 2336.501
    Homework 5 - Question 9.7
    Account.java
    10/10/20
*/

//Imports
import java.util.Date; //Date class

/*
    Creates an Account object based on id, balcnce, annual interest rate, and Date
    created
*/
public class Account 
{
	//Variables
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	// Constructors
	//With no arguements
	Account() 
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}

	//With arguements
	Account(int newId, double newBalance) 
	{
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	// Mutator methods
	//Set ID
	public void setId(int newId) 
	{
		id = newId;
	}

	//Set balance
	public void setBalance(double newBalance) 
	{
		balance = newBalance;
	}

	//Set annualInterestRate
	public void setAnnualInterestRate(double newAnnualInterestRate) 
	{
		annualInterestRate = newAnnualInterestRate;
	}

	// Accessor methods
	//Return ID
	public int getId() 
	{
		return id;
	}

	//Return Balance
	public double getBalance() {
		return balance;
	}

	//Return annualInterestRate
	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}

	//Return dateCreated
	public String getDateCreated()
	{
		return dateCreated.toString();
	}

	//Return monthly interest rate
	public double getMonthlyInterestRate() 
	{
		return annualInterestRate / 12;
	}

	//Return monthly interest
	public double getMonthlyInterest()
	{
		return balance * (getMonthlyInterestRate() / 100);
	}

    //Other Methods
	//Decrease balance by amount
	public void withdraw(double amount) 
	{
		balance -= amount;
	}

	//Increase balance by amount
	public void deposit(double amount) 
	{
		balance += amount;
	}
}
/*
    Krithika Kannan
    CS 2336.501
    Homework 2 - Question 4.23 
    9/20/20
*/

//Imports
import java.util.Scanner; //to get user input
import java.text.DecimalFormat; //to format decimals

/*
    This program calculates a payroll statement for an employee that includes their gross
    pay, federal witholding deductions, state withholding deductions, total deductions,
    and net pay, based on the user's input of employee's name, number of hours worked,
    hourly pay rate, federal tax withholding rate, and state tax withholding rate.
*/
public class Q4_23 {
    public static void main(String args[]) 
    {
        //Asks the user to enter payroll information
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter employee’s name: ");
		String inputName = scan.next();	
		System.out.print("Enter number of hours worked in a week: ");
		double inputHoursWorked = scan.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double inputHourlyPayRate = scan.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double inputFederalTaxRate = scan.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double inputStateTaxRate = scan.nextDouble();
        
        //Used to format decimals
        DecimalFormat df = new DecimalFormat("0.00");
        
		//Variables to store calculations
		double calcGrossPay;
		double calcFederalDeduction;
		double calcStateDeduction;
		double calcTotalDeduction;
		double calcNetPay;
		
		//Calculations
		calcGrossPay = inputHoursWorked * inputHourlyPayRate;
		calcFederalDeduction = calcGrossPay * inputFederalTaxRate;
		calcStateDeduction = calcGrossPay * inputStateTaxRate;
		calcTotalDeduction = calcFederalDeduction + calcStateDeduction;
		calcNetPay = calcGrossPay - calcTotalDeduction;
		
		//Prints the payroll for the employee
		System.out.println("Employee Name: " + inputName + "\nHours Worked: " +  df.format(inputHoursWorked) +
			"\nPay Rate: $" + inputHourlyPayRate + "\nGross Pay: $" + df.format(calcGrossPay) +
			"\nDeductions:\n   Federal Witholding (20.0%): $" + df.format(calcFederalDeduction) + 
			"\n   State Witholding (9.0%): $" + df.format(calcStateDeduction) +
			"\n   Total Deduction: $" + df.format(calcTotalDeduction) +
			"\nNet Pay: $" + df.format(calcNetPay));
    }
}
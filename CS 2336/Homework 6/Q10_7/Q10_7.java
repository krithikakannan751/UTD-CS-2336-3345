/*
    Krithika Kannan
    CS 2336.501
    Homework 6 - Question 10.7
    10/17/20
*/

//Imports
import java.util.Scanner; //for cin/cout

/*
    Q10_7 is the tester class which mimics an ATM machine
*/
public class Q10_7
{
	public static void main(String[] args)
	{
		 //Create 10 accounts
		Account[] accounts = new Account[10];
		initialBalance(accounts);
		
		//Menu starts
	    Scanner in = new Scanner(System.in);
		do 
		{
			//User enters id
			System.out.print("Enter an id: ");
			int accId = in.nextInt();

			if (isValidID(accId, accounts)) 
			{
			    //Gets user choice
				int userChoice;
				do 
				{	
					userChoice = displayMainMenu(in);
					if (isTransaction(userChoice)) 
					{
							executeTransaction(userChoice, accounts, accId, in);
					}
				} while (userChoice != 4); //exists
			}
		} while (true); //Asks for id again
	}

    //Shows main menu
	public static int displayMainMenu(Scanner input)
	{
		System.out.print(
			"\nMain menu\n1: check balance\n2: withdraw" +
			"\n3: deposit\n4: exit\nEnter a choice: ");
		return input.nextInt();
	}
	
	//Checs if user choice is a transaction
	public static boolean isTransaction(int choice)
	{
		return choice > 0 && choice < 4;
	}

	// Initialize accounts
	public static void initialBalance(Account[] a) 
	{
		int initialBalance = 100;
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = new Account(i, initialBalance);
		}
	}
	
	//Checks if id is valid
	public static boolean isValidID(int id, Account[] a)
	{
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getId())
				return true;
		}
		return false;
	}

	//Goes through transaction
	public static void executeTransaction(
		int x, Account[] a, int accId, Scanner in) 
	{
		switch (x)
		{
			case 1: // current balance
					  System.out.println("The balance is " + a[accId].getBalance());
					  break;
			case 2: // Withdraw
					  System.out.print("Enter the amount to withdraw: "); 
					  a[accId].withdraw(in.nextDouble());
					  break;
			case 3: // Deposit\
					  System.out.print("Enter the amount to deposit: "); 
					  a[accId].deposit(in.nextDouble());
		}
	}
}
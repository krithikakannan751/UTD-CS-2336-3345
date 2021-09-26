/*
    Krithika Kannan
    CS 2336.501
    Homework 5 - Question 9.2
    Stock.java
    10/10/20
*/

/*
    The Stock class create an object based on it's name and symbol
*/
public class Stock 
{
    //Variables
	String symbol; // The stock's symbol
	String name;   // The stock's name
	double previousClosingPrice; // The stock price for the previous day
	double currentPrice; // The stock price for the current time

	//Constructor with arguements
	Stock(String newSymbol, String newName) 
	{
		symbol = newSymbol;
		name = newName;
	}

	//Return the percentage changed
	double getChangePercent() 
	{
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}
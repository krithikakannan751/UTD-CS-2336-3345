/*
    Krithika Kannan
    CS 2336.501
    Homework 5 - Question 9.2
    Q9_2.java
    10/10/20
*/

/*
    Tester class to make a new stock object
*/
public class Q9_2
{
    public static void main(String[] args) 
    {
		//Creates new stock object
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;

		//Display the price-change percentage
		System.out.println("\nStock name: " + stock.name);
		System.out.println("Stock symbol: " + stock.symbol);
		System.out.printf("Price-change percentage: %.2f%%\n", stock.getChangePercent());
	}
}
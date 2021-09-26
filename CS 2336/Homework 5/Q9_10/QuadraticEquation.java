/*
    Krithika Kannan
    CS 2336.501
    Homework 5 - Question 9.10
    QuadraticEquation.java
    10/10/20
*/

/*
   Creates a Quadratic equation based on coefficients 
*/
public class QuadraticEquation 
{
	//Variables
	private double a;
	private double b;
	private double c;

    //Constructor with argements
	QuadraticEquation(double a, double b, double c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//Accessor methods
	//Returns a
	public double getA() 
	{
		return a;
	}

	//returs b
	public double getB() 
	{
		return b;
	}

	//Returns c
	public double getC()
	{
		return c;
	}

	//returns discriminant
	public double getDiscriminant()
	{
		return Math.pow(b, 2) - 4 * a * c;
	}

	//returns first root
	public double getRoot1()
	{
		return getDiscriminant() < 0 ? 0 :
			((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}

	//returns second root
	public double getRoot2() 
	{
		return getDiscriminant() < 0 ? 0 :
			((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}
}
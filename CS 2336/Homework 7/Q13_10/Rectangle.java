/*
    Krithika Kannan
    CS 2336.501
    HW 7 - Q13_10
    10/24/2020
*/

/*
    The Rectangle class creates a Rectangle object
*/
public class Rectangle extends GeometricObject implements Comparable<Rectangle> 
{
    //Instance Variables
	private double width;
	private double height;
    
    //Constructor
	public Rectangle() 
	{
	    
	}
    
    //Overloaded Constructors
	public Rectangle(double width, double height) 
	{
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) 
	{
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

    //accessor methods
	//Return width
	public double getWidth() 
	{
		return width;
	}

	//Return height
	public double getheight()
	{
		return height;
	}
    
    //Return area
	@Override
	public double getArea() 
	{
		return width * height;
	}

    //Return perimeter
	@Override
	public double getPerimeter()
	{
		return 2 * (width * height);
	}
    
    //mutator methods
    //Set a new width
	public void setWidth(double width)
	{
		this. width = width;
	}
	
	//Set a new height
	public void setheight(double height)
	{
		this.height = height;
	}
	
	//other methods
	//compareTo
	@Override
	public int compareTo(Rectangle o) 
	{
		if (getArea() > o.getArea())
		{
			return 1;
		}
		else if (getArea() < o.getArea())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
    
    //equals
	@Override 
	public boolean equals(Object o) 
	{
		return this.compareTo((Rectangle)o) == 0;
	}

    //toString
	@Override 
	public String toString()
	{
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}
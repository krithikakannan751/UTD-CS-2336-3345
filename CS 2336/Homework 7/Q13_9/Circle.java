/*
    Krithika Kannan
    CS 2336.501
    HW 7 - Q13_9
    10/24/2020
*/

/*
    The Circle class creates a circle object
*/
public class Circle extends GeometricObject implements Comparable<Circle> 
{
    //Instance variables
	private double radius;

    //Constructor
	public Circle() 
	{
	    
	}
    
    //Overloaded constructors
	public Circle(double radius) 
	{
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) 
	{
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
    
    //Accessor Methods
	//gets radius
	public double getRadius() 
	{
		return radius;
	}
    
    //gets area
	@Override 
	public double getArea()
	{
		return radius * radius * Math.PI;
	}

	//gets diameter
	public double getDiameter() 
	{
		return 2 * radius;
	}

    //gets perimeter
	@Override
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	
	//mutator method
	//sets radius
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

    //other methods
    //checks if radii are the same for 2 objects
	@Override 
	public boolean equals(Object o) 
	{
		return this.compareTo((Circle)o) == 0;
	}

    //compare to
	@Override 
	public int compareTo(Circle o)
	{
		if (this.radius > o.radius)
		{
			return 1;
		}
		else if (this.radius < o.radius)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

    //to string
	@Override
	public String toString()
	{
		return super.toString() + "\nDate created: " + getDateCreated() +
			"\nRadius: " + radius;
	}
}
/*
    Krithika Kannan
    CS 2336.501
    Homework 5 - Question 9.1
    Rectangle.java
    10/4/20
*/

/*
    The Rectangle class defines a rectangle by its length and width
*/
public class Rectangle 
{
    //Variables
	double width;
	double height;

	//Default Constructor
	Rectangle() 
	{
		width = 1;
		height = 1;
	} 

	//Constructor with arguements
	Rectangle(double newWidth, double newHeight) 
	{
		width = newWidth;
		height = newHeight;
	}

	//Calculates the area of the rectangle
	double getArea() 
	{
		return width * height; 
	}
   
    //Calculates the perimiter of the rectangle
	double getPerimeter() 
	{
		return 2 * (width + height);
	}
}